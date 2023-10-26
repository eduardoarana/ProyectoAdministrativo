/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.ProcedenciaBO;
import Conection.Conexion;
import Model.ModeloTablaProcedencia;
import Model.ProcedenciaModel;
import Utilitarios.Utilitario;

import Vista.VistaProcedencia;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import static Vista.Vistaprincipal.lblNombreEmpresa;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author earana
 */
public class ProcedenciaController implements ActionListener, KeyListener {

    public int selection = 0;
    VistaProcedencia vista;
    ProcedenciaModel modelo;
    public ArrayList<ProcedenciaBO> lista;
    public Conexion conexion;
    public int reporteDialo = 0;

    public ProcedenciaController(VistaProcedencia vista) {
        this.vista = vista;
        modelo = new ProcedenciaModel();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == this.vista.btnGuardar) {
            resultado = modelo.pInsertarProcedencia(vista.txtcodigoprocedencia.getText(),
                    vista.txtDescripcionProcedencia.getText(),
                    vista.txtCampo1.getText(), vista.txtcampo2.getText(),
                    vista.txtCampo3.getText(), vista.txtcampo4.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText(),
                    Utilitario.nombreHost(), "2", "1");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
                //     vista.setModel();
            }
        } else if (event.getSource() == this.vista.btnactulizar) {

            resultado = modelo.pActualizarProcedencia(vista.txtcodigoprocedencia.getText(),
                    vista.txtcodigoprocedencia.getText(), vista.txtDescripcionProcedencia.getText(),
                    vista.txtCampo1.getText(), vista.txtcampo2.getText(),
                    vista.txtCampo3.getText(), vista.txtcampo4.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText(),
                    Vistaprincipal.lblNombreSucursal.getText(),//"sucuMo", 
                    Utilitario.nombreHost(), "1", "0");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
                //    vista.setModel();
            }
        } else if (event.getSource() == this.vista.btnEliminar) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarProcedencia(vista.txtcodigoprocedencia.getText(), Utilitario.nombreHost(), Vistaprincipal.lblNombreUsuario1.getText(),
                        Vistaprincipal.lblNombreSucursal.getText()
                );
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                    //vista.setModel();
                    vista.settearCampos();
                }
            } else {
                return;
            }
        } else if (event.getSource() == this.vista.btnNuevo) {
            vista.settearCampos();
        } else if (event.getSource() == this.vista.btnBuscar) {
            cargarTabla();
            vista.JDialogoProcedencia.setSize(472, 358);
            vista.JDialogoProcedencia.setLocationRelativeTo(null);
            vista.JDialogoProcedencia.setVisible(true);
        } else if (event.getSource() == this.vista.btnAceptarLinea) {
            selection = vista.jTablaProcedencia.getSelectedRow();
            if (selection != -1) {
                lista = modelo.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                        "saProcedencia",
                        "cod_proc",
                        vista.jTablaProcedencia.getValueAt(selection, 0).toString().replaceAll("\\s", ""),
                        "3");

                if (reporteDialo == 1) {
                    vista.txtCodDesde1.setText(lista.get(0).getCod_proc().replaceAll("\\s", ""));
                    vista.txtDescripDesde.setText(lista.get(0).getDes_proc());
                    vista.JDialogoProcedencia.dispose();
                } else if (reporteDialo == 2) {

                    vista.txtCodHasta1.setText(lista.get(0).getCod_proc().replaceAll("\\s", ""));
                    vista.txtDescripHasta.setText(lista.get(0).getDes_proc());
                    vista.JDialogoProcedencia.dispose();
                } else {
                    vista.txtcodigoprocedencia.setText(lista.get(0).getCod_proc().replaceAll("\\s", ""));
                    vista.txtDescripcionProcedencia.setText(lista.get(0).getDes_proc());
                    vista.txtCampo1.setText(lista.get(0).getCampo1());
                    vista.txtcampo2.setText(lista.get(0).getCampo2());
                    vista.txtCampo3.setText(lista.get(0).getCampo3());
                    vista.txtcampo4.setText(lista.get(0).getCampo4());
                    vista.JDialogoProcedencia.dispose();
                    vista.btnGuardar.setEnabled(false);
                    vista.btnactulizar.setEnabled(true);
                    vista.btnEliminar.setEnabled(true);
                }
            }
        } else if (event.getSource() == this.vista.btnCancelar) {
            vista.JDialogoProcedencia.dispose();
        } else if (event.getSource() == this.vista.btnImprimir) {
            vista.jDialogReporteProcedencia.setVisible(true);
            vista.jDialogReporteProcedencia.setSize(600, 450);
            vista.jDialogReporteProcedencia.setLocationRelativeTo(null);

        } else if (event.getSource() == this.vista.btnAceptarImprimir) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepProcedencia.jasper";
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

                System.out.println("CodiDesde : " + codDesde + " Cod HYasta : " + codHasta + "  Criterio : " + criterio);
                parametro.put("sCod_Proc_d", codDesde);
                parametro.put("sCod_Proc_h", codHasta);
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
        } else if (event.getSource() == this.vista.btnCancelarImpresion) {
            vista.txtDescripDesde.setText("");
            vista.txtDescripHasta.setText("");
            vista.jDialogReporteProcedencia.dispose();
        }
    }

    public void cargarTabla() {
        vista.jTablaProcedencia.setModel(new ModeloTablaProcedencia(modelo.pObtenerListadoDatos(lblNombreEmpresa.getText(), "saProcedencia", "cod_proc", "", "2")));
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtCodDesde1 == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarTabla();
                vista.JDialogoProcedencia.setSize(472, 358);
                vista.JDialogoProcedencia.setLocationRelativeTo(null);
                vista.JDialogoProcedencia.setVisible(true);
                reporteDialo = 1;
            }
        }
        if (vista.txtCodHasta1 == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarTabla();
                vista.JDialogoProcedencia.setSize(472, 358);
                vista.JDialogoProcedencia.setLocationRelativeTo(null);
                vista.JDialogoProcedencia.setVisible(true);
                reporteDialo = 2;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
