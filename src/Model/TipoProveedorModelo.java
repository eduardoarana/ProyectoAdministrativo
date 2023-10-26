/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.TipoProveedorBO;
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
 * @author Desarrollo
 */
public class TipoProveedorModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public TipoProveedorModelo() {
        con = conexion.conexions();
    }

    public int pInsertarTipoProveedor(
            String sTip_Pro,
            String sDes_Tipo,
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
            cstmt = con.prepareCall("{CALL pInsertarTipoProveedor("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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
            cstmt.setString(1, sTip_Pro);
            cstmt.setString(2, sDes_Tipo);
            //cstmt.setString(3, sCo_Sucu);
            cstmt.setString(3, sCampo1);
            cstmt.setString(4, sCampo2);
            cstmt.setString(5, sCampo3);
            cstmt.setString(6, sCampo4);
            cstmt.setString(7, sCampo5);
            cstmt.setString(8, sCampo6);
            cstmt.setString(9, sCampo7);
            cstmt.setString(10, sCampo8);
            cstmt.setString(11, sCo_Us_In);
            cstmt.setString(12, sCo_Sucu_In);
            cstmt.setString(13, sMaquina);
            cstmt.setString(14, sRevisado);
            cstmt.setString(15, sTrasnfe);
            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            //Logger.getLogger(TipoProveedorModelo.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        return resultado;
    }

    public int pActualizarTipoProveedor(
            String sTip_Pro,
            String sTip_ProOri,
            String sDes_Tipo,
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
            String sTrasnfe
    ) {

        try {
            cstmt = con.prepareCall("{CALL pActualizarTipoProveedor ("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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
            cstmt.setString(1, sTip_Pro);
            cstmt.setString(2, sTip_ProOri);
            cstmt.setString(3, sDes_Tipo);
            cstmt.setString(4, sCampo1);
            cstmt.setString(5, sCampo2);
            cstmt.setString(6, sCampo3);
            cstmt.setString(7, sCampo4);
            cstmt.setString(8, sCampo5);
            cstmt.setString(9, sCampo6);
            cstmt.setString(10, sCampo7);
            cstmt.setString(11, sCampo8);
            cstmt.setString(12, sCo_Us_Mo);
            cstmt.setString(13, sCo_Sucu_Mo);
            cstmt.setString(14, sMaquina);
            cstmt.setString(15, sCampos);
            cstmt.setString(16, sRevisado);
            cstmt.setString(17, sTrasnfe);

            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TipoProveedorModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pEliminarTipoProveedor(
            String sTip_ProOri,
         
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarTipoProveedor("
                    + "?,"
                    + "?,"
                   
                    + "?,"
                    + "? )}");

            cstmt.setString(1, sTip_ProOri);
           
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TipoProveedorModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public ArrayList<TipoProveedorBO> pObtenerListadoDatosProveedor(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<TipoProveedorBO> lista = new ArrayList<TipoProveedorBO>();
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
                TipoProveedorBO tipoProveedorBO = new TipoProveedorBO();
                tipoProveedorBO.setTip_pro(rs.getString("tip_pro"));
                tipoProveedorBO.setDes_tipo(rs.getString("des_tipo"));
                tipoProveedorBO.setCampo1(rs.getString("Campo1"));
                tipoProveedorBO.setCampo2(rs.getString("Campo2"));
                tipoProveedorBO.setCampo3(rs.getString("Campo3"));
                tipoProveedorBO.setCampo4(rs.getString("Campo4"));
                tipoProveedorBO.setCampo5(rs.getString("Campo5"));
                tipoProveedorBO.setCampo6(rs.getString("Campo6"));
                tipoProveedorBO.setCampo7(rs.getString("Campo7"));
                tipoProveedorBO.setCampo8(rs.getString("Campo8"));
                tipoProveedorBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                tipoProveedorBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                tipoProveedorBO.setCo_us_in(rs.getString("co_us_in"));
                lista.add(tipoProveedorBO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

   
}
