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
public class Reserva {
    
    private int id;
    private int usuario_id;

    public Reserva(int id, int usuario_id) {
        this.id = id;
        this.usuario_id = usuario_id;
    }

    public Reserva() {
    }

    public int getId() {
        return id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
        hash = 71 * hash + this.usuario_id;
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
        final Reserva other = (Reserva) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.usuario_id != other.usuario_id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", usuario_id=" + usuario_id + '}';
    }
    
}
