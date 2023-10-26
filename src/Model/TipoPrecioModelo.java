/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.TipoPrecioBO;
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
 * @author AranaV
 */
public class TipoPrecioModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public TipoPrecioModelo() {
        con = conexion.conexions();
    }

    public ArrayList<TipoPrecioBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<TipoPrecioBO> lista = new ArrayList<TipoPrecioBO>();
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
               TipoPrecioBO tipoPrecioBO = new TipoPrecioBO();
               tipoPrecioBO.setCampo1(rs.getString("campo1"));
               tipoPrecioBO.setCampo2(rs.getString("campo1"));
               tipoPrecioBO.setCampo3(rs.getString("campo1"));
               tipoPrecioBO.setCampo4(rs.getString("campo1"));
               tipoPrecioBO.setCampo5(rs.getString("campo1"));
               tipoPrecioBO.setCampo6(rs.getString("campo1"));
               tipoPrecioBO.setCampo7(rs.getString("campo1"));
               tipoPrecioBO.setCampo8(rs.getString("campo1"));
               tipoPrecioBO.setCo_precio(rs.getString("co_precio"));
               tipoPrecioBO.setCo_sucu_in(rs.getString("co_sucu_in"));
               tipoPrecioBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
               tipoPrecioBO.setCo_us_in(rs.getString("co_us_in"));
               tipoPrecioBO.setDes_precio(rs.getString("des_precio"));
               tipoPrecioBO.setFe_us_in(rs.getString("fe_us_in"));
               tipoPrecioBO.setFe_us_mo(rs.getString("fe_us_mo"));
               tipoPrecioBO.setIncluye_imp(rs.getString("incluye_imp"));
               tipoPrecioBO.setRevidsado(rs.getString("revisado"));
               tipoPrecioBO.setTrasnfe(rs.getString("trasnfe"));
               tipoPrecioBO.setValidador(rs.getString("validador"));
               
               lista.add(tipoPrecioBO);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TipoPrecioModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return lista;
    }

}
