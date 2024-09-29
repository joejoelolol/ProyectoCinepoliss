/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.Pelicula;
import enums.Clasificacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.excepcion.PersistenciaException;
import persistencia.interfaces.IConexionBD;
import persistencia.interfaces.IPeliculaDAO;

/**
 *
 * @author Brandon Valenzuela
 */
public class PeliculaDAO implements IPeliculaDAO{

    IConexionBD conexionBD;
    
    public PeliculaDAO(ConexionBD conexionBD){
        this.conexionBD = conexionBD;
    }
    @Override
    public void agregarPelicula(Pelicula pelicula) throws PersistenciaException {
        String query = "INSERT INTO pelicula (titulo, clasificacion, duracion, pais, sinopsis, trailer) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, pelicula.getTitulo());
            stmt.setObject(2, pelicula.getClasificacion());
            stmt.setTime(3, pelicula.getDuracion());
            stmt.setString(4, pelicula.getPais());
            stmt.setString(5, pelicula.getSinopsis());
            stmt.setString(6, pelicula.getTrailer());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Pelicula> obtenerPeliculas() throws PersistenciaException {
         List<Pelicula> peliculas = new ArrayList<>();
        String query = "SELECT id, titulo, clacisifacion, duracion, pais, sinopsis, trailer FROM pelicula";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.setId(rs.getInt("id"));
                pelicula.setTitulo(rs.getString("titulo"));
                pelicula.setClasificacion((Clasificacion) rs.getObject("clasificacion"));
                pelicula.setDuracion(rs.getTime("Duracion"));
                pelicula.setPais(rs.getString("pais"));
                pelicula.setSinopsis(rs.getString("sinopsis"));
                pelicula.setTrailer(rs.getString("trailer"));
                peliculas.add(pelicula);
            }
        } catch (SQLException ex) {
            throw new PersistenciaException("Error al obtener clientes de la base de datos: " + ex.getMessage());
        }
        return peliculas;
    }
    
}
