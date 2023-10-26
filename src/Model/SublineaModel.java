/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.LineaBO;
import Beans.SubLineaBO;
import Conection.Conexion;
import Utilitarios.Utilitario;

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
public class SublineaModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;

    public SublineaModel() {
        con = conexion.conexions();
    }
//obtener el id de la linea para guardar  en la sublinea 

    public String obtenerLinea(String descripcionLinea) {
        String resultado = "";
        try {
            cstmt = con.prepareCall("{CALL pObtenerLineaID(?)}");
            cstmt.setString(1, descripcionLinea);

            rs = cstmt.executeQuery();

            while (rs.next()) {
                LineaBO lineaBO = new LineaBO();
                lineaBO.setCo_lin(rs.getString("Co_lin"));
                resultado = lineaBO.getCo_lin();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public String pObtenerLineaDescripcion(String idcoLinea) {
        String descripcion = "";
        try {
            cstmt = con.prepareCall("{CALL pObtenerLineaDescripcion(?)}");
            cstmt.setString(1, idcoLinea);

            rs = cstmt.executeQuery();

            while (rs.next()) {
                LineaBO lineaBO = new LineaBO();
                lineaBO.setLin_des(rs.getString("lin_des"));
                descripcion = lineaBO.getLin_des();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return descripcion;
    }

    public int pInsertarSubLinea(
            String sCo_Subl,
            String sSubl_Des,
            String sCo_Lin,
            String sCampo1,
            String sCampo2,
            String sCo_Us_In,
            String sCo_Sucu_In,
            String sCo_Imun,
            String sCo_Reten,
            String sI_Subl_Des) {
        int resultado = 0;

        try {
            String Co_Lin = obtenerLinea(sCo_Lin);

            cstmt = con.prepareCall("{CALL  pInsertarSubLinea (?,?,?,?,?,?,?,?,?,?)}");

            cstmt.setString(1, sCo_Subl);
            cstmt.setString(2, sSubl_Des);
            cstmt.setString(3, Co_Lin);
            cstmt.setString(4, sCampo1);
            cstmt.setString(5, sCampo2);
            cstmt.setString(6, sCo_Us_In);
            cstmt.setString(7, sCo_Sucu_In);
            cstmt.setString(8, sCo_Imun);
            cstmt.setString(9, sCo_Reten);
            cstmt.setString(10, sI_Subl_Des);
            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }

        return resultado;
    }

    public int pActualizarSubLinea(
            String sCo_Subl,
            String sSubl_Des,
            String sCo_Lin,
            String sCampo1,
            String sCampo2,
            String sI_Subl_Des,
            String sCo_Imun,
            String sCo_Reten,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo) {
        int resultado = 0;
        try {
            String Co_Lin = obtenerLinea(sCo_Lin);

            cstmt = con.prepareCall("{CALL pActualizarSubLinea(?,"
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
            cstmt.setString(1, sCo_Subl);
            cstmt.setString(2, sSubl_Des);
            cstmt.setString(3, Co_Lin);
            cstmt.setString(4, sCampo1);
            cstmt.setString(5, sCampo2);
            cstmt.setString(6, sI_Subl_Des);
            cstmt.setString(7, sCo_Imun);
            cstmt.setString(8, sCo_Reten);
            cstmt.setString(9, sCo_Us_Mo);
            cstmt.setString(10, sCo_Sucu_Mo);

            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }

        return resultado;
    }

    public int pEliminarSubLinea(String coSublinea) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL pEliminarSubLinea(?)}");
            cstmt.setString(1, coSublinea);
            resultado = cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }
        return resultado;
    }

    public ArrayList<SubLineaBO> listaSubLineas() throws SQLException {
        ArrayList<SubLineaBO> lista = new ArrayList<SubLineaBO>();
        cstmt = con.prepareCall("{CALL pObtenerSubLinea}");
        cstmt.execute();
        rs = cstmt.getResultSet();
        while (rs.next()) {
            SubLineaBO subLineaBO = new SubLineaBO();
            subLineaBO.setCo_subl(rs.getString("co_subl"));
            subLineaBO.setSubl_des(rs.getString("subl_des"));
            subLineaBO.setCo_imun(rs.getString("co_imun"));
            subLineaBO.setCo_reten(rs.getString("co_reten"));
            subLineaBO.setI_subl_des(rs.getString("i_subl_des"));
            subLineaBO.setCo_lin(rs.getString("co_lin"));
            subLineaBO.setCampo1(rs.getString("campo1"));
            subLineaBO.setCampo2(rs.getString("campo2"));
            subLineaBO.setCampo3(rs.getString("campo3"));
            subLineaBO.setCampo4(rs.getString("campo4"));
            subLineaBO.setCampo5(rs.getString("campo5"));
            subLineaBO.setCampo6(rs.getString("campo6"));
            subLineaBO.setCampo7(rs.getString("campo7"));
            subLineaBO.setCampo8(rs.getString("campo8"));
            subLineaBO.setCo_us_in(rs.getString("co_us_in"));
            subLineaBO.setFe_us_in(rs.getString("fe_us_in"));
            subLineaBO.setCo_us_mo(rs.getString("co_us_mo"));
            subLineaBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
            subLineaBO.setFe_us_mo(rs.getString("fe_us_mo"));
            subLineaBO.setRevisado(rs.getString("revisado"));
            subLineaBO.setTrasnfe(rs.getString("trasnfe"));
            subLineaBO.setValidador(rs.getString("validador"));

            lista.add(subLineaBO);

        }
        return lista;
    }
//exec pObtenerListadoDatosSubLinea 'demoa','saSubLinea','co_subl','','','10'

    public ArrayList<SubLineaBO> pObtenerListadoDatosSubLinea(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion,
            String sCo_lin
    ) {
        ArrayList<SubLineaBO> lista = new ArrayList<SubLineaBO>();
        try {

            if (sCo_lin.equals("1")) {
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

            } else {
                cstmt = con.prepareCall("{CALL pObtenerListadoDatosSubLinea("
                        + "?,"
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
                cstmt.setString(6, sCo_lin);
            }

            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                SubLineaBO subLineaBO = new SubLineaBO();
                subLineaBO.setCo_subl(rs.getString("co_subl"));
                subLineaBO.setSubl_des(rs.getString("subl_des"));
                subLineaBO.setCo_imun(rs.getString("co_imun"));
                subLineaBO.setCo_reten(rs.getString("co_reten"));
                subLineaBO.setI_subl_des(rs.getString("i_subl_des"));
                subLineaBO.setCo_lin(rs.getString("co_lin"));
                subLineaBO.setCampo1(rs.getString("campo1"));
                subLineaBO.setCampo2(rs.getString("campo2"));
                subLineaBO.setCampo3(rs.getString("campo3"));
                subLineaBO.setCampo4(rs.getString("campo4"));
                subLineaBO.setCampo5(rs.getString("campo5"));
                subLineaBO.setCampo6(rs.getString("campo6"));
                subLineaBO.setCampo7(rs.getString("campo7"));
                subLineaBO.setCampo8(rs.getString("campo8"));
                subLineaBO.setCo_us_in(rs.getString("co_us_in"));
                subLineaBO.setFe_us_in(rs.getString("fe_us_in"));
                subLineaBO.setCo_us_mo(rs.getString("co_us_mo"));
                subLineaBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                subLineaBO.setFe_us_mo(rs.getString("fe_us_mo"));
                subLineaBO.setRevisado(rs.getString("revisado"));
                subLineaBO.setTrasnfe(rs.getString("trasnfe"));
                subLineaBO.setValidador(rs.getString("validador"));
                lista.add(subLineaBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SublineaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
