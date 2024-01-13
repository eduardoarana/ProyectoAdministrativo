/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.AlmacenBO;
import Beans.ArtUnidadBO;
import Beans.ArticulosBO;
import Beans.ClienteBO;
import Beans.CondicionPagoBO;
import Beans.FacturaVentaBO;
import Beans.FacturaVentaRengBO;
import Beans.MonedaBO;
import Beans.TransportesBO;
import Beans.VendedorBO;
import Conection.Conexion;
import Encabezado.GenionarEncabezado;
import Model.AlmacenModel;
import Model.ArtUnidadModel;
import Model.ArticuloModel;
import Model.ClienteModelo;
import Model.CondicionPagoModel;
import Model.FacturaVentaModelo;
import Model.ModelTablaArticulos;
import Model.ModeloTablaAlmacen;
import Model.ModeloTablaCliente;
import Model.ModeloTablaCoindicionPago;
import Model.ModeloTablaFacturaVenta;
import Model.ModeloTablaFacturaVentaRenglon;
import Model.ModeloTablaMoneda;
import Model.ModeloTablaTransporte;
import Model.ModeloTablaVendedor;
import Model.MonedaModel;
import Model.StockModelo;
import Model.TranporteModelo;
import Model.VendedorModelo;
import Utilitarios.Utilitario;
import Vista.VistaFacturaVenta;
import Vista.Vistaprincipal;
import VistaDialogos.DialogoAlmacen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
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
public class FacturaVentaController implements ActionListener, KeyListener {

    FacturaVentaModelo modelo;
    ArticuloModel articuloModel;
    ModeloTablaFacturaVentaRenglon modeloTablaFacturaVentaRenglon = new ModeloTablaFacturaVentaRenglon();
    VistaFacturaVenta vista;
    ArrayList<FacturaVentaBO> lista = new ArrayList<>();
    ArrayList<ClienteBO> listaCliente;
    ArrayList<VendedorBO> listavendedor;
    ArrayList<CondicionPagoBO> listaCondicionPago;
    ArrayList<TransportesBO> listaTransporte;
    ArrayList<MonedaBO> listaMoneda;
    ArrayList<ArticulosBO> listaArticulo;
    ClienteModelo modeloCliente;
    VendedorModelo modeloVendedor;
    CondicionPagoModel modeloCondicionPago;
    TranporteModelo modeloTransporte;
    MonedaModel modeloMoneda;
    public int FILATABLAFACTURAVENTARENG = 0, COLUMNATABLAFACTURAVENTARENG;
    int selection = 0;
    String Opcion = "0", sfieldName = "", tipoImp = "";
    Double subTotatl = 0.0;
    public Conexion conexion;
    AlmacenModel almacenModelo;
    static int validar = 0;
    ArrayList<FacturaVentaRengBO> listaFacturaReng = new ArrayList<FacturaVentaRengBO>();
    double cantidad = 0, precio = 0, neto = 0, montoImpuesto = 0, totalIva = 0, totalNeto = 0;

    StockModelo stockModelo;

    public FacturaVentaController(VistaFacturaVenta vista) {
        this.vista = vista;
        modelo = new FacturaVentaModelo();
        articuloModel = new ArticuloModel();
        modeloMoneda = new MonedaModel();
        stockModelo = new StockModelo();
    }

    public FacturaVentaController() {
        
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == vista.btnGuardar) {

            int cantidaRow = vista.jTablaFacturaVentaRenglon.getRowCount();
            if (cantidaRow == 0) {
                JOptionPane.showMessageDialog(new JFrame(), "El Documento no puede ser grabado sin renglones", "Software", JOptionPane.WARNING_MESSAGE);
                return;
            } else if (vista.jTablaFacturaVentaRenglon.getValueAt(0, 3).toString().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo Almacen no debe estar Vacio", "Software", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (vista.txtNumFacturaVenta.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo numero no debe estar vacio", "Software", JOptionPane.WARNING_MESSAGE);
                return;
            } else if (vista.txtcdiCliente.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo Cliente no debe estar vacio", "Software", JOptionPane.WARNING_MESSAGE);
                return;
            } else if (vista.TxtCodPago.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo Condicion de pago no debe estar vacio", "Software", JOptionPane.WARNING_MESSAGE);
                return;
            } else if (vista.txtCodVendedor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo Vendedor no debe estar vacio", "Software", JOptionPane.WARNING_MESSAGE);
                return;
            } else if (vista.txtNroControlFactVentura.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo Numero de Control no debe estar vacio", "Software", JOptionPane.WARNING_MESSAGE);
                return;
            } else if (vista.txtTransporte.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo transporte no debe estar vacio", "Software", JOptionPane.WARNING_MESSAGE);
                return;
            } else if (vista.TxtMoneda.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo Moneda no debe estar vacio", "Software", JOptionPane.WARNING_MESSAGE);
                return;
            }

