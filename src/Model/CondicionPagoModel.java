/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.CondicionPagoBO;
import Conection.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AranaV
 */
public class CondicionPagoModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public CondicionPagoModel() {
        con = conexion.conexions();
    }

    public ArrayList<CondicionPagoBO> pObtenerListadoDatos(
            String Database_Name,
            String Table_Name,
            String sField_Name,
            String sValor,
            String iOpcion) {

        ArrayList<CondicionPagoBO> lista = new ArrayList<>();

        try {
            cstmt = con.prepareCall("{CALL pObtenerListadoDatos(?,?,?,?,?)}");

            cstmt.setString(1, Database_Name);
            cstmt.setString(2, Table_Name);
            cstmt.setString(3, sField_Name);
            cstmt.setString(4, sValor);
            cstmt.setString(5, iOpcion);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                CondicionPagoBO condicionPagoBO = new CondicionPagoBO();
                condicionPagoBO.setCampo1(rs.getString("campo1"));
                condicionPagoBO.setCampo2(rs.getString("campo2"));
                condicionPagoBO.setCampo3(rs.getString("campo3"));
                condicionPagoBO.setCampo4(rs.getString("campo4"));
                condicionPagoBO.setCampo5(rs.getString("campo5"));
                condicionPagoBO.setCampo6(rs.getString("campo6"));
                condicionPagoBO.setCampo7(rs.getString("campo7"));

                condicionPagoBO.setCampo8(rs.getString("campo8"));
                condicionPagoBO.setCo_cond(rs.getString("co_cond"));
                condicionPagoBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                condicionPagoBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                condicionPagoBO.setCo_us_in(rs.getString("co_us_in"));
                condicionPagoBO.setCo_us_mo(rs.getString("co_us_mo"));
                condicionPagoBO.setCond_des(rs.getString("cond_des"));
                condicionPagoBO.setDias_cred(rs.getString("dias_cred"));
                condicionPagoBO.setDis_cen(rs.getString("dis_cen"));
                condicionPagoBO.setFe_us_in(rs.getString("fe_us_in"));
                condicionPagoBO.setFe_us_mo(rs.getString("fe_us_mo"));
                condicionPagoBO.setFeccom(rs.getString("feccom"));
                condicionPagoBO.setNumcom(rs.getString("numcom"));
                condicionPagoBO.setRevisado(rs.getString("revisado"));
                condicionPagoBO.setTrasnfe(rs.getString("trasnfe"));
                condicionPagoBO.setValidador(rs.getString("validador"));
                lista.add(condicionPagoBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CondicionPagoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public int pInsertarCondicionPago(
            String sCo_Cond,
            String sCond_Des,
            String iDias_Cred,
            String sDis_Cen,
            String sCampo1,
            String sCampo2,
            String sCampo3,
            String sCampo4,
            String sCampo5,
            String sCampo6,
            String sCampo7,
            String sCampo8,
            String sCo_Us_In,
            String sCo_Sucu_In,
            String sMaquina,
            String sRevisado,
            String sTrasnfe
    ) {
        try {
            cstmt = con.prepareCall("{CALL pInsertarCondicionPago("
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?)}");
            cstmt.setString(1, sCo_Cond);
            cstmt.setString(2, sCond_Des);
            cstmt.setString(3, iDias_Cred);
            cstmt.setString(4, sDis_Cen);
            cstmt.setString(5, sCampo1);
            cstmt.setString(6, sCampo2);
            cstmt.setString(7, sCampo3);
            cstmt.setString(8, sCampo4);
            cstmt.setString(9, sCampo5);
            cstmt.setString(10, sCampo6);
            cstmt.setString(11, sCampo7);
            cstmt.setString(12, sCampo8);
            cstmt.setString(13, sCo_Us_In);
            cstmt.setString(14, sCo_Sucu_In);
            cstmt.setString(15, sMaquina);
            cstmt.setString(16, sRevisado);
            cstmt.setString(17, sTrasnfe);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CondicionPagoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pActualizarCondicionPago(
            String sCo_Cond,
            String sCo_CondOri,
            String sCond_Des,
            String iDias_Cred,
            String sDis_Cen,
            String sCampo1,
            String sCampo2,
            String sCampo3,
            String sCampo4,
            String sCampo5,
            String sCampo6,
            String sCampo7,
            String sCampo8,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo,
            String sMaquina,
            String sCampos,
            String sRevisado,
            String sTrasnfe
    ) {
        try {
            cstmt = con.prepareCall("{CALL  pActualizarCondicionPago"
                    + "(?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?"
                    + " )}");
            cstmt.setString(1, sCo_Cond);
            cstmt.setString(2, sCo_CondOri);
            cstmt.setString(3, sCond_Des);
            cstmt.setString(4, iDias_Cred);
            cstmt.setString(5, sDis_Cen);
            cstmt.setString(6, sCampo1);
            cstmt.setString(7, sCampo2);
            cstmt.setString(8, sCampo3);
            cstmt.setString(9, sCampo4);
            cstmt.setString(10, sCampo5);
            cstmt.setString(11, sCampo6);
            cstmt.setString(12, sCampo7);
            cstmt.setString(13, sCampo8);
            cstmt.setString(14, sCo_Us_Mo);
            cstmt.setString(15, sCo_Sucu_Mo);
            cstmt.setString(16, sMaquina);
            cstmt.setString(17, sCampos);
            cstmt.setString(18, sRevisado);
            cstmt.setString(19, sTrasnfe);

            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CondicionPagoModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public int pEliminarCondicionPago(String sCo_SegOri,String sMaquina , String sCo_Us_Mo,String sCo_Sucu_Mo) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarCondicionPago ("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}"); 
             cstmt.setString(1,sCo_SegOri);
            cstmt.setString(2,sMaquina);
            cstmt.setString(3,sCo_Us_Mo);
            cstmt.setString(4,sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CondicionPagoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
}
