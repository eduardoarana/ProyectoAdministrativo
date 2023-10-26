/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.CondicionPagoBO;
import Beans.FacturaCompraBO;
import Beans.FacturaCompraRengBO;
import Beans.MonedaBO;
import Beans.ProveedorBO;
import Encabezado.GenionarEncabezado;
import Model.CondicionPagoModel;
import Model.FacturaCompraModelo;
import Model.ModelTablaProveedores;
import Model.ModeloTablaCoindicionPago;
import Model.ModeloTablaFacturaCompra;
import Model.ModeloTablaFacturaCompraRenglon;
import Model.ModeloTablaMoneda;
import Model.ModeloTablaTipoProveedor;
import Model.MonedaModel;
import Model.ProveedorModel;
import Utilitarios.Utilitario;
import Vista.VistaFacturaCompras;
import Vista.Vistaprincipal;
import static Vista.Vistaprincipal.lblNombreEmpresa;
import VistaDialogos.DialogoAlmacen;
import VistaDialogos.DialogoArticulos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

/**
 *
 * @author EArana
 */
public class FacturaCompraController implements ActionListener, KeyListener {

    int selection = 0;

    VistaFacturaCompras vista;
    ModeloTablaFacturaCompraRenglon modelofacturaCompraRenglon = new ModeloTablaFacturaCompraRenglon();
    FacturaCompraModelo modelo;
    ArrayList<FacturaCompraBO> listaFactura;
    CondicionPagoModel modeloPago;
    CondicionPagoModel modeloCondicionPago;
    ArrayList<CondicionPagoBO> listaCondicionPago;
    ArrayList<MonedaBO> listaMoneda;
    ArrayList<ProveedorBO> listaproveedor;
    MonedaModel modeloMoneda;
    ProveedorModel modeloProveedor;
    public int FILATABLAFACTURACOMPRASRENG = 0, COLUMNATABLAFACTURACOMPRASRENG;
    Double subTotatl = 0.0;
    ArrayList<FacturaCompraRengBO> listaFacturaReng = new ArrayList<FacturaCompraRengBO>();


