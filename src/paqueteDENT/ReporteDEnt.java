/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteDENT;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SISTEMAS
 */
public class ReporteDEnt {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public conexion2.Conexion2 conexion;
    public int resultado = 0;

    public ReporteDEnt() {
        con = conexion.conexions();
    }

    public ArrayList<ArticuloBO> optenerLista() {
        ArrayList<ArticuloBO> lista = new ArrayList<>();
        try {
            cstmt = con.prepareCall("{CAll pObtenerListaArticulos"
                    + "}");
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                ArticuloBO articuloBO = new ArticuloBO();
                articuloBO.setArtDescr(rs.getString("art_des"));
                articuloBO.setCategoria("Categoria");
                articuloBO.setCo_art("co_art");
                articuloBO.setDetal("Detal");
                articuloBO.setDisponibleDetal("DIS");
                articuloBO.setDisponibleMayor("DISMAY");
                articuloBO.setImagen("imagen");
                articuloBO.setMayor("Mayor");
                lista.add(articuloBO);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    public void  imprimirReporte (){
          String ruta = "src/Reportes/.jasper";
          
        
    }

    public static void main(String args[]) {
        ReporteDEnt principal = new ReporteDEnt();
        principal.optenerLista();
    }
}
