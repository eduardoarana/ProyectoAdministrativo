/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.TasaBO;
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
 * @author AVentura
 *
 */
public class TasaModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public TasaModelo() {
        con = conexion.conexions();
    }

    public int pInsertarTasa(
            String sCo_Mone,
            String sdFecha,
            String deTasa_C,
            String deTasa_V,
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
            String sTrasnfe,
            String sRevisado
    ) {
        try {
            cstmt = con.prepareCall("{CALL pInsertarTasa("
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
            cstmt.setString(2, sdFecha);
            cstmt.setString(3, deTasa_C);
            cstmt.setString(4, deTasa_V);
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
            cstmt.setString(16, sTrasnfe);
            cstmt.setString(17, sRevisado);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TasaModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pActualizarTasa(
            String iRENG_NUM,
            String iRENG_NUMOri,
            String sCo_Mone,
            String SCo_MoneOri,
            String sdFecha,
            String sdFechaOri,
            String deTasa_C,
            String deTasa_V,
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
            String sTrasnfe,
            String sRevisado
    ) {
        try {
            cstmt = con.prepareCall("{Call pActualizarTasa("
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
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            cstmt.setString(1, iRENG_NUM);
            cstmt.setString(2, iRENG_NUMOri);
            cstmt.setString(3, sCo_Mone);
            cstmt.setString(4, SCo_MoneOri);
            cstmt.setString(5, sdFecha);
            cstmt.setString(6, sdFechaOri);
            cstmt.setString(7, deTasa_C);
            cstmt.setString(8, deTasa_V);
            cstmt.setString(9, sCampo1);
            cstmt.setString(10, sCampo2);
            cstmt.setString(11, sCampo3);
            cstmt.setString(12, sCampo4);
            cstmt.setString(13, sCampo5);
            cstmt.setString(14, sCampo6);
            cstmt.setString(15, sCampo7);
            cstmt.setString(16, sCampo8);
            cstmt.setString(17, sCo_Us_Mo);
            cstmt.setString(18, sCo_Sucu_Mo);
            cstmt.setString(19, sMaquina);
            cstmt.setString(20, sCampos);
            cstmt.setString(21, sTrasnfe);
            cstmt.setString(22, sRevisado);

            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(TasaModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pEliminarTasa(
            String sCo_MoneOri,
            String sdFechaOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{Call pEliminarTasa("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");

            cstmt.setString(1, sCo_MoneOri);
            cstmt.setString(2, sdFechaOri);
            cstmt.setString(3, sMaquina);
            cstmt.setString(4, sCo_Us_Mo);
            cstmt.setString(5, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(TasaModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<TasaBO> pSeleccionarRenglonTasa(
            String co_mone
    ) {
        ArrayList<TasaBO> lista = new ArrayList<>();

        try {
            cstmt = con.prepareCall("{CALL pSeleccionarRenglonTasa(?)}");
            cstmt.setString(1, co_mone);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                TasaBO tasaBO = new TasaBO();
                tasaBO.setCo_mone(rs.getString("co_mone"));
                tasaBO.setCampo1(rs.getString("campo1"));
                tasaBO.setCampo2(rs.getString("campo2"));
                tasaBO.setCampo3(rs.getString("campo3"));
                tasaBO.setCampo4(rs.getString("campo4"));
                tasaBO.setCampo5(rs.getString("campo5"));
                tasaBO.setCampo6(rs.getString("campo6"));
                tasaBO.setCampo7(rs.getString("campo7"));
                tasaBO.setCampo8(rs.getString("campo8"));
                tasaBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                tasaBO.setCo_sucu_mo(rs.getString("co_sucu_in"));
                tasaBO.setFe_us_in(rs.getString("fe_us_in"));
                tasaBO.setFe_us_mo(rs.getString("fe_us_mo"));
                tasaBO.setFecha(rs.getString("fecha"));
                tasaBO.setRevisado(rs.getString("revisado"));
                tasaBO.setTasa_c(rs.getString("tasa_c"));
                tasaBO.setTasa_v(rs.getString("tasa_v"));
                tasaBO.setTrasnfe(rs.getString("trasnfe"));
                tasaBO.setValidador(rs.getString("validador"));
                lista.add(tasaBO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
