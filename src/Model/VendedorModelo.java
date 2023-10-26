/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.VendedorBO;
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
public class VendedorModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado;

    public VendedorModelo() {
        con = conexion.conexions();
    }

    public int pInsertarVendedor(
            String sCo_Ven,
            String sTipo,
            String sVen_Des,
            String sDis_Cen,
            String sCedula,
            String sDirec1,
            String sDirec2,
            String sTelefonos,
            String sdFecha_Reg,
            String bInactivo,
            String deComision,
            String sComentario,
            String bFun_Cob,
            String bFun_Ven,
            String deComisionV,
            String sLogin,
            String sPassword,
            String sEmail,
            String sPSW_M,
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
            String sco_zon
    ) {

        try {
            cstmt = con.prepareCall("{CALL  pInsertarVendedor("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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
            cstmt.setString(1, sCo_Ven);
            cstmt.setString(2, sTipo);
            cstmt.setString(3, sVen_Des);
            cstmt.setString(4, sDis_Cen);
            cstmt.setString(5, sCedula);
            cstmt.setString(6, sDirec1);
            cstmt.setString(7, sDirec2);
            cstmt.setString(8, sTelefonos);
            cstmt.setString(9, sdFecha_Reg);
            cstmt.setString(10, bInactivo);
            cstmt.setString(11, deComision);
            cstmt.setString(12, sComentario);
            cstmt.setString(13, bFun_Cob);
            cstmt.setString(14, bFun_Ven);
            cstmt.setString(15, deComisionV);
            cstmt.setString(16, sLogin);
            cstmt.setString(17, sPassword);
            cstmt.setString(18, sEmail);
            cstmt.setString(19, sPSW_M);
            cstmt.setString(20, sCampo1);
            cstmt.setString(21, sCampo2);
            cstmt.setString(22, sCampo3);
            cstmt.setString(23, sCampo4);
            cstmt.setString(24, sCampo5);
            cstmt.setString(25, sCampo6);
            cstmt.setString(26, sCampo7);
            cstmt.setString(27, sCampo8);
            cstmt.setString(28, sCo_Us_In);
            cstmt.setString(29, sCo_Sucu_In);
            cstmt.setString(30, sMaquina);
            cstmt.setString(31, sRevisado);
            cstmt.setString(32, sTrasnfe);
            cstmt.setString(33, sco_zon);

            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(VendedorModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public int pActualizarVendedor(
            String sCo_Ven,
            String sCo_VenOri,
            String sTipo,
            String sVen_Des,
            String sDis_Cen,
            String sCedula,
            String sDirec1,
            String sDirec2,
            String sTelefonos,
            String sdFecha_Reg,
            String bInactivo,
            String deComision,
            String sComentario,
            String bFun_Cob,
            String bFun_Ven,
            String deComisionV,
            String sLogin,
            String sPassword,
            String sEmail,
            String sPSW_M,
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
            //String tsValidador,
            String sco_zon
    ) {

        try {
            cstmt = con.prepareCall("{CALL  pActualizarVendedor("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    //  + "?,"
                    + "?,"
                    + "?"
                    + " )}");
            cstmt.setString(1, sCo_Ven);
            cstmt.setString(2, sCo_VenOri);
            cstmt.setString(3, sTipo);
            cstmt.setString(4, sVen_Des);
            cstmt.setString(5, sDis_Cen);
            cstmt.setString(6, sCedula);
            cstmt.setString(7, sDirec1);
            cstmt.setString(8, sDirec2);
            cstmt.setString(9, sTelefonos);
            cstmt.setString(10, sdFecha_Reg);
            cstmt.setString(11, bInactivo);
            cstmt.setString(12, deComision);
            cstmt.setString(13, sComentario);
            cstmt.setString(14, bFun_Cob);
            cstmt.setString(15, bFun_Ven);
            cstmt.setString(16, deComisionV);
            cstmt.setString(17, sLogin);
            cstmt.setString(18, sPassword);
            cstmt.setString(19, sEmail);
            cstmt.setString(20, sPSW_M);
            cstmt.setString(21, sCampo1);
            cstmt.setString(22, sCampo2);
            cstmt.setString(23, sCampo3);
            cstmt.setString(24, sCampo4);
            cstmt.setString(25, sCampo5);
            cstmt.setString(26, sCampo6);
            cstmt.setString(27, sCampo7);
            cstmt.setString(28, sCampo8);
            cstmt.setString(29, sCo_Us_Mo);
            cstmt.setString(30, sCo_Sucu_Mo);
            cstmt.setString(31, sMaquina);
            cstmt.setString(32, sCampos);
            cstmt.setString(33, sRevisado);
            cstmt.setString(34, sTrasnfe);
            // cstmt.setString(35, tsValidador);
            cstmt.setString(35, sco_zon);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VendedorModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public int peliminarVendedor(
            String sCo_VenOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {

        try {
            cstmt = con.prepareCall("{CALL peliminarVendedor("
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
            ex.printStackTrace();
        }

        return resultado;
    }

    public ArrayList<VendedorBO> pObtenerListadoDatos(
            String Database_Name,
            String Table_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<VendedorBO> lista = new ArrayList<>();
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
                VendedorBO vendedorBO = new VendedorBO();
                vendedorBO.setCo_ven(rs.getString("co_ven"));
                vendedorBO.setVen_des(rs.getString("ven_des"));
                vendedorBO.setCampo1(rs.getString("campo1"));
                vendedorBO.setCampo2(rs.getString("campo2"));
                vendedorBO.setCampo3(rs.getString("campo3"));
                vendedorBO.setCampo4(rs.getString("campo4"));
                vendedorBO.setCampo5(rs.getString("campo5"));
                vendedorBO.setCampo6(rs.getString("campo6"));
                vendedorBO.setCampo7(rs.getString("campo7"));
                vendedorBO.setCampo8(rs.getString("campo8"));
                vendedorBO.setCedula(rs.getString("cedula"));
                vendedorBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                vendedorBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                vendedorBO.setCo_us_in(rs.getString("co_us_in"));
                vendedorBO.setCo_us_mo(rs.getString("co_us_mo"));
                vendedorBO.setCo_zon(rs.getString("co_zon"));
                vendedorBO.setComentario(rs.getString("comentario"));
                vendedorBO.setComision(rs.getString("comision"));
                vendedorBO.setComisionv(rs.getString("comisionv"));
                vendedorBO.setDirec1(rs.getString("direc1"));
                vendedorBO.setDirec2(rs.getString("direc2"));
                vendedorBO.setDis_cen(rs.getString("dis_cen"));
                vendedorBO.setEmail(rs.getString("email"));
                vendedorBO.setFe_us_in(rs.getString("fe_us_in"));
                vendedorBO.setFe_us_mo(rs.getString("fe_us_mo"));
                vendedorBO.setFeccom(rs.getString("feccom"));
                vendedorBO.setFecha_reg(rs.getString("fecha_reg"));
                vendedorBO.setFun_cob(rs.getString("fun_cob"));
                vendedorBO.setFun_ven(rs.getString("fun_ven"));
                vendedorBO.setInactivo(rs.getString("inactivo"));
                vendedorBO.setLogin(rs.getString("login"));
                vendedorBO.setNumcom(rs.getString("numcom"));
                vendedorBO.setPassword(rs.getString("password"));
                vendedorBO.setPsw_m(rs.getString("psw_m"));
                vendedorBO.setRevisado(rs.getString("revisado"));
                //vendedorBO.setRowguid(rs.getString("rowguid"));
                vendedorBO.setTelefonos(rs.getString("telefonos"));
                vendedorBO.setTipo(rs.getString("tipo"));
                vendedorBO.setTrasnfe(rs.getString("trasnfe"));
                vendedorBO.setDescripcionZona(Utilitarios.Utilitario.getTablaId(con, "saZona", "co_zon", "zon_des", rs.getString("co_zon")));
                //vendedorBO.setValidador(rs.getString("validador"));
                lista.add(vendedorBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendedorModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}
