/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentElectronic;

import Conection.Conexion;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author aranaVentur
 */
public class ReporteDent {

    public static Connection getCom() {
        return com;
    }
    public static void setCom(Connection aCom) {
        com = aCom;
    }
    public Conexion conexion;
    private static Connection com;

    public ReporteDent() {

    }

    public static Connection conexions() {
        try {
            //Conexion con Sql Postgres 
            //Class.forName("org.postgresql.Driver");
            //com = (Connection) DriverManager.getConnection("jdbc:postgresql:SystemNom", "postgres", "1234");
            // Conexion con Sql Server 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            com = DriverManager.getConnection("jdbc:sqlserver://SRV-DENT\\SQLEXPRESS:1433;"
                    + "databaseName=DENT_A", "profit",
                    "profit");
            System.out.println("Exito");
            return com;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        }
    }

    public void imprimirReporte() {
        try {
            String ruta = "src/Reportes/dent_electronic.jasper";
            JasperReport reporte = null;
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            // reporte = (JasperReport) JRLoader.loadObject(getClass().getResource(ruta))   ;
            JasperPrint jprint = JasperFillManager.fillReport(ruta, null, ReporteDent.conexions());
            JasperViewer view = new JasperViewer(jprint, false);
            view.setVisible(true);
            JasperExportManager.exportReportToPdfFile(jprint, "C:/repor.pdf");
            view.dispose();

        } catch (JRException ex) {
            Logger.getLogger(ReporteDent.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(new JFrame(), "error ", "Software", JOptionPane.INFORMATION_MESSAGE);
                  
        }

    }

    public void pdf() {
        JasperReport jasperReport;
        JasperPrint jasperPrint;
        try {
            //se carga el reporte
            URL in = this.getClass().getResource("src/Reportes/dent_electronic.jasper");
            jasperReport = (JasperReport) JRLoader.loadObject(in);
            //se procesa el archivo jasper
            jasperPrint = JasperFillManager.fillReport(jasperReport, null, conexion.conexions());
            //se crea el archivo PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:/Softech Consult/report.pdf");
        } catch (JRException ex) {
            System.err.println("Error iReport: " + ex.getMessage());
        }
    }

    public static void main(String args[]) {
        ReporteDent obj = new ReporteDent();
        obj.imprimirReporte();
        //obj.pdf();
    }
}
