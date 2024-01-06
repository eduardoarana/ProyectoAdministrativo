/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.SaAjustesBO;
import Beans.SaAjusteRengBO;
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
 * @author earana
 */
public class AjusteESModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public AjusteESModel() {
        con = conexion.conexions();
    }

    public int pInsertarAjusteEntradaSalida(
            String sAjue_Num,
            String sCo_Mone,
            String sMotivo,
            String sdFecha,
            String deTasa,
            String bAnulado,
            String sCo_InvFisico,
            String deAux01,
            String sAux02,
            String sDis_Cen,
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
            cstmt = con.prepareCall("{CALL pInsertarAjusteEntradaSalida("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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
            cstmt.setString(1, sAjue_Num);
            cstmt.setString(2, sCo_Mone);
            cstmt.setString(3, sMotivo);
            cstmt.setString(4, sdFecha);
            cstmt.setString(5, deTasa);
            cstmt.setString(6, bAnulado);
            cstmt.setString(7, sCo_InvFisico);
            cstmt.setString(8, deAux01);
            cstmt.setString(9, sAux02);
            cstmt.setString(10, sDis_Cen);
            cstmt.setString(11, sCampo1);
            cstmt.setString(12, sCampo2);
            cstmt.setString(13, sCampo3);
            cstmt.setString(14, sCampo4);
            cstmt.setString(15, sCampo5);
            cstmt.setString(16, sCampo6);
            cstmt.setString(17, sCampo7);
            cstmt.setString(18, sCampo8);
            cstmt.setString(19, sCo_Us_In);
            cstmt.setString(20, sCo_Sucu_In);
            cstmt.setString(21, sMaquina);
            cstmt.setString(22, sRevisado);
            cstmt.setString(23, sTrasnfe);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    /*exec pInsertarRenglonesAjusteEntradaSalida 
    @sAjue_num="0012",
    @sCo_Tipo="E01",
    @sCo_Art="0101003",
    @sCo_Alma="VAL",
    @sdis_cen=NULL,
    @detotal_art=2,
    @destotal_art=0,
    @deCost_Unit=190.000000,
    @sCo_Uni="UNI",
    @sSco_Uni=NULL,
    @decosto_adi1=0,
    @decosto_adi2=0,
    @decosto_adi3=0,
    @iRENG_NUM=2,
    @sREVISADO=NULL,
    @sTRASNFE=NULL,
    @sco_sucu_in="01",
    @sco_us_in="PROFIT",
    @sMaquina="DESKTOP-HQ8AFPL"
     */
    public int pInsertarRenglonesAjusteEntradaSalida(
            String sAjue_Num,
            String iReng_Num,
            String sCo_Tipo,
            String sCo_Art,
            String sCo_Alma,
            String sCo_Uni,
            String sSco_Uni,
            String sDis_cen,
            String deTotal_Art,
            String deStotal_Art,
            String deCost_Unit,
            String deCosto_Adi1,
            String deCosto_Adi2,
            String deCosto_Adi3,
            String sCo_Us_In,
            String sMaquina,
            String sCo_Sucu_In,
            String sRevisado,
            String sTrasnfe
    ) {
        try {
            cstmt = con.prepareCall("{CALL pInsertarRenglonesAjusteEntradaSalida("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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

            cstmt.setString(1, sAjue_Num);
            cstmt.setString(2, iReng_Num);
            cstmt.setString(3, sCo_Tipo);
            cstmt.setString(4, sCo_Art);
            cstmt.setString(5, sCo_Alma);
            cstmt.setString(6, sCo_Uni);
            cstmt.setString(7, sSco_Uni);
            cstmt.setString(8, sDis_cen);
            cstmt.setString(9, deTotal_Art);
            cstmt.setString(10, deStotal_Art);
            cstmt.setString(11, deCost_Unit);
            cstmt.setString(12, deCosto_Adi1);
            cstmt.setString(13, deCosto_Adi2);
            cstmt.setString(14, deCosto_Adi3);
            cstmt.setString(15, sCo_Us_In);
            cstmt.setString(16, sMaquina);
            cstmt.setString(17, sCo_Sucu_In);
            cstmt.setString(18, sRevisado);
            cstmt.setString(19, sTrasnfe);

            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultado;
    }

    public int pActualizarAjusteEntradaSalida(
            String sAjue_Num,
            String sAjue_NumOri,
            String sdFecha,
            String sMotivo,
            String deTasa,
            String sCo_Mone,
            String sDis_Cen,
            String bAnulado,
            String sCo_InvFisico,
            String deAux01,
            String sAux02,
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
            String tsValidador
    ) {
        int validador = 0x0000000000086C44;
        System.out.println("validador ::" + validador);

        System.out.println("pActualizarAjusteEntradaSalida()" + tsValidador);

        try {
            cstmt = con.prepareCall("{CAll pActualizarAjusteEntradaSalida("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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
            cstmt.setString(1, sAjue_Num);
            cstmt.setString(2, sAjue_NumOri);
            cstmt.setString(3, sdFecha);
            cstmt.setString(4, sMotivo);
            cstmt.setString(5, deTasa);
            cstmt.setString(6, sCo_Mone);
            cstmt.setString(7, sDis_Cen);
            cstmt.setString(8, bAnulado);
            cstmt.setString(9, sCo_InvFisico);
            cstmt.setString(10, deAux01);
            cstmt.setString(11, sAux02);
            cstmt.setString(12, sCampo1);
            cstmt.setString(13, sCampo2);
            cstmt.setString(14, sCampo3);
            cstmt.setString(15, sCampo4);
            cstmt.setString(16, sCampo5);
            cstmt.setString(17, sCampo6);
            cstmt.setString(18, sCampo7);
            cstmt.setString(19, sCampo8);
            cstmt.setString(20, sCo_Us_Mo);
            cstmt.setString(21, sCo_Sucu_Mo);
            cstmt.setString(22, sMaquina);
            cstmt.setString(23, sCampos);
            cstmt.setString(24, sRevisado);
            cstmt.setString(25, sTrasnfe);
            cstmt.setInt(26, 0x0000000000086C44);

            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AjusteESModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pActualizarRenlonesLoteSalida(
            String gRowguid_Reng,
            String gRowguid_RengOri,
            String iReng_num,
            String iReng_numOri,
            String sTipo_Doc,
            String sCo_Art,
            String sCo_Alma,
            String sNumero_Lote,
            String gRowguid_Lote,
            String deCantidad,
            String dePrecio,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo,
            String sMaquina,
            String sCampos,
            String sRevisado,
            String sTrasnfe
    ) {
        try {
            cstmt = con.prepareCall("{CAll pActualizarRenlonesLoteSalida("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
        } catch (SQLException ex) {
            Logger.getLogger(AjusteESModel.class.getName()).log(Level.SEVERE, null, ex);

        }
        return resultado;
    }

    public int pEliminarAjusteEntradaSalida(
            String sAjue_NumOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CAll pEliminarAjusteEntradaSalida("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");

            cstmt.setString(1, sAjue_NumOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(AjusteESModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pEliminarRenglonesAjusteEntradaSalida(
            String sAjue_NumOri,
            String iReng_NumOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CAll pEliminarRenglonesAjusteEntradaSalida("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");

            cstmt.setString(1, sAjue_NumOri);
            cstmt.setString(2, iReng_NumOri);
            cstmt.setString(3, sMaquina);
            cstmt.setString(4, sCo_Us_Mo);
            cstmt.setString(5, sCo_Sucu_Mo);

            resultado = cstmt.executeUpdate();

            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(AjusteESModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado = 0;
    }

    public ArrayList<SaAjustesBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<SaAjustesBO> lista = new ArrayList<>();
        try {
            cstmt = con.prepareCall("{CAll pObtenerListadoDatos("
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
                SaAjustesBO saAjusteBO = new SaAjustesBO();
                saAjusteBO.setAjue_num(rs.getString("Ajue_num"));
                saAjusteBO.setFecha(rs.getString("fecha"));
                saAjusteBO.setMotivo(rs.getString("motivo"));
                saAjusteBO.setCo_mone(rs.getString("co_mone"));
                saAjusteBO.setTasa(rs.getString("tasa"));
                saAjusteBO.setSeriales_s(rs.getString("seriales_s"));
                saAjusteBO.setSeriales_e(rs.getString("seriales_e"));
                saAjusteBO.setFeccom(rs.getString("feccom"));
                saAjusteBO.setNumcom(rs.getString("numcom"));
                saAjusteBO.setAnulado(rs.getString("anulado"));
                saAjusteBO.setCo_invfisico(rs.getString("co_invfisico"));
                saAjusteBO.setAux01(rs.getString("aux01"));
                saAjusteBO.setAux02(rs.getString("aux02"));
                saAjusteBO.setDis_cen(rs.getString("dis_cen"));
                saAjusteBO.setCampo1(rs.getString("campo1"));
                saAjusteBO.setCampo2(rs.getString("campo2"));
                saAjusteBO.setCampo3(rs.getString("campo3"));
                saAjusteBO.setCampo4(rs.getString("campo4"));
                saAjusteBO.setCampo5(rs.getString("campo5"));
                saAjusteBO.setCampo6(rs.getString("campo6"));
                saAjusteBO.setCampo7(rs.getString("campo7"));
                saAjusteBO.setCampo8(rs.getString("campo8"));
                saAjusteBO.setCo_us_in(rs.getString("co_us_in"));
                saAjusteBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                saAjusteBO.setFe_us_in(rs.getString("fe_us_in"));
                saAjusteBO.setCo_us_mo(rs.getString("co_us_mo"));
                saAjusteBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                saAjusteBO.setFe_us_mo(rs.getString("fe_us_mo"));
                saAjusteBO.setRevisado(rs.getString("revisado"));
                saAjusteBO.setTrasnfe(rs.getString("trasnfe"));
                saAjusteBO.setValidador(rs.getString("validador"));
                lista.add(saAjusteBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AjusteESModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public ArrayList<SaAjusteRengBO> pSeleccionarRenglonesAjusteEntradaSalida(String sAjue_Num) {
        ArrayList<SaAjusteRengBO> lista = new ArrayList<>();
        try {
            cstmt = con.prepareCall("{CAll pSeleccionarRenglonesAjusteEntradaSalida("
                    + "?"
                    + ")}");
            cstmt.setString(1, sAjue_Num);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                SaAjusteRengBO saAjusteRengBO = new SaAjusteRengBO();
                saAjusteRengBO.setAjue_num(rs.getString("Ajue_num"));
                saAjusteRengBO.setArt_des(rs.getString("art_des"));
                saAjusteRengBO.setCo_alma(rs.getString("co_alma"));
                saAjusteRengBO.setCo_art(rs.getString("co_art"));
                saAjusteRengBO.setDis_cen(rs.getString("dis_cen"));
                saAjusteRengBO.setFe_us_in(rs.getString("fe_us_in"));
                saAjusteRengBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                saAjusteRengBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                saAjusteRengBO.setCost_unit(rs.getString("cost_unit"));
                saAjusteRengBO.setCo_tipo(rs.getString("co_tipo"));
                saAjusteRengBO.setCosto_adi1(rs.getString("costo_adi1"));
                saAjusteRengBO.setCosto_adi2(rs.getString("costo_adi2"));
                saAjusteRengBO.setCosto_adi3(rs.getString("costo_adi3"));
                saAjusteRengBO.setLote_asignado(rs.getString("lote_asignado"));
                saAjusteRengBO.setReng_num(rs.getString("reng_num"));
                saAjusteRengBO.setRevisado(rs.getString("revisado"));
                saAjusteRengBO.setSco_uni(rs.getString("sco_uni"));
                saAjusteRengBO.setCo_uni(rs.getString("co_uni"));
                saAjusteRengBO.setStotal_art(rs.getString("stotal_art"));
                saAjusteRengBO.setCantidad(rs.getString("total_art"));

                saAjusteRengBO.setTipo_trans(rs.getString("tipo_trans"));
                saAjusteRengBO.setTotal_art(rs.getString("total_art"));
                saAjusteRengBO.setTrasnfe(rs.getString("trasnfe"));

                lista.add(saAjusteRengBO);

            }

        } catch (SQLException ex) {
            Logger.getLogger(AjusteESModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

   
    public static void main(String arg[]) {
//        String valor = "000000000008647C";
//
        AjusteESModel m = new AjusteESModel();
//        int resulta = m.pEliminarAjusteEntradaSalida("32", "9999", "9999", "12345");
//        
//         System.out.println(" Resultado :: " + resulta + " Valor ;  " + valor);
//        
        int resulta = m.pActualizarAjusteEntradaSalida(
                "nuevo",
                "nuevo",
                "2025-02-02",
                "descrip Actualizacion ",
                "1",
                "BSF",
                null,
                "0",
                "1",
                null,
                null,
                "campo1",
                "camp2",
                "campo3",
                "campo4",
                "campo5555",
                "campo6",
                "campo7",
                "campo8",
                "999",
                "sucu",
                "maquina",
                "wewe",
                "1",
                "0",
                //tsValidador
                ""
        );
          System.out.println(" Resultado :: " + resulta + " Valor ;  ");
//
//       
//
    }
}
