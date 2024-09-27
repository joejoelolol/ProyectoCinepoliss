/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.sql.Time;
import java.util.Objects;

/**
 *
 * @author Alberto Palma
 */
public class SalaDTO {
    private int id;
    private String nombre;
    private Time tiempoLimpieza;
    private double costo;
    private Time horaDesocupada;
    private int capacidad;
    private String nombreSucursal;

    public SalaDTO() {
    }

    public SalaDTO(int id, String nombre, Time tiempoLimpieza, double costo, int capacidad, String nombreSucursal) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoLimpieza = tiempoLimpieza;
        this.costo = costo;
        this.capacidad = capacidad;
        this.nombreSucursal = nombreSucursal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Time getTiempoLimpieza() {
        return tiempoLimpieza;
    }

    public void setTiempoLimpieza(Time tiempoLimpieza) {
        this.tiempoLimpieza = tiempoLimpieza;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Time getHoraDesocupada() {
        return horaDesocupada;
    }

    public void setHoraDesocupada(Time horaDesocupada) {
        this.horaDesocupada = horaDesocupada;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.tiempoLimpieza);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.costo) ^ (Double.doubleToLongBits(this.costo) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.horaDesocupada);
        hash = 97 * hash + this.capacidad;
        hash = 97 * hash + Objects.hashCode(this.nombreSucursal);
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
        final SalaDTO other = (SalaDTO) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.costo) != Double.doubleToLongBits(other.costo)) {
            return false;
        }
        if (this.capacidad != other.capacidad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.nombreSucursal, other.nombreSucursal)) {
            return false;
        }
        if (!Objects.equals(this.tiempoLimpieza, other.tiempoLimpieza)) {
            return false;
        }
        return Objects.equals(this.horaDesocupada, other.horaDesocupada);
    }

    @Override
    public String toString() {
        return "SalaDTO{" + "id=" + id + ", nombre=" + nombre + ", tiempoLimpieza=" + tiempoLimpieza + ", costo=" + costo + ", horaDesocupada=" + horaDesocupada + ", capacidad=" + capacidad + ", nombreSucursal=" + nombreSucursal + '}';
    }
}
