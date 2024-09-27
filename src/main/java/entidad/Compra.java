/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import enums.MetodoPago;
import java.sql.Timestamp;
import java.util.Objects;

/**
 *
 * @author Alberto Palma
 */
public class Compra {
    private int id;
    private double costo;
    private Timestamp fechaHora;
    private MetodoPago metodoPago;
    private int idCliente;
    private int idFuncion;

    public Compra() {
    }

    public Compra(int id, MetodoPago metodoPago, int idCliente, int idFuncion) {
        this.id = id;
        this.metodoPago = metodoPago;
        this.idCliente = idCliente;
        this.idFuncion = idFuncion;
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

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.id;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.costo) ^ (Double.doubleToLongBits(this.costo) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.fechaHora);
        hash = 41 * hash + Objects.hashCode(this.metodoPago);
        hash = 41 * hash + this.idCliente;
        hash = 41 * hash + this.idFuncion;
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
        final Compra other = (Compra) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.costo) != Double.doubleToLongBits(other.costo)) {
            return false;
        }
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (this.idFuncion != other.idFuncion) {
            return false;
        }
        if (!Objects.equals(this.fechaHora, other.fechaHora)) {
            return false;
        }
        return this.metodoPago == other.metodoPago;
    }
    
    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", costo=" + costo + ", fechaHora=" + fechaHora + ", metodoPago=" + metodoPago + ", idCliente=" + idCliente + ", idFuncion=" + idFuncion + '}';
    }
}
