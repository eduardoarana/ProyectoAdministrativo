/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.AjustesESBO;
import Beans.SaAjustesBO;
import Beans.TipoAjusteBO;
import Beans.SaAjusteRengBO;
import Conection.Conexion;
import Model.AjusteESModel;
import Model.ModeloTablaAjuste;
import Model.ModeloTablaAjustesEntradaSalidaRenglon;
import Model.StockModelo;
import Model.StockxAlmacenModel;
import Model.TipoAjusteModelo;
import Utilitarios.Utilitario;
import Vista.VistaAjustesES;
import Vista.Vistaprincipal;
import VistaDialogos.DialogUnidad;
import VistaDialogos.DialogoAlmacen;
import VistaDialogos.DialogoArticulos;
import VistaDialogos.DialogoMonedas;
import VistaDialogos.DialogoTipoAjustes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
 * @author earana
 */
public class AjustesESController implements ActionListener, KeyListener {

    VistaAjustesES vista;
    AjusteESModel modelo;
    TipoAjusteModelo tipoAjusteModelo;
    String cantidad = "", total = "";
    Double montoTotal;
    double totalStock = 0, costoTotal = 0;
    private int cantidadListRengl = 0;
    int fila = 0;
    ArrayList<TipoAjusteBO> lista = new ArrayList<>();

    ModeloTablaAjustesEntradaSalidaRenglon modeloTablaAjustesEntradaSalidaRenglon = new ModeloTablaAjustesEntradaSalidaRenglon();
    StockxAlmacenModel stockModelo;
    public Conexion conexion;

