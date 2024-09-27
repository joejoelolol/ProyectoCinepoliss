/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author Alberto Palma
 */
public class Catalogo {
    private int id;
    private int nombreSucursal;
    private int id_pelicula;

    public Catalogo() {
    }

    public Catalogo(int id, int nombreSucursal, int id_pelicula) {
        this.id = id;
        this.nombreSucursal = nombreSucursal;
        this.id_pelicula = id_pelicula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(int nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + this.nombreSucursal;
        hash = 37 * hash + this.id_pelicula;
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
        final Catalogo other = (Catalogo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.nombreSucursal != other.nombreSucursal) {
            return false;
        }
        return this.id_pelicula == other.id_pelicula;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "id=" + id + ", nombreSucursal=" + nombreSucursal + ", id_pelicula=" + id_pelicula + '}';
    }
}