            resultado = modelo.pInsertarFacturaVenta(
                    vista.txtNumFacturaVenta.getText(),
                    vista.txtDescripcionFactVentas.getText(),
                    vista.txtcdiCliente.getText(),
                    vista.txtTransporte.getText(),
                    vista.TxtMoneda.getText(),
                    vista.txtCuentIngEgr.getText(),// vista.txt.getText(),//Cuente IngresEgre
                    vista.txtCodVendedor.getText(),
                    vista.TxtCodPago.getText(),
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaFacturaActual),
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaVencimiento),
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaRegistro),
                    "0",//anulado
                    vista.txtStatus.getText(),//Status
                    vista.txtTasa.getText(),
                    vista.txtNroControlFactVentura.getText(),//nControl
                    vista.txtDescuesto.getText(),
                    vista.txtMontoDescuento.getText(),/*deMonto_Desc_Glob*/
                    vista.txtRec.getText()/*sPorc_Reca*/,
                    vista.TxtRec2.getText() /*deMonto_Reca*/,
                    vista.txtSaldo.getText(),
                    vista.txtSubTotalBruto.getText(),//deTotal_Bruto, 
                    vista.txtImpuesto.getText(), //deMonto_Imp, 
                    "0",//deMonto_Imp2
                    "0",//deMonto_Imp3, 
                    vista.txtOtros.getText(),//deOtros1, 
                    "0", //deOtros2, 
                    "0", //deOtros3, 
                    vista.txtTotalNeto.getText(),//deTotal_Neto, 
                    null,//sDis_Cen,
                    vista.txtDescripcionFactVentas.getText(),//sComentario,
                    vista.TxtDireccionEntrega.getText(), //sDir_Ent,
                    "1", //bContrib, 
                    "1",//bImpresa,
                    "1", // sSalestax, 
                    "2", //sImpfis,
                    "3", //sImpfisfac,
                    "0",//bVen_Ter, 
                    vista.TxtCampo1.getText(),
                    vista.TxtCampo2.getText(),
                    vista.TxtCampo3.getText(),
                    vista.TxtCampo4.getText(),
                    vista.TxtCampo5.getText(),
                    vista.TxtCampo6.getText(),
                    null,
                    null,
                    Vistaprincipal.tempUsuario,
                    Vistaprincipal.tempSucrsal,
                    "1",
                    "1",
                    Utilitarios.Utilitario.nombreHost());

            for (int i = 0; i < cantidaRow; i++) {

                modelo.pInsertarRenglonesFacturaVenta(
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 0).toString(), // iReng_Num,
                        vista.txtNumFacturaVenta.getText(), // sDoc_Num, 
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 1).toString(), //sCo_Art,
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 2).toString(), //   sDes_Art,
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 4).toString(), //    sCo_Uni, 
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 2).toString(), // sSco_Uni,
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 3).toString(), //sCo_Alma,
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 7).toString(), // sCo_Precio,
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 5).toString(), // sTipo_Imp,
                        "0", // sTipo_Imp2, 
                        "0", // sTipo_Imp3,
                        Double.parseDouble(vista.jTablaFacturaVentaRenglon.getValueAt(i, 6).toString()), //   deTotal_Art,
                        "0", // deSTotal_Art,
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 7).toString(), // dePrec_Vta, 
                        "0", // sPorc_Desc,
                        vista.txtMontoDescuento.getText(), //   deMonto_Desc,
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 9).toString(), // deReng_Neto,
                        "0", //    dePendiente,
                        "0", //dePendiente2,
                        "0", //  deMonto_Desc_Glob, 
                        "0", // deMonto_reca_Glob,
                        "0", //  deOtros1_glob,
                        "0", // deOtros2_glob, 
                        "0", //  deOtros3_glob,
                        "0", // deMonto_imp_afec_glob,
                        "0", //  deMonto_imp2_afec_glob, 
                        "0", //    deMonto_imp3_afec_glob,
                        "FACT", //  sTipo_Doc,
                        //   "0", //  gRowguid_Doc,
                        "0", // sNum_Doc,
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 5).toString(), // dePorc_Imp,
                        "0", //  dePorc_Imp2,
                        "0", // dePorc_Imp3,
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 8).toString(), //   deMonto_Imp,
                        "0", //deMonto_Imp2,
                        "0", //   deMonto_Imp3,
                        "0", //  deOtros, 
                        "0", //deTotal_Dev, 
                        "0", // deMonto_Dev, 
                        vista.txtDescripcionFactVentas.getText(), // sComentario, 
                        "0", // sDis_Cen, 
                        Vistaprincipal.tempSucrsal, // sCo_Sucu_In, 
                        Vistaprincipal.tempUsuario, // sCo_Us_In,
                        "0", // sREVISADO, 
                        "0", //sTRASNFE,
                        Utilitario.nombreHost()//sMaquina
                //   "2" //lote_asignado
                );

               modelo.pStockActualizar(
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 3).toString(),//Co_Almacen
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 1).toString(),//Co_arti
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 4).toString(), //unidad
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 6).toString(), // CAntidad
                        "ACT", // Tipo de Stock
                        "0",//@bSumarStock
                        "0" //@bPermiteStockNegativo);
                );
            }

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                // vista.setterCampos();
                //  modeloTablaFacturaVentaRenglon.limpiarRengloTabla(cantidaRow);
            }
        } else if (event.getSource().equals(vista.btnactulizar)) {
            resultado = modelo.pActualizarFacturaVenta(
                    vista.txtNumFacturaVenta.getText(),//sDoc_Num, 
                    vista.txtNumFacturaVenta.getText(), //sDoc_NumOri, 
                    vista.txtDescripcionFactVentas.getText(),//sDescrip,
                    vista.txtcdiCliente.getText(), //sCo_Cli, 
                    vista.txtTransporte.getText(),// sCo_Tran,
                    vista.TxtMoneda.getText(),//sCo_Mone, 
                    vista.txtCuentIngEgr.getText(),// sCo_Cta_Ingr_Egr, 
                    vista.txtCodVendedor.getText(),//sCo_Ven, 
                    vista.TxtCodPago.getText(),//sCo_Cond, 
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaFacturaActual),//sdFec_Emis, 
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaVencimiento),//sdFec_Venc, 
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaRegistro),//sdFec_Reg, 
                    "0", //bAnulado, 
                    vista.txtStatus.getText(),// sStatus, 
                    vista.txtTasa.getText(), //deTasa, 
                    vista.txtNroControlFactVentura.getText(),//sN_Control, 
                    "4",// sNro_Doc,
                    "0",//sPorc_Desc_Glob, 
                    vista.txtMontoDescuento.getText(),//deMonto_Desc_Glob,
                    vista.txtRec.getText(), // sPorc_Reca, 
                    vista.TxtRec2.getText(), //deMonto_Reca, 
                    vista.txtSaldo.getText(),//deSaldo, 
                    vista.txtSubTotalBruto.getText(),// deTotal_Bruto, 
                    vista.txtImpuesto.getText(),//deMonto_Imp, 
                    "0",//deMonto_Imp2, 
                    "0",//deMonto_Imp3, 
                    "0",//deOtros1, 
                    "0",//deOtros2, 
                    "0", //deOtros3, 
                    vista.txtTotalNeto.getText(),//deTotal_Neto, 
                    "203", //sComentario, 
                    vista.TxtDireccionEntrega.getText(),// sDir_Ent, 
                    "1", //bContrib, 
                    "1", //bImpresa, 
                    "2", //sSalestax, 
                    "3",//sImpfis, 
                    "4", //sImpfisfac, 
                    "0", //bVen_Ter, 
                    "",//sDis_Cen, 
                    vista.TxtCampo1.getText(),
                    vista.TxtCampo2.getText(),
                    vista.TxtCampo3.getText(),
                    vista.TxtCampo4.getText(),
                    vista.TxtCampo5.getText(),
                    vista.TxtCampo6.getText(),
                    "",//sCampo7, 
                    "",//sCampo8, 
                    Vistaprincipal.nombreUsuario,//sCo_Us_Mo, 
                    Vistaprincipal.tempSucrsal,//sCo_Sucu_Mo, 
                    "1", //sRevisado, 
                    "1",//sTrasnfe, 
                    Utilitario.nombreHost(),//sMaquina, 
                    "ca" //sCampos
            );
            int cantidaRow = vista.jTablaFacturaVentaRenglon.getRowCount();
            System.out.println("Cantidad" + cantidaRow);
            for (int i = 0; i < cantidaRow; i++) {
//   Boolean bandera = m.pExisteFacturaVentaRenglon(1, "otro", "999", "VAL");
                Boolean bandera = modelo.pExisteFacturaVentaRenglon(
                        Integer.parseInt(
                                vista.jTablaFacturaVentaRenglon.getValueAt(i, 0).toString()),// renglon 
                        vista.txtNumFacturaVenta.getText(),// Numero de Documento 
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 1).toString(),// Codigo Articulo
                        vista.jTablaFacturaVentaRenglon.getValueAt(i, 3).toString()//Almacen
                );
                System.err.println("BANDERA " + bandera);
                
                if (bandera) {
                    System.out.println("Existe el Articulo en el Renglon " + vista.txtNumFacturaVenta.getText());
                    resultado = modelo.pActualizarRenglonesFacturaVenta(
                            Integer.parseInt(vista.jTablaFacturaVentaRenglon.getValueAt(i, 0).toString()),//@iReng_Num
                            vista.txtNumFacturaVenta.getText(), // sDoc_Num,
                            Integer.parseInt(vista.jTablaFacturaVentaRenglon.getValueAt(i, 0).toString()), // @iReng_NumOri
                            vista.txtNumFacturaVenta.getText(),//sDoc_NumOri,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 1).toString(),// sCo_Art,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 2).toString(),//sDes_Art,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 3).toString(), //sCo_Alma,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 4).toString(), // sCo_Uni,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 4).toString(), //sSco_Uni,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 7).toString(), //sCo_Precio,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 5).toString(),// sTipo_Imp,
                            "",//sTipo_Imp2,
                            "", //sTipo_Imp3,
                            Double.parseDouble(vista.jTablaFacturaVentaRenglon.getValueAt(i, 6).toString()), //@deTotal_Art
                            Double.parseDouble(vista.jTablaFacturaVentaRenglon.getValueAt(i, 6).toString()),//@deSTotal_Art
                            Double.parseDouble(vista.jTablaFacturaVentaRenglon.getValueAt(i, 7).toString()),//@dePrec_Vta
                            vista.txtDescuesto.getText(), //@sPorc_Desc
                            Double.parseDouble(vista.txtMontoDescuento.getText()), //@deMonto_Desc
                            Double.parseDouble(vista.jTablaFacturaVentaRenglon.getValueAt(i, 9).toString()), // @deReng_Neto
                            0, //@dePendiente
                            "FACT", //sTipo_Doc, 
                            vista.txtNumFacturaVenta.getText(),//sNum_Doc,
                            Double.parseDouble(vista.jTablaFacturaVentaRenglon.getValueAt(i, 5).toString()),//@dePorc_Imp
                            0,//@dePorc_Imp2
                            0,//@dePorc_Imp3
                            Double.parseDouble(vista.jTablaFacturaVentaRenglon.getValueAt(i, 8).toString()), //@deMonto_Imp
                            0, // @deMonto_Imp2
                            0, //@deMonto_Imp3
                            0,//@deOtros
                            0, //@deOtros1_Glob
                            0,//@deOtros2_Glob
                            0,//@deOtros3_Glob
                            0,//@deTotal_Dev
                            0,//@deMonto_Dev
                            "", //sComentario,
                            0,//@dePendiente2
                            0, //@deMonto_desc_glob
                            0,//@deMonto_reca_glob
                            0,//@deMonto_imp_afec_glob
                            0,//@deMonto_imp2_afec_glob
                            0, //@deMonto_imp3_afec_glob
                            null, //sDis_Cen,
                            Vistaprincipal.tempSucrsal,//sCo_Sucu_Mo,
                            Vistaprincipal.tempUsuario,//sCo_Us_Mo,
                            "0",//sREVISADO,
                            "0", //sTRASNFE,
                            Utilitario.nombreHost(),//sMaquina, 
                            "campo" //sCampos
                    );
                    System.out.println("Reesutado de la Actualizacion ::::::::: " + resultado);
//exec pStockActualizar @sCo_Alma='MAR',@sCo_Art='0101003',@sCo_Uni='UNI   ',@deCantidad=1,@sTipoStock='DES',@bSumarStock=1,@bPermiteStockNegativo=0

                } else {
                    System.out.println("TIENE QUE INSERTAR :::::::: " +vista.jTablaFacturaVentaRenglon.getValueAt(i, 0).toString());
                    modelo.pInsertarRenglonesFacturaVenta(
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 0).toString(), // iReng_Num,
                            vista.txtNumFacturaVenta.getText(), // sDoc_Num, 
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 1).toString(), //sCo_Art,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 2).toString(), //   sDes_Art,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 4).toString(), //    sCo_Uni, 
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 2).toString(), // sSco_Uni,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 3).toString(), //sCo_Alma,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 7).toString(), // sCo_Precio,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 5).toString(), // sTipo_Imp,
                            "0", // sTipo_Imp2, 
                            "0", // sTipo_Imp3,
                            Double.parseDouble(vista.jTablaFacturaVentaRenglon.getValueAt(i, 6).toString()), //   deTotal_Art,
                            "0", // deSTotal_Art,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 7).toString(), // dePrec_Vta, 
                            "0", // sPorc_Desc,
                            vista.txtMontoDescuento.getText(), //   deMonto_Desc,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 9).toString(), // deReng_Neto,
                            "0", //    dePendiente,
                            "0", //dePendiente2,
                            "0", //  deMonto_Desc_Glob, 
                            "0", // deMonto_reca_Glob,
                            "0", //  deOtros1_glob,
                            "0", // deOtros2_glob, 
                            "0", //  deOtros3_glob,
                            "0", // deMonto_imp_afec_glob,
                            "0", //  deMonto_imp2_afec_glob, 
                            "0", //    deMonto_imp3_afec_glob,
                            "FACT", //  sTipo_Doc,
                            //   "0", //  gRowguid_Doc,
                            "0", // sNum_Doc,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 5).toString(), // dePorc_Imp,
                            "0", //  dePorc_Imp2,
                            "0", // dePorc_Imp3,
                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 8).toString(), //   deMonto_Imp,
                            "0", //deMonto_Imp2,
                            "0", //   deMonto_Imp3,
                            "0", //  deOtros, 
                            "0", //deTotal_Dev, 
                            "0", // deMonto_Dev, 
                            vista.txtDescripcionFactVentas.getText(), // sComentario, 
                            "0", // sDis_Cen, 
                            Vistaprincipal.tempSucrsal, // sCo_Sucu_In, 
                            Vistaprincipal.tempUsuario, // sCo_Us_In,
                            "0", // sREVISADO, 
                            "0", //sTRASNFE,
                            Utilitario.nombreHost()//sMaquina
                    //   "2" //lote_asignado
                    );

                    System.out.println(""
                            + "Almacen :: " + vista.jTablaFacturaVentaRenglon.getValueAt(i, 3).toString()
                            + "Articulo :: " + vista.jTablaFacturaVentaRenglon.getValueAt(i, 1).toString()
                            + "Unidad :: " + vista.jTablaFacturaVentaRenglon.getValueAt(i, 4).toString()
                            + "Cantidad  :: " + vista.jTablaFacturaVentaRenglon.getValueAt(i, 6).toString()
                    );

