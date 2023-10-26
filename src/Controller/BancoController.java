/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.BancoBO;
import Conection.Conexion;
import Model.BancoModelo;
import Model.ModeloTablaBanco;
import Utilitarios.Utilitario;
import Vista.VistaBanco;
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
 * @author aranaVentur
 */
public class BancoController implements ActionListener, KeyListener {

    VistaBanco vista;
    BancoModelo modelo;
    ArrayList<BancoBO> listaBanco;
    int selection = 0;
    public Conexion conexion;
    public int reporte = 0;

    public BancoController(VistaBanco vista) {
        this.vista = vista;
        modelo = new BancoModelo();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == this.vista.btnGuardar1) {
            resultado = modelo.pInsertarBanco(
                    vista.txtCodigo.getText(),
                    vista.txtDescripcion.getText(),
                    vista.txtTelefono.getText(),
                    0,
                    0,
                    0,
                    0,
                    vista.txtCampo1.getText(),
                    vista.txtCampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtCampo4.getText(),
                    vista.txtCampo5.getText(),
                    vista.txtCampo6.getText(),
                    "",
                    "",
                    Vistaprincipal.lblNombreUsuario1.getText(), //sCo_Us_In,
                    Vistaprincipal.lblNombreSucursal.getText(),//sCo_Sucu_In, 
                    Utilitarios.Utilitario.nombreHost(), //sMaquina,
                    "0", //sRevisado,
                    "0", //sTrasnfe,
                    00,//deComisMismoBanco,
                    00 //deComisOtrosBancos
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setterCampos();
            }
        } else if (event.getSource() == this.vista.btnactulizar) {
            resultado = modelo.pActualizarBanco(vista.txtCodigo.getText(),
                    vista.txtCodigo.getText(),
                    vista.txtDescripcion.getText(),
                    vista.txtTelefono.getText(),
                    0,
                    0,
                    0,
                    0,
                    vista.txtCampo1.getText(),//sCampo1,
                    vista.txtCampo2.getText(),//sCampo2,
                    vista.txtCampo3.getText(),//sCampo3, 
                    vista.txtCampo4.getText(),//sCampo4,
                    vista.txtCampo5.getText(),//sCampo5, 
                    vista.txtCampo6.getText(),//sCampo6,
                    null,//sCampo7, 
                    null,//sCampo8,
                    Vistaprincipal.lblNombreUsuario1.getText(), //sCo_Us_Mo,
                    Vistaprincipal.lblNombreSucursal.getText(), //sCo_Sucu_Mo, 
                    Utilitario.nombreHost(),//sMaquina, 
                    "0", //sCampos, 
                    "0",//sRevisado, 
                    null,//sTrasnfe,
                    0,//deComisMismoBanco, 
                    0 //deComisOtrosBancos
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha  Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setterCampos();
            }

        } else if (event.getSource() == this.vista.btnEliminar1) {

            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarBanco(vista.txtCodigo.getText(), Utilitario.nombreHost(), Vistaprincipal.lblNombreUsuario1.getText(), Vistaprincipal.lblNombreSucursal.getText());
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.setterCampos();
                }
            } else {
                return;
            }
        } else if (event.getSource() == this.vista.btnBuscar) {
            reporte = 1;
            cargarDatosBanco(Vistaprincipal.tempEmpresa,
                    "saBanco",
                    "co_ban",
                    "",
                    "2");
            vista.jDialogBanco.setSize(472, 358);
            vista.jDialogBanco.setLocationRelativeTo(null);
            vista.jDialogBanco.setVisible(true);
        } else if (event.getSource() == this.vista.btnNuevo1) {
            vista.setterCampos();
        } else if (event.getSource().equals(this.vista.btnAceptarBanco)) {

            selection = vista.jtablaBanco.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaBanco = modelo.pObtenerListadoDatos(
                        Vista.Vistaprincipal.tempEmpresa,
                        "saBanco",
                        "co_ban",
                        vista.jtablaBanco.getValueAt(selection, 0).toString(), //sValor,
                        "3");

                if (reporte == 1) {

                    vista.txtCampo1.setText(listaBanco.get(0).getCampo1());
                    vista.txtCampo2.setText(listaBanco.get(0).getCampo2());
                    vista.txtCampo3.setText(listaBanco.get(0).getCampo3());
                    vista.txtCampo4.setText(listaBanco.get(0).getCampo4());
                    vista.txtCampo5.setText(listaBanco.get(0).getCampo5());
                    vista.txtCampo6.setText(listaBanco.get(0).getCampo6());
//                vista.txtCampo7.setText(listaBanco.get(0).getCampo7());
//                vista.txtCampo8.setText(listaBanco.get(0).getCampo8());
                    vista.txtCodigo.setText(listaBanco.get(0).getCo_ban());
                    vista.txtDescripcion.setText(listaBanco.get(0).getDes_ban());
                    vista.txtTelefono.setText(listaBanco.get(0).getTelefonos());
                   
                    vista.txtCodigo.setEditable(false);
                    vista.btnGuardar1.setEnabled(false);
                    vista.btnEliminar1.setEnabled(true);
                    vista.btnactulizar.setEnabled(true);
                } else if (reporte == 2) {
                    vista.txtCodDesde.setText(listaBanco.get(0).getCo_ban().replaceAll("\\s", ""));
                    vista.txtDescripDesde.setText(listaBanco.get(0).getDes_ban());
                   
                } else if (reporte == 3) {
                    vista.txtCodHasta.setText(listaBanco.get(0).getCo_ban().replaceAll("\\s", ""));
                    vista.txtDescripDesde1.setText(listaBanco.get(0).getDes_ban());
                }
                 vista.jDialogBanco.dispose();
            }
        } else if (event.getSource().equals(this.vista.btnCancelar)) {
            vista.jDialogBanco.dispose();
        } else if (event.getSource() == this.vista.btnImprimir) {
            vista.ReporteBanco.setSize(610, 450);
            vista.ReporteBanco.setLocationRelativeTo(null);
            vista.ReporteBanco.setVisible(true);
        } else if (event.getSource().equals(vista.btnAceptarImprimir)) {
            try {

                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepBanco.jasper";
                Map parametro = new HashMap();

                String criterio = vista.comboCriterio.getSelectedItem().toString().equals("Descendente") ? "DESC" : "ASC";
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
                parametro.put("sCo_Banco_d", codDesde);
                parametro.put("sCo_Banco_h", codHasta);
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
                ex.printStackTrace();
            }
        } else if (event.getSource().equals(vista.btnCancelarReporte)) {
            vista.ReporteBanco.dispose();
        }
    }

    public void cargarDatosBanco(
            String sDatabase_Nam,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        listaBanco = modelo.pObtenerListadoDatos(sDatabase_Nam,
                sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtablaBanco.setModel(new ModeloTablaBanco(listaBanco));
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtBuscar.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String OpcionFac = "0", sfieldNameArt = "";
                if (vista.jRInicio.isSelected()) {
                    OpcionFac = "0";
                } else if (vista.jRFinal.isSelected()) {
                    OpcionFac = "1";
                } else if (vista.jrCualquier.isSelected()) {
                    OpcionFac = "2";
                } else if (vista.jRexacta.isSelected()) {
                    OpcionFac = "3";
                }
                sfieldNameArt = (vista.rjcodigo.isSelected())
                        ? "co_ban"
                        : "des_ban";
                cargarDatosBanco(
                        Vista.Vistaprincipal.tempEmpresa,
                        "saBanco",
                        sfieldNameArt,
                        vista.txtBuscar.getText(),
                        OpcionFac
                );
            }
        } else if (vista.txtCodDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosBanco(
                        Vista.Vistaprincipal.tempEmpresa,
                        "saBanco",
                        "co_ban",
                        vista.txtBuscar.getText(),
                        "2"
                );
                reporte = 2;
                vista.jDialogBanco.setSize(472, 358);
                vista.jDialogBanco.setLocationRelativeTo(null);
                vista.jDialogBanco.setVisible(true);
            }
        } else if (vista.txtCodHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 3;
                cargarDatosBanco(
                        Vista.Vistaprincipal.tempEmpresa,
                        "saBanco",
                        "co_ban",
                        vista.txtBuscar.getText(),
                        "2"
                );
                reporte = 3;
                vista.jDialogBanco.setSize(472, 358);
                vista.jDialogBanco.setLocationRelativeTo(null);
                vista.jDialogBanco.setVisible(true);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }
}
