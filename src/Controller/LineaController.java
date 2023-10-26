/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.LineaBO;
import Conection.Conexion;
import Model.LineaModel;
import Vista.VistaLinea;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
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
public class LineaController implements ActionListener, KeyListener {

    VistaLinea vista;
    LineaModel model;
    public int selection = 0;
    public ArrayList<LineaBO> lista;
    public Conexion conexion;
    public int reporteDialo = 0;

    public LineaController(VistaLinea vista) {
        this.vista = vista;
        model = new LineaModel();
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        int resultado = 0;
        if (event.getSource() == this.vista.btnGuardar) {
            if (vista.txtcodigoLinea.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo articulo no puede estar vacio ", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            resultado = model.pLineaArticulo(
                    vista.txtcodigoLinea.getText(),
                    vista.txtDescripcionLinea1.getText(),
                    "XML",
                    "",
                    "",
                    vista.txtComisionVentas.getText(),
                    vista.txtComisionCobros.getText(),
                    "", "", "", "",
                    "", "", "");

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                this.vista.setterCampos();
                try {
                    this.vista.setModel();
                } catch (Exception e) {
                }
            }
        } else if (event.getSource() == this.vista.btnactulizar) {
            System.out.println("Actualizar");
            try {
                resultado = model.pActualizarLineaArticulo(vista.txtcodigoLinea.getText(),
                        vista.txtDescripcionLinea1.getText(),
                        "", "", "",
                        vista.txtComisionVentas.getText(),
                        vista.txtComisionCobros.getText(),
                        vista.txtCampo1.getText(), vista.txtcampo2.getText(),
                        Vistaprincipal.lblNombreUsuario1.getText() //"UsusrMo"
                );

                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);

                    vista.setterCampos();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else if (event.getSource() == this.vista.btnEliminar) {
            try {

                if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    resultado = model.pEliminarLineaArticulo(vista.txtcodigoLinea.getText());
                    if (resultado != 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                        this.vista.setterCampos();
                        try {
                            this.vista.setModel();
                        } catch (Exception e) {
                        }
                    }
                } else {
                    return;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (event.getSource() == this.vista.btnNuevo) {

            this.vista.txtcodigoLinea.setEnabled(true);
            this.vista.setterCampos();
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEliminar.setEnabled(false);
            this.vista.btnactulizar.setEnabled(false);
        } else if (event.getSource() == this.vista.btnBuscar) {
            try {
                vista.setModel();
                vista.jDialogoLinea.setVisible(true);
                vista.jDialogoLinea.setSize(472, 358);
                vista.jDialogoLinea.setLocationRelativeTo(null);
            } catch (SQLException ex) {
                Logger.getLogger(LineaController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (event.getSource() == this.vista.btnAceptarLinea) {
            selection = vista.jTablaLinea.getSelectedRow();
            lista = model.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                    "saLineaArticulo",
                    "co_lin",
                    vista.jTablaLinea.getValueAt(selection, 0).toString().replaceAll("\\s", ""),
                    "3");
            if (selection != -1) {
                if (reporteDialo == 1) {
                    vista.txtCodDesde.setText(lista.get(0).getCo_lin().replaceAll("\\s", ""));
                    vista.txtDescripDesde.setText(lista.get(0).getLin_des());
                    vista.jDialogoLinea.dispose();
                } else if (reporteDialo == 2) {
                    vista.txtCodHasta.setText(lista.get(0).getCo_lin().replaceAll("\\s", ""));
                    vista.txtDescripHasta.setText(lista.get(0).getLin_des());
                    vista.jDialogoLinea.dispose();
                } else {
                    vista.txtcodigoLinea.setText(lista.get(0).getCo_lin());
                    vista.txtDescripcionLinea1.setText(lista.get(0).getLin_des());
                    vista.txtCampo1.setText(lista.get(0).getCampo1());
                    vista.txtcampo2.setText(lista.get(0).getCampo2());
                    vista.txtComisionVentas.setText(lista.get(0).getComi_lin());
                    vista.txtComisionCobros.setText(lista.get(0).getComi_lin2());
                    vista.jDialogoLinea.dispose();
                    vista.btnEliminar.setEnabled(true);
                    vista.btnactulizar.setEnabled(true);
                    vista.btnGuardar.setEnabled(false);
                }
            }

        } else if (event.getSource() == this.vista.btnCancelar) {
            vista.jDialogoLinea.dispose();
        } else if (event.getSource() == this.vista.btnAceptarImprimir) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepLineaArticulo.jasper";
                Map parametro = new HashMap();
                String codDesde = vista.txtCodDesde.getText().replaceAll("", ruta), codHasta = vista.txtCodHasta.getText();
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
                parametro.put("sCo_Lin_d", codDesde);
                parametro.put("sCo_Lin_h", codHasta);
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
        } else if (event.getSource() == this.vista.btnImprimir) {
            vista.jDialogReporteLinea.setVisible(true);
            vista.jDialogReporteLinea.setSize(600, 450);
            vista.jDialogReporteLinea.setLocationRelativeTo(null);
        } else if (event.getSource() == this.vista.btnCancelarImpresion) {
            vista.txtCodDesde.setText("");
            vista.txtCodHasta.setText("");
            vista.jDialogReporteLinea.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtCodDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                vista.jDialogoLinea.setSize(472, 358);
                vista.jDialogoLinea.setLocationRelativeTo(null);
                vista.jDialogoLinea.setVisible(true);
                reporteDialo = 1;
            }
        } else if (vista.txtCodHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                vista.jDialogoLinea.setSize(472, 358);
                vista.jDialogoLinea.setLocationRelativeTo(null);
                vista.jDialogoLinea.setVisible(true);
                reporteDialo = 2;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
