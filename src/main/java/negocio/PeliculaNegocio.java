/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import entidad.Pelicula;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.ConexionBD;
import persistencia.PeliculaDAO;
import persistencia.PersistenciaException;
import persistencia.interfaces.IPeliculaDAO;

/**
 *
 * @author Beto_
 */
public class PeliculaNegocio implements IPeliculaNegocio{
    IPeliculaDAO peliculaDAO = new PeliculaDAO(new ConexionBD());
    
    /**
     * Constructor por omisión
     */
    public PeliculaNegocio() {
    }
    
    /**
     * Construye una PeliculaDAO con acceso a metodos DAO
     * @param peliculaDAO la PeliculaDAO
     */
    public PeliculaNegocio(PeliculaDAO peliculaDAO) {
        this.peliculaDAO = peliculaDAO;
    }
    
    /**
     * Obtiene una lista de Peliculas
     * @return Una lista de Peliculas
     * @throws NegocioException
     * @throws PersistenciaException 
     */
    @Override
    public List<Pelicula> obtenerPeliculas() throws NegocioException, PersistenciaException {
        try {
            return peliculaDAO.obtenerPeliculas();
        } catch (persistencia.excepcion.PersistenciaException ex) {
            Logger.getLogger(PeliculaNegocio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
