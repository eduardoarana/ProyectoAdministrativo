/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.CuentaInEgreBO;
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
public class CuentaInEgreModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public CuentaInEgreModel() {
        con = conexion.conexions();
    }

    public int pInsertarCuentaIngreso(
            String sCo_Cta_Ingr_Egr,
            String sDescrip,
            String sCo_Islr,
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
            String sMaquina,
            String sRevisatdo,
            String sTrasnfe,
            String sCo_Sucu_In
    ) {

        try {
            cstmt = con.prepareCall("{CALL pInsertarCuentaIngreso("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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

            cstmt.setString(1, sCo_Cta_Ingr_Egr);
            cstmt.setString(2, sDescrip);
            cstmt.setString(3, sCo_Islr);
            cstmt.setString(4, sDis_Cen);
            cstmt.setString(5, sCampo1);
            cstmt.setString(6, sCampo2);
            cstmt.setString(7, sCampo3);
            cstmt.setString(8, sCampo4);
            cstmt.setString(9, sCampo5);
            cstmt.setString(10, sCampo6);
            cstmt.setString(11, sCampo7);
            cstmt.setString(12, sCampo8);
            cstmt.setString(13, sCo_Us_In);
            cstmt.setString(14, sMaquina);
            cstmt.setString(15, sRevisatdo);
            cstmt.setString(16, sTrasnfe);
            cstmt.setString(17, sCo_Sucu_In);

            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CuentaInEgreModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    
    public int pActualizarCuentaIngreso(
            String sCo_Cta_Ingr_Egr,
            String sCo_Cta_Ingr_EgrOri,
            String sDescrip,
            String sCo_Islr,
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
            String sMaquina,
            String sCampos,
            String sRevisado,
            String sTransfe
    ){
        try {
            cstmt = con.prepareCall("{CALL pActualizarCuentaIngreso("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
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
            cstmt.setString(1, sCo_Cta_Ingr_Egr);
            cstmt.setString(2, sCo_Cta_Ingr_EgrOri);
            cstmt.setString(3, sDescrip);
            cstmt.setString(4, sCo_Islr);
            cstmt.setString(5, sDis_Cen);
            cstmt.setString(6, sCampo1);
            cstmt.setString(7, sCampo2);
            cstmt.setString(8, sCampo3);
            cstmt.setString(9, sCampo4);
            cstmt.setString(10, sCampo5);
            cstmt.setString(11, sCampo6);
            cstmt.setString(12, sCampo7);
            cstmt.setString(13, sCampo8);
            cstmt.setString(14, sCo_Us_Mo);
            cstmt.setString(15, sCo_Sucu_Mo);
            cstmt.setString(16, sMaquina);
            cstmt.setString(17, sCampos);
            cstmt.setString(18, sRevisado);
            cstmt.setString(19, sTransfe);
            
            resultado = cstmt.executeUpdate();
            
        } catch (SQLException ex){
            Logger.getLogger(CuentaInEgreModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
       public int pEliminarCuentaIngreso(
       String sCo_Cta_Ingr_EgrOri,
       String sMaquina,
       String sCo_Us_Mo,
       String sCo_Sucu_Mo){
        try {
            cstmt = con.prepareCall("{CALL pEliminarCuentaIngreso("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            cstmt.setString(1, sCo_Cta_Ingr_EgrOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CuentaInEgreModel.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       return resultado ;
       }
    

//    exec pObtenerListadoDatos @sDatabase_Name=N'DEMOA',@sTable_Name=N'saCuentaIngEgr'
    //,@sField_Name=N'Descrip',@sValor=N'C',@iOpcion=2
    public ArrayList<CuentaInEgreBO> pObtenerListadoDatosCuentaInEgre(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<CuentaInEgreBO> lista = new ArrayList<CuentaInEgreBO>();
        try {
            cstmt = con.prepareCall("{ CALL pObtenerListadoDatos("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?) }");
            cstmt.setString(1, sDatabase_Name);
            cstmt.setString(2, sTable_Name);
            cstmt.setString(3, sField_Name);
            cstmt.setString(4, sValor);
            cstmt.setString(5, iOpcion);

            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                CuentaInEgreBO cuentaInEgreBO = new CuentaInEgreBO();
                cuentaInEgreBO.setCo_cta_ingr_egr(rs.getString("co_cta_ingr_egr"));
                cuentaInEgreBO.setDescrip(rs.getString("descrip"));
                cuentaInEgreBO.setDis_cen(rs.getString("dis_cen"));
                cuentaInEgreBO.setCampo1(rs.getString("campo1"));
                cuentaInEgreBO.setCampo2(rs.getString("campo2"));
                cuentaInEgreBO.setCampo3(rs.getString("campo3"));
                cuentaInEgreBO.setCampo4(rs.getString("campo4"));
                cuentaInEgreBO.setCampo5(rs.getString("campo5"));
                cuentaInEgreBO.setCampo6(rs.getString("campo6"));
                cuentaInEgreBO.setCampo7(rs.getString("campo7"));
                cuentaInEgreBO.setCampo8(rs.getString("campo8"));
                cuentaInEgreBO.setCo_islr(rs.getString("co_islr"));
                cuentaInEgreBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                cuentaInEgreBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                cuentaInEgreBO.setCo_us_in(rs.getString("co_us_in"));
                cuentaInEgreBO.setCo_us_mo(rs.getString("co_us_mo"));
                cuentaInEgreBO.setFe_us_in(rs.getString("fe_us_in"));
                cuentaInEgreBO.setFe_us_mo(rs.getString("fe_us_mo"));
                cuentaInEgreBO.setFeccom(rs.getString("Feccom"));
                cuentaInEgreBO.setNumcom(rs.getString("Numcom"));
                cuentaInEgreBO.setRevisado(rs.getString("revisado"));
                cuentaInEgreBO.setTrasnfe(rs.getString("trasnfe"));
                cuentaInEgreBO.setValidador(rs.getString("validador"));

                lista.add(cuentaInEgreBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CuentaInEgreModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    
}
