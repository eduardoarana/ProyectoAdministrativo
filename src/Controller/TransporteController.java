/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.TransportesBO;
import Conection.Conexion;
import Model.ModeloTablaTransporte;
import Model.TranporteModelo;
import Vista.VistaTransporte;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author EArana
 */
public class TransporteController implements ActionListener, KeyListener {

    VistaTransporte vista;
    TranporteModelo modelo;
    int resultado = 0;

    ArrayList<TransportesBO> lista;
    public Conexion conexion;


    public TransporteController(VistaTransporte vista) {
        this.vista = vista;
        modelo = new TranporteModelo();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == this.vista.btnGuardar) {
            resultado = modelo.pInsertarTransporte(
                    vista.txtCodTransporte.getText(),
                    vista.txtDescripcionTransporte.getText(),
                    vista.txtResponsable.getText(),
                    "",
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(),
                    "", "", "", "",
                    Vistaprincipal.tempUsuario,
                    Vistaprincipal.tempSucrsal,
                    Utilitarios.Utilitario.nombreHost(),
                    "1", "0");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();

            }

        } else if (event.getSource() == this.vista.btnactulizar) {
            resultado = modelo.pActualizarTransporte(vista.txtCodTransporte.getText(), vista.txtCodTransporte.getText(), vista.txtDescripcionTransporte.getText(), vista.txtDescripcionTransporte.getText(), "", vista.txtCampo1.getText(), vista.txtcampo2.getText(),
                    vista.txtCampo3.getText(), vista.txtcampo4.getText(), "", "", "", "",
                    Vistaprincipal.nombreUsuario,
                    Vistaprincipal.tempSucrsal,
                    Utilitarios.Utilitario.nombreHost(), "", "1", "1");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }
        } else if (event.getSource() == this.vista.btnEliminar) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarTransporte(vista.txtCodTransporte.getText(),
                        Utilitarios.Utilitario.nombreHost(),
                        Vistaprincipal.tempUsuario,
                        Vistaprincipal.tempEmpresa);
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.settearCampos();
                }
            } else {
                return;
            }
        } else if (event.getSource() == this.vista.btnNuevo) {
            vista.settearCampos();
        } else if (event.getSource() == this.vista.btnBuscar) {
            cargarDatosTransportes(Vistaprincipal.tempEmpresa,
                    "saTransporte",
                    "co_tran", "", "2");
            vista.jDialogTransporte.setSize(472, 358);
            vista.jDialogTransporte.setLocationRelativeTo(null);
            vista.jDialogTransporte.setVisible(true);

        } else if (event.getSource() == this.vista.btnAceptarTrans) {
            int selection = vista.jtablaTransporte.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Transporte", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            lista = modelo.pObtenerListadoDatos(Vistaprincipal.tempEmpresa,
                    "saTransporte",
                    "co_tran",
                    vista.jtablaTransporte.getValueAt(selection, 0).toString(),
                    "3");

            vista.txtCodTransporte.setText(lista.get(0).getCo_tran());
            vista.txtDescripcionTransporte.setText(lista.get(0).getDes_tran());
            vista.txtCampo1.setText(lista.get(0).getCampo1());
            vista.txtcampo2.setText(lista.get(0).getCampo2());
            vista.txtCampo3.setText(lista.get(0).getCampo3());
            vista.txtcampo4.setText(lista.get(0).getCampo4());
            vista.txtResponsable.setText(lista.get(0).getResp_tra());
            vista.btnGuardar.setEnabled(false);
            vista.btnEliminar.setEnabled(true);
            vista.btnactulizar.setEnabled(true);
            vista.jDialogTransporte.dispose();
        } else if (event.getSource() == this.vista.btnCancelarTrans) {
            vista.jDialogTransporte.dispose();
        } else if (event.getSource().equals(vista.btnImprimir)) {
            vista.jDialogReporteTransporte.setSize(472, 358);
            vista.jDialogReporteTransporte.setLocationRelativeTo(null);
            vista.jDialogReporteTransporte.setVisible(true);
        } else if (event.getSource().equals(vista.btnAceptarImprimir)) {
            try {
            String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepTransporte.jasper";
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

                parametro.put("sCo_Trans_d", codDesde);
                parametro.put("sCo_Trans_h", codHasta);
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
        } else if (event.getSource().equals(vista.btnCancelarReporte)) {
            vista.jDialogReporteTransporte.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent ke
    ) {

    }

    @Override
    public void keyPressed(KeyEvent ke
    ) {
        if (vista.txtBuscar == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion = "0", sfieldName = "";
                if (vista.jRInicio.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinal.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquier.isSelected()) {
                    Opcion = "2";
                } else if (vista.jRexacta.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigo.isSelected()) ? "co_tran" : "des_tran";
                cargarDatosTransportes(Vistaprincipal.tempEmpresa, "saTransporte",
                        sfieldName,
                        vista.txtBuscar.getText(),
                        Opcion);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    public void cargarDatosTransportes(String dAtaBaseName, String tableName, String Field_Name, String valor, String option) {
        vista.jtablaTransporte.setModel(new ModeloTablaTransporte(modelo.pObtenerListadoDatos(dAtaBaseName,
                tableName,
                Field_Name, valor, option)));
    }
}
