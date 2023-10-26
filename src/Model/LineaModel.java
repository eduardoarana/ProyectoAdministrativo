/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.LineaBO;
import Conection.Conexion;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author earana
 */
public class LineaModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;

    public LineaModel() {
        con = conexion.conexions();
    }

    public int pLineaArticulo(
            String Co_Lin,
            String Lin_Des,
            String Dis_Cen,
            String Co_Imun,
            String Co_Reten,
            String deComi_Lin,
            String deComi_Lin2,
            String bVa,
            String I_Lin_Des,
            String sCampo1,
            String sCampo2,
            String sCo_Us_In,
            String sCo_Sucu_In,
            String sTrasnfe) {

        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL  pInsertarLineaArticulo ("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + " )}");

            cstmt.setString(1, Co_Lin);
            cstmt.setString(2, Lin_Des);
            cstmt.setString(3, Dis_Cen);
            cstmt.setString(4, Co_Imun);
            cstmt.setString(5, Co_Reten);
            cstmt.setString(6, deComi_Lin);
            cstmt.setString(7, deComi_Lin2);
            cstmt.setString(8, bVa);
            cstmt.setString(9, I_Lin_Des);
            cstmt.setString(10, sCampo1);
            cstmt.setString(11, sCampo2);
            cstmt.setString(12, sCo_Us_In);
            cstmt.setString(13, sCo_Sucu_In);
            cstmt.setString(14, sTrasnfe);
            resultado = cstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public int pActualizarLineaArticulo(
            String Co_Lin,
            String Lin_Des,
            String Dis_Cen,
            String Co_Imun,
            String Co_Reten,
            String deComi_Lin,
            String deComi_Lin2,
            String sCampo1,
            String sCampo2,
            String sCo_Us_Mo) throws SQLException {
        int resultado = 0;
        cstmt = con.prepareCall("{CALL pActualizarLineaArticulo(?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?,"
                + "?"
                + ")}");

        cstmt.setString(1, Co_Lin);
        cstmt.setString(2, Lin_Des);
        cstmt.setString(3, Dis_Cen);
        cstmt.setString(4, Co_Imun);
        cstmt.setString(5, Co_Reten);
        cstmt.setString(6, deComi_Lin);
        cstmt.setString(7, deComi_Lin2);
        cstmt.setString(8, sCampo1);
        cstmt.setString(9, sCampo2);
        cstmt.setString(10, sCo_Us_Mo);
        resultado = cstmt.executeUpdate();
        return resultado;
    }

    public int pEliminarLineaArticulo(String Co_linea) throws SQLException {
        int resultado = 0;
        cstmt = con.prepareCall("{CALL pEliminarLineaArticulo(?)}");
        cstmt.setString(1, Co_linea);
        resultado = cstmt.executeUpdate();

        return resultado;

    }

    public ArrayList<LineaBO> listaLineas() throws SQLException {
        ArrayList<LineaBO> lista = new ArrayList<LineaBO>();
        cstmt = con.prepareCall("{CALL pObtenerLinea}");
        cstmt.execute();
        rs = cstmt.getResultSet();
        while (rs.next()) {
            LineaBO lineaBO = new LineaBO();
            lineaBO.setCo_lin(rs.getString("Co_lin"));
            lineaBO.setLin_des(rs.getString("lin_des"));
            lineaBO.setCampo1(rs.getString("campo1"));
            lineaBO.setComi_lin(rs.getString("comi_lin"));
            lineaBO.setComi_lin2(rs.getString("comi_lin2"));
            lista.add(lineaBO);
        }
        return lista;
    }

    public ArrayList<LineaBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<LineaBO> lista = new ArrayList<LineaBO>();
        try {
            cstmt = con.prepareCall("{CALL pObtenerListadoDatos("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");

            cstmt.setString(1, sDatabase_Name);
            cstmt.setString(2, sTable_Name);
            cstmt.setString(3, sField_Name);
            cstmt.setString(4, sValor);
            cstmt.setString(5, iOpcion);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                LineaBO lineaBO = new LineaBO();
                lineaBO.setCo_lin(rs.getString("Co_lin"));
                lineaBO.setLin_des(rs.getString("lin_des"));
                lineaBO.setCampo1(rs.getString("campo1"));
                lineaBO.setComi_lin(rs.getString("comi_lin"));
                lineaBO.setComi_lin2(rs.getString("comi_lin2"));
                lista.add(lineaBO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

}
