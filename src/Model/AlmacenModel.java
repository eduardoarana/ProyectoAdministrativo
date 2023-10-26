/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.AlmacenBO;
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
public class AlmacenModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;

    public AlmacenModel() {
        con = conexion.conexions();
    }

    public int pInsertarAlmacen(
            String sCo_Alma,
            String sDes_Alma,
            String sCo_Sucur,
            String bNoventa,
            String bNoCompra,
            String bMateriales,
            String bProduccion,
            String bAlm_Temp,
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
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL pInsertarAlmacen("
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
                    + "?,"
                    + "?,"
                    + "?"
                    + ") }");

            cstmt.setString(1, sCo_Alma);
            cstmt.setString(2, sDes_Alma);
            cstmt.setString(3, sCo_Sucur);
            cstmt.setString(4, bNoventa);
            cstmt.setString(5, bNoCompra);
            cstmt.setString(6, bMateriales);
            cstmt.setString(7, bProduccion);
            cstmt.setString(8, bAlm_Temp);
            cstmt.setString(9, sCampo1);
            cstmt.setString(10, sCampo2);
            cstmt.setString(11, sCampo3);
            cstmt.setString(12, sCampo4);
            cstmt.setString(13, sCampo5);
            cstmt.setString(14, sCampo6);
            cstmt.setString(15, sCampo7);
            cstmt.setString(16, sCampo8);
            cstmt.setString(17, sCo_Us_In);
            cstmt.setString(18, sCo_Sucu_In);
            cstmt.setString(19, sMaquina);
            cstmt.setString(20, sRevisado);
            cstmt.setString(21, sTrasnfe);
            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public int pActualizarAlmacen(
            String sCo_Alma,
            String sCo_AlmaOri,
            String sDes_Alma,
            String sCo_Sucur,
            String bNoVenta,
            String bNoCompra,
            String bMateriales,
            String bProduccion,
            String bAlm_Temp,
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
        int resultado = 0;
        try {
            
            cstmt = con.prepareCall("{CALL pActualizarAlmacen("
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
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ") }");
            cstmt.setString(1, sCo_Alma);
            cstmt.setString(2, sCo_AlmaOri);
            cstmt.setString(3, sDes_Alma);
            cstmt.setString(4, sCo_Sucur);
            cstmt.setString(5, bNoVenta);
            cstmt.setString(6, bNoCompra);
            cstmt.setString(7, bMateriales);
            cstmt.setString(8, bProduccion);
            cstmt.setString(9, bAlm_Temp);
            cstmt.setString(10, sCampo1);
            cstmt.setString(11, sCampo2);
            cstmt.setString(12, sCampo3);
            cstmt.setString(13, sCampo4);
            cstmt.setString(14, sCampo5);
            cstmt.setString(15, sCampo6);
            cstmt.setString(16, sCampo7);
            cstmt.setString(17, sCampo8);
            cstmt.setString(18, sCo_Us_In);
            cstmt.setString(19, sCo_Sucu_In);
            cstmt.setString(20, sMaquina);
            cstmt.setString(21, sRevisado);
            cstmt.setString(22, sTrasnfe);
            

            resultado = cstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public int pEliminarAlmacen(
            String sCo_AlmaOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL pEliminarAlmacen(?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            cstmt.setString(1, sCo_AlmaOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public ArrayList<AlmacenBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {

        ArrayList<AlmacenBO> lista = new ArrayList();
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
                AlmacenBO almacenBO = new AlmacenBO();
                almacenBO.setAlm_temp(rs.getString("alm_temp"));
                almacenBO.setCampo1(rs.getString("campo1"));
                almacenBO.setCampo2(rs.getString("campo2"));
                almacenBO.setCampo3(rs.getString("campo3"));
                almacenBO.setCampo4(rs.getString("campo4"));
                almacenBO.setCampo5(rs.getString("campo5"));
                almacenBO.setCampo6(rs.getString("campo6"));
                almacenBO.setCampo7(rs.getString("campo7"));
                almacenBO.setCampo8(rs.getString("campo8"));
                almacenBO.setCo_alma(rs.getString("co_alma"));
                almacenBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                almacenBO.setCo_us_mo(rs.getString("co_us_mo"));
                almacenBO.setDes_alma(rs.getString("des_alma"));
                almacenBO.setFe_us_in(rs.getString("fe_us_in"));
                almacenBO.setFe_us_in(rs.getString("fe_us_in"));
                almacenBO.setMateriales(rs.getString("materiales"));
                almacenBO.setNocompra(rs.getString("nocompra"));
                almacenBO.setNoventa(rs.getString("noventa"));
                almacenBO.setProduccion(rs.getString("produccion"));
                almacenBO.setCo_sucur(rs.getString("co_sucur"));
                almacenBO.setDescripcionSucursal(Utilitarios.Utilitario.getTablaId(con, "saSucursal", "co_sucur", "sucur_des", rs.getString("co_sucur")));
                
                
                
                lista.add(almacenBO);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }

}
