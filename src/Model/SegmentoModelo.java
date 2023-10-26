/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.SegmentoBO;
import Conection.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author earana
 */
public class SegmentoModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public SegmentoModelo() {
        con = conexion.conexions();
    }

    public int pInsertarSegmento(
            String sCo_Seg,
            String sSeg_Des,
            String sC_Cuenta,
            String sP_Cuenta,
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
            cstmt = con.prepareCall("{CALL pInsertarSegmento("
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?)}");
            cstmt.setString(1, sCo_Seg);
            cstmt.setString(2, sSeg_Des);
            cstmt.setString(3, sC_Cuenta);
            cstmt.setString(4, sP_Cuenta);
            cstmt.setString(5, sDis_Cen);
            cstmt.setString(6, sCampo1);
            cstmt.setString(7, sCampo2);
            cstmt.setString(8, sCampo3);
            cstmt.setString(9, sCampo4);
            cstmt.setString(10, sCampo5);
            cstmt.setString(11, sCampo6);
            cstmt.setString(12, sCampo7);
            cstmt.setString(13, sCampo8);
            cstmt.setString(14, sCo_Us_In);
            cstmt.setString(15, sCo_Sucu_In);
            cstmt.setString(16, sMaquina);
            cstmt.setString(17, sRevisado);
            cstmt.setString(18, sTrasnfe);

            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    public int pActualizarSegmento(
            String sCo_Seg,
            String sCo_SegOri,
            String sSeg_Des,
            String sC_Cuenta,
            String sP_Cuenta,
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
            String sCampos,
            String sRevisado,
            String sTrasnfe
    ) {

        //Timestamp timestamp = Timestamp.valueOf(tsValidador);
        try {
            cstmt = con.prepareCall("{CALL  pActualizarSegmento"
                    + "(?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?"
                    + " )}");

            cstmt.setString(1, sCo_Seg);
            cstmt.setString(2, sCo_SegOri);
            cstmt.setString(3, sSeg_Des);
            cstmt.setString(4, sC_Cuenta);
            cstmt.setString(5, sP_Cuenta);
            cstmt.setString(6, sDis_Cen);
            cstmt.setString(7, sCampo1);
            cstmt.setString(8, sCampo2);
            cstmt.setString(9, sCampo3);
            cstmt.setString(10, sCampo4);
            cstmt.setString(11, sCampo5);
            cstmt.setString(12, sCampo6);
            cstmt.setString(13, sCampo7);
            cstmt.setString(14, sCampo8);
            cstmt.setString(15, sCo_Us_In);
            cstmt.setString(16, sCo_Sucu_In);
            cstmt.setString(17, sMaquina);
            cstmt.setString(18, sCampos);
            cstmt.setString(19, sRevisado);
            cstmt.setString(20, sTrasnfe);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SegmentoModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pEliminarSegmento(String sCo_SegOri, String sMaquina, String sCo_Us_Mo, String sCo_Sucu_Mo) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarSegmento ("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            cstmt.setString(1, sCo_SegOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SegmentoModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public ArrayList<SegmentoBO> pOptenerListadoDatosSegmento(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<SegmentoBO> lista = new ArrayList<SegmentoBO>();

        try {
            cstmt = con.prepareCall("{ CALL pObtenerListadoDatos("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?) }");
            cstmt.setString(1, sDatabase_Name);
            cstmt.setString(2, sTable_Name);
            cstmt.setString(3, sField_Name);
            cstmt.setString(4, sValor);
            cstmt.setString(5, iOpcion);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                SegmentoBO segmentoBO = new SegmentoBO();
                segmentoBO.setCo_seg(rs.getString("co_seg"));
                segmentoBO.setSeg_des(rs.getString("seg_des"));
                segmentoBO.setC_cuenta(rs.getString("c_cuenta"));
                segmentoBO.setCampo1(rs.getString("campo1"));
                segmentoBO.setCampo2(rs.getString("campo2"));
                segmentoBO.setCampo3(rs.getString("campo3"));
                segmentoBO.setCampo4(rs.getString("campo4"));
                segmentoBO.setCampo5(rs.getString("campo5"));
                segmentoBO.setCampo6(rs.getString("campo6"));
                segmentoBO.setCampo7(rs.getString("campo7"));
                segmentoBO.setCampo8(rs.getString("campo8"));
                segmentoBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                segmentoBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                segmentoBO.setCo_us_in(rs.getString("co_us_in"));
                segmentoBO.setCo_us_mo(rs.getString("co_us_mo"));
                segmentoBO.setDis_cen(rs.getString("dis_cen"));
                segmentoBO.setFe_us_in(rs.getString("fe_us_in"));
                segmentoBO.setFe_us_mo(rs.getString("fe_us_mo"));
                segmentoBO.setFeccom(rs.getString("feccom"));
                segmentoBO.setNumcom(rs.getString("numcom"));
                segmentoBO.setP_cuenta(rs.getString("P_cuenta"));
                segmentoBO.setRevisado(rs.getString("revisado"));
                segmentoBO.setTrasnfe(rs.getString("trasnfe"));
                segmentoBO.setValidador(rs.getString("validador"));
                lista.add(segmentoBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SegmentoModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

//     public static  void main (String arg[]){
//         int va= 0x000000000002D692;
//         
//         SegmentoModelo m = new SegmentoModelo();
//         int res =m.pActualizarSegmento("Seg", "Seg",
//             "des Actualizacion",
//             "","", "", "", "","","","","","","","us","co","maqui","", "",""
//             );
//         System.out.println("resul " + res);
//     }
}
