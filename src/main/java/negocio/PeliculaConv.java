/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import dto.PeliculaDTO;
import entidad.Pelicula;
import enums.Clasificacion;
import java.sql.Time;

/**
 *
 * @author Beto_
 */
public class PeliculaConv {
    
    /**
     * Convierte una Pelicula DTO a entidad Pelicula
     * @param peliculaDTO la PeliculaTO
     * @return una Pelicula entidad
     */
    public Pelicula peliculaDTO_entidad(PeliculaDTO peliculaDTO){
        int id = peliculaDTO.getId();
        String titulo = peliculaDTO.getTitulo();
        Clasificacion clasificacion = peliculaDTO.getClasificacion();
        Time duracion = peliculaDTO.getDuracion();
        String pais = peliculaDTO.getPais();
        String sinopsis = peliculaDTO.getSinopsis();
        String trailer = peliculaDTO.getTrailer();
        return new Pelicula(id, titulo, clasificacion, duracion, pais, sinopsis, trailer);
    }
    
    /**
     * Convierte una Pelicula entidad a PeliculaDTO
     * @param pelicula la Pelicula entidad
     * @return una PeliculaDTO
     */
    public PeliculaDTO entidad_PeliculaDTO(Pelicula pelicula){
        int id = pelicula.getId();
        String titulo = pelicula.getTitulo();
        Clasificacion clasificacion = pelicula.getClasificacion();
        Time duracion = pelicula.getDuracion();
        String pais = pelicula.getPais();
        String sinopsis = pelicula.getSinopsis();
        String trailer = pelicula.getTrailer();
        return new PeliculaDTO(id, titulo, clasificacion, duracion, pais, sinopsis, trailer);
    } 
}
