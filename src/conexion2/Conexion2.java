/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SISTEMAS
 */
public class Conexion2 {
    private static Connection com;

    public static Connection getCom() {
        return com;
    }

    public static void setCom(Connection aCom) {
        com = aCom;
    }

   

    

    public Conexion2() {
        // TODO Auto-generated constructor stub
    }

    public static Connection conexions() {
        try {
            //Conexion con Sql Postgres 
            //Class.forName("org.postgresql.Driver");
            //com = (Connection) DriverManager.getConnection("jdbc:postgresql:SystemNom", "postgres", "1234");
            // Conexion con Sql Server 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            com = DriverManager.getConnection("jdbc:sqlserver://SRV-DENT\\SQLEXPRESS:1433;"
                    + "databaseName=DENT_A", "profit",
                    "profit");
            System.out.println("Exito");
            return com;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }
    }
    //Crear Conexion a la Bases de Datos Control Center

   

    public static void cerrarConexion() {
        try {
            getCom().close();
            System.out.println("cerrarConexion()");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException, Exception {
		Conexion2 s= new Conexion2();
        Conexion2.conexions();
//        Conexion.cerrarConexion();
      //  Conexion.conexionControlCenter("ControlCenter", "admin", "admin");
//      Conexion.cerrarConexion();
    }
}
