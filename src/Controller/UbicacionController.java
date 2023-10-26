/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.UbicacionBO;
import Conection.Conexion;
import Model.UbicacionModel;
import Vista.VistaUbicacion;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static Vista.Vistaprincipal.lblNombreEmpresa;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
 * @author earana
 */
public class UbicacionController implements ActionListener, KeyListener {

    VistaUbicacion vista;
    UbicacionModel modelo;
    ArrayList<UbicacionBO> lista;
    public Conexion conexion;
    public int reporte;

    public UbicacionController(VistaUbicacion vista) {
        this.vista = vista;
        modelo = new UbicacionModel();
        lista = new ArrayList<>();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == this.vista.btnGuardar) {
            resultado = modelo.pInsertarUbicacion(
                    vista.txtcodigoUbicacion.getText(),
                    vista.txtDescripcionUbicacion.getText(),
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText(), //"us_in",
                    Vistaprincipal.lblNombreSucursal.getText() // "Co_Sucu"
            );

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setteCampos();
                vista.setModel();
            }

        } else if (event.getSource() == this.vista.btnactulizar) {
            resultado = modelo.pActualizarUbicacion(
                    vista.txtcodigoUbicacion.getText(),
                    vista.txtcodigoUbicacion.getText(),
                    vista.txtDescripcionUbicacion.getText(),
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText(),//"us_in",
                    Vistaprincipal.lblNombreSucursal.getText() //"Co_Sucu"
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setteCampos();
                vista.setModel();
            }

        } else if (event.getSource() == this.vista.btnEliminar) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarUbicacion(vista.txtcodigoUbicacion.getText());
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                    vista.setteCampos();
                    vista.setModel();
                }
            } else {
                return;
            }

        } else if (event.getSource() == this.vista.btnNuevo) {
            vista.setteCampos();
        } else if (event.getSource() == this.vista.btnBuscar) {
            vista.setModel();
            vista.jDialogUbicacion.setVisible(true);
            vista.jDialogUbicacion.setSize(472, 358);
            vista.jDialogUbicacion.setLocationRelativeTo(null);
        } else if (event.getSource() == this.vista.btnCancelarImpresion) {
            vista.jDialogReporteUbicacion.dispose();
        }
        else if (event.getSource() == this.vista.btnAceptarUbicacion) {
            int selection = vista.jTablaUbicacion.getSelectedRow();
            lista = modelo.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                    "saUbicacion",
                    "co_ubicacion",
                    vista.jTablaUbicacion.getValueAt(selection, 0).toString().replaceAll("\\s", ""),
                    "3");
            if (selection != -1) {
                vista.jDialogUbicacion.dispose();
                if(reporte==3){
                vista.txtCodDesde.setText(lista.get(0).getCo_ubicacion());
                vista.txtDescripcionDesde.setText(lista.get(0).getDes_ubicacion());
                    
                }else if (reporte ==4){
                vista.txtCodHasta.setText(lista.get(0).getCo_ubicacion());
                vista.txtDescripcionHasta.setText(lista.get(0).getDes_ubicacion());
                
                }
                else {
                
                vista.txtcodigoUbicacion.setText(lista.get(0).getCo_ubicacion());
                vista.txtDescripcionUbicacion.setText(lista.get(0).getDes_ubicacion());
                vista.txtCampo1.setText(lista.get(0).getCampo1());
                vista.txtcampo2.setText(lista.get(0).getCampo2());
                vista.txtCampo3.setText(lista.get(0).getCampo3());
                vista.txtcampo4.setText(lista.get(0).getCampo4());
                }
                vista.btnGuardar.setEnabled(false);
                vista.btnEliminar.setEnabled(true);
                vista.btnactulizar.setEnabled(true);
            }
        } else if (event.getSource() == this.vista.btnCancelar) {
            vista.jDialogUbicacion.dispose();
        } else if (event.getSource() == this.vista.btnImprimir) {
            vista.jDialogReporteUbicacion.setSize(600, 400);
            vista.jDialogReporteUbicacion.setVisible(true);
            vista.jDialogReporteUbicacion.setLocationRelativeTo(null);
        } else if (event.getSource().equals(vista.btnAceptarImprimir)) {
            String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepUbicacion.jasper";
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
            parametro.put("sCo_Ubicacion_d", codDesde);
            parametro.put("sCo_Ubicacion_h", codHasta);
            parametro.put("sCo_Sucursal", null);
            parametro.put("sCampOrderBy", vista.comboOrdenar.getSelectedItem().toString());
            parametro.put("sDir", criterio);
            parametro.put("bHeaderRep", "0");
            try {
                reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                JasperPrint jprint = JasperFillManager.fillReport(ruta, parametro, conexion.conexions());
                JasperViewer view = new JasperViewer(jprint, false);
                view.setVisible(true);
            } catch (JRException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent evt) {
        if (vista.txtCodDesde == evt.getSource()) {
            if (evt.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 3;
                vista.jDialogUbicacion.setVisible(true);
                vista.jDialogUbicacion.setSize(472, 358);
                vista.jDialogUbicacion.setLocationRelativeTo(null);
            }
        } else if (vista.txtCodHasta == evt.getSource()) {
            if (evt.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 4;
                vista.jDialogUbicacion.setVisible(true);
                vista.jDialogUbicacion.setSize(472, 358);
                vista.jDialogUbicacion.setLocationRelativeTo(null);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
