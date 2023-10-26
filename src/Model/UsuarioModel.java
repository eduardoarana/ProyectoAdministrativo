/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.UsuarioBO;
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
public class UsuarioModel {

    public static Connection con;
    public CallableStatement cstmt;
    public ResultSet rs;
    public Conexion conexion;

    public UsuarioModel() {
        con = conexion.conexions();
    }

    //    exec pInsertarUsuarioAdmi 
//		@sCod_Usuario='34',
//               @sDesc_Usuario='test',
//		@dePrioridad=0,
    //@sUsuario_Nodo=NULL,
//		@sId_Grupo='0',
    //@bCamb_Sucu=0,
    //@bPide_Sucu=0,
//		@sSucursal=NULL,
    //@sId_Idioma='0',
//		@bPcontrol_1=0,
    //@bPcontrol_2=0,
//		@iSerie=0,
    //@dFec_Ult='2020-10-18 00:00:00',
//		@dFec_Prox='2020-10-18 00:00:00',
    //@iVeces=4,
//		@dFec_Ult_Fa='2020-10-18 00:00:00',
    //@sEstado='A',
//		@sAd_Login=NULL,@bAcceso_Todas_Empresa=0,
//		@bAcceso_Todas_Empresa_admi=1,
//		@sCod_Empresa=NULL,
    //@sCod_Empresa_Admi=NULL,
//		@bSel_Emp=0,@bSel_Emp_Admi=1,
//		@sCo_Mapa='300',@sProducto='ADMI',
//		@sPassword='1234',@sCampo1=NULL,@sCampo2=NULL,
//		@sCampo3=NULL,@sCampo4=NULL,@sCampo5=NULL,
//		@sCampo6=NULL,@sCampo7=NULL,@sCampo8=NULL,
//		@sRevisado=NULL,@sTrasnfe=NULL,@sco_sucu_in=NULL,
//		@sco_us_in='PROFIT',@sMaquina='EARANA-PC'
    public int pInsertarUsuario(UsuarioBO usuarioBo) {
        int resultado = 0;

        try {
            cstmt = con.prepareCall("{CALL pInsertarUsuario("
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?,"
                    + "?,?"
                    + ")}");

            cstmt.setString(1, usuarioBo.getCod_Usuario());
            cstmt.setString(2, usuarioBo.getDesc_Usuario());
            cstmt.setString(3, usuarioBo.getPassword());
            cstmt.setString(4, usuarioBo.getPrioridad());
            cstmt.setString(5, usuarioBo.getUsuario_Nodo());

            cstmt.setString(6, usuarioBo.getId_Grupo());
            cstmt.setString(7, usuarioBo.getCamb_Sucu());
            cstmt.setString(8, usuarioBo.getPide_Sucu());
            cstmt.setString(9, usuarioBo.getSucursal());
            cstmt.setString(10, usuarioBo.getId_Idioma());

            cstmt.setString(11, usuarioBo.getPcontrol_1());
            cstmt.setString(12, usuarioBo.getPcontrol_2());
            cstmt.setString(13, usuarioBo.getSerie());
            cstmt.setString(14, usuarioBo.getFec_Ult());
            cstmt.setString(15, usuarioBo.getFec_Prox());

            cstmt.setString(16, usuarioBo.getVeces());
            cstmt.setString(17, usuarioBo.getFec_Ult_FA());
            cstmt.setString(18, usuarioBo.getEstado());
            cstmt.setString(19, usuarioBo.getAd_Login());
            cstmt.setString(20, usuarioBo.getCod_Empresa());

            cstmt.setString(21, usuarioBo.getSel_Emp());
            cstmt.setString(22, usuarioBo.getCo_mapa());
            cstmt.setString(23, usuarioBo.getAcceso_Todas_Empresa());
            cstmt.setString(24, usuarioBo.getCo_us_in());
            cstmt.setString(25, usuarioBo.getCampo1());
            cstmt.setString(26, usuarioBo.getCampo2());
            cstmt.setString(27, usuarioBo.getCampo3());
            cstmt.setString(28, usuarioBo.getCampo4());
            cstmt.setString(29, usuarioBo.getCampo5());
            cstmt.setString(30, usuarioBo.getCampo6());
            cstmt.setString(31, usuarioBo.getCampo7());
            cstmt.setString(32, usuarioBo.getCampo8());
            cstmt.setString(33, usuarioBo.getRevisado());
            cstmt.setString(34, usuarioBo.getTrasnfe());
            cstmt.setString(35, usuarioBo.getSel_Emp());
            cstmt.setString(36, usuarioBo.getSel_Emp_Admi());

//            cstmt.setString(37, usuarioBo.getDesc_Usuario());
//            cstmt.setString(38, usuarioBo.getPassword());
//            cstmt.setString(39, usuarioBo.getPrioridad());
//            cstmt.setString(40, usuarioBo.getUsuario_Nodo());
//
//            cstmt.setString(41, usuarioBo.getCod_Usuario());
//            cstmt.setString(42, usuarioBo.getDesc_Usuario());
//            cstmt.setString(43, usuarioBo.getPassword());
//            cstmt.setString(44, usuarioBo.getPrioridad());
//            cstmt.setString(45, usuarioBo.getUsuario_Nodo());
//
//            cstmt.setString(46, usuarioBo.getCod_Usuario());
            /*
             * cstmt.setString(2, usuarioBo.getDesc_Usuario());
             * cstmt.setString(3,usuarioBo.getPassword()); cstmt.setString(4,
             * usuarioBo.getPrioridad()); cstmt.setString(5,
             * usuarioBo.getUsuario_Nodo()); cstmt.setString(5,
             * usuarioBo.getUsuario_Nodo());
             */
            System.out.println("Passwars" + usuarioBo.getPassword());
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    public int pActualizarUsuario(UsuarioBO usuarioBo) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{Call pActualizarUsuarioAdmi("
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

            cstmt.setString(1, usuarioBo.getCod_Usuario());
            cstmt.setString(2, usuarioBo.getCod_Usuario());
            cstmt.setString(3, usuarioBo.getDesc_Usuario());
            cstmt.setString(4, usuarioBo.getPassword());
            cstmt.setString(5, usuarioBo.getFec_Ult_FA());
            cstmt.setString(6, usuarioBo.getFec_Ult());
            cstmt.setString(7, usuarioBo.getFec_Prox());
            cstmt.setString(8, usuarioBo.getCo_us_mo());
            cstmt.setString(9, usuarioBo.getCo_sucu_mo());
            cstmt.setString(10, usuarioBo.getSucursal());

            cstmt.setString(11, usuarioBo.getCampo1());
            cstmt.setString(12, usuarioBo.getCampo2());
            cstmt.setString(13, usuarioBo.getCampo3());
            cstmt.setString(14, usuarioBo.getCampo4());
            cstmt.setString(15, usuarioBo.getCampo5());
            cstmt.setString(16, usuarioBo.getCampo6());
            cstmt.setString(17, usuarioBo.getCampo7());
            cstmt.setString(18, usuarioBo.getCampo8());

            resultado = cstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public int pEliminarUsuario(
            String sCod_UsuarioOri,
            String sMaquina,
            String sCo_Us_Mo,
            String sCo_Sucu_Mo
    ) {
        int resultado = 0;
        try {
            cstmt = con.prepareCall("{CALL pEliminarUsuario ("
                    + "?,"
                    + "?,"
                    + "?,"
                    + "?"
                    + ")}");

            cstmt.setString(1, sCod_UsuarioOri);
            cstmt.setString(2, sMaquina);
            cstmt.setString(3, sCo_Us_Mo);
            cstmt.setString(4, sCo_Sucu_Mo);
            resultado = cstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultado;
    }

    /*
     * exec pObtenerListadoDatos @sDatabase_Name=N'MasterProfitPro',
     * @sTable_Name=N'MpUsuario', @sField_Name=N'Desc_Usuario',
     * @sValor=N'P',@iOpcion=2
     */
    public ArrayList<UsuarioBO> pObtenerListadoDatos(
            String sDatabase_Name,
            String sTable_Name,
            String sField_Name,
            String valor,
            String iOpcion) {
        ArrayList<UsuarioBO> lista = new ArrayList<UsuarioBO>();
        try {
            cstmt = con.prepareCall("{CALL pObtenerListadoDatos(?,?,?,?,?)}");
            cstmt.setString(1, sDatabase_Name);
            cstmt.setString(2, sTable_Name);
            cstmt.setString(3, sField_Name);
            cstmt.setString(4, valor);
            cstmt.setString(5, iOpcion);

            cstmt.execute();
            rs = cstmt.getResultSet();
            while (rs.next()) {
                UsuarioBO usuarioBO = new UsuarioBO();
                usuarioBO.setCod_Usuario(rs.getString("Cod_Usuario"));
                usuarioBO.setDesc_Usuario(rs.getString("Desc_Usuario"));
                usuarioBO.setPassword(rs.getString("Password"));
                usuarioBO.setPrioridad(rs.getString("Prioridad"));
                usuarioBO.setUsuario_Nodo(rs.getString("Usuario_Nodo"));
                usuarioBO.setId_Grupo(rs.getString("Id_Grupo"));
                usuarioBO.setCamb_Sucu(rs.getString("Camb_Sucu"));
                usuarioBO.setPide_Sucu(rs.getString("Pide_Sucu"));
                usuarioBO.setSucursal(rs.getString("Sucursal"));
                usuarioBO.setId_Idioma(rs.getString("Id_Idioma"));
                usuarioBO.setPcontrol_1(rs.getString("Pcontrol_1"));
                usuarioBO.setPcontrol_2(rs.getString("Pcontrol_2"));
                usuarioBO.setSerie(rs.getString("Serie"));
                usuarioBO.setFec_Ult(rs.getString("Fec_Ult"));
                usuarioBO.setFec_Prox(rs.getString("Fec_Prox"));
                usuarioBO.setVeces(rs.getString("Veces"));
                usuarioBO.setFec_Ult_FA(rs.getString("Fec_Ult_FA"));
                usuarioBO.setEstado(rs.getString("estado"));
                usuarioBO.setAd_Login(rs.getString("Ad_Login"));
                usuarioBO.setCod_Empresa(rs.getString("Cod_Empresa"));
                usuarioBO.setCod_Empresa_Nomi(rs.getString("Cod_Empresa_Nomi"));
                usuarioBO.setCod_Empresa_Admi(rs.getString("Cod_Empresa_Admi"));
                usuarioBO.setSel_Emp(rs.getString("Sel_Emp"));
                //  usuarioBO.setSel_Emp_Admi(rs.getString("Sel_Emp_Admi"));
                usuarioBO.setCo_mapa(rs.getString("co_mapa"));
                usuarioBO.setCo_mapa_nomi(rs.getString("co_mapa_nomi"));
                usuarioBO.setCo_mapa_admi(rs.getString("co_mapa_admi"));
                usuarioBO.setAcceso_Todas_Empresa_Admi(rs.getString("Acceso_Todas_Empresa_Admi"));
                usuarioBO.setCo_us_in(rs.getString("co_us_in"));
                usuarioBO.setFe_us_in(rs.getString("fe_us_in"));
                usuarioBO.setCo_us_mo(rs.getString("co_us_mo"));
                usuarioBO.setFe_us_mo(rs.getString("fe_us_mo"));
                usuarioBO.setCampo1(rs.getString("Campo1"));
                usuarioBO.setCampo2(rs.getString("Campo2"));
                usuarioBO.setCampo3(rs.getString("Campo3"));
                usuarioBO.setCampo4(rs.getString("Campo4"));
                usuarioBO.setCampo5(rs.getString("Campo5"));
                usuarioBO.setCampo6(rs.getString("Campo6"));
                usuarioBO.setCampo7(rs.getString("Campo7"));
                usuarioBO.setCampo8(rs.getString("Campo8"));
                usuarioBO.setCo_sucu_in(rs.getString("co_sucu_in"));
                usuarioBO.setCo_sucu_mo(rs.getString("co_sucu_mo"));
                usuarioBO.setRevisado(rs.getString("revisado"));
                usuarioBO.setTrasnfe(rs.getString("trasnfe"));
                usuarioBO.setValidador(rs.getString("validador"));
                usuarioBO.setPassword2(rs.getString("Password2"));
                lista.add(usuarioBO);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    /*  public static void main(String args[]) {
        UsuarioModel m = new UsuarioModel();
        UsuarioBO usuarioBo = new UsuarioBO();
        usuarioBo.setCod_Usuario("23");
        usuarioBo.setDesc_Usuario("descripcion");
        usuarioBo.setPrioridad("0");
        usuarioBo.setUsuario_Nodo("1");
        usuarioBo.setId_Grupo("0");
        usuarioBo.setCamb_Sucu("0");
        usuarioBo.setPide_Sucu("0");
        usuarioBo.setSucursal("1");
        usuarioBo.setId_Idioma("1");
        usuarioBo.setPcontrol_1("0");
        usuarioBo.setPcontrol_2("0");
        usuarioBo.setSerie("0");
        usuarioBo.setFec_Ult("20200218");
        usuarioBo.setFec_Prox("20200216");
        usuarioBo.setVeces("4");
        usuarioBo.setFec_Ult_FA("20201015");
        usuarioBo.setEstado("A");
        usuarioBo.setAd_Login("1");
        usuarioBo.setAcceso_Todas_Empresa_Admi("0");
        usuarioBo.setAcceso_Todas_Empresa("0");
        usuarioBo.setCod_Empresa("23");
        usuarioBo.setSel_Emp("9");
        usuarioBo.setSel_Emp_Admi("8");
        usuarioBo.setCo_mapa("300");
        usuarioBo.setPassword("1234");
        usuarioBo.setCampo1("");
        usuarioBo.setCampo2("");
        usuarioBo.setCampo3("");
        usuarioBo.setCampo4("");
        usuarioBo.setCampo5("");
        usuarioBo.setCampo6("");
        usuarioBo.setCampo7("");
        usuarioBo.setCampo8("");
        usuarioBo.setRevisado("1");
        usuarioBo.setTrasnfe("1");
        usuarioBo.setCo_sucu_in("888");
        usuarioBo.setCo_us_in("22");
        usuarioBo.setMaquina("maquina");
        int resultado = m.pInsertarUsuario(usuarioBo);
        System.out.println("Resultado" + resultado);
//    exec pInsertarUsuarioAdmi 
//		@sCod_Usuario='34',
//@sDesc_Usuario='test',
//		@dePrioridad=0,@sUsuario_Nodo=NULL,
//		@sId_Grupo='0',@bCamb_Sucu=0,@bPide_Sucu=0,
//		@sSucursal=NULL,@sId_Idioma='0',
//		@bPcontrol_1=0,@bPcontrol_2=0,
//		@iSerie=0,@dFec_Ult='2020-10-18 00:00:00',
//		@dFec_Prox='2020-10-18 00:00:00',@iVeces=4,
//		@dFec_Ult_Fa='2020-10-18 00:00:00',@sEstado='A',
//		@sAd_Login=NULL,@bAcceso_Todas_Empresa=0,
//		@bAcceso_Todas_Empresa_admi=1,
//		@sCod_Empresa=NULL,@sCod_Empresa_Admi=NULL,
//		@bSel_Emp=0,@bSel_Emp_Admi=1,
//		@sCo_Mapa='300',@sProducto='ADMI',
//		@sPassword='1234',@sCampo1=NULL,@sCampo2=NULL,
//		@sCampo3=NULL,@sCampo4=NULL,@sCampo5=NULL,
//		@sCampo6=NULL,@sCampo7=NULL,@sCampo8=NULL,
//		@sRevisado=NULL,@sTrasnfe=NULL,@sco_sucu_in=NULL,
//		@sco_us_in='PROFIT',@sMaquina='EARANA-PC'

        m.pInsertarUsuario(usuarioBo);
    }*/
}
