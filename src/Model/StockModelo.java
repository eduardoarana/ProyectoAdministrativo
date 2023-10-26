/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Conection.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduardo
 */
public class StockModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public StockModelo() {
        con = conexion.conexions();
    }

    public int pStockActualizar(
            String sCo_Alma,
            String sCo_Art,
            String sCo_Uni,
            String deCantidad,
            String sTipoStock,
            String bSumarStock,
            String bPermiteStockNegativo
    ) {
        try {
            cstmt = con.prepareCall("{CALL pStockActualizar("
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?"
                    + ")}");
            cstmt.setString(1, sCo_Alma);
            cstmt.setString(2, sCo_Art);
            cstmt.setString(3, sCo_Uni);
            cstmt.setString(4, deCantidad);
            cstmt.setString(5, sTipoStock);
            cstmt.setString(6, bSumarStock);
            cstmt.setString(7, bPermiteStockNegativo);
            resultado = cstmt.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(StockModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public static void main(String args[]) {
        StockModelo m = new StockModelo();
        int resultado = m.pStockActualizar("VAL", "carro", "uni", "4", "ACT", "1", "1");
        System.out.println(resultado);
    }
}
