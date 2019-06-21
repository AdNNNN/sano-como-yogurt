/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author y520
 */
public class PacienteDolencia {
    
    private int id;
    private int paciente_id;
    private int dolencia_id;

    public PacienteDolencia(int id, int paciente_id, int dolencia_id) {
        this.id = id;
        this.paciente_id = paciente_id;
        this.dolencia_id = dolencia_id;
    }

    public PacienteDolencia() {
    }

    public int getId() {
        return id;
    }

    public int getPaciente_id() {
        return paciente_id;
    }

    public int getDolencia_id() {
        return dolencia_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPaciente_id(int paciente_id) {
        this.paciente_id = paciente_id;
    }

    public void setDolencia_id(int dolencia_id) {
        this.dolencia_id = dolencia_id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id;
        hash = 79 * hash + this.paciente_id;
        hash = 79 * hash + this.dolencia_id;
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
        final PacienteDolencia other = (PacienteDolencia) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.paciente_id != other.paciente_id) {
            return false;
        }
        if (this.dolencia_id != other.dolencia_id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PacienteDolencia{" + "id=" + id + ", paciente_id=" + paciente_id + ", dolencia_id=" + dolencia_id + '}';
    }
    
}
