/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.AlmacenBO;
import Beans.SucursalBO;
import Conection.Conexion;
import Model.AlmacenModel;
import Model.ModeloTablaAlmacen;
import Model.ModeloTablaSucursal;
import Model.SucursalModelo;
import Utilitarios.Utilitario;
import Vista.VistaAlmacen;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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

/**
 *
 * @author Desarrollo
 */
public class AlmacenController implements ActionListener, KeyListener {

    public VistaAlmacen vista;
    public Model.AlmacenModel modelo;
    public AlmacenBO almacenBO;
    public int resultado = 0;
    public ArrayList<AlmacenBO> lista;
    public int selection = 0;
    public String mVentas = "", mCompras, almaTemporal;
    public SucursalModelo sucursalModelo;
    public Conexion conexion;
    public int reporteDialo = 0;

    public AlmacenController(VistaAlmacen vista) {
        this.vista = vista;
        modelo = new AlmacenModel();
        lista = new ArrayList<>();
        cargartabla();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == this.vista.btnGuardar) {
            mVentas = (vista.mVentas.isSelected()) ? "1" : "0";
            mCompras = (vista.mCompras.isSelected()) ? "1" : "0";
            almaTemporal = (vista.jAlmacenTemp.isSelected()) ? "1" : "0";

            resultado = modelo.pInsertarAlmacen(vista.txtCodAlmacen.getText(),
                    vista.txtDescripcionAlmacen.getText(),
                    vista.txtCodSucursal.getText(),//suscursal ,
                    mVentas,//bNoventa
                    mCompras,//bNoCompra
                    "0",//bMateriales
                    "0",//bProduccion
                    almaTemporal,//bAlm_Temp
                    vista.txtCampo1.getText(),//sCampo1
                    vista.txtcampo2.getText(),
                    null, null, null, null, null, null,
                    Vistaprincipal.lblNombreUsuario1.getText(),//sCo_Us_In
                    Vistaprincipal.lblNombreSucursal.getText(),//sCo_Sucu_In
                    Utilitario.nombreHost(),
                    "0",//sRevisado
                    "0" //sTrasnfe 
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }
        } else if (event.getSource() == this.vista.btnactulizar) {

            mVentas = (vista.mVentas.isSelected()) ? "1" : "0";
            mCompras = (vista.mCompras.isSelected()) ? "1" : "0";
            almaTemporal = (vista.jAlmacenTemp.isSelected()) ? "1" : "0";
            resultado = modelo.pActualizarAlmacen(
                    vista.txtCodAlmacen.getText(),
                    vista.txtCodAlmacen.getText(),
                    vista.txtDescripcionAlmacen.getText(),
                    vista.txtCodSucursal.getText(),//sCo_Sucur
                    mVentas,//bNoVenta
                    mCompras,//bNoCompra
                    "0",//bMateriales
                    "0",//bProduccion
                    almaTemporal,//bAlm_Temp
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    null, null, null, null,
                    null, null,
                    Vistaprincipal.lblNombreUsuario1.getText(),// Usuario
                    Vistaprincipal.lblNombreSucursal.getText(), // sCo_Sucu_In,
                    Utilitario.nombreHost(),//sMaquina
                    "0",//sRevisado 
                    "0"//sTrasnfe
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }

        } else if (event.getSource() == this.vista.btnEliminar) {

            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                // Instrucciones si verdadero
                resultado = modelo.pEliminarAlmacen(vista.txtCodAlmacen.getText(),
                        Utilitario.nombreHost(),
                        Vistaprincipal.lblNombreUsuario1.getText(),
                        Vistaprincipal.lblNombreUsuario1.getText());
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.settearCampos();
                }
            } else {
                return;
            }
        } else if (event.getSource() == this.vista.btnNuevo) {
            vista.settearCampos();
        } else if (event.getSource().equals(this.vista.btnBuscar)) {
            reporteDialo = 3;
            
            vista.jDialogoAlmacen.setVisible(true);
            vista.jDialogoAlmacen.setSize(472, 358);
            vista.jDialogoAlmacen.setLocationRelativeTo(null);
        } else if (event.getSource().equals(vista.btnAceptarjDialog)) {

            vista.btnGuardar.setEnabled(false);
            vista.btnEliminar.setEnabled(true);
            vista.btnactulizar.setEnabled(true);

            selection = vista.jtablaAlmacen.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            lista = modelo.pObtenerListadoDatos(lblNombreEmpresa.getText(), "saAlmacen",
                    "Co_Alma",
                    vista.jtablaAlmacen.getValueAt(selection, 0).toString().replaceAll("\\s", ""),
                    "3");

            if (reporteDialo == 7) {
                vista.txtCodDesde.setText(lista.get(0).getCo_alma().replaceAll("\\s", ""));
                vista.txtDescripDesde.setText(lista.get(0).getDes_alma());
                vista.jDialogoAlmacen.dispose();
            } else if (reporteDialo == 8) {
                vista.txtCodHasta.setText(lista.get(0).getCo_alma().replaceAll("\\s", ""));
                vista.txtDescripHasta.setText(lista.get(0).getDes_alma());
                vista.jDialogoAlmacen.dispose();
            } else {
                vista.txtCampo1.setText(lista.get(0).getCampo1());
                vista.txtcampo2.setText(lista.get(0).getCampo2());
                vista.txtCodAlmacen.setText(lista.get(0).getCo_alma());
                vista.txtDescripcionAlmacen.setText(lista.get(0).getDes_alma());
                vista.txtCodSucursal.setText(lista.get(0).getCo_sucur().replaceAll("\\s", ""));
                vista.txtCodDescripcionSucursal.setText(lista.get(0).getDescripcionSucursal());
                if (lista.get(0).getNocompra().equals("1")) {
                    vista.mCompras.setSelected(true);
                } else {
                    vista.mCompras.setSelected(false);
                }
                if (lista.get(0).getNoventa().equals("1")) {
                    vista.mVentas.setSelected(true);
                } else {
                    vista.mVentas.setSelected(false);
                }
                if (lista.get(0).getAlm_temp().equals("1")) {
                    vista.jAlmacenTemp.setSelected(true);
                } else {
                    vista.jAlmacenTemp.setSelected(false);
                }

                vista.jDialogoAlmacen.dispose();
            }
        } else if (event.getSource() == this.vista.btnImprimir) {
            vista.jDialogReporteAlmacen.setVisible(true);
            vista.jDialogReporteAlmacen.setSize(600, 450);
            vista.jDialogReporteAlmacen.setLocationRelativeTo(null);
        } else if (event.getSource() == this.vista.btnAceptarImprimir) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepAlmacen.jasper";
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
                parametro.put("sCo_Alma_d", codDesde);
                parametro.put("sCo_Alma_h", codHasta);
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
            vista.txtDescripDesde.setText("");
            vista.txtDescripHasta.setText("");
            vista.jDialogReporteAlmacen.dispose();
        } else if (event.getSource() == this.vista.btnCancelar) {
            vista.jDialogoAlmacen.dispose();
        } else if (event.getSource() == this.vista.btnAceptarSucursal) {
            selection = vista.jtableSucursal.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                if (reporteDialo == 9) {
                    vista.txtCodSucursal.setText(vista.jtableSucursal.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                    vista.txtCodDescripcionSucursal.setText(vista.jtableSucursal.getValueAt(selection, 1).toString());
                }
            }
            vista.jDialogSucursal.dispose();
        }
    }

    public void cargartabla() {
        //exec pObtenerListadoDatos @sDatabase_Name=N'DEMOA',@sTable_Name=N'saAlmacen',@sField_Name=N'Co_Alma',@sValor=N'002',@iOpcion=2
        vista.jtablaAlmacen.setModel(new ModeloTablaAlmacen(modelo.pObtenerListadoDatos(lblNombreEmpresa.getText(), "saAlmacen", "Co_Alma", "", "2")));
    }

    public void cargarSucursal(String sDatabase_Name, String stable_Name, String sField_Name, String sValor, String iOpcion) {
        System.out.println("Cargar Sucursal");
        SucursalModelo modelosucursal = new SucursalModelo();
        vista.jtableSucursal.setModel(new ModeloTablaSucursal(modelosucursal.pObtenerListadoDatos(
                sDatabase_Name,//Vistaprincipal.tempEmpresa,//sDatabase_Name
                stable_Name, // "saSucursal", //stable_Name
                sField_Name,//sField_Name
                sValor, // vista.txtBucscarSucursal.getText(),//Valor
                iOpcion//@iOpcion
        )));
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtBuscarValor == ke.getSource()) {
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
                sfieldName = (vista.jrCodigo.isSelected()) ? "Co_Alma" : "des_alma";
                vista.jtablaAlmacen.setModel(new ModeloTablaAlmacen(modelo.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                        "saAlmacen",
                        sfieldName,
                        vista.txtBuscarValor.getText(),
                        Opcion)));
            }
        } else if (vista.txtCodDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                
                vista.jDialogoAlmacen.setSize(472, 358);
                vista.jDialogoAlmacen.setLocationRelativeTo(null);
                vista.jDialogoAlmacen.setVisible(true);
                reporteDialo = 7;
            }
        } else if (vista.txtCodHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                vista.jDialogoAlmacen.setSize(472, 358);
                vista.jDialogoAlmacen.setLocationRelativeTo(null);
                vista.jDialogoAlmacen.setVisible(true);
                reporteDialo = 8;
            }
        } else if (vista.txtCodSucursal == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporteDialo = 9;
                cargarSucursal(Vistaprincipal.tempEmpresa, "saSucursal", "co_sucur", "", "2");
                vista.jDialogSucursal.setSize(472, 358);
                vista.jDialogSucursal.setLocationRelativeTo(null);
                vista.jDialogSucursal.setVisible(true);
            }
        } else if (vista.txtBucscarSucursal == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion = "0", sfieldName = "";

                if (vista.jRInicio1.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinal1.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquier1.isSelected()) {
                    Opcion = "2";
                } else if (vista.jRexacta1.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.rjcodigo1.isSelected()) ? "co_sucur" : "sucur_des";
                cargarSucursal(Vistaprincipal.tempEmpresa, "saSucursal", sfieldName, vista.txtBucscarSucursal.getText(), Opcion);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
