/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ProveedorBO;
import Conection.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author earana
 */
public class ProveedorModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public ProveedorModel() {
        con = conexion.conexions();
    }

    public int pInsertarProveedor(
            String sCo_Prov,
            String sProv_des,
            String sCo_seg,
            String sCo_zon,
            String bInactivo,
            String  sDirec1,
            String sDirec2,
            String sTelefonos,
            String sFax ,
            String sRespons,
            String sdFecha_reg,
            String sTip_Pro,
            String deMont_cre,
            String sCo_Mone,
            String sCond_Pag,
            String iPlaz_pag,
            String deDesc_ppago,
            String deDesc_Glob,
            String sRif,
            String bNacional,
            String sDis_cen,
            String sNit,
            String sEmail,
            String sCo_Cta_Ingr_Egr,
            String sComentario,
            String iTipo_Adi,
            String sMatriz,
            String sCo_Tab,
            String sTipo_Per,
            String sCo_pais,
            String sCiudad,
            String sZip,
            String sFormType,
            String sTaxid,
            String bContribu_E,
            String bRete_Regis_Doc,
            String dePorc_Esp,
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
            String sTgasto,
            String sTComp,
            String sEmail_alterno,
            String  bSujeto_Obj_RetenISLR_Auto
         ) {
        
        try {
            cstmt = con.prepareCall(" {CALL pInsertarProveedor ("
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
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

            cstmt.setString(1, sCo_Prov);
            cstmt.setString(2, sProv_des);
            cstmt.setString(3, sCo_seg);   
            cstmt.setString(4, sCo_zon);
            cstmt.setString(5, bInactivo);
            cstmt.setString(6, sDirec1);
            cstmt.setString(7, sDirec2);
            cstmt.setString(8, sTelefonos);
            cstmt.setString(9, sFax);
            cstmt.setString(10, sRespons);
            cstmt.setString(11, sdFecha_reg);
            cstmt.setString(12, sTip_Pro);
            cstmt.setString(13, deMont_cre);
            cstmt.setString(14, sCo_Mone);
            cstmt.setString(15, sCond_Pag);
            cstmt.setString(16, iPlaz_pag);
            cstmt.setString(17, deDesc_ppago);
            cstmt.setString(18, deDesc_Glob);
            cstmt.setString(19, sRif);
            cstmt.setString(20, bNacional);
            cstmt.setString(21, sDis_cen);
            cstmt.setString(22, sNit);
            cstmt.setString(23, sEmail);
            cstmt.setString(24, sCo_Cta_Ingr_Egr);
            cstmt.setString(25, sComentario);
            cstmt.setString(26, iTipo_Adi);
            cstmt.setString(27, sMatriz);
            cstmt.setString(28, sCo_Tab);
            cstmt.setString(29, sTipo_Per);
            cstmt.setString(30, sCo_pais);
            cstmt.setString(31, sCiudad);
            cstmt.setString(32, sZip);
            cstmt.setString(33, sFormType);
            cstmt.setString(34, sTaxid);
            cstmt.setString(35, bContribu_E);
            cstmt.setString(36, bRete_Regis_Doc);
            cstmt.setString(37, dePorc_Esp);
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
            cstmt.setString(48, Utilitarios.Utilitario.nombreHost());
            cstmt.setString(49, sRevisado);
            cstmt.setString(50, sTrasnfe);
            cstmt.setString(51, "1");
            cstmt.setString(52, "3");
            cstmt.setString(53, sEmail_alterno);
            cstmt.setString(54, "0");
      

            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    
    
    
    public int pActualizarProveedor(
         String sCo_Prov,
         String sCo_ProvOri,
         String sProv_des,
         String sCo_seg,
         String sCo_zon,
         String bInactivo,
         String sDirec1,
         String sDirec2,
         String sTelefonos,
         String sFax,
         String sRespons,
         String sdFecha_reg,
         String sTip_Pro,
         String deMont_cre,
         String sCo_Mone,
         String sCond_Pag,
         String iPlaz_pag,
         String deDesc_ppago,
         String deDesc_Glob,
         String sRif,
         String bNacional,
         String sDis_cen,
         String sNit,
         String sEmail,
         String sCo_Cta_Ingr_Egr,
         String sComentario,
         String iTipo_Adi,
         String sMatriz,
         String sCo_Tab,
         String sTipo_Per,
         String sCo_pais,
         String sCiudad,
         String sZip,
         String sWebSite,
         String sFormType,
         String Taxid,
         String bContribu_E,
         String bRete_Regis_Doc,
         String dePorc_Esp,
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
         String sRevisado,
         String sTrasnfe,
         String sTgasto,
         String sTComp,
         String sEmail_alterno,
         String bSujeto_Obj_RetenISLR_Auto) {
        System.out.println("Actualizar Proveedor" + sCo_zon);

        try {

            cstmt = con.prepareCall("{ CALL  pActualizarProveedor("
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
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
            
            cstmt.setString(1, sCo_Prov);
            cstmt.setString(2, sCo_ProvOri);
            cstmt.setString(3, sProv_des);
            cstmt.setString(4, sCo_seg);
            cstmt.setString(5, sCo_zon);
            cstmt.setString(6, bInactivo);
            cstmt.setString(7, sDirec1);
            cstmt.setString(8, sDirec2);
            cstmt.setString(9, sTelefonos);
            cstmt.setString(10, sFax);
            cstmt.setString(11, sRespons);
            cstmt.setString(12, sdFecha_reg);
            cstmt.setString(13, sTip_Pro);
            cstmt.setString(14, deMont_cre);
            cstmt.setString(15, sCo_Mone);
            cstmt.setString(16, sCond_Pag);
            cstmt.setString(17, iPlaz_pag);
            cstmt.setString(18, deDesc_ppago);
            cstmt.setString(19, deDesc_Glob);
            cstmt.setString(20, sRif);
            cstmt.setString(21, bNacional);
            cstmt.setString(22, sDis_cen);
            cstmt.setString(23, sNit);
            cstmt.setString(24, sEmail);
            cstmt.setString(25, sCo_Cta_Ingr_Egr);
            cstmt.setString(26, sComentario);
            cstmt.setString(27, iTipo_Adi);
            cstmt.setString(28, sMatriz);
            cstmt.setString(29, sCo_Tab);
            cstmt.setString(30, sTipo_Per);
            cstmt.setString(31, sCo_pais);
            cstmt.setString(32, sCiudad);
            cstmt.setString(33, sZip);
            cstmt.setString(34, sWebSite);
            cstmt.setString(35, sFormType);
            cstmt.setString(36, Taxid);
            cstmt.setString(37, bContribu_E);
            cstmt.setString(38, bRete_Regis_Doc);
            cstmt.setString(39, dePorc_Esp);
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
            cstmt.setString(50, sMaquina);
            cstmt.setString(51, sRevisado);
            cstmt.setString(52, sTrasnfe);
           
            cstmt.setString(53, sTgasto);
            cstmt.setString(54, sTComp);
            cstmt.setString(55, sEmail_alterno);
            cstmt.setString(56, bSujeto_Obj_RetenISLR_Auto);
            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;

    }

    public int pEliminarProveedor(
         String sCo_ProvOri,
         String sMaquina,
         String sCo_Us_Mo,
         String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarProveedor("
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?"
                 + ")}");

            cstmt.setString(1, sCo_ProvOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    // exec pObtenerListadoDatosProveedor @sDatabase_Name=N'DEMOA',
//    @sField_Name=N'Prov_Des',@sValor=N'',@bAvanzada=0,@bUsaOperadorLogicoAND=1,
//         @bAplica_Inactivo=0,@bInactivo=0,@bAplica_Nacional=0,@bNacional=0,
//         @bAplica_Fecha=0,@dFecha_Desde='2020-09-11 00:00:00',@dFecha_Hasta='2020-09-11 00:00:00',@bAplica_Tipo=0,@sTipo=N'',
//         @bAplica_RIF=0,@sRIF=N'',@bAplica_Zona=0,@sTipo_Zona=N'',@bAplica_Segmento=0,@sSegmento=N'',@bAplica_Cta_ing=0,
    //     @sCta_ing=N'',@iOpcion=0
    public ArrayList<ProveedorBO> pObtenerListadoDatosProveedor(
         String Database_Name,
         String Field_Name,
         String sValor ,
         String bAvanzada,
         String bUsaOperadorLogicoAND,
         String bAplica_Inactivo ,
         String bInactivo ,
         String bAplica_Nacional ,
         String bNacional, 
         String bAplica_Fecha,
         String dFecha_Desde,
         String dFecha_Hasta,
         String bAplica_Tipo,
         String sTipo,
         String bAplica_RIF ,
         String sRIF ,
         String bAplica_Zona,
         String sTipo_Zona,
         String bAplica_Segmento,
         String sSegmento,
         String bAplica_Cta_ing,
         String sCta_ing,
         String iOpcion
    ) {
         
        ArrayList<ProveedorBO> lista = new ArrayList<ProveedorBO>();
        try {
            cstmt = con.prepareCall("{CALL pObtenerListadoDatosProveedor("
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
                 + "?,"
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
                cstmt.setString(1,Database_Name);
                cstmt.setString(2,Field_Name);
                cstmt.setString(3,sValor);
                cstmt.setString(4,bAvanzada);
                cstmt.setString(5,bUsaOperadorLogicoAND);
                cstmt.setString(6,bAplica_Inactivo);
                cstmt.setString(7,bInactivo);
                cstmt.setString(8,bAplica_Nacional);
                cstmt.setString(9,bNacional);
                cstmt.setString(10,bAplica_Fecha);
                cstmt.setString(11,dFecha_Desde);
                cstmt.setString(12,dFecha_Hasta);
                cstmt.setString(13,bAplica_Tipo);
                cstmt.setString(14,sTipo);
                cstmt.setString(15,bAplica_RIF);
                cstmt.setString(16,sRIF);
                cstmt.setString(17,bAplica_Zona);
                cstmt.setString(18,sTipo_Zona);
                cstmt.setString(19,bAplica_Segmento);
                cstmt.setString(20,sSegmento);
                cstmt.setString(21,bAplica_Cta_ing);
                cstmt.setString(22,sCta_ing);
                cstmt.setString(23,iOpcion);
                
           cstmt.execute();
           rs= cstmt.getResultSet();
            while (rs.next()){
                ProveedorBO proveedorBO = new ProveedorBO();
                proveedorBO.setCampo1(rs.getString("Campo1"));
                proveedorBO.setCampo2(rs.getString("Campo2"));
                proveedorBO.setCampo3(rs.getString("Campo3"));
                proveedorBO.setCampo4(rs.getString("Campo4"));
                proveedorBO.setCampo5(rs.getString("Campo5"));
                proveedorBO.setCampo6(rs.getString("Campo6"));
                proveedorBO.setCampo7(rs.getString("Campo7"));
                proveedorBO.setCampo8(rs.getString("Campo8"));
                proveedorBO.setCiudad(rs.getString("ciudad"));
                proveedorBO.setCo_cta_ingr_egr(rs.getString("co_cta_ingr_egr"));
                proveedorBO.setCo_mone(rs.getString("co_mone"));
                proveedorBO.setCo_pais(rs.getString("co_pais"));
                proveedorBO.setCo_prov(rs.getString("co_prov"));

                proveedorBO.setCo_seg(rs.getString("co_seg"));
                proveedorBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                proveedorBO.setCo_tab(rs.getString("co_tab"));
                proveedorBO.setCo_us_in(rs.getString("co_us_in"));
                proveedorBO.setCo_us_mo(rs.getString("co_us_mo"));
                proveedorBO.setCo_zon(rs.getString("co_zon"));
                proveedorBO.setComentario(rs.getString("comentario"));
                proveedorBO.setCond_pag(rs.getString("cond_pag"));
                proveedorBO.setContribu_e(rs.getString("contribu_e"));
                proveedorBO.setDesc_glob(rs.getString("desc_glob"));
                proveedorBO.setDesc_ppago(rs.getString("desc_ppago"));
                proveedorBO.setDirec1(rs.getString("direc1"));
                proveedorBO.setDirec2(rs.getString("direc2"));
                proveedorBO.setDis_cen(rs.getString("Dis_cen"));
                proveedorBO.setEmail(rs.getString("email"));
                proveedorBO.setEmail_alterno(rs.getString("email_alterno"));
                proveedorBO.setFax(rs.getString("fax"));
                proveedorBO.setFe_us_in(rs.getString("fe_us_in"));
                proveedorBO.setFe_us_mo(rs.getString("fe_us_mo"));
                proveedorBO.setFeccom(rs.getString("feccom"));
                proveedorBO.setFecha_reg(rs.getString("fecha_reg"));
                proveedorBO.setFormtype(rs.getString("formtype"));
                proveedorBO.setInactivo(rs.getString("inactivo"));
                proveedorBO.setMatriz(rs.getString("matriz"));
                proveedorBO.setMont_cre(rs.getString("mont_cre"));
                proveedorBO.setNacional(rs.getString("Nacional"));
                proveedorBO.setNit(rs.getString("nit"));
                proveedorBO.setNumcom(rs.getString("numcom"));
                proveedorBO.setPlaz_pag(rs.getString("plaz_pag"));
                proveedorBO.setPorc_esp(rs.getString("porc_esp"));
                proveedorBO.setProv_des(rs.getString("prov_des"));
                proveedorBO.setRespons(rs.getString("respons"));
                proveedorBO.setRete_regis_doc(rs.getString("rete_regis_doc"));
                proveedorBO.setRevisado(rs.getString("revisado"));
                proveedorBO.setRif(rs.getString("Rif"));
                proveedorBO.setSujeto_obj_retenISLR_auto(rs.getString("sujeto_obj_retenISLR_auto"));
                proveedorBO.setTaxid(rs.getString("taxid"));
                proveedorBO.setTelefonos(rs.getString("telefonos"));
                proveedorBO.setTip_pro(rs.getString("tip_pro"));
                proveedorBO.setTipo_adi(rs.getString("tipo_adi"));
                proveedorBO.setTipo_per(rs.getString("tipo_per"));
                proveedorBO.setTrasnfe(rs.getString("trasnfe"));
                proveedorBO.setValidador(rs.getString("validador"));
                proveedorBO.setWebsite(rs.getString("website"));
                proveedorBO.setZip(rs.getString("zip"));
                lista.add(proveedorBO);       
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }


}
//
