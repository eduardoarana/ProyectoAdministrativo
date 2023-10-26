/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.TipoAjusteBO;
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
 * @author Desarrollo
 */
public class TipoAjusteModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;

    public TipoAjusteModelo() {
        con = conexion.conexions();
    }

    public int pInsertarTipoAjuste(
         String sCo_Tipo,
         String sDes_Tipo,
         String sTipo_Trans,
         String sCampo1,
         String sCampo2,
         String sCampo3,
         String sCampo4,
         String sCo_Us_In,
         String sMaquina,
         String revisado,
         String stransfe,
         String sCo_Sucu_In) {
        int resultado = 0;

        try {
            cstmt = con.prepareCall("{CALL pInsertarTipoAjuste("
                 + "?,"
                 + "?,"
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
            cstmt.setString(1, sCo_Tipo);
            cstmt.setString(2, sDes_Tipo);
            cstmt.setString(3, sTipo_Trans);
            cstmt.setString(4, sCampo1);
            cstmt.setString(5, sCampo2);
            cstmt.setString(6, sCampo3);
            cstmt.setString(7, sCampo4);
            cstmt.setString(8, sCo_Us_In);
            cstmt.setString(9, sMaquina);
            cstmt.setString(10, revisado);
            cstmt.setString(11, stransfe);

            cstmt.setString(12, sCo_Sucu_In);

            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }
        return resultado;

    }

    public int pActualizarTipoAjuste(
         String sCo_Tipo,
         String sCo_TipoOri,
         String sDes_Tipo,
         String sTipo_Trans,
         String sCampo1,
         String sCampo2,
         String sCampo3,
         String sCampo4,
         String sCo_Sucu_Mo,
         String sCo_Us_Mo,
         String sMaquina,
         String sRevisado,
         String sTrasnfe) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL pActualizarTipoAjuste("
                 + "?,"
                 + "?,"
                 + "?,"
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

            cstmt.setString(1, sCo_Tipo);
            cstmt.setString(2, sCo_TipoOri);
            cstmt.setString(3, sDes_Tipo);
            cstmt.setString(4, sTipo_Trans);
            cstmt.setString(5, sCampo1);
            cstmt.setString(6, sCampo2);
            cstmt.setString(7, sCampo3);
            cstmt.setString(8, sCampo4);
            cstmt.setString(9, sCo_Sucu_Mo);
            cstmt.setString(10, sCo_Us_Mo);
            cstmt.setString(11, sMaquina);
            cstmt.setString(12, sRevisado);
            cstmt.setString(13, sTrasnfe);

            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }

        return resultado;

    }

    public int pEliminarTipoAjuste(String cod_tipo) {
        int resultado = 0;

        try {
            cstmt = con.prepareCall("{CALL pEliminarTipoAjuste(?)}");
            cstmt.setString(1, cod_tipo);

            resultado = cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }

        return resultado;

    }

    public ArrayList<TipoAjusteBO> listaTipoAjuste(String TipoAjustes) {
        
        
        ArrayList<TipoAjusteBO> lista = new ArrayList<TipoAjusteBO>();
        try {
            
            if(!TipoAjustes.isEmpty()){
             cstmt = con.prepareCall("{CALL pSeleccionarTipoAjuste(?)}");
             cstmt.setString(1, TipoAjustes);
            }else {
                
            cstmt = con.prepareCall("{CALL pObtenerTipoAjuste}");
            
            } 
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                TipoAjusteBO ajusteBO = new TipoAjusteBO();

                ajusteBO.setCo_tipo(rs.getString("co_tipo"));
                ajusteBO.setDes_tipo(rs.getString("des_tipo"));
                ajusteBO.setTipo_trans(rs.getString("tipo_trans"));
                ajusteBO.setCampo1(rs.getString("campo1"));
                ajusteBO.setCampo2(rs.getString("campo2"));
                ajusteBO.setCampo3(rs.getString("campo3"));
                ajusteBO.setCampo4(rs.getString("campo4"));
                ajusteBO.setCampo5(rs.getString("campo5"));
                ajusteBO.setCampo6(rs.getString("campo6"));
                ajusteBO.setCampo7(rs.getString("campo7"));
                ajusteBO.setCampo8(rs.getString("campo8"));
                ajusteBO.setCo_us_in(rs.getString("co_us_in"));
                ajusteBO.setFe_us_in(rs.getString("fe_us_in"));
                ajusteBO.setCo_us_mo(rs.getString("co_us_mo"));
                ajusteBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                ajusteBO.setFe_us_mo(rs.getString("fe_us_mo"));
                ajusteBO.setRevisado(rs.getString("revisado"));
                ajusteBO.setTrasnfe(rs.getString("trasnfe"));
                ajusteBO.setValidador(rs.getString("validador"));

                lista.add(ajusteBO);

            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }

        return lista;
    }

    //exec pObtenerListadoDatos @sDatabase_Name=N'DEMOA',@sTable_Name=N'saTipoAjuste',
    //@sField_Name=N'Co_Tipo',@sValor=N'E01',@iOpcion=0
    public ArrayList<TipoAjusteBO> pObtenerListadoDatos(
         String Database_Name,
         String Table_Name,
         String sField_Name,
         String sValor,
         String iOpcion
    ) {
        ArrayList<TipoAjusteBO> lista = new ArrayList<TipoAjusteBO>();
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
                TipoAjusteBO ajusteBO = new TipoAjusteBO();
                ajusteBO.setCo_tipo(rs.getString("co_tipo"));
                ajusteBO.setDes_tipo(rs.getString("des_tipo"));
                ajusteBO.setTipo_trans(rs.getString("tipo_trans"));
                ajusteBO.setCampo1(rs.getString("campo1"));
                ajusteBO.setCampo2(rs.getString("campo2"));
                ajusteBO.setCampo3(rs.getString("campo3"));
                ajusteBO.setCampo4(rs.getString("campo4"));
                ajusteBO.setCampo5(rs.getString("campo5"));
                ajusteBO.setCampo6(rs.getString("campo6"));
                ajusteBO.setCampo7(rs.getString("campo7"));
                ajusteBO.setCampo8(rs.getString("campo8"));
                ajusteBO.setCo_us_in(rs.getString("co_us_in"));
                ajusteBO.setFe_us_in(rs.getString("fe_us_in"));
                ajusteBO.setCo_us_mo(rs.getString("co_us_mo"));
                ajusteBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                ajusteBO.setFe_us_mo(rs.getString("fe_us_mo"));
                ajusteBO.setRevisado(rs.getString("revisado"));
                ajusteBO.setTrasnfe(rs.getString("trasnfe"));
                ajusteBO.setValidador(rs.getString("validador"));
                lista.add(ajusteBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TipoAjusteModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