//                    modelo.pStockActualizar(
//                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 3).toString(),//Co_Almacen
//                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 1).toString(),//Co_arti
//                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 4).toString(), //unidad
//                            vista.jTablaFacturaVentaRenglon.getValueAt(i, 6).toString(), // CAntidad
//                            "ACT", // Tipo de Stock
//                            "0",//@bSumarStock
//                            "0" //@bPermiteStockNegativo);
//                    );
                }

                /*   modelo.pEliminarRenglonesFacturaVenta(
                        vista.txtNumFacturaVenta.getText(),
                        i,
                        Vistaprincipal.tempUsuario,
                        Utilitario.nombreHost(),
                        Vistaprincipal.tempSucrsal*/
                //  );
            }

//            for (int i = 0; i < cantidaRow; i++) {
//            }
//            for (int i = 0; i < cantidaRow; i++) {
//            }
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                //vista.setterCampos();
            }
        } else if (event.getSource().equals(vista.btnEliminar)) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarFacturaVenta(
                        vista.txtNumFacturaVenta.getText(), // sDoc_NumOri,
                        Utilitarios.Utilitario.nombreHost(), // sMaquina, 
                        Vistaprincipal.tempUsuario, //sCo_Us_Mo, 
                        Vistaprincipal.tempSucrsal //sCo_Sucu_Mo
                );
                int cantidaRow = vista.jTablaFacturaVentaRenglon.getRowCount();

                for (int i = 0; i < cantidaRow; i++) {
                    modelo.pEliminarRenglonesFacturaVenta(
                            vista.txtNumFacturaVenta.getText(),
                            i,
                            Vistaprincipal.tempUsuario,
                            Utilitario.nombreHost(),
                            Vistaprincipal.tempSucrsal
                    );
                }
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.setterCampos();
                }
            } else {
                return;
            }

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setterCampos();
            }
        } else if (event.getSource().equals(vista.btnNuevo)) {
            vista.setterCampos();
            cargarDatosFacturaVentasRenglon(null);
            vista.desAnularFacturaVenta();
        } else if (event.getSource().equals(vista.btnImprimir)) {
            String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepFormatoFacturaVenta01.jasper";
            try {
                JasperReport reporte = null;
                Map parametro = new HashMap();
                String codDesde = vista.txtNumFacturaVenta.getText(),
                        codHasta = vista.txtNumFacturaVenta.getText();
                String criterio = null; // vistacolor.comboCriterio.getSelectedItem().toString().equals("Descendente") ? "DESC" : "ASC";

                if (codDesde.isEmpty() && codHasta.isEmpty()) {
                    codDesde = "nada";
                    codHasta = "nada";
                }

                parametro.put("cCo_Numero_d", codDesde);
                parametro.put("cCo_Numero_h", codHasta);
                reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                // reporte = (JasperReport) JRLoader.loadObject(getClass().getResource(ruta))   ;
                JasperPrint jprint = JasperFillManager.fillReport(ruta, parametro, conexion.conexions());
                JasperViewer view = new JasperViewer(jprint, false);
                view.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(ColorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (event.getSource().equals(vista.btnBuscar)) {

            cargarDatosEncabezadoFacturaVentas(
                    Vista.Vistaprincipal.tempEmpresa,
                    "safacturaVenta",
                    "co_cli",
                    "",
                    "2"
            );
            vista.jDialogFacturaVenta.setSize(510, 420);
            vista.jDialogFacturaVenta.setLocationRelativeTo(null);
            vista.jDialogFacturaVenta.setVisible(true);

        } else if (event.getSource().equals(this.vista.btnagregar)) {
            //falta por colocar varios renglones
            FacturaVentaRengBO facturaVentaRengBO = new FacturaVentaRengBO();
            int renglones = 0, ultimaFila = 0;
            ultimaFila = vista.jTablaFacturaVentaRenglon.getRowCount();
            if (vista.jTablaFacturaVentaRenglon.getRowCount() == 0) {
                renglones = +1;
            } else {
                renglones = Integer.parseInt(vista.jTablaFacturaVentaRenglon.getValueAt(vista.jTablaFacturaVentaRenglon.getRowCount() - 1, 0).toString()) + 1;
            }
            facturaVentaRengBO.setReng_num(renglones);
            facturaVentaRengBO.setDoc_num("");
            facturaVentaRengBO.setDes_art("");
            facturaVentaRengBO.setStotal_art(0);
            facturaVentaRengBO.setCo_precio(0.0);
            facturaVentaRengBO.setReng_neto(0);
            facturaVentaRengBO.setTipo_imp("0");

            modeloTablaFacturaVentaRenglon.addRow(facturaVentaRengBO);
        } else if (event.getSource().equals(vista.btnAceptarFactVenta)) {
            selection = vista.jtablaFacturaVenta.getSelectedRow();

            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                lista = modelo.pObtenerListadoDatos(
                        Vista.Vistaprincipal.tempEmpresa,
                        "safacturaVenta",
                        "doc_num",
                        vista.jtablaFacturaVenta.getValueAt(selection, 0).toString(), //sValor,
                        "3");

                int anulado = Integer.parseInt(lista.get(0).getAnulado());
                if (anulado == 1) {
                    vista.anularFactVenta();

                } else {
                    vista.desAnularFacturaVenta();
                    vista.btnactulizar.setEnabled(true);
                    vista.btnEliminar.setEnabled(true);
                }
                vista.txtNumFacturaVenta.setText(lista.get(0).getDoc_num());
                vista.txtDescripcionFactVentas.setText(lista.get(0).getDescrip());
                vista.txtcdiCliente.setText(lista.get(0).getCo_cli().replaceAll("\\s", ""));
                vista.txtDescripcionClientes.setText(lista.get(0).getDescripcionCliente());
                vista.TxtCodPago.setText(lista.get(0).getCo_cond().replaceAll("\\s", ""));
                vista.TxtDescripcionCodPago.setText(lista.get(0).getDescripcionCodPago());
                vista.txtCodVendedor.setText(lista.get(0).getCo_ven().replaceAll("\\s", ""));
                vista.TxtVendedor2.setText(lista.get(0).getDescripcionVendedor());
                //   vista.txtDescuesto.setText(lista.get(0).getDescrip());
                vista.txtNroControlFactVentura.setText(lista.get(0).getN_control());
                vista.txtTransporte.setText(lista.get(0).getCo_tran().replaceAll("\\s", ""));
                vista.TxtTransporte2.setText(lista.get(0).getDescripciontransporte());
                vista.TxtMoneda.setText(lista.get(0).getCo_mone());
                vista.TxtMoneda2.setText(lista.get(0).getDescripcionMoneda());
                vista.txtTasa.setText(lista.get(0).getTasaMoneda());
                vista.txtDescuesto.setText(lista.get(0).getPorc_desc_glob());
                vista.txtMontoDescuento.setText(lista.get(0).getMonto_desc_glob());
                vista.txtRec.setText(lista.get(0).getPorc_reca());
                vista.TxtRec2.setText(lista.get(0).getMonto_reca());
                vista.txtSaldo.setText(lista.get(0).getSaldo());
                vista.txtSubTotalBruto.setText(lista.get(0).getTotal_bruto());
                vista.txtTotalNeto.setText(lista.get(0).getTotal_neto());
                vista.txtImpuesto.setText(lista.get(0).getMonto_imp());
                listaMoneda = modeloMoneda.pObtenerFechaTasa(lista.get(0).getCo_mone().replaceAll("\\s", ""), Utilitario.optenerfecha(new Date()));

                vista.txtTasa.setText(listaMoneda.get(0).getTasa_v());
                cargarDatosFacturaVentasRenglon(lista.get(0).getDoc_num());
                vista.btnGuardar.setEnabled(false);

                vista.jDialogFacturaVenta.dispose();
                // vista.fechregistro.setDate(Utilitarios.Utilitario.obtenerFecha(listaarticulos.get(0).getFecha_reg()));
                vista.fechaRegistro.setDate(Utilitarios.Utilitario.obtenerFecha(lista.get(0).getFec_reg()));
                vista.fechaFacturaActual.setDate(Utilitarios.Utilitario.obtenerFecha(lista.get(0).getFec_emis()));
                vista.fechaVencimiento.setDate(Utilitarios.Utilitario.obtenerFecha(lista.get(0).getFec_venc()));
                cargarElValorIVA();
            }
        } else if (event.getSource().equals(vista.btnCancelarFacturaVen)) {
            vista.jDialogFacturaVenta.dispose();
        } else if (event.getSource().equals(this.vista.btnrestar)) {
            modeloTablaFacturaVentaRenglon.removedRow(vista.jTablaFacturaVentaRenglon.getSelectedRow());

        } else if (event.getSource().equals(vista.btnCancelarCliente)) {
            vista.jDialogCliente.dispose();
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
        } else if (event.getSource().equals(vista.btnCancelarVendedor)) {
            vista.jDialogVendedor.dispose();
        } else if (event.getSource().equals(vista.btnCancelarCondicionPag)) {
            vista.jDialogCondiicionPago.dispose();
        } //Selecciona el Articulo en el Renglon de la Factura ..
        else if (event.getSource().equals(vista.AceptarArticulo)) {
            int filaSeleccionada = vista.jtablaArticulos.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(null, "Debe Selecionar una Fila", "advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                String Articulo = vista.jtablaArticulos.getValueAt(filaSeleccionada, 0).toString();
                listaArticulo = new ArrayList<ArticulosBO>();
                listaArticulo = articuloModel.pObtenerListadoDatosArticulos(
                        Vistaprincipal.tempEmpresa,//sDatabase_Name
                        "co_art",//sField_Name
                        Articulo,//Valor
                        "0",// bAvanzada
                        "1",//bUsaOperadorLogicoAND
                        "0",//bAplica_Manejo_Lote
                        "0",//sManeja_Lote
                        "0",//bAplica_Manejo_Serial
                        "0",//sManeja_Serial
                        "0",//bAplica_EsInactivo
                        "0",//sEsInactivo
                        "0",//bAplica_Tipo
                        "V",//sTipo=V
                        "0",//bAplica_Co_Lin
                        "",//sCo_Lin
                        "0",//bAplica_Co_Subl
                        "",//sCo_Subl
                        "0",//bAplica_Co_Cat
                        "",//sCo_Cat
                        "0",//bAplica_Co_Color
                        "",// sCo_Color=N''
                        "0",//bAplica_Co_Proc=0
                        "",//sCo_Proc
                        "0",//bAplica_Co_Ubicacion=0
                        "",//sCo_Ubicacion=N''
                        "0",//bAplica_Item=0
                        "",//sItem=N''
                        "0",//bAplica_Ref=0
                        "",//sRef=N''
                        "2"//@iOpcion
                );
                System.out.println("seleccionar Renglon:: " + Articulo);
//                Utilitario u = new Utilitario();
                int tipoImpu = Utilitarios.Utilitario.optenerUltimoImp(Conection.Conexion.getCom(), Utilitario.optenerfecha(new Date()), listaArticulo.get(0).getTipo_imp());
                System.out.print("impuesto " + listaArticulo.get(0).getTipo_imp() + "  valor " + tipoImpu + " FILA TALA SELECCIONADA " + FILATABLAFACTURAVENTARENG);
                vista.jTablaFacturaVentaRenglon.setValueAt(listaArticulo.get(0).getCo_art(), FILATABLAFACTURAVENTARENG, 1);
                vista.jTablaFacturaVentaRenglon.setValueAt(listaArticulo.get(0).getArt_des(), FILATABLAFACTURAVENTARENG, 2);
                vista.jTablaFacturaVentaRenglon.setValueAt(listaArticulo.get(0).getCod_Almacen(), FILATABLAFACTURAVENTARENG, 3);
                vista.jTablaFacturaVentaRenglon.setValueAt(listaArtUnidad(Articulo).get(0).getCo_uni(), FILATABLAFACTURAVENTARENG, 4);
                vista.jTablaFacturaVentaRenglon.setValueAt(tipoImpu, FILATABLAFACTURAVENTARENG, 5);

                //   vista.jTablaFacturaVentaRenglon.re
                modeloTablaFacturaVentaRenglon.refrescarTable();
            }
            vista.jDialogArticulos.dispose();
        } else if (event.getSource().equals(vista.btnCancelarArticulo)) {
            vista.jDialogArticulos.dispose();
        } else if (event.getSource().equals(vista.btnAceptarAlmacenDialog)) {
            selection = vista.jtablaAlmacen.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                String cod_Almacen = vista.jtablaAlmacen.getValueAt(selection, 0).toString();
                ArrayList<AlmacenBO> listaAlamacen = almacenModelo.pObtenerListadoDatos(Vistaprincipal.lblNombreEmpresa.getText(), "saAlmacen", "Co_Alma", "", "2");

                //  System.out.println("FILA ALMACEN " + FILATABLAFACTURAVENTARENG + " VALOR  " + listaAlamacen.get(0).getCo_alma());
                vista.jTablaFacturaVentaRenglon.setValueAt(listaAlamacen.get(0).getCo_alma(), FILATABLAFACTURAVENTARENG, 3);
                modeloTablaFacturaVentaRenglon.refrescarTable();
            }
        } //Accion al Anular Una Factura de VEntas 
        else if (event.getSource().equals(vista.btnAnularVenta)) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea Anular esta Facatura", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                Utilitario.anularFactura(Conection.Conexion.getCom(), Vistaprincipal.tempEmpresa, "safacturaVenta", vista.txtNumFacturaVenta.getText());
                vista.anularFactVenta();
            }
        } else {
            return;
        }
    }

    @Override
    public void keyTyped(KeyEvent ke
    ) {
        //  throw new UnsupportedOperationException("Not suppadmin  
    }

    @Override
    public void keyPressed(KeyEvent ke
    ) {

        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        FILATABLAFACTURAVENTARENG = vista.jTablaFacturaVentaRenglon.getSelectionModel().getLeadSelectionIndex();
        COLUMNATABLAFACTURAVENTARENG = vista.jTablaFacturaVentaRenglon.getColumnModel().getSelectionModel().getLeadSelectionIndex();
        vista.FILA_jtablaventasreng = FILATABLAFACTURAVENTARENG;
        calCulosFacturaVenta();
        if (vista.txtBuscarArticulo.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String OpcionArt = "0", sfieldNameArt = "";
                if (vista.jRInicioArticulo.isSelected()) {
                    OpcionArt = "0";
                } else if (vista.jRFinalArticulo.isSelected()) {
                    OpcionArt = "1";
                } else if (vista.jrCualquierArticulo.isSelected()) {
                    OpcionArt = "2";
                } else if (vista.jRexactaArticulo.isSelected()) {
                    OpcionArt = "3";
                }
                sfieldNameArt = (vista.btngrupoBusqueCodigArticulo.isSelected()) ? "co_art" : "art_des";
                cargarDatosarticulos(
                        sfieldNameArt,
                        OpcionArt,
                        vista.txtBuscarArticulo.getText()
                );
            }
        } //evento key prees Enter txtBuscarFactVenta factura Venta 
        else if (vista.txtBuscarFactVenta.equals(ke.getSource())) {
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
                sfieldNameArt = (vista.jrCodigo2.isSelected()) ? "doc_num" : "co_cli";

                cargarDatosEncabezadoFacturaVentas(
                        Vista.Vistaprincipal.tempEmpresa,
                        "safacturaVenta",
                        sfieldNameArt,
                        vista.txtBuscarFactVenta.getText(),
                        OpcionFac
                );
            }
        } else if (vista.txtcdiCliente.equals(ke.getSource())) {
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
        } else if (COLUMNATABLAFACTURAVENTARENG == 0) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                //   FILATABLAFACTURAVENTARENG = vista.jTablaFacturaVentaRenglon.getSelectedRow();
                //Cargar Articulo al monmento de seleccionar el 
                cargarDatosarticulos("co_art", "2", "");
                vista.jDialogArticulos.setSize(472, 358);
                vista.jDialogArticulos.setLocationRelativeTo(null);
                vista.jDialogArticulos.setVisible(true);
