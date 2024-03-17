/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.ArtPrecioBO;
import Beans.ArtUbicacionBO;
import Beans.ArtUnidadBO;
import Beans.ArticulosBO;
import Beans.TipoPrecioBO;
import Conection.Conexion;
import Model.AlmacenModel;
import Model.ArtPrecioModel;
import Model.ArtUbicacionModel;
import Model.ArtUnidadModel;
import Model.ArticuloModel;
import Model.CategoriaModel;
import Model.ColorModel;
import Model.LineaModel;
import Model.ModelTablaArtUbicacionRenglones;
import Model.ModeloTablaAlmacen;
import Model.ModeloTablaArtPrecioRenglon;
import Model.ModeloTablaCategoria;
import Model.ModeloTablaColor;
import Model.ModeloTablaLinea;
import Model.ModeloTablaMoneda;
import Model.ModeloTablaStockxAlamacen;
import Model.ModeloTablaSubLinea;
import Model.ModeloTablaSucursal;
import Model.ModeloTablaTipoPrecio;
import Model.ModeloTablaUbicacion;
import Model.MonedaModel;
import Model.StockxAlmacenModel;
import Model.SublineaModel;
import Model.SucursalModelo;
import Model.TipoPrecioModelo;
import Model.UbicacionModel;
import Utilitarios.Utilitario;
import Vista.VistaArticulo;
import Vista.Vistaprincipal;
import static Vista.Vistaprincipal.lblNombreEmpresa;
import VistaDialogos.DialogReporteArticulos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Date;
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
public class ArticuloController implements ActionListener, KeyListener {

    VistaArticulo vista;
    ArticuloModel modelo;
    ArtPrecioModel artprecioModel;
    AlmacenModel almacenModel;
    ArtUbicacionModel artUbicacionModel;
    LineaModel lineaModel;
    SublineaModel sublineaModel;
    int seleccionado = 0;

    ArtUnidadModel artiunidadModel;
    ArrayList<ArticulosBO> listaarticulos;
    ArrayList<ArtUnidadBO> listaArtUnidadBO;
    String pPrimaria, primaria, restrinciones, nDecimales;
    ArtPrecioBO artPrecioBO;
    TipoPrecioModelo tipoPrecioModelo;
    int numeroCampo = 0;
    int sCampoUbicacion = 0;
    public int ubicacion = 0;
    public Conexion conexion;
    public ModeloTablaArtPrecioRenglon modeloTablaArtPrecioRenglon = new ModeloTablaArtPrecioRenglon();
    public ModelTablaArtUbicacionRenglones modeloartUbicacionRenglones = new ModelTablaArtUbicacionRenglones();

