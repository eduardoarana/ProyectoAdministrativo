/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.StockxAlmacenBO;
import Conection.Conexion;
import static Model.ArtUbicacionModel.con;
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
public class StockxAlmacenModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public StockxAlmacenModel() {
        con = conexion.conexions();

    }

    public ArrayList<StockxAlmacenBO> pConsultarStockxAlmacen(String pco_art, String pco_alma, String tipoSP) {

        ArrayList<StockxAlmacenBO> lista = new ArrayList<>();
        try {
            if (tipoSP.equals("total")) {

                cstmt = con.prepareCall("{CALL pConsultarStock("
                        + "?,"
                        + "?"
                        + ")}");
            } else {

                cstmt = con.prepareCall("{CALL pConsultarStockxAlmacen("
                        + "?,"
                        + "?"
                        + ")}");
            }

            cstmt.setString(1, pco_art);
            cstmt.setString(2, pco_alma);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                StockxAlmacenBO stockxAlmacenBO = new StockxAlmacenBO();
                stockxAlmacenBO.setCo_art(rs.getString("Co_art"));
                stockxAlmacenBO.setCo_alma(rs.getString("co_alma"));
                //stockxAlmacenBO.setDes_alma(rs.getString("Des_alma"));
                stockxAlmacenBO.setDescripcion(rs.getString("Descripcion"));
                // stockxAlmacenBO.setRevisado(rs.getString("revisado"));
                stockxAlmacenBO.setSstock_act(rs.getString("Sstock_act"));
                stockxAlmacenBO.setSstock_com(rs.getString("Sstock_com"));
                stockxAlmacenBO.setSstock_des(rs.getString("Sstock_des"));
                stockxAlmacenBO.setSstock_lle(rs.getString("Sstock_lle"));
                //stockxAlmacenBO.setStock(rs.getString("Stock"));
                stockxAlmacenBO.setStock_act(rs.getString("Stock_act"));
                stockxAlmacenBO.setStock_com(rs.getString("Stock_com"));
                stockxAlmacenBO.setStock_des(rs.getString("Stock_des"));
                //   stockxAlmacenBO.setStock_descripcions(rs.getString("Stock_descripcions"));
                stockxAlmacenBO.setStock_lle(rs.getString("Stock_lle"));
                //   stockxAlmacenBO.setTipo(rs.getString("tipo"));
                //    stockxAlmacenBO.setTrasnfe(rs.getString("Trasnfe"));
                stockxAlmacenBO.setUnidad(rs.getString("Unidad"));
                stockxAlmacenBO.setUnidads(rs.getString("Unidads"));
                //  stockxAlmacenBO.setValidador(rs.getString("Validador"));

                lista.add(stockxAlmacenBO);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(StockxAlmacenModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public int pInsertarStockAlmacen(
            String sco_alma,
            String sco_art,
            String stipo,
            double sStock,
            String sRevisado,
            String sTrasnfe
    ) {
        try {
            cstmt = con.prepareCall("{CALL  pInsertarStockAlmacen("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}"
            );
            cstmt.setString(1, sco_alma);
            cstmt.setString(2, sco_art);
            cstmt.setString(3, stipo);
            cstmt.setDouble(4, sStock);
            cstmt.setString(5, sRevisado);
            cstmt.setString(6, sTrasnfe);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }

    public int pStockActualizar(
            String sCo_Alma,
            String sCo_Art,
            String sCo_Uni,
            int deCantidad,
            int bSumarStock,
            int bPermiteStockNegativo
    ) {
        try {
            cstmt = con.prepareCall("{CALL  pInsertarStockAlmacen("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultado;
    }

}
