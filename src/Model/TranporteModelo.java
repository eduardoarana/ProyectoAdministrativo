/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.TransportesBO;
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
 * @author EArana
 */
public class TranporteModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public TranporteModelo() {

        con = conexion.conexions();
    }

    public int pInsertarTransporte(
            String sCo_Tran,
            String sDes_Tran,
            String sResp_Tra,
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
            cstmt = con.prepareCall("{CALL  pInsertarTransporte("
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
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + " )}");
            cstmt.setString(1, sCo_Tran);
            cstmt.setString(2, sDes_Tran);
            cstmt.setString(3, sResp_Tra);
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
            Logger.getLogger(TranporteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public int pActualizarTransporte(
            String sCo_Tran,
            String sCo_TranOri,
            String sDes_Tran,
            String sResp_Tra,
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
            cstmt = con.prepareCall("{CALL  pActualizarTransporte("
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
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + " )}");
            cstmt.setString(1, sCo_Tran);
            cstmt.setString(2, sCo_TranOri);
            cstmt.setString(3, sDes_Tran);
            cstmt.setString(4, sResp_Tra);
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
            Logger.getLogger(TranporteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public int pEliminarTransporte(
            String sCo_TranOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {

        try {
            cstmt = con.prepareCall("{CALL pEliminarTransporte(?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            cstmt.setString(1, sCo_TranOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TranporteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<TransportesBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<TransportesBO> lista = new ArrayList<>();
        try {

            cstmt = con.prepareCall("{CAll pObtenerListadoDatos("
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
                TransportesBO transporteBO = new TransportesBO();

                transporteBO.setCo_tran(rs.getString("co_tran"));
                transporteBO.setDes_tran(rs.getString("des_tran"));
                transporteBO.setCampo1(rs.getString("campo1"));
                transporteBO.setCampo2(rs.getString("campo2"));
                transporteBO.setCampo3(rs.getString("campo3"));
                transporteBO.setCampo4(rs.getString("campo4"));
                transporteBO.setCampo5(rs.getString("campo5"));
                transporteBO.setCampo6(rs.getString("campo6"));
                transporteBO.setCampo7(rs.getString("campo7"));
                transporteBO.setCampo8(rs.getString("campo8"));
                transporteBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                transporteBO.setCo_us_in(rs.getString("co_us_in"));
                transporteBO.setCo_us_mo(rs.getString("co_us_mo"));
                transporteBO.setDis_cen(rs.getString("dis_cen"));
                transporteBO.setFe_us_in(rs.getString("fe_us_in"));
                transporteBO.setFe_us_mo(rs.getString("fe_us_mo"));
                transporteBO.setFeccom(rs.getString("feccom"));
                transporteBO.setNumcom(rs.getString("numcom"));
                transporteBO.setResp_tra(rs.getString("resp_tra"));
                transporteBO.setRevisado(rs.getString("revisado"));
                transporteBO.setTrasnfe(rs.getString("trasnfe"));
                lista.add(transporteBO);

            }
        } catch (SQLException ex) {
            Logger.getLogger(TranporteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    
}
