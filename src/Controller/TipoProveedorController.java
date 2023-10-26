/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.TipoProveedorBO;
import Conection.Conexion;
import Model.TipoProveedorModelo;
import Vista.VistaTipoProveedor;
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
public class TipoProveedorController implements ActionListener, KeyListener {

    VistaTipoProveedor vista;
    TipoProveedorModelo modelo;
    ArrayList<TipoProveedorBO> listaTipopro;
    public Conexion conexion;
    public int reporte = 0;

    public TipoProveedorController(VistaTipoProveedor vista) {
        this.vista = vista;
        modelo = new TipoProveedorModelo();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource().equals(vista.btnGuardar1)) {
            resultado = modelo.pInsertarTipoProveedor(
                    vista.txtCodTipoProveedor.getText(),
                    vista.txtDescripcionTipoProvee.getText(),
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(),
                    "", "", "", "",
                    Vistaprincipal.lblNombreUsuario1.getText(),//sCo_Us_In
                    Vistaprincipal.lblNombreSucursal.getText(), //sCo_Sucu_In
                    Utilitarios.Utilitario.nombreHost(),
                    "1", "1");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settear();
            }

        } else if (event.getSource().equals(vista.btnactulizar)) {

            resultado = modelo.pActualizarTipoProveedor(vista.txtCodTipoProveedor.getText(),
                    vista.txtCodTipoProveedor.getText(), vista.txtDescripcionTipoProvee.getText(),
                    vista.txtCampo1.getText(), vista.txtcampo2.getText(), vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(), "", "", "", "",
                    Vistaprincipal.lblNombreUsuario1.getText(), //"us_mo", 
                    Vistaprincipal.lblNombreSucursal.getText(),//"sucu_mo", 
                    Utilitarios.Utilitario.nombreHost(), "campo", "1", "1");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settear();
            }
        } else if (event.getSource().equals(vista.btnEliminar)) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarTipoProveedor(vista.txtCodTipoProveedor.getText(), Utilitarios.Utilitario.nombreHost(), "usumo", "cosucumo");
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.settear();
                }
            } else {
                return;
            }
        } else if (event.getSource().equals(vista.btnNuevo)) {
            vista.settear();
        } else if (event.getSource().equals(vista.btnAceptar1)) {
            //  vista.settear();
            String codigoTipo = "";
            int selection = vista.jtablaTipo.getSelectedRow();
            if (selection != -1) {
                System.out.println("selection  " + selection);
                codigoTipo = String.valueOf(vista.jtablaTipo.getValueAt(selection, 0));
                listaTipopro = new ArrayList<TipoProveedorBO>();
                listaTipopro = modelo.pObtenerListadoDatosProveedor(lblNombreEmpresa.getText(), "saTipoProveedor", "tip_pro", codigoTipo, "2");

                if (reporte == 1) {
                    vista.txtCodTipoProveedor.setText(listaTipopro.get(0).getTip_pro().toString());
                    vista.txtDescripcionTipoProvee.setText(listaTipopro.get(0).getDes_tipo().toString());
                    vista.txtCampo1.setText(listaTipopro.get(0).getCampo1().toString());
                    vista.txtcampo2.setText(listaTipopro.get(0).getCampo2().toString());
                    vista.txtCampo3.setText(listaTipopro.get(0).getCampo3().toString());
                    vista.txtcampo4.setText(listaTipopro.get(0).getCampo4().toString());

                    vista.txtCodTipoProveedor.setEnabled(false);

                    vista.btnEliminar.setEnabled(true);
                    vista.btnactulizar.setEnabled(true);
                    vista.btnGuardar1.setEnabled(false);
                } else if (reporte == 2) {
                    vista.txtCodDesde.setText(listaTipopro.get(0).getTip_pro().toString());
                    vista.txtDescripDesde.setText(listaTipopro.get(0).getDes_tipo().toString());
                } else if (reporte == 3) {
                    vista.txtCodHasta.setText(listaTipopro.get(0).getTip_pro().toString());
                    vista.txtDescripHasta.setText(listaTipopro.get(0).getDes_tipo().toString());
                }
                vista.JDialogoTipoProveedor.dispose();
            }
//        modelo.pObtenerListadoDatosProveedor(lblNombreEmpresa.getText(), "saTipoProveedor",
//                "tip_pro","", "2");
        } else if (event.getSource().equals(vista.btnCancelar1)) {
            vista.JDialogoTipoProveedor.dispose();
        } else if (event.getSource().equals(vista.btnImprimir)) {

            vista.jDialogReporteTipoProveedor.setSize(600, 445);
            vista.jDialogReporteTipoProveedor.setLocationRelativeTo(null);
            vista.jDialogReporteTipoProveedor.setVisible(true);
        } else if (event.getSource() == this.vista.btnAceptarImprimirTipoProbedor) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepTipoProveedor.jasper";
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

                parametro.put("sCo_TProv_d", codDesde);
                parametro.put("sCo_TProv_h", codHasta);
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
            vista.jDialogReporteTipoProveedor.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtCodDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 2;
                vista.setModel();
                vista.JDialogoTipoProveedor.setSize(472, 358);
                vista.JDialogoTipoProveedor.setLocationRelativeTo(null);
                vista.JDialogoTipoProveedor.setVisible(true);
            }
        } else if (vista.txtCodHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 3;
                vista.setModel();
                vista.JDialogoTipoProveedor.setSize(472, 358);
                vista.JDialogoTipoProveedor.setLocationRelativeTo(null);
                vista.JDialogoTipoProveedor.setVisible(true);
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }
}