    public FacturaCompraController(VistaFacturaCompras vista) {
        this.vista = vista;
        modelo = new FacturaCompraModelo();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == vista.btnGuardar) {

            int cantidaRow = vista.jTablaFacturaCompraRenglon.getRowCount();
            if (cantidaRow == 0) {
                JOptionPane.showMessageDialog(new JFrame(), "El Documento no puede ser grabado sin renglones", "Software", JOptionPane.WARNING_MESSAGE);
                return;
            } else if (vista.jTablaFacturaCompraRenglon.getValueAt(0, 3).toString().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo Almacen no debe estar Vacio", "Software", JOptionPane.WARNING_MESSAGE);
                return;
            }

            resultado = modelo.pInsertarFacturaCompra(
                    vista.txtNumDocumentCompra.getText().replaceAll("\\s", ""),// sDoc_Num,
                    vista.txtNumFactura.getText().replaceAll("\\s", ""),// sNro_Fact,
                    vista.txtDescripcionFactCompra.getText(), // sDescrip, 
                    vista.txtcdiProveedor.getText().replaceAll("\\s", ""), // sCo_Prov, 
                    vista.txtCuentIngEgr.getText(), // sCo_Cta_Ingr_Egr, 
                    vista.txtCodMoneda.getText().replaceAll("\\s", ""), //sCo_Mone, 
                    vista.txtCodPago.getText().replaceAll("\\s", ""), //sCo_Cond, 
                    vista.txtNmControl.getText().replaceAll("\\s", ""), //sN_Control, 
                    vista.txtDescuesto.getText(), // sPorc_Desc_Glob, 
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaFacturaActual),// sdFec_Emis, 
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaVencimiento), // sdFec_Venc, 
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaRegistro), //sdFec_Reg, 
                    0, //bAnulado
                    "A", ///  sStatus, 
                    0, //deTasa 
                    vista.txtRec.getText(), // sPorc_Reca, 
                    Double.parseDouble(vista.txtSaldo.getText()),// saldo
                    Double.parseDouble(vista.txtSubTotalBruto.getText()),//deTotal_Bruto
                    Double.parseDouble(vista.txtTotalNeto.getText()),//deTotal_Neto
                    Double.parseDouble(vista.txtMontoDescuentoGlobal.getText()), // @deMonto_Desc_Glob
                    Double.parseDouble(vista.txtMontoporc_recal.getText()),// @deMonto_Reca
                    Double.parseDouble(vista.txtOtros.getText()), // @deOtros1
                    0, // @deOtros2
                    0,// @deOtros3
                    Double.parseDouble(vista.txtImpuesto.getText()), //@deMonto_Imp
                    0, //@deMonto_Imp2
                    0,//@deMonto_Imp3
                    vista.TxtDireccionEntrega.getText(), // sDir_Ent,
                    vista.txtComentario.getText(),//sComentario, 
                    0, // @bImpresa
                    "sa", //sSalestax,
                    "", //sDis_Cen, 
                    vista.TxtCampo1.getText(), //sCampo1, 
                    vista.TxtCampo2.getText(), //sCampo2, 
                    vista.TxtCampo3.getText(), //  sCampo3,
                    vista.TxtCampo4.getText(), //sCampo4, 
                    vista.TxtCampo5.getText(),//sCampo5, 
                    vista.TxtCampo6.getText(),//sCampo6, 
                    null, //sCampo7,
                    null, //sCampo8, 
                    "1", // sRevisado, 
                    "2", //sTrasnfe,
                    Vistaprincipal.tempUsuario, //sCo_Us_In,
                    Vistaprincipal.tempSucrsal, // sCo_Sucu_In,
                    Utilitarios.Utilitario.nombreHost(), // sMaquina,
                    0
            );
            for (int i = 0; i < cantidaRow; i++) {
                int tipoIm = Integer.parseInt(vista.jTablaFacturaCompraRenglon.getValueAt(i, 5).toString()) + 0;
                modelo.pInsertarRenglonesFacturaCompra(
                        Integer.parseInt(vista.jTablaFacturaCompraRenglon.getValueAt(i, 0).toString()),// iReng_Num,
                        vista.txtNumDocumentCompra.getText().replaceAll("\\s", ""), // sDoc_Num,
                        vista.jTablaFacturaCompraRenglon.getValueAt(i, 1).toString(), //sCo_Art,
                        vista.jTablaFacturaCompraRenglon.getValueAt(i, 2).toString(), //sDes_Art,
                        vista.jTablaFacturaCompraRenglon.getValueAt(i, 4).toString(), // sCo_Uni,
                        vista.jTablaFacturaCompraRenglon.getValueAt(i, 4).toString(), // sSCo_Uni, 
                        vista.jTablaFacturaCompraRenglon.getValueAt(i, 3).toString(), //sCo_Alma, 
                        vista.jTablaFacturaCompraRenglon.getValueAt(i, 5).toString(), //sTipo_Imp, 
                        null, //sTipo_Imp2, 
                        null, //sTipo_Imp3, 
                        "COMP",//sTipo_Doc,
                        vista.txtDescuesto.getText(), //sPorc_Desc,
                        vista.txtNumFactura.getText(), // sNum_Doc, 
                        Double.parseDouble(vista.jTablaFacturaCompraRenglon.getValueAt(i, 9).toString()),//@deReng_Neto
                        Double.parseDouble(vista.jTablaFacturaCompraRenglon.getValueAt(i, 7).toString()),//@deCost_Unit
                        Double.parseDouble(vista.jTablaFacturaCompraRenglon.getValueAt(i, 9).toString()),//@deCost_Unit_OM
                        Integer.parseInt(vista.jTablaFacturaCompraRenglon.getValueAt(i, 6).toString()),//@deTotal_Art
                        Integer.parseInt(vista.jTablaFacturaCompraRenglon.getValueAt(i, 6).toString()),//@deSTotal_Art
                        Double.parseDouble(vista.txtOtros.getText()),//@deOtros
                        Integer.parseInt(vista.jTablaFacturaCompraRenglon.getValueAt(i, 5).toString()),//@dePorc_Imp
                        0,//@dePorc_Imp2
                        0,//@dePorc_Imp3
                        Double.parseDouble(vista.jTablaFacturaCompraRenglon.getValueAt(i, 8).toString()),//@deMonto_Imp
                        0,//@deMonto_Imp2
                        0,//@deMonto_Imp3
                        0,//@dePorc_Gas
                        9,//@deTotal_Dev
                        2,//@deMonto_Dev
                        2,//@dePendiente2
                        vista.txtComentario.getText(),//sComentario,
                        45,//@bLote_Asignado
                        5,//@deMonto_Desc_Glob
                        Double.parseDouble(vista.txtMontoporc_recal.getText()),// @@deMonto_reca_Glob
                        0,//@deOtros1_glob
                        0,//@deOtros2_glob
                        0,//@deOtros3_glob
                        0,//@deMonto_imp_afec_glob
                        0,//@deMonto_imp2_afec_glob
                        0,//@deMonto_imp3_afec_glob
                        Double.parseDouble(vista.txtMontoDescuentoGlobal.getText()),//@deMonto_Desc
                        0,//@@dePendiente
                        3,//@@iReng_Doc
                        null,//sDis_Cen,
                        Vistaprincipal.tempSucrsal,// sCo_Sucu_In,
                        Vistaprincipal.tempUsuario,//sCo_Us_In,
                        "1", //sRevisado,
                        "1",//sTrasnfe,
                        Utilitarios.Utilitario.nombreHost(),//sMaquina,
                        0, //@deCosto_Adi1
                        0, //@deCosto_Adi2
                        0, //@deCosto_Adi3
                        "4"
                );
            }
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                // vista.setterCampos();
                //  modeloTablaFacturaVentaRenglon.limpiarRengloTabla(cantidaRow);
            }
        } else if (event.getSource().equals(vista.btnactulizar)) {
            System.out.println("Actualizar sss :....");
            resultado = modelo.pActualizarFacturaCompra(
                    vista.txtNumDocumentCompra.getText().replaceAll("\\s", ""),//sDoc_Num
                    vista.txtNumDocumentCompra.getText().replaceAll("\\s", ""),// sDoc_Num
                    vista.txtNumFactura.getText().replaceAll("\\s", ""),// sNro_Fact, sNro_Fact,
                    vista.txtDescripcionFactCompra.getText(), // sDescrip, 
                    vista.txtcdiProveedor.getText(), //  sCo_Prov,
                    vista.txtCuentIngEgr.getText(), //  sCo_Cta_Ingr_Egr,
                    vista.txtCodMoneda.getText(), //  sCo_Mone, 
                    vista.txtCodPago.getText(), // sCo_Cond,
                    vista.txtDescuesto.getText().replaceAll("\\s", ""), //sPorc_Desc_Glob,
                    vista.txtRec.getText().replaceAll("\\s", ""), // sPorc_Reca,
                    "A", //sStatus,
                    vista.txtNmControl.getText().replaceAll("\\s", ""),// sN_Control,
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaFacturaActual), // sdFec_Emis,
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaVencimiento), // sdFec_Venc, 
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaRegistro), //sdFec_Reg, 
                    0,//deTasa,
                    Double.parseDouble(vista.txtSaldo.getText()),//deSaldo,
                    Double.parseDouble(vista.txtSubTotalBruto.getText()), //deTotal_Bruto,
                    Double.parseDouble(vista.txtTotalNeto.getText()),//deTotal_Neto
                    Double.parseDouble(vista.txtMontoDescuentoGlobal.getText()),//deMonto_Desc_Glob
                    Double.parseDouble(vista.txtMontoporc_recal.getText()),// @deMonto_Reca
                    Double.parseDouble(vista.txtOtros.getText()),//deOtros1
                    0,//deOtros2
                    0,//deOtros3
                    Double.parseDouble(vista.txtImpuesto.getText()), //@deMonto_Imp
                    0, //@deMonto_Imp2
                    0,//@deMonto_Imp3
                    0,//bAnulado,
                    0,//bImpresa,
                    null, //sSalestax,
                    null, //sDis_Cen,
                    vista.TxtDireccionEntrega.getText(), //sDir_Ent,
                    vista.txtComentario.getText(), //sComentario,
                    vista.TxtCampo1.getText(), //sCampo1, 
                    vista.TxtCampo2.getText(), //sCampo2, 
                    vista.TxtCampo3.getText(), //  sCampo3,
                    vista.TxtCampo4.getText(), //sCampo4, 
                    vista.TxtCampo5.getText(),//sCampo5, 
                    vista.TxtCampo6.getText(), //sCampo6, 
                    null,//sCampo7,
                    null, // sCampo8,
                    Vistaprincipal.tempUsuario, // sCo_Us_Mo,
                    Vistaprincipal.tempSucrsal, //sCo_Sucu_Mo,
                    "1",//sRevisado,
                    "1",//sTrasnfe,
                    Utilitarios.Utilitario.nombreHost(),
                    // tsValidador,
                    // sCampos,
                    1 // bNac
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                // vista.setterCampos();
                //  modeloTablaFacturaVentaRenglon.limpiarRengloTabla(cantidaRow);
            }
        } else if (event.getSource().equals(vista.btnEliminar)) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarFacturaCompra(
                        vista.txtNumDocumentCompra.getText().replaceAll("\\s", ""), // sDoc_NumOri,
                        Utilitarios.Utilitario.nombreHost(), // sMaquina, 
                        Vistaprincipal.tempUsuario, //sCo_Us_Mo, 
                        Vistaprincipal.tempSucrsal //sCo_Sucu_Mo
                );
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.setterCampos();
                }
            } else {
                return;
            }

        } else if (event.getSource().equals(vista.btnNuevo)) {
            vista.setterCampos();
        } else if (event.getSource().equals(vista.btnImprimir)) {

        } else if (event.getSource().equals(this.vista.btnagregar)) {
            FacturaCompraRengBO facturaCompraRengBO = new FacturaCompraRengBO();
            int renglones = 0, ultimaFila = 0;
            ultimaFila = vista.jTablaFacturaCompraRenglon.getRowCount();
            if (vista.jTablaFacturaCompraRenglon.getRowCount() == 0) {
                renglones = +1;
            } else {
                renglones = Integer.parseInt(vista.jTablaFacturaCompraRenglon.getValueAt(vista.jTablaFacturaCompraRenglon.getRowCount() - 1, 0).toString()) + 1;
            }

            facturaCompraRengBO.setReng_num(renglones);
            facturaCompraRengBO.setDoc_num("");
            facturaCompraRengBO.setDes_art("");
            facturaCompraRengBO.setTotal_art(0);
            facturaCompraRengBO.setReng_neto(0.0);
            facturaCompraRengBO.setTipo_imp("0");
            facturaCompraRengBO.setCost_unit(0.0);

            modelofacturaCompraRenglon.addRow(facturaCompraRengBO);
        } else if (event.getSource().equals(this.vista.btnrestar)) {
            modelofacturaCompraRenglon.removedRow(vista.jTablaFacturaCompraRenglon.getSelectedRow());

        } else if (event.getSource().equals(this.vista.btnBuscar)) {
            cargarDatosEncabezadoFacturaCompras(
                    Vista.Vistaprincipal.tempEmpresa,
                    "saFacturaCompra",
                    "co_prov",
                    "",
                    "2"
            );
            vista.jDialogFActuraCompra.setSize(495, 425);
            vista.jDialogFActuraCompra.setLocationRelativeTo(null);
            vista.jDialogFActuraCompra.setVisible(true);
        } else if (event.getSource().equals(this.vista.btnAceptarFactCompra)) {
            selection = vista.jtablaFacturaCompra.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaFactura = modelo.pOptenerListadoDatos(
                        Vista.Vistaprincipal.tempEmpresa,
                        "safacturaCompra",
                        "doc_num",
                        vista.jtablaFacturaCompra.getValueAt(selection, 0).toString(), //sValor,
                        "3");
                vista.txtNumDocumentCompra.setText(listaFactura.get(0).getDoc_num().replaceAll("\\s", ""));
                vista.txtcdiProveedor.setText(listaFactura.get(0).getCo_prov().replaceAll("\\s", ""));
                vista.txtDescripcionProveedor.setText(listaFactura.get(0).getDescripcionProveedor());
                vista.txtCodPago.setText(listaFactura.get(0).getCo_cond().replaceAll("\\s", ""));
                vista.txtNumFactura.setText(String.valueOf(listaFactura.get(0).getNro_fact().replaceAll("\\s", "")));
                vista.txtNmControl.setText(listaFactura.get(0).getN_control().replaceAll("\\s", ""));
                vista.txtDescripcionFactCompra.setText(listaFactura.get(0).getDescrip());
                vista.fechaFacturaActual.setDate(Utilitarios.Utilitario.obtenerFecha(listaFactura.get(0).getFec_emis()));
                vista.fechaVencimiento.setDate(Utilitarios.Utilitario.obtenerFecha(listaFactura.get(0).getFec_venc()));
                vista.fechaRegistro.setDate(Utilitarios.Utilitario.obtenerFecha(listaFactura.get(0).getFec_reg()));
                vista.txtCodMoneda.setText(listaFactura.get(0).getCo_mone().replaceAll("\\s", ""));
                vista.txtMontoDescuentoGlobal.setText(String.valueOf(listaFactura.get(0).getMonto_desc_glob()));
                vista.txtMontoporc_recal.setText(String.valueOf(listaFactura.get(0).getMonto_reca()).replaceAll("\\s", ""));
                vista.txtSaldo.setText(String.valueOf(listaFactura.get(0).getSaldo()));
                vista.txtSubTotalBruto.setText(String.valueOf(listaFactura.get(0).getTotal_bruto()));
                vista.txtImpuesto.setText(String.valueOf(listaFactura.get(0).getMonto_imp()));
                vista.txtTotalNeto.setText(String.valueOf(listaFactura.get(0).getTotal_neto()));
                vista.txtDescuesto.setText(listaFactura.get(0).getPorc_desc_glob().replaceAll("\\s", ""));
                vista.txtRec.setText(listaFactura.get(0).getPorc_reca().replaceAll("\\s", ""));
                vista.txtOtros.setText(String.valueOf(listaFactura.get(0).getOtros1()));
                vista.TxtDescripcionCodPago.setText(listaFactura.get(0).getDescripciopnCodicionPago());
                vista.TxtMoneda2.setText(listaFactura.get(0).getDescripcionMoneda());
                cargarDatosFacturaCompraRenglon(listaFactura.get(0).getDoc_num());
                
                
                vista.btnactulizar.setEnabled(true);
                vista.btnEliminar.setEnabled(true);
                vista.btnGuardar.setEnabled(false);
                
                vista.jDialogFActuraCompra.dispose();
            }
        } else if (event.getSource().equals(this.vista.btnCancelarFacturaCompra)) {
            vista.jDialogFActuraCompra.dispose();
        } else if (event.getSource().equals(this.vista.btnCancelarCondicionPag)) {
            vista.jDialogCondPago.dispose();
        } else if (event.getSource().equals(this.vista.btnCancelarmonedas)) {
            vista.jDialogMoneda.dispose();
        } else if (event.getSource().equals(this.vista.btnAceptarDialoProv)) {
            selection = vista.jtablaProveedores.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaproveedor = modeloProveedor.pObtenerListadoDatosProveedor(
                        Vistaprincipal.tempEmpresa,
                        "co_prov",
                        vista.jtablaProveedores.getValueAt(selection, 0).toString(),//Valor
                        "0",
                        "1",
                        "0",
                        "0",
                        "0",
                        "",
                        "",
                        /*Fecha_desde*/ "",
                        /*Fecha_hasta*/ "",
                        /*@bAplica_Tipo*/ "0",
                        /*@sTipo*/ "0",
                        /*bAplica_RIF*/ "0",
                        /*sRIF*/ "",
                        /*bAlica_Zona*/ "0",
                        /*sTipo_Zona*/ "",
                        /*bAplica_Segmento*/ "0",
                        /*sSegmento*/ "",
                        /*bAplica_Cta_ing*/ "0",
                        /*sCta_ing*/ "",
                        /*@iOpcion*/ "3"
                );
                vista.txtcdiProveedor.setText(listaproveedor.get(0).getCo_prov().replaceAll("\\s", ""));
                vista.txtDescripcionProveedor.setText(listaproveedor.get(0).getProv_des());
                vista.jDialogProveedor.dispose();
            }

        } else if (event.getSource().equals(this.vista.btnAceptarCondicionPag)) {
            selection = vista.jtablaCondicionPago.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaCondicionPago = modeloCondicionPago.pObtenerListadoDatos(Vistaprincipal.tempEmpresa,
                        "saCondicionPago",
                        "co_cond",
                        vista.jtablaCondicionPago.getValueAt(selection, 0).toString(),//sValor, 
                        "3");
                vista.txtCodPago.setText(listaCondicionPago.get(0).getCo_cond().replaceAll("\\s", ""));
                vista.TxtDescripcionCodPago.setText(listaCondicionPago.get(0).getCond_des());
                vista.jDialogCondPago.dispose();
            }
        } else if (event.getSource().equals(this.vista.btnAceptarMonedas)) {
            selection = vista.jtableMonedas.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaMoneda = modeloMoneda.pObtenerListadoDatos(
                        Vistaprincipal.tempEmpresa,
                        "saMoneda",
                        "co_mone",
                        vista.jtableMonedas.getValueAt(selection, 0).toString(),
                        "3");
                vista.txtCodMoneda.setText(listaMoneda.get(0).getCo_mone().replaceAll("\\s", ""));
                vista.TxtMoneda2.setText(listaMoneda.get(0).getMone_des());
                vista.jDialogMoneda.dispose();
                listaMoneda = modeloMoneda.pObtenerFechaTasa(listaMoneda.get(0).getCo_mone().replaceAll("\\s", ""), Utilitario.optenerfecha(new java.util.Date()));
                vista.txtTasa.setText(listaMoneda.get(0).getTasa_v());
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        FILATABLAFACTURACOMPRASRENG = vista.jTablaFacturaCompraRenglon.getSelectionModel().getLeadSelectionIndex();

        COLUMNATABLAFACTURACOMPRASRENG = vista.jTablaFacturaCompraRenglon.getColumnModel().getSelectionModel().getLeadSelectionIndex();
        vista.FILA_jtablaComprasreng = FILATABLAFACTURACOMPRASRENG;

        calCulosFacturaCompra();
        if (vista.txtBuscarFactCompra.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String OpcionFac = "0", sfieldNameArt = "";
                if (vista.jRInicio.isSelected()) {
                    OpcionFac = "0";
                } else if (vista.jRFinal.isSelected()) {
                    OpcionFac = "1";
                } else if (vista.jrCualquier.isSelected()) {
                    OpcionFac = "2";
                } else if (vista.JRExacta.isSelected()) {
                    OpcionFac = "3";
                }
                sfieldNameArt = (vista.jrCodigo2.isSelected()) ? "doc_num" : "co_prov";
                cargarDatosEncabezadoFacturaCompras(
                        Vista.Vistaprincipal.tempEmpresa,
                        "safacturaCompra",
                        sfieldNameArt,
                        vista.txtBuscarFactCompra.getText(),
                        OpcionFac
                );
            }
        } else if (vista.txtBuscarProveedor == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion = "0", sfieldName = "";
                if (vista.jRInicio.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinal.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquier.isSelected()) {
                    Opcion = "2";
                } else if (vista.jRexactaProv.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigo.isSelected()) ? "co_prov" : "prov_des";
                cargarDatosProveedor(Vistaprincipal.tempEmpresa, "", sfieldName, vista.txtBuscarProveedor.getText(), Opcion);
            }
        } else if (vista.txtCodPago.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosCondicionPago(
                        Vistaprincipal.tempEmpresa,
                        "saCondicionPago",
                        "co_cond",
                        "",
                        "2");
                vista.jDialogCondPago.setSize(482, 358);
                vista.jDialogCondPago.setLocationRelativeTo(null);
                vista.jDialogCondPago.setVisible(true);

            }
        } else if (vista.txtcdiProveedor.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosProveedor(Vistaprincipal.tempEmpresa, "", "Prov_Des", "", "0");

                vista.jDialogProveedor.setSize(482, 358);
                vista.jDialogProveedor.setLocationRelativeTo(null);
                vista.jDialogProveedor.setVisible(true);
            }
        } else if (vista.txtCodMoneda.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                System.out.println("ENTRSNADO");
                modeloMoneda = new MonedaModel();
                cargarDatosMoneda(Vistaprincipal.tempEmpresa,
                        "saMoneda",
                        "co_mone",
                        "",
                        "2");
                vista.jDialogMoneda.setSize(482, 358);
                vista.jDialogMoneda.setLocationRelativeTo(null);
                vista.jDialogMoneda.setVisible(true);
            }
        } else if (vista.txtValorCondicionPago.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion = "0", sfieldName = "";
                if (vista.jRInicioCondPago.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinalCondPago.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquierCondPago.isSelected()) {
                    Opcion = "2";
                } else if (vista.jRexactaCondPago.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigoCondPago.isSelected()) ? "co_cond" : "cond_des";

                cargarDatosCondicionPago(Vistaprincipal.tempEmpresa,
                        "saCondicionPago",
                        sfieldName,
                        vista.txtValorCondicionPago.getText(),
                        Opcion);
            }
        } else if (vista.txtBuscarMoneda.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String OpcionMoneda = "0", sfieldNameMoneda = "";
                if (vista.jRInicioMoneda.isSelected()) {
                    OpcionMoneda = "0";
                } else if (vista.jRFinalMoneda.isSelected()) {
                    OpcionMoneda = "1";
                } else if (vista.jrCualquierMoneda.isSelected()) {
                    OpcionMoneda = "2";
                } else if (vista.jRexactaMoneda.isSelected()) {
                    OpcionMoneda = "3";
                }
                sfieldNameMoneda = (vista.jrCodigoCondPago.isSelected()) ? "co_mone" : "mone_des";
            }
        } else if (COLUMNATABLAFACTURACOMPRASRENG == 1) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                Utilitarios.Utilitario.MODULO_FACTURA_COMPRAS = "FACTURACOMPRA";
                DialogoArticulos dialogarticulo = new DialogoArticulos(null, true);
                dialogarticulo.setLocationRelativeTo(null);
                dialogarticulo.setSize(555, 350);
                dialogarticulo.setVisible(true);
            }
        } else if (COLUMNATABLAFACTURACOMPRASRENG == 3) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                Utilitarios.Utilitario.MODULO_FACTURA_VENTAS = "FACTURACOMPRA";
