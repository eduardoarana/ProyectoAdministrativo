/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.CondicionPagoBO;
import Conection.Conexion;
import Model.CondicionPagoModel;
import Model.ModeloTablaCoindicionPago;
import Vista.VistaCondicionPago;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static Vista.Vistaprincipal.lblNombreEmpresa;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author AranaV
 */
public class CondicionPagoController implements ActionListener, KeyListener {

    Vista.VistaCondicionPago vista;
    CondicionPagoModel modelo;
    ArrayList<CondicionPagoBO> listaCondicionPag;
    int selection = 0;
    public Conexion conexion;
    public int reporte = 0;

    public CondicionPagoController(VistaCondicionPago vista) {
        this.vista = vista;
        modelo = new CondicionPagoModel();
        listaCondicionPag = new ArrayList<CondicionPagoBO>();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == this.vista.btnGuardar) {
            int validarExixtencia = Utilitarios.Utilitario.validarRegistro(modelo.con, "co_cond", lblNombreEmpresa.getText(), "saCondicionPago", "co_cond", vista.txtCodCondiPago.getText());
            if (validarExixtencia == 1) {
                JOptionPane.showMessageDialog(new JFrame(), "Ya existe el registro con el mismo codigo", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            resultado = modelo.pInsertarCondicionPago(vista.txtCodCondiPago.getText(), vista.txtDescripcionCondPago.getText(), vista.txtDiasCredito.getText(),
                    null, vista.txtCampo1.getText(), vista.txtcampo2.getText(), vista.txtCampo3.getText(), vista.txtcampo4.getText(),
                    null, null, null, null,
                    Vistaprincipal.lblNombreUsuario1.getText(),
                    Vistaprincipal.lblNombreSucursal.getText()// "sucu"
                    ,
                     Utilitarios.Utilitario.nombreHost(), null, null);
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();

            }
        } else if (event.getSource() == this.vista.btnactulizar) {
            resultado = modelo.pActualizarCondicionPago(vista.txtCodCondiPago.getText(),
                    vista.txtCodCondiPago.getText(),
                    vista.txtDescripcionCondPago.getText(),
                    vista.txtDiasCredito.getText(),
                    "", vista.txtCampo1.getText(), vista.txtcampo2.getText(), vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(), null, null, null, null,
                    Vistaprincipal.lblNombreUsuario1.getText(),
                    Vistaprincipal.lblNombreSucursal.getText(),
                    Utilitarios.Utilitario.nombreHost(), "", "", "");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }
        } else if (event.getSource() == this.vista.btnEliminar) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarCondicionPago(vista.txtCodCondiPago.getText(),
                        Utilitarios.Utilitario.nombreHost(),
                        Vistaprincipal.lblNombreUsuario1.getText(),
                        Vistaprincipal.lblNombreSucursal.getText());
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.settearCampos();
                }
            } else {
                return;
            }

        } else if (event.getSource() == this.vista.btnNuevo) {
            vista.settearCampos();
        } else if (event.getSource() == this.vista.btnImprimir) {
            vista.jDialogReporteCondicionPago.setSize(600, 445);
            vista.jDialogReporteCondicionPago.setLocationRelativeTo(null);
            vista.jDialogReporteCondicionPago.setVisible(true);
        } else if (event.getSource() == this.vista.btnAceptarImprimirCondicion) {
            try {

                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepCondicionPago.jasper";
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

                parametro.put("sCo_ConPago_d", codDesde);
                parametro.put("sCo_ConPago_h", codHasta);
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
            } catch (JRException e) {
                e.printStackTrace();
            }
        } else if (event.getSource() == this.vista.btnCancelarReporte) {
            vista.jDialogReporteCondicionPago.dispose();
        } else if (event.getSource() == this.vista.btnBuscar) {
            reporte = 1;
            setModelCondicionPago();
            vista.jDialogCondicionPago.setSize(472, 358);
            vista.jDialogCondicionPago.setLocationRelativeTo(null);
            vista.jDialogCondicionPago.setVisible(true);
        } else if (event.getSource() == this.vista.btnAceptarCondicionPag) {
            selection = vista.jtablaCondicionPago.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar una Condicion de Pago", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            listaCondicionPag = modelo.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                    "saCondicionPago", "co_cond",
                    vista.jtablaCondicionPago.getValueAt(selection, 0).toString(),
                    "3");

            if (reporte == 1) {
                vista.txtCodCondiPago.setText(listaCondicionPag.get(0).getCo_cond());
                vista.txtDescripcionCondPago.setText(listaCondicionPag.get(0).getCond_des());
                vista.txtDiasCredito.setText(listaCondicionPag.get(0).getDias_cred());
                vista.txtCampo1.setText(listaCondicionPag.get(0).getCampo1());
                vista.txtcampo2.setText(listaCondicionPag.get(0).getCampo2());
                vista.txtCampo3.setText(listaCondicionPag.get(0).getCampo3());
                vista.txtcampo4.setText(listaCondicionPag.get(0).getCampo4());
                vista.btnEliminar.setEnabled(true);
                vista.btnactulizar.setEnabled(true);
                vista.btnGuardar.setEnabled(false);
            } else if (reporte == 2) {
                vista.txtCodDesde.setText(listaCondicionPag.get(0).getCo_cond());
                vista.txtDescripDesde.setText(listaCondicionPag.get(0).getCond_des());
            } else if (reporte == 3) {
                vista.txtCodHasta.setText(listaCondicionPag.get(0).getCo_cond());
                vista.txtDescripHasta.setText(listaCondicionPag.get(0).getCond_des());
            }

            vista.jDialogCondicionPago.dispose();
        } else if (event.getSource() == this.vista.btnCancelarCondicionPag) {
            vista.jDialogCondicionPago.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtValorCondicionPago == ke.getSource()) {
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
                sfieldName = (vista.jrCodigo.isSelected()) ? "co_cond" : "cond_des";
                vista.jtablaCondicionPago.setModel(new ModeloTablaCoindicionPago(modelo.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                        "saCondicionPago", sfieldName, vista.txtValorCondicionPago.getText(), Opcion)));
            }
        } else if (vista.txtCodDesde == ke.getSource()) {

            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 2;
                setModelCondicionPago();
                vista.jDialogCondicionPago.setSize(472, 358);
                vista.jDialogCondicionPago.setLocationRelativeTo(null);
                vista.jDialogCondicionPago.setVisible(true);

            }
        } else if (vista.txtCodHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 3;
                setModelCondicionPago();
                vista.jDialogCondicionPago.setSize(472, 358);
                vista.jDialogCondicionPago.setLocationRelativeTo(null);
                vista.jDialogCondicionPago.setVisible(true);
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    public void setModelCondicionPago() {
        vista.jtablaCondicionPago.setModel(new ModeloTablaCoindicionPago(modelo.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                "saCondicionPago", "co_cond", "", "2")));
    }
}
