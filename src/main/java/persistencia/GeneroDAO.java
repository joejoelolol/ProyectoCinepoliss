/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.Genero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import persistencia.interfaces.IConexionBD;
import persistencia.interfaces.IGeneroDAO;

/**
 *
 * @author Brandon Valenzuela
 */
public class GeneroDAO implements IGeneroDAO {
    
    private IConexionBD conexionBD;
    
    public GeneroDAO(ConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public void agregarGenero(Genero genero) throws SQLException {
        String query = "INSERT INTO genero (Nombre) VALUES (?)";
        try (Connection conn = conexionBD.crearConexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, genero.getNombre());
            stmt.executeUpdate();
        }
    }

    @Override
    public List<Genero> obtenerGeneros() throws SQLException {
        List<Genero> generos = new ArrayList<>();
        String query = "SELECT * FROM genero";
        try (Connection conn = conexionBD.crearConexion();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Genero genero = new Genero();
                genero.setNombre(rs.getString("nombre"));
                generos.add(genero);
            }
        }
        return generos;
    }
    
}
