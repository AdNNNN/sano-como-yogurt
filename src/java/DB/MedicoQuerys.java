/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Models.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author y520
 */
public class MedicoQuerys extends MysqlConnector {

    public List<Usuario> index() throws SQLException {
        if (Sesion.Sesion.auth()) {
            List<Usuario> args = new ArrayList<>();
            String query = "select * from usuarios";
            ResultSet rs = createQuery(query);
            while (rs.next()) {
                args.add((Usuario) rs);
            }
            return args;
        }
        return null;
    }

    public Usuario show(int id) throws SQLException {
        if (Sesion.Sesion.auth()) {
            Usuario usr = new Usuario();
            List<Object> args = new ArrayList<>();
            String query = "select * from usuarios where id = ? and deleted_at is null";
            args.add(id);
            ResultSet rs = createQuery(query, args);
            while (rs.next()) {
                usr.setId(Integer.parseInt(rs.getString("id")));
                usr.setPrivilegios_id(Integer.parseInt(rs.getString("privilegios_id")));
                usr.setNombre(rs.getString("nombre"));
                usr.setPassword(rs.getString("password"));
                usr.setRut(rs.getString("rut"));
                usr.setTelefono(rs.getString("telefono"));
                usr.setCorreo(rs.getString("correo"));
                return usr;
            }
        }
        return null;
    }

    public boolean update(Usuario usuario) throws SQLException {
        if (Sesion.Sesion.auth()) {
            List<Object> args = new ArrayList<>();
            String query = "update usuarios set "
                    + "privilegios_id = ?,"
                    + "nombre = ?,"
                    + "password = ?,"
                    + "rut = ?,"
                    + "telefono = ?,"
                    + "correo = ? "
                    + "where id = ? "
                    + "and deleted_at is null";
            args.add(usuario.getPrivilegios_id());
            args.add(usuario.getNombre());
            args.add(usuario.getPassword());
            args.add(usuario.getRut());
            args.add(usuario.getTelefono());
            args.add(usuario.getCorreo());
            args.add(usuario.getId());
            return executeUpdate(query, args);
        }
        return false;
    }

    public boolean delete(int id) throws SQLException {
        if (Sesion.Sesion.auth()) {
            List<Object> args = new ArrayList<>();
            String query = "update usuarios set"
                    + " deleted_at = ?"
                    + " where id = ?";
            args.add((new Timestamp(System.currentTimeMillis())).toString());
            args.add(id);
            return executeDelete(query, args);
        }
        return false;
    }

}
