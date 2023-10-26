/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import Beans.UnidadBO;
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
public class UnidadModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;

    public UnidadModel() {
        con = conexion.conexions();
    }

    public int insertarUnidad(
            String co_unidad,
            String sDes_Uni,
            String sCampo1,
            String sCampo2,
            String sCo_Us_In) {
        int resultado = 0;

        try {

            cstmt = con.prepareCall("{ CALL  pInsertarUnidad("
                    + "?,?,?,?,?"
                    + " )}");
            cstmt.setString(1, co_unidad);
            cstmt.setString(2, sDes_Uni);
            cstmt.setString(3, sCampo1);
            cstmt.setString(4, sCampo2);
            cstmt.setString(5, sCo_Us_In);
            resultado = cstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public int actualizarUnidad(
            String co_unidad,
            String sDes_Uni,
            String sCampo1,
            String sCampo2,
            String sCo_Us_mo) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL  pActualizarUnidad(?,?,?,?,?)}");
            cstmt.setString(1, co_unidad);
            cstmt.setString(2, sDes_Uni);
            cstmt.setString(3, sCampo1);
            cstmt.setString(4, sCampo2);
            cstmt.setString(5, sCo_Us_mo);

            resultado = cstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultado;
    }

    public int eliminaUnidad(String codUnidad) throws SQLException {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL  pEliminarUnidad("
                    + "?"
                    + ")}");
            cstmt.setString(1, codUnidad);

            resultado = cstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public ArrayList<UnidadBO> listaUnidades() throws SQLException {
        ArrayList<UnidadBO> listas = new ArrayList();
        cstmt = con.prepareCall("{CALL pObtenerUnidad}");
        cstmt.execute();
        rs = cstmt.getResultSet();
        while (rs.next()) {
            UnidadBO unidad = new UnidadBO();
            unidad.setCo_uni(rs.getString("co_uni"));
            unidad.setDes_uni(rs.getString("Des_uni"));
            listas.add(unidad);
        }
        return listas;
    }

    public ArrayList<UnidadBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<UnidadBO> listas = new ArrayList<UnidadBO>();
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
                UnidadBO unidad = new UnidadBO();
                unidad.setCo_uni(rs.getString("co_uni"));
                unidad.setDes_uni(rs.getString("Des_uni"));
                unidad.setCampo1(rs.getString("campo1"));
                unidad.setCampo2(rs.getString("campo2"));
                unidad.setCampo3(rs.getString("campo3"));
                unidad.setCampo4(rs.getString("campo4"));
                unidad.setCampo5(rs.getString("campo5"));
                unidad.setCampo6(rs.getString("campo6"));
                unidad.setCampo7(rs.getString("campo7"));
                unidad.setCampo8(rs.getString("campo8"));
                unidad.setCo_sucu_in(rs.getString("co_sucu_in"));
                unidad.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                unidad.setCo_us_in(rs.getString("co_us_in"));
                unidad.setCo_us_mo(rs.getString("co_us_mo"));
                
                listas.add(unidad);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UnidadModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listas;
    }
    
    
    
    
    

  /*  public static void main(String args[]) {
        int resultado = 0;
        UnidadModel uni = new UnidadModel();
        resultado = uni.actualizarUnidad("KG", "descri", "camp", "camp2", "we");
        System.out.println(resultado);
    }*/
}
