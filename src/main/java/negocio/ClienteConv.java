/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.ClienteDTO;
import entidad.Cliente;
import java.time.LocalDate;

/**
 *
 * @author Beto_
 */
public class ClienteConv {
    
    /**
     * Convierte un ClienteDTO a entidad Cliente
     * @param clienteDTO el clienteDTO
     * @return un Cliente entidad
     */
    public Cliente clienteDTO_entidad(ClienteDTO clienteDTO){
        int idCliente = clienteDTO.getId();
        String nombre = clienteDTO.getNombre();
        String apellidoPaterno = clienteDTO.getApellidoPaterno();
        String apellidoMaterno = clienteDTO.getApellidoMaterno();
        String correo = clienteDTO.getCorreo();
        LocalDate fechaNacimiento = clienteDTO.getFechaNacimiento();
        String geolocalizacion = clienteDTO.getGeolocalizacion();
        String contrasena = clienteDTO.getContrasena();
        return new Cliente(idCliente, nombre, apellidoPaterno, 
                apellidoMaterno, correo, fechaNacimiento, geolocalizacion, contrasena);
    }
    
    /**
     * Convierte un Cliente entidad a ClienteDTO
     * @param cliente el cliente entidad
     * @return un ClienteDTO
     */
    public ClienteDTO entidad_ClienteDTO(Cliente cliente){
        int idCliente = cliente.getId();
        String nombre = cliente.getNombre();
        String apellidoPaterno = cliente.getApellidoPaterno();
        String apellidoMaterno = cliente.getApellidoMaterno();
        String correo = cliente.getCorreo();
        LocalDate fechaNacimiento = cliente.getFechaNacimiento();
        String geolocalizacion = cliente.getGeolocalizacion();
        String contrasena = cliente.getContrasena();
        return new ClienteDTO(idCliente, nombre, apellidoPaterno, 
                apellidoMaterno, correo, fechaNacimiento, geolocalizacion, contrasena);
    }
}
