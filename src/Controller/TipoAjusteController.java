/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.TipoAjusteBO;
import Conection.Conexion;
import Model.TipoAjusteModelo;
import Utilitarios.Utilitario;
import Vista.VistaTipoAjuste;
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
 * @author Desarrollo
 */
public class TipoAjusteController implements ActionListener , KeyListener{

    Vista.VistaTipoAjuste vista;
    TipoAjusteModelo modelo;
    public ArrayList<TipoAjusteBO> lista;
    public Conexion conexion;
    public int reporte =0;

    public TipoAjusteController(VistaTipoAjuste vista) {
        this.vista = vista;
        modelo = new TipoAjusteModelo();
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        String tipotranferenc = "";
        tipotranferenc = (vista.jEntrada.isSelected()) ? "0" : "1";
        if (event.getSource().equals(this.vista.btnGuardar)) {
            resultado = modelo.pInsertarTipoAjuste(vista.txtCodAjuste.getText(),
                    vista.txtDescripciontipoAjuste.getText(), tipotranferenc,
                    vista.txtCampo1.getText(), vista.txtcampo2.getText(),
                    vista.txtCampo3.getText(), vista.txtcampo4.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText() , //"co_us",
                    Utilitario.nombreHost(), "1", "1",
                    Vistaprincipal.lblNombreSucursal.getText()
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setearCampos();
                vista.setModel();
            }

        } else if (event.getSource().equals(this.vista.btnactulizar)) {
            resultado = modelo.pActualizarTipoAjuste(vista.txtCodAjuste.getText().toString(),
                    vista.txtCodAjuste.getText().toString(),
                    vista.txtDescripciontipoAjuste.getText().toString(), tipotranferenc,
                    vista.txtCampo1.getText(), vista.txtcampo2.getText(),
                    vista.txtCampo3.getText(), vista.txtcampo4.getText(),
                    Vistaprincipal.lblNombreSucursal.getText() ,//"sCo_Sucu_Mo", 
                    Vistaprincipal.lblNombreUsuario1.getText(),//sCo_Us_Mo
                    Utilitario.nombreHost(), "1", "0");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setearCampos();
                vista.setModel();
            }

        } else if (event.getSource().equals(this.vista.btnEliminar)) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarTipoAjuste(vista.txtCodAjuste.getText());
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                    vista.setearCampos();
                    vista.setModel();
                }
            } else {
                return;
            }
        } else if (event.getSource().equals(this.vista.btnNuevo)) {

            vista.setearCampos();
        } else if (event.getSource() == this.vista.btnAceptarTAjuste) {
            int selection = vista.jtableTipoAjuste.getSelectedRow();
            lista = modelo.pObtenerListadoDatos(
                    lblNombreEmpresa.getText(),//sDatabase_Name
                    "saTipoAjuste",
                    "co_tipo",//sField_Name
                    vista.jtableTipoAjuste.getValueAt(selection, 0).toString(),//Valor
                    "3"//@iOpcion
            );
            if (selection != -1) {
                vista.jDialogTipoAjuste.dispose();
                
                if(reporte==1){
                vista.txtCodAjuste.setText(lista.get(0).getCo_tipo().replaceAll("\\s", ""));
                vista.txtDescripciontipoAjuste.setText(lista.get(0).getDes_tipo());
                vista.txtCampo1.setText(lista.get(0).getCampo1());
                vista.txtcampo2.setText(lista.get(0).getCampo2());
                vista.txtCampo3.setText(lista.get(0).getCampo3());
                vista.txtcampo4.setText(lista.get(0).getCampo4());

                System.out.println("Tipo" + lista.get(0).getTipo_trans());
                String tipo = lista.get(0).getTipo_trans();
                if (tipo.equals("0")) {
                    vista.jEntrada.setSelected(true);
                    System.out.println("==0");
                } else {
                    System.out.println("==1");
                    vista.jSalida.setSelected(true);
                }
                vista.btnGuardar.setEnabled(false);
                vista.btnactulizar.setEnabled(true);
                vista.btnEliminar.setEnabled(true);
                
                }else if(reporte==2){
                    vista.txtCodDesde.setText(lista.get(0).getCo_tipo().replaceAll("\\s", ""));
                    vista.txtcodDescripcionDesde.setText(lista.get(0).getDes_tipo());
                }else if(reporte==3){
                    vista.txtCodHasta.setText(lista.get(0).getCo_tipo().replaceAll("\\s", ""));
                    vista.txtcodDescripcionHasta.setText(lista.get(0).getDes_tipo());
                }
            }
        } else if (event.getSource() == this.vista.btnBuscar) {
            reporte =1;
            vista.setModel();
            vista.jDialogTipoAjuste.setSize(472, 358);
            vista.jDialogTipoAjuste.setLocationRelativeTo(null);
            vista.jDialogTipoAjuste.setVisible(true);
        } else if (event.getSource() == this.vista.btnImprimir) {
            vista.jDialogReporteTipoAjustes.setVisible(true);
            vista.jDialogReporteTipoAjustes.setSize(600, 450);
            vista.jDialogReporteTipoAjustes.setLocationRelativeTo(null);
        } else if (event.getSource() == this.vista.btnAceptarImprimir) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepTipoAjuste.jasper";
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

                System.out.println("CodiDesde : " + codDesde + " Cod HYasta : " + codHasta + "  Criterio : " + criterio);
                parametro.put("sCo_TipoAjuste_d", codDesde);
                parametro.put("sCo_TipoAjuste_h", codHasta);
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
        }else if (event.getSource() == this.vista.btnCancelarImpresion) {
            vista.txtCodDesde.setText("");
            vista.txtCodHasta.setText("");
            vista.jDialogReporteTipoAjustes.dispose();
        }else if (event.getSource() == this.vista.btnCancelar) {
            vista.jDialogTipoAjuste.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
     }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtCodDesde == ke.getSource()) {
            if(ke.getKeyCode() == KeyEvent.VK_F2) {
            reporte =2;
            vista.jDialogTipoAjuste.setSize(472, 358);
            vista.jDialogTipoAjuste.setLocationRelativeTo(null);
            vista.jDialogTipoAjuste.setVisible(true);
            }
        }else if(vista.txtCodHasta == ke.getSource()) {
            reporte =3;
            vista.jDialogTipoAjuste.setSize(472, 358);
            vista.jDialogTipoAjuste.setLocationRelativeTo(null);
            vista.jDialogTipoAjuste.setVisible(true);
        }
     }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
