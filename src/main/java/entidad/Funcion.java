/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import enums.DiaSemana;
import java.sql.Time;
import java.util.Objects;

/**
 *
 * @author Alberto Palma
 */
public class Funcion {
    private int id;
    private double costo;
    private Time horaInicio;
    private Time horaFin;
    private DiaSemana dia;
    private int idSala;
    private int idPelicula;

    public Funcion() {
    }

    public Funcion(int id, Time horaInicio, DiaSemana dia, int idSala, int idPelicula) {
        this.id = id;
        this.horaInicio = horaInicio;
        this.dia = dia;
        this.idSala = idSala;
        this.idPelicula = idPelicula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public DiaSemana getDia() {
        return dia;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.costo) ^ (Double.doubleToLongBits(this.costo) >>> 32));
        hash = 31 * hash + Objects.hashCode(this.horaInicio);
        hash = 31 * hash + Objects.hashCode(this.horaFin);
        hash = 31 * hash + Objects.hashCode(this.dia);
        hash = 31 * hash + this.idSala;
        hash = 31 * hash + this.idPelicula;
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
        final Funcion other = (Funcion) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.costo) != Double.doubleToLongBits(other.costo)) {
            return false;
        }
        if (this.idSala != other.idSala) {
            return false;
        }
        if (this.idPelicula != other.idPelicula) {
            return false;
        }
        if (!Objects.equals(this.horaInicio, other.horaInicio)) {
            return false;
        }
        if (!Objects.equals(this.horaFin, other.horaFin)) {
            return false;
        }
        return this.dia == other.dia;
    }

    @Override
    public String toString() {
        return "Funcion{" + "id=" + id + ", costo=" + costo + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", dia=" + dia + ", idSala=" + idSala + ", idPelicula=" + idPelicula + '}';
    }
}
