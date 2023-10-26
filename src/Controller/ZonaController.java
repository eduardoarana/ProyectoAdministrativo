/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.ZonaBO;
import Conection.Conexion;
import Model.ZonaModel;
import Vista.VistaZona;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static Vista.Vistaprincipal.lblNombreEmpresa;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author earana
 */
public class ZonaController implements ActionListener, KeyListener {

    Vista.VistaZona vista;
    ZonaModel modelo;
    ArrayList<ZonaBO> lista;
    int resultado = 0;
    public int reporte = 0;
    public Conexion conexion;
    public ZonaController(VistaZona vista) {
        this.vista = vista;
        modelo = new ZonaModel();
        lista = new ArrayList<ZonaBO>();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(vista.btnGuardar)) {
            resultado = modelo.pInsertarZona(vista.txtCodZona.getText(), vista.txtDescripcionZona.getText(),
                    "", vista.txtCampo1.getText(), vista.txtcampo2.getText(),
                    vista.txtCampo3.getText(), vista.txtcampo4.getText(), " ", " ", " ", " ",
                    Vistaprincipal.lblNombreUsuario1.getText(),//"cu_us_in", 
                    Vistaprincipal.lblNombreSucursal.getText(), //"co_sucu_in", 
                    Utilitarios.Utilitario.nombreHost(), "", "");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }
        } else if (event.getSource().equals(vista.btnactulizar)) {
            resultado = modelo.pActualizarZona(vista.txtCodZona.getText(), vista.txtCodZona.getText(), vista.txtDescripcionZona.getText(),
                    "", vista.txtCampo1.getText(), vista.txtcampo2.getText(), vista.txtCampo3.getText(), vista.txtcampo4.getText(), " ", " ", " ", " ",
                    Vistaprincipal.lblNombreUsuario1.getText(),//"cu_us_in", 
                    Vistaprincipal.lblNombreSucursal.getText(),//"co_sucu_in",
                    Utilitarios.Utilitario.nombreHost(), "", "");

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }
        } else if (event.getSource().equals(vista.btnEliminar)) {

            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarZona(vista.txtCodZona.getText(), Utilitarios.Utilitario.nombreHost(), "us_mo", "sucu_mo");
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.settearCampos();
                }

            } else {
                return;
            }

        } else if (event.getSource().equals(vista.btnNuevo)) {
            vista.settearCampos();
        } else if (event.getSource().equals(vista.btnAceptar1)) {

            int selection = vista.jtablaZona.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar una Zona", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            lista = modelo.pObtenerListadoDatosZona(lblNombreEmpresa.getText(), "saZona",
                    "co_zon",
                    vista.jtablaZona.getValueAt(selection, 0).toString(),
                    "3");
            
            if(reporte==1){
            vista.txtCodZona.setText(lista.get(0).getCo_zon().replaceAll("\\s", ""));
            vista.txtDescripcionZona.setText(lista.get(0).getZon_des());
            vista.txtCampo1.setText(lista.get(0).getCampo1());
            vista.txtcampo2.setText(lista.get(0).getCampo2());
            vista.txtCampo3.setText(lista.get(0).getCampo3());
            vista.txtcampo4.setText(lista.get(0).getCampo4());
            vista.btnGuardar.setEnabled(false);
            vista.txtCodZona.setEnabled(false);
            }
            if (reporte == 2) {
                vista.txtCodDesde.setText(lista.get(0).getCo_zon().replaceAll("\\s", ""));
                vista.txtDescripDesde.setText(lista.get(0).getZon_des());
            } else if (reporte == 3) {
                vista.txtCodHasta.setText(lista.get(0).getCo_zon().replaceAll("\\s", ""));
                vista.txtDescripHasta.setText(lista.get(0).getZon_des());
            }

            
            vista.jDialogZona.dispose();
            } else if (event.getSource().equals(vista.btnCancelar1)) {
            vista.jDialogZona.dispose();
        } else if (event.getSource().equals(vista.btnImprimir)) {

            vista.jDialogReporteZona.setSize(600, 445);
            vista.jDialogReporteZona.setLocationRelativeTo(null);
            vista.jDialogReporteZona.setVisible(true);
        } else if (event.getSource().equals(vista.btnCancelarReporte)) {
            vista.jDialogReporteZona.dispose();

        }else if (event.getSource().equals(vista.btnAceptarImprimir)) {
            try {
            String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepZona.jasper";
                Map parametro = new HashMap();
                String codDesde = vista.txtCodDesde.getText(),
                        codHasta = vista.txtCodHasta.getText();
                if (codDesde.isEmpty() && codHasta.isEmpty()) {
                    codDesde = null;
                    codHasta = null;
                } else if (!codDesde.isEmpty() && codHasta.isEmpty()) {
                    codHasta = null;
                } else if (codDesde.isEmpty() && !codHasta.isEmpty()) {
                    codDesde = null;
                }
                 String criterio = vista.comboCriterio.getSelectedItem().toString().equals("Descendente") ? "DESC" : "ASC";

                parametro.put("sCo_Zon_d", codDesde);
                parametro.put("sCo_Zon_h", codHasta);
                parametro.put("sCo_Sucursal", null);
                parametro.put("sCampOrderBy", vista.comboOrdenar.getSelectedItem().toString());
                parametro.put("sDir", criterio);
                parametro.put("bHeaderRep", "0");
                
                 JasperReport reportes = null;
                reportes = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                // reporte = (JasperReport) JRLoader.loadObject(getClass().getResource(ruta))   ;
                JasperPrint jprint = JasperFillManager.fillReport(ruta, parametro, conexion.conexions());
                JasperViewer view = new JasperViewer(jprint, false);
                view.setVisible(true);
                } catch (JRException ex) {
                Logger.getLogger(UnidadController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtCodDesde == ke.getSource()) {
            reporte = 2;
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                vista.setModel();
                vista.jDialogZona.setVisible(true);
                vista.jDialogZona.setSize(472, 358);
                vista.jDialogZona.setLocationRelativeTo(null);
            }
        } else if (vista.txtCodHasta == ke.getSource()) {
            reporte = 3;
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                vista.setModel();
                vista.jDialogZona.setVisible(true);
                vista.jDialogZona.setSize(472, 358);
                vista.jDialogZona.setLocationRelativeTo(null);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