    public AjustesESController(VistaAjustesES vista) {
        this.vista = vista;
        modelo = new AjusteESModel();
        tipoAjusteModelo = new TipoAjusteModelo();
        stockModelo = new StockxAlmacenModel();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == this.vista.btnGuardar) {
            int cantidadRows = vista.jtableAjusteES.getRowCount();
            vista.COLUMN_jtableAjusteES = vista.jtableAjusteES.getColumnModel().getSelectionModel().getLeadSelectionIndex();
            System.out.println("fila  :: " + vista.FILA_jtableAjusteES);
            System.out.println("Columna :: " + vista.COLUMN_jtableAjusteES);

            if (vista.txtajue_num.getText().isEmpty()) {
                // JOptionPane.showMessageDialog(vista, this, total, fila, icon);
                System.out.println("uno de los Campos esta vacio ");

                JOptionPane.showMessageDialog(new JFrame(), "No ha puede estar vacio el campo numero de ajuste", "Software", JOptionPane.INFORMATION_MESSAGE);
                // vista.lblValidacionNumAjuste.setVisible(true);
                return;
            }

            for (int i = 0; i < cantidadRows; i++) {
                System.out.println("recorriendo la fila  :" + VistaAjustesES.jtableAjusteES.getValueAt(i, 1).toString());
                if (vista.jtableAjusteES.getValueAt(i, 1).equals("")) {
                    JOptionPane.showMessageDialog(new JFrame(), "No  puede estar vacio el campo Tipo", "Software", JOptionPane.INFORMATION_MESSAGE);

                    return;
                } else if (vista.jtableAjusteES.getValueAt(i, 2).equals("")) {
                    JOptionPane.showMessageDialog(new JFrame(), "No  puede estar vacio el campo Articulo", "Software", JOptionPane.INFORMATION_MESSAGE);
                    return;
                } else if (vista.jtableAjusteES.getValueAt(i, 5).equals("")) {
                    JOptionPane.showMessageDialog(new JFrame(), "No  puede estar vacio el campo Almacen", "Software", JOptionPane.INFORMATION_MESSAGE);
                    return;
                } else if (vista.jtableAjusteES.getValueAt(i, 6).equals("")) {
                    JOptionPane.showMessageDialog(new JFrame(), "No  puede estar vacio el campo Unidad", "Software", JOptionPane.INFORMATION_MESSAGE);
                    return;
                } else if (vista.jtableAjusteES.getValueAt(i, 7).equals("0.0")) {
                    JOptionPane.showMessageDialog(new JFrame(), "Cantidad no  puede estar en cero", "Software", JOptionPane.INFORMATION_MESSAGE);
                    return;
                } else if (vista.jtableAjusteES.getValueAt(i, 8).equals("0.0")) {
                    JOptionPane.showMessageDialog(new JFrame(), "Monto no  puede estar en cero", "Software", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            //Guardar en la tabla pInsertarAjusteEntradaSalida saAjuste
            //pruguntar si existe el registro ?
            ArrayList<SaAjustesBO> listaExite = modelo.pObtenerListadoDatos(Vistaprincipal.tempEmpresa, "saAjuste", "ajue_num", vista.txtajue_num.getText(), "3");
            if (listaExite.size() > 0) {
                modelo.pActualizarAjusteEntradaSalida(
                        vista.txtajue_num.getText(), //sAjue_Num
                        vista.txtajue_num.getText(),//sAjue_NumOrig
                        Utilitario.obtenerFecha(vista.sdFecha),//Utilitario.obtenerFecha(vista.sdFecha),// sdFecha
                        vista.txtDescripcion.getText(), // sMotivo
                        vista.txtTasa.getText(),//deTasa
                        vista.txtMoneda.getText(),// sCo_Mone
                        null,//sDis_Cen
                        "0",//bAnulado
                        vista.txtInvFisico.getText(),//sCo_InvFisico
                        null, //deAux01
                        null,//sAux02
                        vista.txtCampo1.getText(),
                        vista.txtCampo2.getText(),
                        vista.txtCampo3.getText(),
                        vista.txtCampo4.getText(),
                        vista.txtCampo5.getText(),
                        vista.txtCampo6.getText(),
                        vista.txtCampo7.getText(),
                        vista.txtCampo8.getText(),
                        Vistaprincipal.lblNombreUsuario1.getText(), //sCo_Us_Mo
                        Vistaprincipal.lblNombreSucursal.getText(), // sCo_Sucu_Mo
                        Utilitario.nombreHost(),// sMaquina
                        null,// sCampos
                        null,//sRevisado
                        null,// sTrasnfe
                        ""//tsValidador
                );

            } else {
                resultado = modelo.pInsertarAjusteEntradaSalida(
                        vista.txtajue_num.getText().replaceAll("\\s", ""),// Num Ajuste,
                        VistaAjustesES.txtMoneda.getText(),//Sco_Mone
                        vista.txtDescripcion.getText(), //motivo
                        Utilitarios.Utilitario.obtenerFecha(vista.sdFecha), //fecha
                        vista.txtTasa.getText(),//tasa
                        "1",//Anulado
                        vista.txtInvFisico.getText(),//InvFisico 
                        "1",// Auxiliar
                        "2",//sAux02
                        "s", //sDis_Cen
                        vista.txtCampo1.getText(),//sCampo1 
                        vista.txtCampo2.getText(),//sCampo2
                        vista.txtCampo3.getText(),
                        vista.txtCampo4.getText(),
                        vista.txtCampo5.getText(),
                        vista.txtCampo6.getText(),
                        vista.txtCampo7.getText(),
                        vista.txtCampo8.getText(),
                        Vistaprincipal.lblNombreUsuario1.getText(),//sCo_Us_In
                        Vistaprincipal.lblNombreSucursal.getText(),//sCo_Sucu_In
                        Utilitarios.Utilitario.nombreHost(),
                        "",//sRevisado
                        ""//@sTrasnfe
                );
            }
            if (resultado != 0) {
                System.out.println("Guardado pInsertarAjusteEntradaSalida " + resultado);
            }
            for (int i = 0; i < cantidadRows; i++) {

                // Actualizar Stok por Almacen           
                //           exec pStockActualizar @sCo_Alma='VAL',@sCo_Art='0101002',@sCo_Uni='BULTO ',@deCantidad=5,@sTipoStock='ACT',@bSumarStock=1,@bPermiteStockNegativo=1 
                //exec pStockActualizar @sCo_Alma='VAL',@sCo_Art='0101001',@sCo_Uni='KL    ',
                //@deCantidad=6,@sTipoStock='ACT',@bSumarStock=1,@bPermiteStockNegativo=1
//                  int resultado = m.pStockActualizar("VAL", "carro", "uni", "4", "ACT", "1", "1");
                resultado =stockModelo.pStockActualizar(
                        vista.jtableAjusteES.getValueAt(i, 5).toString(),//sCo_Alma
                        vista.jtableAjusteES.getValueAt(i, 2).toString(),// cod Articulo
                        vista.jtableAjusteES.getValueAt(i, 6).toString(), //Unidad
                        Integer.parseInt(vista.jtableAjusteES.getValueAt(i, 7).toString()),// cantidad
                        "ACT",
                        1,
                        0);
                
                System.out.println("ACTUALIZAR STOCK ALAMACEN"+resultado );
                
//                int resultadoStockAlmacen = stockModelo.pInsertarStockAlmacen(
//                        vista.jtableAjusteES.getValueAt(i, 5).toString(), //@sco_alma
//                        vista.jtableAjusteES.getValueAt(i, 2).toString(), //co_art
//                        "ACT",//stipo
//                        Integer.parseInt(vista.jtableAjusteES.getValueAt(i, 7).toString()), //sStock
//                        null, //sRevisado
//                        null //sTrasnfe
//                );

//                System.out.println("RESULTADO STOCK ALMACEN  pInsertarStockAlmacen :::: " + resultadoStockAlmacen);

                resultado = modelo.pInsertarRenglonesAjusteEntradaSalida(
                        vista.txtajue_num.getText(),//sAjue_Num
                        vista.jtableAjusteES.getValueAt(i, 0).toString(),// iReng_Num,
                        vista.jtableAjusteES.getValueAt(i, 1).toString(),//sCo_Tipo
                        vista.jtableAjusteES.getValueAt(i, 2).toString(), //sCo_Art,
                        vista.jtableAjusteES.getValueAt(i, 5).toString(),// sCo_Alma,
                        vista.jtableAjusteES.getValueAt(i, 6).toString(), //sCo_Uni,
                        null,//sSco_Uni,
                        null, //sDis_cen,
                        vista.jtableAjusteES.getValueAt(i, 7).toString(),//deTotal_Art,
                        "0", //deStotal_Art,
                        vista.jtableAjusteES.getValueAt(i, 8).toString(),//deCost_Unit,
                        "0",//deCosto_Adi1,
                        "0",//deCosto_Adi2,
                        "0",//deCosto_Adi3,
                        Vistaprincipal.lblNombreUsuario1.getText(),//sCo_Us_In,
                        Utilitarios.Utilitario.nombreHost(),//sMaquina,
                        Vistaprincipal.lblNombreSucursal.getText(),//sCo_Sucu_In,
                        "1",//sRevisado,
                        "0"//sTrasnfe
                );
                //limpiar la tabla 
//                for (int j = 0; j < cantidadRows; j++) {
//                    modeloTablaAjustesEntradaSalidaRenglon.removedRow(j);
//                }
            }
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
                modeloTablaAjustesEntradaSalidaRenglon.limpiarRengloTabla(cantidadRows);
            }

        } else if (event.getSource().equals(this.vista.btnactulizar)) {

            System.out.println("FECHA :::::::" + Utilitario.obtenerFecha(vista.sdFecha));
            resultado = modelo.pActualizarAjusteEntradaSalida(
                    vista.txtajue_num.getText(), //sAjue_Num
                    vista.txtajue_num.getText(),//sAjue_NumOrig
                    Utilitario.obtenerFecha(vista.sdFecha),//Utilitario.obtenerFecha(vista.sdFecha),// sdFecha
                    vista.txtDescripcion.getText(), // sMotivo
                    vista.txtTasa.getText(),//deTasa
                    vista.txtMoneda.getText(),// sCo_Mone
                    null,//sDis_Cen
                    "0",//bAnulado
                    vista.txtInvFisico.getText(),//sCo_InvFisico
                    null, //deAux01
                    null,//sAux02
                    vista.txtCampo1.getText(),
                    vista.txtCampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtCampo4.getText(),
                    vista.txtCampo5.getText(),
                    vista.txtCampo6.getText(),
                    vista.txtCampo7.getText(),
                    vista.txtCampo8.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText(), //sCo_Us_Mo
                    Vistaprincipal.lblNombreSucursal.getText(), // sCo_Sucu_Mo
                    Utilitario.nombreHost(),// sMaquina
                    null,// sCampos
                    null,//sRevisado
                    null,// sTrasnfe
                    ""//tsValidador
            );
            // Actualizar AjustesEntada y Salida de renglons
            int cantidadRows = vista.jtableAjusteES.getRowCount();
            int resu = Utilitario.eliminarRegistro(
                    Conection.Conexion.getCom(),
                    Vistaprincipal.tempEmpresa, "saAjusteReng",
                    "ajue_num",
                    vista.txtajue_num.getText()
            );

            System.out.println("Eliminacion del registro)" + resu);

            for (int i = 0; i < cantidadRows; i++) {
                modelo.pInsertarRenglonesAjusteEntradaSalida(
                        vista.txtajue_num.getText(),//sAjue_Num
                        vista.jtableAjusteES.getValueAt(i, 0).toString(),// iReng_Num,
                        vista.jtableAjusteES.getValueAt(i, 1).toString(),//sCo_Tipo
                        vista.jtableAjusteES.getValueAt(i, 2).toString(), //sCo_Art,
                        vista.jtableAjusteES.getValueAt(i, 5).toString(),// sCo_Alma,
                        vista.jtableAjusteES.getValueAt(i, 6).toString(), //sCo_Uni,
                        null,//sSco_Uni,
                        null, //sDis_cen,
                        vista.jtableAjusteES.getValueAt(i, 7).toString(),//deTotal_Art,
                        "0", //deStotal_Art,
                        vista.jtableAjusteES.getValueAt(i, 8).toString(),//deCost_Unit,
                        "0",//deCosto_Adi1,
                        "0",//deCosto_Adi2,
                        "0",//deCosto_Adi3,
                        Vistaprincipal.lblNombreUsuario1.getText(),//sCo_Us_In,
                        Utilitarios.Utilitario.nombreHost(),//sMaquina,
                        Vistaprincipal.lblNombreSucursal.getText(),//sCo_Sucu_In,
                        "1",//sRevisado,
                        "0"//sTrasnfe
                );
                System.out.println("CANTIDAD :::::::"+vista.jtableAjusteES.getValueAt(i, 7).toString());
                resultado =stockModelo.pStockActualizar(
                        vista.jtableAjusteES.getValueAt(i, 5).toString(),//sCo_Alma
                        vista.jtableAjusteES.getValueAt(i, 2).toString(),// cod Articulo
                        vista.jtableAjusteES.getValueAt(i, 6).toString(), //Unidad
                        Double.parseDouble(vista.jtableAjusteES.getValueAt(i, 7).toString()),// cantidad
                        "ACT",
                        1,
                        0);
            }

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();

                modeloTablaAjustesEntradaSalidaRenglon.limpiarRengloTabla(getCantidadListRengl());
                //    modeloTablaAjustesEntradaSalidaRenglon.limpiarRengloTabla(getCantidadListRengl());
            }
        } else if (event.getSource().equals(this.vista.btnEliminar)) {
            String numAjuste = vista.txtajue_num.getText();
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarAjusteEntradaSalida(
                        numAjuste,
                        Utilitario.nombreHost(),
                        Vistaprincipal.lblNombreUsuario1.getText(),
                        Vistaprincipal.lblNombreSucursal.getText());
                Utilitario.eliminarRegistro(Conection.Conexion.getCom(), Vistaprincipal.tempEmpresa, "saAjusteReng", "ajue_num", numAjuste);

                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.settearCampos();

                }
            } else {
                return;
            }
            cargarDatosAjustesESrenglon(null);
        } else if (event.getSource().equals(this.vista.btnImprimirAjuste)) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepFormatoAjEntraSa.jasper";
                Map parametro = new HashMap();
                parametro.put("sNum_Ajuste_d", null);
                parametro.put("sNum_Ajuste_h", null);
                parametro.put("sCo_Sucursal", null);
                parametro.put("sCampOrderBy", "DESC");
                parametro.put("sDir", null);
                parametro.put("bHeaderRep", "0");
                JasperReport reporte = null;
                reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                // reporte = (JasperReport) JRLoader.loadObject(getClass().getResource(ruta))   ;
                JasperPrint jprint = JasperFillManager.fillReport(ruta, parametro, conexion.conexions());
                JasperViewer view = new JasperViewer(jprint, false);
                view.setVisible(true);
            } catch (JRException ex) {
                ex.printStackTrace();
            }
        } else if (event.getSource().equals(this.vista.btnNuevo)) {
            vista.settearCampos();
            cargarDatosAjustesESrenglon(null);
            modeloTablaAjustesEntradaSalidaRenglon.limpiarRengloTabla(getCantidadListRengl());
        } else if (event.getSource().equals(this.vista.btnagregar)) {
            int ultimaFila = 0, renglones=0;
            ultimaFila = vista.jtableAjusteES.getRowCount();
            if (vista.jtableAjusteES.getRowCount() == 0) {
                renglones = +1;
            } else {
                renglones = Integer.parseInt(vista.jtableAjusteES.getValueAt(vista.jtableAjusteES.getRowCount() - 1, 0).toString()) + 1;
            }
            
            modeloTablaAjustesEntradaSalidaRenglon.refrescarTable();
            SaAjusteRengBO ajustes = new SaAjusteRengBO();
            ajustes.setReng_num(String.valueOf(renglones));
            ajustes.setAjue_num("");
            ajustes.setCo_tipo("");
            ajustes.setCo_art("");
            ajustes.setArt_des("");
            ajustes.setModelo("");
            ajustes.setCo_alma("");
            ajustes.setCo_uni("");
            ajustes.setCost_unit("0.0");
            ajustes.setCantidad("0.0");
            // ajustes.setCostoTotal(0.0);//tipo Double
            modeloTablaAjustesEntradaSalidaRenglon.addRow(ajustes);
            modeloTablaAjustesEntradaSalidaRenglon.refrescarTable();

        } else if (event.getSource().equals(this.vista.btnrestar)) {
            modeloTablaAjustesEntradaSalidaRenglon.removedRow(vista.jtableAjusteES.getSelectedRow());

        } else if (event.getSource().equals(this.vista.btnRefrescar)) {

            System.out.println("btnRefrescar");

            modeloTablaAjustesEntradaSalidaRenglon.refrescarTable();
            System.out.println("Cantidad lista" + getCantidadListRengl());
        } else if (event.getSource().equals(this.vista.btnBuscar)) {

            cargarDatosAjustes(Vistaprincipal.tempEmpresa, "saAjuste", "motivo", "", "2");
            vista.jDialogAjustes.setSize(555, 350);
            vista.jDialogAjustes.setLocationRelativeTo(null);
            vista.jDialogAjustes.setVisible(true);

        } else if (event.getSource().equals(this.vista.btnAceptarAjustes)) {
            int selection = vista.jtablaAjustes.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                System.out.println("vista.jtablaAjustes.getValueAt(selection, 0).toString()" + vista.jtablaAjustes.getValueAt(selection, 0).toString());
                ArrayList<SaAjustesBO> lista
                        = modelo.pObtenerListadoDatos(
                                Vistaprincipal.tempEmpresa,// @sDatabase_Name
                                "saAjuste",//@sTable_Name
                                "ajue_num",// @sField_Name
                                vista.jtablaAjustes.getValueAt(selection, 0).toString(), // @sValor
                                "3" // @iOpcion
                        );
                vista.txtajue_num.setText(lista.get(0).getAjue_num().replaceAll("\\s", ""));
                vista.txtDescripcion.setText(lista.get(0).getMotivo());
                vista.txtInvFisico.setText(lista.get(0).getCo_invfisico().replaceAll("\\s", ""));
                VistaAjustesES.txtMoneda.setText(lista.get(0).getCo_mone());
                vista.txtTasa.setText(lista.get(0).getTasa());
                vista.txtCampo1.setText(lista.get(0).getCampo1());
                vista.txtCampo2.setText(lista.get(0).getCampo2());
                vista.txtCampo3.setText(lista.get(0).getCampo3());
                vista.txtCampo4.setText(lista.get(0).getCampo4());
                vista.txtCampo5.setText(lista.get(0).getCampo5());
                vista.txtCampo6.setText(lista.get(0).getCampo6());
                vista.txtCampo7.setText(lista.get(0).getCampo7());
                vista.txtCampo8.setText(lista.get(0).getCampo8());
                vista.sdFecha.setDate(Utilitarios.Utilitario.obtenerFecha(lista.get(0).getFecha()));
                vista.txtSucursalAjuste.setText(lista.get(0).getCo_sucu_in());
                //vista.txtValidador.setText(lista.get(0).getValidador());
                cargarDatosAjustesESrenglon(vista.jtablaAjustes.getValueAt(selection, 0).toString());
                modeloTablaAjustesEntradaSalidaRenglon.refrescarTable();
                vista.jDialogAjustes.dispose();
            }
            modeloTablaAjustesEntradaSalidaRenglon.refrescarTable();
            vista.btnactulizar.setEnabled(true);
            vista.btnEliminar.setEnabled(true);
            vista.btnGuardar.setEnabled(false);
            calculoTotalStock();
        } else if (event.getSource().equals(this.vista.btnCancelarAjustes)) {
            vista.jDialogAjustes.dispose();
        }
    }

    public void cargarDatosAjustes(String sDatabase_Nam, String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        vista.jtablaAjustes.setModel(new ModeloTablaAjuste(
                modelo.pObtenerListadoDatos(
                        sDatabase_Nam,// @sDatabase_Name
                        sTable_Name,//@sTable_Name
                        sField_Name,// @sField_Name
                        sValor, // @sValor
                        iOpcion // @iOpcion
                )));
    }

    public void cargarDatosAjustesESrenglon(String num_Ajuste) {
        ArrayList<SaAjusteRengBO> lista = new ArrayList<>();
        lista = modelo.pSeleccionarRenglonesAjusteEntradaSalida(num_Ajuste);
        modeloTablaAjustesEntradaSalidaRenglon.setlistaAjustesES(lista);
        vista.jtableAjusteES.setModel(modeloTablaAjustesEntradaSalidaRenglon);
        modeloTablaAjustesEntradaSalidaRenglon.refrescarTable();
        setCantidadListRengl(lista.size());
    }

    @Override
    public void keyTyped(KeyEvent ke) {
//        montoTotal = Double.parseDouble(cantidad) * Double.parseDouble(total);

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        vista.FILA_jtableAjusteES = vista.jtableAjusteES.getSelectionModel().getLeadSelectionIndex();
        vista.COLUMN_jtableAjusteES = vista.jtableAjusteES.getColumnModel().getSelectionModel().getLeadSelectionIndex();

        if (vista.FILA_jtableAjusteES != -1) {
//            cantidad = vista.jtableAjusteES.getValueAt(vista.FILA_jtableAjusteES, 7).toString();
//            total = vista.jtableAjusteES.getValueAt(vista.FILA_jtableAjusteES, 8).toString();
//            montoTotal = Double.parseDouble(cantidad) * Double.parseDouble(total);
//            System.out.println("montoTotal  fila  : " + montoTotal);
//            montoTotal = Double.parseDouble(cantidad) * Double.parseDouble(total);
//            vista.jtableAjusteES.setValueAt(montoTotal, vista.FILA_jtableAjusteES, 9);
            calculoTotalStock();
        }

        if (ke.getKeyCode() == KeyEvent.VK_F2) {
            System.out.println("Evento :");
            // vista.FILA_jtableAjusteES = vista.jtableAjusteES.getSelectionModel().getLeadSelectionIndex();
            //  vista.COLUMN_jtableAjusteES = vista.jtableAjusteES.getColumnModel().getSelectionModel().getLeadSelectionIndex();

//            cantidad = vista.jtableAjusteES.getValueAt(vista.FILA_jtableAjusteES, 7).toString();
//            total = vista.jtableAjusteES.getValueAt(vista.FILA_jtableAjusteES, 8).toString();
//            montoTotal = Double.parseDouble(cantidad) * Double.parseDouble(total);
//            System.out.println("montoTotal  fila  : " + montoTotal);
//            vista.jtableAjusteES.setValueAt(montoTotal, vista.FILA_jtableAjusteES, 9);
            //Evento de la columna 1 .
            if (vista.COLUMN_jtableAjusteES == 1) {
                validar(vista.FILA_jtableAjusteES, vista.COLUMN_jtableAjusteES);
                DialogoTipoAjustes tipoAjustes = new DialogoTipoAjustes(null, true);
                tipoAjustes.setLocationRelativeTo(null);
                tipoAjustes.setSize(555, 350);
                tipoAjustes.setVisible(true);

            }//Evento en la columna 2 
            else if (vista.COLUMN_jtableAjusteES == 2) {
                DialogoArticulos art = new DialogoArticulos(null, true);
                art.setLocationRelativeTo(null);
                art.setSize(555, 350);
                art.setVisible(true);
//                 vista.JDialogoArticulos.setVisible(true);
//                 vista.JDialogoArticulos.setSize(555, 350);
//                 vista.JDialogoArticulos.setLocationRelativeTo(null);
            } else if (vista.COLUMN_jtableAjusteES == 5) {
                Utilitario.MODULO_FACTURA_VENTAS = "AJUSTESES";
                DialogoAlmacen vistaAlmacen = new DialogoAlmacen(null, true);
                vistaAlmacen.setLocationRelativeTo(null);
                vistaAlmacen.setSize(555, 350);
                vistaAlmacen.setVisible(true);
            } else if (vista.COLUMN_jtableAjusteES == 6) {
                DialogUnidad vistaunidad = new DialogUnidad(null, true);
                vistaunidad.setLocationRelativeTo(null);
                vistaunidad.setSize(555, 350);
                vistaunidad.setVisible(true);

            } else if (vista.COLUMN_jtableAjusteES == 8) {
                total = vista.jtableAjusteES.getValueAt(vista.FILA_jtableAjusteES, 8).toString();
                montoTotal = Double.parseDouble(cantidad) * Double.parseDouble(total);
            } else if (vista.txtMoneda.equals(ke.getSource())) {
                DialogoMonedas dialogoMonedas = new DialogoMonedas(null, true);
                dialogoMonedas.setLocationRelativeTo(null);
                dialogoMonedas.setSize(555, 350);
                dialogoMonedas.setVisible(true);
            }
        } else if (vista.txtBuscarAjustes == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {

                String Opcion2 = "0", sfieldName2 = "";
                if (vista.jRInicio2.isSelected()) {
                    Opcion2 = "0";
                } else if (vista.jRFinal2.isSelected()) {
                    Opcion2 = "1";
                } else if (vista.jrCualquier2.isSelected()) {
                    Opcion2 = "2";
                } else if (vista.jRexacta2.isSelected()) {
                    Opcion2 = "3";
                }
                sfieldName2 = (vista.jrCodigo2.isSelected()) ? "ajue_num" : "motivo";
                cargarDatosAjustes(Vistaprincipal.tempEmpresa,
                        "saAjuste",
                        sfieldName2,
                        vista.txtBuscarAjustes.getText(),
                        Opcion2);
            }
        }
//        total = vista.jtableAjusteES.getValueAt(vista.FILA_jtableAjusteES, 8).toString();
//        montoTotal = Double.parseDouble(cantidad) * Double.parseDouble(total);
//        vista.jtableAjusteES.setValueAt(montoTotal, vista.FILA_jtableAjusteES, 9);
        //  vista.jtableAjusteES.setValueAt(montoTotal, vista.FILA_jtableAjusteES, 9);
    }

    @Override
    public void keyReleased(KeyEvent ke) {

//        total = vista.jtableAjusteES.getValueAt(vista.FILA_jtableAjusteES, 8).toString();
//        montoTotal = Double.parseDouble(cantidad) * Double.parseDouble(total);
//        vista.jtableAjusteES.setValueAt(montoTotal, vista.FILA_jtableAjusteES, 9);
    }

    public void calculoTotalStock() {
        totalStock = 0;
        costoTotal = 0;

        for (int i = 0; i < vista.jtableAjusteES.getRowCount(); i++) {
            //obtener tipo de Ajuste si es de Entrada de lo contrario es de Salida y Resta 
            lista = tipoAjusteModelo.listaTipoAjuste(vista.jtableAjusteES.getValueAt(i, 1).toString().replaceAll("\\s", ""));

            cantidad = vista.jtableAjusteES.getValueAt(i, 7).toString();
            total = vista.jtableAjusteES.getValueAt(i, 8).toString();
            montoTotal = Double.parseDouble(cantidad) * Double.parseDouble(total);
            vista.jtableAjusteES.setValueAt(montoTotal, i, 9);

            if (lista.size() != 0) {
                //Verifica el tipo de entrada es igual a Cero y va Sumando 
                if (Integer.parseInt(lista.get(0).getTipo_trans()) == 0) {
                    totalStock += Double.parseDouble(vista.jtableAjusteES.getValueAt(i, 7).toString());
                    costoTotal += Double.parseDouble(vista.jtableAjusteES.getValueAt(i, 9).toString());
                } else {
                    totalStock -= Double.parseDouble(vista.jtableAjusteES.getValueAt(i, 7).toString());
                    costoTotal -= Double.parseDouble(vista.jtableAjusteES.getValueAt(i, 9).toString());
                }
                VistaAjustesES.txtTotalSto.setText(String.valueOf(totalStock));
                VistaAjustesES.txtCostoTotal.setText(String.valueOf(costoTotal));
            }
        }
    }

    public int getCantidadListRengl() {
        return cantidadListRengl;
    }

    public void setCantidadListRengl(int cantidadListRengl) {
        this.cantidadListRengl = cantidadListRengl;
    }

    public void cargarElValorIVA() {
        //  int tipoImpu = Utilitarios.Utilitario.optenerUltimoImp(Conection.Conexion.getCom(), Utilitario.optenerfecha(new Date()), listaArticulo.get(0).getTipo_imp());
//        System.out.println("ESTE ES LA CANTIDAD  " + lista.size() + "  ESTE ES EL VALOR :::::::" + lista.get(0).get);

//        for (int i = 0; i < listaFacturaReng.size(); i++) {
//            vista.jTablaFacturaVentaRenglon.setValueAt(listaFacturaReng.get(i).getPorc_imp(), i, 5);
//        }
    }

    public boolean validar(int fila, int columna) {
        System.out.println("entrando al methodo Validar :::" + columna);
        String valor;
        if (vista.jtableAjusteES.getValueAt(fila, columna).toString().length() == 0) {
            System.out.println("Error, El valor es nulo");
            return false;
        } else {
            valor = (String) vista.jtableAjusteES.getValueAt(fila, columna);
            System.out.println("El valor no es nulo");
            return true;
        }
    }
}
