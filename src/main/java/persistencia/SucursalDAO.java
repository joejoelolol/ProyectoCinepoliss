/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.Sucursal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import persistencia.excepcion.PersistenciaException;
import persistencia.interfaces.IConexionBD;
import persistencia.interfaces.ISucursalDAO;

/**
 *
 * @author Brandon Valenzuela
 */
public class SucursalDAO implements ISucursalDAO {

    private IConexionBD conexionBD;

    public SucursalDAO(ConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public void agregarSucursal(Sucursal sucursal) throws PersistenciaException {
        try {
            String query = "INSERT INTO sucursal (nombre, id_ciudad) VALUES (?, ?)";
            try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
               stmt.setString(1, sucursal.getNombre());
               stmt.setInt(2, sucursal.getIdCiudad());
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new PersistenciaException("error al agregar sucursal");
        }
    }

    @Override
    public List<Sucursal> obtenerSucursales() throws PersistenciaException {
        List<Sucursal> sucursales = new ArrayList<>();
    String query = "SELECT * FROM sucursal";

    try (Connection conn = conexionBD.crearConexion();
         PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            Sucursal sucursal = new Sucursal();
            sucursal.setNombre(rs.getString("nombre"));
            sucursal.setIdCiudad(rs.getInt("id_ciudad"));
            sucursales.add(sucursal);
        }

    } catch (SQLException e) {
        // Incluye el mensaje original de la excepción para facilitar la depuración
        throw new PersistenciaException("Error al obtener las sucursales" );
    }

    return sucursales;
    }

}
