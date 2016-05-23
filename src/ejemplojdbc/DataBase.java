/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jota
 */
public class DataBase {

    private static Connection conexion;
    private static final String BD = "java";
    private static final String USER = "root";
    private static final String PASSWORD = "003100729011j";
    private static final String HOST = "localhost";
    private static final String SERVER = "jdbc:mysql://" + HOST + "/" + BD;

    public static String conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(SERVER, USER, PASSWORD);
            return "Conexión a base de datos " + SERVER + " ... OK";
        } catch (ClassNotFoundException ex) {
            return "Error cargando el Driver MySQL JDBC ... FAIL";
        } catch (SQLException ex) {
            return "Imposible realizar conexion con " + SERVER + " ... FAIL";
        }

    }

    public static void insertar(String id, String nombre, String edad, String ciudad) {
        Statement s = null;
        try {
            s = conexion.createStatement();
            s.executeUpdate("insert into alumnos values(" + id + ",'" + nombre + "'," + edad + ",'" + ciudad + "');");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                s.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ResultSet consultarDatos() {
        ResultSet rs = null;
        Statement s = null;
        try {
            s = conexion.createStatement();
            rs = s.executeQuery("select * from alumnos;");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return rs;
    }

    public static void eliminar(String primaryKey) throws Exception {
        if(primaryKey.equals("null")){
            throw new Exception("Fila inválida");
        }
        Statement s = null;
        try {
            s = conexion.createStatement();
            s.executeUpdate("delete from alumnos where id=" + primaryKey + ";");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                s.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    public static void actualizar(String columna, String valor, String primaryKey) throws Exception{
        if(primaryKey.equals("null")){
            throw new Exception("Fila inválida");
        }
        try {
            Statement s = conexion.createStatement();
            s.executeUpdate("update alumnos set " + columna + "='" + valor + "' where id=" + primaryKey);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
   
}
