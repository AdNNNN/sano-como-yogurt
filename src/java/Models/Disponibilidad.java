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
public class Disponibilidad {
    
    private int id;
    private int medico_id;
    private String fecha;

    public Disponibilidad(int id, int medico_id, String fecha) {
        this.id = id;
        this.medico_id = medico_id;
        this.fecha = fecha;
    }

    public Disponibilidad() {
    }

    public int getId() {
        return id;
    }

    public int getMedico_id() {
        return medico_id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMedico_id(int medico_id) {
        this.medico_id = medico_id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
        hash = 71 * hash + this.medico_id;
        hash = 71 * hash + Objects.hashCode(this.fecha);
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
        final Disponibilidad other = (Disponibilidad) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.medico_id != other.medico_id) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Disponibilidad{" + "id=" + id + ", medico_id=" + medico_id + ", fecha=" + fecha + '}';
    }
    
    
    
}
