/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.TipoClienteBO;
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
 * @author AranaV
 */
public class TipoClienteModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public TipoClienteModelo() {
        con = conexion.conexions();
    }

    public int pInsertarTipoCliente(
            String sTip_Cli,
            String sDes_Tipo,
            String sCo_Precio,
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
            String sCo_Sucu_In
    ) {
        try {
            cstmt = con.prepareCall("{CALL  pInsertarTipoCliente("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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
            cstmt.setString(1, sTip_Cli);
            cstmt.setString(2, sDes_Tipo);
            cstmt.setString(3, sCo_Precio);
            cstmt.setString(4, sCampo1);
            cstmt.setString(5, sCampo2);
            cstmt.setString(6, sCampo3);
            cstmt.setString(7, sCampo4);
            cstmt.setString(8, sCampo5);
            cstmt.setString(9, sCampo6);
            cstmt.setString(10, sCampo7);
            cstmt.setString(11, sCampo8);
            cstmt.setString(12, sCo_Us_In);
            cstmt.setString(13, sMaquina);
            cstmt.setString(14, sRevisado);
            cstmt.setString(15, sTrasnfe);
            cstmt.setString(16, sCo_Sucu_In);

            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(TipoClienteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pActualizarTipoCliente(
            String sTip_Cli,
            String sTip_CliOri,
            String sDes_Tipo,
            String sCo_Precio,
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
        try {
            cstmt = con.prepareCall("{CALL  pActualizarTipoCliente("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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
            cstmt.setString(1, sTip_Cli);
            cstmt.setString(2, sTip_CliOri);
            cstmt.setString(3, sDes_Tipo);
            cstmt.setString(4, sCo_Precio);
            cstmt.setString(5, sCampo1);
            cstmt.setString(6, sCampo2);
            cstmt.setString(7, sCampo3);
            cstmt.setString(8, sCampo4);
            cstmt.setString(9, sCampo5);
            cstmt.setString(10, sCampo6);
            cstmt.setString(11, sCampo7);
            cstmt.setString(12, sCampo8);
            cstmt.setString(13, sCo_Us_Mo);
            cstmt.setString(14, sCo_Sucu_Mo);
            cstmt.setString(15, sMaquina);
            cstmt.setString(16, sCampos);
            cstmt.setString(17, sRevisado);
            cstmt.setString(18, sTrasnfe);
            
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TipoClienteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pEliminarTipoCliente(
            String sTip_CliOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarTipoCliente(?)}");
            cstmt.setString(1, sTip_CliOri);
             resultado = cstmt.executeUpdate();
            

        } catch (SQLException ex) {
            Logger.getLogger(TipoClienteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<TipoClienteBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<TipoClienteBO> lista = new ArrayList<>();
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
                TipoClienteBO tipoClienteBO = new TipoClienteBO();
                tipoClienteBO.setTip_cli(rs.getString("tip_cli"));
                tipoClienteBO.setDes_tipo(rs.getString("des_tipo"));
                tipoClienteBO.setCampo1(rs.getString("campo1"));
                tipoClienteBO.setCampo2(rs.getString("campo2"));
                tipoClienteBO.setCampo3(rs.getString("campo3"));
                tipoClienteBO.setCampo4(rs.getString("campo4"));
                tipoClienteBO.setCampo5(rs.getString("campo5"));
                tipoClienteBO.setCampo6(rs.getString("campo6"));
                tipoClienteBO.setCampo7(rs.getString("campo7"));
                tipoClienteBO.setCampo8(rs.getString("campo8"));
                tipoClienteBO.setCo_precio(rs.getString("co_precio"));
                tipoClienteBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                tipoClienteBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                tipoClienteBO.setCo_us_in(rs.getString("co_us_in"));
                tipoClienteBO.setCo_us_mo(rs.getString("co_us_mo"));
                tipoClienteBO.setFe_us_in(rs.getString("fe_us_in"));
                tipoClienteBO.setFe_us_mo(rs.getString("fe_us_mo"));
                tipoClienteBO.setRevisado(rs.getString("revisado"));
                tipoClienteBO.setTrasnfe(rs.getString("trasnfe"));
                tipoClienteBO.setValidador(rs.getString("validador"));
                tipoClienteBO.setDescripcionTipoPrecio(Utilitarios.Utilitario.getTablaId(con, "saTipoPrecio",  "co_precio", "des_precio", rs.getString("co_precio")));
                lista.add(tipoClienteBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TipoClienteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
   
}
