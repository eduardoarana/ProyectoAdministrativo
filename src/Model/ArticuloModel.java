/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ArticulosBO;
import Conection.Conexion;
import Utilitarios.Utilitario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author earana
 */
public class ArticuloModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;

    public ArticuloModel() {
        con = conexion.conexions();
    }

    public int pInsertarArticulo(
            String sCo_Art,
            String sdFecha_Reg,
            String sArt_Des,
            String sTipo,
            String bAnulado,
            String sdFecha_Inac,
            String sCo_Lin,
            String sCo_Subl,
            String sCo_Cat,
            String sCo_Color,
            String sCo_Ubicacion,
            String sItem,
            String sModelo,
            String sRef,
            String bGenerico,
            String bManeja_Serial,
            String bManeja_Lote,
            String bManeja_Lote_Venc,
            String deMargen_Min,
            String deMargen_Max,
            String sTipo_Imp,
            String sTipo_Imp2,
            String sTipo_Imp3,
            String sCo_Reten,
            String sCod_Proc,
            String sGarantia,
            String deVolumen,
            String dePeso,
            String deStock_Min,
            String deStock_Max,
            String deStock_Pedido,
            String iRelac_Unidad,
            String dePunt_Cli,
            String deLic_Mon_Ilc,
            String deLic_Capacidad,
            String deLic_Grado_Al,
            String sLic_Tipo,
            String bPrec_Om,
            String sComentario,
            String sTipo_Cos,
            String dePorc_Margen_Minimo,
            String dePorc_Margen_Maximo,
            String deMont_Comi,
            String dePorc_Arancel,
            String sI_Art_Des,
            String sDis_Cen,
            String sReten_Iva_Tercero,
            String sCampo1,
            String sCampo2,
            String sCo_Us_In,
            String sCo_Sucu_In) {
        int resultado = 0;

        try {

            cstmt = con.prepareCall("{CALL  pInsertarArticulo("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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
            //Conexion , Tabla , where ,columnaCod, Valor de la Where . Para Obtener el ID de una Tabla...   

            cstmt.setString(1, sCo_Art);
            cstmt.setString(2, sdFecha_Reg);
            cstmt.setString(3, sArt_Des);
            cstmt.setString(4, sTipo);
            cstmt.setString(5, bAnulado);
            cstmt.setString(6, sdFecha_Inac);
            cstmt.setString(7, Utilitario.getTablaId(con, "saLineaArticulo", "co_lin", "co_lin", sCo_Lin));
            cstmt.setString(8, Utilitario.getTablaId(con, "saSubLinea", "co_subl", "co_subl", sCo_Subl));
            cstmt.setString(9, Utilitario.getTablaId(con, "saCatArticulo", "co_cat", "co_cat", sCo_Cat));
            cstmt.setString(10, Utilitario.getTablaId(con, "sacolor", "co_color", "co_color", sCo_Color));
            cstmt.setString(11, Utilitario.getTablaId(con, "saUbicacion", "co_ubicacion", "co_ubicacion", sCo_Ubicacion));
            cstmt.setString(12, sItem);
            cstmt.setString(13, sModelo);
            cstmt.setString(14, sRef);
            cstmt.setString(15, bGenerico);
            cstmt.setString(16, bManeja_Serial);
            cstmt.setString(17, bManeja_Lote);
            cstmt.setString(18, bManeja_Lote_Venc);
            cstmt.setString(19, deMargen_Min);
            cstmt.setString(20, deMargen_Max);
            cstmt.setString(21, sTipo_Imp);
            cstmt.setString(22, sTipo_Imp2);
            cstmt.setString(23, sTipo_Imp3);
            cstmt.setString(24, sCo_Reten);
            cstmt.setString(25, sCod_Proc);
            cstmt.setString(26, sGarantia);
            cstmt.setString(27, deVolumen);
            cstmt.setString(28, dePeso);
            cstmt.setString(29, deStock_Min);
            cstmt.setString(30, deStock_Max);
            cstmt.setString(31, deStock_Pedido);
            cstmt.setString(32, iRelac_Unidad);
            cstmt.setString(33, dePunt_Cli);
            cstmt.setString(34, deLic_Mon_Ilc);
            cstmt.setString(35, deLic_Capacidad);
            cstmt.setString(36, deLic_Grado_Al);
            cstmt.setString(37, sLic_Tipo);
            cstmt.setString(38, bPrec_Om);
            cstmt.setString(39, sComentario);
            cstmt.setString(40, sTipo_Cos);
            cstmt.setString(41, dePorc_Margen_Minimo);
            cstmt.setString(42, dePorc_Margen_Maximo);
            cstmt.setString(43, deMont_Comi);
            cstmt.setString(44, dePorc_Arancel);
            cstmt.setString(45, sI_Art_Des);
            cstmt.setString(46, sDis_Cen);
            cstmt.setString(47, sReten_Iva_Tercero);
            cstmt.setString(48, sCampo1);
            cstmt.setString(49, sCampo2);
            cstmt.setString(50, sCo_Us_In);
            cstmt.setString(51, sCo_Sucu_In);

            resultado = cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }

        return resultado;
    }

    public int pEliminarArticulo(String co_art) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL pEliminarArticulo(?)}");
            cstmt.setString(1, co_art);
            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), e, "Software", JOptionPane.INFORMATION_MESSAGE);
        }
        return resultado;
    }

    // pActualizarArticulo
    public int pActualizarArticulo(
            String sCo_Art,
            String sCo_ArtOri,
            String sdFecha_Reg,
            String sArt_Des,
            String sTipo,
            String bAnulado,
            String sdFecha_Inac,
            String sCo_Lin,
            String sCo_Subl,
            String sCo_Cat,
            String sCo_Color,
            String sCo_Ubicacion,
            String Item,
            String sModelo,
            String sRef,
            String bGenerico,
            String bManeja_Serial,
            String bManeja_Lote,
            String bManeja_Lote_Venc,
            String deMargen_Min,
            String deMargen_Max,
            String sTipo_Imp,
            String sTipo_Imp2,
            String sTipo_Imp3,
            String sCo_Reten,
            String sCod_Proc,
            String sGarantia,
            String deVolumen,
            String dePeso,
            String deStock_Min,
            String deStock_Max,
            String deStock_Pedido,
            String iRelac_Unidad,
            String dePunt_Cli,
            String deLic_Mon_Ilc,
            String deLic_Capacidad,
            String deLic_Grado_Al,
            String sLic_Tipo,
            String bPrec_Om,
            String sComentario,
            String sTipo_Cos,
            String dePorc_Margen_Minimo,
            String dePorc_Margen_Maximo,
            String deMont_Comi,
            String dePorc_Arancel,
            String sI_Art_Des,
            String sDis_Cen,
            String sReten_Iva_Tercero,
            String sCampo1,
            String sCampo2,
            String sCo_Us_In,
            String sCo_Sucu_In,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL  pActualizarArticulo"
                    + "("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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
            cstmt.setString(1, sCo_Art);
            cstmt.setString(2, sCo_Art);
            cstmt.setString(3, sdFecha_Reg);
            cstmt.setString(4, sArt_Des);
            cstmt.setString(5, sTipo);
            cstmt.setString(6, bAnulado);
            cstmt.setString(7, sdFecha_Inac);
            cstmt.setString(8, Utilitario.getTablaId(con, "saLineaArticulo", "co_lin", "co_lin", sCo_Lin));
            cstmt.setString(9, Utilitario.getTablaId(con, "saSubLinea", "co_subl", "co_subl", sCo_Subl));
            cstmt.setString(10, Utilitario.getTablaId(con, "saCatArticulo", "co_cat", "co_cat", sCo_Cat));
            cstmt.setString(11, Utilitario.getTablaId(con, "sacolor", "co_color", "co_color", sCo_Color));
            cstmt.setString(12, Utilitario.getTablaId(con, "saUbicacion", "co_ubicacion", "co_ubicacion", sCo_Ubicacion));
            cstmt.setString(13, Item);
            cstmt.setString(14, sModelo);
            cstmt.setString(15, sRef);
            cstmt.setString(16, bGenerico);
            cstmt.setString(17, bManeja_Serial);
            cstmt.setString(18, bManeja_Lote);
            cstmt.setString(19, bManeja_Lote_Venc);
            cstmt.setString(20, deMargen_Min);
            cstmt.setString(21, deMargen_Max);
            cstmt.setString(22, sTipo_Imp);
            cstmt.setString(23, sTipo_Imp2);
            cstmt.setString(24, sTipo_Imp3);
            cstmt.setString(25, sCo_Reten);
            cstmt.setString(26, sCod_Proc);
            cstmt.setString(27, sGarantia);
            cstmt.setString(28, deVolumen);
            cstmt.setString(29, dePeso);
            cstmt.setString(30, deStock_Min);
            cstmt.setString(31, deStock_Max);
            cstmt.setString(32, deStock_Pedido);
            cstmt.setString(33, iRelac_Unidad);
            cstmt.setString(34, dePunt_Cli);
            cstmt.setString(35, deLic_Mon_Ilc);
            cstmt.setString(36, deLic_Capacidad);
            cstmt.setString(37, deLic_Grado_Al);
            cstmt.setString(38, sLic_Tipo);
            cstmt.setString(39, bPrec_Om);
            cstmt.setString(40, sComentario);
            cstmt.setString(41, sTipo_Cos);
            cstmt.setString(42, dePorc_Margen_Minimo);
            cstmt.setString(43, dePorc_Margen_Maximo);
            cstmt.setString(44, deMont_Comi);
            cstmt.setString(45, dePorc_Arancel);
            cstmt.setString(46, sI_Art_Des);
            cstmt.setString(47, sDis_Cen);
            cstmt.setString(48, sReten_Iva_Tercero);
            cstmt.setString(49, sCampo1);
            cstmt.setString(50, sCampo2);
            cstmt.setString(51, sCo_Us_In);
            cstmt.setString(52, sCo_Sucu_In);
            cstmt.setString(53, sCo_Us_Mo);
            cstmt.setString(54, sCo_Sucu_Mo);

            resultado = cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public ArrayList<ArticulosBO> pObtenerListadoDatosArticulos(
            String sDatabase_Name,
            String sField_Name,
            String sValor,
            String bAvanzada,
            String bUsaOperadorLogicoAND,
            String bAplica_Manejo_Lote,
            String sManeja_Lote,
            String bAplica_Manejo_Serial,
            String sManeja_Serial,
            String bAplica_EsInactivo,
            String sEsInactivo,
            String bAplica_Tipo,
            String sTipo,
            String bAplica_Co_Lin,
            String sCo_Lin,
            String bAplica_Co_Subl,
            String sCo_Subl,
            String bAplica_Co_Cat,
            String sCo_Cat,
            String bAplica_Co_Color,
            String sCo_Color,
            String bAplica_Co_Proc,
            String sCo_Proc,
            String bAplica_Co_Ubicacion,
            String sCo_Ubicacion,
            String bAplica_Item,
            String sItem,
            String bAplica_Ref,
            String sRef,
            String iOpcion) {
        ArrayList<ArticulosBO> lista = new ArrayList<ArticulosBO>();
        try {
            //exec pObtenerListadoDatosArticulo @sDatabase_Name=N'DEMOA',
            //@sField_Name=N'Art_Des',@sValor=N'',@bAvanzada=0,
            //@bUsaOperadorLogicoAND=1,@bAplica_Manejo_Lote=0,
            //@sManeja_Lote=0,@bAplica_Manejo_Serial=0,@sManeja_Serial=0,
            //@bAplica_EsInactivo=0,@sEsInactivo=0,@bAplica_Tipo=0,@sTipo=N'V'
            //,@bAplica_Co_Lin=0,@sCo_Lin=N'',@bAplica_Co_Subl=0,@sCo_Subl=N'',
            //@bAplica_Co_Cat=0,@sCo_Cat=N'',@bAplica_Co_Color=0,
            //@sCo_Color=N'',@bAplica_Co_Proc=0,
            //@sCo_Proc=N'',@bAplica_Co_Ubicacion=0,@sCo_Ubicacion=N''
//,@bAplica_Item=0,@sItem=N'',@bAplica_Ref=0,@sRef=N'',@iOpcion=0
            cstmt = con.prepareCall("{CALL pObtenerListadoDatosArticulo("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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
            cstmt.setString(1, sDatabase_Name);
            cstmt.setString(2, sField_Name);
            cstmt.setString(3, sValor);
            cstmt.setString(4, bAvanzada);
            cstmt.setString(5, bUsaOperadorLogicoAND);
            cstmt.setString(6, bAplica_Manejo_Lote);
            cstmt.setString(7, sManeja_Lote);
            cstmt.setString(8, bAplica_Manejo_Serial);
            cstmt.setString(9, sManeja_Serial);
            cstmt.setString(10, bAplica_EsInactivo);
            cstmt.setString(11, sEsInactivo);
            cstmt.setString(12, bAplica_Tipo);
            cstmt.setString(13, sTipo);
            cstmt.setString(14, bAplica_Co_Lin);
            cstmt.setString(15, sCo_Lin);
            cstmt.setString(16, bAplica_Co_Subl);
            cstmt.setString(17, sCo_Subl);
            cstmt.setString(18, bAplica_Co_Cat);
            cstmt.setString(19, sCo_Cat);
            cstmt.setString(20, bAplica_Co_Color);
            cstmt.setString(21, sCo_Color);
            cstmt.setString(22, bAplica_Co_Proc);
            cstmt.setString(23, sCo_Proc);
            cstmt.setString(24, bAplica_Co_Ubicacion);
            cstmt.setString(25, sCo_Ubicacion);
            cstmt.setString(26, bAplica_Item);
            cstmt.setString(27, sItem);
            cstmt.setString(28, bAplica_Ref);
            cstmt.setString(29, sRef);
            cstmt.setString(30, iOpcion);

            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                ArticulosBO articulosBO = new ArticulosBO();
                articulosBO.setCo_art(rs.getString("co_art"));
                articulosBO.setArt_des(rs.getString("art_des"));
                articulosBO.setAnulado(rs.getString("anulado"));
                articulosBO.setAux_imp01(rs.getString("aux_imp01"));
                articulosBO.setCampo1(rs.getString("campo1"));
                articulosBO.setCampo2(rs.getString("campo2"));
                articulosBO.setCampo3(rs.getString("campo3"));
                articulosBO.setCampo4(rs.getString("campo4"));
                articulosBO.setCampo5(rs.getString("campo5"));
                articulosBO.setCampo6(rs.getString("campo6"));
                articulosBO.setCampo7(rs.getString("campo7"));
                articulosBO.setCampo8(rs.getString("campo8"));
                //se Obtiene la Descripcion de las tablas saColor , saSublinea , saLineaArticulo , saCatArticulo ,saUbicacion
                articulosBO.setCo_cat(rs.getString("Co_cat"));
                articulosBO.setCategoriaDescripcion(Utilitario.getTablaId(con, "saCatArticulo", "co_cat", "cat_des", rs.getString("Co_cat")));
                articulosBO.setCo_color(rs.getString("co_color"));
                articulosBO.setColorDescripcion(Utilitario.getTablaId(con, "sacolor", "co_color", "des_color", rs.getString("co_color")));
                articulosBO.setCo_lin(rs.getString("co_lin"));
                articulosBO.setLineaDescripcion(Utilitario.getTablaId(con, "saLineaArticulo", "co_lin", "lin_des", rs.getString("co_lin")));
                articulosBO.setCo_reten(rs.getString("co_reten"));
                articulosBO.setCo_subl(rs.getString("co_subl"));
                articulosBO.setSubLineaDescripcion(Utilitario.getTablaId(con, "saSubLinea", "co_subl", "subl_des", rs.getString("co_subl")));
                articulosBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                articulosBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                articulosBO.setCo_ubicacion(rs.getString("co_ubicacion"));
                articulosBO.setUbicacionDescripcion(Utilitario.getTablaId(con, "saUbicacion", "co_ubicacion", "des_ubicacion", rs.getString("co_ubicacion")));
                articulosBO.setCo_us_in(rs.getString("co_us_in"));
                articulosBO.setCo_us_mo(rs.getString("co_us_mo"));
                articulosBO.setCod_proc(rs.getString("cod_proc"));
                articulosBO.setComentario(rs.getString("comentario"));
                articulosBO.setDis_cen(rs.getString("dis_cen"));
                articulosBO.setFe_us_in(rs.getString("fe_us_in"));
                articulosBO.setFe_us_mo(rs.getString("fe_us_mo"));
                articulosBO.setFeccom(rs.getString("feccom"));
                articulosBO.setFecha_inac(rs.getString("fecha_inac"));
                articulosBO.setFecha_reg(rs.getString("fecha_reg"));
                articulosBO.setGarantia(rs.getString("garantia"));
                articulosBO.setGenerico(rs.getString("generico"));
                articulosBO.setItem(rs.getString("item"));
                articulosBO.setLic_capacidad(rs.getString("lic_capacidad"));
                articulosBO.setLic_grado_al(rs.getString("lic_grado_al"));
                articulosBO.setLic_mon_ilc(rs.getString("lic_mon_ilc"));
                articulosBO.setLic_tipo(rs.getString("lic_tipo"));
                articulosBO.setManeja_lote(rs.getString("maneja_lote"));
                articulosBO.setManeja_serial(rs.getString("maneja_serial"));
                articulosBO.setManeja_lote_venc(rs.getString("maneja_lote_venc"));
                articulosBO.setMargen_max(rs.getString("margen_max"));
                articulosBO.setStock_min(rs.getString("stock_min"));
                articulosBO.setStock_max(rs.getString("stock_max"));
                articulosBO.setStock_pedido(rs.getString("stock_pedido"));
                articulosBO.setTipo(rs.getString("tipo"));
                articulosBO.setTipo_cos(rs.getString("tipo_cos"));
                articulosBO.setTipo_imp(rs.getString("tipo_imp"));
                articulosBO.setTipo_imp2(rs.getString("tipo_imp2"));
                articulosBO.setTipo_imp3(rs.getString("tipo_imp3"));
                articulosBO.setTrasnfe(rs.getString("trasnfe"));
                articulosBO.setValidador(rs.getString("validador"));
                articulosBO.setModelo(rs.getString("modelo"));
                articulosBO.setVolumen(rs.getString("volumen"));
                articulosBO.setRef(rs.getString("ref"));
                articulosBO.setPeso(rs.getString("peso"));
                articulosBO.setMont_comi(rs.getString("mont_comi"));
                articulosBO.setCod_Almacen("" );
                // articulosBO.setCod_Unidad(rs.getString("Co_uni"));
                //articulosBO.setCod_Unidad(Utilitario.optenerCodUnidadArt(con, ));

                lista.add(articulosBO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static void main(String arg[]) {
        ArticuloModel m = new ArticuloModel();
        int resultadd = m.pInsertarArticulo("test",
                "20231213", "Art Descripcion",
                "tipo", "1", "20231213", "01", "02",
                "03", "04", "05", "item", "Model", "ref",
                "1", "2", "3", "4", "12", "14", "1", "",
                "3", "", "CdPro", "G", "22", "9", "300",
                "400", "23", "77", "55", "44", "33", "2",
                "2", "10", "Comentario", "TipoCo", "89", "34",
                "23", "0.2", "sI_art_des", "", "ret", "Camp1",
                "CAmp2", "UsuIng", "SucuIn");
        System.out.println(resultadd);
//        //    ArrayList<ArticulosBO> list = new ArrayList<ArticulosBO>();
//
//        // public static String getTablaId(Connection con, String tabla, String where, String column, String valorWhere) {
//        String descri = Utilitario.getTablaId(con, "saLineaArticulo", "co_lin", "lin_des", "3");
//        String color =Utilitario.getTablaId(con, "saCatArticulo",  "co_cat", "cat_des", "cat");
//        
//        System.out.println("Linea  " + descri + " categoria " +color  );
//
////Conexion , Tabla , where ,columnaCod, Valor de la Where . Para Obtener el ID de una Tabla...   
////        String resul = Utilitario.getTablaId(con, "sacolor", "des_color", "co_color", "negro");
////        int resul = m.pEliminarArticulo("ht");
////        System.out.println(" codigo del unidad : " + resul);
    }
//Proceso donde realiza la Insercion con la data Articulos .... 
// 3 exec pInsertarUnidadArticuloRenglon @iRENG_NUM=0,@sCo_Art='W',@sCo_Uni='B12',@bRelacion=0,@deEquivalencia=1,@bUso_Venta=0,@bUso_Compra=0,@bUni_Principal=1,@bUso_Principal=1,@bUni_Secundaria=0,@bUso_Secundaria=0,@bUso_NumDecimales=0,@iNum_Decimales=NULL,@sREVISADO=NULL,@sTRASNFE=NULL,@sco_sucu_in='01',@sco_us_in='PROFIT',@sMaquina='EARANA-PC'
// 
// 2 exec pActualizarEncabezadoUnidadArticulo @sCo_Art='W',@sMaquina='EARANA-PC',@sCo_Us_Mo='PROFIT',@sCo_Sucu_Mo='01',@tsValidador=0x000000000000EA61
// 
// 
// 1 exec pInsertarArticulo @sCo_Art='W',@sArt_Des='w',@sTipo='V',@sreten_iva_tercero=NULL,@bManeja_Serial=0,@sCod_Proc='01',@sdfecha_reg='2020-07-29 00:00:00',@sModelo='er',@sref='e',@bAnulado=0,@sco_cat='A10',@sco_lin='01',@sco_subl='01',@sitem='1',@sgarantia='n/a',@sco_color='02',@depeso=0,@stipo_imp='1',@stipo_imp2=NULL,@stipo_imp3=NULL,@destock_min=0,@deStock_Max=0,@depunt_cli=0,@bGenerico=0,@bManeja_Lote=0,@sdFecha_Inac=NULL,@sCo_Ubicacion='00001',@bManeja_Lote_Venc=0,@deMargen_Min=0,@deMargen_Max=0,@sCo_Reten=NULL,@deVolumen=0,@deStock_Pedido=0,@iRelac_Unidad=0,@dePunt_Ven=0,@deLic_Mon_Ilc=0,@deLic_Capacidad=0,@deLic_Grado_Al=0,@sLic_Tipo=NULL,@bPrec_Om=0,@sComentario=NULL,@sTipo_Cos='1',@deMont_Comi=0,@dePorc_Margen_Minimo=0,@dePorc_Margen_Maximo=0,@dePorc_Arancel=0,@sDis_Cen=NULL,@sCampo1=NULL,@sCampo2=NULL,@sCampo3=NULL,@sCampo4=NULL,@sCampo5=NULL,@sCampo6=NULL,@sCampo7=NULL,@sCampo8=NULL,@sRevisado=NULL,@sTrasnfe=NULL,@sco_sucu_in='01',@sco_us_in='PROFIT',@sMaquina='EARANA-PC'
//    
//    
//    exec pObtenerXmlConfiguracionArticulo @sCod_Usuario=N'PROFIT',@sCod_Mapa=N'300'
//
//REaaliza el Filtro por codigo ,Descripcion y busquedad exacta al inicio 
//exec pObtenerListadoDatosArticulo @sDatabase_Name=N'DEMOA',@sField_Name=N'Art_Des',@sValor=N'',@bAvanzada=0,@bUsaOperadorLogicoAND=1,@bAplica_Manejo_Lote=0,@sManeja_Lote=0,@bAplica_Manejo_Serial=0,@sManeja_Serial=0,@bAplica_EsInactivo=0,@sEsInactivo=0,@bAplica_Tipo=0,@sTipo=N'V',@bAplica_Co_Lin=0,@sCo_Lin=N'',@bAplica_Co_Subl=0,@sCo_Subl=N'',@bAplica_Co_Cat=0,@sCo_Cat=N'',@bAplica_Co_Color=0,@sCo_Color=N'',@bAplica_Co_Proc=0,@sCo_Proc=N'',@bAplica_Co_Ubicacion=0,@sCo_Ubicacion=N'',@bAplica_Item=0,@sItem=N'',@bAplica_Ref=0,@sRef=N'',@iOpcion=0
//
//exec pObtenerListadoDatosArticulo @sDatabase_Name=N'DEMOA',@sField_Name=N'Art_Des',@sValor=N'TAR',@bAvanzada=0,@bUsaOperadorLogicoAND=1,@bAplica_Manejo_Lote=0,@sManeja_Lote=0,@bAplica_Manejo_Serial=0,@sManeja_Serial=0,@bAplica_EsInactivo=0,@sEsInactivo=0,@bAplica_Tipo=0,@sTipo=N'V',@bAplica_Co_Lin=0,@sCo_Lin=N'',@bAplica_Co_Subl=0,@sCo_Subl=N'',@bAplica_Co_Cat=0,@sCo_Cat=N'',@bAplica_Co_Color=0,@sCo_Color=N'',@bAplica_Co_Proc=0,@sCo_Proc=N'',@bAplica_Co_Ubicacion=0,@sCo_Ubicacion=N'',@bAplica_Item=0,@sItem=N'',@bAplica_Ref=0,@sRef=N'',@iOpcion=2
//
//exec pObtenerListadoDatosArticulo @sDatabase_Name=N'DEMOA',@sField_Name=N'Co_Art',@sValor=N'T',@bAvanzada=0,@bUsaOperadorLogicoAND=1,@bAplica_Manejo_Lote=0,@sManeja_Lote=0,@bAplica_Manejo_Serial=0,@sManeja_Serial=0,@bAplica_EsInactivo=0,@sEsInactivo=0,@bAplica_Tipo=0,@sTipo=N'V',@bAplica_Co_Lin=0,@sCo_Lin=N'',@bAplica_Co_Subl=0,@sCo_Subl=N'',@bAplica_Co_Cat=0,@sCo_Cat=N'',@bAplica_Co_Color=0,@sCo_Color=N'',@bAplica_Co_Proc=0,@sCo_Proc=N'',@bAplica_Co_Ubicacion=0,@sCo_Ubicacion=N'',@bAplica_Item=0,@sItem=N'',@bAplica_Ref=0,@sRef=N'',@iOpcion=2
//
//exec pObtenerListadoDatosArticulo @sDatabase_Name=N'DEMOA',@sField_Name=N'Art_Des',@sValor=N'CO',@bAvanzada=0,@bUsaOperadorLogicoAND=1,@bAplica_Manejo_Lote=0,@sManeja_Lote=0,@bAplica_Manejo_Serial=0,@sManeja_Serial=0,@bAplica_EsInactivo=0,@sEsInactivo=0,@bAplica_Tipo=0,@sTipo=N'V',@bAplica_Co_Lin=0,@sCo_Lin=N'',@bAplica_Co_Subl=0,@sCo_Subl=N'',@bAplica_Co_Cat=0,@sCo_Cat=N'',@bAplica_Co_Color=0,@sCo_Color=N'',@bAplica_Co_Proc=0,@sCo_Proc=N'',@bAplica_Co_Ubicacion=0,@sCo_Ubicacion=N'',@bAplica_Item=0,@sItem=N'',@bAplica_Ref=0,@sRef=N'',@iOpcion=0
//
//exec pSeleccionarArticulo @sCo_Art='3003017'
}
