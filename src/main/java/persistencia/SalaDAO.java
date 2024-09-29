/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import persistencia.interfaces.IConexionBD;
import persistencia.interfaces.ISalaDAO;

/**
 *
 * @author Brandon Valenzuela
 */
public class SalaDAO implements ISalaDAO {

    private IConexionBD conexionBD;

    public SalaDAO(ConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public void agregarSala(Sala sala) throws SQLException {
        String query = "INSERT INTO sala (nombre, tiempoLimpieza, costo, horaDesocupada, capacidad, nombreSucursal) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, sala.getNombre());
            stmt.setTime(2, sala.getTiempoLimpieza());
            stmt.setDouble(3, sala.getCosto());
            stmt.setTime(4, sala.getHoraDesocupada());
            stmt.setInt(5, sala.getCapacidad());
            stmt.setString(6, sala.getNombreSucursal());

            stmt.executeUpdate();
        }
    }

    @Override
    public List<Sala> obtenerSalas() throws SQLException {
        List<Sala> salas = new ArrayList<>();
        String query = "SELECT * FROM sala";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Sala sala = new Sala();
                sala.setId(rs.getInt("id"));
                sala.setNombre(rs.getString("nombre"));
                sala.setTiempoLimpieza(rs.getTime("tiempoLimpieza"));
                sala.setCosto(rs.getDouble("costo"));
                sala.setHoraDesocupada(rs.getTime("horaDesocupada"));
                sala.setCapacidad(rs.getInt("capacidad"));
                sala.setNombre(rs.getString("nombreSucursal"));
                
                salas.add(sala);
            }
        }
        return salas;
    }

}
