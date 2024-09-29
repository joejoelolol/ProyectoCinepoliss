/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidad.Funcion;
import enums.DiaSemana;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.excepcion.PersistenciaException;
import persistencia.interfaces.IConexionBD;
import persistencia.interfaces.IFuncionDAO;

/**
 *
 * @author Brandon Valenzuela
 */
public class FuncionDAO implements IFuncionDAO{

    private IConexionBD conexionBD;
    
    public FuncionDAO(){
        
    }
    
    public FuncionDAO(ConexionBD conexionBD){
        this.conexionBD = conexionBD;
    }
    @Override
    public void agregarFuncion(Funcion funcion) throws PersistenciaException {

        String query = "INSERT INTO funcion (costo, horaInicio, horaFin, dia, id_pelicula, id_sala) "
                + "VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setDouble(1, funcion.getCosto());
            stmt.setTime(1, funcion.getHoraInicio());
            stmt.setTime(2, funcion.getHoraFin());
            stmt.setObject(3, funcion.getDia());
            stmt.setInt(4, funcion.getIdPelicula());
            stmt.setInt(5, funcion.getIdSala());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void eliminarFuncion(int idFuncion) throws PersistenciaException {
        String query = "DELETE FROM funcion WHERE id = ?";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idFuncion);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Funcion obtenerFuncionID(int idFuncion) throws PersistenciaException {
        String query = "SELECT id, horaInicio, horaFin, dia, id_pelicula, id_sala "
                + "FROM Funcion WHERE ID_Funcion = ?";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idFuncion);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    Funcion funcion = new Funcion();
                    funcion.setId(resultSet.getInt("id"));
                    funcion.setHoraInicio(resultSet.getTime("horaInicio"));
                    funcion.setHoraFin(resultSet.getTime("horaFin"));
                    funcion.setDia((DiaSemana) resultSet.getObject("dia"));
                    funcion.setIdPelicula(resultSet.getInt("ID_Pelicula"));
                    funcion.setIdSala(resultSet.getInt("ID_Sala"));
                    return funcion;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void actualizarFuncion(Funcion funcion) throws PersistenciaException {
        String query = "UPDATE funcion SET horaInicio = ?, horaFin = ?, dia = ?, "
                + "id_pelicula = ?, id_sala = ? WHERE id = ?";
        try (Connection conn = conexionBD.crearConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setTime(1, funcion.getHoraInicio());
            stmt.setTime(2, funcion.getHoraFin());
            stmt.setObject(3, funcion.getDia());
            stmt.setInt(4, funcion.getIdPelicula());
            stmt.setInt(5, funcion.getIdSala());
            stmt.setInt(6, funcion.getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
