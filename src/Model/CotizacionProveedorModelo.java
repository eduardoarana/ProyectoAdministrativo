/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author EArana
 */
public class CotizacionProveedorModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public CotizacionProveedorModelo() {
        con = conexion.conexions();
    }

    public int pInsertarCotizacionProveedor(
            String sDoc_Num,
            String sNro_Fact,
            String sDecrip,
            String sCo_Prov,
            String sCo_Cta_Ingr_Egr,
            String sCo_Mone,
            String sCo_Cond,
            String sN_Control,
            String sPorc_Desc_Glob,
            String sdFec_Emis,
            String sdFec_Venc,
            String sdFec_Reg,
            String bAnulado,
            String sStatus,
            String deTasa,
            String sPorc_Reca,
            String deSaldo,
            String deTotal_Bruto,
            String deTotal_Neto,
            String deMonto_Desc_Glob,
            String deMonto_Reca,
            String deOtros1,
            String deOtros2,
            String deOtros3,
            String deMonto_Imp,
            String deMonto_Imp2,
            String deMonto_Imp3,
            String sDir_Ent,
            String sComentario,
            String bImpresa,
            String sSalestax,
            String sDis_Cen,
            String sCampo1,
            String sCampo2,
            String sCampo3,
            String sCampo4,
            String sCampo5,
            String sCampo6,
            String sCampo7,
            String sCampo8,
            String sRevisado,
            String sTrasnfe,
            String sCo_Us_In,
            String sCo_Sucu_In,
            String sMaquina,
            String bNac
    ) {

        try {
            cstmt = con.prepareCall("{CALL pInsertarCotizacionProveedor("
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,?,"
                    + "?"
                    + ")}");

            cstmt.setString(1, sDoc_Num);
            cstmt.setString(2, sNro_Fact);
            cstmt.setString(3, sDecrip);
            cstmt.setString(4, sCo_Prov);
            cstmt.setString(5, sCo_Cta_Ingr_Egr);
            cstmt.setString(6, sCo_Mone);
            cstmt.setString(7, sCo_Cond);
            cstmt.setString(8, sN_Control);
            cstmt.setString(9, sPorc_Desc_Glob);
            cstmt.setString(10, sdFec_Emis);
            cstmt.setString(11, sdFec_Venc);
            cstmt.setString(12, sdFec_Reg);
            cstmt.setString(13, bAnulado);

            cstmt.setString(14, sStatus);
            cstmt.setString(15, deTasa);

            cstmt.setString(16, sPorc_Reca);
            cstmt.setString(17, deSaldo);

            cstmt.setString(18, deTotal_Bruto);
            cstmt.setString(19, deTotal_Neto);
            cstmt.setString(20, deMonto_Desc_Glob);
            cstmt.setString(21, deMonto_Reca);
            cstmt.setString(22, deOtros1);
            cstmt.setString(23, deOtros2);
            cstmt.setString(24, deOtros3);
            cstmt.setString(25, deMonto_Imp);
            cstmt.setString(26, deMonto_Imp2);
            cstmt.setString(27, deMonto_Imp3);
            cstmt.setString(28, sDir_Ent);
            cstmt.setString(29, sComentario);
            cstmt.setString(30, bImpresa);
            cstmt.setString(31, sSalestax);
            cstmt.setString(32, sDis_Cen);
            cstmt.setString(33, sCampo1);
            cstmt.setString(34, sCampo2);
            cstmt.setString(35, sCampo3);
            cstmt.setString(36, sCampo4);
            cstmt.setString(37, sCampo5);
            cstmt.setString(38, sCampo6);
            cstmt.setString(39, sCampo7);
            cstmt.setString(40, sCampo8);
            cstmt.setString(41, sRevisado);
            cstmt.setString(42, sTrasnfe);
            cstmt.setString(43, sCo_Us_In);
            cstmt.setString(44, sCo_Sucu_In);
            cstmt.setString(45, sMaquina);
            cstmt.setString(46, bNac);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CotizacionProveedorModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public int pActualizarCotizacionProveedor(
            String sDoc_Num,
            String sDoc_NumOri,
            String sNro_Fact,
            String sDescrip,
            String sCo_Prov,
            String sCo_Cta_Ingr_Egr,
            String sCo_Mone,
            String sCo_Cond,
            String sPorc_Desc_Glob,
            String sPorc_Reca,
            String sStatus,
            String sN_Control,
            String sdFec_Emis,
            String sdFec_Venc,
            String sdFec_Reg,
            String deTasa,
            String deSaldo,
            String deTotal_Bruto,
            String deTotal_Neto,
            String deMonto_Desc_Glob,
            String deMonto_Reca,
            String deOtros1,
            String deOtros2,
            String deOtros3,
            String bAnulado,
            String bImpresa,
            String sSalestax,
            String sDis_Cen,
            String sDir_Ent,
            String sComentario,
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
            String sRevisado,
            String sTrasnfe,
            String sMaquina,
            String tsValidador,
            String sCampos,
            String gRowguid,
            String bNac
    ) {

        try {
            cstmt = con.prepareCall("{CALL pActualizarCotizacionProveedor("
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?," + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?"
                    + ")}");
            cstmt.setString(1, sDoc_Num);
            cstmt.setString(2, sDoc_NumOri);
            cstmt.setString(3, sNro_Fact);
            cstmt.setString(4, sDescrip);
            cstmt.setString(5, sCo_Prov);
            cstmt.setString(6, sCo_Cta_Ingr_Egr);
            cstmt.setString(7, sCo_Mone);
            cstmt.setString(8, sCo_Cond);
            cstmt.setString(9, sPorc_Desc_Glob);
            cstmt.setString(10, sPorc_Reca);
            cstmt.setString(11, sStatus);
            cstmt.setString(12, sN_Control);
            cstmt.setString(13, sdFec_Emis);
            cstmt.setString(14, sNro_Fact);
            cstmt.setString(15, sNro_Fact);
            cstmt.setString(16, sNro_Fact);
            cstmt.setString(17, sNro_Fact);
            cstmt.setString(18, sNro_Fact);
            cstmt.setString(19, sNro_Fact);
            cstmt.setString(20, sNro_Fact);
            cstmt.setString(21, sNro_Fact);
            cstmt.setString(22, sNro_Fact);
            cstmt.setString(23, sNro_Fact);
            cstmt.setString(24, sNro_Fact);
            cstmt.setString(25, sNro_Fact);
            cstmt.setString(26, sNro_Fact);
            cstmt.setString(27, sNro_Fact);
            cstmt.setString(28, sNro_Fact);
            cstmt.setString(29, sNro_Fact);
            cstmt.setString(30, sNro_Fact);
            cstmt.setString(31, sNro_Fact);
            cstmt.setString(32, sNro_Fact);
            cstmt.setString(33, sNro_Fact);
            cstmt.setString(34, sNro_Fact);
            cstmt.setString(35, sNro_Fact);
            cstmt.setString(36, sNro_Fact);
            cstmt.setString(37, sNro_Fact);
            cstmt.setString(38, sNro_Fact);
            cstmt.setString(39, sNro_Fact);
            cstmt.setString(40, sNro_Fact);

        } catch (SQLException ex) {
            Logger.getLogger(CotizacionProveedorModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pEliminarCotizacionProveedor(
            String sCo_VenOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarCotizacionProveedor("
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
            Logger.getLogger(CotizacionProveedorModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }
}