//                vista.jDialogAlmacen.setSize(472, 358);
//                vista.jDialogAlmacen.setLocationRelativeTo(null);
//                vista.jDialogAlmacen.setVisible(true);

                DialogoAlmacen vistaAlmacen = new DialogoAlmacen(null, true);
                vistaAlmacen.setLocationRelativeTo(null);
                vistaAlmacen.setSize(555, 350);
                vistaAlmacen.setVisible(true);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    public void cargarDatosFacturaCompraRenglon(String nuFacturaCompra) {
          listaFacturaReng = modelo.pSeleccionarRenglonesFacturaCompra(nuFacturaCompra);
         modelofacturaCompraRenglon.setlistaFacturaCompraReng(listaFacturaReng);

        JTableHeader jTableHeader = vista.jTablaFacturaCompraRenglon.getTableHeader();
        jTableHeader.setDefaultRenderer(new GenionarEncabezado());
        vista.jTablaFacturaCompraRenglon.setTableHeader(jTableHeader);
        vista.jTablaFacturaCompraRenglon.setModel(modelofacturaCompraRenglon);
         modelofacturaCompraRenglon.refrescarTable();
    }

    public void cargarDatosEncabezadoFacturaCompras(
            String sDatabase_Nam,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        listaFactura = modelo.pOptenerListadoDatos(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtablaFacturaCompra.setModel(new ModeloTablaFacturaCompra(listaFactura));
    }

    public void cargarDatosCondicionPago(
            String sDatabase_Nam,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        modeloCondicionPago = new CondicionPagoModel();
        listaCondicionPago = modeloCondicionPago.pObtenerListadoDatos(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtablaCondicionPago.setModel(new ModeloTablaCoindicionPago(listaCondicionPago));
    }

    public void cargarDatosMoneda(
            String sDatabase_Nam,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        listaMoneda = modeloMoneda.pObtenerListadoDatos(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtableMonedas.setModel(new ModeloTablaMoneda(listaMoneda));

    }

    public void cargarDatosProveedor(String sDatabase_Nam,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion) {
        modeloProveedor = new ProveedorModel();
        listaproveedor = modeloProveedor.pObtenerListadoDatosProveedor(
                sDatabase_Nam,
                sField_Name,
                sValor,//Valor
                "0",
                "1",
                "0",
                "0",
                "0",
                "",
                "",
                /*Fecha_desde*/ "",
                /*Fecha_hasta*/ "",
                /*@bAplica_Tipo*/ "0",
                /*@sTipo*/ "0",
                /*bAplica_RIF*/ "0",
                /*sRIF*/ "",
                /*bAlica_Zona*/ "0",
                /*sTipo_Zona*/ "",
                /*bAplica_Segmento*/ "0",
                /*sSegmento*/ "",
                /*bAplica_Cta_ing*/ "0",
                /*sCta_ing*/ "",
                /*@iOpcion*/ iOpcion
        );
        vista.jtablaProveedores.setModel(new ModelTablaProveedores(listaproveedor));
    }

    public void calCulosFacturaCompra() {
        double cantidad = 0, precio = 0, neto = 0, montoImpuesto = 0, totalIva = 0, totalNeto = 0;
        double iva = 0.0;
        subTotatl = 0.0;
        try {

//            ScriptEngineManager sen = new ScriptEngineManager();
//            ScriptEngine se = sen.getEngineByName("JavaScript");
            for (int i = 0; i < vista.jTablaFacturaCompraRenglon.getRowCount(); i++) {

                iva = Double.parseDouble(vista.jTablaFacturaCompraRenglon.getValueAt(i, 5).toString());
                System.out.println("IVA " + iva + "Fila" + i);
                cantidad = Double.parseDouble(vista.jTablaFacturaCompraRenglon.getValueAt(i, 6).toString());
                precio = Double.parseDouble(vista.jTablaFacturaCompraRenglon.getValueAt(i, 7).toString());
                neto = cantidad * precio;
                montoImpuesto = neto * iva / 100;
                subTotatl += neto;
                totalIva += montoImpuesto;

                vista.jTablaFacturaCompraRenglon.setValueAt(montoImpuesto, i, 8);
                vista.jTablaFacturaCompraRenglon.setValueAt(neto, i, 9);
                // if (validar == 1) {

                //  }
                cantidad = 0;
                precio = 0;
                neto = 0;
                montoImpuesto = 0;

            }
            //se.eval("34 +44-55"); 
            //se.eval(cantidad*precio);
            BigDecimal subTotal = new BigDecimal(subTotatl);
            subTotal = subTotal.setScale(2, RoundingMode.DOWN);
            System.out.println(subTotal); // 234.32
            totalNeto = subTotatl + totalIva;
            vista.txtSubTotalBruto.setText(subTotal.toString());
            vista.txtImpuesto.setText(String.valueOf(Math.round(totalIva)));
            vista.txtTotalNeto.setText(String.valueOf(Math.round(totalNeto)));

            System.out.println("valor Impueesto" + totalIva);

        } catch (Exception ex) {
            Logger.getLogger(FacturaVentaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
