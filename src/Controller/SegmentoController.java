/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.SegmentoBO;
import Conection.Conexion;
import Model.SegmentoModelo;
import Vista.VistaSegmento;
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
public class SegmentoController implements ActionListener, KeyListener {

    VistaSegmento vista;
    SegmentoModelo modelo;
    ArrayList<SegmentoBO> lista;
    int resultado = 0;
    public Conexion conexion;
    public int reporte = 0;

    public SegmentoController(VistaSegmento vista) {
        this.vista = vista;
        modelo = new SegmentoModelo();
        lista = new ArrayList<SegmentoBO>();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(vista.btnGuardar)) {

            resultado = modelo.pInsertarSegmento(vista.txtCodSegmento.getText(),
                    vista.txtDescripcionSegmento.getText(), "", "" /*sP_Cuenta*/,
                    ""/*di_cen*/, vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(), vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(),
                    "", "", "", "",
                    Vistaprincipal.lblNombreUsuario1.getText(),//"co_us_in",
                    Vistaprincipal.lblNombreSucursal.getText(), //"co_sucu_in",
                    Utilitarios.Utilitario.nombreHost(), "0", "0");

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setteaCampo();
            }
        } else if (event.getSource().equals(vista.btnactulizar)) {
            String validador = "0x" + vista.txtValidador.getText();
            resultado = modelo.pActualizarSegmento(vista.txtCodSegmento.getText(),
                    vista.txtCodSegmento.getText(),
                    vista.txtDescripcionSegmento.getText(),
                    "", "", "", vista.txtCampo1.getText(), vista.txtcampo2.getText(), vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(), "", "", "", "",
                    Vistaprincipal.lblNombreUsuario1.getText(),//"co_us_in", 
                    Vistaprincipal.lblNombreSucursal.getText(),//"sucu_in", 
                    Utilitarios.Utilitario.nombreHost(), "", "", "");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setteaCampo();
            }
        } else if (event.getSource().equals(vista.btnEliminar)) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarSegmento(vista.txtCodSegmento.getText(),
                        Utilitarios.Utilitario.nombreHost(),
                        Vistaprincipal.lblNombreUsuario1.getText(),//"us_in", 
                        Vistaprincipal.lblNombreSucursal.getText() //"su_mo"
                );
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.setteaCampo();
                }
            } else {
                return;
            }
        } else if (event.getSource().equals(vista.btnNuevo)) {
            vista.setteaCampo();
        } else if (event.getSource().equals(vista.btnAceptar1)) {
            int selection = vista.jtablaSegmento.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar una Zona", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            lista = modelo.pOptenerListadoDatosSegmento(lblNombreEmpresa.getText(),
                    "saSegmento",
                    "co_seg",
                    vista.jtablaSegmento.getValueAt(selection, 0).toString(),
                    "3");
            if (reporte == 1) {
                vista.txtCodSegmento.setText(lista.get(0).getCo_seg().replaceAll("\\s", ""));
                vista.txtDescripcionSegmento.setText(lista.get(0).getSeg_des());
                vista.txtCampo1.setText(lista.get(0).getCampo1());
                vista.txtcampo2.setText(lista.get(0).getCampo2());
                vista.txtCampo3.setText(lista.get(0).getCampo3());
                vista.txtcampo4.setText(lista.get(0).getCampo4());
                vista.txtValidador.setText(lista.get(0).getValidador());
                vista.btnGuardar.setEnabled(false);
                vista.txtCodSegmento.setEnabled(false);
            } else if (reporte == 2) {
                vista.txtCodDesde.setText(lista.get(0).getCo_seg().replaceAll("\\s", ""));
                vista.txtDescripDesde.setText(lista.get(0).getSeg_des());
            } else if (reporte == 3) {
                vista.txtCodHasta.setText(lista.get(0).getCo_seg().replaceAll("\\s", ""));
            vista.txtDescripHasta.setText(lista.get(0).getSeg_des());
            }
            vista.jDialogSegmento.dispose();

        } else if (event.getSource().equals(vista.btnCancelar1)) {
            vista.jDialogSegmento.dispose();
        } else if (event.getSource().equals(vista.btnImprimir)) {
            vista.jDialogReporteSeg.setSize(600, 445);
            vista.jDialogReporteSeg.setLocationRelativeTo(null);
            vista.jDialogReporteSeg.setVisible(true);
        } else if (event.getSource().equals(vista.btnAceptarImprimir)) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepSegmento.jasper";
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
                System.out.print("Desde " + codDesde + " Hasta "+codHasta);

                String criterio = vista.comboCriterio.getSelectedItem().toString().equals("Descendente") ? "DESC" : "ASC";

                parametro.put("sCo_Seg_d",codDesde);
                parametro.put("sCo_Seg_h",codHasta);
                parametro.put("sCo_Sucursal",null);
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
        } else if (event.getSource().equals(vista.btnCancelarReporte)) {
            vista.jDialogReporteSeg.dispose();
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtCodDesde == ke.getSource()) { //
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 2;
                vista.setModel();
                vista.jDialogSegmento.setVisible(true);
                vista.jDialogSegmento.setSize(472, 358);
                vista.jDialogSegmento.setLocationRelativeTo(null);
            }
        }
        if (vista.txtCodHasta == ke.getSource()) { //
            if (ke.getKeyCode() == KeyEvent.VK_F2){
                reporte = 3;
                vista.setModel();
                vista.jDialogSegmento.setVisible(true);
                vista.jDialogSegmento.setSize(472, 358);
                vista.jDialogSegmento.setLocationRelativeTo(null);
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
