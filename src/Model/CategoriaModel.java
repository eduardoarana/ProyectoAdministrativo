/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.CategoriaBO;

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
public class CategoriaModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;

    public CategoriaModel() {
        con = conexion.conexions();
    }

    public int pInsertarCategoria(
            String sCo_Cat,
            String sCat_Des,
            String sCo_Imun,
            String sCo_Reten,
            String sDis_Cen,
            String sCo_Sucu,
            String sCampo1,
            String sCampo2,
            String sCo_Us_In) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL  pInsertarCategoriaArticulo ("
                    + "?,?,?,?,?,?,"
                    + "?,?,?)}");
            cstmt.setString(1, sCo_Cat);
            cstmt.setString(2, sCat_Des);
            cstmt.setString(3, sCo_Imun);
            cstmt.setString(4, sCo_Reten);
            cstmt.setString(5, sDis_Cen);
            cstmt.setString(6, sCo_Sucu);
            cstmt.setString(7, sCampo1);
            cstmt.setString(8, sCampo2);
            cstmt.setString(9, sCo_Us_In);
            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public int pActualizarCategoriaArticulo(
            String sCo_Cat,
            String sCat_Des,
            String sDis_Cen,
            String sCo_Imun,
            String sCo_Reten,
            String sCampo1,
            String sCampo2,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL  pActualizarCategoriaArticulo"
                    + "(?,?,?,?,?,?,?,?,?)}");
            cstmt.setString(1, sCo_Cat);
            cstmt.setString(2, sCat_Des);
            cstmt.setString(3, sDis_Cen);
            cstmt.setString(4, sCo_Imun);
            cstmt.setString(5, sCo_Reten);
            cstmt.setString(6, sCampo1);
            cstmt.setString(7, sCampo2);
            cstmt.setString(8, sCo_Us_Mo);
            cstmt.setString(9, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public int pEliminarCategoriaArticulo(String coCatego) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL pEliminarCategoriaArticulo(?)}");
            cstmt.setString(1, coCatego);
            resultado = cstmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), e, "Software", JOptionPane.ERROR_MESSAGE);

        }
        return resultado;
    }

    public ArrayList<CategoriaBO> listaCategoriaArticulos() throws SQLException {
        ArrayList<CategoriaBO> lista = new ArrayList();
        cstmt = con.prepareCall("{CALL pObtenerCategoriaArticulo}");
        cstmt.execute();
        rs = cstmt.getResultSet();
        while (rs.next()) {
            CategoriaBO categoriaBO = new CategoriaBO();
            categoriaBO.setCo_cat(rs.getString("co_cat"));
            categoriaBO.setCat_des(rs.getString("cat_des"));
            categoriaBO.setCo_imun(rs.getString("co_imun"));
            categoriaBO.setCampo1(rs.getString("campo1"));
            categoriaBO.setCampo2(rs.getString("campo2"));
            categoriaBO.setFe_us_in(rs.getString("fe_us_in"));
            categoriaBO.setCo_us_mo(rs.getString("co_us_mo"));
            categoriaBO.setFe_us_mo(rs.getString("fe_us_mo"));
            categoriaBO.setValidador(rs.getString("validador"));
            lista.add(categoriaBO);
        }
        return lista;
    }

    public ArrayList<CategoriaBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<CategoriaBO> lista = new ArrayList<CategoriaBO>();
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
                CategoriaBO categoriaBO = new CategoriaBO();
                categoriaBO.setCo_cat(rs.getString("co_cat"));
                categoriaBO.setCat_des(rs.getString("cat_des"));
                categoriaBO.setCo_imun(rs.getString("co_imun"));
                categoriaBO.setCampo1(rs.getString("campo1"));
                categoriaBO.setCampo2(rs.getString("campo2"));
                categoriaBO.setFe_us_in(rs.getString("fe_us_in"));
                categoriaBO.setCo_us_mo(rs.getString("co_us_mo"));
                categoriaBO.setFe_us_mo(rs.getString("fe_us_mo"));
                categoriaBO.setValidador(rs.getString("validador"));
                lista.add(categoriaBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

//    public static void main(String args[]) {
//        CategoriaModel m = new CategoriaModel();
//        int resul = m.pActualizarCategoriaArticulo("cat", "descrip", "", "", "", "camp1", "camp2", "cousuar", "sucu");
//        System.out.println(resul);
//    }
}
