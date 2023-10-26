/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.MonedaBO;
import Conection.Conexion;
import Utilitarios.Utilitario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AranaV
 */
public class MonedaModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public MonedaModel() {
        con = conexion.conexions();
    }

    public int pInsertarMoneda(
            String sCo_Mone,
            String sMone_Des,
            String deCambio,
            String bRelacion,
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
            cstmt = con.prepareCall("{CALL pInsertarMoneda("
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

            cstmt.setString(1, sCo_Mone);
            cstmt.setString(2, sMone_Des);
            cstmt.setString(3, deCambio);
            cstmt.setString(4, bRelacion);
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
            resultado = 0;

            Logger.getLogger(MonedaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pActualizarMoneda(
            String sCo_Mone,
            String sCo_MoneOri,
            String sMone_Des,
            String deCambio,
            String bRelacion,
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
            cstmt = con.prepareCall("{Call pActualizarMoneda("
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
                    + ")}");

            cstmt.setString(1, sCo_Mone);
            cstmt.setString(2, sCo_MoneOri);
            cstmt.setString(3, sMone_Des);
            cstmt.setString(4, deCambio);
            cstmt.setString(5, bRelacion);
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
            Logger.getLogger(MonedaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pEliminarMonedas(
            String sCo_MoneOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarMoneda(?,?,?,?)}");
            cstmt.setString(1, sCo_MoneOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(MonedaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<MonedaBO> pObtenerListadoDatos(
            String Database_Name,
            String Table_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<MonedaBO> lista = new ArrayList<MonedaBO>();
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
                MonedaBO monedaBO = new MonedaBO();
                monedaBO.setCo_mone(rs.getString("co_mone"));
                monedaBO.setMone_des(rs.getString("mone_des"));
                monedaBO.setCambio(rs.getString("cambio"));
                monedaBO.setCampo1(rs.getString("campo1"));
                monedaBO.setCampo2(rs.getString("campo2"));
                monedaBO.setCampo3(rs.getString("campo3"));
                monedaBO.setCampo4(rs.getString("campo4"));
                monedaBO.setCampo5(rs.getString("campo5"));
                monedaBO.setCampo6(rs.getString("campo6"));
                monedaBO.setCampo7(rs.getString("campo7"));
                monedaBO.setCampo8(rs.getString("campo8"));
                monedaBO.setCo_sucu_in(rs.getString("Co_sucu_in"));
                monedaBO.setCo_sucu_mo(rs.getString("Co_sucu_mo"));
                monedaBO.setCo_us_in(rs.getString("Co_us_in"));
                monedaBO.setCo_us_mo(rs.getString("Co_us_mo"));
                monedaBO.setFe_us_mo(rs.getString("Fe_us_mo"));
                monedaBO.setFe_us_in(rs.getString("Fe_us_in"));
                monedaBO.setRelacion(rs.getString("relacion"));
                monedaBO.setRevisado(rs.getString("revisado"));
                monedaBO.setTrasnfe(rs.getString("trasnfe"));
                monedaBO.setValidador(rs.getString("validador"));

                lista.add(monedaBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PaisModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public ArrayList<MonedaBO> pObtenerFechaTasa(String coMoneda, String fecha) {
        ArrayList<MonedaBO> lista = new ArrayList<>();
        try {
            cstmt = con.prepareCall("{CALL pObtenerFechaTasa(?,?)}");
            cstmt.setString(1, coMoneda);
            cstmt.setString(2, fecha);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                MonedaBO monedaBO = new MonedaBO();
                monedaBO.setTasa_v(rs.getString("tasa_v"));
                monedaBO.setTasa_c(rs.getString("tasa_c"));
                lista.add(monedaBO);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

    public static void main(String[] args) {
        MonedaModel m = new MonedaModel();
           ArrayList<MonedaBO> lista = m.pObtenerFechaTasa("US$", Utilitario.optenerfecha(new Date()));
          System.out.println("Lista " + lista.get(0).getTasa_c() + " Tasa VEnta" + lista.get(0).getTasa_v());
    }
}
