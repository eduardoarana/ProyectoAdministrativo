/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Beans.ClienteBO;
import Beans.CondicionPagoBO;
import Beans.CotizacionClienteBO;
import Beans.CotizacionClienteRengBO;
import Beans.MonedaBO;
import Beans.TransportesBO;
import Beans.VendedorBO;
import Encabezado.GenionarEncabezado;
import Model.ClienteModelo;
import Model.CondicionPagoModel;
import Model.CotizzacionClienteModelo;
import Model.ModeloTablaCliente;
import Model.ModeloTablaCoindicionPago;
import Model.ModeloTablaCotizacion;
import Model.ModeloTablaCotizacionClienteVentaRenglon;
import Model.ModeloTablaMoneda;
import Model.ModeloTablaTransporte;
import Model.ModeloTablaVendedor;
import Model.MonedaModel;
import Model.TranporteModelo;
import Model.VendedorModelo;
import Utilitarios.Utilitario;
import Vista.VistaCotizacionVenta;
import Vista.Vistaprincipal;
import VistaDialogos.DialogoAlmacen;
import VistaDialogos.DialogoArticulos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

/**
 *
 * @author EArana
 */
public class CotizacionClienteController implements ActionListener, KeyListener {

    Double subTotatl = 0.0;
    VistaCotizacionVenta vista;
    CotizzacionClienteModelo cotizzacionClienteModelo;
    int resultado = 0;
    ArrayList<CotizacionClienteBO> listaCotizacion;
    TranporteModelo modeloTransporte;
    ArrayList<TransportesBO> listaTransporte;
    VendedorModelo modeloVendedor;
    ArrayList<VendedorBO> listavendedor;
    CondicionPagoModel modeloCondicionPago;
    ArrayList<CondicionPagoBO> listaCondicionPago;
    ClienteModelo modeloCliente;
    ArrayList<ClienteBO> listaCliente;
    ArrayList<MonedaBO> listaMoneda;
    MonedaModel modeloMoneda;
    String Opcion = "0", sfieldName = "", tipoImp = "";
    ModeloTablaCotizacionClienteVentaRenglon modeloTablaCotizacionClienteVentaRenglon = new ModeloTablaCotizacionClienteVentaRenglon();
    ArrayList<CotizacionClienteRengBO> listaCotizacionReng = new ArrayList<CotizacionClienteRengBO>();
    public int FILATABLACOTIZACIONRENG = 0, COLUMNATABLAFACTURACOTIZACIONRENG;
    int selection = 0;

