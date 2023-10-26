/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Conection.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aranaVentur
 */
public class BeneficiarioModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    int resultado = 0;

    public BeneficiarioModelo() {
        con = conexion.conexions();
    }

    public int pInsertarBeneficiario(
            String sCod_Ben,
            String sBen_Des,
            String sRif,
            String sNit,
            String sTelefonos,
            String sDirec1,
            String sDis_Cen,
            int bInactivo,
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
            String sTipo_Per,
            String sCo_Tab
    ) {
        try {
            cstmt = con.prepareCall("{CALL  pInsertarBeneficiario"
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cstmt.setString(1, sCod_Ben);
            cstmt.setString(2, sBen_Des);
            cstmt.setString(3, sRif);
            cstmt.setString(4, sNit);
            cstmt.setString(5, sTelefonos);
            cstmt.setString(6, sDirec1);
            cstmt.setString(7, sDis_Cen);
            cstmt.setInt(8, bInactivo);
            cstmt.setString(9, sCampo1);
            cstmt.setString(10, sCampo2);
            cstmt.setString(11, sCampo3);
            cstmt.setString(12, sCampo4);
            cstmt.setString(13, sCampo5);
            cstmt.setString(14, sCampo6);
            cstmt.setString(15, sCampo7);
            cstmt.setString(16, sCampo8);
            cstmt.setString(17, sCo_Us_In);
            cstmt.setString(18, sCo_Sucu_In);
            cstmt.setString(19, sMaquina);
            cstmt.setString(20, sRevisado);
            cstmt.setString(21, sTrasnfe);
            cstmt.setString(22, sTipo_Per);
            cstmt.setString(23, sCo_Tab);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BeneficiarioModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pActualizarBeneficiario(
            String sCod_Ben,
            String sCod_BenOri,
            String sBen_des,
            String sRif,
            String sNit,
            String sTelefono,
            String sDireccion1,
            String sDis_cen,
            int bInactivo,
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
            String trasnfe,
            String sTipo_Per,
            String sCo_tab
    ) {
        try {
            cstmt = con.prepareCall("{CALL  pActualizarBeneficiario"
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cstmt.setString(1, sCod_Ben);
            cstmt.setString(2, sCod_BenOri);
            cstmt.setString(3, sBen_des);
            cstmt.setString(4, sRif);
            cstmt.setString(5, sNit);
            cstmt.setString(6, sTelefono);
            cstmt.setString(7, sDireccion1);
            cstmt.setString(8, sDis_cen);
            cstmt.setInt(9, bInactivo);
            cstmt.setString(10, sCampo1);
            cstmt.setString(11, sCampo2);
            cstmt.setString(12, sCampo3);
            cstmt.setString(13, sCampo4);
            cstmt.setString(14, sCampo5);
            cstmt.setString(15, sCampo6);
            cstmt.setString(16, sCampo7);
            cstmt.setString(17, sCampo8);
            cstmt.setString(18, sCo_Us_Mo);
            cstmt.setString(19, sCo_Sucu_Mo);
            cstmt.setString(20, sMaquina);
            cstmt.setString(21, sCampos);
            cstmt.setString(22, sRevisado);
            cstmt.setString(23, trasnfe);
            cstmt.setString(24, sTipo_Per);
            cstmt.setString(25, sCo_tab);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }
}
