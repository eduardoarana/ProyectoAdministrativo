/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.VendedorBO;
import Conection.Conexion;
import Model.ModeloTablaVendedor;
import Model.ModeloTablaZona;
import Model.VendedorModelo;
import Model.ZonaModel;
import Utilitarios.Utilitario;
import Vista.VistaVendedor;
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

/**
 *
 * @author EArana
 */
public class VendedorController implements ActionListener, KeyListener {

    VistaVendedor vista;
    VendedorModelo modelo;
    int resultado = 0, reporte = 0;
    ArrayList<VendedorBO> listaVendedor;
    public Conexion conexion;

    public VendedorController(VistaVendedor vista) {
        this.vista = vista;
        modelo = new VendedorModelo();
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        String inactivo = "0", Funvendedor = "0", Funcobrador = "0";
        String tipoVendedor ="";

        if (event.getSource() == this.vista.btnGuardar) {

            if (vista.txtCodiVendedor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El Campo Codigo no puede estar Vacio", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (vista.txtCodZona.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El Campo Codigo Zona no puede estar Vacio", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            tipoVendedor = vista.cheTipo.getSelectedItem().toString();
            inactivo = (vista.cheInactivo.isSelected()) ? "1" : "0";
            Funcobrador = (vista.cheCobrador.isSelected()) ? "1" : "0";
            Funvendedor = (vista.cheVendedor.isSelected()) ? "1" : "0";
            System.out.println("Obtener Tipo " + tipoVendedor);
            
            vista.cheTipo.getSelectedItem() ;
            
            resultado = modelo.pInsertarVendedor(
                    vista.txtCodiVendedor.getText(),
                    tipoVendedor,
                    vista.txtNobreVendedor.getText(),
                    "",
                    vista.txtCedula.getText(),
                    vista.txtDireccion.getText(),
                    null,
                    vista.txtTelefonos.getText(),
                    Utilitario.obtenerFecha(vista.fecha), //"20210201",
                    inactivo,// bInactivo
                    vista.txtCobros.getText(),//deComision
                    "comenoario1",//sComentario
                    Funcobrador,//bFun_Cob
                    Funvendedor, //bFun_ven
                    vista.txtVentas.getText(),//deComisionV
                    null,//@sLogin
                    null,//sPassword
                    null,//sEmail
                    null,//@sPSW_M
                    vista.txtCampo1.getText(),
                    vista.txtCampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtCampo4.getText(),
                    vista.txtCampo5.getText(),
                    vista.txtCampo5.getText(),
                    "",
                    "",//campo8
                    Vistaprincipal.tempUsuario,
                    Vistaprincipal.tempSucrsal,
                    Utilitario.nombreHost(),
                    "",
                    "",
                    vista.txtCodZona.getText());

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setteCampos();
            }
        } else if (event.getSource() == this.vista.btnactulizar) {
            
            tipoVendedor = vista.cheTipo.getSelectedItem().toString();
            resultado = modelo.pActualizarVendedor(
                    vista.txtCodiVendedor.getText(),
                    vista.txtCodiVendedor.getText(),
                    tipoVendedor,
                    vista.txtNobreVendedor.getText(),
                    "",//sDis_Cen
                    vista.txtCedula.getText(),//sCedula
                    vista.txtDireccion.getText(),
                    null,// direccion2
                    vista.txtTelefonos.getText(),
                    Utilitario.obtenerFecha(vista.fecha),//sdFecha_Reg
                    inactivo, //bInactivo
                    vista.txtCobros.getText(),//deComision
                    null, //sComentario
                    Funcobrador,//Funcobrador
                    Funvendedor,//bFun_Ven
                    vista.txtVentas.getText(), //deComisionV
                    null,//login
                    null,//password
                    null,//email
                    null,//psw_m
                    vista.txtCampo1.getText(),
                    vista.txtCampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtCampo4.getText(),
                    vista.txtCampo5.getText(),
                    vista.txtCampo6.getText(),
                    null,
                    null,
                    Vistaprincipal.tempUsuario,
                    Vistaprincipal.tempSucrsal,
                    Utilitario.nombreHost(),
                    null,
                    "2",
                    "3",
                    // "",
                    vista.txtCodZona.getText()
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setteCampos();
            }

        } else if (event.getSource() == this.vista.btnEliminar) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.peliminarVendedor(vista.txtCodiVendedor.getText(),
                        Utilitario.nombreHost(),
                        Vistaprincipal.tempUsuario,
                        Vistaprincipal.tempSucrsal);

                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.setteCampos();
                }

            } else {
                return;
            }

        } else if (event.equals(vista.btnNuevo)) {
            vista.setteCampos();
        } else if (event.getSource() == this.vista.btnBuscar) {
            reporte = 1;
            cargarDatosVendedor(Vistaprincipal.tempEmpresa,
                    "saVendedor",
                    "co_ven",
                    "",
                    "2");
            vista.jDialogVendedor.setSize(472, 358);
            vista.jDialogVendedor.setLocationRelativeTo(null);
            vista.jDialogVendedor.setVisible(true);

        } else if (event.getSource() == this.vista.btnImprimir) {

            vista.jDialogReporteVendedor.setSize(472, 358);
            vista.jDialogReporteVendedor.setLocationRelativeTo(null);
            vista.jDialogReporteVendedor.setVisible(true);

        } else if (event.getSource().equals(vista.btnAceptarVendedor)) {
            int selectcion = vista.jtablaVendedor.getSelectedRow();
            if (selectcion == -1) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar un Vendedor", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaVendedor = modelo.pObtenerListadoDatos(
                        Vistaprincipal.tempEmpresa,
                        "saVendedor",
                        "co_ven",
                        vista.jtablaVendedor.getValueAt(selectcion, 0).toString().replaceAll("\\s", ""),
                        "3");
                String tipoVended=  listaVendedor.get(0).getTipo().toString().replaceAll("\\s", "");
                if (reporte == 1) {
                    vista.txtCodiVendedor.setText(listaVendedor.get(0).getCo_ven());
                    vista.txtNobreVendedor.setText(listaVendedor.get(0).getVen_des());
                    vista.fecha.setDate(Utilitario.obtenerFecha(listaVendedor.get(0).getFecha_reg()));
                    vista.txtCampo1.setText(listaVendedor.get(0).getCampo1());
                    vista.txtCampo2.setText(listaVendedor.get(0).getCampo2());
                    vista.txtCampo3.setText(listaVendedor.get(0).getCampo3());
                    vista.txtCampo4.setText(listaVendedor.get(0).getCampo4());
                    vista.txtCampo5.setText(listaVendedor.get(0).getCampo5());
                    vista.txtCampo6.setText(listaVendedor.get(0).getCampo6());
                    vista.txtCedula.setText(listaVendedor.get(0).getCedula());
                    vista.txtCobros.setText(listaVendedor.get(0).getComision());
                    vista.txtCodZona.setText(listaVendedor.get(0).getCo_zon().replaceAll("\\s",""));
                    vista.txtDescripcionZona.setText(listaVendedor.get(0).getDescripcionZona());
                    vista.txtDireccion.setText(listaVendedor.get(0).getDirec1());
                    vista.txtTelefonos.setText(listaVendedor.get(0).getTelefonos());
                    vista.txtVentas.setText(listaVendedor.get(0).getComisionv());
                    
                    vista.cheTipo.setSelectedItem(tipoVended);

                    if (listaVendedor.get(0).getInactivo().equals("1")) {
                        vista.cheInactivo.setSelected(true);
                    } else {
                        vista.cheInactivo.setSelected(false);
                    }
                    if (listaVendedor.get(0).getFun_cob().equals("1")) {
                        vista.cheCobrador.setSelected(true);
                    } else {
                        vista.cheCobrador.setSelected(false);
                    }
                    if (listaVendedor.get(0).getFun_ven().equals("1")) {
                        vista.cheVendedor.setSelected(true);
                    } else {
                        vista.cheVendedor.setSelected(false);
                    }
                } else if (reporte == 2) {
                    vista.txtCodDesde.setText(listaVendedor.get(0).getCo_ven());
                    vista.txtDescripDesde.setText(listaVendedor.get(0).getVen_des());
                } else if (reporte == 3) {
                    vista.txtCodHasta.setText(listaVendedor.get(0).getCo_ven());
                    vista.txtDescripHasta.setText(listaVendedor.get(0).getVen_des());
                }
            }
            vista.btnEliminar.setEnabled(true);
            vista.btnactulizar.setEnabled(true);
            vista.btnGuardar.setEnabled(false);
            vista.jDialogVendedor.dispose();
        } else if (event.getSource().equals(vista.btnCancelarVendedor)) {
            vista.jDialogVendedor.dispose();
        } else if (event.getSource().equals(vista.btnAceptarZona)) {
            int selection = vista.jtablaZona.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar una Zona", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            vista.txtCodZona.setText(vista.jtablaZona.getValueAt(selection, 0).toString());
            vista.txtDescripcionZona.setText(vista.jtablaZona.getValueAt(selection, 1).toString());
            vista.jDialogZona.dispose();

        } else if (event.getSource().equals(vista.btnCancelarZona)) {
            vista.jDialogZona.dispose();
        } else if (event.getSource().equals(vista.btnAceptarImprimir)) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepVendedorDatosBasicos.jasper";
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

                parametro.put("sCo_Ven_d", codDesde);
                parametro.put("sCo_Ven_h", codHasta);
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
                Logger.getLogger(UnidadController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (event.getSource().equals(vista.btnCancelarReporte)) {
            vista.jDialogReporteVendedor.dispose();
        }   
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtbuscarVendedor == ke.getSource()) {
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
                sfieldName = (vista.jrCodigo.isSelected()) ? "co_ven" : "ven_des";

                cargarDatosVendedor(Vistaprincipal.tempEmpresa,
                        "saVendedor",
                        sfieldName,
                        vista.txtbuscarVendedor.getText(),
                        Opcion);
            }
        } else if (vista.txtBuscarZona == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    String Opcion1 = "0", sfieldName1 = "";
                    if (vista.jRInicio.isSelected()) {
                        Opcion1 = "0";
                    } else if (vista.jRFinal.isSelected()) {
                        Opcion1 = "1";
                    } else if (vista.jrCualquier.isSelected()) {
                        Opcion1 = "2";
                    } else if (vista.jRexacta.isSelected()) {
                        Opcion1 = "3";
                    }
                    sfieldName1 = (vista.jrCodigo.isSelected()) ? "co_zon" : "zon_des";

                    cargarDatosZona(
                            Vistaprincipal.tempEmpresa,
                            "saZona",
                            sfieldName1,
                            vista.txtbuscarVendedor.getText(),
                            Opcion1);
                }
            }
        } else if (vista.txtCodDesde == ke.getSource()) { //
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 2;
                cargarDatosVendedor(Vistaprincipal.tempEmpresa,
                        "saVendedor",
                        "co_ven",
                        "",
                        "2");
                vista.jDialogVendedor.setSize(472, 358);
                vista.jDialogVendedor.setLocationRelativeTo(null);
                vista.jDialogVendedor.setVisible(true);
            }
        } else if (vista.txtCodHasta == ke.getSource()) { //
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosVendedor(Vistaprincipal.tempEmpresa,
                        "saVendedor",
                        "co_ven",
                        "",
                        "2");
                vista.jDialogVendedor.setSize(472, 358);
                vista.jDialogVendedor.setLocationRelativeTo(null);
                vista.jDialogVendedor.setVisible(true);
            }
        } else if (vista.txtCodZona == ke.getSource()) { //
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosZona(
                        Vistaprincipal.tempEmpresa,
                        "saZona",
                        "co_zon",
                        "",
                        "2"
                );

                vista.jDialogZona.setVisible(true);
                vista.jDialogZona.setSize(472, 358);
                vista.jDialogZona.setLocationRelativeTo(null);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    public void cargarDatosVendedor(String Database_Name, String Table_Name, String sField_Name, String sValor, String iOpcion) {
        vista.jtablaVendedor.setModel(new ModeloTablaVendedor(modelo.pObtenerListadoDatos(
                Database_Name,
                Table_Name,
                sField_Name,
                sValor,
                iOpcion)));

    }

    public void cargarDatosZona(String Database_Name, String Table_Name, String sField_Name, String sValor, String iOpcion) {
        ZonaModel modelozona = new ZonaModel();
        vista.jtablaZona.setModel(new ModeloTablaZona(modelozona.pObtenerListadoDatosZona(
                Database_Name,
                Table_Name,
                sField_Name,
                sValor,
                iOpcion)
        ));

    }

}