    public CotizacionClienteController(VistaCotizacionVenta vista) {
        this.vista = vista;
        cotizzacionClienteModelo = new CotizzacionClienteModelo();
        modeloMoneda = new MonedaModel();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == vista.btnGuardar1) {
            int cantidadRow = vista.jTablaCotizacionRenglon.getRowCount();
            if (cantidadRow == 0) {
                JOptionPane.showMessageDialog(new JFrame(), "El Documento no puede ser grabado sin renglones", "Software", JOptionPane.WARNING_MESSAGE);
                return;
            }
            resultado = cotizzacionClienteModelo.pInsertarCotizacionCliente(
                    vista.txtNumCotizacion.getText(),
                    vista.txtDescripcionCotizacion.getText(), //Descrip
                    vista.txtcdiCliente.getText(), //  sCo_Cli,
                    "2", // sCo_Cta_Ingr_Egr,
                    vista.txtTransporte.getText(), // sCo_Tran,
                    vista.TxtMoneda.getText(), //  sCo_Mone,
                    vista.txtCodVendedor.getText(), //sCo_Ven,
                    vista.TxtCodPago.getText(), // sCo_Cond, 
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaEmision), // sdFec_Emis,
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaVencimiento), //sdFec_Venc, 
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaEmision),//sdFec_Reg, 
                    "0",//bAnulado,
                    vista.txtStatusCotizcion.getText(), // sStatus,
                    vista.txtTasa.getText(), // deTasa,
                    "", //sN_Control,
                    vista.txtNumCotizacion.getText(), // sNro_Doc,
                    vista.txtDescuesto.getText(), //sPorc_Desc_Glob,
                    vista.txtMontoDescuento.getText(), //deMonto_Desc_Glob,
                    vista.txtRec.getText(), // sPorc_Reca,
                    vista.TxtRec2.getText(), // deMonto_Reca,
                    "0", //Saldo
                    vista.txtTotalNeto.getText(), // deTotal_Bruto,
                    vista.txtImpuesto.getText(), //  deMonto_Imp,
                    "0", //deMonto_Imp2,
                    "0", // deMonto_Imp3,
                    "0",// deOtros1,
                    "0", //deOtros2,
                    "0", //deOtros3,
                    vista.txtTotalNeto.getText(), //deTotal_Neto,
                    null, // sDis_Cen,
                    vista.txtDescripcionCotizacion.getText(), //sComentario,
                    vista.TxtDireccionEntrega.getText(),// sDir_Ent,
                    "1",// bContrib, contribuyente
                    "0",//bImpresa,
                    null, //sSalestax,
                    null,// sImpfis,
                    null, //sImpfisfac,
                    "0",// bVen_Ter,
                    vista.TxtCampo1.getText(),// sCampo1,
                    vista.TxtCampo2.getText(),//sCampo2,
                    vista.TxtCampo3.getText(),//sCampo3,
                    vista.TxtCampo4.getText(),//sCampo4,
                    vista.TxtCampo5.getText(),//sCampo5,
                    vista.TxtCampo6.getText(),//sCampo6,
                    null,//sCampo7,
                    null,//sCampo8,
                    Vistaprincipal.tempUsuario, //sCo_Us_In,
                    Vistaprincipal.tempSucrsal,//sCo_Sucu_In,
                    "0",//sRevisado,
                    "0",//sTrasnfe,
                    Utilitarios.Utilitario.nombreHost()// sMaquina
            );
            for (int i = 0; i < cantidadRow; i++) {
                cotizzacionClienteModelo.pInsertarRenglonesCotizacionCliente(
                        Integer.parseInt(vista.jTablaCotizacionRenglon.getValueAt(i, 0).toString()),//iReng_Num
                        vista.txtNumCotizacion.getText(), //sDoc_Num,
                        vista.jTablaCotizacionRenglon.getValueAt(i, 1).toString(),// sCo_Art,
                        vista.jTablaCotizacionRenglon.getValueAt(i, 2).toString(),//sDes_Art
                        vista.jTablaCotizacionRenglon.getValueAt(i, 4).toString(), // sCo_Uni,
                        vista.jTablaCotizacionRenglon.getValueAt(i, 4).toString(), //sSco_Uni,
                        vista.jTablaCotizacionRenglon.getValueAt(i, 3).toString(),// sCo_Alma,
                        vista.jTablaCotizacionRenglon.getValueAt(i, 7).toString(),//sCo_Precio,
                        vista.jTablaCotizacionRenglon.getValueAt(i, 5).toString(),//  sTipo_Imp,
                        "1i2",//sTipo_Imp2,
                        "2",//sTipo_Imp3,
                        Double.parseDouble(vista.jTablaCotizacionRenglon.getValueAt(i, 6).toString()),//deTotal_Art 
                        1.1,//deSTotal_Art 
                        Double.parseDouble(vista.jTablaCotizacionRenglon.getValueAt(i, 7).toString()),//   dePrec_Vta,
                        "",//sPorc_Desc,
                        0.0, //sdeMonto_Desc,
                        Double.parseDouble(vista.jTablaCotizacionRenglon.getValueAt(i, 9).toString()), //sdeReng_Neto,
                        0.0, //sdePendiente,
                        0.0, //sdePendiente2,
                        0.0, //sdeMonto_Desc_Glob,
                        0.0,// sdeMonto_reca_Glob,
                        0.0,//sdeOtros1_glob,
                        0.0,//sdeOtros2_glob,
                        0.0,//sdeOtros3_glob,
                        0.0,//sdeMonto_imp_afec_glob,
                        0.0,//sdeMonto_imp2_afec_glob,
                        0.0,//sdeMonto_imp3_afec_glob,
                        "COTI",// sTipo_Doc,
                        null, // sNum_Doc,
                        1.1,//dePorc_Imp,
                        1.0, //dePorc_Imp2,
                        1.0,// dePorc_Imp3,
                        Double.parseDouble(vista.jTablaCotizacionRenglon.getValueAt(i, 8).toString()),//deMonto_Imp ,
                        1.0,//deMonto_Imp2,
                        1.0,//deMonto_Imp3,
                        1.0,//deOtros,
                        1.0,//deTotal_Dev,
                        1.0,//deMonto_Dev ,
                        vista.txtxComentario.getText(),// sComentario,
                        null, // sDis_Cen,
                        Vistaprincipal.tempSucrsal, //sCo_Sucu_In,
                        Vistaprincipal.tempUsuario, //sCo_Us_In,
                        "1",//sREVISADO,
                        "1", // sTRASNFE,
                        Utilitario.nombreHost() //sMaquina
                );
            }
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setterCampos();
                cargarDatosCotizacionClientesVentasRenglon(null);
                //  modeloTablaFacturaVentaRenglon.limpiarRengloTabla(cantidaRow);
            }
        } else if (event.getSource() == vista.btnactulizar) {
            resultado = cotizzacionClienteModelo.pActualizarCotizacionCliente(
                    vista.txtNumCotizacion.getText(), // sDoc_Num,
                    vista.txtNumCotizacion.getText(), //sDoc_NumOri, 
                    vista.txtDescripcionCotizacion.getText(),//sDescrip,
                    vista.txtcdiCliente.getText(),// co_cli 
                    "2",// sCo_Cta_Ingr_Egr,
                    vista.txtTransporte.getText(),//sCo_Tran, 
                    vista.TxtMoneda.getText(), //sCo_Mone,
                    vista.txtCodVendedor.getText(), //sCo_Ven,
                    vista.TxtCodPago.getText(), //sCo_Cond,
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaEmision),// sdFec_Emis,
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaVencimiento),//sdFec_Venc,
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaEmision),// sdFec_Reg,
                    "0", //bAnulado,
                    vista.txtStatusCotizcion.getText(),// sStatus,
                    vista.txtTasa.getText(), //deTasa,
                    "",//sN_Control,
                    vista.txtNumCotizacion.getText(),// sNro_Doc,
                    vista.txtDescuesto.getText(), //sPorc_Desc_Glob,
                    vista.txtMontoDescuento.getText(), //deMonto_Desc_Glob,
                    vista.txtRec.getText(), //sPorc_Reca,
                    vista.TxtRec2.getText(), //deMonto_reca,
                    "0",//deSaldo,
                    vista.txtSubTotalBruto.getText(), //deTotal_Bruto,
                    vista.txtImpuesto.getText(), //deMonto_Imp,
                    "0", //deMonto_Imp2,
                    "0", //deMonto_Imp3,
                    "0",//deOtros1,
                    "0", //deOtros2,
                    "0", //deOtros3,
                    vista.txtTotalNeto.getText(), //deTotal_Neto,
                    vista.txtDescripcionCotizacion.getText(), //sComentario,
                    vista.TxtDireccionEntrega.getText(), //sDir_Ent,
                    "1",// bContrib, contribuyente,
                    "0", //bImpresa,
                    null, //sSalestax,,
                    null,// sImpfis,
                    null, //sImpfisfac
                    "0",//bVen_Ter,
                    "0",//sDis_Cen,
                    vista.TxtCampo1.getText(),// sCampo1,
                    vista.TxtCampo2.getText(),//sCampo2,
                    vista.TxtCampo3.getText(),//sCampo3,
                    vista.TxtCampo4.getText(),//sCampo4,
                    vista.TxtCampo5.getText(),//sCampo5,
                    vista.TxtCampo6.getText(),//sCampo6 
                    null, //sCampo7,
                    null, //sCampo8,
                    Vistaprincipal.tempUsuario, // sCo_Us_Mo,
                    Vistaprincipal.tempSucrsal, //sCo_Sucu_Mo,
                    "0", //sRevisado,
                    "0", // sTrasnfe,
                    Utilitarios.Utilitario.nombreHost(),// sMaquina,
                    "" // sCampos
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setterCampos();
                cargarDatosCotizacionClientesVentasRenglon(null);
                //  modeloTablaFacturaVentaRenglon.limpiarRengloTabla(cantidaRow);
            }
        } else if (event.getSource() == vista.btnEliminar1) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = cotizzacionClienteModelo.pEliminarCotizacionCliente(
                        vista.txtNumCotizacion.getText(), // sDoc_NumOri,
                        Utilitarios.Utilitario.nombreHost(), // sMaquina, 
                        Vistaprincipal.tempUsuario, //sCo_Us_Mo, 
                        Vistaprincipal.tempSucrsal //sCo_Sucu_Mo
                );

                cotizzacionClienteModelo.pEliminarRenglonesCotizacionCliente(
                        vista.txtNumCotizacion.getText(),
                        1,
                        Vistaprincipal.tempUsuario,
                        Utilitario.nombreHost(),
                        Vistaprincipal.tempSucrsal);

                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.setterCampos();
                    cargarDatosCotizacionClientesVentasRenglon(null);
                }
            }
        } else if (event.getSource() == vista.btnNuevo1) {
            vista.setterCampos();
            cargarDatosCotizacionClientesVentasRenglon(null);
            //vista.desAnularFacturaVenta();
        } else if (event.getSource() == vista.btnBuscar) {
            cargarDatosEncabezadoFacturaVentas(
                    Vista.Vistaprincipal.tempEmpresa,
                    "saCotizacionCliente",
                    "co_cli",
                    "",
                    "2"
            );
            vista.jDialogCotizacionCliente.setSize(480, 445);
            vista.jDialogCotizacionCliente.setLocationRelativeTo(null);
            vista.jDialogCotizacionCliente.setVisible(true);

        } else if (event.getSource() == vista.btnAceptarCotizacion) {
            selection = vista.jtablaCotizacion.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaCotizacion = cotizzacionClienteModelo.pObtenerListadoDatos(
                        Vista.Vistaprincipal.tempEmpresa,
                        "saCotizacionCliente",
                        "doc_num",
                        vista.jtablaCotizacion.getValueAt(selection, 0).toString(), //sValor,
                        "3");
                vista.TxtCampo1.setText(listaCotizacion.get(0).getCampo1());
                vista.TxtCampo2.setText(listaCotizacion.get(0).getCampo2());
                vista.TxtCampo3.setText(listaCotizacion.get(0).getCampo3());
                vista.TxtCampo4.setText(listaCotizacion.get(0).getCampo4());
                vista.TxtCampo5.setText(listaCotizacion.get(0).getCampo5());
                vista.TxtCampo6.setText(listaCotizacion.get(0).getCampo6());
                vista.TxtCodPago.setText(listaCotizacion.get(0).getCo_cond().replaceAll("\\s", ""));

                vista.TxtDireccionEntrega.setText(listaCotizacion.get(0).getDir_ent());
                vista.TxtMoneda.setText(listaCotizacion.get(0).getCo_mone().replaceAll("\\s", ""));
                vista.TxtMoneda2.setText(listaCotizacion.get(0).getDescripcionMoneda());
                vista.TxtRec2.setText(String.valueOf(listaCotizacion.get(0).getMonto_reca()));
                vista.txtTransporte.setText(listaCotizacion.get(0).getCo_tran().replaceAll("\\s", ""));

                vista.TxtVendedor2.setText(listaCotizacion.get(0).getDescripcionVendedor());
                vista.txtCodVendedor.setText(listaCotizacion.get(0).getCo_ven().replaceAll("\\s", ""));
                vista.txtDescuesto.setText(String.valueOf(listaCotizacion.get(0).getPorc_desc_glob()));
                vista.txtImpuesto.setText(String.valueOf(listaCotizacion.get(0).getMonto_imp()));
                vista.txtMontoDescuento.setText(String.valueOf(listaCotizacion.get(0).getMonto_desc_glob()));
                vista.txtNumCotizacion.setText(String.valueOf(listaCotizacion.get(0).getDoc_num()));
                vista.txtcdiCliente.setText(listaCotizacion.get(0).getCo_cli().replaceAll("\\s", ""));
                vista.txtDescripcionClientes.setText(listaCotizacion.get(0).getDescripcionCliente());

                vista.txtTotalNeto.setText(String.valueOf(listaCotizacion.get(0).getTotal_neto()));
                vista.txtSubTotalBruto.setText(String.valueOf(listaCotizacion.get(0).getTotal_bruto()));
                //vista.txtNroControlCotizacion.setText(listaCotizacion.get(0).getN_control());
                vista.txtStatusCotizcion.setText(listaCotizacion.get(0).getStatus());
                vista.txtDescripcionCotizacion.setText(listaCotizacion.get(0).getDescrip());
                vista.txtRec.setText(String.valueOf(listaCotizacion.get(0).getPorc_reca()));
                vista.fechaEmision.setDate(Utilitarios.Utilitario.obtenerFecha(listaCotizacion.get(0).getFec_reg()));
                vista.fechaVencimiento.setDate(Utilitarios.Utilitario.obtenerFecha(listaCotizacion.get(0).getFec_venc()));
                vista.TxtDescripcionCodPago.setText(listaCotizacion.get(0).getDescripcionCodPago());
                vista.TxtTransporte2.setText(listaCotizacion.get(0).getDescripciontransporte());
                System.out.println("valor:::::" + listaCotizacion.get(0).getDoc_num().replaceAll("\\s", ""));
                cargarDatosCotizacionClientesVentasRenglon(listaCotizacion.get(0).getDoc_num().replaceAll("\\s", ""));
                vista.jDialogCotizacionCliente.dispose();
                vista.btnEliminar1.setEnabled(true);
                vista.btnactulizar.setEnabled(true);
                vista.btnGuardar1.setEnabled(false);
                cargarElValorIVA();
            }
        } else if (event.getSource().equals(vista.btnAceptarCliente)) {
            selection = vista.jtablaCliente.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaCliente = modeloCliente.pObtenerListadoDatos(
                        Vistaprincipal.tempEmpresa,
                        "saCliente",
                        "co_cli",
                        vista.jtablaCliente.getValueAt(selection, 0).toString(),
                        "3");
                vista.txtcdiCliente.setText(listaCliente.get(0).getCo_cli().replaceAll("\\s", ""));
                vista.txtDescripcionClientes.setText(listaCliente.get(0).getCli_des());
                vista.jDialogCliente.dispose();
            }
        } else if (event.getSource().equals(vista.btnAceptarCondicionPag)) {

            selection = vista.jtablaCondicionPago.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaCondicionPago = modeloCondicionPago.pObtenerListadoDatos(
                        Vistaprincipal.tempEmpresa,
                        "saCondicionPago",
                        "co_cond",
                        vista.jtablaCondicionPago.getValueAt(selection, 0).toString(),
                        "3"
                );
                vista.TxtCodPago.setText(listaCondicionPago.get(0).getCo_cond().replaceAll("\\s", ""));
                vista.TxtDescripcionCodPago.setText(listaCondicionPago.get(0).getCond_des());
                vista.jDialogCondiicionPago.dispose();
            }
        } else if (event.getSource().equals(vista.btnAceptarVendedor)) {
            selection = vista.jtablaVendedor.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listavendedor = modeloVendedor.pObtenerListadoDatos(
                        Vistaprincipal.tempEmpresa,
                        "saVendedor",
                        "co_ven",
                        vista.jtablaVendedor.getValueAt(selection, 0).toString(),
                        "3");
                vista.txtCodVendedor.setText(listavendedor.get(0).getCo_ven().replaceAll("\\s", ""));
                vista.TxtVendedor2.setText(listavendedor.get(0).getVen_des());
                vista.jDialogVendedor.dispose();
            }
        } else if (event.getSource() == vista.btnCancelarCotizacion) {
            vista.jDialogCotizacionCliente.dispose();
        } else if (event.getSource().equals(vista.btnAceptarTransporte)) {
            selection = vista.jtablaTransporte.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaTransporte = modeloTransporte.pObtenerListadoDatos(Vistaprincipal.tempEmpresa,
                        "saTransporte",
                        "co_tran",
                        vista.jtablaTransporte.getValueAt(selection, 0).toString(),
                        "3");
                vista.txtTransporte.setText(listaTransporte.get(0).getCo_tran().replaceAll("\\s", ""));
                vista.TxtTransporte2.setText(listaTransporte.get(0).getDes_tran());
                vista.jDialogTransporte.dispose();
            }
        } else if (event.getSource().equals(vista.btnAceptarMonedas)) {

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

                vista.TxtMoneda.setText(listaMoneda.get(0).getCo_mone().replaceAll("\\s", ""));
                vista.TxtMoneda2.setText(listaMoneda.get(0).getMone_des());
                vista.jDialogMoneda.dispose();
                listaMoneda = modeloMoneda.pObtenerFechaTasa(listaMoneda.get(0).getCo_mone().replaceAll("\\s", ""), Utilitario.optenerfecha(new Date()));

                vista.txtTasa.setText(listaMoneda.get(0).getTasa_v());

            }
        } else if (event.getSource().equals(vista.btnCancelarCotizacion)) {
            vista.jDialogCotizacionCliente.dispose();
        } else if (event.getSource().equals(vista.btnCancelarCondicionPag)) {
            vista.jDialogCondiicionPago.dispose();
        } else if (event.getSource().equals(vista.btnCancelarCliente)) {
            vista.jDialogCliente.dispose();
        } else if (event.getSource().equals(vista.btnCancelarMoneda)) {
            vista.jDialogMoneda.dispose();
        } else if (event.getSource().equals(vista.btnCancelarTransporte)) {
            vista.jDialogTransporte.dispose();
        } else if (event.getSource().equals(vista.btnCancelarVendedor)) {
            vista.jDialogVendedor.dispose();
        } else if (event.getSource().equals(vista.btnagregar)) {
            CotizacionClienteRengBO cotizacionClienteRengBO = new CotizacionClienteRengBO();

            int renglones = 0, ultimaFila = 0;
            ultimaFila = vista.jTablaCotizacionRenglon.getRowCount();
            if (vista.jTablaCotizacionRenglon.getRowCount() == 0) {
                renglones = +1;
            } else {
                renglones = Integer.parseInt(vista.jTablaCotizacionRenglon.getValueAt(vista.jTablaCotizacionRenglon.getRowCount() - 1, 0).toString()) + 1;
            }
            cotizacionClienteRengBO.setReng_num(renglones);
            cotizacionClienteRengBO.setReng_neto(0.0);
            cotizacionClienteRengBO.setPrec_vta(0.0);
            cotizacionClienteRengBO.setCo_precio("0.0");
            cotizacionClienteRengBO.setMonto_imp(0.0);
            cotizacionClienteRengBO.setTipo_imp("0.0");

            modeloTablaCotizacionClienteVentaRenglon.addRow(cotizacionClienteRengBO);
        } else if (event.getSource().equals(this.vista.btnrestar)) {
            modeloTablaCotizacionClienteVentaRenglon.removedRow(vista.jTablaCotizacionRenglon.getSelectedRow());
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        FILATABLACOTIZACIONRENG = vista.jTablaCotizacionRenglon.getSelectedRow();
        COLUMNATABLAFACTURACOTIZACIONRENG = vista.jTablaCotizacionRenglon.getColumnModel().getSelectionModel().getLeadSelectionIndex();
        VistaCotizacionVenta.FILA_jtablaCotizacionReng = FILATABLACOTIZACIONRENG;
        calCulosCotizacionVenta();
        if (vista.txtcdiCliente.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosClientes(
                        Vistaprincipal.tempEmpresa,
                        "saCliente",
                        "co_cli",
                        "",
                        "2"
                );
                vista.jDialogCliente.setSize(482, 358);
                vista.jDialogCliente.setLocationRelativeTo(null);
                vista.jDialogCliente.setVisible(true);
            }
        } else if (vista.TxtCodPago.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosCondicionPago(
                        Vistaprincipal.tempEmpresa,
                        "saCondicionPago",
                        "co_cond",
                        "",
                        "2");
                vista.jDialogCondiicionPago.setSize(482, 358);
                vista.jDialogCondiicionPago.setLocationRelativeTo(null);
                vista.jDialogCondiicionPago.setVisible(true);
            }
        } else if (vista.txtCodVendedor.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosVendedor(
                        Vistaprincipal.tempEmpresa,
                        "saVendedor",
                        "co_ven",
                        "",
                        "2"
                );
                vista.jDialogVendedor.setSize(482, 358);
                vista.jDialogVendedor.setLocationRelativeTo(null);
                vista.jDialogVendedor.setVisible(true);
            }
        } else if (vista.txtTransporte.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosTransporte(Vistaprincipal.tempEmpresa,
                        "saTransporte",
                        "co_tran",
                        "",
                        "2");
                vista.jDialogTransporte.setSize(482, 358);
                vista.jDialogTransporte.setLocationRelativeTo(null);
                vista.jDialogTransporte.setVisible(true);
            }
        } else if (vista.TxtMoneda.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosMoneda(Vistaprincipal.tempEmpresa,
                        "saMoneda",
                        "co_mone",
                        "",
                        "2");

                vista.jDialogMoneda.setSize(482, 358);
                vista.jDialogMoneda.setLocationRelativeTo(null);
                vista.jDialogMoneda.setVisible(true);
            }
        } else if (vista.txtBuscarCliente.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                if (vista.jRInicioCliente.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinalCliente.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquierCliente.isSelected()) {
                    Opcion = "2";
                } else if (vista.jrExactaCliente.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigoCliente.isSelected()) ? "co_cli" : "cli_des";
                cargarDatosClientes(
                        Vistaprincipal.tempEmpresa,
                        "saCliente",
                        sfieldName,
                        vista.txtBuscarCliente.getText(),
                        Opcion);
            }
        } else if (vista.txtValorCondicionPago.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                if (vista.jRInicioCondPago.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinalCondPago.isSelected()) {
                    Opcion = "1";
//                } else if (vista.jrCualquierCondPago.isSelected()) {
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
        } else if (vista.txtBuscarTransporte.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {

                if (vista.jRInicioTransporte.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinalTransporte.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquierTransporte.isSelected()) {
                    Opcion = "2";
                } else if (vista.jRexactaTransporte.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigoTransporte.isSelected()) ? "co_tran" : "des_tran";
                cargarDatosTransporte(Vistaprincipal.tempEmpresa,
                        "saTransporte",
                        sfieldName,
                        vista.txtBuscarTransporte.getText(),
                        Opcion);
            }
        } else if (vista.txtBuscarVendedor.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                if (vista.jRInicioVendedor.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinalVendedor.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquierVendedor.isSelected()) {
                    Opcion = "2";
                } else if (vista.JRExactaVendedor.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigoVendedor.isSelected()) ? "co_ven" : "ven_des";
                cargarDatosVendedor(
                        Vistaprincipal.tempEmpresa,
                        "saVendedor",
                        sfieldName,
                        vista.txtBuscarVendedor.getText(),
                        Opcion);
            }
        } else if (vista.txtBuscarMoneda.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                if (vista.jRInicioMoneda.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinalMoneda.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquierMoneda.isSelected()) {
                    Opcion = "2";
                } else if (vista.jRexactaMoneda.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigoMoneda.isSelected()) ? "co_mone" : "mone_des";
                cargarDatosMoneda(
                        Vistaprincipal.tempEmpresa,
                        "saMoneda",
                        sfieldName,
                        vista.txtBuscarMoneda.getText(),
                        Opcion);
            }
        } else if (COLUMNATABLAFACTURACOTIZACIONRENG == 1) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {

                Utilitarios.Utilitario.MODULO_COTIZACION_VENTAS = "COTIZACIONVENTA";
                DialogoArticulos dialogarticulo = new DialogoArticulos(null, true);
                dialogarticulo.setLocationRelativeTo(null);
                dialogarticulo.setSize(555, 350);
                dialogarticulo.setVisible(true);
            }
        } else if (COLUMNATABLAFACTURACOTIZACIONRENG == 3) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                Utilitarios.Utilitario.MODULO_COTIZACION_VENTAS = "COTIZACIONVENTA2";

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

    public void cargarDatosEncabezadoFacturaVentas(
            String sDatabase_Nam,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        listaCotizacion = cotizzacionClienteModelo.pObtenerListadoDatos(
                sDatabase_Nam,
                sTable_Name,
                sField_Name,
                sValor,
                iOpcion);
        vista.jtablaCotizacion.setModel(new ModeloTablaCotizacion(listaCotizacion));

    }

    public void cargarDatosTransporte(
            String sDatabase_Nam,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        modeloTransporte = new TranporteModelo();
        listaTransporte = modeloTransporte.pObtenerListadoDatos(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtablaTransporte.setModel(new ModeloTablaTransporte(listaTransporte));

    }

    public void cargarDatosVendedor(
            String sDatabase_Nam,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        modeloVendedor = new VendedorModelo();
        listavendedor = modeloVendedor.pObtenerListadoDatos(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtablaVendedor.setModel(new ModeloTablaVendedor(listavendedor));
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

    public void cargarDatosClientes(
            String sDatabase_Nam,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        modeloCliente = new ClienteModelo();
        listaCliente = modeloCliente.pObtenerListadoDatos(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtablaCliente.setModel(new ModeloTablaCliente(listaCliente));
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

    // Cargar los Datos de los renglones Cotizacion de las Ventas ..
    public void cargarDatosCotizacionClientesVentasRenglon(String nuFacturaVenta) {
        listaCotizacionReng = cotizzacionClienteModelo.pSeleccionarRenglonesCotizacionCliente(nuFacturaVenta);
        modeloTablaCotizacionClienteVentaRenglon.setlistaFacturaVentas(listaCotizacionReng);
        JTableHeader jTableHeader = vista.jTablaCotizacionRenglon.getTableHeader();
        jTableHeader.setDefaultRenderer(new GenionarEncabezado());
        vista.jTablaCotizacionRenglon.setTableHeader(jTableHeader);
        vista.jTablaCotizacionRenglon.setModel(modeloTablaCotizacionClienteVentaRenglon);
        modeloTablaCotizacionClienteVentaRenglon.refrescarTable();
    }

    public void cargarElValorIVA() {
        //  int tipoImpu = Utilitarios.Utilitario.optenerUltimoImp(Conection.Conexion.getCom(), Utilitario.optenerfecha(new Date()), listaArticulo.get(0).getTipo_imp());
        System.out.println("ESTE ES LA CANTIDAD  " + listaCotizacionReng.size() + "  ESTE ES EL VALOR :::::::" + listaCotizacionReng.get(0).getPorc_imp());
        for (int i = 0; i < listaCotizacionReng.size(); i++) {
            vista.jTablaCotizacionRenglon.setValueAt(listaCotizacionReng.get(i).getPorc_imp(), i, 5);
        }
    }

    public void calCulosCotizacionVenta() {
        double cantidad = 0, precio = 0, neto = 0, montoImpuesto = 0, totalIva = 0, totalNeto = 0;
        double iva = 0.0;
        subTotatl = 0.0;
        try {
//            ScriptEngineManager sen = new ScriptEngineManager();
//            ScriptEngine se = sen.getEngineByName("JavaScript");
            for (int i = 0; i < vista.jTablaCotizacionRenglon.getRowCount(); i++) {

                iva = Double.parseDouble(vista.jTablaCotizacionRenglon.getValueAt(i, 5).toString());
                System.out.println("IVA " + iva + "Fila" + i);
                cantidad = Double.parseDouble(vista.jTablaCotizacionRenglon.getValueAt(i, 6).toString());
                precio = Double.parseDouble(vista.jTablaCotizacionRenglon.getValueAt(i, 7).toString());
                neto = cantidad * precio;
                montoImpuesto = neto * iva / 100;
                subTotatl += neto;
                totalIva += montoImpuesto;

                vista.jTablaCotizacionRenglon.setValueAt(montoImpuesto, i, 8);
                vista.jTablaCotizacionRenglon.setValueAt(neto, i, 9);
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

        } catch (Exception ex) {
            Logger.getLogger(FacturaVentaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
