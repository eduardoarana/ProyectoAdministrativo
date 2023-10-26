/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.CuentaInEgreBO;
import Conection.Conexion;
import Model.CuentaInEgreModel;
import Model.ModelTablaCuentaInEgre;
import Vista.VistaCuentaInEgre;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
 * @author earana
 */
public class CuentaInEgreController implements ActionListener, KeyListener {

    VistaCuentaInEgre vista;
    CuentaInEgreModel modelo;
    ArrayList<CuentaInEgreBO> lista;
    int selection = 0, reporte = 0;
    public Conexion conexion;

    ;

    public CuentaInEgreController(VistaCuentaInEgre vista) {
        this.vista = vista;
        modelo = new CuentaInEgreModel();
        lista = new ArrayList<CuentaInEgreBO>();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;

        if (event.getSource() == this.vista.btnGuardar) {
            resultado = modelo.pInsertarCuentaIngreso(vista.txtCodCuentInEgre.getText(), vista.txtDescripcionCuentInEgre.getText(),
                    vista.txtCodISLR.getText(), "", vista.txtCampo1.getText(), vista.txtcampo2.getText(), vista.txtCampo3.getText(), vista.txtcampo4.getText(),
                    null, null, null, null,
                    Vistaprincipal.lblNombreUsuario1.getText(),
                    Utilitarios.Utilitario.nombreHost(), null, "0",
                    Vistaprincipal.lblNombreSucursal.getText());
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setearCampos();
            }
        } else if (event.getSource() == this.vista.btnactulizar) {
            resultado = modelo.pActualizarCuentaIngreso(vista.txtCodCuentInEgre.getText(), vista.txtCodCuentInEgre.getText(), vista.txtDescripcionCuentInEgre.getText(), vista.txtCodISLR.getText(), null, vista.txtCampo1.getText(), vista.txtcampo2.getText(), vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(), null, null, null, null,
                    Vistaprincipal.lblNombreUsuario1.getText(),//"sCo_Us_Mo" 
                    Vistaprincipal.lblNombreUsuario1.getText(), // "sCo_Sucu_Mo"
                    Utilitarios.Utilitario.nombreHost(), "", null, null);
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setearCampos();
            }
        } else if (event.getSource() == this.vista.btnEliminar) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarCuentaIngreso(vista.txtCodCuentInEgre.getText(), Utilitarios.Utilitario.nombreHost(), "us_mo", "sucumo");
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                    vista.setearCampos();
                }
            } else {
                return;
            }

        } else if (event.getSource() == this.vista.btnBuscar) {
            reporte = 1;
            setModel();
            vista.jDialogCuentaInEgre.setSize(472, 358);
            vista.jDialogCuentaInEgre.setLocationRelativeTo(null);
            vista.jDialogCuentaInEgre.setVisible(true);
        } else if (event.getSource() == this.vista.btnNuevo) {
            vista.setearCampos();
        } else if (event.getSource() == this.vista.btnImprimir) {
            vista.jDialogReporteCuentIngEgr.setSize(600, 445);
            vista.jDialogReporteCuentIngEgr.setLocationRelativeTo(null);
            vista.jDialogReporteCuentIngEgr.setVisible(true);
        } else if (event.getSource() == this.vista.btnAceptarDialogo) {
            selection = vista.jtablaCuentaInEgre.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            lista = modelo.pObtenerListadoDatosCuentaInEgre("admin_a", "saCuentaIngEgr", "co_cta_ingr_egr", vista.jtablaCuentaInEgre.getValueAt(selection, 0).toString(), "3");
            if (reporte == 1) {
                vista.txtCodCuentInEgre.setText(lista.get(0).getCo_cta_ingr_egr().toString().replaceAll("\\s",""));
                vista.txtDescripcionCuentInEgre.setText(lista.get(0).getDescrip());
                vista.txtCampo1.setText(lista.get(0).getCampo1());
                vista.txtcampo2.setText(lista.get(0).getCampo1());
                vista.txtCampo3.setText(lista.get(0).getCampo1());
                vista.txtcampo4.setText(lista.get(0).getCampo1());
                vista.btnEliminar.setEnabled(true);
                vista.btnactulizar.setEnabled(true);
                vista.btnGuardar.setEnabled(false);
            } else if (reporte == 2) {
                vista.txtCodDesde.setText(lista.get(0).getCo_cta_ingr_egr().toString().replaceAll("\\s",""));
                vista.txtDescripDesde.setText(lista.get(0).getDescrip());
            } else if (reporte == 3) {
                vista.txtCodHasta.setText(lista.get(0).getCo_cta_ingr_egr().toString().replaceAll("\\s",""));
                vista.txtDescripHasta.setText(lista.get(0).getDescrip());
            }
            vista.jDialogCuentaInEgre.dispose();
        } else if (event.getSource() == this.vista.btnCancelarDialogCuentaIng) {
            vista.jDialogCuentaInEgre.dispose();
        } else if (event.getSource() == this.vista.btnAceptarImprimirCuenta) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepCuentaIngEgr.jasper";
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
                parametro.put("sCo_IngEgr_d", codDesde);
                parametro.put("sCo_IngEgr_h", codHasta);
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
            vista.jDialogReporteCuentIngEgr.dispose();
        }
    }

    public void setModel() {
        vista.jtablaCuentaInEgre.setModel(new ModelTablaCuentaInEgre(modelo.pObtenerListadoDatosCuentaInEgre(Vistaprincipal.tempEmpresa,
                "saCuentaIngEgr", "descrip", "", "2")));
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }
    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtValorCuentaInEgre == ke.getSource()) {
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
                sfieldName = (vista.jrCodigo.isSelected()) ? "co_cta_ingr_egr" : "descrip";
                vista.jtablaCuentaInEgre.setModel(new ModelTablaCuentaInEgre(modelo.pObtenerListadoDatosCuentaInEgre(Vistaprincipal.tempEmpresa,
                        "saCuentaIngEgr", sfieldName,
                        vista.txtValorCuentaInEgre.getText(),
                        Opcion)));
            }
        } else if (vista.txtCodDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 2;
                setModel();
                vista.jDialogCuentaInEgre.setSize(472, 358);
                vista.jDialogCuentaInEgre.setLocationRelativeTo(null);
                vista.jDialogCuentaInEgre.setVisible(true);
            }
        } else if (vista.txtCodHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 3;
                setModel();
                vista.jDialogCuentaInEgre.setSize(472, 358);
                vista.jDialogCuentaInEgre.setLocationRelativeTo(null);
                vista.jDialogCuentaInEgre.setVisible(true);
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent ke) {

    }

}
