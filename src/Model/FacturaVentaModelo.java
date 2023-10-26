/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.FacturaVentaBO;
import Beans.FacturaVentaRengBO;
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
 * @author EArana
 */
public class FacturaVentaModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public FacturaVentaModelo() {
        con = conexion.conexionControlCenter("demoa", "profit", "profit");
    }

    public int pInsertarFacturaVenta(
            String sDoc_Num,
            String sDescrip,
            String sCo_Cli,
            String sCo_Tran,
            String sCo_Mone,
            String sCo_Cta_Ingr_Egr,
            String sCo_Ven,
            String sCo_Cond,
            String sdFec_Emis,
            String sdFec_Venc,
            String sdFec_Reg,
            String bAnulado,
            String sStatus,
            String deTasa,
            String sN_Control,
            String sPorc_Desc_Glob,
            String deMonto_Desc_Glob,
            String sPorc_Reca,
            String deMonto_Reca,
            String deSaldo,
            String deTotal_Bruto,
            String deMonto_Imp,
            String deMonto_Imp2,
            String deMonto_Imp3,
            String deOtros1,
            String deOtros2,
            String deOtros3,
            String deTotal_Neto,
            String sDis_Cen,
            String sComentario,
            String sDir_Ent,
            String bContrib,
            String bImpresa,
            String sSalestax,
            String sImpfis,
            String sImpfisfac,
            String bVen_Ter,
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
            cstmt = con.prepareCall("{CALL pInsertarFacturaVenta("
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
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,?,?"
                    + ") }");

            cstmt.setString(1, sDoc_Num);
            cstmt.setString(2, sDescrip);
            cstmt.setString(3, sCo_Cli);
            cstmt.setString(4, sCo_Tran);
            cstmt.setString(5, sCo_Mone);
            cstmt.setString(6, sCo_Cta_Ingr_Egr);
            cstmt.setString(7, sCo_Ven);
            cstmt.setString(8, sCo_Cond);
            cstmt.setString(9, sdFec_Emis);
            cstmt.setString(10, sdFec_Venc);
            cstmt.setString(11, sdFec_Reg);
            cstmt.setString(12, bAnulado);
            cstmt.setString(13, sStatus);
            cstmt.setString(14, deTasa);
            cstmt.setString(15, sN_Control);
            cstmt.setString(16, sPorc_Desc_Glob);
            cstmt.setString(17, deMonto_Desc_Glob);
            cstmt.setString(18, sPorc_Reca);
            cstmt.setString(19, deMonto_Reca);
            cstmt.setString(20, deSaldo);
            cstmt.setString(21, deTotal_Bruto);
            cstmt.setString(22, deMonto_Imp);
            cstmt.setString(23, deMonto_Imp2);
            cstmt.setString(24, deMonto_Imp3);
            cstmt.setString(25, deOtros1);
            cstmt.setString(26, deOtros2);
            cstmt.setString(27, deOtros3);
            cstmt.setString(28, deTotal_Neto);
            cstmt.setString(29, sDis_Cen);
            cstmt.setString(30, sComentario);
            cstmt.setString(31, sDir_Ent);
            cstmt.setString(32, bContrib);
            cstmt.setString(33, bImpresa);
            cstmt.setString(34, sSalestax);
            cstmt.setString(35, sImpfis);
            cstmt.setString(36, sImpfisfac);
            cstmt.setString(37, bVen_Ter);
            cstmt.setString(38, sCampo1);
            cstmt.setString(39, sCampo2);
            cstmt.setString(40, sCampo3);
            cstmt.setString(41, sCampo4);
            cstmt.setString(42, sCampo5);
            cstmt.setString(43, sCampo6);
            cstmt.setString(44, sCampo7);
            cstmt.setString(45, sCampo8);
            cstmt.setString(46, sCo_Us_In);
            cstmt.setString(47, sCo_Sucu_In);
            cstmt.setString(48, sRevisado);
            cstmt.setString(49, sTrasnfe);
            cstmt.setString(50, sMaquina);
            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e, "Software", JOptionPane.ERROR_MESSAGE);

        }
        return resultado;
    }

    public int pActualizarFacturaVenta(
            String sDoc_Num,
            String sDoc_NumOri,
            String sDescrip,
            String sCo_Cli,
            String sCo_Tran,
            String sCo_Mone,
            String sCo_Cta_Ingr_Egr,
            String sCo_Ven,
            String sCo_Cond,
            String sdFec_Emis,
            String sdFec_Venc,
            String sdFec_Reg,
            String bAnulado,
            String sStatus,
            String deTasa,
            String sN_Control,
            String sNro_Doc,
            String sPorc_Desc_Glob,
            String deMonto_Desc_Glob,
            String sPorc_Reca,
            String deMonto_Reca,
            String deSaldo,
            String deTotal_Bruto,
            String deMonto_Imp,
            String deMonto_Imp2,
            String deMonto_Imp3,
            String deOtros1,
            String deOtros2,
            String deOtros3,
            String deTotal_Neto,
            String sComentario,
            String sDir_Ent,
            String bContrib,
            String bImpresa,
            String sSalestax,
            String sImpfis,
            String sImpfisfac,
            String bVen_Ter,
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
            String sRevisado,
            String sTrasnfe,
            String sMaquina,
            //   String tsValidador,
            String sCampos
    ) {
        try {

            cstmt = con.prepareCall("{CALL pActualizarFacturaVenta("
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
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,?,? ,?,?,?"
                    + ") }");
            cstmt.setString(1, sDoc_Num);
            cstmt.setString(2, sDoc_NumOri);
            cstmt.setString(3, sDescrip);
            cstmt.setString(4, sCo_Cli);
            cstmt.setString(5, sCo_Tran);
            cstmt.setString(6, sCo_Mone);
            cstmt.setString(7, sCo_Cta_Ingr_Egr);
            cstmt.setString(8, sCo_Ven);
            cstmt.setString(9, sCo_Cond);
            cstmt.setString(10, sdFec_Emis);
            cstmt.setString(11, sdFec_Venc);
            cstmt.setString(12, sdFec_Reg);
            cstmt.setString(13, bAnulado);
            cstmt.setString(14, sStatus);
            cstmt.setString(15, deTasa);
            cstmt.setString(16, sN_Control);
            cstmt.setString(17, sNro_Doc);
            cstmt.setString(18, sPorc_Desc_Glob);
            cstmt.setString(19, deMonto_Desc_Glob);
            cstmt.setString(20, sPorc_Reca);
            cstmt.setString(21, deMonto_Reca);
            cstmt.setString(22, deSaldo);
            cstmt.setString(23, deTotal_Bruto);
            cstmt.setString(24, deMonto_Imp);
            cstmt.setString(25, deMonto_Imp2);
            cstmt.setString(26, deMonto_Imp3);
            cstmt.setString(27, deOtros1);
            cstmt.setString(28, deOtros2);
            cstmt.setString(29, deOtros3);
            cstmt.setString(30, deTotal_Neto);
            cstmt.setString(31, sComentario);
            cstmt.setString(32, sDir_Ent);
            cstmt.setString(33, bContrib);
            cstmt.setString(34, bImpresa);
            cstmt.setString(35, sSalestax);
            cstmt.setString(36, sImpfis);
            cstmt.setString(37, sImpfisfac);
            cstmt.setString(38, bVen_Ter);
            cstmt.setString(39, sDis_Cen);
            cstmt.setString(40, sCampo1);
            cstmt.setString(41, sCampo2);
            cstmt.setString(42, sCampo3);
            cstmt.setString(43, sCampo4);
            cstmt.setString(44, sCampo5);
            cstmt.setString(45, sCampo6);
            cstmt.setString(46, sCampo7);
            cstmt.setString(47, sCampo8);
            cstmt.setString(48, sCo_Us_Mo);
            cstmt.setString(49, sCo_Sucu_Mo);
            cstmt.setString(50, sRevisado);
            cstmt.setString(51, sTrasnfe);
            cstmt.setString(52, sMaquina);
            //   cstmt.setString(50, tsValidador);
            cstmt.setString(53, sCampos);

            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultado;
    }

    public int pActualizarRenglonesFacturaVenta(
            int iReng_Num,
            String sDoc_Num,
            int iReng_NumOri,
            String sDoc_NumOri,
            String sCo_Art,
            String sDes_Art,
            String sCo_Alma,
            String sCo_Uni,
            String sSco_Uni,
            String sCo_Precio,
            String sTipo_Imp,
            String sTipo_Imp2,
            String sTipo_Imp3,
            double deTotal_Art,
            double deSTotal_Art,
            double dePrec_Vta,
            String sPorc_Desc,
            double deMonto_Desc,
            double deReng_Neto,
            double dePendiente,
            String sTipo_Doc,
            String sNum_Doc,
            double dePorc_Imp,
            double dePorc_Imp2,
            double dePorc_Imp3,
            double deMonto_Imp,
            double deMonto_Imp2,
            double deMonto_Imp3,
            double deOtros,
            double deOtros1_Glob,
            double deOtros2_Glob,
            double deOtros3_Glob,
            double deTotal_Dev,
            double deMonto_Dev,
            String sComentario,
            double dePendiente2,
            double deMonto_desc_glob,
            double deMonto_reca_glob,
            double deMonto_imp_afec_glob,
            double deMonto_imp2_afec_glob,
            double deMonto_imp3_afec_glob,
            String sDis_Cen,
            String sCo_Sucu_Mo,
            String sCo_Us_Mo,
            String sREVISADO,
            String sTRASNFE,
            String sMaquina,
            //@growguid UNIQUEIDENTIFIER ,
            String sCampos
    ) {
        try {

            cstmt = con.prepareCall("{CAll pActualizarRenglonesFacturaVenta("
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
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            cstmt.setInt(1, iReng_Num);
            cstmt.setString(2, sDoc_Num);
            cstmt.setInt(3, iReng_NumOri);
            cstmt.setString(4, sDoc_NumOri);
            cstmt.setString(5, sCo_Art);
            cstmt.setString(6, sDes_Art);
            cstmt.setString(7, sCo_Alma);
            cstmt.setString(8, sCo_Uni);
            cstmt.setString(9, sSco_Uni);
            cstmt.setString(10, sCo_Precio);
            cstmt.setString(11, sTipo_Imp);
            cstmt.setString(12, sTipo_Imp2);
            cstmt.setString(13, sTipo_Imp3);
            cstmt.setDouble(14, deTotal_Art);
            cstmt.setDouble(15, deSTotal_Art);
            cstmt.setDouble(16, dePrec_Vta);
            cstmt.setString(17, sPorc_Desc);
            cstmt.setDouble(18, deMonto_Desc);
            cstmt.setDouble(19, deReng_Neto);
            cstmt.setDouble(20, dePendiente);
            cstmt.setString(21, sTipo_Doc);
            cstmt.setString(22, sNum_Doc);
            cstmt.setDouble(23, dePorc_Imp);
            cstmt.setDouble(24, dePorc_Imp2);
            cstmt.setDouble(25, dePorc_Imp3);
            cstmt.setDouble(26, deMonto_Imp);
            cstmt.setDouble(27, deMonto_Imp2);
            cstmt.setDouble(28, deMonto_Imp3);
            cstmt.setDouble(29, deOtros);
            cstmt.setDouble(30, deOtros1_Glob);
            cstmt.setDouble(31, deOtros2_Glob);
            cstmt.setDouble(32, deOtros3_Glob);
            cstmt.setDouble(33, deTotal_Dev);
            cstmt.setDouble(34, deMonto_Dev);
            cstmt.setString(35, sComentario);
            cstmt.setDouble(36, dePendiente2);
            cstmt.setDouble(37, deMonto_desc_glob);
            cstmt.setDouble(38, deMonto_reca_glob);
            cstmt.setDouble(39, deMonto_imp_afec_glob);
            cstmt.setDouble(40, deMonto_imp2_afec_glob);
            cstmt.setDouble(41, deMonto_imp3_afec_glob);
            cstmt.setString(42, sDis_Cen);
            cstmt.setString(43, sCo_Sucu_Mo);
            cstmt.setString(44, sCo_Us_Mo);
            cstmt.setString(45, sREVISADO);
            cstmt.setString(46, sTRASNFE);
            cstmt.setString(47, sMaquina);
            cstmt.setString(48, sCampos);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    public int pStockActualizar(
            String sCo_Alma,
            String sCo_Art,
            String sCo_Uni,
            String deCantidad,
            String sTipoStock,
            String bSumarStock,
            String bPermiteStockNegativo
    ) {
        try {

            cstmt = con.prepareCall("{CAll pStockActualizar("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");

            cstmt.setString(1, sCo_Alma);
            cstmt.setString(2, sCo_Art);
            cstmt.setString(3, sCo_Uni);
            cstmt.setString(4, deCantidad);
            cstmt.setString(5, sTipoStock);
            cstmt.setString(6, bSumarStock);
            cstmt.setString(7, bPermiteStockNegativo);
            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    public int pEliminarFacturaVenta(
            String sDoc_NumOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        try {

            cstmt = con.prepareCall("{CAll pEliminarFacturaVenta("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            cstmt.setString(1, sDoc_NumOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    public int pInsertarRenglonesFacturaVenta(
            String iReng_Num,
            String sDoc_Num,
            String sCo_Art,
            String sDes_Art,
            String sCo_Uni,
            String sSco_Uni,
            String sCo_Alma,
            String sCo_Precio,
            String sTipo_Imp,
            String sTipo_Imp2,
            String sTipo_Imp3,
            Double deTotal_Art,
            String deSTotal_Art,
            String dePrec_Vta,
            String sPorc_Desc,
            String deMonto_Desc,
            String deReng_Neto,
            String dePendiente,
            String dePendiente2,
            String deMonto_Desc_Glob,
            String deMonto_reca_Glob,
            String deOtros1_glob,
            String deOtros2_glob,
            String deOtros3_glob,
            String deMonto_imp_afec_glob,
            String deMonto_imp2_afec_glob,
            String deMonto_imp3_afec_glob,
            String sTipo_Doc,
            //  String gRowguid_Doc,
            String sNum_Doc,
            String dePorc_Imp,
            String dePorc_Imp2,
            String dePorc_Imp3,
            String deMonto_Imp,
            String deMonto_Imp2,
            String deMonto_Imp3,
            String deOtros,
            String deTotal_Dev,
            String deMonto_Dev,
            String sComentario,
            String sDis_Cen,
            String sCo_Sucu_In,
            String sCo_Us_In,
            String sREVISADO,
            String sTRASNFE,
            String sMaquina
    //String lote_asignado
    ) {
        try {

            cstmt = con.prepareCall("{CAll pInsertarRenglonesFacturaVenta("
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
                    //+ "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            cstmt.setString(1, iReng_Num);
            cstmt.setString(2, sDoc_Num);
            cstmt.setString(3, sCo_Art);
            cstmt.setString(4, sDes_Art);
            cstmt.setString(5, sCo_Uni);
            cstmt.setString(6, sSco_Uni);
            cstmt.setString(7, sCo_Alma);
            cstmt.setString(8, sCo_Precio);
            cstmt.setString(9, sTipo_Imp);
            cstmt.setString(10, sTipo_Imp2);
            cstmt.setString(11, sTipo_Imp3);
            cstmt.setDouble(12, deTotal_Art);
            cstmt.setString(13, deSTotal_Art);
            cstmt.setString(14, dePrec_Vta);
            cstmt.setString(15, sPorc_Desc);
            cstmt.setString(16, deMonto_Desc);
            cstmt.setString(17, deReng_Neto);
            cstmt.setString(18, dePendiente);
            cstmt.setString(19, dePendiente2);
            cstmt.setString(20, deMonto_Desc_Glob);
            cstmt.setString(21, deMonto_reca_Glob);
            cstmt.setString(22, deOtros1_glob);
            cstmt.setString(23, deOtros2_glob);
            cstmt.setString(24, deOtros3_glob);
            cstmt.setString(25, deMonto_imp_afec_glob);
            cstmt.setString(26, deMonto_imp2_afec_glob);
            cstmt.setString(27, deMonto_imp3_afec_glob);
            cstmt.setString(28, sTipo_Doc);
            // cstmt.setString(29, gRowguid_Doc);
            cstmt.setString(29, sNum_Doc);
            cstmt.setString(30, dePorc_Imp);
            cstmt.setString(31, dePorc_Imp2);
            cstmt.setString(32, dePorc_Imp3);
            cstmt.setString(33, deMonto_Imp);
            cstmt.setString(34, deMonto_Imp2);
            cstmt.setString(35, deMonto_Imp3);
            cstmt.setString(36, deOtros);
            cstmt.setString(37, deTotal_Dev);
            cstmt.setString(38, deMonto_Dev);
            cstmt.setString(39, sComentario);
            cstmt.setString(40, sDis_Cen);
            cstmt.setString(41, sCo_Sucu_In);
            cstmt.setString(42, sCo_Us_In);
            cstmt.setString(43, sREVISADO);
            cstmt.setString(44, sTRASNFE);
            cstmt.setString(45, sMaquina);
            // cstmt.setString(46, lote_asignado);

            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public int pEliminarRenglonesFacturaVenta(
            String sDoc_NumOri,
            int iReng_NumOri,
            String sCo_Us_Mo,
            String sMaquina,
            String sCo_Sucu_Mo
    ) {
        try {

            cstmt = con.prepareCall("{CAll pEliminarRenglonesFacturaVenta("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");

            cstmt.setString(1, sDoc_NumOri);
            cstmt.setInt(2, iReng_NumOri);
            cstmt.setString(3, sMaquina);
            cstmt.setString(4, sCo_Us_Mo);
            cstmt.setString(5, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return resultado;
    }

    public ArrayList<FacturaVentaBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {

        ArrayList<FacturaVentaBO> lista = new ArrayList<>();
        try {

            cstmt = con.prepareCall("{CALL pObtenerListadoDatos("
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
                FacturaVentaBO facturaVentaBO = new FacturaVentaBO();
                facturaVentaBO.setDoc_num(rs.getString("doc_num"));
                facturaVentaBO.setCo_cli(rs.getString("co_cli"));
                facturaVentaBO.setDescripcionCliente(Utilitarios.Utilitario.getTablaId(con, "saCliente", "co_cli", "cli_des", rs.getString("co_cli")));

                facturaVentaBO.setFec_emis(rs.getString("fec_emis"));
                facturaVentaBO.setTotal_bruto(rs.getString("total_bruto"));
                facturaVentaBO.setSaldo(rs.getString("saldo"));
                facturaVentaBO.setAnulado(rs.getString("anulado"));
                facturaVentaBO.setCampo1(rs.getString("campo1"));
                facturaVentaBO.setCampo2(rs.getString("Campo2"));
                facturaVentaBO.setCampo3(rs.getString("campo3"));
                facturaVentaBO.setCampo4(rs.getString("Campo4"));
                facturaVentaBO.setCampo5(rs.getString("campo5"));
                facturaVentaBO.setCampo6(rs.getString("Campo6"));
                facturaVentaBO.setCampo7(rs.getString("Campo7"));
                facturaVentaBO.setCampo8(rs.getString("Campo8"));
                facturaVentaBO.setCo_cond(rs.getString("co_cond"));
                facturaVentaBO.setDescripcionCodPago(Utilitarios.Utilitario.getTablaId(con, "saCondicionPago", "co_cond", "cond_des", rs.getString("co_cond")));

                facturaVentaBO.setCo_cta_ingr_egr(rs.getString("co_cta_ingr_egr"));
                facturaVentaBO.setCo_mone(rs.getString("co_mone"));
                facturaVentaBO.setDescripcionMoneda(Utilitarios.Utilitario.getTablaId(con, "saMoneda", "co_mone", "mone_des", rs.getString("co_mone")));
                //   facturaVentaBO.setTasaMoneda(modeloMoneda.pObtenerFechaTasa(rs.getString(rs.getString("co_mone")).replaceAll("\\s", ""), Utilitarios.Utilitario.optenerfecha(new Date())).toString());
                facturaVentaBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                facturaVentaBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                facturaVentaBO.setCo_tran(rs.getString("co_tran"));
                facturaVentaBO.setDescripciontransporte(Utilitarios.Utilitario.getTablaId(con, "saTransporte", "co_tran", "des_tran", rs.getString("co_tran")));

                facturaVentaBO.setCo_us_in(rs.getString("co_us_in"));
                facturaVentaBO.setCo_us_mo(rs.getString("co_us_mo"));
                facturaVentaBO.setCo_ven(rs.getString("co_ven"));
                facturaVentaBO.setDescripcionVendedor(Utilitarios.Utilitario.getTablaId(con, "saVendedor", "co_ven", "ven_des", rs.getString("co_ven")));

                facturaVentaBO.setComentario(rs.getString("comentario"));
                facturaVentaBO.setContrib(rs.getString("contrib"));
                facturaVentaBO.setDescrip(rs.getString("descrip"));
                facturaVentaBO.setDir_ent(rs.getString("dir_ent"));
                facturaVentaBO.setDis_cen(rs.getString("dis_cen"));
                facturaVentaBO.setFe_us_in(rs.getString("fe_us_in"));
                facturaVentaBO.setFe_us_mo(rs.getString("fe_us_mo"));
                // facturaVentaBO.setFec_emis(rs.getString("fec_emis"));
                facturaVentaBO.setFec_reg(rs.getString("fec_reg"));
                facturaVentaBO.setFec_venc(rs.getString("fec_venc"));
                facturaVentaBO.setFeccom(rs.getString("feccom"));
                facturaVentaBO.setImp_nro_z(rs.getString("imp_nro_z"));
                facturaVentaBO.setImpfis(rs.getString("impfis"));
                facturaVentaBO.setImpfisfac(rs.getString("impfisfac"));
                facturaVentaBO.setImpresa(rs.getString("impresa"));
                facturaVentaBO.setMonto_desc_glob(rs.getString("monto_desc_glob"));
                facturaVentaBO.setMonto_imp(rs.getString("monto_imp"));
                facturaVentaBO.setMonto_imp2(rs.getString("monto_imp2"));
                facturaVentaBO.setMonto_imp3(rs.getString("monto_imp3"));
                facturaVentaBO.setMonto_reca(rs.getString("monto_reca"));
                facturaVentaBO.setN_control(rs.getString("n_control"));
                facturaVentaBO.setNumcom(rs.getString("numcom"));
                facturaVentaBO.setOtros1(rs.getString("otros1"));
                facturaVentaBO.setOtros2(rs.getString("otros2"));
                facturaVentaBO.setOtros3(rs.getString("otros3"));
                facturaVentaBO.setPorc_desc_glob(rs.getString("porc_desc_glob"));
                facturaVentaBO.setPorc_reca(rs.getString("porc_reca"));
                facturaVentaBO.setRevisado(rs.getString("revisado"));
                //facturaVentaBO.setRowguid(rs.getString("rowguid");
                facturaVentaBO.setSalestax(rs.getString("salestax"));
                facturaVentaBO.setSeriales_s(rs.getString("seriales_s"));
                facturaVentaBO.setStatus(rs.getString("status"));
                facturaVentaBO.setTasa(rs.getString("tasa"));
                facturaVentaBO.setTotal_bruto(rs.getString("total_bruto"));
                facturaVentaBO.setTotal_neto(rs.getString("total_neto"));
                facturaVentaBO.setTrasnfe(rs.getString("trasnfe"));
                facturaVentaBO.setValidador(rs.getString("validador"));
                facturaVentaBO.setVen_ter(rs.getString("ven_ter"));

                lista.add(facturaVentaBO);

            }

        } catch (SQLException ex) {
            Logger.getLogger(FacturaVentaModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public boolean pExisteFacturaVentaRenglon(
            int rengNum,
            String doc_num,
            String co_art,
            String co_alm
    ) {
        Boolean bandera = false;
        try {

            cstmt = con.prepareCall("{CALL pExisteFacturaVentaRenglon("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            cstmt.setInt(1, rengNum);
            cstmt.setString(2, doc_num);
            cstmt.setString(3, co_art);
            cstmt.setString(4, co_alm);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                bandera = true;
            }
            return bandera;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bandera;
    }

    public ArrayList<FacturaVentaRengBO> pSeleccionarRenglonesFacturaVenta(String NumDocum) {
        ArrayList<FacturaVentaRengBO> lista = new ArrayList<FacturaVentaRengBO>();
        try {

            cstmt = con.prepareCall("{CALL pSeleccionarRenglonesFacturaVenta("
                    + "?"
                    + ")}");
            cstmt.setString(1, NumDocum);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                FacturaVentaRengBO facturaVentaRengBO = new FacturaVentaRengBO();

                facturaVentaRengBO.setReng_num(rs.getInt("reng_num"));
                facturaVentaRengBO.setCo_alma(rs.getString("co_alma"));
                facturaVentaRengBO.setCo_art(rs.getString("co_art"));
                facturaVentaRengBO.setTotal_art(rs.getInt("total_art"));
                facturaVentaRengBO.setCo_precio(rs.getDouble("co_precio"));
                facturaVentaRengBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                facturaVentaRengBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                facturaVentaRengBO.setComentario(rs.getString("comentario"));
                facturaVentaRengBO.setDes_art(rs.getString("des_art"));
                facturaVentaRengBO.setDis_cen(rs.getString("dis_cen"));
                facturaVentaRengBO.setDoc_num(rs.getString("doc_num"));

                facturaVentaRengBO.setMonto_desc(rs.getDouble("monto_desc"));
                facturaVentaRengBO.setMonto_desc_glob(rs.getDouble("monto_desc_glob"));
                facturaVentaRengBO.setMonto_dev(rs.getDouble("monto_dev"));
                facturaVentaRengBO.setMonto_imp(rs.getDouble("monto_imp"));
                facturaVentaRengBO.setMonto_imp2(rs.getDouble("monto_imp2"));
                facturaVentaRengBO.setMonto_imp2_afec_glob(rs.getDouble("monto_imp2_afec_glob"));
                facturaVentaRengBO.setMonto_imp3(rs.getDouble("monto_imp3"));
                facturaVentaRengBO.setMonto_imp_afec_glob(rs.getDouble("monto_imp_afec_glob"));
                facturaVentaRengBO.setMonto_reca_glob(rs.getDouble("monto_reca_glob"));
                facturaVentaRengBO.setTipo_imp(rs.getString("tipo_imp"));
                facturaVentaRengBO.setPrec_vta(rs.getDouble("prec_vta"));
                facturaVentaRengBO.setPrec_vta_om(rs.getDouble("prec_vta_om"));
                facturaVentaRengBO.setReng_neto(rs.getDouble("reng_neto"));
                facturaVentaRengBO.setCo_uni(rs.getString("co_uni"));
                facturaVentaRengBO.setPorc_imp(rs.getDouble("porc_imp"));

                // rs.getDouble("monto_desc"));
                lista.add(facturaVentaRengBO);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static void main(String arg[]) {
        FacturaVentaModelo m = new FacturaVentaModelo();
        int resulta = 0;
//       ArrayList<FacturaVentaBO> lista = m.pObtenerListadoDatos("Admin_A", "saFacturaVenta", "co_cli", "", "2");
//        System.out.println("LIST=A" + lista.get(0).getCo_cli());

//        Boolean bandera = m.pExisteFacturaVentaRenglon(1, "otro", "999", "VAL");
//        System.out.println("BANDERA :::" + bandera);
        int re = m.pStockActualizar("VAL", "7593255000312", "uni", "500", "DES", "0", "0");
//  m.pStockActualizar("001", "0101002", "uni", "22", "ACT", "1", "0");
        System.out.println("Model.FacturaVentaModelo.main()" + re);
//           ArrayList<FacturaVentaRengBO>  lista =   m.pSeleccionarRenglonesFacturaVenta("55");
//           
//           System.out.println("Lista " + lista.get(0).getNum_doc());
        // resulta = m.pEliminarRenglonesFacturaVenta("xxx", 1, "999", "local", "VAL");
        /*  resulta = m.pActualizarRenglonesFacturaVenta(
                3, //@iReng_Num
                "WEE", // sDoc_Num,
                3,// @iReng_NumOri
                "WEE",//sDoc_NumOri,
                "ARTICULO",// sCo_Art,
                "  ACTUAKLUAAAA   ",//sDes_Art,
                "mar", //sCo_Alma,
                "uni", // sCo_Uni,
                "uni", //sSco_Uni,
                "44", //sCo_Precio,
                "1",// sTipo_Imp,
                "",//sTipo_Imp2,
                "", //sTipo_Imp3,
                0, //@deTotal_Art
                0,//@deSTotal_Art
                0,//@dePrec_Vta
                "14", //@sPorc_Desc
                0, //@deMonto_Desc
                4, // @deReng_Neto
                0, //@dePendiente
                "344", //sTipo_Doc, 
                "344",//sNum_Doc,
                0,//@dePorc_Imp
                0,//@dePorc_Imp2
                0,//@dePorc_Imp3
                0, //@deMonto_Imp
                0, // @deMonto_Imp2
                0, //@deMonto_Imp3
                0,//@deOtros
                0, //@deOtros1_Glob
                0,//@deOtros2_Glob
                0,//@deOtros3_Glob
                0,//@deTotal_Dev
                0,//@deMonto_Dev
                "Comentario", //sComentario,
                0,//@dePendiente2
                0, //@deMonto_desc_glob
                0,//@deMonto_reca_glob
                0,//@deMonto_imp_afec_glob
                0,//@deMonto_imp2_afec_glob
                0, //@deMonto_imp3_afec_glob
                "0", //sDis_Cen,
                "SUCU",//sCo_Sucu_Mo,
                "999",//sCo_Us_Mo,
                "0",//sREVISADO,
                "0", //sTRASNFE,
                "Locaaaaaal",//sMaquina, 
                "campo" //sCampos
        );*/
//        System.out.println("resultado Actualizado   ::  " + resulta);
        /* int resul= m.pActualizarFacturaVenta(
             "55",//sDoc_Num, 
            "55", //sDoc_NumOri, 
            "Descripcion ",//sDescrip,
            "CoClie" , //sCo_Cli, 
            "23" ,// sCo_Tran,
            "BSS",//sCo_Mone, 
             "",// sCo_Cta_Ingr_Egr, 
            "89" ,//sCo_Ven, 
            "22",//sCo_Cond, 
             "20211001",//sdFec_Emis, 
             "20211002",//sdFec_Venc, 
             "20211003",//sdFec_Reg, 
            "02", //bAnulado, 
            "AC" ,// sStatus, 
             "400" , //deTasa, 
            "233" ,//sN_Control, 
            "4" ,// sNro_Doc,
            "0" ,//sPorc_Desc_Glob, 
            "23" ,//deMonto_Desc_Glob,
            "22" , // sPorc_Reca, 
            "33" , //deMonto_Reca, 
            "44" ,//deSaldo, 
            "223",// deTotal_Bruto, 
            "44" ,//deMonto_Imp, 
            "55" ,//deMonto_Imp2, 
            "66" ,//deMonto_Imp3, 
            "77" ,//deOtros1, 
            "88" ,//deOtros2, 
            "99" , //deOtros3, 
            "100" ,//deTotal_Neto, 
            "203" , //sComentario, 
            "dir_Ent" ,// sDir_Ent, 
            "1" , //bContrib, 
            "1", //bImpresa, 
            "2", //sSalestax, 
            "3" ,//sImpfis, 
            "4" , //sImpfisfac, 
            "0" , //bVen_Ter, 
            "" ,//sDis_Cen, 
            "",//sCampo1,
            "",//sCampo2, 
            "",//sCampo3, 
            "",//sCampo4, 
            "",//sCampo5, 
            "",//sCampo6, 
            "",//sCampo7, 
            "",//sCampo8, 
            "999",//sCo_Us_Mo, 
            "VAL",//sCo_Sucu_Mo, 
            "1", //sRevisado, 
            "1",//sTrasnfe, 
            "Local" ,//sMaquina, 
            "ca" //sCampos
    ) ;*/
 /*  int resul = m.pEliminarFacturaVenta(
                "12", // sDoc_NumOri,
                "local", // sMaquina, 
                "999", //sCo_Us_Mo, 
                "999" //sCo_Sucu_Mo
        );*/
        //Ejemplo de utilizar este metodo de Programacion 
        //	List<Map<String, Object>> respuesta = null;
    }
}
