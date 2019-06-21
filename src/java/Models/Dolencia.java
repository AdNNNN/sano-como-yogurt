/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Objects;

/**
 *
 * @author y520
 */
public class Dolencia {
    
    private int id;
    private String nombre;
    private String gravedad;

    public Dolencia(int id, String nombre, String gravedad) {
        this.id = id;
        this.nombre = nombre;
        this.gravedad = gravedad;
    }

    public Dolencia() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.gravedad);
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
        final Dolencia other = (Dolencia) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.gravedad, other.gravedad)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dolencia{" + "id=" + id + ", nombre=" + nombre + ", gravedad=" + gravedad + '}';
    }
    
}
