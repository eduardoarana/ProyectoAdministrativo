/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.SucursalBO;
import Conection.Conexion;
import Model.SucursalModelo;
import Utilitarios.Utilitario;
import Vista.VistaSucursal;
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
public class SucursalController implements ActionListener, KeyListener {

    VistaSucursal vista;
    SucursalModelo modelo;
    public ArrayList<SucursalBO> lista;
    public Conexion conexion;
    public int reporteDialo = 0;

    public SucursalController(VistaSucursal vista) {
        this.vista = vista;
        modelo = new SucursalModelo();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == this.vista.btnGuardar) {
            if (vista.txtcodigoSucursal.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo articulo no puede estar vacio ", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            resultado = modelo.pInsertarSucursal(vista.txtcodigoSucursal.getText(),
                    vista.txtDescripcionSucursal.getText(),
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText(),//"sCo_Us_In",
                    Vistaprincipal.lblNombreSucursal.getText(),//"sCo_Sucu_In",
                    Utilitario.nombreHost(),
                    "1", "2");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setearCampos();
                vista.setModel();
            }

        } else if (event.getSource() == this.vista.btnactulizar) {
            resultado = modelo.pActualizarSucursal(vista.txtcodigoSucursal.getText(),
                    vista.txtcodigoSucursal.getText(), vista.txtDescripcionSucursal.getText(),
                    vista.txtCampo1.getText(), vista.txtcampo2.getText(), vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText(),// "us_mo",
                    Vistaprincipal.lblNombreSucursal.getText(),//"sucu_mo",
                    Utilitario.nombreHost(), "1", "1");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setearCampos();
                vista.setModel();
            }
        } else if (event.getSource() == this.vista.btnEliminar) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                resultado = modelo.pEliminarSucursal(vista.txtcodigoSucursal.getText(), Utilitario.nombreHost(), "usMO", "sucuMO");
                vista.setearCampos();
                vista.setModel();
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha  Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                return;
            }
        } else if (event.getSource() == this.vista.btnNuevo) {
            vista.setearCampos();
        } else if (event.getSource() == this.vista.btnBuscar) {
            vista.setModel();
            vista.jDialogSucursal.setSize(472, 358);
            vista.jDialogSucursal.setLocationRelativeTo(null);
            vista.jDialogSucursal.setVisible(true);

        } else if (event.getSource() == this.vista.btnAceptarUbicacion) {

            int selection = vista.jtableTipoAjuste.getSelectedRow();
            lista = modelo.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                    "saSucursal",
                    "co_sucur",//"co_sucur"
                    vista.jtableTipoAjuste.getValueAt(selection, 0).toString().replaceAll("\\s", ""),
                    "3");
            if (selection != -1) {
                
                if(reporteDialo==1){
                    vista.txtCodDesde1.setText(lista.get(0).getCo_sucur().replaceAll("\\s", ""));
                    vista.txtDescripDesde.setText(lista.get(0).getSucur_des());
                    vista.jDialogSucursal.dispose();
                }else if(reporteDialo==2){
                 vista.txtCodHasta1.setText(lista.get(0).getCo_sucur().replaceAll("\\s", ""));
                    vista.txtDescripHasta.setText(lista.get(0).getSucur_des());
                    vista.jDialogSucursal.dispose();
                    
                }else {
                
                vista.jDialogSucursal.dispose();
                vista.txtcodigoSucursal.setText(lista.get(0).getCo_sucur());
                vista.txtDescripcionSucursal.setText(lista.get(0).getSucur_des());
                vista.txtCampo1.setText(lista.get(0).getCampo1());
                vista.txtcampo2.setText(lista.get(0).getCampo2());
                vista.txtCampo3.setText(lista.get(0).getCampo3());
                vista.txtcampo4.setText(lista.get(0).getCampo4());
                vista.btnGuardar.setEnabled(false);
                vista.btnEliminar.setEnabled(true);
                vista.btnactulizar.setEnabled(true);
            }
            }
        } else if (event.getSource() == this.vista.btnCancelar) {
            vista.jDialogSucursal.dispose();
        } else if (event.getSource().equals(vista.btnImprimir)) {
            vista.jDialogReporteSucursal.setVisible(true);
            vista.jDialogReporteSucursal.setSize(600, 450);
            vista.jDialogReporteSucursal.setLocationRelativeTo(null);

        } else if (event.getSource().equals(vista.btnAceptarImprimir)) {
            try {

                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepSucursal.jasper";
                Map parametro = new HashMap();
                String codDesde = vista.txtCodDesde1.getText(), codHasta = vista.txtCodHasta1.getText();
                if (codDesde.isEmpty() && codHasta.isEmpty()) {
                    codDesde = null;
                    codHasta = null;
                } else if (!codDesde.isEmpty() && codHasta.isEmpty()) {
                    codHasta = null;
                } else if (codDesde.isEmpty() && !codHasta.isEmpty()) {
                    codDesde = null;
                }
                String criterio = vista.comboCriterio.getSelectedItem().toString().equals("Descendente") ? "DESC" : "ASC";
                parametro.put("sCo_Sucur_d", codDesde);
                parametro.put("sCo_Sucur_h", codHasta);
                parametro.put("sCo_Sucursal", null);
                parametro.put("sCampOrderBy", vista.comboOrdenar.getSelectedItem().toString());
                parametro.put("sDir", criterio);
                parametro.put("bHeaderRep", "0");
                JasperReport reporte = null;
                reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                // reporte = (JasperReport) JRLoader.loadObject(getClass().getResource(ruta))   ;
                JasperPrint jprint = JasperFillManager.fillReport(ruta, parametro, conexion.conexions());
                JasperViewer view = new JasperViewer(jprint, false);
                view.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(CategoriaController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtCodDesde1 == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                vista.jDialogSucursal.setSize(472, 358);
                vista.jDialogSucursal.setLocationRelativeTo(null);
                vista.jDialogSucursal.setVisible(true);
                reporteDialo = 1;
            }
        } else if (vista.txtCodHasta1 == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                vista.jDialogSucursal.setSize(472, 358);
                vista.jDialogSucursal.setLocationRelativeTo(null);
                vista.jDialogSucursal.setVisible(true);
                reporteDialo = 2;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
