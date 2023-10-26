/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ArtPrecioBO;
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
 * @author jenny
 */
public class ArtPrecioModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public ArtPrecioModel() {
        con = conexion.conexions();
    }

    public int pInsertarRenglonesPrecioArticulo(
            String iRENG_NUMOri,
            String sCo_Art,
            String sCo_Precio,
            String dDesde,
            String sCo_Alma,
            String dHasta,
            String deMonto,
            String bPrecioOm,
            String deMargenMin,
            String deMargenMax,
            String deMargenMinV,
            String sco_mone,
            String binactivo,
            String sCo_Us_In,
            String sCo_Sucu_In,
            String sMaquina,
            String sRevisado,
            String sTrasnfe
    ) {
        try {
            cstmt = con.prepareCall("{CALL pInsertarRenglonesPrecioArticulo("
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
                    + ")}");
            cstmt.setString(1, iRENG_NUMOri);
            cstmt.setString(2, sCo_Art);
            cstmt.setString(3, sCo_Precio);
            cstmt.setString(4, dDesde);
            cstmt.setString(5, sCo_Alma);
            cstmt.setString(6, dHasta);
            cstmt.setString(7, deMonto);
            cstmt.setString(8, bPrecioOm);
            cstmt.setString(9, deMargenMin);
            cstmt.setString(10, deMargenMax);
            cstmt.setString(11, deMargenMinV);

            cstmt.setString(12, sco_mone);
            cstmt.setString(13, binactivo);
            cstmt.setString(14, sCo_Us_In);
            cstmt.setString(15, sCo_Sucu_In);
            cstmt.setString(16, sMaquina);
            cstmt.setString(17, sRevisado);
            cstmt.setString(18, sTrasnfe);

            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ArtPrecioModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pEliminarRenglonesPrecioArticulo(
            String sCo_ArtOri,
            String sCo_PrecioOri,
            String sCo_AlmaOri,
            String sCo_Alma_CalculadoOri,
            String dDesdeOri,
            String bPrecioOmOri,
         //   String sco_mone,
          //  String binactivo,
            String sCo_Us_Mo,
            String sMaquina,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarRenglonesPrecioArticulo("
                   
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
            cstmt.setString(1, sCo_ArtOri);
            cstmt.setString(2, sCo_PrecioOri);
            cstmt.setString(3, sCo_AlmaOri);
            cstmt.setString(4, sCo_Alma_CalculadoOri);
            cstmt.setString(5, dDesdeOri);
            cstmt.setString(6, bPrecioOmOri);
           // cstmt.setString(8, sco_mone);
          //  cstmt.setString(9, binactivo);
            cstmt.setString(7, sCo_Us_Mo);
            cstmt.setString(8, sMaquina);
            cstmt.setString(9, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(ArtPrecioModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public ArrayList<ArtPrecioBO> pObtenerListadoDatosPrecios(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<ArtPrecioBO> lista = new ArrayList<>();
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
                ArtPrecioBO artPrecioBO = new ArtPrecioBO();
                artPrecioBO.setCo_alma(rs.getString("co_alma"));
                artPrecioBO.setCo_art(rs.getString("co_art"));
                artPrecioBO.setCo_precio(rs.getString("co_precio"));
                artPrecioBO.setCo_mone(rs.getString("co_mone"));
                artPrecioBO.setCo_alma_calculado(rs.getString("co_alma_calculado"));
                artPrecioBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                artPrecioBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                artPrecioBO.setCo_us_in(rs.getString("co_us_in"));
                artPrecioBO.setCo_us_mo(rs.getString("co_us_mo"));
                artPrecioBO.setDesde(rs.getString("desde"));
                artPrecioBO.setHasta(rs.getString("hasta"));
                artPrecioBO.setFe_us_in(rs.getString("fe_us_in"));
                artPrecioBO.setFe_us_mo(rs.getString("fe_us_mo"));
                artPrecioBO.setMonto(rs.getString("monto"));
                artPrecioBO.setInactivo(rs.getString("inactivo"));
                artPrecioBO.setMontoadi1(rs.getString("montoadi1"));
                artPrecioBO.setMontoadi2(rs.getString("montoadi2"));
                artPrecioBO.setMontoadi3(rs.getString("montoadi3"));
                artPrecioBO.setMontoadi4(rs.getString("montoadi4"));
                artPrecioBO.setMontoadi5(rs.getString("montoadi5"));
                artPrecioBO.setPrecioOm(rs.getString("precioOm"));
                artPrecioBO.setRevisado(rs.getString("revisado"));
                artPrecioBO.setTrasnfe(rs.getString("trasnfe"));
                lista.add(artPrecioBO);
            }

            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ArtPrecioModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public ArrayList<ArtPrecioBO> pBuscarPrecios(
            String sCo_Art,
            String sAlmacen,
            String smonto
    ) {
        ArrayList<ArtPrecioBO> lista = new ArrayList<>();

        try {
            cstmt = con.prepareCall("{CALL pBuscarPrecios("
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            
            cstmt.setString(1, sCo_Art);
            cstmt.setString(2, sAlmacen);
            cstmt.setString(3, smonto);
            
             cstmt.execute();
            rs = cstmt.getResultSet();
           
            while (rs.next()) {
                ArtPrecioBO artPrecioBO = new ArtPrecioBO();
                artPrecioBO.setCo_alma(rs.getString("co_alma"));
                artPrecioBO.setCo_art(rs.getString("co_art"));
                artPrecioBO.setCo_precio(rs.getString("co_precio"));
                artPrecioBO.setCo_mone(rs.getString("co_mone"));
                artPrecioBO.setCo_alma_calculado(rs.getString("co_alma_calculado"));
                artPrecioBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                artPrecioBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                artPrecioBO.setCo_us_in(rs.getString("co_us_in"));
                artPrecioBO.setCo_us_mo(rs.getString("co_us_mo"));
                artPrecioBO.setDesde(rs.getString("desde"));
                artPrecioBO.setHasta(rs.getString("hasta"));
                artPrecioBO.setFe_us_in(rs.getString("fe_us_in"));
                artPrecioBO.setFe_us_mo(rs.getString("fe_us_mo"));
                artPrecioBO.setMonto(rs.getString("monto"));
                artPrecioBO.setInactivo(rs.getString("inactivo"));
                artPrecioBO.setMontoadi1(rs.getString("montoadi1"));
                artPrecioBO.setMontoadi2(rs.getString("montoadi2"));
                artPrecioBO.setMontoadi3(rs.getString("montoadi3"));
                artPrecioBO.setMontoadi4(rs.getString("montoadi4"));
                artPrecioBO.setMontoadi5(rs.getString("montoadi5"));
                artPrecioBO.setPrecioOm(rs.getString("precioOm"));
                artPrecioBO.setRevisado(rs.getString("revisado"));
                artPrecioBO.setTrasnfe(rs.getString("trasnfe"));
                lista.add(artPrecioBO);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ArtPrecioModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

   
}
