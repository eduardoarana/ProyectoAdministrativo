/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.PaisBO;
import Conection.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AranaV
 */
public class PaisModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public PaisModel() {
        con = conexion.conexions();
    }

    public int pInsertarPais(
            String sCo_Pais,
            String sPais_Des,
            String sCo_Mone,
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
            cstmt = con.prepareCall("{CALL pInsertarPais("
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

            cstmt.setString(1, sCo_Pais);
            cstmt.setString(2, sPais_Des);
            cstmt.setString(3, sCo_Mone);
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
            Logger.getLogger(PaisModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pActualizarPais(
            String sCo_Pais,
            String sCo_PaisOri,
            String sCo_Mone,
            String sPais_Des,
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
            cstmt = con.prepareCall("{CALL pActualizarPais("
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

            cstmt.setString(1, sCo_Pais);
            cstmt.setString(2, sCo_PaisOri);
            cstmt.setString(3, sCo_Mone);
            cstmt.setString(4, sPais_Des);
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

            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PaisModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pEliminarPais(
            String sCo_PaisOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarPais("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + " )}");
            cstmt.setString(1, sCo_PaisOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
           // Logger.getLogger(PaisModel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(),ex, "Software", JOptionPane.INFORMATION_MESSAGE);
        }
        return resultado;
    }
    // exec pObtenerListadoDatos @sDatabase_Name=N'DEMOA',@sTable_Name=N'saPais',@sField_Name=N'pais_des',@sValor=N'VE',@iOpcion=2

    public ArrayList<PaisBO> pObtenerListadoDatos(
            String Database_Name,
            String Table_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<PaisBO> lista = new ArrayList<PaisBO>();
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
                PaisBO paisBO = new PaisBO();
                paisBO.setCo_pais(rs.getString("co_pais"));
                paisBO.setPais_des(rs.getString("pais_des"));
                paisBO.setCampo1(rs.getString("Campo1"));
                paisBO.setCampo2(rs.getString("Campo2"));
                paisBO.setCampo3(rs.getString("Campo3"));
                paisBO.setCampo4(rs.getString("Campo4"));
                paisBO.setCampo5(rs.getString("Campo5"));
                paisBO.setCampo6(rs.getString("Campo6"));
                paisBO.setCampo7(rs.getString("Campo7"));
                paisBO.setCampo8(rs.getString("Campo8"));
                paisBO.setCampo8(rs.getString("Campo8"));
                paisBO.setCo_mone(rs.getString("co_mone"));
                paisBO.setCo_sucu_in(rs.getString("Co_sucu_in"));
                paisBO.setCo_sucu_mo(rs.getString("Co_sucu_mo"));
                paisBO.setFe_us_in(rs.getString("Fe_us_in"));
                paisBO.setFe_us_mo(rs.getString("Fe_us_mo"));
                paisBO.setRevisado(rs.getString("Revisado"));
                paisBO.setTrasnfe(rs.getString("Trasnfe"));
                paisBO.setValidador(rs.getString("Validador"));

                lista.add(paisBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PaisModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

  
}
