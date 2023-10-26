/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.BancoBO;
import Conection.Conexion;
import static Model.CategoriaModel.con;
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
 * @author aranaVentur
 */
public class BancoModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public BancoModelo() {
        con = conexion.conexions();
    }

    public int pInsertarBanco(
            String sCo_Ban,
            String sDes_Ban,
            String sTelefonos,
            int plazo1,
            int plazo2,
            int plazo3,
            int plazo4,
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
            String sTrasnfe,
            double deComisMismoBanco,
            double deComisOtrosBancos
    ) {
        try {
            cstmt = con.prepareCall("{ CALL pInsertarBanco ("
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
            cstmt.setString(1, sCo_Ban);
            cstmt.setString(2, sDes_Ban);
            cstmt.setString(3, sTelefonos);
            cstmt.setInt(4, plazo1);
            cstmt.setInt(5, plazo2);
            cstmt.setInt(6, plazo3);
            cstmt.setInt(7, plazo4);
            cstmt.setString(8, sCampo1);
            cstmt.setString(9, sCampo2);
            cstmt.setString(10, sCampo3);
            cstmt.setString(11, sCampo4);
            cstmt.setString(12, sCampo5);
            cstmt.setString(13, sCampo6);
            cstmt.setString(14, sCampo7);
            cstmt.setString(15, sCampo8);
            cstmt.setString(16, sCo_Us_In);
            cstmt.setString(17, sCo_Sucu_In);
            cstmt.setString(18, sMaquina);
            cstmt.setString(19, sRevisado);
            cstmt.setString(20, sTrasnfe);
            cstmt.setDouble(21, deComisMismoBanco);
            cstmt.setDouble(22, deComisOtrosBancos);

            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            //  JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public int pActualizarBanco(
            String sCo_Ban,
            String sCo_BanOri,
            String sDes_Ban,
            String sTelefonos,
            int iPlazo1,
            int iPlazo2,
            int iPlazo3,
            int iPlazo4,
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
            String sTrasnfe,
            // String tsValidador,
            //String gRowguid,
            double deComisMismoBanco,
            double deComisOtrosBancos
    ) {
        try {
            cstmt = con.prepareCall("{CALL  pActualizarBanco ("
                    + "?,?,?,"
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
            cstmt.setString(1, sCo_Ban);
            cstmt.setString(2, sCo_BanOri);
            cstmt.setString(3, sDes_Ban);
            cstmt.setString(4, sTelefonos);
            cstmt.setInt(5, iPlazo1);
            cstmt.setInt(6, iPlazo2);
            cstmt.setInt(7, iPlazo3);
            cstmt.setInt(8, iPlazo4);
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
            cstmt.setString(21, sRevisado);
            cstmt.setString(22, sTrasnfe);
            cstmt.setDouble(23, deComisMismoBanco);
            cstmt.setDouble(24, deComisOtrosBancos);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BancoModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    
 public int pEliminarBanco(
            String sCo_BanOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
     
      try {
            cstmt = con.prepareCall("{CAll pEliminarBanco("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            cstmt.setString(1, sCo_BanOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FacturaCompraModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     return resultado ;
 }
    public ArrayList<BancoBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<BancoBO> lista = new ArrayList<BancoBO>();
        try {
            cstmt = con.prepareCall("{CALL pObtenerListadoDatos("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "? "
                    + ")}");

            cstmt.setString(1, sDatabase_Name);
            cstmt.setString(2, sTable_Name);
            cstmt.setString(3, sField_Name);
            cstmt.setString(4, sValor);
            cstmt.setString(5, iOpcion);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                BancoBO bancoBO = new BancoBO();
                bancoBO.setCampo1(rs.getString("campo1"));
                bancoBO.setCampo2(rs.getString("campo2"));
                bancoBO.setCampo3(rs.getString("campo3"));
                bancoBO.setCampo4(rs.getString("campo4"));
                bancoBO.setCampo5(rs.getString("campo5"));
                bancoBO.setCampo6(rs.getString("campo6"));
                bancoBO.setCampo7(rs.getString("campo7"));
                bancoBO.setCampo8(rs.getString("campo8"));
                bancoBO.setCo_ban(rs.getString("co_ban"));
                bancoBO.setCo_sucu_in(rs.getString("Co_sucu_in"));
                bancoBO.setCo_us_in(rs.getString("co_us_in"));
                bancoBO.setCo_us_mo(rs.getString("co_us_mo"));
                bancoBO.setComisMismoBanco(rs.getDouble("comisMismoBanco"));
                bancoBO.setComisOtrosBancos(rs.getDouble("comisOtrosBancos"));
                bancoBO.setDes_ban(rs.getString("Des_ban"));
                bancoBO.setFe_us_in(rs.getString("fe_us_in"));
                bancoBO.setFe_us_mo(rs.getString("fe_us_mo"));
                bancoBO.setPlazo1(rs.getInt("plazo1"));
                bancoBO.setPlazo2(rs.getInt("plazo2"));
                bancoBO.setPlazo3(rs.getInt("plazo3"));
                bancoBO.setPlazo4(rs.getInt("plazo4"));
                bancoBO.setRevisado(rs.getString("revisado"));
                bancoBO.setTelefonos(rs.getString("telefonos"));
                bancoBO.setTrasnfe(rs.getString("Trasnfe"));
                lista.add(bancoBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
