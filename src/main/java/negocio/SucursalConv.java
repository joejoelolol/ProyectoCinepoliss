/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.SucursalDTO;
import entidad.Sucursal;

/**
 *
 * @author Beto_
 */
public class SucursalConv {
    
    /**
     * Convierte una SucursalDTO a entidad Sucursal
     * @param sucursalDTO la SucursalDTO
     * @return una Sucursal entidad
     */
    public Sucursal SucursalDTO_entidad(SucursalDTO sucursalDTO){
        String nombre = sucursalDTO.getNombre();
        int idCiudad = sucursalDTO.getIdCiudad();
        return new Sucursal(nombre, idCiudad);
    }
    
    /**
     * Convierte una Sucursal entidad a SucursalDTO
     * @param sucursal la Sucursal entidad
     * @return una SucursalDTO
     */
    public SucursalDTO entidad_sucursalDTO(Sucursal sucursal){
        String nombre = sucursal.getNombre();
        int idCiudad = sucursal.getIdCiudad();
        return new SucursalDTO(nombre, idCiudad);
    }
}
