package persistencia;

import dto.ClienteDTO;
import entidad.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import persistencia.excepcion.PersistenciaException;
import persistencia.interfaces.IClienteDAO;
import persistencia.interfaces.IConexionBD;

/**
 *
 * @author Brandon Valenzuela
 */
public class ClienteDAO implements IClienteDAO {

    private IConexionBD conexionBD;

    public ClienteDAO(ConexionBD conexionBD) {

        this.conexionBD = conexionBD;

    }

    @Override
    public void crear(Cliente cliente) throws PersistenciaException {

        String query = "INSERT INTO cliente (correo, contraseña, fechaNacimiento, nombres, apellidoPat, apellidoMat) VALUES (?, ?, ?, ?, ?, ?)";
        Connection conbd = null;
        PreparedStatement stmt = null;

        try {
            conbd = conexionBD.crearConexion();
            conbd.setAutoCommit(false); // Desactivar el auto-commit para iniciar la transacción

            stmt = conbd.prepareStatement(query);
            stmt.setString(1, cliente.getCorreo());
            stmt.setString(2, cliente.getContrasena());
            stmt.setDate(3, Date.valueOf(cliente.getFechaNacimiento()));
            stmt.setString(4, cliente.getNombre());
            stmt.setString(5, cliente.getApellidoPaterno());
            stmt.setString(6, cliente.getApellidoMaterno());
            stmt.executeUpdate();

            conbd.commit(); // Confirmar la transacción

        } catch (SQLException ex) {
            if (conbd != null) {
                try {
                    conbd.rollback(); // Deshacer la transacción en caso de error
                } catch (SQLException rollbackEx) {
                    throw new PersistenciaException("Error al deshacer la transacción: " + rollbackEx.getMessage());
                }
            }
            throw new PersistenciaException("Error al crear un cliente en la base de datos: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    throw new PersistenciaException("Error al cerrar el PreparedStatement: " + ex.getMessage());
                }
            }
            if (conbd != null) {
                try {
                    conbd.setAutoCommit(true); // Restaurar el auto-commit
                    conbd.close();
                } catch (SQLException ex) {
                    throw new PersistenciaException("Error al cerrar la conexión: " + ex.getMessage());
                }
            }
        }

    }

    @Override
    public List<ClienteDTO> obtenerClientes() throws PersistenciaException {

        List<ClienteDTO> clientes = new ArrayList<>();
        String query = "SELECT id, nombre, apellidoPat, apellidoMat, correo, contraseña, fechaNacimiento, geolocalizacion FROM cliente";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                ClienteDTO cliente = new ClienteDTO();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellidoPaterno(rs.getString("apellidoPat"));
                cliente.setApellidoMaterno(rs.getString("apellidoMat"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setContrasena(rs.getString("contraseña"));
                cliente.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                cliente.setGeolocalizacion(rs.getString("geolocalizacion"));

                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al obtener clientes de la base de datos: " + ex.getMessage());
        }
        return clientes;

    }

    @Override
    public void actualizar(Cliente cliente) throws PersistenciaException {

        String query = "UPDATE clientes SET nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?, correo = ?, fechaNacimiento = ?, latitud = ?, longitud = ?, contrasena = ? WHERE idCliente = ?";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellidoPaterno());
            stmt.setString(3, cliente.getApellidoMaterno());
            stmt.setString(4, cliente.getCorreo());
            stmt.setDate(5, Date.valueOf(cliente.getFechaNacimiento()));
            stmt.setString(6, cliente.getGeolocalizacion());
            stmt.setString(8, cliente.getContrasena());
            stmt.setInt(9, cliente.getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al actualizar un cliente en la base de datos: " + ex.getMessage());
        }

    }

    @Override
    public void borrar(Cliente cliente) throws PersistenciaException {

        String query = "DELETE FROM clientes WHERE idCliente = ?";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, cliente.getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al borrar un cliente en la base de datos: " + ex.getMessage());
        }

    }

    @Override
    public Cliente buscarPorCorreo(String correo) throws PersistenciaException {
        String query = "SELECT * FROM Cliente WHERE Correo = ?";

        try (Connection conexion = conexionBD.crearConexion(); PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, correo);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int idCliente = resultSet.getInt("id");
                    String nombre = resultSet.getString("nombre");
                    String apellidoPaterno = resultSet.getString("apellidoPat");
                    String apellidoMaterno = resultSet.getString("apellidoMat");
                    LocalDate fechaNacimiento = resultSet.getDate("fechaNacimiento").toLocalDate();
                    String geolocalizacion = resultSet.getString("geolocalizacion");
                    String contrasena = resultSet.getString("contraseña");

                    return new Cliente(idCliente, nombre, apellidoPaterno, apellidoMaterno, correo, fechaNacimiento, geolocalizacion, contrasena);

                } else {
                    return null;
                }
            }
        } catch (SQLException e) {
            throw new PersistenciaException("Error al buscar cliente por correo");
        }
    }

    @Override
    public List<Cliente> obtenerClientesPaginados(int numeroPagina, int tamanoPagina) throws PersistenciaException {
        String query = "SELECT * FROM Cliente LIMIT ? OFFSET ?";
        List<Cliente> clientes = new ArrayList<>();
        int offset = (numeroPagina - 1) * tamanoPagina;

        try (Connection conexion = conexionBD.crearConexion(); PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setInt(1, tamanoPagina);
            statement.setInt(2, offset);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    int idCliente = resultSet.getInt("id");
                    String nombre = resultSet.getString("Nombre");
                    String apellidoPaterno = resultSet.getString("apellidoPat");
                    String apellidoMaterno = resultSet.getString("apellidoMat");
                    String correo = resultSet.getString("correo");
                    LocalDate fechaNacimiento = resultSet.getDate("fechaNacimiento").toLocalDate();
                    String geolocalizacion = resultSet.getString("geolocalizacion");
                    String contrasena = resultSet.getString("contraseña");

                    Cliente cliente = new Cliente(idCliente, nombre, apellidoPaterno, apellidoMaterno, correo, fechaNacimiento, geolocalizacion, contrasena);
                    clientes.add(cliente);
                }
            }
        } catch (SQLException e) {
            throw new PersistenciaException("Error al obtener clientes paginados");
        }

        return clientes;
    }
}
