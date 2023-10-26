/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ArtUbicacionBO;
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
 * @author eduardo
 */
public class ArtUbicacionModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public ArtUbicacionModel() {
        con = conexion.conexions();
    }

    public int pInsertarRenglonesArtUbicacion(
            int iRENG_NUM,
            String sCo_Art,
            String sCo_Alma,
            String sCo_Ubicacion,
            String sCo_Ubicacion2,
            String sCo_Ubicacion3,
            String sDes_Ubicacion,
            String iOrden,
            String sCo_Us_In,
            String sCo_Sucu_In,
            String sMaquina,
            String sTrasnfe,
            String sRevisado
    ) {
        try {
            cstmt = con.prepareCall("{CALL pInsertarRenglonesArtUbicacion("
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

            cstmt.setInt(1, iRENG_NUM);
            cstmt.setString(2, sCo_Art);
            cstmt.setString(3, sCo_Alma);
            cstmt.setString(4, sCo_Ubicacion);
            cstmt.setString(5, sCo_Ubicacion2);
            cstmt.setString(6, sCo_Ubicacion3);
            cstmt.setString(7, sDes_Ubicacion);
            cstmt.setString(8, iOrden);
            cstmt.setString(9, sCo_Us_In);
            cstmt.setString(10, sCo_Sucu_In);
            cstmt.setString(11, sMaquina);
            cstmt.setString(12, sTrasnfe);
            cstmt.setString(13, sRevisado);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ArtUbicacionModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pEliminarRenglonesArtUbicacion(
            String sCo_ArtOri,
            String sCo_AlmaOri,
            String sCo_UbicacionOri,
            String sCo_Ubicacion2Ori,
            String sCo_Ubicacion3Ori,
            String iOrdenOri,
            String sCo_Us_Mo,
            String sMaquina,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarRenglonesArtUbicacion("
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
            cstmt.setString(2, sCo_AlmaOri);
            cstmt.setString(3, sCo_UbicacionOri);
            cstmt.setString(4, sCo_Ubicacion2Ori);
            cstmt.setString(5, sCo_Ubicacion3Ori);
            cstmt.setString(6, iOrdenOri);
            cstmt.setString(7, sCo_Us_Mo);
            cstmt.setString(8, sMaquina);
            cstmt.setString(9, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(ArtUbicacionModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<ArtUbicacionBO> pObtenerListadoArtUbicacion(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        ArrayList<ArtUbicacionBO> lista = new ArrayList<ArtUbicacionBO>();
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
                ArtUbicacionBO artUbicacionBO = new ArtUbicacionBO();
                artUbicacionBO.setCo_alma(rs.getString("co_alma"));
                artUbicacionBO.setCo_art(rs.getString("co_art"));
                artUbicacionBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                artUbicacionBO.setCo_susu_in(rs.getString("co_sucu_in"));
                artUbicacionBO.setCo_ubicacion(rs.getString("co_ubicacion"));
                artUbicacionBO.setCo_ubicacion2(rs.getString("co_ubicacion2"));
                artUbicacionBO.setCo_ubicacion3(rs.getString("co_ubicacion3"));
                artUbicacionBO.setCo_ubicacion3_calculado(rs.getString("co_ubicacion3_calculado"));
                artUbicacionBO.setCo_ubicacion2_calculado(rs.getString("co_ubicacion2_calculado"));
                artUbicacionBO.setCo_us_in(rs.getString("co_us_in"));
                artUbicacionBO.setCo_us_mo(rs.getString("co_us_mo"));
                artUbicacionBO.setDes_ubicacion(rs.getString("des_ubicacion"));
                artUbicacionBO.setFe_us_in(rs.getString("fe_us_in"));
                artUbicacionBO.setFe_us_mo(rs.getString("fe_us_mo"));
                artUbicacionBO.setOrden(rs.getString("orden"));
                artUbicacionBO.setRevisado(rs.getString("revisado"));
                artUbicacionBO.setRowguid(rs.getString("rowguid"));
                artUbicacionBO.setTrasnfe(rs.getString("trasnfe"));
                artUbicacionBO.setValidador(rs.getString("validador"));
                lista.add(artUbicacionBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArtUbicacionModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    // pObtenerListadoDatosArtUbicacion 'Admin_a','saArtUbicacion','co_alma','','2','VAL'
    public ArrayList<ArtUbicacionBO> pObtenerListadoDatosArtUbicacion(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcio,
            String coSucu
    ) {
        ArrayList<ArtUbicacionBO> lista = new ArrayList<ArtUbicacionBO>();
        try {

            cstmt = con.prepareCall("{CALL pObtenerListadoDatosArtUbicacion("
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
            cstmt.setString(5, iOpcio);
             cstmt.setString(6, coSucu);
            
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                ArtUbicacionBO artUbicacionBO = new ArtUbicacionBO();
                artUbicacionBO.setCo_alma(rs.getString("co_alma"));
                artUbicacionBO.setCo_art(rs.getString("co_art"));
                artUbicacionBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                artUbicacionBO.setCo_susu_in(rs.getString("co_sucu_in"));
                artUbicacionBO.setCo_ubicacion(rs.getString("co_ubicacion"));
                artUbicacionBO.setCo_ubicacion2(rs.getString("co_ubicacion2"));
                artUbicacionBO.setCo_ubicacion3(rs.getString("co_ubicacion3"));
                artUbicacionBO.setCo_ubicacion3_calculado(rs.getString("co_ubicacion3_calculado"));
                artUbicacionBO.setCo_ubicacion2_calculado(rs.getString("co_ubicacion2_calculado"));
                artUbicacionBO.setCo_us_in(rs.getString("co_us_in"));
                artUbicacionBO.setCo_us_mo(rs.getString("co_us_mo"));
                artUbicacionBO.setDes_ubicacion(rs.getString("des_ubicacion"));
                artUbicacionBO.setFe_us_in(rs.getString("fe_us_in"));
                artUbicacionBO.setFe_us_mo(rs.getString("fe_us_mo"));
                artUbicacionBO.setOrden(rs.getString("orden"));
                artUbicacionBO.setRevisado(rs.getString("revisado"));
                artUbicacionBO.setRowguid(rs.getString("rowguid"));
                artUbicacionBO.setTrasnfe(rs.getString("trasnfe"));
                artUbicacionBO.setValidador(rs.getString("validador"));
                lista.add(artUbicacionBO);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ArtUbicacionModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

//    public static void main(String args[]) {
//        ArtUbicacionModel p = new ArtUbicacionModel();
//        int resul = p.pEliminarRenglonesArtUbicacion("0101002", "val", "ubi1", "Ubica2", "Ubica2", "1", "sCo_Us", "local", "sCo_Us");
//        System.out.println("Resultado : " + resul);
//    }
}
