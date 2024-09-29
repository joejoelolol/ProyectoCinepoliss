/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.SucursalDTO;
import entidad.Sucursal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import negocio.NegocioException;
import persistencia.ConexionBD;
import persistencia.SucursalDAO;
import persistencia.excepcion.PersistenciaException;
import persistencia.interfaces.ISucursalDAO;

/**
 *
 * @author Beto_
 */
public class SucursalNegocio {
    ISucursalDAO sucursalDAO;
    SucursalConv sucursalConv;

    public SucursalNegocio() {
        this.sucursalDAO = new SucursalDAO(new ConexionBD());
        this.sucursalConv = new SucursalConv();
    }
    
    public void llenarJListConNombres(JList<String> listSucursales) throws NegocioException {
        List<SucursalDTO> listaSucursalesDTO = listaSucursalesDTO();

        // Crear una lista para almacenar solo los nombres
        List<String> nombresSucursales = new ArrayList<>();

        for (SucursalDTO sucursalDTO : listaSucursalesDTO) {
            nombresSucursales.add(sucursalDTO.getNombre());
        }

        // Crear un DefaultListModel y asignarlo a la JList
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        modeloLista.addAll(nombresSucursales);
        listSucursales.setModel(modeloLista);
    }
    
    public void llenarCMBX(JComboBox combo) throws NegocioException{
        for (int i = 0; i < listaSucursalesDTO().size(); i++) {
            combo.addItem(listaSucursalesDTO().get(i));
        }
    }
    
    public List<SucursalDTO> listaSucursalesDTO() throws NegocioException{
            List<SucursalDTO> listaDTO = new ArrayList<>();
            List<Sucursal> lista;
        try {
            lista = sucursalDAO.obtenerSucursales();

            // Crear una instancia de SucursalConv una sola vez para optimizar
            SucursalConv conversor = new SucursalConv();
            for (Sucursal sucursal : lista) {
                listaDTO.add(conversor.entidad_sucursalDTO(sucursal));
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(SucursalNegocio.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException(ex.getMessage());
        }
            return listaDTO;
    }
}
