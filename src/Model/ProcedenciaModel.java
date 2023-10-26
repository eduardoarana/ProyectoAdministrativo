/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ProcedenciaBO;
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
public class ProcedenciaModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;

    public ProcedenciaModel() {
        con = conexion.conexions();
    }

    public int pInsertarProcedencia(
            String sCod_Proc,
            String sDes_Proc,
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
            cstmt = con.prepareCall("{CALL pInsertarProcedencia("
                    + "?,"
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
            cstmt.setString(1, sCod_Proc);
            cstmt.setString(2, sDes_Proc);
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
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }

        return resultado;

    }

    public int pActualizarProcedencia(
            String sCod_Proc,
            String sCod_ProcOri,
            String sDes_Proc,
            String sCampo1,
            String sCampo2,
            String sCampo3,
            String sCampo4,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo,
            String sMaquina,
            String sRevisado,
            String sTrasnfe) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL pActualizarProcedencia("
                    + "?,"
                    + "?,"
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
            cstmt.setString(1, sCod_Proc);
            cstmt.setString(2, sCod_ProcOri);
            cstmt.setString(3, sDes_Proc);
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

        } catch (SQLException ex) {
            Logger.getLogger(ProcedenciaModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;

    }

    public int pEliminarProcedencia(String co_proc, String Maquina, String co_us_mo, String co_sucu_mo) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL pEliminarProcedencia (?,?,?,?)}");
            cstmt.setString(1, co_proc);
            cstmt.setString(2, Maquina);
            cstmt.setString(3, co_us_mo);
            cstmt.setString(4, co_sucu_mo);

            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProcedenciaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<ProcedenciaBO> listaProcedencia() {
        ArrayList<ProcedenciaBO> lista = new ArrayList<ProcedenciaBO>();
        try {
            cstmt = con.prepareCall("{CALL pObtenerProcedencia}");
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                ProcedenciaBO procedenciaBO = new ProcedenciaBO();
                procedenciaBO.setCod_proc(rs.getString("cod_proc"));
                procedenciaBO.setDes_proc(rs.getString("des_proc"));
                procedenciaBO.setCampo1(rs.getString("campo1"));
                procedenciaBO.setCampo2(rs.getString("campo2"));
                procedenciaBO.setCampo3(rs.getString("campo3"));
                procedenciaBO.setCampo4(rs.getString("campo4"));
                procedenciaBO.setCampo5(rs.getString("campo5"));
                procedenciaBO.setCampo6(rs.getString("campo6"));
                procedenciaBO.setCampo7(rs.getString("campo7"));
                procedenciaBO.setCampo8(rs.getString("campo8"));
                procedenciaBO.setCo_us_in(rs.getString("co_us_in"));
                procedenciaBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                procedenciaBO.setFe_us_in(rs.getString("fe_us_in"));
                procedenciaBO.setDes_proc(rs.getString("des_proc"));
                procedenciaBO.setCo_us_mo(rs.getString("co_us_mo"));
                procedenciaBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                procedenciaBO.setFe_us_mo(rs.getString("fe_us_mo"));
                procedenciaBO.setRevisado(rs.getString("revisado"));
                procedenciaBO.setTrasnfe(rs.getString("trasnfe"));
                procedenciaBO.setValidador(rs.getString("validador"));
                lista.add(procedenciaBO);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProcedenciaModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public ArrayList<ProcedenciaBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {

         ArrayList<ProcedenciaBO> lista = new ArrayList<ProcedenciaBO>();
        
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
                 ProcedenciaBO procedenciaBO = new ProcedenciaBO();
                procedenciaBO.setCod_proc(rs.getString("cod_proc"));
                procedenciaBO.setDes_proc(rs.getString("des_proc"));
                procedenciaBO.setCampo1(rs.getString("campo1"));
                procedenciaBO.setCampo2(rs.getString("campo2"));
                procedenciaBO.setCampo3(rs.getString("campo3"));
                procedenciaBO.setCampo4(rs.getString("campo4"));
                procedenciaBO.setCampo5(rs.getString("campo5"));
                procedenciaBO.setCampo6(rs.getString("campo6"));
                procedenciaBO.setCampo7(rs.getString("campo7"));
                procedenciaBO.setCampo8(rs.getString("campo8"));
                procedenciaBO.setCo_us_in(rs.getString("co_us_in"));
                procedenciaBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                procedenciaBO.setFe_us_in(rs.getString("fe_us_in"));
                procedenciaBO.setDes_proc(rs.getString("des_proc"));
                procedenciaBO.setCo_us_mo(rs.getString("co_us_mo"));
                procedenciaBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                procedenciaBO.setFe_us_mo(rs.getString("fe_us_mo"));
                procedenciaBO.setRevisado(rs.getString("revisado"));
                procedenciaBO.setTrasnfe(rs.getString("trasnfe"));
                procedenciaBO.setValidador(rs.getString("validador"));
                lista.add(procedenciaBO);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProcedenciaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
