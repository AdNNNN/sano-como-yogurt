/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Models.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author y520
 */
public class UsuarioQuerys extends MysqlConnector {

    public boolean login(String correo, String password) {
        ResultSet rs = null;
        try {
            String query = "select * from usuarios where correo = ? and password = ? and deleted_at is null";
            List<Object> args = new ArrayList<>();
            args.add(correo);
            args.add(password);
            rs = createQuery(query, args);
            if (rs.absolute(1)) {
                Sesion.Sesion.createSession(args);
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return false;
        }
        return false;
    }

    public List<Usuario> index() throws SQLException {
        if (Sesion.Sesion.auth()) {
            List<Usuario> args = new ArrayList<>();
            Usuario usr = new Usuario();
            String query = "select * from usuarios where deleted_at is null";
            ResultSet rs = createQuery(query);
            while (rs.next()) {
                usr = new Usuario();
                usr.setId(Integer.parseInt(rs.getString("id")));
                usr.setPrivilegios_id(Integer.parseInt(rs.getString("privilegios_id")));
                usr.setNombre(rs.getString("nombre"));
                usr.setPassword(rs.getString("password"));
                usr.setRut(rs.getString("rut"));
                usr.setTelefono(rs.getString("telefono"));
                usr.setCorreo(rs.getString("correo"));
                args.add(usr);
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

    public boolean store(Usuario usuario) throws SQLException {
        List<Object> args = new ArrayList<>();
        String query = "insert into usuarios(privilegios_id,nombre,password,rut,telefono,correo) values ?,?,?,?,?,?";
        args.add(usuario.getPrivilegios_id());
        args.add(usuario.getNombre());
        args.add(usuario.getPassword());
        args.add(usuario.getRut());
        args.add(usuario.getTelefono());
        args.add(usuario.getCorreo());
        args.add(usuario.getId());
        executeStore(query, args);
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
