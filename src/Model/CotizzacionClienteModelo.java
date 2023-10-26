/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Beans.CotizacionClienteBO;
import Beans.CotizacionClienteRengBO;
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
 * @author EArana
 */
public class CotizzacionClienteModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public CotizzacionClienteModelo() {
        con = conexion.conexions();
    }

    public int pInsertarCotizacionCliente(
            String sDoc_Num,
            String sDescrip,
            String sCo_Cli,
            String sCo_Cta_Ingr_Egr,
            String sCo_Tran,
            String sCo_Mone,
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
            cstmt = con.prepareCall("{CALL pInsertarCotizacionCliente("
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
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?)}");

            cstmt.setString(1, sDoc_Num);
            cstmt.setString(2, sDescrip);
            cstmt.setString(3, sCo_Cli);
            cstmt.setString(4, sCo_Cta_Ingr_Egr);
            cstmt.setString(5, sCo_Tran);
            cstmt.setString(6, sCo_Mone);
            cstmt.setString(7, sCo_Ven);
            cstmt.setString(8, sCo_Cond);
            cstmt.setString(9, sdFec_Emis);
            cstmt.setString(10, sdFec_Venc);
            cstmt.setString(11, sdFec_Reg);
            cstmt.setString(12, bAnulado);
            cstmt.setString(13, sStatus);
            cstmt.setString(14, deTasa);
            cstmt.setString(15, sN_Control);
            cstmt.setString(16, sNro_Doc);
            cstmt.setString(17, sPorc_Desc_Glob);
            cstmt.setString(18, deMonto_Desc_Glob);
            cstmt.setString(19, sPorc_Reca);
            cstmt.setString(20, deMonto_Reca);
            cstmt.setString(21, deSaldo);
            cstmt.setString(22, deTotal_Bruto);
            cstmt.setString(23, deMonto_Imp);
            cstmt.setString(24, deMonto_Imp2);
            cstmt.setString(25, deMonto_Imp3);
            cstmt.setString(26, deOtros1);
            cstmt.setString(27, deOtros2);
            cstmt.setString(28, deOtros3);
            cstmt.setString(29, deTotal_Neto);
            cstmt.setString(30, sDis_Cen);
            cstmt.setString(31, sComentario);
            cstmt.setString(32, sDir_Ent);
            cstmt.setString(33, bContrib);
            cstmt.setString(34, bImpresa);
            cstmt.setString(35, sSalestax);
            cstmt.setString(36, sImpfis);
            cstmt.setString(37, sImpfisfac);
            cstmt.setString(38, bVen_Ter);
            cstmt.setString(39, sCampo1);
            cstmt.setString(40, sCampo2);
            cstmt.setString(41, sCampo3);
            cstmt.setString(42, sCampo4);
            cstmt.setString(43, sCampo5);
            cstmt.setString(44, sCampo6);
            cstmt.setString(45, sCampo7);
            cstmt.setString(46, sCampo8);
            cstmt.setString(47, sCo_Us_In);
            cstmt.setString(48, sCo_Sucu_In);
            cstmt.setString(49, sRevisado);
            cstmt.setString(50, sTrasnfe);
            cstmt.setString(51, sMaquina);

            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CotizzacionClienteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }
    //INSERTAR DATOS EN LOS RENGLONES pInsertarRenglonesCotizacionCliente

    public int pInsertarRenglonesCotizacionCliente(
            int iReng_Num,
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
            Double deSTotal_Art,
            Double dePrec_Vta,
            String sPorc_Desc,
            Double sdeMonto_Desc,
            Double sdeReng_Neto,
            Double sdePendiente,
            Double sdePendiente2,
            Double sdeMonto_Desc_Glob,
            Double sdeMonto_reca_Glob,
            Double sdeOtros1_glob,
            Double sdeOtros2_glob,
            Double sdeOtros3_glob,
            Double sdeMonto_imp_afec_glob,
            Double sdeMonto_imp2_afec_glob,
            Double sdeMonto_imp3_afec_glob,
            String sTipo_Doc,
            //Double sgRowguid_Doc,
            String sNum_Doc,
            Double dePorc_Imp,
            Double dePorc_Imp2,
            Double dePorc_Imp3,
            Double deMonto_Imp,
            Double deMonto_Imp2,
            Double deMonto_Imp3,
            Double deOtros,
            Double deTotal_Dev,
            Double deMonto_Dev,
            String sComentario,
            String sDis_Cen,
            String sCo_Sucu_In,
            String sCo_Us_In,
            String sREVISADO,
            String sTRASNFE,
            String sMaquina
    ) {
        try {
            cstmt = con.prepareCall("{CALL pInsertarRenglonesCotizacionCliente("
                    + "?,"
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
                    + "?,?,"
                    + "?,?)}");
            cstmt.setInt(1, iReng_Num);
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
            cstmt.setDouble(13, deSTotal_Art);
            cstmt.setDouble(14, dePrec_Vta);
            cstmt.setString(15, sPorc_Desc);
            cstmt.setDouble(16, sdeMonto_Desc);
            cstmt.setDouble(17, sdeReng_Neto);
            cstmt.setDouble(18, sdePendiente);
            cstmt.setDouble(19, sdePendiente2);
            cstmt.setDouble(20, sdeMonto_Desc_Glob);
            cstmt.setDouble(21, sdeMonto_reca_Glob);
            cstmt.setDouble(22, sdeOtros1_glob);
            cstmt.setDouble(23, sdeOtros2_glob);
            cstmt.setDouble(24, sdeOtros3_glob);
            cstmt.setDouble(25, sdeMonto_imp_afec_glob);
            cstmt.setDouble(26, sdeMonto_imp2_afec_glob);
            cstmt.setDouble(27, sdeMonto_imp3_afec_glob);
            //   cstmt.setDouble(28, sgRowguid_Doc);
            cstmt.setString(28, sTipo_Doc);
            cstmt.setString(29, sNum_Doc);
            cstmt.setDouble(30, dePorc_Imp);
            cstmt.setDouble(31, dePorc_Imp2);
            cstmt.setDouble(32, dePorc_Imp3);
            cstmt.setDouble(33, deMonto_Imp);
            cstmt.setDouble(34, deMonto_Imp2);
            cstmt.setDouble(35, deMonto_Imp3);
            cstmt.setDouble(36, deOtros);
            cstmt.setDouble(37, deTotal_Dev);
            cstmt.setDouble(38, deMonto_Dev);
            cstmt.setString(39, sComentario);
            cstmt.setString(40, sDis_Cen);
            cstmt.setString(41, sCo_Sucu_In);
            cstmt.setString(42, sCo_Us_In);
            cstmt.setString(43, sREVISADO);
            cstmt.setString(44, sTRASNFE);
            cstmt.setString(45, sMaquina);

            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    public int pActualizarCotizacionCliente(
            String sDoc_Num,
            String sDoc_NumOri,
            String sDescrip,
            String sCo_Cli,
            String sCo_Cta_Ingr_Egr,
            String sCo_Tran,
            String sCo_Mone,
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
            String deMonto_reca,
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
            String sCampos
    ) {
//53
        try {
            cstmt = con.prepareCall("{CALL pActualizarCotizacionCliente("
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
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?)}");

            cstmt.setString(1, sDoc_Num);
            cstmt.setString(2, sDoc_NumOri);
            cstmt.setString(3, sDescrip);
            cstmt.setString(4, sCo_Cli);
            cstmt.setString(5, sCo_Cta_Ingr_Egr);
            cstmt.setString(6, sCo_Tran);
            cstmt.setString(7, sCo_Mone);
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
            cstmt.setString(21, deMonto_reca);
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
            cstmt.setString(53, sCampos);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CotizzacionClienteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pEliminarCotizacionCliente(
            String sDoc_NumOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarCotizacionCliente("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + " )}");

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

    public int pEliminarRenglonesCotizacionCliente(
            String sDoc_NumOri,
            int iReng_NumOri,
            String sCo_Us_Mo,
            String sMaquina,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarRenglonesCotizacionCliente("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + "  )}");
            cstmt.setString(1, sDoc_NumOri);
            cstmt.setInt(2, iReng_NumOri);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sMaquina);
            cstmt.setString(5, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    public ArrayList<CotizacionClienteBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<CotizacionClienteBO> lista = new ArrayList<>();
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
                CotizacionClienteBO cotizacionClienteBO = new CotizacionClienteBO();
                cotizacionClienteBO.setAnulado(rs.getInt("anulado"));
                cotizacionClienteBO.setCampo1(rs.getString("campo1"));
                cotizacionClienteBO.setCampo2(rs.getString("Campo2"));
                cotizacionClienteBO.setCampo3(rs.getString("Campo3"));
                cotizacionClienteBO.setCampo4(rs.getString("Campo4"));
                cotizacionClienteBO.setCampo5(rs.getString("Campo5"));
                cotizacionClienteBO.setCampo6(rs.getString("Campo6"));
                cotizacionClienteBO.setCampo7(rs.getString("Campo7"));
                cotizacionClienteBO.setCampo8(rs.getString("Campo8"));
                cotizacionClienteBO.setCo_cli(rs.getString("co_cli"));
                cotizacionClienteBO.setCo_cond(rs.getString("co_cond"));
                cotizacionClienteBO.setCo_cta_ingr_egr(rs.getString("co_cta_ingr_egr"));
                cotizacionClienteBO.setCo_mone(rs.getString("co_mone"));
                cotizacionClienteBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                cotizacionClienteBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                cotizacionClienteBO.setCo_tran(rs.getString("co_tran"));
                cotizacionClienteBO.setCo_us_in(rs.getString("co_us_in"));
                cotizacionClienteBO.setCo_us_mo(rs.getString("co_us_mo"));
                cotizacionClienteBO.setCo_ven(rs.getString("co_ven"));
                cotizacionClienteBO.setComentario(rs.getString("comentario"));
                cotizacionClienteBO.setContrib(rs.getInt("contrib"));
                cotizacionClienteBO.setDir_ent(rs.getString("dir_ent"));
                cotizacionClienteBO.setDoc_num(rs.getString("doc_num"));
                cotizacionClienteBO.setFe_us_in(rs.getString("fe_us_in"));
                cotizacionClienteBO.setFe_us_mo(rs.getString("fe_us_in"));
                cotizacionClienteBO.setFec_emis(rs.getString("fec_emis"));
                cotizacionClienteBO.setFec_reg(rs.getString("fec_reg"));
                cotizacionClienteBO.setFec_venc(rs.getString("fec_venc"));
                cotizacionClienteBO.setFeccom(rs.getString("feccom"));
                cotizacionClienteBO.setImpfis(rs.getString("Impfis"));
                cotizacionClienteBO.setImpfisfac(rs.getString("Impfisfac"));
                cotizacionClienteBO.setImpresa(rs.getInt("Impresa"));
                cotizacionClienteBO.setMonto_desc_glob(rs.getDouble("Monto_desc_glob"));
                cotizacionClienteBO.setMonto_imp(rs.getDouble("monto_imp"));
                cotizacionClienteBO.setMonto_imp2(rs.getDouble("monto_imp2"));
                cotizacionClienteBO.setMonto_imp3(rs.getDouble("monto_imp3"));
                cotizacionClienteBO.setMonto_reca(rs.getDouble("monto_reca"));
                cotizacionClienteBO.setN_control(rs.getString("n_control"));
                cotizacionClienteBO.setNumcom(rs.getInt("numcom"));
                cotizacionClienteBO.setOtros1(rs.getDouble("otros1"));
                cotizacionClienteBO.setOtros2(rs.getDouble("otros2"));
                cotizacionClienteBO.setOtros3(rs.getDouble("otros3"));
//              cotizacionClienteBO.setPorc_desc_glob(rs.getDouble("Porc_desc_glob"));
                cotizacionClienteBO.setPorc_reca(rs.getString("Porc_reca"));
                cotizacionClienteBO.setRevisado(rs.getString("Revisado"));
                cotizacionClienteBO.setSaldo(rs.getDouble("Saldo"));
                cotizacionClienteBO.setSalestax(rs.getString("Salestax"));
                cotizacionClienteBO.setSeriales_s(rs.getInt("seriales_s"));
                cotizacionClienteBO.setStatus(rs.getString("status"));
                cotizacionClienteBO.setTasa(rs.getDouble("tasa"));
                cotizacionClienteBO.setTotal_bruto(rs.getDouble("Total_bruto"));
                cotizacionClienteBO.setTotal_neto(rs.getDouble("Total_neto"));
                cotizacionClienteBO.setTrasnfe(rs.getString("trasnfe"));
                cotizacionClienteBO.setVen_ter(rs.getInt("Ven_ter"));
                cotizacionClienteBO.setDescrip(rs.getString("descrip"));
                cotizacionClienteBO.setDescripcionCodPago(Utilitarios.Utilitario.getTablaId(con, "saCondicionPago", "co_cond", "cond_des", rs.getString("co_cond")));
                cotizacionClienteBO.setDescripcionMoneda(Utilitarios.Utilitario.getTablaId(con, "saMoneda", "co_mone", "mone_des", rs.getString("co_mone")));
                cotizacionClienteBO.setDescripciontransporte(Utilitarios.Utilitario.getTablaId(con, "saTransporte", "co_tran", "des_tran", rs.getString("co_tran")));
                cotizacionClienteBO.setDescripcionCliente(Utilitarios.Utilitario.getTablaId(con, "saCliente", "co_cli", "cli_des", rs.getString("co_cli")));
                cotizacionClienteBO.setDescripcionVendedor(Utilitarios.Utilitario.getTablaId(con, "saVendedor", "co_ven", "ven_des", rs.getString("co_ven")));

                lista.add(cotizacionClienteBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FacturaVentaModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public ArrayList<CotizacionClienteRengBO> pSeleccionarRenglonesCotizacionCliente(String NumDocum) {
        ArrayList<CotizacionClienteRengBO> lista = new ArrayList<>();
        try {
            cstmt = con.prepareCall("{CALL pSeleccionarRenglonesCotizacionCliente("
                    + "?"
                    + ")}");
            cstmt.setString(1, NumDocum);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                CotizacionClienteRengBO cotizacionClienteRengBO = new CotizacionClienteRengBO();
                cotizacionClienteRengBO.setCo_alma(rs.getString("co_alma"));
                cotizacionClienteRengBO.setCo_art(rs.getString("co_art"));
                cotizacionClienteRengBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                cotizacionClienteRengBO.setDes_art(rs.getString("des_art"));
                cotizacionClienteRengBO.setReng_neto(rs.getDouble("reng_neto"));
                cotizacionClienteRengBO.setCo_precio(rs.getString("co_precio"));
                cotizacionClienteRengBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                cotizacionClienteRengBO.setCo_uni(rs.getString("co_uni"));
                cotizacionClienteRengBO.setCo_us_in(rs.getString("co_us_in"));
                cotizacionClienteRengBO.setCo_us_mo(rs.getString("co_us_mo"));
                cotizacionClienteRengBO.setComentario(rs.getString("comentario"));
                cotizacionClienteRengBO.setDis_cen(rs.getString("dis_cen"));
                cotizacionClienteRengBO.setDoc_num(rs.getString("doc_num"));
                cotizacionClienteRengBO.setFe_us_in(rs.getString("fe_us_in"));
                cotizacionClienteRengBO.setFe_us_mo(rs.getString("fe_us_mo"));
                //   cotizacionClienteRengBO.setLote_asignado(rs.getInt("lote_asignado"));
                cotizacionClienteRengBO.setMonto_desc(rs.getDouble("monto_desc"));
                cotizacionClienteRengBO.setMonto_desc_glob(rs.getDouble("monto_desc_glob"));
                cotizacionClienteRengBO.setMonto_dev(rs.getDouble("monto_dev"));
                cotizacionClienteRengBO.setMonto_imp(rs.getDouble("monto_imp"));
                cotizacionClienteRengBO.setMonto_imp2(rs.getDouble("monto_imp2"));
                cotizacionClienteRengBO.setMonto_imp2_afec_glob(rs.getDouble("Monto_imp2_afec_glob"));
                cotizacionClienteRengBO.setMonto_imp3(rs.getDouble("Monto_imp3"));
                cotizacionClienteRengBO.setMonto_imp3_afec_glob(rs.getDouble("Monto_imp3_afec_glob"));
                cotizacionClienteRengBO.setMonto_imp_afec_glob(rs.getDouble("Monto_imp_afec_glob"));
                cotizacionClienteRengBO.setMonto_reca_glob(rs.getDouble("Monto_reca_glob"));
                cotizacionClienteRengBO.setNum_doc(rs.getString("num_doc"));
                cotizacionClienteRengBO.setOtros(rs.getDouble("Otros"));
                cotizacionClienteRengBO.setOtros1_glob(rs.getDouble("Otros1_glob"));
                cotizacionClienteRengBO.setOtros2_glob(rs.getDouble("Otros2_glob"));
                cotizacionClienteRengBO.setOtros3_glob(rs.getDouble("Otros3_glob"));
                cotizacionClienteRengBO.setPendiente(rs.getDouble("pendiente"));
                cotizacionClienteRengBO.setPendiente2(rs.getDouble("pendiente2"));
                cotizacionClienteRengBO.setPorc_desc(rs.getString("Porc_desc"));
                cotizacionClienteRengBO.setPorc_imp(rs.getDouble("Porc_imp"));
                cotizacionClienteRengBO.setPorc_imp2(rs.getDouble("Porc_imp2"));
                cotizacionClienteRengBO.setPorc_imp3(rs.getDouble("Porc_imp3"));
                cotizacionClienteRengBO.setPrec_vta(rs.getDouble("Prec_vta"));
                cotizacionClienteRengBO.setPrec_vta_om(rs.getDouble("Prec_vta_om"));
                cotizacionClienteRengBO.setReng_num(rs.getInt("reng_num"));
                cotizacionClienteRengBO.setRevisado(rs.getString("revisado"));
                cotizacionClienteRengBO.setSco_uni(rs.getString("Sco_uni"));
                cotizacionClienteRengBO.setStotal_art(rs.getInt("stotal_art"));
                cotizacionClienteRengBO.setTipo_doc(rs.getString("tipo_doc"));
                cotizacionClienteRengBO.setTipo_imp(rs.getString("tipo_imp"));
                cotizacionClienteRengBO.setTipo_imp2(rs.getString("tipo_imp2"));
                cotizacionClienteRengBO.setTipo_imp3(rs.getString("Tipo_imp3"));
                cotizacionClienteRengBO.setTotal_art(rs.getInt("Total_art"));
//                cotizacionClienteRengBO.setTotal_dev(rs.getDouble("toal_dev"));
                cotizacionClienteRengBO.setTrasnfe(rs.getString("trasnfe"));
                lista.add(cotizacionClienteRengBO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static void main(String arg[]) {

        CotizzacionClienteModelo m = new CotizzacionClienteModelo();
        int resultado = m.pInsertarRenglonesCotizacionCliente(
                0,//iReng_Num
                "sDoc_Num", //sDoc_Num,
                "sCo_Art",// sCo_Art,
                "DESDE",//sDes_Art
                "sCo_Uni", // sCo_Uni,
                "sSco_Uni", //sSco_Uni,
                "VAL",// sCo_Alma,
                "sCo_Precio",//sCo_Precio,
                "T",//  sTipo_Imp,
                "2",//sTipo_Imp2,
                "3",//sTipo_Imp3,
                2.2,//deTotal_Art 
                1.1,//deSTotal_Art 
                1.2,//   dePrec_Vta,
                "",//sPorc_Desc,
                3.3, //sdeMonto_Desc,
                3.3, //sdeReng_Neto,
                1.1, //sdePendiente,
                1.2, //sdePendiente2,
                1.1, //sdeMonto_Desc_Glob,
                1.1,// sdeMonto_reca_Glob,
                1.1,//sdeOtros1_glob,
                1.1,//sdeOtros2_glob,
                1.1,//sdeOtros3_glob,
                1.1,//sdeMonto_imp_afec_glob,
                1.1,//sdeMonto_imp2_afec_glob,
                1.1,//sdeMonto_imp3_afec_glob,
                "",// sTipo_Doc,
                "NUMDOC", // sNum_Doc,
                1.1,//dePorc_Imp,
                1.0, //dePorc_Imp2,
                1.0,// dePorc_Imp3,
                1.0,//deMonto_Imp ,
                1.0,//deMonto_Imp2,
                1.0,//deMonto_Imp3,
                1.0,//deOtros,
                1.0,//deTotal_Dev,
                1.0,//deMonto_Dev ,
                "Comentario ",// sComentario,
                null, // sDis_Cen,
                "VAL", //sCo_Sucu_In,
                "999", //sCo_Us_In,
                "1",//sREVISADO,
                "2", // sTRASNFE,
                " LOCAL" //sMaquina
        );
        System.out.println("RESUl   " + resultado);
    }

}
