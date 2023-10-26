/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.FacturaCompraBO;
import Beans.FacturaCompraRengBO;
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
public class FacturaCompraModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public FacturaCompraModelo() {
        con = conexion.conexions();
    }

    public int pInsertarFacturaCompra(
            String sDoc_Num,
            String sNro_Fact,
            String sDescrip,
            String sCo_Prov,
            String sCo_Cta_Ingr_Egr,
            String sCo_Mone,
            String sCo_Cond,
            String sN_Control,
            String sPorc_Desc_Glob,
            String sdFec_Emis,
            String sdFec_Venc,
            String sdFec_Reg,
            int bAnulado,
            String sStatus,
            double deTasa,
            String sPorc_Reca,
            double deSaldo,
            double deTotal_Bruto,
            double deTotal_Neto,
            double deMonto_Desc_Glob,
            double deMonto_Reca,
            double deOtros1,
            double deOtros2,
            double deOtros3,
            double deMonto_Imp,
            double deMonto_Imp2,
            double deMonto_Imp3,
            String sDir_Ent,
            String sComentario,
            int bImpresa,
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
            int bNac
    ) {
        try {
            cstmt = con.prepareCall("{CALL pInsertarFacturaCompra("
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
                    + "?,?,?,?"
                    + ") }");
            cstmt.setString(1, sDoc_Num);
            cstmt.setString(2, sNro_Fact);
            cstmt.setString(3, sDescrip);
            cstmt.setString(4, sCo_Prov);
            cstmt.setString(5, sCo_Cta_Ingr_Egr);
            cstmt.setString(6, sCo_Mone);
            cstmt.setString(7, sCo_Cond);
            cstmt.setString(8, sN_Control);
            cstmt.setString(9, sPorc_Desc_Glob);
            cstmt.setString(10, sdFec_Emis);
            cstmt.setString(11, sdFec_Venc);
            cstmt.setString(12, sdFec_Reg);
            cstmt.setInt(13, bAnulado);
            cstmt.setString(14, sStatus);
            cstmt.setDouble(15, deTasa);
            cstmt.setString(16, sPorc_Reca);
            cstmt.setDouble(17, deSaldo);
            cstmt.setDouble(18, deTotal_Bruto);
            cstmt.setDouble(19, deTotal_Neto);
            cstmt.setDouble(20, deMonto_Desc_Glob);
            cstmt.setDouble(21, deMonto_Reca);
            cstmt.setDouble(22, deOtros1);
            cstmt.setDouble(23, deOtros2);
            cstmt.setDouble(24, deOtros3);
            cstmt.setDouble(25, deMonto_Imp);
            cstmt.setDouble(26, deMonto_Imp2);
            cstmt.setDouble(27, deMonto_Imp3);
            cstmt.setString(28, sDir_Ent);
            cstmt.setString(29, sComentario);
            cstmt.setInt(30, bImpresa);
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
            cstmt.setInt(46, bNac);

            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FacturaCompraModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public int pInsertarRenglonesFacturaCompra(
            int iReng_Num,
            String sDoc_Num,
            String sCo_Art,
            String sDes_Art,
            String sCo_Uni,
            String sSCo_Uni,
            String sCo_Alma,
            String sTipo_Imp,
            String sTipo_Imp2,
            String sTipo_Imp3,
            String sTipo_Doc,
            String sPorc_Desc,
            String sNum_Doc,
            // String gRowGuid_Doc,
            double deReng_Neto,
            double deCost_Unit,
            double deCost_Unit_OM,
            int deTotal_Art,
            int deSTotal_Art,
            double deOtros,
            double dePorc_Imp,
            double dePorc_Imp2,
            double dePorc_Imp3,
            double deMonto_Imp,
            double deMonto_Imp2,
            double deMonto_Imp3,
            double dePorc_Gas,
            double deTotal_Dev,
            double deMonto_Dev,
            double dePendiente2,
            String sComentario,
            int bLote_Asignado,
            double deMonto_Desc_Glob,
            double deMonto_reca_Glob,
            double deOtros1_glob,
            double deOtros2_glob,
            double deOtros3_glob,
            double deMonto_imp_afec_glob,
            double deMonto_imp2_afec_glob,
            double deMonto_imp3_afec_glob,
            double deMonto_Desc,
            double dePendiente,
            int iReng_Doc,
            String sDis_Cen,
            String sCo_Sucu_In,
            String sCo_Us_In,
            String sRevisado,
            String sTrasnfe,
            String sMaquina,
            double deCosto_Adi1,
            double deCosto_Adi2,
            double deCosto_Adi3,
            String sCredito_fiscal
    ) {

        try {
            cstmt = con.prepareCall("{CAll pInsertarRenglonesFacturaCompra("
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
                    + "?,"//
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
            cstmt.setString(3, sCo_Art);
            cstmt.setString(4, sDes_Art);
            cstmt.setString(5, sCo_Uni);
            cstmt.setString(6, sSCo_Uni);
            cstmt.setString(7, sCo_Alma);
            cstmt.setString(8, sTipo_Imp);
            cstmt.setString(9, sTipo_Imp2);
            cstmt.setString(10, sTipo_Imp3);
            cstmt.setString(11, sTipo_Doc);
            cstmt.setString(12, sPorc_Desc);
            cstmt.setString(13, sNum_Doc);
            cstmt.setDouble(14, deReng_Neto);
            cstmt.setDouble(15, deCost_Unit);
            cstmt.setDouble(16, deCost_Unit_OM);
            cstmt.setInt(17, deTotal_Art);
            cstmt.setDouble(18, deSTotal_Art);
            cstmt.setDouble(19, deOtros);
            cstmt.setDouble(20, dePorc_Imp);
            cstmt.setDouble(21, dePorc_Imp2);
            cstmt.setDouble(22, dePorc_Imp3);
            cstmt.setDouble(23, deMonto_Imp);
            cstmt.setDouble(24, deMonto_Imp2);
            cstmt.setDouble(25, deMonto_Imp3);
            cstmt.setDouble(26, dePorc_Gas);
            cstmt.setDouble(27, deTotal_Dev);
            cstmt.setDouble(28, deMonto_Dev);
            cstmt.setDouble(29, dePendiente2);
            cstmt.setString(30, sComentario);
            cstmt.setInt(31, bLote_Asignado);
            cstmt.setDouble(32, deMonto_Desc_Glob);
            cstmt.setDouble(33, deMonto_reca_Glob);
            cstmt.setDouble(34, deOtros1_glob);
            cstmt.setDouble(35, deOtros2_glob);
            cstmt.setDouble(36, deOtros3_glob);
            cstmt.setDouble(37, deMonto_imp_afec_glob);
            cstmt.setDouble(38, deMonto_imp2_afec_glob);
            cstmt.setDouble(39, deMonto_imp3_afec_glob);
            cstmt.setDouble(40, deMonto_Desc);
            cstmt.setDouble(41, dePendiente);
            cstmt.setInt(42, iReng_Doc);
            cstmt.setString(43, sDis_Cen);
            cstmt.setString(44, sCo_Sucu_In);
            cstmt.setString(45, sCo_Us_In);
            cstmt.setString(46, sRevisado);
            cstmt.setString(47, sTrasnfe);
            cstmt.setString(48, sMaquina);
            cstmt.setDouble(49, deCosto_Adi1);
            cstmt.setDouble(50, deCosto_Adi2);
            cstmt.setDouble(51, deCosto_Adi3);
            cstmt.setString(52, sCredito_fiscal);
            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
         //   Logger.getLogger(FacturaCompraModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pActualizarFacturaCompra(
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
            double deTasa,
            double deSaldo,
            double deTotal_Bruto,
            double deTotal_Neto,
            double deMonto_Desc_Glob,
            double deMonto_Reca,
            double deOtros1,
            double deOtros2,
            double deOtros3,
            double deMonto_Imp,
            double deMonto_Imp2,
            double deMonto_Imp3,
            int bAnulado,
            int bImpresa,
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
            //String tsValidador,
            //String sCampos,
            //  int gRowguid,
            int bNac
    ) {
        try {
            cstmt = con.prepareCall("{CALL pActualizarFacturaCompra("
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
                    + ") }");

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
            cstmt.setString(14, sdFec_Venc);
            cstmt.setString(15, sdFec_Reg);
            cstmt.setDouble(16, deTasa);
            cstmt.setDouble(17, deSaldo);
            cstmt.setDouble(18, deTotal_Bruto);
            cstmt.setDouble(19, deTotal_Neto);
            cstmt.setDouble(20, deMonto_Desc_Glob);
            cstmt.setDouble(21, deMonto_Reca);
            cstmt.setDouble(22, deOtros1);
            cstmt.setDouble(23, deOtros2);
            cstmt.setDouble(24, deOtros3);
            cstmt.setDouble(25, deMonto_Imp);
            cstmt.setDouble(26, deMonto_Imp2);
            cstmt.setDouble(27, deMonto_Imp3);
            cstmt.setInt(28, bAnulado);
            cstmt.setInt(29, bImpresa);
            cstmt.setString(30, sSalestax);
            cstmt.setString(31, sDis_Cen);
            cstmt.setString(32, sDir_Ent);
            cstmt.setString(33, sComentario);
            cstmt.setString(34, sCampo1);
            cstmt.setString(35, sCampo2);
            cstmt.setString(36, sCampo3);
            cstmt.setString(37, sCampo4);
            cstmt.setString(38, sCampo5);
            cstmt.setString(39, sCampo6);
            cstmt.setString(40, sCampo7);
            cstmt.setString(41, sCampo8);
            cstmt.setString(42, sCo_Us_Mo);
            cstmt.setString(43, sCo_Sucu_Mo);
            cstmt.setString(44, sRevisado);
            cstmt.setString(45, sTrasnfe);
            cstmt.setString(46, sMaquina);
            cstmt.setInt(47, bNac);

            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FacturaCompraModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pEliminarFacturaCompra(
            String sDoc_NumOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CAll pEliminarFacturaCompra("
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
            Logger.getLogger(FacturaCompraModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<FacturaCompraBO> pOptenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<FacturaCompraBO> lista = new ArrayList<FacturaCompraBO>();
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
                FacturaCompraBO facturaCompraBO = new FacturaCompraBO();
                facturaCompraBO.setDoc_num(rs.getString("doc_num"));
                facturaCompraBO.setCo_prov(rs.getString("co_prov"));
                facturaCompraBO.setFec_emis(rs.getString("fec_emis"));
                facturaCompraBO.setMonto_imp(rs.getDouble("monto_imp"));
                facturaCompraBO.setSaldo(rs.getDouble("saldo"));
                facturaCompraBO.setNro_fact(rs.getString("nro_fact"));
                facturaCompraBO.setAnulado(rs.getInt("anulado"));
                facturaCompraBO.setCampo1(rs.getString("campo1"));
                facturaCompraBO.setCampo2(rs.getString("campo2"));
                facturaCompraBO.setCampo3(rs.getString("campo3"));
                facturaCompraBO.setCampo4(rs.getString("campo4"));
                facturaCompraBO.setCampo5(rs.getString("campo5"));
                facturaCompraBO.setCampo6(rs.getString("campo6"));
                facturaCompraBO.setCampo7(rs.getString("campo7"));
                facturaCompraBO.setCampo8(rs.getString("campo8"));
                facturaCompraBO.setCo_cond(rs.getString("co_cond"));
                facturaCompraBO.setCo_cta_ingr_egr(rs.getString("co_cta_ingr_egr"));
                facturaCompraBO.setCo_mone(rs.getString("co_mone"));
                facturaCompraBO.setCo_prov(rs.getString("co_prov"));
                facturaCompraBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                facturaCompraBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                facturaCompraBO.setCo_us_in(rs.getString("co_us_in"));
                facturaCompraBO.setCo_us_mo(rs.getString("co_us_mo"));
                facturaCompraBO.setComentario(rs.getString("comentario"));
                facturaCompraBO.setDescrip(rs.getString("descrip"));
                facturaCompraBO.setDir_ent(rs.getString("dir_ent"));
                facturaCompraBO.setDis_cen(rs.getString("dis_cen"));
                facturaCompraBO.setFe_us_in(rs.getDate("fe_us_in"));
                facturaCompraBO.setFe_us_mo(rs.getDate("fe_us_mo"));
                facturaCompraBO.setFec_reg(rs.getString("fec_reg"));
                facturaCompraBO.setFec_venc(rs.getString("fec_venc"));
                facturaCompraBO.setFeccom(rs.getDate("feccom"));
                facturaCompraBO.setImpresa(rs.getInt("impresa"));
                facturaCompraBO.setMonto_desc_glob(rs.getDouble("monto_desc_glob"));
                facturaCompraBO.setMonto_imp(rs.getDouble("monto_imp"));
                facturaCompraBO.setMonto_imp2(rs.getDouble("monto_imp2"));
                facturaCompraBO.setMonto_imp3(rs.getDouble("monto_imp3"));
                facturaCompraBO.setMonto_reca(rs.getDouble("monto_reca"));
                facturaCompraBO.setN_control(rs.getString("n_control"));
                facturaCompraBO.setNac(rs.getInt("nac"));
                facturaCompraBO.setNumcom(rs.getInt("numcom"));
                facturaCompraBO.setOtros1(rs.getDouble("otros1"));
                facturaCompraBO.setOtros2(rs.getInt("otros2"));
                facturaCompraBO.setOtros3(rs.getInt("otros3"));
                facturaCompraBO.setPorc_desc_glob(rs.getString("porc_desc_glob"));
                facturaCompraBO.setPorc_reca(rs.getString("porc_reca"));
                facturaCompraBO.setRevisado(rs.getString("revisado"));
                facturaCompraBO.setSalestax(rs.getString("salestax"));
                facturaCompraBO.setSeriales_e(rs.getInt("seriales_e"));
                facturaCompraBO.setStatus(rs.getString("status"));
                facturaCompraBO.setTasa(rs.getDouble("tasa"));
                facturaCompraBO.setTotal_bruto(rs.getDouble("total_bruto"));
                facturaCompraBO.setTotal_neto(rs.getDouble("total_neto"));
                facturaCompraBO.setTrasnfe(rs.getString("trasnfe"));
                facturaCompraBO.setDescripciopnCodicionPago(Utilitarios.Utilitario.getTablaId(con, "saCondicionPago", "co_cond", "cond_des", rs.getString("co_cond")));
                facturaCompraBO.setDescripcionMoneda(Utilitarios.Utilitario.getTablaId(con, "saMoneda", "co_mone", "mone_des", rs.getString("co_mone")));
                facturaCompraBO.setDescripcionProveedor(Utilitarios.Utilitario.getTablaId(con, "saProveedor", "co_prov", "prov_des", rs.getString("co_prov")));
                 


                // facturaCompraBO.setFec_emis(fec_emis);
                lista.add(facturaCompraBO);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return lista;

    }
    
     public ArrayList<FacturaCompraRengBO> pSeleccionarRenglonesFacturaCompra(String NumDocum) {
         
         ArrayList<FacturaCompraRengBO> lista = new ArrayList<>();
         try {
         cstmt = con.prepareCall("{CALL pSeleccionarRenglonesFacturaCompra("
                    + "?"
                    + ")}");
            cstmt.setString(1, NumDocum);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                FacturaCompraRengBO compraRengBO = new FacturaCompraRengBO();
                compraRengBO.setReng_num(rs.getInt("reng_num"));
                compraRengBO.setCo_alma(rs.getString("co_alma"));
                compraRengBO.setCo_art(rs.getString("co_art"));
                compraRengBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                compraRengBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                compraRengBO.setCo_uni(rs.getString("co_uni"));
                compraRengBO.setCo_us_in(rs.getString("co_us_in"));
                compraRengBO.setCo_us_mo(rs.getString("co_us_mo"));
                compraRengBO.setComentario(rs.getString("comentario"));
                compraRengBO.setCost_unit(rs.getDouble("cost_unit"));
                compraRengBO.setCost_unit_om(rs.getDouble("cost_unit"));
                compraRengBO.setCosto_adi1(rs.getDouble("costo_adi1"));
                compraRengBO.setCosto_adi2(rs.getDouble("costo_adi2"));
                compraRengBO.setCosto_adi3(rs.getDouble("costo_adi3"));
                compraRengBO.setDes_art(rs.getString("des_art"));
                compraRengBO.setDoc_num(rs.getString("doc_num"));
                compraRengBO.setFe_us_in(rs.getString("fe_us_in"));
                compraRengBO.setFe_us_mo(rs.getString("fe_us_mo"));
                compraRengBO.setLote_asignado(rs.getInt("Lote_asignado"));
                compraRengBO.setMonto_desc(rs.getDouble("monto_desc"));
                compraRengBO.setMonto_desc_glob(rs.getDouble("monto_desc_glob"));
                compraRengBO.setMonto_dev(rs.getDouble("monto_dev"));
                compraRengBO.setMonto_imp(rs.getDouble("monto_imp"));
                compraRengBO.setMonto_imp2(rs.getDouble("monto_imp2"));
                compraRengBO.setMonto_imp3(rs.getDouble("monto_imp3"));
                compraRengBO.setMonto_imp2_afec_glob(rs.getDouble("monto_imp2_afec_glob"));
                compraRengBO.setMonto_imp3_afec_glob(rs.getDouble("monto_imp3_afec_glob"));
                compraRengBO.setMonto_imp_afec_glob(rs.getDouble("monto_imp_afec_glob"));
                compraRengBO.setMonto_reca_glob(rs.getDouble("monto_reca_glob"));
                compraRengBO.setNum_doc(rs.getString("num_doc"));
                compraRengBO.setOtros(rs.getDouble("otros"));
                compraRengBO.setOtros1_glob(rs.getDouble("otros1_glob"));
                compraRengBO.setOtros2_glob(rs.getDouble("otros2_glob"));
                compraRengBO.setOtros3_glob(rs.getDouble("otros3_glob"));
                compraRengBO.setPendiente(rs.getDouble("pendiente"));
                compraRengBO.setPendiente2(rs.getDouble("pendiente2"));
                compraRengBO.setPorc_desc(rs.getString("porc_desc"));
                compraRengBO.setPorc_gas(rs.getDouble("porc_gas"));
                compraRengBO.setPorc_imp(rs.getDouble("porc_imp"));
                compraRengBO.setPorc_imp2(rs.getDouble("porc_imp2"));
                compraRengBO.setPorc_imp3(rs.getDouble("porc_imp3"));
                compraRengBO.setReng_neto(rs.getDouble("reng_neto"));
                compraRengBO.setReng_num(rs.getInt("reng_num"));
                compraRengBO.setRevisado(rs.getString("revisado"));
                compraRengBO.setSco_uni(rs.getString("sco_uni"));
                compraRengBO.setStotal_art(rs.getDouble("stotal_art"));
                compraRengBO.setTipo_doc(rs.getString("tipo_doc"));
                compraRengBO.setTipo_imp(rs.getString("tipo_imp"));
                compraRengBO.setTipo_imp2(rs.getString("tipo_imp2"));
                compraRengBO.setTipo_imp3(rs.getString("tipo_imp3"));
                compraRengBO.setTotal_art(rs.getInt("total_art"));
                compraRengBO.setTotal_dev(rs.getDouble("total_dev"));
                compraRengBO.setTrasnfe(rs.getString("trasnfe"));
                
                lista.add(compraRengBO);
                
            }
         
         }catch(SQLException e){
         e.printStackTrace();
         }
         return lista ;
     }
    
    

    public static void main(String arg[]) {
        int resultado = 0;
        FacturaCompraModelo m = new FacturaCompraModelo();
        /*resultado = m.pInsertarFacturaCompra(
                "44",// sDoc_Num,
                "33",// sNro_Fact,
                "44", // sDescrip, 
                "55", // sCo_Prov, 
                "66", // sCo_Cta_Ingr_Egr, 
                "77", //sCo_Mone, 
                "34", //sCo_Cond, 
                "30", //sN_Control, 
                "33", // sPorc_Desc_Glob, 
                "20210102",// sdFec_Emis, 
                "20210102", // sdFec_Venc, 
                "20210102", //sdFec_Reg, 
                0,
                "A", ///  sStatus, 
                0,
                "", // sPorc_Reca, 
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                "", // sDir_Ent,
                "com ",//sComentario, 
                0,
                "sa", //sSalestax,
                "", //sDis_Cen, 
                "camp1", //sCampo1, 
                "ampo2", //sCampo2, 
                "campo3", //  sCampo3,
                "sCampo4", //sCampo4, 
                "sCampo5",//sCampo5, 
                "sCampo6",//sCampo6, 
                "sCampo7", //sCampo7,
                "sCampo8", //sCampo8, 
                "1", // sRevisado, 
                "2", //sTrasnfe,
                "999", //sCo_Us_In,
                "VAL", // sCo_Sucu_In,
                "local", // sMaquina,
                0
        );*/

        resultado = m.pInsertarRenglonesFacturaCompra(
                2,// resultado,
                "1222", // sDoc_Num,
                "Art", //sCo_Art,
                "12", //sDes_Art,
                "21", // sCo_Uni,
                "12", // sSCo_Uni, 
                "VAL", //sCo_Alma, 
                "23", //sTipo_Imp, 
                null, //sTipo_Imp2, 
                null, //sTipo_Imp3, 
                "tipo ",//sTipo_Doc,
                "3", //sPorc_Desc,
                "12", // sNum_Doc, 
                12,//@deReng_Neto
                4,//@deCost_Unit
                2,//@deCost_Unit_OM
                88,//@deTotal_Art
                4,//@deSTotal_Art
                44,//@deOtros
                12,//@dePorc_Imp
                2,//@dePorc_Imp2
                2,//@dePorc_Imp3
                3,//@deMonto_Imp
                5,//@deMonto_Imp2
                3,//@deMonto_Imp3
                2,//@dePorc_Gas
                9,//@deTotal_Dev
                2,//@deMonto_Dev
                2,//@dePendiente2
                "Comentario",//sComentario,
                45,//@bLote_Asignado
                5,//@deMonto_Desc_Glob
                56,// @@deMonto_reca_Glob
                77,//@deOtros1_glob
                89,//@deOtros2_glob
                56,//@deOtros3_glob
                65,//@deMonto_imp_afec_glob
                23,//@deMonto_imp2_afec_glob
                55,//@deMonto_imp3_afec_glob
                99,//@deMonto_Desc
                89,//@@dePendiente
                3,//@@iReng_Doc
                null,//sDis_Cen,
                "nu",// sCo_Sucu_In,
                "999",//sCo_Us_In,
                "1", //sRevisado,
                "1",//sTrasnfe,
                "LOCAL ",//sMaquina,
                5, //@deCosto_Adi1
                6, //@deCosto_Adi2
                5, //@deCosto_Adi3
                "4");

        System.out.println("Resulatdo  :: " + resultado);
    }
}
