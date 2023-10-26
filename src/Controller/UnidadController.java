/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.UnidadBO;
import Conection.Conexion;
import Model.UnidadModel;
import Vista.VistaUnidad;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class UnidadController implements ActionListener, KeyListener {

    VistaUnidad vista;
    public UnidadModel modelo;
    public int selection = 0;
    public ArrayList<UnidadBO> lista;
    public Conexion conexion;
    public int reporteDialo = 0;

    public UnidadController(VistaUnidad vista) {
        this.vista = vista;
        modelo = new UnidadModel();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == this.vista.btnGuardar) {

            resultado = modelo.insertarUnidad(vista.txtCodUnidad.getText(),
                    vista.txtDescripcionUnidad.getText(),
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText()// "usuario"
            );
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setearCampos();
                try {
                    vista.setModel();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (event.getSource() == this.vista.btnactulizar) {

            resultado = 0;
            resultado = modelo.actualizarUnidad(vista.txtCodUnidad.getText(),
                    vista.txtDescripcionUnidad.getText(),
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText() //"usu"
            );
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Se ha Actualizar Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setearCampos();
                try {
                    vista.setModel();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (event.getSource() == this.vista.btnEliminar) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {

                    resultado = modelo.eliminaUnidad(vista.txtCodUnidad.getText());
                    if (resultado > 0) {
                        JOptionPane.showMessageDialog(null, "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                        vista.setearCampos();
                        vista.setModel();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }

        } else if (event.getSource() == this.vista.btnNuevo) {
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEliminar.setEnabled(false);
            this.vista.btnactulizar.setEnabled(false);
            this.vista.txtCodUnidad.setEnabled(true);
            this.vista.setearCampos();
        } else if (event.getSource() == this.vista.btnBuscar) {
            vista.JdialogoUnidad.setVisible(true);
            vista.JdialogoUnidad.setSize(472, 358);
            vista.JdialogoUnidad.setLocationRelativeTo(null);
        } else if (event.getSource() == this.vista.btnAceptarUnidad) {
            selection = vista.jtablaUnidad.getSelectedRow();
            lista = modelo.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                    "saUnidad",
                    "co_uni",
                    vista.jtablaUnidad.getValueAt(selection, 0).toString().replaceAll("\\s", ""),
                    "3");
            if (selection != -1) {

                if (reporteDialo == 1) {
                    vista.txtCodDesde.setText(lista.get(0).getCo_uni().replaceAll("\\s", ""));
                    vista.txtDescripcionDesde.setText(lista.get(0).getDes_uni());
                    vista.JdialogoUnidad.dispose();
                } else if (reporteDialo == 2) {
                    vista.txtCodHasta.setText(lista.get(0).getCo_uni().replaceAll("\\s", ""));
                    vista.txtdescripHasta.setText(lista.get(0).getDes_uni());
                    vista.JdialogoUnidad.dispose();
                }else {
                vista.txtCodUnidad.setText(lista.get(0).getCo_uni());
                vista.txtDescripcionUnidad.setText(lista.get(0).getDes_uni());
                vista.txtCampo1.setText(lista.get(0).getCampo1());
                vista.txtcampo2.setText(lista.get(0).getCampo2());
                vista.JdialogoUnidad.dispose();
                vista.btnGuardar.setEnabled(false);
                vista.btnEliminar.setEnabled(true);
                vista.btnactulizar.setEnabled(true);
            }
            }
        } else if (event.getSource() == this.vista.btnCancelar) {
            vista.JdialogoUnidad.dispose();
        } else if (event.getSource() == this.vista.btnImprimir) {
            vista.jDialogReporteUnidad.setSize(600, 400);
            vista.jDialogReporteUnidad.setVisible(true);
            vista.jDialogReporteUnidad.setLocationRelativeTo(null);

        } else if (event.getSource() == this.vista.btnAceptarImprimir) {
            System.out.println("Controller.UnidadController.actionPerformed()");
            String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\repUnidad.jasper";
            JasperReport reporte = null;
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

            parametro.put("sCo_uni_d", codDesde);
            parametro.put("sCo_uni_h", codHasta);
            
            try {
                reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                JasperPrint jprint = JasperFillManager.fillReport(ruta, parametro, conexion.conexions());
                JasperViewer view = new JasperViewer(jprint, false);
                view.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(UnidadController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (event.getSource() == this.vista.btnCancelarImpresion) {
            vista.txtCodDesde.setText("");
            vista.txtCodHasta.setText("");
            vista.jDialogReporteUnidad.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtCodDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                vista.JdialogoUnidad.setSize(472, 358);
                vista.JdialogoUnidad.setLocationRelativeTo(null);
                vista.JdialogoUnidad.setVisible(true);
                reporteDialo = 1;
            }
        } else if (vista.txtCodHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                vista.JdialogoUnidad.setSize(472, 358);
                vista.JdialogoUnidad.setLocationRelativeTo(null);
                vista.JdialogoUnidad.setVisible(true);
                reporteDialo = 2;
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