    public ArticuloController(VistaArticulo vista) {
        this.vista = vista;
        modelo = new ArticuloModel();
        artprecioModel = new ArtPrecioModel();
        artiunidadModel = new ArtUnidadModel();
        listaarticulos = new ArrayList<>();
        listaArtUnidadBO = new ArrayList<>();
        artUbicacionModel = new ArtUbicacionModel();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        String generico = "0", ManejaSerial = "", manejaLote = "", maneLoteVencido = "", tipoCosto = "", relacionUnidad = "";
        generico = (vista.jGenerico.isSelected()) ? "1" : "0";
        ManejaSerial = (vista.jseriales.isSelected()) ? "1" : "0";
        manejaLote = (vista.jutilizalotes.isSelected()) ? "1" : "0";
        maneLoteVencido = (vista.jvencidos.isSelected()) ? "1" : "0";

        if (vista.jCostoBase.getSelectedItem().toString().equals("ultimo costo")) {
            tipoCosto = "1";
        } else if (vista.jCostoBase.getSelectedItem().toString().equals("Reposicion")) {
            tipoCosto = "5";
        } else if (vista.jCostoBase.getSelectedItem().toString().equals("Proveedor")) {
            tipoCosto = "6";
        } else if (vista.jCostoBase.getSelectedItem().toString().equals("PEPS/UEPS")) {
            tipoCosto = "7";
        }
        String tipoImpo = vista.tipoImpuesto.getSelectedItem().toString();
        if (tipoImpo.equals("Tasa General")) {
            tipoImpo = "1";
        } else if (tipoImpo.equals("Tasa A1")) {
            tipoImpo = "2";
        } else if (tipoImpo.equals("Tasa A2")) {
            tipoImpo = "3";
        } else if (tipoImpo.equals("Tasa A3")) {
            tipoImpo = "4";
        } else if (tipoImpo.equals("Ventas Exentas")) {
            tipoImpo = "5";
        } else if (tipoImpo.equals("Compras Exentas")) {
            tipoImpo = "6";
        } else if (tipoImpo.equals("Exentos")) {
            tipoImpo = "7";
        } else if (tipoImpo.equals("Tasa A4")) {
            tipoImpo = "8";
        } else if (tipoImpo.equals("Tasa A5")) {
            tipoImpo = "9";
        }
        if (vista.jRadioManejaPrimaria.isSelected()) {
            relacionUnidad = "0";
        } else {
            relacionUnidad = "1";
        }

        if (event.getSource() == this.vista.btnGuardar1) {

            //Valida antes de guardar que el campo este lleno
            if (vista.txtcodArticulo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo articulo no puede estar vacio ", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            ArrayList<ArtUnidadBO> listaArtUnidad = new ArrayList<>();
            listaArtUnidad = artiunidadModel.pObtenerListadoDatosUnidad(lblNombreEmpresa.getText(), "saArtUnidad", "Co_art", vista.txtcodArticulo.getText(), "3");
            System.out.println("CLASES :::::::::::::::::FECHA   "+Utilitario.obtenerFecha(vista.fechregistro));
            resultado = modelo.pInsertarArticulo(
                    vista.txtcodArticulo.getText(),
                    Utilitario.obtenerFechaSinEspacio(vista.fechregistro),
                    vista.txtDescripcionArt.getText(),//Descripcion del Articulo
                    vista.selecTipo.getSelectedItem().toString(),//Tipo
                    "0",//BitAnulado
                    Utilitario.obtenerFechaSinEspacio(vista.fechregistro),//Fecha
                    vista.txtcodLinea.getText().replaceAll("\\s", ""), //vista.selectLinea.getSelectedItem().toString(),//Codigo Linea
                    vista.txtCodSubLinea.getText().replaceAll("\\s", ""),// Sublinea
                    vista.txtCodCategoria.getText().replaceAll("\\s", ""),// Categoria 
                    vista.txtCod_Color.getText().replaceAll("\\s", ""),//Color 
                    vista.txtCod_ubicacion.getText().replaceAll("\\s", ""), //Ubicacion 
                    vista.txtItem.getText(),//Item
                    vista.txtModelo.getText(),// Modelo
                    vista.txtReferencia.getText(),// Referencia
                    generico,//Generico
                    ManejaSerial,//Maneja Serial  
                    manejaLote,// Maneja Lote
                    maneLoteVencido,// Maneja Lote Vencido
                    vista.txtExistenciaMin.getText(),// Margen Minimo 
                    vista.txtExistenciaMax.getText(), // Margen maximo
                    tipoImpo //Tipo Impuesto
                    ,
                     "1",// Tipo  Impuesto2
                    "3", //Tipo Impuesto 3
                    "33",//Co_reten
                    "Cod_proc",// Cod_Proc
                    vista.txtGarantia.getText(),// Garantia
                    vista.txtVolumen.getText(),//Volumen  
                    vista.txtPeso.getText(), // Peso
                    vista.txtExistenciaMin.getText(),//deStock_Min
                    vista.txtExistenciaMax.getText(),// deStock_Max
                    vista.txtPntPedido.getText(), // deStock_Pedido
                    relacionUnidad,// iRelac_Unidad
                    "00",// dePunt_Cli
                    "00",//deLic_Mon_Ilc 
                    "00",// deLic_Capacidad
                    "0",// deLic_Grado_Al
                    "0",// sLic_Tipo
                    "0",//bPrec_Om
                    "sComentario",// sComentarioAceptar
                    tipoCosto,// sTipo_Cos
                    "0",// dePorc_Margen_Minimo
                    "0",// dePorc_Margen_Maximo
                    vista.txtMonto.getText(),// deMont_Comi
                    "0",// dePorc_Arancel
                    vista.txtDescripcionArt.getText(),// sI_Art_Des
                    "0",// sDis_Cen
                    "0",// sReten_Iva_Tercero
                    "sCampo1",// sCampo1
                    "sCampo1",// sCampo2
                    Vistaprincipal.lblNombreUsuario1.getText(),// sCo_Us_In
                    Vistaprincipal.lblNombreSucursal.getText()// sCo_Sucu_In

            );

            if (listaArtUnidad.size() <= 0) {
                vista.jDialogRelacionUnidad.setVisible(true);
                vista.jDialogRelacionUnidad.setSize(560, 300);
                vista.jDialogRelacionUnidad.setLocationRelativeTo(null);
                vista.txtCodArticulo.setText(vista.txtcodArticulo.getText());

            } else if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.jDialogArticulo.dispose();
                vista.setterCampos();
            }
        } else if (event.getSource() == this.vista.btnactulizar) {

            resultado = modelo.pActualizarArticulo(//tipoCosto, tipoCosto, manejaLote, generico, generico, generico, manejaLote, generico, tipoCosto, tipoCosto, tipoCosto, generico, generico, tipoCosto, generico, generico, ManejaSerial, manejaLote, manejaLote, generico, ManejaSerial, tipoCosto, tipoCosto, tipoCosto, tipoCosto, tipoCosto, tipoCosto, tipoCosto, generico, tipoCosto, tipoCosto, generico, ManejaSerial, generico, tipoCosto, maneLoteVencido, generico, generico, generico, generico, tipoCosto, generico, generico, tipoCosto, generico, generico, tipoCosto, generico, tipoCosto, tipoCosto, tipoCosto, generico, tipoCosto, generico)
                    vista.txtcodArticulo.getText(),
                    vista.txtcodArticulo.getText(),
                    Utilitario.obtenerFecha(vista.fechregistro),
                    vista.txtDescripcionArt.getText(),//Descripcion del Articulo
                    vista.selecTipo.getSelectedItem().toString(),//Tipo
                    "1",//BitAnulado
                    null,//Fecha
                    vista.txtcodLinea.getText().replaceAll("\\s", ""),//vista.selectLinea.getSelectedItem().toString(),//Codigo Linea
                    vista.txtCodSubLinea.getText().replaceAll("\\s", ""),// Sublinea
                    vista.txtCodCategoria.getText().replaceAll("\\s", ""),// Categoria 
                    vista.txtCod_Color.getText().replaceAll("\\s", ""),//Color 
                    vista.txtCod_ubicacion.getText().replaceAll("\\s", ""), //Ubicacion 
                    vista.txtItem.getText(),//Item
                    vista.txtModelo.getText(),// Modelo
                    vista.txtReferencia.getText(),// Referencia
                    generico,//Generico
                    ManejaSerial,//Maneja Serial  
                    manejaLote,// Maneja Lote
                    maneLoteVencido,// Maneja Lote Vencido
                    vista.txtExistenciaMin.getText(),// Margen Minimo 
                    vista.txtExistenciaMax.getText(), // Margen maximo
                    tipoImpo, //Tipo Impuesto
                    "0",// Tipo  Impuesto2
                    "3", //Tipo Impuesto 3
                    "33",//Co_reten
                    "Cod_proc",// Cod_Proc
                    vista.txtGarantia.getText(),// Garantia
                    vista.txtVolumen.getText(),//Volumen  
                    vista.txtPeso.getText(), // Peso
                    vista.txtExistenciaMin.getText(),//deStock_Min
                    vista.txtExistenciaMax.getText(),// deStock_Max
                    vista.txtPntPedido.getText(), // deStock_Pedido
                    "0",// iRelac_Unidad
                    "00",// dePunt_Cli
                    "00",//deLic_Mon_Ilc 
                    "00",// deLic_Capacidad
                    "0",// deLic_Grado_Al
                    "0",// sLic_Tipo
                    "0",//bPrec_Om
                    "sComentario",// sComentario
                    tipoCosto,// sTipo_Cos
                    "0",// dePorc_Margen_Minimo
                    "0",// dePorc_Margen_Maximo
                    vista.txtMonto.getText(),// deMont_Comi
                    "0",// dePorc_Arancel
                    vista.txtDescripcionArt.getText(),// sI_Art_Des
                    "0",// sDis_Cen
                    "0",// sReten_Iva_Tercero
                    "sCampo1",// sCampo1
                    "sCampo1",// sCampo2
                    Vistaprincipal.lblNombreUsuario1.getText(),// sCo_Us_In
                    Vistaprincipal.lblNombreSucursal.getText(),// sCo_Sucu_In       
                    Vistaprincipal.lblNombreUsuario1.getText(),// sCo_Us_mo
                    Vistaprincipal.lblNombreSucursal.getText());// sCo_Sucu_mo
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha  Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setterCampos();
            }
        } else if (event.getSource() == this.vista.btnEliminar1) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarArticulo(vista.txtcodArticulo.getText().toString());
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.setterCampos();
                }
            } else {
                return;
            }
        } else if (event.getSource() == this.vista.btnNuevo1) {
            vista.btnEliminar1.setEnabled(false);
            vista.btnactulizar.setEnabled(false);
            vista.btnGuardar1.setEnabled(true);
            vista.setterCampos();
        } else if (event.getSource() == this.vista.btnImprimir1) {
            vista.jDialogReporteArticulo.setSize(600, 450);
            vista.jDialogReporteArticulo.setLocationRelativeTo(null);
            vista.jDialogReporteArticulo.setVisible(true);

//            DialogReporteArticulos dialo = new DialogReporteArticulos(new JFrame(), true);
//            dialo.setSize(600, 450);
//            dialo.setVisible(true);
        } //Evento  cuando seleccionas el boton aceptar en el Articulo 
        else if (event.getSource() == this.vista.Aceptar) {
            // int selection = jtableColor.rowAtPoint(evt.getPoint());

            vista.btnactulizar.setEnabled(true);
            vista.btnEliminar1.setEnabled(true);
            vista.btnGuardar1.setEnabled(false);
            int selectcion = vista.jtablaArticulos.getSelectedRow();
            if (selectcion == -1) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar un Articulo", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            listaarticulos = modelo.pObtenerListadoDatosArticulos(
                    lblNombreEmpresa.getText(),
                    "co_art",
                    vista.jtablaArticulos.getValueAt(selectcion, 0).toString().replaceAll("\\s", ""),
                    "0",
                    "1", "0", "0", "0", "0", "0", "0",
                    /*
                 * Obligatorio tipo
                     */ "0",
                    "V",
                    "0", "", "0", "", "0", "", "0", "", "0", "", "0", "", "0", "", "0", "", "3");
            System.out.println("Listas Arti " + listaarticulos.get(0).getVolumen());
            int tipoIn = 0;
            if (listaarticulos.get(0).getTipo().equals("V")) {
                tipoIn = 0;
            } else if (listaarticulos.get(0).getTipo().equals("C")) {
                tipoIn = 1;
            } else if (listaarticulos.get(0).getTipo().equals("S")) {
                tipoIn = 2;
            } else if (listaarticulos.get(0).getTipo().equals("F")) {
                tipoIn = 3;
            } else if (listaarticulos.get(0).getTipo().equals("M")) {
                tipoIn = 4;
            }
            if (listaarticulos.get(0).getManeja_serial().equals("1")) {
                vista.jseriales.setSelected(true);
            } else {
                vista.jseriales.setSelected(false);
            }
            if (listaarticulos.get(0).getManeja_lote_venc().equals("1")) {
                vista.jvencidos.setSelected(true);
            } else {
                vista.jvencidos.setSelected(false);
            }
            if (listaarticulos.get(0).getManeja_lote().equals("1")) {
                vista.jutilizalotes.setSelected(true);
            } else {
                vista.jutilizalotes.setSelected(false);
            }
            if (listaarticulos.get(0).getGenerico().equals("0")) {
                vista.jGenerico.setSelected(false);
            } else {
                vista.jGenerico.setSelected(true);
            }
            String Costo = listaarticulos.get(0).getTipo_cos().replaceAll("\\s", "");
            int costo = Integer.parseInt(Costo);
            if (costo == 5) {
                Costo = "Reposicion";
            } else if (costo == 6) {
                Costo = "Proveedor";
            } else if (costo == 7) {
                Costo = "PEPS/UEPS";
            } else {
                Costo = "ultimo costo";
            }
            if (ubicacion == 1) {
                //listaarticulos.get(0).get
                vista.txtcodArticulo.setText(vista.jtablaArticulos.getValueAt(selectcion, 0).toString().replaceAll("\\s", ""));
                vista.txtDescripcionArt.setText(listaarticulos.get(0).getArt_des().replaceAll("\\s", ""));
                vista.txtVolumen.setText(listaarticulos.get(0).getVolumen());
                vista.txtReferencia.setText(listaarticulos.get(0).getRef().replaceAll("\\s", ""));
                vista.txtPntPedido.setText(listaarticulos.get(0).getStock_pedido());
                vista.txtPeso.setText(listaarticulos.get(0).getPeso().replaceAll("\\s", ""));
                vista.txtMonto.setText(listaarticulos.get(0).getMont_comi());
                vista.txtModelo.setText(listaarticulos.get(0).getModelo());
                vista.txtItem.setText(listaarticulos.get(0).getItem().replaceAll("\\s", ""));
                vista.txtGarantia.setText(listaarticulos.get(0).getGarantia().replaceAll("\\s", ""));
                vista.txtExistenciaMin.setText(listaarticulos.get(0).getStock_min());
                vista.txtExistenciaMax.setText(listaarticulos.get(0).getStock_max());
                //vista.fechregistro.setDate(listaarticulos.get(0).getFecha_reg());
                vista.selecTipo.setSelectedIndex(tipoIn);
                vista.txtCodSubLinea.setText(listaarticulos.get(0).getCo_subl().replaceAll("\\s", ""));
                vista.txtCodCategoria.setText(listaarticulos.get(0).getCo_cat().replaceAll("\\s", ""));
                vista.txtcodLinea.setText(listaarticulos.get(0).getCo_lin().replaceAll("\\s", ""));
                vista.txtCod_ubicacion.setText(listaarticulos.get(0).getCo_ubicacion().replaceAll("\\s", ""));
                vista.txtCod_Color.setText(listaarticulos.get(0).getCo_color().replaceAll("\\s", ""));
                vista.txtDescripcionColor.setText(listaarticulos.get(0).getColorDescripcion());
                vista.txtDescripcionCategoria.setText(listaarticulos.get(0).getCategoriaDescripcion());
                vista.txtDescripcionLinea.setText(listaarticulos.get(0).getLineaDescripcion());
                vista.txtdescripSubLinea.setText(listaarticulos.get(0).getSubLineaDescripcion());
                vista.txtDescripcionUbicacion.setText(listaarticulos.get(0).getUbicacionDescripcion());

                vista.fechregistro.setDate(Utilitarios.Utilitario.obtenerFecha(listaarticulos.get(0).getFecha_reg()));
                vista.tipoImpuesto.setSelectedIndex(Integer.parseInt(listaarticulos.get(0).getTipo_imp()) - 1);

                vista.jCostoBase.setSelectedItem(Costo);

            } else if (ubicacion == 2) {
                vista.txtCodArtDesde.setText(listaarticulos.get(0).getCo_art().toString().replaceAll("\\s", ""));
                vista.txtDescripArtDesde.setText(listaarticulos.get(0).getArt_des());
            } else if (ubicacion == 3) {
                vista.txtCodArtHasta.setText(listaarticulos.get(0).getCo_art().toString().replaceAll("\\s", ""));
                vista.txtDescripArtHasta.setText(listaarticulos.get(0).getArt_des());
            }
            vista.jDialogArticulo.dispose();
        } else if (event.getSource() == this.vista.btnCancelar) {
            vista.jDialogArticulo.dispose();
        }else if (event.getSource() == this.vista.btnCancelarRelacionUnidad) {
            vista.jDialogRelacionUnidad.dispose();
        }
        else if (event.getSource() == this.vista.btnaceptarRelacionUnidad) {

            String unidadPrincipal = vista.jruniprimaria.isSelected() ? "1" : "0",
                    unidadadSecundaria = vista.jruniSecundaria.isSelected() ? "1" : "0";

            resultado = artiunidadModel.pInsertarUnidadArticuloRenglon(
                    vista.txtcodArticulo.getText(),
                    vista.txtCodUnidad.getText(),
                    "0",
                    "0",
                    "1",
                    "0",
                    "0",
                    unidadPrincipal,//bUso_Principal
                    "0", //bUso_Principal
                    "1",
                    unidadadSecundaria,
                    "0",//Uso_Secundaria
                    "0",//usoDecimales
                    "0", //numerosDecimales
                    "", //campo1
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    Vistaprincipal.lblNombreUsuario1.getText(),//usu_in
                    Utilitario.nombreHost(),
                    "",
                    "");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.jDialogRelacionUnidad.dispose();
            }
            //evento cuando le das clip al boton aceptar y seleccionas la unidad de tabla
        } else if (event.getSource() == this.vista.btnAceptarunidad) {
            int selection = vista.jtablaUnidad.getSelectedRow();
            String descripcionUnidad = vista.jtablaUnidad.getValueAt(selection, 1).toString();
            if (selection != -1) {
                vista.txtCodUnidad.setText(vista.jtablaUnidad.getValueAt(selection, 0).toString());
                vista.txtDescripcionRelacionUnidad.setText(descripcionUnidad);
                vista.txtcod_unidad2.setText(vista.jtablaUnidad.getValueAt(selection, 0).toString());
                vista.txtDescripcionArtUnidad2.setText(descripcionUnidad);
                vista.JDialogUnidad.dispose();
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Debe selccionar una unidad", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        } else if (event.getSource() == this.vista.btnUnidad) {
            if (vista.txtcodArticulo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El Campo Codigo no puede estar Vacia", "Software", JOptionPane.ERROR_MESSAGE);
                return;
            }
            ArrayList<ArtUnidadBO> listas = new ArrayList<>();
            listas = artiunidadModel.pSeleccionarUnidadArticuloRenglon(vista.txtcodArticulo.getText());
            cargarDatos(listas);
            vista.modelotablaunidadartRenglon.refrescarTable();
            //vista.AddColumnass();
            vista.txtCod_articulo2.setText(vista.txtcodArticulo.getText());
            vista.txtArtdescripcion2.setText(vista.txtDescripcionArt.getText());
            vista.DialogArtUnidad.setVisible(true);
            vista.DialogArtUnidad.setSize(690, 300);
            vista.DialogArtUnidad.setLocationRelativeTo(null);
        } else if (event.getSource() == this.vista.btnCancelarUnidad) {
            vista.JDialogUnidad.dispose();
        } else if (event.getSource() == this.vista.btnGuardarArrUnidad) {
            int cantidadRows = vista.jTableArtUnidad.getRowCount();
            if (cantidadRows > 0) {
                for (int i = 0; i < cantidadRows; i++) {
                    pPrimaria = (vista.jTableArtUnidad.getValueAt(i, 2).equals(true)) ? "1" : "0";
                    primaria = (vista.jTableArtUnidad.getValueAt(i, 3).equals(true)) ? "1" : "0";

                    resultado = artiunidadModel.pInsertarUnidadArticuloRenglon(
                            vista.txtCod_articulo2.getText(),
                            vista.jTableArtUnidad.getValueAt(i, 0).toString(),
                            "0",
                            "0",
                            vista.jTableArtUnidad.getValueAt(i, 5).toString(), //Equivalencia
                            "0", // bUso_Venta
                            "0",//bUso_Compra
                            pPrimaria, //bUni_Principal
                            "0",//bUso_Principal
                            "0", //bUni_Secundaria
                            "0",//bUso_Secundaria
                            "0", //bUso_NumDecimales
                            "0", //iNum_Decimales
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            null,
                            Vistaprincipal.lblNombreUsuario1.getText(), //sCo_Us_In
                            Vistaprincipal.lblNombreSucursal.getText(), //sCo_Sucu_In
                            Utilitario.nombreHost(),
                            "1",
                            "1");
                }
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.DialogArtUnidad.dispose();
                }
            }
        } else if (event.getSource() == this.vista.btnCancelarUnidad) {
            vista.DialogArtUnidad.dispose();
        } else if (event.getSource() == this.vista.btnrestar) {
            int filaseleccionada = vista.jTableArtUnidad.getSelectedRow();
            if (filaseleccionada != -1) {
                if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    System.out.println("Controller.ArticuloControllereliminar  " + vista.jTableArtUnidad.getValueAt(filaseleccionada, 0));
                    // vista.reglon.removeRow(vista.jTableArtUnidad.getSelectedRow());
                    resultado = artiunidadModel.pEliminarUnidadArticuloRenglon(
                            vista.txtcodArticulo.getText(),// sCo_ArtOri
                            vista.jTableArtUnidad.getValueAt(filaseleccionada, 0).toString(),//sCo_UniOri
                            "1",//iReng_NumOri
                            Utilitario.nombreHost(),//sMaquina
                            Vistaprincipal.lblNombreUsuario1.getText(),//sCo_Us_Mo
                            Vistaprincipal.lblNombreSucursal.getText()//sCo_Sucu_Mo
                    );
                    vista.modelotablaunidadartRenglon.removeRow(vista.jTableArtUnidad.getSelectedRow());
                    if (resultado != 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } else if (event.getSource() == vista.btnrestaArtUbicacion) {
            int filaseleccionada = vista.JtableArtUbicacion.getSelectedRow();
            if (filaseleccionada != -1) {
                if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    resultado = artUbicacionModel.pEliminarRenglonesArtUbicacion(
                            vista.txtArticuloUbicacion.getText(),
                            vista.JtableArtUbicacion.getValueAt(filaseleccionada, 0).toString(),
                            vista.JtableArtUbicacion.getValueAt(filaseleccionada, 1).toString(),
                            vista.JtableArtUbicacion.getValueAt(filaseleccionada, 2).toString(),
                            vista.JtableArtUbicacion.getValueAt(filaseleccionada, 3).toString(),
                            vista.JtableArtUbicacion.getValueAt(filaseleccionada, 5).toString(),
                            Vistaprincipal.lblNombreUsuario1.getText(),
                            Utilitario.nombreHost(),
                            "VAL"
                    );
                    modeloartUbicacionRenglones.removeRow(filaseleccionada);
                    if (resultado != 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                        setteCampoArticuUbicacion();

                    } else {
                        System.out.println("El resultado es : " + resultado);
                    }
                }
            }
        } else if (event.getSource() == this.vista.btnPrecio) {
            setteCamposPrecios();
            if (vista.txtcodArticulo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El Campo Codigo no puede estar Vacia", "Software", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String codiArticulo = vista.txtcodArticulo.getText().replaceAll("\\s", "");
            String descripcion = vista.txtDescripcionArt.getText().replaceAll("\\s", "");

            vista.txtArticuloPrecio.setText(codiArticulo);
            vista.txtDescripcionArticuloPrecio.setText(descripcion);
            cargarDatosPrecios(codiArticulo);
            vista.jDialogPrecio.setSize(690, 530);
            vista.jDialogPrecio.setLocationRelativeTo(null);
            vista.jDialogPrecio.setVisible(true);
        } else if (event.getSource() == this.vista.btnRefresh) {
            cargarDatosPrecios(vista.txtArticuloPrecio.getText());
        } //Cargar Ventana Articulo Ubicacion 
        else if (event.getSource() == this.vista.btnUbicacion) {

            if (vista.txtcodArticulo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El Campo Codigo no puede estar Vacia", "Software", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String codiArticulo = vista.txtcodArticulo.getText().replaceAll("\\s", "");
            String descripcion = vista.txtDescripcionArt.getText().replaceAll("\\s", "");

            vista.txtArticuloUbicacion.setText(codiArticulo);
            vista.txtDescripcionArticuloUbicacion.setText(descripcion);
            cargarDatosArtUbicacionRenglon(codiArticulo, 0, "");
            vista.jDialogArtUbicacion.setSize(690, 530);
            vista.jDialogArtUbicacion.setLocationRelativeTo(null);
            vista.jDialogArtUbicacion.setVisible(true);
        } else if (event.getSource().equals(vista.btnBuscarPrecio)) {
            String codigArtiPrecio = vista.txtArticuloPrecio.getText();
            String almacen = vista.txtCodAlmacenPrecio1.getText().isEmpty() ? null : vista.txtCodAlmacenPrecio1.getText();
            String codPrecio = vista.txtcodPrecio.getText().isEmpty() ? null : vista.txtcodPrecio.getText();
            buscarPrecio(codigArtiPrecio, almacen, codPrecio);
            vista.settearCamposPrecios();
        } else if (event.getSource() == this.vista.btnrestarPrecio) {

            int filaseleccionada = vista.JtablePrecio.getSelectedRow();
            System.out.println("numero del renglon a eliminar" + filaseleccionada);

            System.out.println("Datos : \n"
                    + " Tipo Precio : " + vista.JtablePrecio.getValueAt(filaseleccionada, 0).toString()
                    + "\n Almacen  " + vista.JtablePrecio.getValueAt(filaseleccionada, 2).toString()
                    + " \n Co_Alma_CalculadoOri " + vista.JtablePrecio.getValueAt(filaseleccionada, 2).toString()
                    + " \n  PrecioOM" + vista.JtablePrecio.getValueAt(filaseleccionada, 5).toString()
                    + " \n fechaDesde " + vista.JtablePrecio.getValueAt(filaseleccionada, 3).toString()
            );
            if (filaseleccionada != -1) {
                if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    artprecioModel.pEliminarRenglonesPrecioArticulo(
                            vista.txtArticuloPrecio.getText(),
                            vista.JtablePrecio.getValueAt(filaseleccionada, 0).toString(),//Tipo Precio
                            vista.JtablePrecio.getValueAt(filaseleccionada, 2).toString(),//Almacen
                            vista.JtablePrecio.getValueAt(filaseleccionada, 2).toString(),//"",//Co_Alma_CalculadoOri
                            vista.JtablePrecio.getValueAt(filaseleccionada, 3).toString(),//fechaDesde
                            "0",//Precio OM Origen
                            // vista.JtablePrecio.getValueAt(filaseleccionada, 5).toString(),// sco_mone
                            //  null, //inactivo
                            Vistaprincipal.lblNombreUsuario1.getText(), //sCo_Us_Mo
                            Utilitario.nombreHost(),// sMaquina
                            Vistaprincipal.lblNombreSucursal.getText() //@sCo_Sucu_Mo
                    );
                    modeloTablaArtPrecioRenglon.removeRow(filaseleccionada);
                } else {

                }

            } else {
                System.out.println("Seleccione una Fila");
            }
            // Evento donde agregas precios en la tabla Precio Renglon
        } else if (event.getSource() == this.vista.btnAgregarPrecio) {
            if (vista.txtTipoPrecio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El Campo tipo de Precio no puede estar vacio", "Software", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (vista.txtAlmacenPrecio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El Campo tipo de Almacen no puede estar vacio", "Software", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (vista.txtMonedaPrecio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El Campo tipo de Moneda  no puede estar vacio", "Software", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (vista.txtMontoPrecio.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El Campo tipo de Monto Precio no puede estar vacio", "Software", JOptionPane.ERROR_MESSAGE);
                return;
            }

            artPrecioBO = new ArtPrecioBO();
            artPrecioBO.setCo_precio(vista.txtTipoPrecio.getText());
            artPrecioBO.setCo_alma_calculado(vista.txtAlmacenPrecio.getText());
            artPrecioBO.setCo_mone(vista.txtMonedaPrecio.getText());
            artPrecioBO.setMonto(vista.txtMontoPrecio.getText());
            artPrecioBO.setDesde(Utilitario.obtenerFecha(vista.fechaDesde));
            artPrecioBO.setHasta(Utilitario.obtenerFecha(vista.fechaHasta));
            modeloTablaArtPrecioRenglon.addRow(artPrecioBO);
            setteCamposPrecios();
        } else if (event.getSource().equals(vista.btnGuardarArtPrecio)) {
            int cantidadRows = vista.JtablePrecio.getRowCount();
            if (vista.JtablePrecio.getValueAt(0, 4).toString().equals(null) || vista.JtablePrecio.getValueAt(0, 4).toString().isEmpty()) {
                System.out.println("Nulo");
            } else {
                System.out.println("Diferente a  Nulo");
            }
            if (cantidadRows > 0) {
                for (int i = 0; i < cantidadRows; i++) {
                    String fechaHasta = vista.JtablePrecio.getValueAt(i, 4).toString().equals(null) ? "" : vista.JtablePrecio.getValueAt(0, 4).toString();
                    String precioOM = vista.JtablePrecio.getValueAt(i, 5).toString().toUpperCase().equals("BSS") ? "0" : "1";
                    System.out.println("Precio " + vista.JtablePrecio.getValueAt(0, 5).toString());
                    artprecioModel.pInsertarRenglonesPrecioArticulo(
                            String.valueOf(vista.JtablePrecio.getSelectedRowCount()),//iRENG_NUMOri,
                            vista.txtArticuloPrecio.getText(),//sCo_Art,
                            vista.JtablePrecio.getValueAt(i, 0).toString(),//sCo_Precio
                            vista.JtablePrecio.getValueAt(i, 3).toString(),//dDesde
                            vista.JtablePrecio.getValueAt(i, 2).toString(),//sCo_Alma
                            fechaHasta,//dHasta
                            vista.JtablePrecio.getValueAt(i, 1).toString(),//deMonto
                            precioOM,//bPrecioOm
                            "100",//deMargenMin
                            "200", //deMargenMax
                            "101", //deMargenMinV
                            vista.JtablePrecio.getValueAt(i, 5).toString(), //sco_mone
                            "0",//binactivo
                            Vistaprincipal.lblNombreUsuario1.getText(), //sCo_Us_In
                            Vistaprincipal.lblNombreSucursal.getText(), //sCo_Sucu_In
                            "MAQUINA", //MQUINA
                            "1",//REVISADO
                            "1" //sTrasnfe
                    );
                }
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (event.getSource().equals(vista.btnAceptartipoPrecio)) {
            int selection = vista.jtablaTipoPrecio.getSelectedRow();
            if (selection != -1) {
                if (numeroCampo == 2) {
                    vista.txtTipoPrecio.setText(vista.jtablaTipoPrecio.getValueAt(selection, 0).toString());
                } else {
                    vista.txtcodPrecio.setText(vista.jtablaTipoPrecio.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                    vista.txtDescripcionPrecio.setText(vista.jtablaTipoPrecio.getValueAt(selection, 1).toString().replaceAll("\\s", ""));
                }
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar Tipo Precio", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            vista.jDialogTipoPrecio.dispose();
        } else if (event.getSource().equals(vista.btnCancelarTipoPrecio)) {
            vista.jDialogTipoPrecio.dispose();
        } else if (event.getSource().equals(vista.btnAceptarAlmacen)) {
            int selection = vista.jtablaAlmacen.getSelectedRow();
            if (selection != -1) {
                if (numeroCampo == 2) {
                    vista.txtAlmacenPrecio.setText(vista.jtablaAlmacen.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                } else if (numeroCampo == 1) {
                    vista.txtCodAlmacenPrecio1.setText(vista.jtablaAlmacen.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                    vista.txtdescripcionPrecio.setText(vista.jtablaAlmacen.getValueAt(selection, 1).toString().replaceAll("\\s", ""));
                } else if (numeroCampo == 3) {
                    vista.txtCodAlmacenUbicacion.setText(vista.jtablaAlmacen.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                    vista.txtDescripcionAlmacenUbicacion.setText(vista.jtablaAlmacen.getValueAt(selection, 1).toString().replaceAll("\\s", ""));
                } else if (sCampoUbicacion == 10) {
                    vista.txtcodAlmacenDesde.setText(vista.jtablaAlmacen.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                    vista.txtCodAlmacenDesdedescrip.setText(vista.jtablaAlmacen.getValueAt(selection, 1).toString());

                } else if (sCampoUbicacion == 11) {
                    vista.txtcodAlmacenHasta.setText(vista.jtablaAlmacen.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                    vista.txtCodAlmacenHastaDescrip.setText(vista.jtablaAlmacen.getValueAt(selection, 1).toString());
                }
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar Almacen", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            vista.jDialogAlmacenPrecio.dispose();
        } else if (event.getSource().equals(vista.btnCancelarAlmacen)) {
            vista.jDialogAlmacenPrecio.dispose();
        } //cuando acepta en la JatableMoneda una Moneda y selecciona un registro ...
        else if (event.getSource().equals(vista.btnAceptarMoneda)) {
            int selection = vista.jtablaMoneda.getSelectedRow();
            if (selection != -1) {
                vista.txtMonedaPrecio.setText(vista.jtablaMoneda.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                vista.jDialogMoneda.dispose();
            }
        } //Agregando datos al renglon Articulo Ubicacion ...
        else if (event.getSource().equals(vista.btnAgregarArtUbicacion)) {
            if (vista.txtCodAlmacenUbicacion.getText().isEmpty() || vista.txtDescripcionAlmacenUbicacion.getText().isEmpty()
                    || vista.txtCod1Ubicacion.getText().isEmpty() || vista.txtdescripcionUbicacion1.getText().isEmpty()
                    || vista.txtOrdenArtUbicacion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo  no puede estar vacio ", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            ArtUbicacionBO artUbicacionBO = new ArtUbicacionBO();
            artUbicacionBO.setCo_alma(vista.txtDescripcionAlmacenUbicacion.getText());
            artUbicacionBO.setCo_ubicacion(vista.txtdescripcionUbicacion1.getText());
            artUbicacionBO.setCo_ubicacion2(vista.txtdescripcionUbicacion2.getText());
            artUbicacionBO.setCo_ubicacion3(vista.txtdescripcionUbicacion3.getText());
            artUbicacionBO.setDes_ubicacion(vista.txtDescripcionUbicacionAlmacen.getText());
            artUbicacionBO.setOrden(vista.txtOrdenArtUbicacion.getText());
            modeloartUbicacionRenglones.addRow(artUbicacionBO);
            setteCampoArticuUbicacion();

        }//Guardar Articulos con su Ubicacion Renglones 
        else if (event.getSource().equals(vista.btnGuardarArtUbicacion)) {

            int cantidadRows = vista.JtableArtUbicacion.getRowCount();
            System.out.println("Evento Guardar btnGuardarArtUbicacion  la cantidad :" + cantidadRows);
            for (int i = 0; i < cantidadRows; i++) {
                artUbicacionModel.pInsertarRenglonesArtUbicacion(
                        1,
                        vista.txtArticuloUbicacion.getText(),
                        vista.JtableArtUbicacion.getValueAt(i, 0).toString().replaceAll("\\s", ""),
                        vista.JtableArtUbicacion.getValueAt(i, 1).toString(),
                        vista.JtableArtUbicacion.getValueAt(i, 2).toString(),
                        vista.JtableArtUbicacion.getValueAt(i, 2).toString(),
                        vista.JtableArtUbicacion.getValueAt(i, 4).toString(),
                        vista.JtableArtUbicacion.getValueAt(i, 5).toString(),
                        Vistaprincipal.lblNombreUsuario1.getText(),//co_us_in
                        Vistaprincipal.lblNombreSucursal.getText(),//"sCo_Sucu_In",
                        Utilitario.nombreHost(),
                        "1",
                        "1");
            }
            JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
            setteCampoArticuUbicacion();
        } else if (event.getSource().equals(vista.btnCancelarUbicacion)) {
            vista.jDialogUbicacion.dispose();
        } else if (event.getSource().equals(vista.btnAceptarUbicacion)) {
            int selection = vista.jtablaUbicacion.getSelectedRow();
            if (selection != -1) {
                if (sCampoUbicacion == 1) {
                    vista.txtCod1Ubicacion.setText(vista.jtablaUbicacion.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                    vista.txtdescripcionUbicacion1.setText(vista.jtablaUbicacion.getValueAt(selection, 1).toString().replaceAll("\\s", ""));
                    sCampoUbicacion = 0;
                    vista.jDialogUbicacion.dispose();
                } else if (sCampoUbicacion == 2) {
                    vista.cod2Ubicacion2.setText(vista.jtablaUbicacion.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                    vista.txtdescripcionUbicacion2.setText(vista.jtablaUbicacion.getValueAt(selection, 1).toString().replaceAll("\\s", ""));
                    vista.jDialogUbicacion.dispose();
                    sCampoUbicacion = 0;
                } else if (sCampoUbicacion == 3) {
                    vista.cod3Ubicacion3.setText(vista.jtablaUbicacion.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                    vista.txtdescripcionUbicacion3.setText(vista.jtablaUbicacion.getValueAt(selection, 1).toString().replaceAll("\\s", ""));
                    vista.jDialogUbicacion.dispose();
                    sCampoUbicacion = 0;
                } else if (sCampoUbicacion == 4) {
                    vista.txtCod_ubicacion.setText(vista.jtablaUbicacion.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                    vista.txtDescripcionUbicacion.setText(vista.jtablaUbicacion.getValueAt(selection, 1).toString().replaceAll("\\s", ""));
                    vista.jDialogUbicacion.dispose();
                }

            }
        } else if (event.getSource().equals(vista.btnAceptarSucursal)) {
            int selection = vista.jtableSucursal.getSelectedRow();
            if (selection != -1) {
                vista.txtCodSucursalUbicacion.setText(vista.jtableSucursal.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                vista.txtDescripcionSucursalUbicacion.setText(vista.jtableSucursal.getValueAt(selection, 1).toString().replaceAll("\\s", ""));
                vista.JDialogoSucursal.dispose();
            }
        } else if (event.getSource().equals(vista.btnCancelarSucursal)) {
            vista.JDialogoSucursal.dispose();
        } else if (event.getSource().equals(vista.btnLimpiar)) {
            vista.txtCodSucursalUbicacion.setText("");
            vista.txtDescripcionSucursalUbicacion.setText("");
        } //exec pObtenerListadoDatosArtUbicacion'admin_a','saArtUbicacion','co_art','0101002','3','VAL'
        else if (event.getSource().equals(vista.btbBuscarSucursal)) {

            cargarDatosArtUbicacionRenglon(vista.txtArticuloUbicacion.getText(), 2, vista.txtCodSucursalUbicacion.getText());
        } else if (event.getSource().equals(vista.btnAceptarLinea)) {
            int selection = vista.jTablaLinea.getSelectedRow();
            if (selection != -1) {
                String codigoLinea = vista.jTablaLinea.getValueAt(selection, 0).toString().replaceAll("\\s", "");

                if (ubicacion == 1) {
                    vista.txtcodLinea.setText(codigoLinea);
                    vista.txtDescripcionLinea.setText(vista.jTablaLinea.getValueAt(selection, 1).toString());
                } else if (ubicacion == 4) {
                    vista.txtCodLineaDesde.setText(codigoLinea);
                    vista.txtCodLineadescrip.setText(vista.jTablaLinea.getValueAt(selection, 1).toString());
                } else if (ubicacion == 5) {
                    vista.txtCodLineaHasta.setText(codigoLinea);
                    vista.txtCodLineadescrip2.setText(vista.jTablaLinea.getValueAt(selection, 1).toString());
                }

                vista.jDialogLinea.dispose();
            }
        } else if (event.getSource().equals(vista.btnCancelarLinea)) {
            vista.jDialogLinea.dispose();
        } else if (event.getSource().equals(vista.btnAceptarSubLinea)) {
            seleccionado = vista.jtableSubLinea.getSelectedRow();
            if (seleccionado != -1) {
                if (ubicacion == 1) {
                    vista.txtCodSubLinea.setText(vista.jtableSubLinea.getValueAt(seleccionado, 0).toString().replaceAll("\\s", ""));
                    vista.txtdescripSubLinea.setText(vista.jtableSubLinea.getValueAt(seleccionado, 1).toString().replaceAll("\\s", ""));
                } else if (ubicacion == 6) {
                    vista.txtCodSubLineaDesde.setText(vista.jtableSubLinea.getValueAt(seleccionado, 0).toString().replaceAll("\\s", ""));
                    vista.txtCodSubLineadescrip1.setText(vista.jtableSubLinea.getValueAt(seleccionado, 0).toString().replaceAll("\\s", ""));
                } else if (ubicacion == 7) {
                    vista.txtCodSubLineaHasta.setText(vista.jtableSubLinea.getValueAt(seleccionado, 0).toString().replaceAll("\\s", ""));
                    vista.txtCodSubLineaDescriHasta.setText(vista.jtableSubLinea.getValueAt(seleccionado, 0).toString().replaceAll("\\s", ""));

                }
                vista.jDialogSubLinea.dispose();
            }
        } else if (event.getSource().equals(vista.btnCancelarSubLinea)) {
            vista.jDialogSubLinea.dispose();
        } else if (event.getSource().equals(vista.btnAceptarColor)) {
            seleccionado = vista.jtablaColor.getSelectedRow();

            if (seleccionado != -1) {
                vista.txtCod_Color.setText(vista.jtablaColor.getValueAt(seleccionado, 0).toString().replaceAll("\\s", ""));
                vista.txtDescripcionColor.setText(vista.jtablaColor.getValueAt(seleccionado, 1).toString());
                vista.jDialogColor.dispose();
            }
        } else if (event.getSource().equals(vista.btnCancelarColor)) {
            vista.jDialogColor.dispose();
        } else if (event.getSource().equals(vista.btnAceptarCategoria)) {
            seleccionado = vista.jtablaCategoria.getSelectedRow();
            if (seleccionado != -1) {
                if (ubicacion == 1) {
                    vista.txtCodCategoria.setText(vista.jtablaCategoria.getValueAt(seleccionado, 0).toString().replaceAll("\\s", ""));
                    vista.txtDescripcionCategoria.setText(vista.jtablaCategoria.getValueAt(seleccionado, 1).toString());
                } else if (ubicacion == 8) {
                    vista.txtCodCategoDesde.setText(vista.jtablaCategoria.getValueAt(seleccionado, 0).toString().replaceAll("\\s", ""));
                    vista.txtCodCategoDesdedescrip.setText(vista.jtablaCategoria.getValueAt(seleccionado, 1).toString());
                } else if (ubicacion == 9) {
                    vista.txtCodCategoHasta.setText(vista.jtablaCategoria.getValueAt(seleccionado, 0).toString().replaceAll("\\s", ""));
                    vista.txtCodCategodescripHasta.setText(vista.jtablaCategoria.getValueAt(seleccionado, 1).toString());
                }
                vista.jDialogCategoria.dispose();
            }
        } else if (event.getSource().equals(vista.btnCancelarCategoria)) {
            vista.jDialogCategoria.dispose();
        } else if (event.getSource().equals(vista.btnExistencia)) {
            if (vista.txtcodArticulo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El Campo codigo no puede estar vacio", "Software", JOptionPane.ERROR_MESSAGE);
                return;
            }

            cargarDatospConsultarStockxAlmacen(vista.txtcodArticulo.getText(), null, "total");
            vista.txtArticuloExiste.setText(vista.txtcodArticulo.getText());
            vista.txtArticuloExistenciaDescripcion.setText(vista.txtDescripcionArt.getText());
            vista.txtMinRecomendada.setText(vista.txtExistenciaMin.getText());
            vista.txtMaxRecomendada.setText(vista.txtExistenciaMax.getText());
            vista.txtPuntoPedido.setText(vista.txtPntPedido.getText());
            vista.jDialogExixtencias.setVisible(true);
            vista.jDialogExixtencias.setSize(890, 370);
            vista.jDialogExixtencias.setLocationRelativeTo(null);
        } else if (event.getSource().equals(vista.btnBuscarExistencia)) {

            String tipoSP = "";
            if (vista.jrTotal.isSelected()) {
                tipoSP = "total";
            } else if (vista.jrPorAlmacen.isSelected()) {
                tipoSP = "PorAlamacen";
            }

            cargarDatospConsultarStockxAlmacen(vista.txtcodArticulo.getText(), null, tipoSP);
        } else if (event.getSource().equals(vista.btnAceptarImprimirReporte)) {

            try {
                String ruta = "Q:\\ProyectoAdministrativo\\src\\Reportes\\RepStockArticulosxAlmacen.jasper";

                Map parametro = new HashMap();
                String codDesde = vista.txtCodArtDesde.getText(), codHasta = vista.txtCodArtHasta.getText(),
                        codLineaDesde = vista.txtCodLineaDesde.getText(),
                        codLineaHasta = vista.txtCodLineaHasta.getText(),
                        codSubLineDesde = vista.txtCodSubLineaDesde.getText(),
                        codSubLineaHasta = vista.txtCodSubLineaHasta.getText(),
                        codCateDesde = vista.txtCodCategoDesde.getText(),
                        codCateHasta = vista.txtCodCategoHasta.getText(),
                        codAlmacendesde = vista.txtcodAlmacenDesde.getText(),
                        codAlmacenHasta = vista.txtcodAlmacenHasta.getText(),
                        nivelStock = null, tipoStock = null,
                        sCo_Descripcion_d = null,
                        sCo_Descripcion_h = null;

                String criterio = vista.comboCriterio.getSelectedItem().toString().equals("Descendente") ? "DESC" : "ASC";

                if (codDesde.isEmpty() && codHasta.isEmpty()) {
                    codDesde = null;
                    codHasta = null;
                } else if (!codDesde.isEmpty() && codHasta.isEmpty()) {
                    codHasta = null;
                } else if (codDesde.isEmpty() && !codHasta.isEmpty()) {
                    codDesde = null;
                }
                System.out.println("codLineaDesde ::" + codLineaDesde);
                if (codLineaDesde.isEmpty() && codLineaHasta.isEmpty()) {
                    codLineaDesde = null;
                    codLineaHasta = null;
                } else if (!codLineaDesde.isEmpty() && codLineaHasta.isEmpty()) {
                    codLineaHasta = null;
                } else if (codLineaDesde.isEmpty() && !codLineaHasta.isEmpty()) {
                    codLineaDesde = null;
                }

                System.out.println("codLineaHasta:::" + codLineaHasta);
                if (codSubLineDesde.isEmpty() && codSubLineaHasta.isEmpty()) {
                    codSubLineDesde = null;
                    codSubLineaHasta = null;
                } else if (!codSubLineDesde.isEmpty() && codSubLineaHasta.isEmpty()) {
                    codSubLineaHasta = null;
                } else if (codSubLineDesde.isEmpty() && !codSubLineaHasta.isEmpty()) {
                    codSubLineaHasta = null;
                }
                System.out.println(" codCategoriaDesde :::" + codCateDesde);

                if (codCateDesde.isEmpty() && codCateHasta.isEmpty()) {
                    codCateDesde = null;
                    codCateHasta = null;
                } else if (!codCateDesde.isEmpty() && codCateHasta.isEmpty()) {
                    codCateHasta = null;
                } else if (codCateDesde.isEmpty() && !codCateHasta.isEmpty()) {
                    codCateDesde = null;
                }

                System.out.println(" Almacen  :::" + codAlmacendesde);
                if (codAlmacendesde.isEmpty() && codAlmacenHasta.isEmpty()) {
                    codAlmacendesde = null;
                    codAlmacenHasta = null;
                } else if (!codAlmacendesde.isEmpty() && codAlmacenHasta.isEmpty()) {
                    codAlmacenHasta = null;
                } else if (codAlmacendesde.isEmpty() && !codAlmacenHasta.isEmpty()) {
                    codAlmacendesde = null;
                }

//Diferente a 0
//Igual 0
//Mayor a 0
//Menor a 0
//Mayor a punto maximo
//Menor a punto minimo
//Menor a punto Pedido
//Todos
                if (vista.comboNivelStock.getSelectedItem().toString().equals("Diferente a 0")) {
                    nivelStock = "DIFE";
                } else if (vista.comboNivelStock.getSelectedItem().toString().equals("Igual 0")) {
                    nivelStock = "IAO";
                } else if (vista.comboNivelStock.getSelectedItem().toString().equals("Mayor a 0")) {
                    nivelStock = "MAY";
                } else if (vista.comboNivelStock.getSelectedItem().toString().equals("Menor a 0")) {
                    nivelStock = "MEN";
                } else if (vista.comboNivelStock.getSelectedItem().toString().equals("Mayor a punto maximo")) {
                    nivelStock = "PMAX";
                } else if (vista.comboNivelStock.getSelectedItem().toString().equals("Menor a punto minimo")) {
                    nivelStock = "PMIN";
                } else if (vista.comboNivelStock.getSelectedItem().toString().equals("Menor a punto Pedido")) {
                    nivelStock = "PPED";
                } else if (vista.comboNivelStock.getSelectedItem().toString().equals("Todos")) {
                    nivelStock = "TODO";
                } else if (vista.comboNivelStock.getSelectedItem().toString().isEmpty()) {
                    nivelStock = null;
                }

//             Actual
//Actual Secundario
//Comprometido
//Comprometido Secundario
//Por Llegar
//Por Llegar Secundario
//Por Despachar Secundario
//Por Despachar	
//Disponible
//Disponible Secundario
                if (vista.comboTipoStock.getSelectedItem().toString().equals("Actual")) {
                    tipoStock = "Actual";
                } else if (vista.comboTipoStock.getSelectedItem().toString().equals("Actual Secundario")) {
                    tipoStock = "Actual Secundario";
                } else if (vista.comboTipoStock.getSelectedItem().toString().equals("Comprometido")) {
                    tipoStock = "Comprometido";
                } else if (vista.comboTipoStock.getSelectedItem().toString().equals("Comprometido Secundario")) {
                    tipoStock = "Comprometido Secundario";
                } else if (vista.comboTipoStock.getSelectedItem().toString().equals("Por Llegar")) {
                    tipoStock = "Por Llegar";
                } else if (vista.comboTipoStock.getSelectedItem().toString().equals("Por Llegar Secundario")) {
                    tipoStock = "Por Llegar Secundario";
                } else if (vista.comboTipoStock.getSelectedItem().toString().equals("Por Despachar Secundario")) {
                    tipoStock = "Por Despachar Secundario";
                } else if (vista.comboTipoStock.getSelectedItem().toString().equals("Por Despachar")) {
                    tipoStock = "Por Despachar";
                } else if (vista.comboTipoStock.getSelectedItem().toString().equals("Disponible")) {
                    tipoStock = "Disponible";
                } else if (vista.comboTipoStock.getSelectedItem().toString().equals("Disponible Secundario")) {
                    tipoStock = "Disponible Secundario";
                } else if (vista.comboTipoStock.getSelectedItem().toString().isEmpty()) {
                    tipoStock = null;
                }
                System.out.println("Tipo Stock :: " + tipoStock
                );
                parametro.put("sCo_Codigo_d", codDesde);
                parametro.put("sCo_Codigo_h", codHasta);
                parametro.put("sCo_Descripcion_d", sCo_Descripcion_d);
                parametro.put("sCo_Descripcion_h", sCo_Descripcion_h);
                parametro.put("sCo_Linea_d", codLineaDesde);
                parametro.put("sCo_Linea_h", codLineaHasta);
                parametro.put("sCo_Categoria_d", codCateDesde);
                parametro.put("sCo_Categoria_h", codCateHasta);
                parametro.put("sCo_SubLinea_d", codSubLineDesde);
                parametro.put("sCo_SubLinea_h", codSubLineaHasta);
                parametro.put("sCo_Almacen_d", codAlmacendesde);
                parametro.put("sCo_Almacen_h", codAlmacenHasta);
                parametro.put("sTipoStock", null);
                parametro.put("sCo_NivelStock", null);
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
                ex.printStackTrace();
            }

        } else if (event.getSource().equals(vista.btnCancelarImpresion)) {
            vista.jDialogReporteArticulo.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        if (vista.txtPeso == ke.getSource() || vista.txtVolumen == ke.getSource() || vista.txtMonto == ke.getSource()
                || vista.txtExistenciaMax == ke.getSource() || vista.txtPntPedido == ke.getSource() || vista.txtExistenciaMin == ke.getSource()) {
            Utilitario.ValidacionNumerica(ke);
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtcodLinea == ke.getSource()) {
            
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                ubicacion =1;
                vista.jDialogLinea.setVisible(true);
                vista.jDialogLinea.setSize(472, 358);
                vista.jDialogLinea.setLocationRelativeTo(null);
                System.out.println("Nombre de la empresa : " + lblNombreEmpresa.getText());
                cargarDatosLinea(lblNombreEmpresa.getText(),
                        "saLineaArticulo", "co_lin", "", "2");

            }
        }
        // filtrar Por Reporte Lineas
        if (vista.txtCodLineaDesde.equals(ke.getSource())) {
            
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                ubicacion = 4;
                vista.jDialogLinea.setVisible(true);
                vista.jDialogLinea.setSize(472, 358);
                vista.jDialogLinea.setLocationRelativeTo(null);
                cargarDatosLinea(lblNombreEmpresa.getText(),
                        "saLineaArticulo", "co_lin", "", "2");
            }
        } else if (vista.txtCodLineaHasta.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                ubicacion = 5;
                vista.jDialogLinea.setVisible(true);
                vista.jDialogLinea.setSize(472, 358);
                vista.jDialogLinea.setLocationRelativeTo(null);
                cargarDatosLinea(lblNombreEmpresa.getText(),
                        "saLineaArticulo", "co_lin", "", "2");
            }
        } //evento al darle F2 al campo txtCodSubLinea y muestra JDialog SubLinea
        else if (vista.txtCodSubLinea == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                // 'ADmin_a','saSublinea','co_lin','34','3','34'
                ubicacion = 1;
                cargasDatosSublinea(lblNombreEmpresa.getText(), "saSubLinea", "co_lin", vista.txtcodLinea.getText(), "3", "1");

                vista.jDialogSubLinea.setSize(472, 358);
                vista.jDialogSubLinea.setLocationRelativeTo(null);
                vista.jDialogSubLinea.setVisible(true);
            }
        } else if (vista.txtCodSubLineaDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                ubicacion = 5;
                cargasDatosSublinea(lblNombreEmpresa.getText(), "saSubLinea", "co_lin", vista.txtcodLinea.getText(), "3", "1");

                vista.jDialogSubLinea.setSize(472, 358);
                vista.jDialogSubLinea.setLocationRelativeTo(null);
                vista.jDialogSubLinea.setVisible(true);
            }
        } else if (vista.txtCodSubLineaHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                ubicacion = 6;
                cargasDatosSublinea(lblNombreEmpresa.getText(), "saSubLinea", "co_lin", vista.txtcodLinea.getText(), "3", "1");
                vista.jDialogSubLinea.setSize(472, 358);
                vista.jDialogSubLinea.setLocationRelativeTo(null);
                vista.jDialogSubLinea.setVisible(true);
            }
        } else if (vista.txtCodCategoria == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                ubicacion = 1;
                cargaDatosCategoria(lblNombreEmpresa.getText(), "saCatArticulo", "cat_des", "", "2");
                vista.jDialogCategoria.setVisible(true);
                vista.jDialogCategoria.setSize(472, 358);
                vista.jDialogCategoria.setLocationRelativeTo(null);
            }
        } else if (vista.txtCodCategoDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                ubicacion = 8;
                cargaDatosCategoria(lblNombreEmpresa.getText(), "saCatArticulo", "cat_des", "", "2");
                vista.jDialogCategoria.setVisible(true);
                vista.jDialogCategoria.setSize(472, 358);
                vista.jDialogCategoria.setLocationRelativeTo(null);
            }

        } else if (vista.txtCodCategoHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                ubicacion = 9;
                cargaDatosCategoria(lblNombreEmpresa.getText(), "saCatArticulo", "cat_des", "", "2");
                vista.jDialogCategoria.setVisible(true);
                vista.jDialogCategoria.setSize(472, 358);
                vista.jDialogCategoria.setLocationRelativeTo(null);
            }
        } else if (vista.txtCod_Color == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosColor(lblNombreEmpresa.getText(), "saColor", "des_color", "", "2");
                vista.jDialogColor.setVisible(true);
                vista.jDialogColor.setSize(472, 358);
                vista.jDialogColor.setLocationRelativeTo(null);
            }
        } else if (vista.txtCod_ubicacion == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                sCampoUbicacion = 4;
                cargarDatosUbicacion(lblNombreEmpresa.getText(), "saUbicacion", "des_ubicacion", "", "2");
                vista.jDialogUbicacion.setVisible(true);
                vista.jDialogUbicacion.setSize(472, 358);
                vista.jDialogUbicacion.setLocationRelativeTo(null);

            }
        } //Muestra en el campo Precio del Almacen la lista del Almacen
        else if (vista.txtCodAlmacenPrecio1 == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                numeroCampo = 1;
                almacenModel = new AlmacenModel();
                vista.jtablaAlmacen.setModel(new ModeloTablaAlmacen(almacenModel.pObtenerListadoDatos(lblNombreEmpresa.getText(), "saAlmacen", "Co_Alma", "", "2")));
                vista.jDialogAlmacenPrecio.setVisible(true);
                vista.jDialogAlmacenPrecio.setSize(472, 358);
                vista.jDialogAlmacenPrecio.setLocationRelativeTo(null);
            }
            //Muestra en el campo2  Precio del Almacen la lista del Almacen
        } else if (vista.txtAlmacenPrecio == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                numeroCampo = 2;
                almacenModel = new AlmacenModel();
                vista.jtablaAlmacen.setModel(new ModeloTablaAlmacen(almacenModel.pObtenerListadoDatos(lblNombreEmpresa.getText(), "saAlmacen", "Co_Alma", "", "2")));
                vista.jDialogAlmacenPrecio.setVisible(true);
                vista.jDialogAlmacenPrecio.setSize(472, 358);
                vista.jDialogAlmacenPrecio.setLocationRelativeTo(null);
            }
        } else if (vista.txtcodAlmacenDesde.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                sCampoUbicacion = 10;
                vista.jtablaAlmacen.setModel(new ModeloTablaAlmacen(almacenModel.pObtenerListadoDatos(lblNombreEmpresa.getText(), "saAlmacen", "Co_Alma", "", "2")));
                vista.jDialogAlmacenPrecio.setVisible(true);
                vista.jDialogAlmacenPrecio.setSize(472, 358);
                vista.jDialogAlmacenPrecio.setLocationRelativeTo(null);

            }
        } else if (vista.txtcodAlmacenHasta.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                sCampoUbicacion = 11;
                vista.jtablaAlmacen.setModel(new ModeloTablaAlmacen(almacenModel.pObtenerListadoDatos(lblNombreEmpresa.getText(), "saAlmacen", "Co_Alma", "", "2")));
                vista.jDialogAlmacenPrecio.setVisible(true);
                vista.jDialogAlmacenPrecio.setSize(472, 358);
                vista.jDialogAlmacenPrecio.setLocationRelativeTo(null);

            }
        } else if (vista.txtCodAlmacenUbicacion == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                numeroCampo = 3;
                almacenModel = new AlmacenModel();
                vista.jtablaAlmacen.setModel(new ModeloTablaAlmacen(almacenModel.pObtenerListadoDatos(lblNombreEmpresa.getText(), "saAlmacen", "Co_Alma", "", "2")));
                vista.jDialogAlmacenPrecio.setVisible(true);
                vista.jDialogAlmacenPrecio.setSize(472, 358);
                vista.jDialogAlmacenPrecio.setLocationRelativeTo(null);
            }

        } //llamado desde el Primer Campo 1 
        else if (vista.txtcodPrecio == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                numeroCampo = 1;
                cargarDatosTipoPrecio(1, lblNombreEmpresa.getText(), "saTipoPrecio", "Des_Precio", "", "2");
                vista.jDialogTipoPrecio.setVisible(true);
                vista.jDialogTipoPrecio.setSize(472, 358);
                vista.jDialogTipoPrecio.setLocationRelativeTo(null);
            }
        }// llamar numero de campo 2 tipo Precio
        else if (vista.txtTipoPrecio == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                numeroCampo = 2;//es llamdo al segundo Campo Tipo de Precio .
                cargarDatosTipoPrecio(1, lblNombreEmpresa.getText(), "saTipoPrecio", "Des_Precio", "", "2");
                vista.jDialogTipoPrecio.setVisible(true);
                vista.jDialogTipoPrecio.setSize(472, 358);
                vista.jDialogTipoPrecio.setLocationRelativeTo(null);
            }
        } else if (vista.txtCod1Ubicacion == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                sCampoUbicacion = 1;
                vista.jDialogUbicacion.setVisible(true);
                vista.jDialogUbicacion.setSize(472, 358);
                vista.jDialogUbicacion.setLocationRelativeTo(null);
                cargarDatosUbicacion(lblNombreEmpresa.getText(), "saUbicacion", "des_ubicacion", "", "2");
            }
        } else if (vista.cod2Ubicacion2 == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                sCampoUbicacion = 2;
                vista.jDialogUbicacion.setVisible(true);
                vista.jDialogUbicacion.setSize(472, 358);
                vista.jDialogUbicacion.setLocationRelativeTo(null);
                cargarDatosUbicacion(lblNombreEmpresa.getText(), "saUbicacion", "des_ubicacion", "", "2");
            }
        } else if (vista.cod3Ubicacion3 == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                sCampoUbicacion = 3;
                vista.jDialogUbicacion.setVisible(true);
                vista.jDialogUbicacion.setSize(472, 358);
                vista.jDialogUbicacion.setLocationRelativeTo(null);
                cargarDatosUbicacion(lblNombreEmpresa.getText(), "saUbicacion", "des_ubicacion", "", "2");
            }
        } else if (vista.txtBuscarValorAlmacen == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion = "0", sfieldName = "";
                if (vista.jRInicio2.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinal2.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquier2.isSelected()) {
                    Opcion = "2";
                } else if (vista.jRexacta2.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigo2.isSelected()) ? "Co_Alma" : "des_alma";
                vista.jtablaAlmacen.setModel(new ModeloTablaAlmacen(almacenModel.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                        "saAlmacen",
                        sfieldName,
                        vista.txtBuscarValorAlmacen.getText(),
                        Opcion)));
            }
        } else if (vista.txtBuscarValorTipoPrecio == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion3 = "0", sfieldName3 = "";
                if (vista.jRInicio3.isSelected()) {
                    Opcion3 = "0";
                } else if (vista.jRFinal3.isSelected()) {
                    Opcion3 = "1";
                } else if (vista.jrCualquier3.isSelected()) {
                    Opcion3 = "2";
                } else if (vista.jRexacta3.isSelected()) {
                    Opcion3 = "3";
                }
                sfieldName3 = (vista.jrCodigo3.isSelected()) ? "co_precio" : "Des_Precio";
                cargarDatosTipoPrecio(2, lblNombreEmpresa.getText(), "saTipoPrecio", sfieldName3, vista.txtBuscarValorTipoPrecio.getText(), Opcion3);
            }
        } //
        else if (vista.txtMonedaPrecio == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosMoneda(lblNombreEmpresa.getText(), "saMoneda", "mone_des", "", "2");
                vista.jDialogMoneda.setVisible(true);
                vista.jDialogMoneda.setSize(472, 358);
                vista.jDialogMoneda.setLocationRelativeTo(null);
            }
        } //evento al Presiona F2 para mostrar el JDialogSucursal ..
        else if (vista.txtCodSucursalUbicacion == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosSucursal(lblNombreEmpresa.getText(), "saSucursal", "sucur_des", "", "2");
                vista.JDialogoSucursal.setVisible(true);
                vista.JDialogoSucursal.setSize(472, 358);
                vista.JDialogoSucursal.setLocationRelativeTo(null);
            }
        } else if (vista.txtBuscarValorMoneda == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion4 = "0", sfieldName4 = "";
                if (vista.jRInicio4.isSelected()) {
                    Opcion4 = "0";
                } else if (vista.jRFinal4.isSelected()) {
                    Opcion4 = "1";
                } else if (vista.jrCualquier4.isSelected()) {
                    Opcion4 = "2";
                } else if (vista.jRexacta4.isSelected()) {
                    Opcion4 = "3";
                }
                sfieldName4 = (vista.jrCodigo4.isSelected()) ? "co_mone" : "mone_des";
                cargarDatosMoneda(lblNombreEmpresa.getText(), "saMoneda", sfieldName4, vista.txtBuscarValorMoneda.getText(), Opcion4);
            }
        } else if (vista.txtBuscarValorUbicacion == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion5 = "0", sfieldName5 = "";
                if (vista.jRInicio5.isSelected()) {
                    Opcion5 = "0";
                } else if (vista.jRFinal5.isSelected()) {
                    Opcion5 = "1";
                } else if (vista.jrCualquier5.isSelected()) {
                    Opcion5 = "2";
                } else if (vista.jRexacta5.isSelected()) {
                    Opcion5 = "3";
                }
                sfieldName5 = (vista.jrCodigo5.isSelected()) ? "co_ubicacion" : "des_ubicacion";
                cargarDatosUbicacion("Admin_A", "saUbicacion", sfieldName5, vista.txtBuscarValorUbicacion.getText(), Opcion5);
            }
        } else if (vista.txtValorBuscarSucursal == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion6 = "0", sfieldName6 = "";
                if (vista.jRInicio6.isSelected()) {
                    Opcion6 = "0";
                } else if (vista.jRFinal6.isSelected()) {
                    Opcion6 = "1";
                } else if (vista.jrCualquier6.isSelected()) {
                    Opcion6 = "2";
                } else if (vista.jRexacta6.isSelected()) {
                    Opcion6 = "3";
                }
                sfieldName6 = (vista.rjcodigo6.isSelected()) ? "co_sucur" : "sucur_des";
                cargarDatosSucursal(lblNombreEmpresa.getText(), "saSucursal", sfieldName6, vista.txtValorBuscarSucursal.getText(), Opcion6);
            }

        } else if (vista.txtvalorLineaBuscar == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion7 = "0", sfieldName7 = "";
                if (vista.jRInicio7.isSelected()) {
                    Opcion7 = "0";
                } else if (vista.jRFinal7.isSelected()) {
                    Opcion7 = "1";
                } else if (vista.jrCualquier7.isSelected()) {
                    Opcion7 = "2";
                } else if (vista.jRexacta7.isSelected()) {
                    Opcion7 = "3";
                }
                sfieldName7 = (vista.rjcodigo7.isSelected()) ? "Co_lin" : "lin_des";

                cargarDatosLinea(lblNombreEmpresa.getText(), "saLineaArticulo", sfieldName7, vista.txtvalorLineaBuscar.getText(), Opcion7);
            }
        } else if (vista.txtBuscarValorSubLinea == ke.getSource()) {
            String Opcion8 = "0", sfieldName8 = "";
            if (vista.jRInicio8.isSelected()) {
                Opcion8 = "0";
            } else if (vista.jRFinal8.isSelected()) {
                Opcion8 = "1";
            } else if (vista.jrCualquier8.isSelected()) {
                Opcion8 = "2";
            } else if (vista.jRexacta8.isSelected()) {
                Opcion8 = "3";
            }
            sfieldName8 = (vista.jrCodigo8.isSelected()) ? "co_subl" : "subl_des";
            cargasDatosSublinea(lblNombreEmpresa.getText(), "saSubLinea", sfieldName8, vista.txtBuscarValorSubLinea.getText(), Opcion8, vista.txtcodLinea.getText());
        } else if (vista.txtvalorBusquedaCategoria == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion9 = "0", sfieldName9 = "";
                if (vista.jRInicio9.isSelected()) {
                    Opcion9 = "0";
                } else if (vista.jRFinal9.isSelected()) {
                    Opcion9 = "1";
                } else if (vista.jrCualquier9.isSelected()) {
                    Opcion9 = "2";
                } else if (vista.jRexacta9.isSelected()) {
                    Opcion9 = "3";
                }
                sfieldName9 = (vista.rjcodigo9.isSelected()) ? "co_cat" : "cat_des";
                cargaDatosCategoria(lblNombreEmpresa.getText(),
                        "saCatArticulo", sfieldName9,
                        vista.txtvalorBusquedaCategoria.getText(), Opcion9);
            }
        } else if (vista.txtBuscarValorColor == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion10 = "0", sfieldName10 = "";
                if (vista.jRInicio9.isSelected()) {
                    Opcion10 = "0";
                } else if (vista.jRFinal9.isSelected()) {
                    Opcion10 = "1";
                } else if (vista.jrCualquier9.isSelected()) {
                    Opcion10 = "2";
                } else if (vista.jRexacta9.isSelected()) {
                    Opcion10 = "3";
                }
                sfieldName10 = (vista.jrCodigo10.isSelected()) ? "co_color" : "des_color";
                cargarDatosColor(lblNombreEmpresa.getText(), "saColor",
                        sfieldName10,
                        vista.txtBuscarValorColor.getText(),
                        Opcion10);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    //metodo donde carga los datos dentro de la tabla unidades renglon
    public void cargarDatos(ArrayList<ArtUnidadBO> listaArtUnidadBO) {
        ArrayList<ArtUnidadBO> lista = new ArrayList<ArtUnidadBO>();
        lista = artiunidadModel.pSeleccionarUnidadArticuloRenglon(vista.txtcodArticulo.getText().replaceAll("\\s", ""));
        vista.modelotablaunidadartRenglon.setListArtUnidad(lista);
    }

    public void cargarDatosPrecios(String CoArticulo) {
        artprecioModel = new ArtPrecioModel();
        ArrayList<ArtPrecioBO> lista = new ArrayList<ArtPrecioBO>();
        lista = artprecioModel.pObtenerListadoDatosPrecios(lblNombreEmpresa.getText(), "saArtPrecio", "co_art", CoArticulo, "3");
        modeloTablaArtPrecioRenglon.setArrayListaartPrecio(lista);
        vista.JtablePrecio.setModel(modeloTablaArtPrecioRenglon);
        modeloTablaArtPrecioRenglon.refrescarTable();
    }

    //metodo donde carga los datos dentro de la tabla Articulos Art Ubicacion renglon
    public void cargarDatosArtUbicacionRenglon(String co_ubicacion, int posicion, String codSucursal) {

        // artUbicacionModel = new ArtUbicacionModel();
        ArrayList<ArtUbicacionBO> lista = new ArrayList<>();
        if (posicion == 2 && !codSucursal.isEmpty()) {
            lista = artUbicacionModel.pObtenerListadoDatosArtUbicacion(lblNombreEmpresa.getText(), "saArtUbicacion", "co_art", co_ubicacion, "3", codSucursal);
        } else {
            lista = artUbicacionModel.pObtenerListadoArtUbicacion(lblNombreEmpresa.getText(), "saArtUbicacion", "co_art", co_ubicacion, "3");
        }
        modeloartUbicacionRenglones.setListaArtUbicacion(lista);
        vista.JtableArtUbicacion.setModel(modeloartUbicacionRenglones);
        modeloartUbicacionRenglones.refrescarTable();
    }

    public void cargarDatosTipoPrecio(int numero, String BD, String tabla, String fieldName, String Valor, String opcion) {
        tipoPrecioModelo = new TipoPrecioModelo();
        ArrayList<TipoPrecioBO> lista = null;
        if (numero == 1) {
            lista = tipoPrecioModelo.pObtenerListadoDatos(BD, tabla, fieldName, Valor, opcion);
        } else {
            lista = tipoPrecioModelo.pObtenerListadoDatos(BD, tabla, fieldName, Valor, opcion);
        }
        vista.jtablaTipoPrecio.setModel(new ModeloTablaTipoPrecio(lista));
    }

    public void buscarPrecio(String codArticulo, String almacen, String tipoPrecio) {
        ArrayList<ArtPrecioBO> lista = new ArrayList<ArtPrecioBO>();
        lista = artprecioModel.pBuscarPrecios(codArticulo, almacen, tipoPrecio);
        modeloTablaArtPrecioRenglon.setArrayListaartPrecio(lista);
        vista.JtablePrecio.setModel(modeloTablaArtPrecioRenglon);
        modeloTablaArtPrecioRenglon.refrescarTable();
    }

    public void cargarDatosMoneda(String BD, String tabla, String fieldName, String Valor, String opcion) {
        vista.jtablaMoneda.setModel(new ModeloTablaMoneda(new MonedaModel().pObtenerListadoDatos(BD, tabla, fieldName, Valor, opcion)));
    }

    //Carga en la Tabla los registros de la tabla saUbicacion
    public void cargarDatosUbicacion(String BD, String tabla, String fieldName, String Valor, String opcion) {
        vista.jtablaUbicacion.setModel(new ModeloTablaUbicacion(new UbicacionModel().pObtenerListadoDatos(BD, tabla, fieldName, Valor, opcion)));
    }

    //Cargar datos de la tabla saSucursal en el JDIALOG
    public void cargarDatosSucursal(String BD, String tabla, String fieldName, String Valor, String opcion) {
        vista.jtableSucursal.setModel(new ModeloTablaSucursal(new SucursalModelo().pObtenerListadoDatos(BD, tabla, fieldName, Valor, opcion)));
    }

    public void cargarDatosLinea(String BD, String tabla, String fieldName, String valor, String opcion) {
        lineaModel = new LineaModel();
        vista.jTablaLinea.setModel(new ModeloTablaLinea(lineaModel.pObtenerListadoDatos(
                BD,//sDatabase_Name
                tabla, //"saLineaArticulo",
                fieldName,//sfieldName,//sField_Name
                valor,//Valor
                opcion//@iOpcion
        )));
    }

    public void cargasDatosSublinea(String BD, String tabla, String fieldName, String valor, String opcion, String condicion) {
        vista.jtableSubLinea.setModel(new ModeloTablaSubLinea(new SublineaModel().pObtenerListadoDatosSubLinea(BD, tabla, fieldName, valor, opcion, condicion)));
    }

    public void cargaDatosCategoria(String BD, String tabla, String fieldName, String valor, String opcion) {
        CategoriaModel categoriamodelo = new CategoriaModel();
        vista.jtablaCategoria.setModel(new ModeloTablaCategoria(categoriamodelo.pObtenerListadoDatos(
                BD,//sDatabase_Name
                tabla,
                fieldName,//sField_Name
                valor,//Valor
                opcion//@iOpcion
        )));
    }

    public void cargarDatosColor(String BD, String tabla, String fieldName, String valor, String opcion) {
        ColorModel colorModelo = new ColorModel();
        vista.jtablaColor.setModel(new ModeloTablaColor(colorModelo.pObtenerListadoDatos(
                BD,//sDatabase_Name
                tabla,
                fieldName,//sField_Name
                valor,//Valor
                opcion//@iOpcion
        )));

    }

    public void setteCamposPrecios() {
        vista.txtTipoPrecio.setText("");
        vista.txtAlmacenPrecio.setText("");
        vista.txtMonedaPrecio.setText("");
        vista.txtMontoPrecio.setText("");
        vista.fechaDesde.setDate(new Date());
        vista.fechaHasta.setDate(new Date());
    }

    public void setteCampoArticuUbicacion() {
        vista.txtCodAlmacenUbicacion.setText("");
        vista.txtDescripcionAlmacenUbicacion.setText("");
        vista.txtCod1Ubicacion.setText("");
        vista.txtdescripcionUbicacion1.setText("");
        vista.cod2Ubicacion2.setText("");
        vista.txtdescripcionUbicacion2.setText("");
        vista.cod3Ubicacion3.setText("");
        vista.txtdescripcionUbicacion3.setText("");
        vista.txtDescripcionUbicacionAlmacen.setText("");
        vista.txtOrdenArtUbicacion.setText("");
    }

    public void cargarDatospConsultarStockxAlmacen(String pco_art, String pco_alma, String tipoSP) {
        StockxAlmacenModel stockxAlmacenModel = new StockxAlmacenModel();
        vista.jtablaStockxAlmacen.setModel(new ModeloTablaStockxAlamacen(stockxAlmacenModel.pConsultarStockxAlmacen(pco_art, pco_alma, tipoSP)));
    }
}
