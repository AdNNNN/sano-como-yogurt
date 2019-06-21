/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author y520
 */
public class MysqlConnector {

    private Connection con;

    private final String driver = "com.mysql.jdbc.Driver";
    private final String user = "root";
    private final String pass = "";
    private final String url = "jdbc:mysql://localhost:3306/clinica";

    public MysqlConnector() {
    }
    
    /**
     * Establece un canal con la base de datos
     */
    private void getConnection(){
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pass);
            if (con != null) {
                System.out.println("Coneccion establecida");
            }
        } catch (Exception e) {
            System.out.println("Coneccion no establecida " + e);
        }
    }

    /**
     * Este metodo prepara una una consulta con PreparedStatement
     * y despues cierra la coneccion a la base de datos.
     * 
     * @params String query, ArrayList args
     * @return ResultSet
     */
    public ResultSet createQuery(String query, List args) throws SQLException {
        getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        pst = con.prepareStatement(query);
        for (int i = 0; i < args.size(); i++) {
            if (args.get(i) instanceof String) {
                pst.setString(i+1, ((String) args.get(i)));
            } else {
                pst.setString(i+1, (Integer.toString((int) args.get(i))));
            }
        }
        rs = pst.executeQuery();
        con = null;
        pst = null;
        return rs;
    }
    
    /**
     * sobrecarga del metodo createQuery
     * 
     * @params String query
     * @return ResultSet
     */
    public ResultSet createQuery(String query) throws SQLException {
        getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        con = null;
        pst = null;
        return rs;
    }
    
    /**
     * Este metodo prepara una un update
     * y despues cierra la coneccion a la base de datos.
     * 
     * @params String update, ArrayList args
     * @return boolean
     */
    public boolean executeUpdate(String update, List args) throws SQLException {
        getConnection();
        PreparedStatement pst = null;
        pst = con.prepareStatement(update);
        for (int i = 0; i < args.size(); i++) {
            if (args.get(i) instanceof String) {
                pst.setString(i+1, ((String) args.get(i)));
            } else {
                pst.setString(i+1, (Integer.toString((int) args.get(i))));
            }
        }
        pst.executeUpdate();
        con = null;
        pst = null;
        return true;
    }
    
    public boolean executeDelete(String delete, List args) throws SQLException{
        getConnection();
        PreparedStatement pst = null;
        pst = con.prepareStatement(delete);
        for (int i = 0; i < args.size(); i++) {
            if (args.get(i) instanceof String) {
                pst.setString(i+1, ((String) args.get(i)));
            } else {
                pst.setString(i+1, (Integer.toString((int) args.get(i))));
            }
        }
        pst.executeUpdate();
        con = null;
        pst = null;
        return true;
    }
    
    public boolean executeStore(String store, List args) throws SQLException{
        getConnection();
        PreparedStatement pst = null;
        pst = con.prepareStatement(store);
        for (int i = 0; i < args.size(); i++) {
            if (args.get(i) instanceof String) {
                pst.setString(i+1, ((String) args.get(i)));
            } else {
                pst.setString(i+1, (Integer.toString((int) args.get(i))));
            }
        }
        pst.executeUpdate();
        con = null;
        pst = null;
        return true;
    }
}
