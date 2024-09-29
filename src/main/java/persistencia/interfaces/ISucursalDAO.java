/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia.interfaces;

import entidad.Sucursal;
import java.util.List;
import persistencia.excepcion.PersistenciaException;

/**
 *
 * @author brand
 */
public interface ISucursalDAO {
    
    public void agregarSucursal(Sucursal sucursal) throws PersistenciaException;
    
    public List<Sucursal> obtenerSucursales() throws PersistenciaException;
}
