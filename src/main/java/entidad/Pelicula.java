/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import enums.Clasificacion;
import java.sql.Time;
import java.util.Objects;

/**
 *
 * @author Alberto Palma
 */
public class Pelicula {
    private int id;
    private String titulo;
    private Clasificacion clasificacion;
    private Time duracion;
    private String pais;
    private String sinopsis;
    private String trailer;

    public Pelicula() {
    }

    public Pelicula(int id, String titulo, Clasificacion clasificacion, Time duracion, String pais, String sinopsis, String trailer) {
        this.id = id;
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
        this.pais = pais;
        this.sinopsis = sinopsis;
        this.trailer = trailer;
    }

    public Pelicula(int id, String titulo, Clasificacion clasificacion, Time duracion, String pais, String sinopsis) {
        this.id = id;
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
        this.pais = pais;
        this.sinopsis = sinopsis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.titulo);
        hash = 41 * hash + Objects.hashCode(this.clasificacion);
        hash = 41 * hash + Objects.hashCode(this.duracion);
        hash = 41 * hash + Objects.hashCode(this.pais);
        hash = 41 * hash + Objects.hashCode(this.sinopsis);
        hash = 41 * hash + Objects.hashCode(this.trailer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.sinopsis, other.sinopsis)) {
            return false;
        }
        if (!Objects.equals(this.trailer, other.trailer)) {
            return false;
        }
        if (this.clasificacion != other.clasificacion) {
            return false;
        }
        return Objects.equals(this.duracion, other.duracion);
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", titulo=" + titulo + ", clasificacion=" + clasificacion + ", duracion=" + duracion + ", pais=" + pais + ", sinopsis=" + sinopsis + ", trailer=" + trailer + '}';
    }
}
