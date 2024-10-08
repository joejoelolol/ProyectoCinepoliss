/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia.interfaces;

import dto.ClienteDTO;
import entidad.Cliente;
import java.util.List;
import persistencia.excepcion.PersistenciaException;

/**
 *
 * @author Brandon Valenzuela
 */
public interface IClienteDAO {
    
    public void crear(Cliente cliente) throws PersistenciaException;
    
    public List<ClienteDTO> obtenerClientes() throws PersistenciaException;
    
    public void actualizar(Cliente cliente) throws PersistenciaException;

    public void borrar(Cliente cliente) throws PersistenciaException;
    
    public Cliente buscarPorCorreo(String correo)throws PersistenciaException;
    
    public List<Cliente> obtenerClientesPaginados(int numeroPagina, int tamanoPagina) throws PersistenciaException;
    
}
