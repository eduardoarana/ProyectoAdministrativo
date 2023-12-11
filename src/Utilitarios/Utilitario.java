/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import Conection.Conexion;
import static com.sun.javafx.tk.Toolkit.getToolkit;
import com.toedter.calendar.JDateChooser;
import java.net.InetAddress;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author earana
 */
public class Utilitario {

    public static String MODULO_FACTURA_VENTAS = "", MODULO_FACTURA_COMPRAS = "",
            MODULO_COTIZACION_VENTAS = "";
    public static Connection con;
    public Conexion conexion;

    public Utilitario() {
    
    }

   
    
    //formato Fecha parametro Jcalendar  YYYY-MM-DD
    public static String obtenerFecha(JDateChooser calendario) {
        try {
            int dia, mes, ano;
            String fecha;

            dia = calendario.getCalendar().get(Calendar.DAY_OF_MONTH);
            mes = calendario.getCalendar().get(Calendar.MONTH) + 1;
            ano = calendario.getCalendar().get(Calendar.YEAR);
            fecha = String.valueOf(ano) + "-" + String.valueOf(mes) + "-" + String.valueOf(dia);
            return fecha;
        } catch (NullPointerException e) {
            return null;
        }
    }

    //Parametro string formatofecha  yyyy-MM-dd  y retorna fecha tipo Date..
    public static Date obtenerFecha(String Sfecha) {
        SimpleDateFormat objSDF = new SimpleDateFormat("yyyyMMdd");

        Date fecha = new Date();
        try {
            fecha = objSDF.parse(Sfecha);
        } catch (ParseException ex) {
            Logger.getLogger(Utilitario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fecha;
    }

    //Optiene la fecha Date y retorna la fecha en cadenas de Caracter
    public static String optenerfecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaComoCadena = sdf.format(fecha);
        System.out.println(fechaComoCadena);
        return fechaComoCadena;
    }

    //Obtener Fecha desde la BD y retornar fecha con Formato YYYYMMDD 
    public static String obtenerFecha(String date, String valor) {
        String fecha = "";
        return fecha;
    }

    public static String nombreHost() {
        String nombreHost = "";
        try {
            nombreHost = InetAddress.getLocalHost().getHostName();//.getHostAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nombreHost;
    }

    //Method que llama un StoreProcedure para obtener el id de una Tabla indicada ...
    //1 parametro Conexion ,
    //2 paramatro nombre de una Tabla la cual deseas buscar.
    //3 descripcion en este caso es el where 
    //4 Column es el nombre va despues del Where .
    //5 es  el Valor que vas a retornar.
    public static String getTablaId(Connection con, String tabla, String where, String column, String valorWhere) {
        String resultado = "";
        try {
            PreparedStatement pstmtConsultar = null;
            ResultSet rs;
            Conexion conexion = null;
            String sql = "Select " + column + " FROM " + tabla + " WHERE " + where + " = ?  ";
            pstmtConsultar = (PreparedStatement) con.prepareStatement(sql);
            pstmtConsultar.setString(1, valorWhere);
            rs = pstmtConsultar.executeQuery();
            if (rs.next()) {
                resultado = rs.getString(column);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
// Method para validar  que ingrese en el Campo solo Numero

    public static void ValidacionNumerica(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit();
            evt.consume();
        }
    }

    //Valida si existe el Registro en la Tabla
    //retorna un entero
    public static int validarRegistro(Connection con, String nameColumn, String BD, String nameTable, String campobuscar, String valor) {
        int resultado = 0;
        PreparedStatement pstmtConsultar = null;
        ResultSet rs;
        Conexion conexion = null;
        String sql = "select " + nameColumn + " from " + BD + ".dbo." + nameTable + " where " + campobuscar + " = ?";
        try {
            pstmtConsultar = (PreparedStatement) con.prepareStatement(sql);
            pstmtConsultar.setString(1, valor);
            rs = pstmtConsultar.executeQuery();
            if (rs.next()) {
                rs.getString(nameColumn);
                resultado = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Utilitario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public static int optenerRegistro(Connection con, String nameColumn, String BD, String nameTable, String campobuscar, String valor, String campoBuscar2, String valor2) {
        int resultado = 0;
        PreparedStatement pstmtConsultar = null;
        ResultSet rs;
        Conexion conexion = null;
        String sql = "select " + nameColumn + " from " + BD + ".dbo." + nameTable + " where " + campobuscar + " = ?  AND " + campoBuscar2 + " = ?";
        try {
            pstmtConsultar = (PreparedStatement) con.prepareStatement(sql);
            pstmtConsultar.setString(1, valor);
            pstmtConsultar.setString(2, valor2);

            rs = pstmtConsultar.executeQuery();
            if (rs.next()) {
                rs.getString(nameColumn);
                resultado = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Utilitario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public static int eliminarRegistro(Connection con, String bd, String table, String column, String valor) {
        int resultado = 0;
        try {

            PreparedStatement ps;
            // delete from [ADMIN_A].[dbo].[saAjuste] where ajue_num = '23'
            String sql = "delete from " + bd + ".dbo." + table + " where  " + column + " = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, valor);
            resultado = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Utilitario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public static String optenerCodUnidadArt(Connection con, String coArticulo) {
        String resultado = "";

        try {
            PreparedStatement pstmtConsultar = null;
            ResultSet rs;
            Conexion conexion = null;
            String sql = "select uni.co_uni from saArticulo art \n"
                    + "inner join saArtUnidad uni on uni.co_art=art.co_art \n"
                    + "where art.co_art=? \n"
                    + "and uni.uni_principal=1";
            pstmtConsultar = (PreparedStatement) con.prepareStatement(sql);
            pstmtConsultar.setString(1, coArticulo);
            rs = pstmtConsultar.executeQuery();
            if (rs.next()) {
                resultado = rs.getString("co_uni");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    //Obtiene lel iva de la fecha actual segun la ley 
    public static int optenerUltimoImp(Connection con, String fechaActual, String tipoImpuesto) {
        /*declare  @sdFecha date='2022-03-29 00:00:00'

	 SELECT
            *
        FROM
            saImpuestoSobreVentaReng
        WHERE tipo_imp=1 and 
            fecha =(select max(fecha) from 
                saImpuestoSobreVentaReng
                        where fecha<=@sdFecha and tipo_imp=1)*/
        int resultado = 0;
        try {

            CallableStatement cstmt;
            PreparedStatement pstmtConsultar = null;
            ResultSet rs;

            cstmt = con.prepareCall("{CALL optenerUltimoImp(?,?)}");
            cstmt.setString(1, fechaActual);
            cstmt.setString(2, tipoImpuesto);
            cstmt.execute();
            rs = cstmt.getResultSet();
            if (rs.next()) {
                resultado = rs.getInt("porc_tasa");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public double optenerTasa() {

        return 0;
    }

    public static int anularFactura(Connection con, String bd, String table_name, String doc_num) {
        int resultado = 0;
        try {
            String sql = "Update  " + bd + ".dbo." + table_name + " set anulado = '1'  where  " + " doc_num = ?";
            PreparedStatement pstmtActualizar = null;
            pstmtActualizar = (PreparedStatement) con.prepareStatement(sql);
            pstmtActualizar.setString(1, doc_num);
            resultado = pstmtActualizar.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Utilitario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public static void main(String arg[]) {
//        int respueste = Utilitario.optenerUltimoImp(Conexion.conexions(), "20220403", "1");

        //int res = Utilitario.anularFactura(Conexion.conexions(), "ADMIN_A", "saFacturaventa", "44455");
        
        int res =Utilitario.eliminarRegistro(Conexion.conexions(), "ADMIN_A", "saAjusteReng", "ajue_num", "33333");

        //Utilitario.optenerCodUnidadArt(Conexion.conexions(), "nuevo");
        System.out.println(res);

    }
}