//                  DialogoArticulos art = new DialogoArticulos(null, true);
//                art.setLocationRelativeTo(null);
//                art.setSize(555, 350);
//                art.setVisible(true);
            }
        }
        if (COLUMNATABLAFACTURAVENTARENG == 3) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                Utilitarios.Utilitario.MODULO_FACTURA_VENTAS = "FACTURAVENTA";
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
    public void keyReleased(KeyEvent ke
    ) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void cargarDatosEncabezadoFacturaVentas(
            String sDatabase_Nam,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        lista = modelo.pObtenerListadoDatos(
                sDatabase_Nam,
                sTable_Name,
                sField_Name,
                sValor,
                iOpcion);

        vista.jtablaFacturaVenta.setModel(new ModeloTablaFacturaVenta(lista));

//        "Admin_a", 
//              "safacturaVenta", "co_cli", "", "2"
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

    public void calCulosFacturaVenta() {
        double iva = 0.0;
        subTotatl = 0.0;
        totalNeto = 0;
        totalIva = 0;
        try {

//            ScriptEngineManager sen = new ScriptEngineManager();
//            ScriptEngine se = sen.getEngineByName("JavaScript");
            for (int i = 0; i < vista.jTablaFacturaVentaRenglon.getRowCount(); i++) {

                iva = Double.parseDouble(vista.jTablaFacturaVentaRenglon.getValueAt(i, 5).toString());
                System.out.println("IVA " + iva + "Fila" + i);
                cantidad = Double.parseDouble(vista.jTablaFacturaVentaRenglon.getValueAt(i, 6).toString());
                precio = Double.parseDouble(vista.jTablaFacturaVentaRenglon.getValueAt(i, 7).toString());
                neto = cantidad * precio;
                montoImpuesto = neto * iva / 100;
                subTotatl += neto;
                totalIva += montoImpuesto;

                vista.jTablaFacturaVentaRenglon.setValueAt(montoImpuesto, i, 8);
                vista.jTablaFacturaVentaRenglon.setValueAt(neto, i, 9);
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

//    public void descontarStock(String co_Almacen, String co_Articulo, String co_Unidad, String Cantidad, String TipoStock, String SumarStock, String bPermiteStockNegativo) {
//         se llama la SP actualizar Stock pStockActualizar 
//        exec pStockActualizar @sCo_Alma='VAL',@sCo_Art='0022',@sCo_Uni='pe    ',@deCantidad=10,@sTipoStock='ACT',@bSumarStock=1,@bPermiteStockNegativo=0
//        int resul = modelo.pStockActualizar(co_Almacen, co_Articulo, co_Unidad, Cantidad, TipoStock, SumarStock, bPermiteStockNegativo);
//        if (resul != 0) {
//            System.out.println("Se actualizo el Stock");
//        } else {
//            System.out.println("No Se actualizo el Stock");
//        }
//
//    }
    // Cargar los Datos de los renglones Facturas de las Ventas ..
    public void cargarDatosFacturaVentasRenglon(String nuFacturaVenta) {
        listaFacturaReng = modelo.pSeleccionarRenglonesFacturaVenta(nuFacturaVenta);
        modeloTablaFacturaVentaRenglon.setlistaFacturaVentas(listaFacturaReng);

        JTableHeader jTableHeader = vista.jTablaFacturaVentaRenglon.getTableHeader();
        jTableHeader.setDefaultRenderer(new GenionarEncabezado());
        vista.jTablaFacturaVentaRenglon.setTableHeader(jTableHeader);
        vista.jTablaFacturaVentaRenglon.setModel(modeloTablaFacturaVentaRenglon);
        modeloTablaFacturaVentaRenglon.refrescarTable();
    }

    public void cargarElValorIVA() {
        //  int tipoImpu = Utilitarios.Utilitario.optenerUltimoImp(Conection.Conexion.getCom(), Utilitario.optenerfecha(new Date()), listaArticulo.get(0).getTipo_imp());
        System.out.println("ESTE ES LA CANTIDAD  " + listaFacturaReng.size() + "  ESTE ES EL VALOR :::::::" + listaFacturaReng.get(0).getPorc_imp());

        for (int i = 0; i < listaFacturaReng.size(); i++) {
            vista.jTablaFacturaVentaRenglon.setValueAt(listaFacturaReng.get(i).getPorc_imp(), i, 5);
        }
    }

//    public static void main(String args[]) {
//        FacturaVentaController fact = new FacturaVentaController();
//        fact.calCulosFacturaVenta();
//    }
    public void cargarDatosarticulos(String sfieldName, String Opcion, String valor) {
        listaArticulo = articuloModel.pObtenerListadoDatosArticulos(
                Vistaprincipal.tempEmpresa,//sDatabase_Name
                sfieldName,//sField_Name
                valor,//Valor
                "0",// bAvanzada
                "1",//bUsaOperadorLogicoAND
                "0",//bAplica_Manejo_Lote
                "0",//sManeja_Lote
                "0",//bAplica_Manejo_Serial
                "0",//sManeja_Serial
                "0",//bAplica_EsInactivo
                "0",//sEsInactivo
                "0",//bAplica_Tipo
                "V",//sTipo=V
                "0",//bAplica_Co_Lin
                "",//sCo_Lin
                "0",//bAplica_Co_Subl
                "",//sCo_Subl
                "0",//bAplica_Co_Cat
                "",//sCo_Cat
                "0",//bAplica_Co_Color
                "",// sCo_Color=N''
                "0",//bAplica_Co_Proc=0
                "",//sCo_Proc
                "0",//bAplica_Co_Ubicacion=0
                "",//sCo_Ubicacion=N''
                "0",//bAplica_Item=0
                "",//sItem=N''
                "0",//bAplica_Ref=0
                "",//sRef=N''
                Opcion//@iOpcion
        );
        vista.jtablaArticulos.setModel(new ModelTablaArticulos(listaArticulo
        ));
    }

    public ArrayList<ArtUnidadBO> listaArtUnidad(String co_Art) {
        ArrayList<ArtUnidadBO> lista = null;
        lista = new ArtUnidadModel().pObtenerListadoDatosUnidad(
                Vistaprincipal.tempEmpresa,
                "saArtUnidad",
                "co_art",
                co_Art,
                "3");
        return lista;
    }

    public void eliminarFacturaVentaRenglon() {

    }

    //CArgar la Tabla saAlmacen
    public void cargartabla() {
        almacenModelo = new AlmacenModel();
        //exec pObtenerListadoDatos @sDatabase_Name=N'DEMOA',@sTable_Name=N'saAlmacen',@sField_Name=N'Co_Alma',@sValor=N'002',@iOpcion=2
        vista.jtablaAlmacen.setModel(new ModeloTablaAlmacen(almacenModelo.pObtenerListadoDatos(Vistaprincipal.lblNombreEmpresa.getText(), "saAlmacen", "Co_Alma", "", "2")));
    }
}
