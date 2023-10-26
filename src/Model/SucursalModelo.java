/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.SucursalBO;
import Conection.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author earana
 */
public class SucursalModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;

    public SucursalModelo() {
        con = conexion.conexions();

    }

    public int pInsertarSucursal(
            String sCo_Sucur,
            String sSucur_Des,
            String sCampo1,
            String sCampo2,
            String sCampo3,
            String sCampo4,
            String sCo_Us_In,
            String sCo_Sucu_In,
            String sMaquina,
            String sRevisado,
            String sTrasnfe) {
        int resultado = 0;

        try {
            cstmt = con.prepareCall("{CALL pInsertarSucursal("
                    + "?,"
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
            cstmt.setString(1, sCo_Sucur);
            cstmt.setString(2, sSucur_Des);
            cstmt.setString(3, sCampo1);
            cstmt.setString(4, sCampo2);
            cstmt.setString(5, sCampo3);
            cstmt.setString(6, sCampo4);
            cstmt.setString(7, sCo_Us_In);
            cstmt.setString(8, sCo_Sucu_In);
            cstmt.setString(9, sMaquina);
            cstmt.setString(10, sRevisado);
            cstmt.setString(11, sTrasnfe);

            resultado = cstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }

        return resultado;

    }

    public int pActualizarSucursal(
            String sCo_Sucur,
            String sCo_SucurOri,
            String sSucur_Des,
            String sCampo1,
            String sCampo2,
            String sCampo3,
            String sCampo4,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo,
            String sMaquina,
            String sRevisado,
            String sTrasnfe
    ) {

        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL pActualizarSucursal("
                    + "?,"
                    + "?,"
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

            cstmt.setString(1, sCo_Sucur);
            cstmt.setString(2, sCo_SucurOri);
            cstmt.setString(3, sSucur_Des);
            cstmt.setString(4, sCampo1);
            cstmt.setString(5, sCampo2);
            cstmt.setString(6, sCampo3);
            cstmt.setString(7, sCampo4);
            cstmt.setString(8, sCo_Us_Mo);
            cstmt.setString(9, sCo_Sucu_Mo);
            cstmt.setString(10, sMaquina);
            cstmt.setString(11, sRevisado);
            cstmt.setString(12, sTrasnfe);
            

            resultado = cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return resultado;
    }

    public int pEliminarSucursal(
            String sCo_SucurOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL  pEliminarSucursal("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            cstmt.setString(1, sCo_SucurOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);

           resultado= cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultado;
    }

    public ArrayList<SucursalBO> listaSucursal() {
        ArrayList<SucursalBO> lista = new ArrayList<>();
        try {
            cstmt = con.prepareCall("{CALL pObtenerSucursal}");
            cstmt.execute();
            rs = cstmt.getResultSet();

            while (rs.next()) {
                SucursalBO sucursalBO = new SucursalBO();
                sucursalBO.setCo_sucur(rs.getString("co_sucur"));
                sucursalBO.setSucur_des(rs.getString("sucur_des"));
                sucursalBO.setCampo1(rs.getString("campo1"));
                sucursalBO.setCampo2(rs.getString("campo2"));
                sucursalBO.setCampo3(rs.getString("campo3"));
                sucursalBO.setCampo4(rs.getString("campo4"));
                sucursalBO.setCampo5(rs.getString("campo5"));
                sucursalBO.setCampo6(rs.getString("campo6"));
                sucursalBO.setCampo7(rs.getString("campo7"));
                sucursalBO.setCampo8(rs.getString("campo8"));
                sucursalBO.setCo_us_in(rs.getString("co_us_in"));
                sucursalBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                sucursalBO.setFe_us_in(rs.getString("fe_us_in"));
                sucursalBO.setCo_us_mo(rs.getString("co_us_mo"));

                sucursalBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                sucursalBO.setRevisado(rs.getString("revisado"));
                sucursalBO.setTrasnfe(rs.getString("trasnfe"));
                sucursalBO.setValidador(rs.getString("validador"));

                lista.add(sucursalBO);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
     public ArrayList<SucursalBO> pObtenerListadoDatos(
     String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
     ) {
                 ArrayList<SucursalBO> lista = new ArrayList<>();
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
                 SucursalBO sucursalBO = new SucursalBO();
                sucursalBO.setCo_sucur(rs.getString("co_sucur"));
                sucursalBO.setSucur_des(rs.getString("sucur_des"));
                sucursalBO.setCampo1(rs.getString("campo1"));
                sucursalBO.setCampo2(rs.getString("campo2"));
                sucursalBO.setCampo3(rs.getString("campo3"));
                sucursalBO.setCampo4(rs.getString("campo4"));
                sucursalBO.setCampo5(rs.getString("campo5"));
                sucursalBO.setCampo6(rs.getString("campo6"));
                sucursalBO.setCampo7(rs.getString("campo7"));
                sucursalBO.setCampo8(rs.getString("campo8"));
                sucursalBO.setCo_us_in(rs.getString("co_us_in"));
                sucursalBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                sucursalBO.setFe_us_in(rs.getString("fe_us_in"));
                sucursalBO.setCo_us_mo(rs.getString("co_us_mo"));

                sucursalBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                sucursalBO.setRevisado(rs.getString("revisado"));
                sucursalBO.setTrasnfe(rs.getString("trasnfe"));
                sucursalBO.setValidador(rs.getString("validador"));
                lista.add(sucursalBO);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SucursalModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
     return lista;    
     }
     public int validarSucursal(String BaseDatos ,String valor){
     int resultado =0 ;
     resultado= Utilitarios.Utilitario.validarRegistro(con, "co_sucur", BaseDatos, "saSucursal", "co_sucur", valor) ;
     return resultado ;
     
     }
     
}
