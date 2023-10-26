/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ArtUnidadBO;
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
public class ArtUnidadModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    int resultado = 0;

    public ArtUnidadModel() {
        con = conexion.conexions();
    }

    public int pInsertarUnidadArticuloRenglon(
            String sCo_Art,
            String sCo_Uni,
            String iReng_Num,
            String bRelacion,
            String deEquivalencia,
            String bUso_Venta,
            String bUso_Compra,
            String bUni_Principal,
            String bUso_Principal,
            String bUni_Secundaria,
            String bUso_Secundaria,
            String bUso_NumDecimales,
            String iNum_Decimales,
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
        try {
            cstmt = con.prepareCall("{CALL pInsertarUnidadArticuloRenglon("
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
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ") }");
            cstmt.setString(1, sCo_Art);
            cstmt.setString(2, sCo_Uni);
            cstmt.setString(3, iReng_Num);
            cstmt.setString(4, bRelacion);
            cstmt.setString(5, deEquivalencia);
            cstmt.setString(6, bUso_Venta);
            cstmt.setString(7, bUso_Compra);
            cstmt.setString(8, bUni_Principal);
            cstmt.setString(9, bUso_Principal);
            cstmt.setString(10, bUni_Secundaria);
            cstmt.setString(11, bUso_Secundaria);
            cstmt.setString(12, bUso_NumDecimales);
            cstmt.setString(13, iNum_Decimales);
            cstmt.setString(14, sCampo1);
            cstmt.setString(15, sCampo2);
            cstmt.setString(16, sCampo3);
            cstmt.setString(17, sCampo4);
            cstmt.setString(18, sCampo5);
            cstmt.setString(19, sCampo6);
            cstmt.setString(20, sCampo7);
            cstmt.setString(21, sCampo8);
            cstmt.setString(22, sCo_Us_In);
            cstmt.setString(23, sCo_Sucu_In);
            cstmt.setString(24, sMaquina);
            cstmt.setString(25, sRevisado);
            cstmt.setString(26, sTrasnfe);

            resultado = cstmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ArtUnidadModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public int pActualizarUnidadArticuloRenglon() {

        return resultado;
    }

    public int pEliminarUnidadArticuloRenglon(
            String sCo_ArtOri,
            String sCo_UniOri,
            String iReng_NumOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        try {
            cstmt = con.prepareCall("{CALL pEliminarUnidadArticuloRenglon("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ") }");
            cstmt.setString(1, sCo_ArtOri);
            cstmt.setString(2, sCo_UniOri);
            cstmt.setString(3, iReng_NumOri);
            cstmt.setString(4, sMaquina);
            cstmt.setString(5, sCo_Us_Mo);
            cstmt.setString(6, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(ArtUnidadModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList<ArtUnidadBO> pObtenerListadoDatosUnidad(
            String sDatabasesName,
            String sTableName,
            String sFielName,
            String sValor,
            String iopcion
    ) {
        ArrayList<ArtUnidadBO> lista = new ArrayList<>();
        try {
            cstmt = con.prepareCall("{CAll pObtenerListadoDatos("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");
            cstmt.setString(1, sDatabasesName);
            cstmt.setString(2, sTableName);
            cstmt.setString(3, sFielName);
            cstmt.setString(4, sValor);
            cstmt.setString(5, iopcion);
            cstmt.execute();
            rs = cstmt.getResultSet();

            while (rs.next()) {
                ArtUnidadBO artUnidadBO = new ArtUnidadBO();
                artUnidadBO.setCo_art(rs.getString("co_art"));
                artUnidadBO.setCo_uni(rs.getString("co_uni"));
                artUnidadBO.setRelacion(rs.getString("relacion"));
                artUnidadBO.setEquivalencia(rs.getString("equivalencia"));
                lista.add(artUnidadBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArtUnidadModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public ArrayList<ArtUnidadBO> pSeleccionarUnidadArticuloRenglon(String sCo_Art) {
        ArrayList<ArtUnidadBO> mapLista = new ArrayList<>();
        try {

            cstmt = con.prepareCall("{CAll pSeleccionarUnidadArticuloRenglon("
                    + "?"
                    + ")}");
            cstmt.setString(1, sCo_Art);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                ArtUnidadBO artUnidadBO = new ArtUnidadBO();
                artUnidadBO.setCo_art(rs.getString("co_art"));
                artUnidadBO.setCo_uni(rs.getString("co_uni"));
                artUnidadBO.setRelacion(rs.getString("relacion"));
                artUnidadBO.setEquivalencia(rs.getString("equivalencia"));
                artUnidadBO.setCampoAuxiliar(rs.getString("Des_Uni"));
                artUnidadBO.setNum_decimales(rs.getString("num_decimales"));
                mapLista.add(artUnidadBO);
                // System.out.println("DAta " + mapLista.get()  );
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArtUnidadModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mapLista;
    }
}
