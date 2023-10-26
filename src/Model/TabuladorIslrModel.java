/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.TabuladorIsLrRengBO;
import Beans.TabuladorIslrBO;
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
public class TabuladorIslrModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public TabuladorIslrModel() {
        con = conexion.conexions();
    }

    public int pInsertarTabuladorIslr(
            String sCo_Tab,
            String sTab_Des,
            String sTipo_Per,
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
            String sRevisado,
            String sTrasnfe,
            String sMaquina
    ) {

        try {
            cstmt = con.prepareCall("{CALL  pInsertarTabuladorIslr("
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

            cstmt.setString(1, sCo_Tab);
            cstmt.setString(2, sTab_Des);
            cstmt.setString(3, sTipo_Per);
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
            cstmt.setString(14, sRevisado);
            cstmt.setString(15, sTrasnfe);
            cstmt.setString(16, sMaquina);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {

            Logger.getLogger(TabuladorIslrModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;

    }

    public int pActualizarTabuladorIslr(
            String sCo_Tab,
            String sCo_TabOri,
            String sTab_Des,
            String sTipo_Per,
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
            cstmt = con.prepareCall("{CALL  pActualizarTabuladorIslr("
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
                   // + "?,"
                    + "?"
                    + ")     }");
            cstmt.setString(1, sCo_Tab);
            cstmt.setString(2, sCo_TabOri);
            cstmt.setString(3, sTab_Des);
            cstmt.setString(4, sTipo_Per);
            cstmt.setString(5, sCampo1);
            cstmt.setString(6, sCampo2);
            cstmt.setString(7, sCampo3);
            cstmt.setString(8, sCampo4);
            cstmt.setString(9, sCampo5);
            cstmt.setString(10, sCampo6);
            cstmt.setString(11, sCampo7);
            cstmt.setString(12, sCampo8);
            cstmt.setString(13, sCo_Us_Mo);
            cstmt.setString(14, sCo_Sucu_Mo);
            cstmt.setString(15, sMaquina);
            cstmt.setString(16, sCampos);
            cstmt.setString(17, sRevisado);
            cstmt.setString(18, sTrasnfe);
         //   cstmt.setString(19, tsValidador);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TabuladorIslrModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public int pEliminarTabuladorIslr(
            String sCo_VenOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {

        try {
            cstmt = con.prepareCall("{CALL pEliminarTabuladorIslr("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + " )}");

            cstmt.setString(1, sCo_VenOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TabuladorIslrModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public ArrayList<TabuladorIslrBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<TabuladorIslrBO> lista = new ArrayList<TabuladorIslrBO>();

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
                TabuladorIslrBO tabuladorIslrBO = new TabuladorIslrBO();
                tabuladorIslrBO.setCo_tab(rs.getString("co_tab"));
                tabuladorIslrBO.setTab_des(rs.getString("tab_des"));
                tabuladorIslrBO.setTipo_per(rs.getString("tipo_per"));
                tabuladorIslrBO.setCampo1(rs.getString("campo1"));
                tabuladorIslrBO.setCampo2(rs.getString("campo2"));
                tabuladorIslrBO.setCampo3(rs.getString("campo3"));
                tabuladorIslrBO.setCampo4(rs.getString("campo4"));
                tabuladorIslrBO.setCampo5(rs.getString("campo5"));
                tabuladorIslrBO.setCampo6(rs.getString("campo6"));
                tabuladorIslrBO.setCampo7(rs.getString("campo7"));
                tabuladorIslrBO.setCampo8(rs.getString("campo8"));
                tabuladorIslrBO.setCo_us_in(rs.getString("co_us_in"));
                tabuladorIslrBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                tabuladorIslrBO.setFe_us_in(rs.getString("fe_us_in"));
                tabuladorIslrBO.setCo_us_mo(rs.getString("co_us_mo"));
                tabuladorIslrBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                tabuladorIslrBO.setFe_us_mo(rs.getString("fe_us_mo"));
                tabuladorIslrBO.setRevisado(rs.getString("revisado"));
                tabuladorIslrBO.setTrasnfe(rs.getString("trasnfe"));
                tabuladorIslrBO.setValidador(rs.getString("validador"));
                // tabuladorIslrBO.setRowguid(rs.getString("rowguid"));
                lista.add(tabuladorIslrBO);
            }

        } catch (SQLException ex) {
            Logger.getLogger(TabuladorIslrModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public ArrayList<TabuladorIsLrRengBO> pSeleccionarTabuladorIslrRenglon(String sCo_Tab) {
        ArrayList<TabuladorIsLrRengBO> listatabuladorRen = new ArrayList<>();
        try {
            cstmt = con.prepareCall("{ CALL pSeleccionarTabuladorIslrRenglon("
                    + "?)}");
            cstmt.setString(1, sCo_Tab);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                TabuladorIsLrRengBO tabuladorIsLrRengBO = new TabuladorIsLrRengBO();
                tabuladorIsLrRengBO.setCo_islr(rs.getString("co_islr"));
                tabuladorIsLrRengBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                tabuladorIsLrRengBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                tabuladorIsLrRengBO.setCo_us_in(rs.getString("co_us_in"));
                tabuladorIsLrRengBO.setCo_us_mo(rs.getString("co_us_mo"));
                tabuladorIsLrRengBO.setPorc_imp(rs.getString("porc_imp"));
                tabuladorIsLrRengBO.setPorc_ret(rs.getString("porc_ret"));
                tabuladorIsLrRengBO.setReng_num(rs.getString("reng_num"));
                tabuladorIsLrRengBO.setRevisado(rs.getString("revisado"));
                tabuladorIsLrRengBO.setSustraen(rs.getString("sustraen"));
                tabuladorIsLrRengBO.setTrasnfe(rs.getString("trasnfe"));
                tabuladorIsLrRengBO.setIslr_des(rs.getString("islr_des"));
                listatabuladorRen.add(tabuladorIsLrRengBO);

            }

        } catch (SQLException ex) {
            Logger.getLogger(TabuladorIslrModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listatabuladorRen;
    }

}
