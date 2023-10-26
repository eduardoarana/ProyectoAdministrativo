/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.CategoriaBO;
import Conection.Conexion;
import Model.CategoriaModel;
import Vista.VistaCategoria;
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
public class CategoriaController implements ActionListener, KeyListener {

    VistaCategoria vista;
    CategoriaModel modelo;
    public int selection = 0;
    public ArrayList<CategoriaBO> lista;
    public Conexion conexion;
    public int reporteCategoria = 0;

    public CategoriaController(VistaCategoria vista) {
        this.vista = vista;
        modelo = new CategoriaModel();
        lista = new ArrayList<>();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == this.vista.btnGuardar) {
            resultado = modelo.pInsertarCategoria(vista.txtCodCategoria.getText(),
                    vista.txtDescripcionCategoria.getText(),
                    "",
                    "",
                    "",
                    Vistaprincipal.lblNombreSucursal.getText(),//sCo_Sucu
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText() //"sCo_Us_In"

            );
            if (resultado != 0) {

                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setterCampos();
                vista.setModel();
            }
        } else if (event.getSource() == this.vista.btnactulizar) {
            resultado = modelo.pActualizarCategoriaArticulo(vista.txtCodCategoria.getText(), vista.txtDescripcionCategoria.getText(),
                    "", "", "", vista.txtCampo1.getText(), vista.txtcampo2.getText(), "", "");

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha  Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setterCampos();
                vista.setModel();
            }
        } else if (event.getSource() == this.vista.btnEliminar) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarCategoriaArticulo(vista.txtCodCategoria.getText());
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                    vista.setterCampos();
                    vista.setModel();
                }
            } else {
                return;
            }
        } else if (event.getSource() == this.vista.btnNuevo) {
            this.vista.txtCodCategoria.setEnabled(true);
            this.vista.setterCampos();
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEliminar.setEnabled(false);
            this.vista.btnactulizar.setEnabled(false);
            vista.setModel();
        } else if (event.getSource() == this.vista.btnBuscar) {
            vista.jDialogoCategoria.setSize(472, 358);
            vista.jDialogoCategoria.setLocationRelativeTo(null);
            vista.jDialogoCategoria.setVisible(true);

        } else if (event.getSource() == this.vista.btnAceptarCategoria) {
            selection = vista.jtablaCategoria.getSelectedRow();
            lista = modelo.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                    "saCatArticulo",
                    "co_cat",
                    vista.jtablaCategoria.getValueAt(selection, 0).toString().replaceAll("\\s", ""),
                    "3");
            if (selection != -1) {
                if (reporteCategoria == 1) {
                    vista.txtCodDesde.setText(lista.get(0).getCo_cat().replaceAll("\\s", ""));
                    vista.txtDescripReportCategoria.setText(lista.get(0).getCat_des());
                    vista.jDialogoCategoria.dispose();

                } else if (reporteCategoria == 2) {
                    vista.txtCodHasta.setText(lista.get(0).getCo_cat().replaceAll("\\s", ""));
                    vista.txtDescripcionReportHsta.setText(lista.get(0).getCat_des());
                    vista.jDialogoCategoria.dispose();

                } else {
                    vista.txtCodCategoria.setText(lista.get(0).getCo_cat().replaceAll("\\s", ""));
                    vista.txtDescripcionCategoria.setText(lista.get(0).getCat_des());
                    vista.txtCampo1.setText(lista.get(0).getCampo1());
                    vista.txtcampo2.setText(lista.get(0).getCampo2());
                    vista.jDialogoCategoria.dispose();
                    vista.btnGuardar.setEnabled(false);
                    vista.btnEliminar.setEnabled(true);
                    vista.btnactulizar.setEnabled(true);
                }
            }
        } else if (event.getSource() == this.vista.btnCancelar) {
            vista.jDialogoCategoria.dispose();
        } else if (event.getSource() == this.vista.btnImprimir) {
            vista.jDialogReporteCategoria.setVisible(true);
            vista.jDialogReporteCategoria.setSize(600, 450);
            vista.jDialogReporteCategoria.setLocationRelativeTo(null);
        } else if (event.getSource() == this.vista.btnAceptarImprimir) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepCatArticulo.jasper";
                Map parametro = new HashMap();
                String criterio = vista.comboCriterio.getSelectedItem().toString().equals("Descendente") ? "DESC" : "ASC";

                String codDesde = vista.txtCodDesde.getText(), codHasta = vista.txtCodHasta.getText();
                if (codDesde.isEmpty() && codHasta.isEmpty()) {
                    codDesde = null;
                    codHasta = null;
                } else if (!codDesde.isEmpty() && codHasta.isEmpty()) {
                    codHasta = null;
                } else if (codDesde.isEmpty() && !codHasta.isEmpty()) {
                    codDesde = null;
                }

                parametro.put("sCo_Cat_d", codDesde);
                parametro.put("sCo_Cat_h", codHasta);
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
            vista.txtCodDesde.setText("");
            vista.txtCodHasta.setText("");
            vista.jDialogReporteCategoria.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtCodDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                vista.jDialogoCategoria.setSize(472, 358);
                vista.jDialogoCategoria.setLocationRelativeTo(null);
                vista.jDialogoCategoria.setVisible(true);
                reporteCategoria = 1;
            }
        } else if (vista.txtCodHasta.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                vista.jDialogoCategoria.setSize(472, 358);
                vista.jDialogoCategoria.setLocationRelativeTo(null);
                vista.jDialogoCategoria.setVisible(true);
                reporteCategoria = 2;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
