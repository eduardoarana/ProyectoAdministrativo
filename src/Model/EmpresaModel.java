/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.EmpresasBO;
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
 * @author Desarrollo
 */
public class EmpresaModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;
    public int resultado = 0;

    public EmpresaModel() {

       // con = conexion.conexions();
    }

    public ArrayList<EmpresasBO> pObtenerMpEmpresa(String descrip , int tipo) {
        con = conexion.conexionControlCenter("ControlCenter", "admin", "andromeda");
        ArrayList<EmpresasBO> lista = new ArrayList<EmpresasBO>();
        try {
            if (tipo==1){
            cstmt = con.prepareCall("{CAll pObtenerMpEmpresa()}");
            }else if(tipo!=1){
                       cstmt = con.prepareCall("{CAll pObtenerMpEmpresaCod(?)}");
                       cstmt.setString(1, descrip);
            }
            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                EmpresasBO empresasBO = new EmpresasBO();
                empresasBO.setCod_empresa(rs.getString("cod_empresa"));
                empresasBO.setDesc_empresa(rs.getString("desc_empresa"));
                empresasBO.setPrioridad(rs.getString("prioridad"));
                empresasBO.setBackup_dir(rs.getString("backup_dir"));
                empresasBO.setOcul_emp(rs.getString("ocul_emp"));
                empresasBO.setRif(rs.getString("rif"));
                empresasBO.setNit(rs.getString("nit"));
                empresasBO.setValidador(rs.getString("validador"));
                empresasBO.setProducto(rs.getString("producto"));
                empresasBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                empresasBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                lista.add(empresasBO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpresaModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
