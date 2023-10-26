/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ClienteBO;
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
public class ClienteModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado=0;

    public ClienteModelo() {
        con = conexion.conexions();
    }

    public int pInsertarCliente(
            String sCo_Cli,
            String sLogin,
            String sPassword,
            String sSalesTax,
            String sCli_Des,
            String sCo_seg,
            String sCo_zon,
            String sCo_Ven,
            String sEstado,
            String bInactivo,
            String bValido,
            String bSinCredito,
            String bLunes,
            String bMartes,
            String bMiercoles,
            String bJueves,
            String bViernes,
            String bSabado,
            String bDomingo,
            String sDirec1,
            String sDirec2,
            String sDir_Ent2,
            String sHorar_Caja,
            String sFrecu_Vist,
            String sTelefonos,
            String sFax,
            String sRespons,
            String sdFecha_reg,
            String sTip_Cli,
            String sSerialP,
            String iPuntaje,
            String iId,
            String deMont_cre,
            String sCo_mone,
            String sCond_Pag,
            String iPlaz_pag,
            String deDesc_ppago,
            String deDesc_Glob,
            String sTipo_Iva,
            String deIva,
            String sRif,
            String bContrib,
            String sDis_cen,
            String sNit,
            String sEmail,
            String sCo_Cta_Ingr_Egr,
            String sComentario,
            String sCampo1,
            String sCampo2,
            String sCampo3,
            String sCampo4,
            String sCampo5,
            String sCampo6,
            String sCampo7,
            String sCampo8,
            String sCo_Us_In,
            String sMaquina,
            String sRevisado,
            String sTrasnfe,
            String sCo_Sucu_In,
            String bJuridico,
            String iTipo_Adi,
            String sMatriz,
            String sCo_Tab,
            String sTipo_Per,
            String sCo_pais,
            String sCiudad,
            String sZip,
            String sWebSite,
            String bContribu_E,
            String bRete_Regis_Doc,
            String dePorc_Esp,
            String sN_cr,
            String sN_db,
            String sTComp,
            String sEmail_alterno
    ) {
        try {
            cstmt = con.prepareCall("{CALL  pInsertarCliente("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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

            cstmt.setString(1, sCo_Cli);
            cstmt.setString(2, sLogin);
            cstmt.setString(3, sPassword);
            cstmt.setString(4, sSalesTax);
            cstmt.setString(5, sCli_Des);
            cstmt.setString(6, sCo_seg);
            cstmt.setString(7, sCo_zon);
            cstmt.setString(8, sCo_Ven);
            cstmt.setString(9, sEstado);
            cstmt.setString(10, bInactivo);
            cstmt.setString(11, bValido);
            cstmt.setString(12, bSinCredito);
            cstmt.setString(13, bLunes);
            cstmt.setString(14, bMartes);
            cstmt.setString(15, bMiercoles);
            cstmt.setString(16, bJueves);
            cstmt.setString(17, bViernes);
            cstmt.setString(18, bSabado);
            cstmt.setString(19, bDomingo);
            cstmt.setString(20, sDirec1);
            cstmt.setString(21, sDirec2);
            cstmt.setString(22, sDir_Ent2);
            cstmt.setString(23, sHorar_Caja);
            cstmt.setString(24, sFrecu_Vist);
            cstmt.setString(25, sTelefonos);
            cstmt.setString(26, sFax);
            cstmt.setString(27, sRespons);
            cstmt.setString(28, sdFecha_reg);
            cstmt.setString(29, sTip_Cli);
            cstmt.setString(30, sSerialP);
            cstmt.setString(31, iPuntaje);
            cstmt.setString(32, iId);
            cstmt.setString(33, deMont_cre);
            cstmt.setString(34, sCo_mone);
            cstmt.setString(35, sCond_Pag);
            cstmt.setString(36, iPlaz_pag);
            cstmt.setString(37, deDesc_ppago);
            cstmt.setString(38, deDesc_Glob);
            cstmt.setString(39, sTipo_Iva);
            cstmt.setString(40, deIva);
            cstmt.setString(41, sRif);
            cstmt.setString(42, bContrib);
            cstmt.setString(43, sDis_cen);
            cstmt.setString(44, sNit);
            cstmt.setString(45, sEmail);
            cstmt.setString(46, sCo_Cta_Ingr_Egr);
            cstmt.setString(47, sComentario);
            cstmt.setString(48, sCampo1);
            cstmt.setString(49, sCampo2);
            cstmt.setString(50, sCampo3);
            cstmt.setString(51, sCampo4);
            cstmt.setString(52, sCampo5);
            cstmt.setString(53, sCampo6);
            cstmt.setString(54, sCampo7);
            cstmt.setString(55, sCampo8);
            cstmt.setString(56, sCo_Us_In);
            cstmt.setString(57, sMaquina);
            cstmt.setString(58, sRevisado);
            cstmt.setString(59, sTrasnfe);
            cstmt.setString(60, sCo_Sucu_In);
            cstmt.setString(61, bJuridico);
            cstmt.setString(62, iTipo_Adi);
            cstmt.setString(63, sMatriz);
            cstmt.setString(64, sCo_Tab);
            cstmt.setString(65, sTipo_Per);
            cstmt.setString(66, sCo_pais);
            cstmt.setString(67, sCiudad);
            cstmt.setString(68, sZip);
            cstmt.setString(69, sWebSite);
            cstmt.setString(70, bContribu_E);
            cstmt.setString(71, bRete_Regis_Doc);
            cstmt.setString(72, dePorc_Esp);
            cstmt.setString(73, sN_cr);
            cstmt.setString(74, sN_db);
            cstmt.setString(75, sTComp);
            cstmt.setString(76, sEmail_alterno);
            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public int pActualizarCliente(
            String sCo_Cli,
            String sCo_CliOri,
            String sLogin,
            String sPassword,
            String sSalesTax,
            String sCli_Des,
            String sCo_seg,
            String sCo_zon,
            String sCo_Ven,
            String sEstado,
            String bInactivo,
            String bValido,
            String bSinCredito,
            String bLunes,
            String bMartes,
            String bMiercoles,
            String bJueves,
            String bViernes,
            String bSabado,
            String bDomingo,
            String sDirec1,
            String sDirec2,
            String sDir_Ent2,
            String sHorar_Caja,
            String sFrecu_Vist,
            String sTelefonos,
            String sFax,
            String sRespons,
            String sdFecha_reg,
            String sTip_Cli,
            String sSerialP,
            String iPuntaje,
            String iId,
            String deMont_cre,
            String sCo_Mone,
            String sCond_Pag,
            String iPlaz_pag,
            String deDesc_ppago,
            String deDesc_Glob,
            String sRif,
            String bContrib,
            String sDis_cen,
            String sNit,
            String sEmail,
            String sCo_Cta_Ingr_Egr,
            String sComentario,
            String sCampo1,
            String sCampo2,
            String sCampo3,
            String sCampo4,
            String sCampo5,
            String sCampo6,
            String sCampo7,
            String sCampo8,
            String sCo_us_mo,
            String sCo_Sucu_Mo,
            String sMaquina,
            String sCampos,
            String sRevisado,
            String sTrasnfe,
            String bJuridico,
            String iTipo_Adi,
            String sMatriz,
            String sCo_Tab,
            String sTipo_Per,
            String sCo_pais,
            String sCiudad,
            String sZip,
            String sWebSite,
            String bContribu_E,
            String bRete_Regis_Doc,
            String dePorc_Esp,
            //String tsValidador,
            String sN_cr,
            String sN_db,
            String sTComp,
            String sEmail_alterno
    ) {
        try {
            cstmt = con.prepareCall("{CALL  pActualizarCliente("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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

            cstmt.setString(1, sCo_Cli);
            cstmt.setString(2, sCo_CliOri);
            cstmt.setString(3, sLogin);
            cstmt.setString(4, sPassword);
            cstmt.setString(5, sSalesTax);
            cstmt.setString(6, sCli_Des);
            cstmt.setString(7, sCo_seg);
            cstmt.setString(8, sCo_zon);
            cstmt.setString(9, sCo_Ven);
            cstmt.setString(10, sEstado);
            cstmt.setString(11, bInactivo);
            cstmt.setString(12, bValido);
            cstmt.setString(13, bSinCredito);
            cstmt.setString(14, bLunes);
            cstmt.setString(15, bMartes);
            cstmt.setString(16, bMiercoles);
            cstmt.setString(17, bJueves);
            cstmt.setString(18, bViernes);
            cstmt.setString(19, bSabado);
            cstmt.setString(20, bDomingo);
            cstmt.setString(21, sDirec1);
            cstmt.setString(22, sDirec2);
            cstmt.setString(23, sDir_Ent2);
            cstmt.setString(24, sHorar_Caja);
            cstmt.setString(25, sFrecu_Vist);
            cstmt.setString(26, sTelefonos);
            cstmt.setString(27, sFax);
            cstmt.setString(28, sRespons);
            cstmt.setString(29, sdFecha_reg);
            cstmt.setString(30, sTip_Cli);
            cstmt.setString(31, sSerialP);
            cstmt.setString(32, iPuntaje);
            cstmt.setString(33, iId);
            cstmt.setString(34, deMont_cre);
            cstmt.setString(35, sCo_Mone);
            cstmt.setString(36, sCond_Pag);
            cstmt.setString(37, iPlaz_pag);
            cstmt.setString(38, deDesc_ppago);
            cstmt.setString(39, deDesc_Glob);
            cstmt.setString(40, sRif);
            cstmt.setString(41, bContrib);
            cstmt.setString(42, sDis_cen);
            cstmt.setString(43, sNit);
            cstmt.setString(44, sEmail);
            cstmt.setString(45, sCo_Cta_Ingr_Egr);
            cstmt.setString(46, sComentario);
            cstmt.setString(47, sCampo1);
            cstmt.setString(48, sCampo2);
            cstmt.setString(49, sCampo3);
            cstmt.setString(50, sCampo4);
            cstmt.setString(51, sCampo5);
            cstmt.setString(52, sCampo6);
            cstmt.setString(53, sCampo7);
            cstmt.setString(54, sCampo8);
            cstmt.setString(55, sCo_us_mo);
            cstmt.setString(56, sCo_Sucu_Mo);
            cstmt.setString(57, sMaquina);
            cstmt.setString(58, sCampos);
            cstmt.setString(59, sRevisado);
            cstmt.setString(60, sTrasnfe);
            cstmt.setString(61, bJuridico);
            cstmt.setString(62, iTipo_Adi);
            cstmt.setString(63, sMatriz);
            cstmt.setString(64, sCo_Tab);
            cstmt.setString(65, sTipo_Per);
            cstmt.setString(66, sCo_pais);
            cstmt.setString(67, sCiudad);
            cstmt.setString(68, sZip);
            cstmt.setString(69, sWebSite);
            cstmt.setString(70, bContribu_E);
            cstmt.setString(71, bRete_Regis_Doc);
            cstmt.setString(72, dePorc_Esp);
            cstmt.setString(73, sN_cr);
            cstmt.setString(74, sN_db);
            cstmt.setString(75, sTComp);
            cstmt.setString(76, sEmail_alterno);

            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public int pEliminarCliente(
            String sCo_VenOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarCliente("
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
            Logger.getLogger(ClienteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<ClienteBO> pObtenerListadoDatos(
            String Database_Name,
            String Table_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<ClienteBO> lista = new ArrayList<>();
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
                ClienteBO clienteBO = new ClienteBO();
                clienteBO.setCo_cli(rs.getString("co_cli"));
                clienteBO.setCli_des(rs.getString("cli_des"));
                clienteBO.setCampo1(rs.getString("campo1"));
                clienteBO.setCampo2(rs.getString("campo2"));
                clienteBO.setCampo3(rs.getString("campo3"));
                clienteBO.setCampo4(rs.getString("campo4"));
                clienteBO.setCampo5(rs.getString("campo5"));
                clienteBO.setCampo6(rs.getString("campo6"));
                clienteBO.setCampo7(rs.getString("campo7"));
                clienteBO.setCampo8(rs.getString("campo8"));
                clienteBO.setCiudad(rs.getString("ciudad"));
                clienteBO.setCo_cta_ingr_egr(rs.getString("co_cta_ingr_egr"));
                clienteBO.setCo_mone(rs.getString("co_mone"));
                clienteBO.setCo_pais(rs.getString("co_pais"));
                clienteBO.setCo_seg(rs.getString("co_seg"));
                clienteBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                clienteBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                clienteBO.setCo_tab(rs.getString("co_tab"));
                clienteBO.setCo_us_in(rs.getString("co_us_in"));
                clienteBO.setCo_us_mo(rs.getString("co_us_mo"));
                clienteBO.setCo_ven(rs.getString("co_ven"));
                clienteBO.setCo_zon(rs.getString("co_zon"));
                clienteBO.setComentario(rs.getString("comentario"));
                clienteBO.setCond_pag(rs.getString("cond_pag"));
                clienteBO.setContrib(rs.getString("contrib"));
                clienteBO.setContribu_e(rs.getString("contribu_e"));
                clienteBO.setDesc_glob(rs.getString("desc_glob"));
                clienteBO.setDesc_ppago(rs.getString("desc_ppago"));
                clienteBO.setDir_ent2(rs.getString("dir_ent2"));
                clienteBO.setDirec1(rs.getString("direc1"));
                clienteBO.setDirec2(rs.getString("direc2"));
                clienteBO.setDis_cen(rs.getString("dis_cen"));
                clienteBO.setDomingo(rs.getString("domingo"));
                clienteBO.setEmail(rs.getString("email"));
                clienteBO.setEmail_alterno(rs.getString("email_alterno"));
                clienteBO.setEstado(rs.getString("estado"));
                clienteBO.setFax(rs.getString("fax"));
                clienteBO.setFe_us_in(rs.getString("fe_us_in"));
                clienteBO.setFe_us_mo(rs.getString("fe_us_mo"));
                clienteBO.setFeccom(rs.getString("feccom"));
                clienteBO.setFecha_reg(rs.getString("fecha_reg"));
                clienteBO.setFrecu_vist(rs.getString("frecu_vist"));
                clienteBO.setHorar_caja(rs.getString("horar_caja"));
                clienteBO.setId(rs.getString("id"));
                clienteBO.setInactivo(rs.getString("inactivo"));
                clienteBO.setJueves(rs.getString("jueves"));
                clienteBO.setJuridico(rs.getString("juridico"));
                clienteBO.setLogin(rs.getString("login"));
                clienteBO.setLunes(rs.getString("lunes"));
                clienteBO.setMartes(rs.getString("martes"));
                clienteBO.setMatriz(rs.getString("matriz"));
                clienteBO.setMiercoles(rs.getString("miercoles"));
                clienteBO.setMont_cre(rs.getString("mont_cre"));
                clienteBO.setNit(rs.getString("nit"));
                clienteBO.setNumcom(rs.getString("numcom"));
                clienteBO.setPassword(rs.getString("password"));
                clienteBO.setPlaz_pag(rs.getString("plaz_pag"));
                clienteBO.setPorc_esp(rs.getString("porc_esp"));
                clienteBO.setPuntaje(rs.getString("puntaje"));
                clienteBO.setRespons(rs.getString("respons"));
                clienteBO.setRete_regis_doc(rs.getString("rete_regis_doc"));
                clienteBO.setRevisado(rs.getString("revisado"));
                clienteBO.setRif(rs.getString("rif"));
                //clienteBO.setRowguid(rs.getString("rowguid"));
                //  articulosBO.setCategoriaDescripcion(Utilitario.getTablaId(con, "saCatArticulo",  "co_cat", "cat_des", rs.getString("Co_cat")));
                clienteBO.setZonaDescripcion(Utilitarios.Utilitario.getTablaId(con, "saZona", "co_zon", "zon_des", rs.getString("co_zon")));
                clienteBO.setSegmentDescripcion(Utilitarios.Utilitario.getTablaId(con, "saSegmento", "co_seg", "seg_des", rs.getString("co_seg")));
                clienteBO.setCo_cta_in_Descripcion(Utilitarios.Utilitario.getTablaId(con, "saCuentaIngEgr", "co_cta_ingr_egr", "descrip", rs.getString("co_cta_ingr_egr")));
                clienteBO.setVendedorDdescripcion(Utilitarios.Utilitario.getTablaId(con, "saVendedor", "co_ven", "ven_des", rs.getString("co_ven")));
                clienteBO.setTipoClienteDescricion(Utilitarios.Utilitario.getTablaId(con, "saTipoCliente", "tip_cli", "des_tipo", rs.getString("tip_cli")));
                clienteBO.setTabuladorDescripcion(Utilitarios.Utilitario.getTablaId(con, "saTabuladorIslr", "co_tab", "tab_des", rs.getString("co_tab")));
                clienteBO.setPaisDescripcion(Utilitarios.Utilitario.getTablaId(con, "saPais", "co_pais", "pais_des", rs.getString("co_pais")));

                clienteBO.setSabado(rs.getString("sabado"));
                clienteBO.setSalestax(rs.getString("salestax"));
                clienteBO.setSerialp(rs.getString("serialp"));
                clienteBO.setSincredito(rs.getString("sincredito"));
                clienteBO.setTelefonos(rs.getString("telefonos"));
                clienteBO.setTipo_adi(rs.getString("tipo_adi"));
                clienteBO.setTipo_cli(rs.getString("tip_cli"));
                clienteBO.setTipo_per(rs.getString("tipo_per"));
                clienteBO.setValidador(rs.getString("validador"));
                clienteBO.setValido(rs.getString("valido"));
                clienteBO.setViernes(rs.getString("viernes"));
                clienteBO.setWebsite(rs.getString("website"));
                clienteBO.setZip(rs.getString("zip"));
                lista.add(clienteBO);

            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}
