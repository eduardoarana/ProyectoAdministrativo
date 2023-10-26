/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ZonaBO;
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
 * @author earana
 */
public class ZonaModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public ZonaModel() {
        con = conexion.conexions();
    }

    public int pInsertarZona(String sCo_Zon, String sZon_Des,
            String sDis_Cen, String sCampo1, String sCampo2,
            String sCampo3, String sCampo4, String sCampo5,
            String sCampo6, String sCampo7, String sCampo8,
            String sCo_Us_In, String sCo_Sucu_In, String sMaquina,
            String sRevisado, String sTrasnfe
    ) {
        try {
            cstmt = con.prepareCall("{CALL pInsertarZona ("
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
                    + ")}");
            cstmt.setString(1, sCo_Zon);
            cstmt.setString(2, sZon_Des);
            cstmt.setString(3, sDis_Cen);
            cstmt.setString(4, sCampo1);
            cstmt.setString(5, sCampo2);
            cstmt.setString(6, sCampo3);
            cstmt.setString(7, sCampo4);
            cstmt.setString(8, sCampo5);
            cstmt.setString(9, sCampo6);
            cstmt.setString(10, sCampo7);
            cstmt.setString(11, sCampo8);
            cstmt.setString(12, sCo_Us_In);
            cstmt.setString(13, sCo_Sucu_In);
            cstmt.setString(14, sMaquina);
            cstmt.setString(15, sRevisado);
            cstmt.setString(16, sTrasnfe);

            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ZonaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pActualizarZona(String sCo_Zon, String sCo_ZonOri, String sZon_Des,
            String sDis_Cen, String sCampo1, String sCampo2,
            String sCampo3, String sCampo4, String sCampo5,
            String sCampo6, String sCampo7, String sCampo8,
            String sCo_Us_In, String sCo_Sucu_In, String sMaquina,
            String sRevisado, String sTrasnfe) {

        try {
            cstmt = con.prepareCall("{CALL pActualizarZona ("
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
                    + ")}");

            cstmt.setString(1, sCo_Zon);
            cstmt.setString(2, sCo_ZonOri);
            cstmt.setString(3, sZon_Des);
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
            Logger.getLogger(ZonaModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public int pEliminarZona(String sCo_ZonOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarZona("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            cstmt.setString(1, sCo_ZonOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ZonaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<ZonaBO> pObtenerListadoDatosZona(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<ZonaBO> lista = new ArrayList<ZonaBO>();
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
                ZonaBO zonaBO = new ZonaBO();
                zonaBO.setCo_zon(rs.getString("co_zon"));
                zonaBO.setZon_des(rs.getString("zon_des"));
                zonaBO.setCampo1(rs.getString("campo1"));
                zonaBO.setCampo2(rs.getString("campo2"));
                zonaBO.setCampo3(rs.getString("campo3"));
                zonaBO.setCampo4(rs.getString("campo4"));
                zonaBO.setCampo5(rs.getString("campo5"));
                zonaBO.setCampo6(rs.getString("campo6"));
                zonaBO.setCampo7(rs.getString("campo7"));
                zonaBO.setCampo8(rs.getString("campo8"));
                zonaBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                zonaBO.setCo_sucu_mo(rs.getString("Co_sucu_mo"));
                zonaBO.setDis_cen(rs.getString("dis_cen"));
                zonaBO.setFe_us_in(rs.getString("fe_us_in"));
                zonaBO.setFe_us_mo(rs.getString("fe_us_mo"));
                zonaBO.setFeccom(rs.getString("feccom"));
                zonaBO.setNumcom(rs.getString("numcom"));
                zonaBO.setRevisado(rs.getString("revisado"));
                zonaBO.setTrasnfe(rs.getString("trasnfe"));
                zonaBO.setValidador(rs.getString("validador"));
                lista.add(zonaBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ZonaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
