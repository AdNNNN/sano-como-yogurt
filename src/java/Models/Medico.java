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
public class Medico{
    
    private int id;
    private int usuario_id;
    private int especialidad_id;

    public Medico(int id, int usuario_id, int especialidad_id) {
        this.id = id;
        this.usuario_id = usuario_id;
        this.especialidad_id = especialidad_id;
    }

    public Medico() {
    }

    public int getId() {
        return id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public int getEspecialidad_id() {
        return especialidad_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public void setEspecialidad_id(int especialidad_id) {
        this.especialidad_id = especialidad_id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + this.usuario_id;
        hash = 97 * hash + this.especialidad_id;
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
        final Medico other = (Medico) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.usuario_id != other.usuario_id) {
            return false;
        }
        if (this.especialidad_id != other.especialidad_id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Medico{" + "id=" + id + ", usuario_id=" + usuario_id + ", especialidad_id=" + especialidad_id + '}';
    }
    
}
