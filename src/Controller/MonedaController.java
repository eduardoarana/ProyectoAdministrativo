/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.MonedaBO;
import Beans.TasaBO;
import Conection.Conexion;
import Model.ModeloTablaTasarenglon;
import Model.MonedaModel;
import Model.TasaModelo;
import Vista.VistaMoneda;
import Vista.Vistaprincipal;
import static Vista.Vistaprincipal.lblNombreEmpresa;
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
 * @author AranaV
 */
public class MonedaController implements ActionListener, KeyListener {

    VistaMoneda vista;
    MonedaModel modeloMonedas;
    int selection = 0, resultado = 0;
    TasaModelo tasaModelo;
    ArrayList<MonedaBO> listaMonedas;
    public Conexion conexion;
    public int reporteDialo = 0;

    public MonedaController() {
    }

    public MonedaController(VistaMoneda vista) {
        this.vista = vista;
        modeloMonedas = new MonedaModel();

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == this.vista.btnGuardar) {
            resultado = modeloMonedas.pInsertarMoneda(vista.txtcodigoMoneda.getText(),
                    vista.txtDescripcionMoneda.getText(),
                    "100",
                    ((vista.cheInversaTasa.isSelected()) ? "1" : "0"),
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    Vistaprincipal.lblNombreUsuario1.getText(),
                    Vistaprincipal.lblNombreSucursal.getText(),
                    Utilitarios.Utilitario.nombreHost(),
                    "0",
                    "2"//sTrasnfe
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }

        } else if (event.getSource() == this.vista.btnNuevo) {
            vista.settearCampos();
        } else if (event.getSource() == this.vista.btnactulizar) {
            resultado = modeloMonedas.pActualizarMoneda(vista.txtcodigoMoneda.getText(), vista.txtcodigoMoneda.getText(),
                    vista.txtDescripcionMoneda.getText(),
                    "2222",
                    ((vista.cheInversaTasa.isSelected()) ? "1" : "0"), // bRelacion
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    Vistaprincipal.lblNombreUsuario1.getText(),
                    Vistaprincipal.lblNombreSucursal.getText(),
                    Utilitarios.Utilitario.nombreHost(),
                    "c",//sCampos,
                    "",//sRevisado,
                    "1" //sTrasnfe
            );

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }

        } else if (event.getSource() == this.vista.btnEliminar) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modeloMonedas.pEliminarMonedas(
                        vista.txtcodigoMoneda.getText(),
                        Utilitarios.Utilitario.nombreHost(),
                        Vistaprincipal.lblNombreUsuario1.getText(),//co_usu 
                        Vistaprincipal.lblNombreUsuario1.getText() //"mod"
                );
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                    vista.settearCampos();
                }
            } else {
                return;
            }
        } else if (event.getSource() == this.vista.btnAceptar) {
            selection = vista.jtableMonedas.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {

                listaMonedas = modeloMonedas.pObtenerListadoDatos(lblNombreEmpresa.getText(), "saMoneda",
                        "co_mone",
                        vista.jtableMonedas.getValueAt(selection, 0).toString(), "2");

                if (reporteDialo == 1) {

                    //((vista.cheInversaTasa.isSelected()) ? "1" : "0")
                    if (listaMonedas.get(0).getRelacion().equals("0")) {
                        vista.cheInversaTasa.setSelected(false);
                    } else {
                        vista.cheInversaTasa.setSelected(true);
                    }
                    vista.txtcodigoMoneda.setText(listaMonedas.get(0).getCo_mone().replaceAll("\\s", ""));
                    vista.txtDescripcionMoneda.setText(listaMonedas.get(0).getMone_des());
                    vista.txtCampo1.setText(listaMonedas.get(0).getCampo1());
                    vista.txtcampo2.setText(listaMonedas.get(0).getCampo2());
                } else if (reporteDialo == 2) {
                    vista.txtCodDesde.setText(listaMonedas.get(0).getCo_mone().replaceAll("\\s", ""));
                    vista.txtDescripDesde.setText(listaMonedas.get(0).getMone_des());
                } else if (reporteDialo == 3) {
                    vista.txtCodHasta.setText(listaMonedas.get(0).getCo_mone().replaceAll("\\s", ""));
                    vista.txtDescripHasta.setText(listaMonedas.get(0).getMone_des());
                }

                vista.jDialogMonedas.dispose();
                
            }
            vista.btnEliminar.setEnabled(true);
            vista.btnactulizar.setEnabled(true);
            vista.btnGuardar.setEnabled(false);

        } else if (event.getSource() == this.vista.btnCancelar) {
            vista.jDialogMonedas.dispose();

        } else if (event.getSource() == this.vista.btnImprimir) {
            vista.jDialogReporteMoneda.setSize(600, 445);
            vista.jDialogReporteMoneda.setLocationRelativeTo(null);
            vista.jDialogReporteMoneda.setVisible(true);
        } else if (event.getSource() == this.vista.btnAceptarImprimirMoneda) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepMoneda.jasper";
                Map parametro = new HashMap();
                String codDesde = vista.txtCodDesde.getText(), codHasta = vista.txtCodHasta.getText();
                if (codDesde.isEmpty() && codHasta.isEmpty()) {
                    codDesde = null;
                    codHasta = null;
                } else if (!codDesde.isEmpty() && codHasta.isEmpty()) {
                    codHasta = null;
                } else if (codDesde.isEmpty() && !codHasta.isEmpty()) {
                    codDesde = null;
                }
                String criterio = vista.comboCriterio.getSelectedItem().toString().equals("Descendente") ? "DESC" : "ASC";

                parametro.put("sCo_Moneda_d", codDesde);
                parametro.put("sCo_Moneda_h", codHasta);
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
            vista.jDialogReporteMoneda.dispose();
        } else if (event.getSource() == this.vista.btnBuscar) {
            reporteDialo = 1;
            vista.jDialogMonedas.setSize(472, 358);
            vista.jDialogMonedas.setLocationRelativeTo(null);
            cargarDatosMonedas(Vistaprincipal.tempEmpresa, "saMoneda", "co_mone", "", "2");
            vista.jDialogMonedas.setVisible(true);
        } else if (event.getSource().equals(vista.btnTasa)) {

            if (vista.txtcodigoMoneda.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar una moneda", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            vista.txtCodigoMonedaTasa.setText(vista.txtcodigoMoneda.getText());
            vista.txtdescripTasa.setText(vista.txtDescripcionMoneda.getText());

            cargarDatosTasa(vista.txtcodigoMoneda.getText());
            vista.jDialogTasa.setSize(482, 467);
            vista.jDialogTasa.setLocationRelativeTo(null);
            vista.jDialogTasa.setVisible(true);
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
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
                sfieldName = (vista.jrCodigo.isSelected()) ? "co_mone" : "mone_des";
                cargarDatosMonedas(Vistaprincipal.tempEmpresa, "saMoneda", sfieldName, vista.txtBuscar.getText(), Opcion);
            }
        } else if (vista.txtCodDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporteDialo = 2;
                vista.jDialogMonedas.setSize(472, 358);
                vista.jDialogMonedas.setLocationRelativeTo(null);
                cargarDatosMonedas(Vistaprincipal.tempEmpresa, "saMoneda", "co_mone", "", "2");
                vista.jDialogMonedas.setVisible(true);
            }
        } else if (vista.txtCodHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporteDialo = 3;
                vista.jDialogMonedas.setSize(472, 358);
                vista.jDialogMonedas.setLocationRelativeTo(null);
                cargarDatosMonedas(Vistaprincipal.tempEmpresa, "saMoneda", "co_mone", "", "2");
                vista.jDialogMonedas.setVisible(true);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    public void cargarDatosMonedas(String dAtaBaseName, String tableName, String Field_Name, String valor, String option) {
        vista.jtableMonedas.setModel(new Model.ModeloTablaMoneda(modeloMonedas.pObtenerListadoDatos(dAtaBaseName, tableName, Field_Name, valor, option)));
    }

    public void cargarDatosTasa(String co_mone) {
        ModeloTablaTasarenglon modeloTablaTasarenglon = new ModeloTablaTasarenglon();
        ArrayList<TasaBO> lista = new ArrayList<TasaBO>();
        tasaModelo = new TasaModelo();
        lista = tasaModelo.pSeleccionarRenglonTasa(co_mone);
        modeloTablaTasarenglon.setlistaTasa(lista);
        VistaMoneda.jtablaTasa.setModel(modeloTablaTasarenglon);
        modeloTablaTasarenglon.refrescarTable();
    }
}
