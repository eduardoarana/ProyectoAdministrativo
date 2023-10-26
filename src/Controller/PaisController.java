/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.MonedaBO;
import Beans.PaisBO;
import Conection.Conexion;
import Model.ModeloTablaMoneda;
import Model.MonedaModel;
import Model.PaisModel;
import Vista.VistaPais;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
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
public class PaisController implements ActionListener, KeyListener {

    VistaPais vista;
    Model.PaisModel modelo;
    MonedaModel modeloMoneda;
    ArrayList<PaisBO> listaPais;
    ArrayList<MonedaBO> listaMoneda;
    int selection = 0;
    public int reporte = 0;
    public Conexion conexion;

    public PaisController(VistaPais vista) {
        this.vista = vista;
        modelo = new PaisModel();
        listaPais = new ArrayList<PaisBO>();
        listaMoneda = new ArrayList<MonedaBO>();
        modeloMoneda = new MonedaModel();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == this.vista.btnGuardar) {
            resultado = modelo.pInsertarPais(vista.txtCodPais.getText(),
                    vista.txtDescripcionPais.getText(),
                    vista.txtcodMoneda.getText(),
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(), vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(), null, null, null, null,
                    Vistaprincipal.tempUsuario,
                    Vistaprincipal.tempSucrsal,
                    Utilitarios.Utilitario.nombreHost(), null, "0");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampo();
            }
        } else if (event.getSource() == this.vista.btnactulizar) {
            resultado = modelo.pActualizarPais(vista.txtCodPais.getText(),
                    vista.txtCodPais.getText(),
                    vista.txtcodMoneda.getText(),
                    vista.txtDescripcionPais.getText(),
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(), vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(), null, null, null, null,
                    Vistaprincipal.lblNombreUsuario1.getText(),//"999",
                    Vistaprincipal.lblNombreSucursal.getText(),//"SUCU", 
                    Utilitarios.Utilitario.nombreHost(), "SCAMPO",
                    "1", "0");

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampo();
            }
        } else if (event.getSource() == this.vista.btnEliminar) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarPais(vista.txtCodPais.getText(), Utilitarios.Utilitario.nombreHost(),
                        Vistaprincipal.lblNombreUsuario1.getText(),
                        Vistaprincipal.lblNombreSucursal.getText());
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                    vista.settearCampo();
                }
            } else {
                return;
            }
        } else if (event.getSource() == this.vista.btnNuevo) {
            vista.settearCampo();
        } else if (event.getSource() == this.vista.btnImprimir) {
            vista.jDialogReportePais.setSize(600, 445);
            vista.jDialogReportePais.setLocationRelativeTo(null);
            vista.jDialogReportePais.setVisible(true);
        } else if (event.getSource() == this.vista.btnAceptar1) {
            selection = vista.jtablaPais.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Pais", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            listaPais = modelo.pObtenerListadoDatos(Vistaprincipal.tempEmpresa,
                    "saPais",
                    "co_pais",
                    vista.jtablaPais.getValueAt(selection, 0).toString(),
                    "3");

            if (reporte == 1) {
                vista.txtCampo1.setText(listaPais.get(0).getCampo1());
                vista.txtCampo3.setText(listaPais.get(0).getCampo3());
                vista.txtCodPais.setText(listaPais.get(0).getCo_pais().replaceAll("\\s", ""));
                vista.txtDescripcionPais.setText(listaPais.get(0).getPais_des());
                vista.txtcampo2.setText(listaPais.get(0).getCampo2());
                vista.txtcodMoneda.setText(listaPais.get(0).getCo_mone());
                vista.txtdescripMoneda.setText(
                        modeloMoneda.pObtenerListadoDatos(Vistaprincipal.tempEmpresa,
                        "saMoneda",
                        "co_mone",
                        listaPais.get(0).getCo_mone(),
                        "3").get(0).getMone_des());
                vista.btnGuardar.setEnabled(false);
                
            } else if (reporte == 2) {
                vista.txtCodDesde.setText(listaPais.get(0).getCo_pais().replaceAll("\\s", ""));
                vista.txtDescripDesde.setText(listaPais.get(0).getPais_des());
            } else if (reporte == 3) {
                vista.txtCodHasta.setText(listaPais.get(0).getCo_pais().replaceAll("\\s", ""));
                vista.txtDescripHasta.setText(listaPais.get(0).getPais_des());
            }
            vista.jDialogPais.dispose();

        }
        
        else if (event.getSource() == this.vista.btnAceptar2) {
            selection = vista.jtablaMoneda.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar una Moneda", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            listaMoneda = modeloMoneda.pObtenerListadoDatos(Vistaprincipal.tempEmpresa, "saMoneda", "co_mone",
                    vista.jtablaMoneda.getValueAt(selection, 0).toString(),
                    "3");
            vista.txtcodMoneda.setText(listaMoneda.get(0).getCo_mone().replaceAll("\\s", ""));
            vista.txtdescripMoneda.setText(listaMoneda.get(0).getMone_des());
            vista.jDialogMoneda.dispose();

        } else if (event.getSource() == this.vista.btnCancelar1) {
            vista.jDialogPais.dispose();
        }else if (event.getSource().equals(vista.btnAceptarImprimir)) {
                try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepPais.jasper";
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
                
                
                parametro.put("sCo_Pais_d", codDesde);
                parametro.put("sCo_Pais_h", codHasta);
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
            } catch (JRException ex) {
                   ex.printStackTrace();
            }
        }else if (event.getSource().equals(vista.btnCancelarReporte)) {
            vista.jDialogReportePais.dispose();
        }
           
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtcodMoneda == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                setModeMoneda();
                vista.jDialogMoneda.setVisible(true);
                vista.jDialogMoneda.setSize(472, 358);
                vista.jDialogMoneda.setLocationRelativeTo(null);
            }
        } else if (vista.txtCodDesde.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 2;
                vista.jDialogPais.setSize(472, 358);
                vista.jDialogPais.setLocationRelativeTo(null);
                vista.jDialogPais.setVisible(true);
            }
        } else if (vista.txtCodHasta.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 3;
                vista.jDialogPais.setSize(472, 358);
                vista.jDialogPais.setLocationRelativeTo(null);
                vista.jDialogPais.setVisible(true);
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //To change body of generated methods, choose Tools | Templates.
    }

    public void setModeMoneda() {
        vista.jtablaMoneda.setModel(new ModeloTablaMoneda(modeloMoneda.pObtenerListadoDatos(Vistaprincipal.tempEmpresa, "saMoneda", "mone_des", "", "0")));
    }
}
