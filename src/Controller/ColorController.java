/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.ColorBO;
import Conection.Conexion;
import Model.ColorModel;
import Vista.VistaColor;
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
public class ColorController implements ActionListener, KeyListener {

    VistaColor vistacolor;
    ColorModel model;
    public ArrayList<ColorBO> lista;
    public Conexion conexion;
    public int reporteDialo = 0;

    public ColorController(VistaColor color) {
        this.vistacolor = color;
        model = new ColorModel();
        lista = new ArrayList<ColorBO>();

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String campoAdic = "1";
        int resultado = 0;
        if (event.getSource() == this.vistacolor.btnGuardar) {
            try {
                resultado = model.pInsertarColor(
                        vistacolor.txtCodColor.getText(),
                        vistacolor.txtDescripcionColor.getText(),
                        campoAdic,
                        vistacolor.txtCampo1.getText(),
                        vistacolor.txtcampo2.getText(),
                        "campo3",
                        "campo4",
                        "campo5",
                        "campo6",
                        "campo7",
                        "campo8",
                        Vistaprincipal.lblNombreUsuario1.getText(),
                        Vistaprincipal.lblNombreSucursal.getText(),
                        "Re");
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    this.vistacolor.setterCampos();

                    try {
                        vistacolor.setModel();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(new JFrame(), e.toString(), "Exception", JOptionPane.PLAIN_MESSAGE);
            }
        } else if (event.getSource() == this.vistacolor.btnactulizar) {
            resultado = 0;
            System.err.println("Nombre Usuario :" + Vistaprincipal.lblNombreUsuario1.getText());
            resultado = model.actualizarColor(vistacolor.txtCodColor.getText(),
                    vistacolor.txtDescripcionColor.getText(),
                    vistacolor.txtCampo1.getText(),
                    vistacolor.txtcampo2.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText(), //"UsusrMo"
                    Vistaprincipal.lblNombreSucursal.getText()
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                this.vistacolor.setterCampos();
                try {
                    vistacolor.setModel();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (event.getSource() == this.vistacolor.btnNuevo) {
            this.vistacolor.txtCodColor.setEnabled(true);
            this.vistacolor.setterCampos();
            this.vistacolor.btnGuardar.setEnabled(true);
            this.vistacolor.btnEliminar.setEnabled(false);
            this.vistacolor.btnactulizar.setEnabled(false);

        } else if (event.getSource() == this.vistacolor.btnEliminar) {
            try {
                if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    resultado = model.pEliminarColor(vistacolor.txtCodColor.getText());
                    if (resultado != 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                        this.vistacolor.setterCampos();
                        try {
                            vistacolor.setModel();
                        } catch (Exception e) {
                            e.printStackTrace();
                            JOptionPane.showMessageDialog(new JFrame(), "El Color Se Encuentra asignado a un Articulo", "Software", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } else {
                    return;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if (event.getSource() == this.vistacolor.AceptarColor) {
            int selection = vistacolor.jtablaColor.getSelectedRow();
            lista = model.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                    "saColor",
                    "co_color",
                    vistacolor.jtablaColor.getValueAt(selection, 0).toString().replaceAll("\\s", ""),
                    "3");
            if (selection != -1) {
                if (reporteDialo == 1) {
                    vistacolor.txtCodDesde.setText(lista.get(0).getCo_color().replaceAll("\\s", ""));
                    vistacolor.txtDescripReportColorDesde.setText(lista.get(0).getDes_color());
                    vistacolor.JdialogoColor.dispose();
                }if(reporteDialo==2){
                    vistacolor.txtCodHasta.setText(lista.get(0).getCo_color().replaceAll("\\s", ""));
                    vistacolor.txtDescripReporteHastaColor.setText(lista.get(0).getDes_color());
                    vistacolor.JdialogoColor.dispose();
                }
                else{
                    vistacolor.txtCodColor.setText(lista.get(0).getCo_color().replaceAll("\\s", ""));
                    vistacolor.txtDescripcionColor.setText(lista.get(0).getDes_color());
                    vistacolor.txtCampo1.setText(lista.get(0).getCampo1());
                    vistacolor.txtcampo2.setText(lista.get(0).getCampo2());
                    vistacolor.JdialogoColor.dispose();
                    vistacolor.btnactulizar.setEnabled(true);
                    vistacolor.btnEliminar.setEnabled(true);
                    vistacolor.btnGuardar.setEnabled(false);
                }
            }
        } else if (event.getSource() == this.vistacolor.btnCancelar) {
            vistacolor.JdialogoColor.dispose();

        }// Evento al Darle Clic al boton  Imprimir . Muestra un jDialogReportColor 
        else if (event.getSource() == this.vistacolor.btnImprimir) {
            vistacolor.jDialogReportColor.setSize(600, 450);
            vistacolor.jDialogReportColor.setVisible(true);
            vistacolor.jDialogReportColor.setLocationRelativeTo(null);
            // JasperReport reporte = new JasperReport(report, campoAdic, campoAdic, expressionCollector, campoAdic);

        } else if (event.getSource() == this.vistacolor.btnAceptarImprimir) {
            String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\repColor.jasper";
            try {
                JasperReport reporte = null;
                Map parametro = new HashMap();
                String codDesde = vistacolor.txtCodDesde.getText(), codHasta = vistacolor.txtCodHasta.getText();
                String criterio = vistacolor.comboCriterio.getSelectedItem().toString().equals("Descendente") ? "DESC" : "ASC";

                if (codDesde.isEmpty() && codHasta.isEmpty()) {
                    codDesde = null;
                    codHasta = null;
                } else if (!codDesde.isEmpty() && codHasta.isEmpty()) {
                    codHasta = null;
                } else if (codDesde.isEmpty() && !codHasta.isEmpty()) {
                    codDesde = null;
                }
                parametro.put("sCo_Color_d", codDesde);
                parametro.put("sCo_Color_h", codHasta);
                reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                // reporte = (JasperReport) JRLoader.loadObject(getClass().getResource(ruta))   ;
                JasperPrint jprint = JasperFillManager.fillReport(ruta, parametro, conexion.conexions());
                JasperViewer view = new JasperViewer(jprint, false);
                view.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(ColorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (event.getSource() == this.vistacolor.btnCancelarImpresion) {
            vistacolor.txtCodDesde.setText("");
            vistacolor.txtCodHasta.setText("");
            vistacolor.jDialogReportColor.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vistacolor.txtCodDesde == ke.getSource()) {

            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                vistacolor.JdialogoColor.setSize(472, 358);
                vistacolor.JdialogoColor.setLocationRelativeTo(null);
                vistacolor.JdialogoColor.setVisible(true);
                reporteDialo = 1;
            }
        } else if (vistacolor.txtCodHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                vistacolor.JdialogoColor.setSize(472, 358);
                vistacolor.JdialogoColor.setLocationRelativeTo(null);
                vistacolor.JdialogoColor.setVisible(true);
                reporteDialo = 2;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
