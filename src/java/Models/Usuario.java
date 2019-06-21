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
public class Usuario {
    
    private int id;
    private int privilegios_id;
    private String nombre;
    private String password;
    private String rut;
    private String telefono;
    private String correo;

    public Usuario(int id, int privilegios_id, String nombre, String password, String rut, String telefono, String correo) {
        this.id = id;
        this.privilegios_id = privilegios_id;
        this.nombre = nombre;
        this.password = password;
        this.rut = rut;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public int getPrivilegios_id() {
        return privilegios_id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public String getRut() {
        return rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrivilegios_id(int privilegios_id) {
        this.privilegios_id = privilegios_id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.id;
        hash = 41 * hash + this.privilegios_id;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.password);
        hash = 41 * hash + Objects.hashCode(this.rut);
        hash = 41 * hash + Objects.hashCode(this.telefono);
        hash = 41 * hash + Objects.hashCode(this.correo);
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
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.privilegios_id != other.privilegios_id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.rut, other.rut)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", privilegios_id=" + privilegios_id + ", nombre=" + nombre + ", password=" + password + ", rut=" + rut + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
}
