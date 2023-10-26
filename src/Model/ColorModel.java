/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ColorBO;
import Conection.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author earana
 */
public class ColorModel {

    public static Connection con;
    public CallableStatement cstmt;
    public PreparedStatement pstm;
    public ResultSet rs;
    public static ResultSetMetaData rsmtd;
    public Conexion conexion;

    public ColorModel() {
        con = conexion.conexions();
    }

    public int pInsertarColor(
            String co_color,
            String des_color,
            String sCampo_Adic,
            String sCampo1,
            String sCampo2,
            String sCampo3,
            String sCampo4,
            String sCampo5,
            String sCampo6,
            String sCampo7,
            String sCampo8,
            String sco_us_in,
            String sCo_Sucu_In,
            String sRevisado) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL  pInsertarColor ("
                    + "?,?,?,?,?,?,"
                    + "?,?,?,?,?,?,"
                    + "?,? )}");
            cstmt.setString(1, co_color);
            cstmt.setString(2, des_color);
            cstmt.setString(3, sCampo_Adic);
            cstmt.setString(4, sCampo1);
            cstmt.setString(5, sCampo2);
            cstmt.setString(6, sCampo3);
            cstmt.setString(7, sCampo4);
            cstmt.setString(8, sCampo5);
            cstmt.setString(9, sCampo6);
            cstmt.setString(10, sCampo7);
            cstmt.setString(11, sCampo8);
            cstmt.setString(12, sco_us_in);
            cstmt.setString(13, sCo_Sucu_In);
            cstmt.setString(14, sRevisado);
            resultado = cstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public int actualizarColor(
            String co_color,
            String des_color,
            String sCampo1,
            String sCampo2,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL  pActualizarColor(?,?,?,?,?,?)}");
            cstmt.setString(1, co_color);
            cstmt.setString(2, des_color);
            cstmt.setString(3, sCampo1);
            cstmt.setString(4, sCampo2);
            cstmt.setString(5, sCo_Us_Mo);
            cstmt.setString(6, sCo_Sucu_Mo);
            
            resultado = cstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public int pEliminarColor(String co_color) throws SQLException {
        int resultado = 0;
        cstmt = con.prepareCall("{CALL pEliminarColor(?)}");
        cstmt.setString(1, co_color);
        resultado = cstmt.executeUpdate();
        return resultado;
    }

    public ArrayList<ColorBO> listaColores() throws SQLException {
        ArrayList<ColorBO> listas = new ArrayList();

        cstmt = con.prepareCall("{CALL pObtenerColor}");
        cstmt.execute();
        rs = cstmt.getResultSet();
        while (rs.next()) {
            //return bandera = rs.getRow();
            //listas =rs.getRow();
            ColorBO colores = new ColorBO();
            colores.setCo_color(rs.getString("co_color"));
            colores.setDes_color(rs.getString("des_color"));
            colores.setValdador(rs.getString("validador"));
            listas.add(colores);
        }
        return listas;
    }

    public ArrayList<ColorBO> pObtenerListadoDatos(
            String sDatabasesName,
            String sTableName,
            String sFielName,
            String sValor,
            String iopcion
    ) {
        ArrayList<ColorBO> listas = new ArrayList();
        try {
            cstmt = con.prepareCall("{CALL pObtenerListadoDatos("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");

            cstmt.setString(1, sDatabasesName);
            cstmt.setString(2, sTableName);
            cstmt.setString(3, sFielName);
            cstmt.setString(4, sValor);
            cstmt.setString(5, iopcion);

            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                ColorBO colores = new ColorBO();
                colores.setCo_color(rs.getString("co_color"));
                colores.setDes_color(rs.getString("des_color"));
                colores.setCampo1(rs.getString("campo1"));
                colores.setCampo2(rs.getString("campo2"));
                colores.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                colores.setCo_us_mo(rs.getString("co_us_mo"));
                colores.setFe_us_in(rs.getString("fe_us_in"));
                colores.setFe_us_mo(rs.getString("fe_us_mo"));
                colores.setValdador(rs.getString("validador"));
                listas.add(colores);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ColorModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listas;
    }

}
