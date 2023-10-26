/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ImpuestoSobreVentaRengBO;
import Conection.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aranaVentur
 */
public class ImpuestoValorAgregadoModelo {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public ImpuestoValorAgregadoModelo() {
        con = conexion.conexions();
    }

    public ArrayList<ImpuestoSobreVentaRengBO> pSeleccionarRenglonesImpuestoSobreVenta(String fecha) {

        ArrayList<ImpuestoSobreVentaRengBO> lista = new ArrayList<>();

        try {
            cstmt = con.prepareCall("{CALL pSeleccionarRenglonesImpuestoSobreVenta("
                    + "?"
                    + ")}");
            cstmt.setString(1, fecha);
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                ImpuestoSobreVentaRengBO impuestoSobreVentaRengBO = new ImpuestoSobreVentaRengBO();
                impuestoSobreVentaRengBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                impuestoSobreVentaRengBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                impuestoSobreVentaRengBO.setCo_us_in(rs.getString("co_us_in"));
                impuestoSobreVentaRengBO.setCompras(rs.getString("compras"));
                impuestoSobreVentaRengBO.setConsumo_suntuario(rs.getString("Consumo_suntuario"));
                impuestoSobreVentaRengBO.setFe_us_in(rs.getString("fe_us_in"));
                impuestoSobreVentaRengBO.setFe_us_mo(rs.getString("fe_us_mo"));
                impuestoSobreVentaRengBO.setPorc_suntuario(rs.getString("Porc_suntuario"));
                impuestoSobreVentaRengBO.setPorc_tasa(rs.getString("Porc_tasa"));
                impuestoSobreVentaRengBO.setReng_num(rs.getString("reng_num"));
                impuestoSobreVentaRengBO.setRevisado(rs.getString("revisado"));
                impuestoSobreVentaRengBO.setTipo_imp(rs.getString("tipo_imp"));
                impuestoSobreVentaRengBO.setTrasnfe(rs.getString("trasnfe"));
                impuestoSobreVentaRengBO.setVentas(rs.getString("ventas"));
                lista.add(impuestoSobreVentaRengBO);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static void main(String args[]) {
        ImpuestoValorAgregadoModelo m = new ImpuestoValorAgregadoModelo();
        ArrayList<ImpuestoSobreVentaRengBO> lista = new ArrayList<>();
              lista=  m.pSeleccionarRenglonesImpuestoSobreVenta("20070301");
        System.out.println(lista.get(0).getPorc_tasa());
    }
}
