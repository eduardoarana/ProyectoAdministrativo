/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.UbicacionBO;
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
public class UbicacionModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;

    public UbicacionModel() {
        con = conexion.conexions();
    }

    public int pInsertarUbicacion(
            String sCo_Ubicacion,
            String sDes_Ubicacion,
            String sCampo1,
            String sCampo2,
            String sCampo3,
            String sCampo4,
            String sCo_Us_In,
            String sCo_Sucu_In) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL  pInsertarUbicacion("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ") }");
            cstmt.setString(1, sCo_Ubicacion);
            cstmt.setString(2, sDes_Ubicacion);
            cstmt.setString(3, sCampo1);
            cstmt.setString(4, sCampo2);
            cstmt.setString(5, sCampo3);
            cstmt.setString(6, sCampo4);
            cstmt.setString(7, sCo_Us_In);
            cstmt.setString(8, sCo_Sucu_In);
            resultado = cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }
    public int pActualizarUbicacion(
            String sCo_Ubicacion,
            String sCo_UbicacionOri,
            String sDes_Ubicacion,
            String sCampo1,
            String sCampo2,
            String sCampo3,
            String sCampo4,
            String sCo_Us_In,
            String sCo_Sucu_In) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL  pActualizarUbicacion("
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
            cstmt.setString(1, sCo_Ubicacion);
            cstmt.setString(2, sCo_UbicacionOri);
            cstmt.setString(3, sDes_Ubicacion);
            cstmt.setString(4, sCampo1);
            cstmt.setString(5, sCampo2);
            cstmt.setString(6, sCampo3);
            cstmt.setString(7, sCampo4);
            cstmt.setString(8, sCo_Us_In);
            cstmt.setString(9, sCo_Sucu_In);

            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }

        return resultado;
    }

    public int pEliminarUbicacion(String co_ubicacon) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL  pEliminarUbicacion(?)}");
            cstmt.setString(1, co_ubicacon);
            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public ArrayList<UbicacionBO> listaUbicacion() throws SQLException {
        ArrayList<UbicacionBO> lista = new ArrayList<>();

        cstmt = con.prepareCall("{CALL pObtenerUbicacion}");
        cstmt.execute();
        rs = cstmt.getResultSet();
        while (rs.next()) {
            UbicacionBO ubicacionBO = new UbicacionBO();
            ubicacionBO.setCo_ubicacion(rs.getString("co_ubicacion"));
            ubicacionBO.setDes_ubicacion(rs.getString("des_ubicacion"));
            ubicacionBO.setCampo1(rs.getString("campo1"));
            ubicacionBO.setCampo2(rs.getString("campo2"));
            ubicacionBO.setCo_sucu_in(rs.getString("co_sucu_in"));
            ubicacionBO.setFe_us_in(rs.getString("fe_us_in"));
            ubicacionBO.setCo_us_mo(rs.getString("co_us_mo"));
            ubicacionBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
            ubicacionBO.setFe_us_mo(rs.getString("fe_us_mo"));
            ubicacionBO.setRevisado(rs.getString("revisado"));
            ubicacionBO.setTrasnfe(rs.getString("trasnfe"));
            ubicacionBO.setValidador(rs.getString("validador"));
            lista.add(ubicacionBO);
        }
        return lista;
    }

    public ArrayList<UbicacionBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<UbicacionBO> lista = new ArrayList<>();
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
            while (rs.next()){
                UbicacionBO ubicacionBO = new UbicacionBO();
                ubicacionBO.setCo_ubicacion(rs.getString("co_ubicacion"));
                ubicacionBO.setDes_ubicacion(rs.getString("des_ubicacion"));
                ubicacionBO.setCampo1(rs.getString("campo1"));
                ubicacionBO.setCampo2(rs.getString("campo2"));
                ubicacionBO.setCampo3(rs.getString("campo3"));
                ubicacionBO.setCampo4(rs.getString("campo4"));
                
                ubicacionBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                ubicacionBO.setFe_us_in(rs.getString("fe_us_in"));
                ubicacionBO.setCo_us_mo(rs.getString("co_us_mo"));
                ubicacionBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                ubicacionBO.setFe_us_mo(rs.getString("fe_us_mo"));
                ubicacionBO.setRevisado(rs.getString("revisado"));
                ubicacionBO.setTrasnfe(rs.getString("trasnfe"));
                ubicacionBO.setValidador(rs.getString("validador"));
                lista.add(ubicacionBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UbicacionModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;

    }

}
