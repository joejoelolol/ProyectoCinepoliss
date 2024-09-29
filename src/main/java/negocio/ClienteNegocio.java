/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.ClienteDTO;
import entidad.Cliente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import persistencia.ClienteDAO;
import persistencia.ConexionBD;
import persistencia.PersistenciaException;
import persistencia.interfaces.IClienteDAO;

/**
 *
 * @author Beto_
 */
public class ClienteNegocio implements IClienteNegocio{
    IClienteDAO clienteDAO = new ClienteDAO(new ConexionBD());
    ClienteConv clienteCVR;
    
    @Override
    public void registrarCliente(ClienteDTO clienteDTO) throws NegocioException {
        try {
            // Validar campos obligatorios
            if (clienteDTO.getNombre() == null || clienteDTO.getNombre().isEmpty()) {
                throw new NegocioException("El nombre es obligatorio.");
            }
            if (clienteDTO.getApellidoPaterno() == null || clienteDTO.getApellidoPaterno().isEmpty()) {
                throw new NegocioException("El apellido paterno es obligatorio.");
            }
            if (clienteDTO.getCorreo() == null || clienteDTO.getCorreo().isEmpty()) {
                throw new NegocioException("El correo electrónico es obligatorio.");
            }
            if (clienteDTO.getFechaNacimiento() == null) {
                throw new NegocioException("La fecha de nacimiento es obligatoria.");
            }
            if (clienteDTO.getContrasena() == null || clienteDTO.getContrasena().isEmpty()) {
                throw new NegocioException("La contraseña es obligatoria.");
            }

            // Aplicación de patrón para validar el correo
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(clienteDTO.getCorreo());
            if (!matcher.matches()) {
                throw new NegocioException("El formato del correo electrónico no es válido.");
            }

            // Validación de fecha de nacimiento (mayor de 18 años)
            LocalDate fechaNacimiento = clienteDTO.getFechaNacimiento();
            LocalDate ahora = LocalDate.now();
            if (Period.between(fechaNacimiento, ahora).getYears() < 18) {
                throw new NegocioException("El cliente debe ser mayor de 18 años.");
            }

            // Validación de contraseña (mínimo 8 caracteres, al menos una letra y un número)
            String contrasena = clienteDTO.getContrasena();
            if (contrasena.length() < 8 || !contrasena.matches(".*[a-zA-Z].*") || !contrasena.matches(".*\\d.*")) {
                throw new NegocioException("La contraseña debe tener al menos 8 caracteres, incluyendo letras y números.");
            }

            // Asignación de datos al objeto Cliente
            Cliente cliente = new Cliente();
            cliente.setNombre(clienteDTO.getNombre());
            cliente.setApellidoPaterno(clienteDTO.getApellidoPaterno());
            cliente.setApellidoMaterno(clienteDTO.getApellidoMaterno());
            cliente.setCorreo(clienteDTO.getCorreo());
            cliente.setFechaNacimiento(clienteDTO.getFechaNacimiento());
            cliente.setContrasena(clienteDTO.getContrasena());

            // Registro del cliente
            clienteDAO.crear(cliente);
        } catch (persistencia.excepcion.PersistenciaException ex) {
            Logger.getLogger(ClienteNegocio.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public List<ClienteDTO> obtenerClientes() throws NegocioException {
        try {
            return clienteDAO.obtenerClientes();
        } catch (persistencia.excepcion.PersistenciaException ex) {
            Logger.getLogger(ClienteNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Cliente buscarPorCorreo(String correo) throws NegocioException {
        try {
            return clienteDAO.buscarPorCorreo(correo);
        }catch (persistencia.excepcion.PersistenciaException ex) {
            Logger.getLogger(ClienteNegocio.class.getName()).log(Level.SEVERE, null, ex);
            throw new NegocioException(ex.getMessage());
        }
    }

    @Override
    public void obtenerClientesPaginados(JTable tabla, int numeroPagina, int tamanoPagina) throws NegocioException {
        try {
            
            List<ClienteDTO> libros = listaPaginada(numeroPagina, tamanoPagina);

            // Definir columnas
            String[] columnNames = {"ID", "Nombre", "ApellidoP", "apellidoM", "Correo"};
            
            // Crear modelo de la tabla
            DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

            // Llenar la tabla con los datos de los Clientes
            for (ClienteDTO cliente : libros) {
                Object[] rowData = {
                    cliente.getId(),
                    cliente.getApellidoPaterno(),
                    cliente.getApellidoPaterno(),
                    cliente.getApellidoMaterno(),
                    cliente.getCorreo(),
                };
                tableModel.addRow(rowData);
            }

            // Establecer el modelo de la tabla
            tabla.setModel(tableModel);
            
        } catch (NegocioException ex) {
            System.out.println(ex.getMessage());;
        }
    }
    
    private List<ClienteDTO> listaPaginada(int numeroPagina, int tamanoPagina) throws NegocioException{
        try {
        List<ClienteDTO> nuevalista = new ArrayList<>();
        List<Cliente> entidad = clienteDAO.obtenerClientesPaginados(numeroPagina, tamanoPagina);

        for (int i = 0; i < entidad.size(); i++) {
            // Creamos una instancia de ClienteConv
            ClienteConv conversor = new ClienteConv();
            nuevalista.add(conversor.entidad_ClienteDTO(entidad.get(i)));
        }

        return nuevalista;
    
        }catch (persistencia.excepcion.PersistenciaException ex) {
            Logger.getLogger(ClienteNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
