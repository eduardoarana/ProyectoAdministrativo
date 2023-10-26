/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Beans.*;
import Controller.ArticuloController;
import Model.ArtUnidadModel;
import Model.ArticuloModel;

import Model.ModelTablaArticulos;
import Model.ModeloTablaUnidad;
import Model.ModeloTablaUnidadArticuloRenglon;

import Model.UnidadModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static Vista.Vistaprincipal.lblNombreEmpresa;

/**
 *
 * @author earana
 */
public class VistaArticulo extends javax.swing.JPanel {

    /**
     * Creates new form VistaContrato
     */
//    LineaModel lineamodelo;
//    SublineaModel sublineaModel;
//    CategoriaModel categoriaModel;
//    ColorModel colorModel;
//    UbicacionModel ubicacionModel;
    ArrayList<LineaBO> listaLinea;
    ArrayList<SubLineaBO> listaSubLineas;
    ArrayList<CategoriaBO> listaCAtegoria;
    ArrayList<ColorBO> listaColor;
    ArrayList<UbicacionBO> listaUbicacion;
    ArticuloController articuloController;
    ArticuloModel articuloModel;
    //public DefaultTableModel modeloTablaArtUnidad;
    ArtUnidadModel artUnidadModel;
    public ModeloTablaUnidadArticuloRenglon modelotablaunidadartRenglon = new ModeloTablaUnidadArticuloRenglon();
    //RenglonArticuloUnidadReng renglo ;

    //llenar la Tabla Articulos
    public void setModel() {

        jtablaArticulos.setModel(new ModelTablaArticulos(articuloModel.pObtenerListadoDatosArticulos(
                "admin_a",
                "Art_Des", "",
                "0",
                "1", "0", "0", "0", "0", "0", "0",
                /*
                 * Obligatorio tipo
                 */ "0",
                "V",
                "0", "", "0", "", "0", "", "0", "", "0", "", "0", "", "0", "", "0", "", "")));

    }

    public VistaArticulo() {

        initComponents();
        setterCampos();

        jTableArtUnidad.setModel(modelotablaunidadartRenglon);
//        lineamodelo = new LineaModel();
//        sublineaModel = new SublineaModel();
//        categoriaModel = new CategoriaModel();
//        colorModel = new ColorModel();
//        ubicacionModel = new UbicacionModel();
        articuloModel = new ArticuloModel();

//        listaLinea = new ArrayList<LineaBO>();
//        listaSubLineas = new ArrayList<SubLineaBO>();
//        listaCAtegoria = new ArrayList<CategoriaBO>();
//        listaColor = new ArrayList<ColorBO>();
//        listaUbicacion = new ArrayList<UbicacionBO>();
        articuloController = new ArticuloController(this);
        btnGuardar1.addActionListener(articuloController);
        btnactulizar.addActionListener(articuloController);
        btnEliminar1.addActionListener(articuloController);
        btnNuevo1.addActionListener(articuloController);
        Aceptar.addActionListener(articuloController);
        btnCancelar.addActionListener(articuloController);
        btnaceptarRelacionUnidad.addActionListener(articuloController);
        btnAceptarunidad.addActionListener(articuloController);
        txtMonto.addKeyListener(articuloController);
        txtPeso.addKeyListener(articuloController);
        txtVolumen.addKeyListener(articuloController);
        txtGarantia.addKeyListener(articuloController);
        txtcod_unidad2.addKeyListener(articuloController);
        btnUnidad.addActionListener(articuloController);
        btnAddArtUnidad.addActionListener(articuloController);
        btnGuardarArrUnidad.addActionListener(articuloController);
        btnCancelarUnidad.addActionListener(articuloController);
        btnrestar.addActionListener(articuloController);
        btnPrecio.addActionListener(articuloController);
        btnrestarPrecio.addActionListener(articuloController);
        btnGuardarArtPrecio.addActionListener(articuloController);
        btnAgregarPrecio.addActionListener(articuloController);
        btnRefresh.addActionListener(articuloController);
        btnBuscarPrecio.addActionListener(articuloController);
        txtCodAlmacenPrecio1.addKeyListener(articuloController);
        txtBuscarValorAlmacen.addKeyListener(articuloController);
        txtExistenciaMax.addKeyListener(articuloController);
        txtExistenciaMin.addKeyListener(articuloController);
        txtBuscarValorTipoPrecio.addKeyListener(articuloController);
        txtPntPedido.addKeyListener(articuloController);
        txtcodPrecio.addKeyListener(articuloController);
        btnAceptartipoPrecio.addActionListener(articuloController);
        btnCancelarTipoPrecio.addActionListener(articuloController);
        btnAceptarAlmacen.addActionListener(articuloController);
        btnCancelarAlmacen.addActionListener(articuloController);
        txtTipoPrecio.addKeyListener(articuloController);
        txtAlmacenPrecio.addKeyListener(articuloController);
        txtMonedaPrecio.addKeyListener(articuloController);
        txtMontoPrecio.addKeyListener(articuloController);
        txtBuscarValorMoneda.addKeyListener(articuloController);
        btnAceptarMoneda.addActionListener(articuloController);
        btnCancelarMoneda.addActionListener(articuloController);
        btnUbicacion.addActionListener(articuloController);
        btnGuardarArtUbicacion.addActionListener(articuloController);
        btnAgregarArtUbicacion.addActionListener(articuloController);

        txtCod1Ubicacion.addKeyListener(articuloController);
        cod2Ubicacion2.addKeyListener(articuloController);
        cod3Ubicacion3.addKeyListener(articuloController);
        txtBuscarValorUbicacion.addKeyListener(articuloController);
        btnCancelarUbicacion.addActionListener(articuloController);
        btnAceptarUbicacion.addActionListener(articuloController);
        txtCodAlmacenUbicacion.addKeyListener(articuloController);
        txtCodSucursalUbicacion.addKeyListener(articuloController);
        btnCancelarSucursal.addActionListener(articuloController);
        btnAceptarSucursal.addActionListener(articuloController);
        txtValorBuscarSucursal.addKeyListener(articuloController);
        btnrestaArtUbicacion.addActionListener(articuloController);
        btnLimpiar.addActionListener(articuloController);
        btbBuscarSucursal.addActionListener(articuloController);
        txtcodLinea.addKeyListener(articuloController);
        txtCodSubLinea.addKeyListener(articuloController);
        txtCodCategoria.addKeyListener(articuloController);
        txtCod_Color.addKeyListener(articuloController);
        txtCod_ubicacion.addKeyListener(articuloController);
        btnAceptarLinea.addActionListener(articuloController);
        btnCancelarLinea.addActionListener(articuloController);
        btnAceptarSubLinea.addActionListener(articuloController);
        btnCancelarSubLinea.addActionListener(articuloController);
        txtvalorBusquedaCategoria.addKeyListener(articuloController);
        btnAceptarColor.addActionListener(articuloController);
        btnCancelarColor.addActionListener(articuloController);
        txtBuscarValorColor.addKeyListener(articuloController);
        btnAceptarCategoria.addActionListener(articuloController);
        btnExistencia.addActionListener(articuloController);
        btnBuscarExistencia.addActionListener(articuloController);
        btnImprimir1.addActionListener(articuloController);
        txtvalorLineaBuscar.addKeyListener(articuloController);
        txtBuscarValorSubLinea.addKeyListener(articuloController);
        txtCodLineaDesde.addKeyListener(articuloController);
        txtCodLineaHasta.addKeyListener(articuloController);
        txtCodSubLineaDesde.addKeyListener(articuloController);
        txtCodSubLineaHasta.addKeyListener(articuloController);
        txtcodAlmacenDesde.addKeyListener(articuloController);
        txtcodAlmacenHasta.addKeyListener(articuloController);
        txtCodCategoDesde.addKeyListener(articuloController);
        txtCodCategoHasta.addKeyListener(articuloController);
        btnAceptarImprimirReporte.addActionListener(articuloController);
        btnCancelarImpresion.addActionListener(articuloController);
        artUnidadModel = new ArtUnidadModel();

        //modeloTablaArtUnidad = (DefaultTableModel) jTableArtUnidad.getModel();
        //Agregar la columnas de las Tablas de Articulo unidades ...
        try {
//            listaLinea = lineamodelo.listaLineas();
//            for (int c = 0; c < listaLinea.size(); c++) {
//                selectLinea.addItem(listaLinea.get(c).getLin_des());
//            }
//            listaSubLineas = sublineaModel.listaSubLineas();
//            for (int i = 0; i < listaSubLineas.size(); i++) {
//                selectSublinea.addItem(listaSubLineas.get(i).getSubl_des());
//            }
//            listaCAtegoria = categoriaModel.listaCategoriaArticulos();
//            for (int i = 0; i < listaCAtegoria.size(); i++) {
//                selectCategoria.addItem(listaCAtegoria.get(i).getCat_des());
//            }

//            listaColor = colorModel.listaColores();
//            for (int i = 0; i < listaColor.size(); i++) {
//                selectColor.addItem(listaColor.get(i).getDes_color());
//            }
//            listaUbicacion = ubicacionModel.listaUbicacion();
//            for (int i = 0; i < listaUbicacion.size(); i++) {
//                selectUbicacion.addItem(listaUbicacion.get(i).getDes_ubicacion());
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<ArtUnidadBO> listaArticulos = new ArrayList<ArtUnidadBO>();
        listaArticulos = artUnidadModel.pSeleccionarUnidadArticuloRenglon(txtCod_articulo2.getText());

        //  renglo = new RenglonArticuloUnidadReng(listaArticulos);
    }

    public void setterCampos() {
        txtcodArticulo.setText("");
        txtMonto.setText("00");
        txtModelo.setText("");
        txtPeso.setText("00");
        txtPntPedido.setText("00");
        txtVolumen.setText("00");
        txtItem.setText("");
        txtGarantia.setText("N/A");
        txtExistenciaMin.setText("00");
        txtExistenciaMax.setText("00");
        txtDescripcionArt.setText("");
        txtReferencia.setText("");
        selecTipo.setSelectedItem(1);
        jGenerico.setSelected(false);
        jCostoBase.setSelectedIndex(1);
        jRadioManejaPrimaria.setSelected(true);
        jRadioManejaSecundaria.setSelected(false);
        btngrupoBusquedArticulo.setSelected(true);
        fechregistro.setDate(new Date());
        selecTipo.setSelectedIndex(0);
        tipoImpuesto.setSelectedIndex(0);
        jseriales.setSelected(false);
        jvencidos.setSelected(false);
        jutilizalotes.setSelected(false);
//        selectCategoria.setSelectedIndex(0);
//        selectColor.setSelectedIndex(0);
//        selectLinea.setSelectedIndex(0);
//        selectSublinea.setSelectedIndex(0);
//        selectUbicacion.setSelectedIndex(0);
        txtcodLinea.setText("");
        txtDescripcionLinea.setText("");
        txtCodSubLinea.setText("");
        txtdescripSubLinea.setText("");
        txtCodCategoria.setText("");
        txtDescripcionCategoria.setText("");
        txtCod_Color.setText("");
        txtDescripcionColor.setText("");
        txtCod_ubicacion.setText("");
        txtDescripcionUbicacion.setText("");
        btnactulizar.setEnabled(false);
        btnEliminar1.setEnabled(false);
        btnGuardar1.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoOpcion = new javax.swing.ButtonGroup();
        grupoBuscar = new javax.swing.ButtonGroup();
        jDialogArticulo = new javax.swing.JDialog();
        Aceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtBucscar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaArticulos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btngrupoBusquedArticulo = new javax.swing.JRadioButton();
        jrDescripcion = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jRInicio = new javax.swing.JRadioButton();
        jRFinal = new javax.swing.JRadioButton();
        jrCualquier = new javax.swing.JRadioButton();
        jRexacta = new javax.swing.JRadioButton();
        jDialogRelacionUnidad = new javax.swing.JDialog();
        txtCodArticulo = new javax.swing.JTextField();
        lblArt = new javax.swing.JLabel();
        jruniprimaria = new javax.swing.JRadioButton();
        jruniSecundaria = new javax.swing.JRadioButton();
        JpanelAddUnidadPrin = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtCodUnidad = new javax.swing.JTextField();
        txtDescripcionRelacionUnidad = new javax.swing.JTextField();
        btnaceptarRelacionUnidad = new javax.swing.JButton();
        btnCancelarRelacionUnidad = new javax.swing.JButton();
        JDialogUnidad = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtablaUnidad = new javax.swing.JTable();
        txtvalorUnidad = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jRInicio1 = new javax.swing.JRadioButton();
        jRFinal1 = new javax.swing.JRadioButton();
        jrCualquier1 = new javax.swing.JRadioButton();
        jRexacta1 = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jrCodigo1 = new javax.swing.JRadioButton();
        jrDescripcion1 = new javax.swing.JRadioButton();
        btnAceptarunidad = new javax.swing.JButton();
        btnCancelarUnidad = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        DialogArtUnidad = new javax.swing.JDialog();
        jToolBar1 = new javax.swing.JToolBar();
        btnGuardarArrUnidad = new javax.swing.JButton();
        btnactulizar1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnrestar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtCod_articulo2 = new javax.swing.JTextField();
        txtArtdescripcion2 = new javax.swing.JTextField();
        jruniprimaria1 = new javax.swing.JRadioButton();
        jruniSecundaria1 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableArtUnidad = new javax.swing.JTable();
        txtcod_unidad2 = new javax.swing.JTextField();
        txtDescripcionArtUnidad2 = new javax.swing.JTextField();
        btnAddArtUnidad = new javax.swing.JButton();
        jchePrincipalPrimaria = new javax.swing.JCheckBox();
        jchPrimariaUnidad = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        txtEquivalenciaUnidad = new javax.swing.JTextField();
        btnGrupoOpcionArticulo = new javax.swing.ButtonGroup();
        btnGrupobusquedaArticulo = new javax.swing.ButtonGroup();
        btnGrupoOpcionUnidad = new javax.swing.ButtonGroup();
        btnGrupoBusquedaUnidad = new javax.swing.ButtonGroup();
        jDialogPrecio = new javax.swing.JDialog();
        jToolBar3 = new javax.swing.JToolBar();
        btnGuardarArtPrecio = new javax.swing.JButton();
        btnImprimir2 = new javax.swing.JButton();
        btnrestarPrecio = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtCodAlmacenPrecio1 = new javax.swing.JTextField();
        txtdescripcionPrecio = new javax.swing.JTextField();
        jlbPrecio = new javax.swing.JLabel();
        txtcodPrecio = new javax.swing.JTextField();
        txtDescripcionPrecio = new javax.swing.JTextField();
        btnBuscarPrecio = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        JtablePrecio = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txtTipoPrecio = new javax.swing.JTextField();
        lblAlmacen = new javax.swing.JLabel();
        txtAlmacenPrecio = new javax.swing.JTextField();
        jLblMoneda = new javax.swing.JLabel();
        txtMonedaPrecio = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtMontoPrecio = new javax.swing.JTextField();
        fechaDesde = new com.toedter.calendar.JDateChooser();
        lblDesde = new javax.swing.JLabel();
        fechaHasta = new com.toedter.calendar.JDateChooser();
        lblHasta = new javax.swing.JLabel();
        btnAgregarPrecio = new javax.swing.JButton();
        txtArticuloPrecio = new javax.swing.JTextField();
        txtDescripcionArticuloPrecio = new javax.swing.JTextField();
        jDialogAlmacenPrecio = new javax.swing.JDialog();
        txtBuscarValorAlmacen = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtablaAlmacen = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jRInicio2 = new javax.swing.JRadioButton();
        jRFinal2 = new javax.swing.JRadioButton();
        jrCualquier2 = new javax.swing.JRadioButton();
        jRexacta2 = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jrCodigo2 = new javax.swing.JRadioButton();
        jrDescripcion2 = new javax.swing.JRadioButton();
        btnAceptarAlmacen = new javax.swing.JButton();
        btnCancelarAlmacen = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        grupoAlmacenOpcion = new javax.swing.ButtonGroup();
        GrupoAlmacenBusqueda = new javax.swing.ButtonGroup();
        jDialogTipoPrecio = new javax.swing.JDialog();
        jLabel26 = new javax.swing.JLabel();
        txtBuscarValorTipoPrecio = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtablaTipoPrecio = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jRInicio3 = new javax.swing.JRadioButton();
        jRFinal3 = new javax.swing.JRadioButton();
        jrCualquier3 = new javax.swing.JRadioButton();
        jRexacta3 = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jrCodigo3 = new javax.swing.JRadioButton();
        jrDescripcion3 = new javax.swing.JRadioButton();
        btnAceptartipoPrecio = new javax.swing.JButton();
        btnCancelarTipoPrecio = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jDialogMoneda = new javax.swing.JDialog();
        jLabel28 = new javax.swing.JLabel();
        txtBuscarValorMoneda = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtablaMoneda = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jRInicio4 = new javax.swing.JRadioButton();
        jRFinal4 = new javax.swing.JRadioButton();
        jrCualquier4 = new javax.swing.JRadioButton();
        jRexacta4 = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jrCodigo4 = new javax.swing.JRadioButton();
        jrDescripcion4 = new javax.swing.JRadioButton();
        btnAceptarMoneda = new javax.swing.JButton();
        btnCancelarMoneda = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        btnGrupoOpcionMoneda = new javax.swing.ButtonGroup();
        btnGrupoBusquedaMoneda = new javax.swing.ButtonGroup();
        jDialogArtUbicacion = new javax.swing.JDialog();
        jToolBar4 = new javax.swing.JToolBar();
        btnGuardarArtUbicacion = new javax.swing.JButton();
        btnImprimir3 = new javax.swing.JButton();
        btnrestaArtUbicacion = new javax.swing.JButton();
        btnRefresh1 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jlbPrecio1 = new javax.swing.JLabel();
        txtCodSucursalUbicacion = new javax.swing.JTextField();
        txtDescripcionSucursalUbicacion = new javax.swing.JTextField();
        btbBuscarSucursal = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        JtableArtUbicacion = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        btnAgregarArtUbicacion = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        txtCodAlmacenUbicacion = new javax.swing.JTextField();
        txtDescripcionAlmacenUbicacion = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtCod1Ubicacion = new javax.swing.JTextField();
        txtdescripcionUbicacion1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        cod2Ubicacion2 = new javax.swing.JTextField();
        txtdescripcionUbicacion2 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        cod3Ubicacion3 = new javax.swing.JTextField();
        txtdescripcionUbicacion3 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtDescripcionUbicacionAlmacen = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtOrdenArtUbicacion = new javax.swing.JTextField();
        txtArticuloUbicacion = new javax.swing.JTextField();
        txtDescripcionArticuloUbicacion = new javax.swing.JTextField();
        jDialogUbicacion = new javax.swing.JDialog();
        jLabel37 = new javax.swing.JLabel();
        txtBuscarValorUbicacion = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtablaUbicacion = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jRInicio5 = new javax.swing.JRadioButton();
        jRFinal5 = new javax.swing.JRadioButton();
        jrCualquier5 = new javax.swing.JRadioButton();
        jRexacta5 = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        jrCodigo5 = new javax.swing.JRadioButton();
        jrDescripcion5 = new javax.swing.JRadioButton();
        btnAceptarUbicacion = new javax.swing.JButton();
        btnCancelarUbicacion = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        btnGrupoBusquedaUbicacion = new javax.swing.ButtonGroup();
        btnGrupoOpcionUbicacion = new javax.swing.ButtonGroup();
        JDialogoSucursal = new javax.swing.JDialog();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtableSucursal = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();
        jRInicio6 = new javax.swing.JRadioButton();
        jRFinal6 = new javax.swing.JRadioButton();
        jrCualquier6 = new javax.swing.JRadioButton();
        jRexacta6 = new javax.swing.JRadioButton();
        jPanel25 = new javax.swing.JPanel();
        rjcodigo6 = new javax.swing.JRadioButton();
        jrDescripcion6 = new javax.swing.JRadioButton();
        btnAceptarSucursal = new javax.swing.JButton();
        btnCancelarSucursal = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        txtValorBuscarSucursal = new javax.swing.JTextField();
        btngrupoSucurOpcion = new javax.swing.ButtonGroup();
        btngrupoSucurBusqueda = new javax.swing.ButtonGroup();
        jDialogLinea = new javax.swing.JDialog();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTablaLinea = new javax.swing.JTable();
        btnAceptarLinea = new javax.swing.JButton();
        btnCancelarLinea = new javax.swing.JButton();
        btnGrupoBusquedaLinea = new javax.swing.JPanel();
        rjcodigo7 = new javax.swing.JRadioButton();
        jrDescripcion7 = new javax.swing.JRadioButton();
        jPanel27 = new javax.swing.JPanel();
        jRInicio7 = new javax.swing.JRadioButton();
        jRFinal7 = new javax.swing.JRadioButton();
        jrCualquier7 = new javax.swing.JRadioButton();
        jRexacta7 = new javax.swing.JRadioButton();
        txtvalorLineaBuscar = new javax.swing.JTextField();
        jDialogSubLinea = new javax.swing.JDialog();
        jLabel42 = new javax.swing.JLabel();
        txtBuscarValorSubLinea = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        jtableSubLinea = new javax.swing.JTable();
        jPanel28 = new javax.swing.JPanel();
        jRInicio8 = new javax.swing.JRadioButton();
        jRFinal8 = new javax.swing.JRadioButton();
        jrCualquier8 = new javax.swing.JRadioButton();
        jRexacta8 = new javax.swing.JRadioButton();
        jPanel29 = new javax.swing.JPanel();
        jrCodigo8 = new javax.swing.JRadioButton();
        jrDescripcion8 = new javax.swing.JRadioButton();
        btnAceptarSubLinea = new javax.swing.JButton();
        btnCancelarSubLinea = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        btngrupoOpcionSublinea = new javax.swing.ButtonGroup();
        btngrupoBusquedaSublinea = new javax.swing.ButtonGroup();
        jDialogCategoria = new javax.swing.JDialog();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jtablaCategoria = new javax.swing.JTable();
        jPanel30 = new javax.swing.JPanel();
        jRInicio9 = new javax.swing.JRadioButton();
        jRFinal9 = new javax.swing.JRadioButton();
        jrCualquier9 = new javax.swing.JRadioButton();
        jRexacta9 = new javax.swing.JRadioButton();
        jPanel31 = new javax.swing.JPanel();
        rjcodigo9 = new javax.swing.JRadioButton();
        jrDescripcion9 = new javax.swing.JRadioButton();
        btnAceptarCategoria = new javax.swing.JButton();
        btnCancelarCategoria = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        txtvalorBusquedaCategoria = new javax.swing.JTextField();
        jDialogColor = new javax.swing.JDialog();
        jScrollPane14 = new javax.swing.JScrollPane();
        jtablaColor = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jRInicio10 = new javax.swing.JRadioButton();
        jRFinal10 = new javax.swing.JRadioButton();
        jrCualquier10 = new javax.swing.JRadioButton();
        jRexacta10 = new javax.swing.JRadioButton();
        jPanel33 = new javax.swing.JPanel();
        jrCodigo10 = new javax.swing.JRadioButton();
        jrDescripcion10 = new javax.swing.JRadioButton();
        btnAceptarColor = new javax.swing.JButton();
        btnCancelarColor = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        txtBuscarValorColor = new javax.swing.JTextField();
        btnGrupoOpcionLinea = new javax.swing.ButtonGroup();
        btnBusquedaLinea = new javax.swing.ButtonGroup();
        btngrupoOpcionCategoria = new javax.swing.ButtonGroup();
        btnGrupoBusquedaCategoria = new javax.swing.ButtonGroup();
        btnGrupoOpcionColor = new javax.swing.ButtonGroup();
        btnGrupoBusquedaColor = new javax.swing.ButtonGroup();
        jDialogExixtencias = new javax.swing.JDialog();
        jLabel48 = new javax.swing.JLabel();
        txtArticuloExiste = new javax.swing.JTextField();
        txtArticuloExistenciaDescripcion = new javax.swing.JTextField();
        txtcodUnidadExistencia = new javax.swing.JTextField();
        txtUnidadExistenciaDescripcion = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txtCodUnidadSecExistencia = new javax.swing.JTextField();
        txtUnidadSecExistenciaDescripcion = new javax.swing.JTextField();
        jScrollPane15 = new javax.swing.JScrollPane();
        jtablaStockxAlmacen = new javax.swing.JTable();
        jPanel26 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        txtMinRecomendada = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtMaxRecomendada = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        txtPuntoPedido = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        jrTotal = new javax.swing.JRadioButton();
        jrPorAlmacen = new javax.swing.JRadioButton();
        btnBuscarExistencia = new javax.swing.JButton();
        btnGrupoMostrarExistencia = new javax.swing.ButtonGroup();
        jDialogReporteArticulo = new javax.swing.JDialog();
        jPanel35 = new javax.swing.JPanel();
        comboReporteSucursal = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        comboOrdenar = new javax.swing.JComboBox<>();
        comboCriterio = new javax.swing.JComboBox<>();
        jPanel36 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnDesde = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        txtCodLineaDesde = new javax.swing.JTextField();
        txtCodLineadescrip = new javax.swing.JTextField();
        txtCodLineaHasta = new javax.swing.JTextField();
        txtCodLineadescrip2 = new javax.swing.JTextField();
        txtCodSubLineaDescriHasta = new javax.swing.JTextField();
        txtCodSubLineaHasta = new javax.swing.JTextField();
        txtCodSubLineadescrip1 = new javax.swing.JTextField();
        txtCodSubLineaDesde = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtCodCategoDesde = new javax.swing.JTextField();
        txtCodCategoDesdedescrip = new javax.swing.JTextField();
        txtCodCategoHasta = new javax.swing.JTextField();
        txtCodCategodescripHasta = new javax.swing.JTextField();
        txtCodAlmacenHastaDescrip = new javax.swing.JTextField();
        txtcodAlmacenHasta = new javax.swing.JTextField();
        txtCodAlmacenDesdedescrip = new javax.swing.JTextField();
        txtcodAlmacenDesde = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        comboNivelStock = new javax.swing.JComboBox<>();
        comboTipoStock = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        txtDescripArtHasta = new javax.swing.JTextField();
        txtCodArtHasta = new javax.swing.JTextField();
        txtDescripArtDesde = new javax.swing.JTextField();
        txtCodArtDesde = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        btnAceptarImprimirReporte = new javax.swing.JButton();
        btnCancelarImpresion = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        btnNuevo1 = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        btnactulizar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnBuscar1 = new javax.swing.JButton();
        btnImprimir1 = new javax.swing.JButton();
        btnUnidad = new javax.swing.JButton();
        btnCosto = new javax.swing.JButton();
        btnPrecio = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        txtcodLinea = new javax.swing.JTextField();
        txtDescripcionLinea = new javax.swing.JTextField();
        txtCodSubLinea = new javax.swing.JTextField();
        txtdescripSubLinea = new javax.swing.JTextField();
        txtCodCategoria = new javax.swing.JTextField();
        txtDescripcionCategoria = new javax.swing.JTextField();
        txtCod_Color = new javax.swing.JTextField();
        txtDescripcionColor = new javax.swing.JTextField();
        txtCod_ubicacion = new javax.swing.JTextField();
        txtDescripcionUbicacion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        panelSeriales = new javax.swing.JPanel();
        jseriales = new javax.swing.JCheckBox();
        jutilizalotes = new javax.swing.JCheckBox();
        jvencidos = new javax.swing.JCheckBox();
        panelUnidaes = new javax.swing.JPanel();
        jRadioManejaPrimaria = new javax.swing.JRadioButton();
        jRadioManejaSecundaria = new javax.swing.JRadioButton();
        PanelTributario = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        tipoImpuesto = new javax.swing.JComboBox();
        JpanelDatosVentas = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jCostoBase = new javax.swing.JComboBox();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtVolumen = new javax.swing.JTextField();
        txtGarantia = new javax.swing.JTextField();
        lblVolumen = new javax.swing.JLabel();
        lblGarantia = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        lblExistenciaMin = new javax.swing.JLabel();
        txtExistenciaMin = new javax.swing.JTextField();
        txtExistenciaMax = new javax.swing.JTextField();
        lblExixtenciaMax = new javax.swing.JLabel();
        lblPntPedido = new javax.swing.JLabel();
        txtPntPedido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtcodArticulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcionArt = new javax.swing.JTextField();
        jltipo = new javax.swing.JLabel();
        selecTipo = new javax.swing.JComboBox();
        btnUbicacion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        fechregistro = new com.toedter.calendar.JDateChooser();
        jGenerico = new javax.swing.JCheckBox();
        btnExistencia = new javax.swing.JButton();

        jDialogArticulo.setTitle("Busqueda Asistida");
        jDialogArticulo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Aceptar.setText("Aceptar");
        jDialogArticulo.getContentPane().add(Aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 98, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar");
        jDialogArticulo.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        txtBucscar.setToolTipText("Busqueda");
        txtBucscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBucscarKeyPressed(evt);
            }
        });
        jDialogArticulo.getContentPane().add(txtBucscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 360, -1));

        jLabel14.setText("Buscar :");
        jDialogArticulo.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtablaArticulos);

        jDialogArticulo.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupobusquedaArticulo.add(btngrupoBusquedArticulo);
        btngrupoBusquedArticulo.setSelected(true);
        btngrupoBusquedArticulo.setText("Codigo");
        btngrupoBusquedArticulo.setToolTipText("Codigo");

        btnGrupobusquedaArticulo.add(jrDescripcion);
        jrDescripcion.setText("Descripcion");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btngrupoBusquedArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btngrupoBusquedArticulo)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogArticulo.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        jLabel15.setText("Total de Registros Encontrados");
        jDialogArticulo.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionArticulo.add(jRInicio);
        jRInicio.setText("1) Inicio");
        jRInicio.setToolTipText("Coincida al inicio");

        btnGrupoOpcionArticulo.add(jRFinal);
        jRFinal.setText("2)Final");
        jRFinal.setToolTipText("Coincida al Final");

        btnGrupoOpcionArticulo.add(jrCualquier);
        jrCualquier.setSelected(true);
        jrCualquier.setText("3)Cualquier");
        jrCualquier.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionArticulo.add(jRexacta);
        jRexacta.setText("4)exacta");
        jRexacta.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jrCualquier)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jRInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogArticulo.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jDialogRelacionUnidad.setTitle("Asignar Unidad");
        jDialogRelacionUnidad.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodArticulo.setEnabled(false);
        jDialogRelacionUnidad.getContentPane().add(txtCodArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 200, -1));

        lblArt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblArt.setText("Articulo");
        jDialogRelacionUnidad.getContentPane().add(lblArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, -1));

        jruniprimaria.setSelected(true);
        jruniprimaria.setText("Maneja Unidad Primaria");
        jruniprimaria.setEnabled(false);
        jDialogRelacionUnidad.getContentPane().add(jruniprimaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 160, -1));

        jruniSecundaria.setText("Maneja Unidad Secundaria");
        jruniSecundaria.setEnabled(false);
        jDialogRelacionUnidad.getContentPane().add(jruniSecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 170, -1));

        JpanelAddUnidadPrin.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Unidad Principal"));
        JpanelAddUnidadPrin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Unidad :");
        JpanelAddUnidadPrin.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 60, -1));

        txtCodUnidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodUnidadKeyPressed(evt);
            }
        });
        JpanelAddUnidadPrin.add(txtCodUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 80, -1));
        JpanelAddUnidadPrin.add(txtDescripcionRelacionUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 260, -1));

        jDialogRelacionUnidad.getContentPane().add(JpanelAddUnidadPrin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 530, 60));

        btnaceptarRelacionUnidad.setText("Aceptar");
        jDialogRelacionUnidad.getContentPane().add(btnaceptarRelacionUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 80, -1));

        btnCancelarRelacionUnidad.setText("Cancelar");
        btnCancelarRelacionUnidad.setToolTipText("");
        jDialogRelacionUnidad.getContentPane().add(btnCancelarRelacionUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 80, -1));

        JDialogUnidad.setTitle("Busqueda Asistida");
        JDialogUnidad.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtablaUnidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtablaUnidad);

        JDialogUnidad.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        txtvalorUnidad.setToolTipText("Busqueda");
        txtvalorUnidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtvalorUnidadKeyPressed(evt);
            }
        });
        JDialogUnidad.getContentPane().add(txtvalorUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 360, -1));

        jLabel20.setText("Buscar :");
        JDialogUnidad.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionUnidad.add(jRInicio1);
        jRInicio1.setText("1) Inicio");
        jRInicio1.setToolTipText("Coincida al inicio");

        btnGrupoOpcionUnidad.add(jRFinal1);
        jRFinal1.setText("2)Final");
        jRFinal1.setToolTipText("Coincida al Final");

        btnGrupoOpcionUnidad.add(jrCualquier1);
        jrCualquier1.setSelected(true);
        jrCualquier1.setText("3)Cualquier");
        jrCualquier1.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionUnidad.add(jRexacta1);
        jRexacta1.setText("4)exacta");
        jRexacta1.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jrCualquier1)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jRInicio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jRInicio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        JDialogUnidad.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaUnidad.add(jrCodigo1);
        jrCodigo1.setSelected(true);
        jrCodigo1.setText("Codigo");
        jrCodigo1.setToolTipText("Codigo");

        btnGrupoBusquedaUnidad.add(jrDescripcion1);
        jrDescripcion1.setText("Descripcion");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jrCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jrCodigo1)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        JDialogUnidad.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarunidad.setText("Aceptar");
        JDialogUnidad.getContentPane().add(btnAceptarunidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 98, -1));

        btnCancelarUnidad.setText("Cancelar");
        btnCancelarUnidad.setToolTipText("Cancelar");
        JDialogUnidad.getContentPane().add(btnCancelarUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));

        jLabel21.setText("Total de Registros Encontrados");
        JDialogUnidad.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        DialogArtUnidad.setTitle("Unidad");
        DialogArtUnidad.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        btnGuardarArrUnidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_icon.png"))); // NOI18N
        btnGuardarArrUnidad.setToolTipText("Guardar");
        btnGuardarArrUnidad.setFocusable(false);
        btnGuardarArrUnidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarArrUnidad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarArrUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarArrUnidadActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardarArrUnidad);

        btnactulizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/update.png"))); // NOI18N
        btnactulizar1.setToolTipText("actualizar");
        btnactulizar1.setEnabled(false);
        btnactulizar1.setFocusable(false);
        btnactulizar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactulizar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnactulizar1);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_1.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEliminar);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir_1.png"))); // NOI18N
        btnImprimir.setToolTipText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnImprimir);

        btnrestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restar.png"))); // NOI18N
        btnrestar.setToolTipText("Eliminar Fila");
        btnrestar.setFocusable(false);
        btnrestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnrestar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnrestar);

        DialogArtUnidad.getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Articulo :");
        DialogArtUnidad.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, -1));

        txtCod_articulo2.setEditable(false);
        DialogArtUnidad.getContentPane().add(txtCod_articulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 90, -1));

        txtArtdescripcion2.setEditable(false);
        DialogArtUnidad.getContentPane().add(txtArtdescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 170, -1));

        jruniprimaria1.setSelected(true);
        jruniprimaria1.setText("Maneja Unidad Primaria");
        jruniprimaria1.setEnabled(false);
        DialogArtUnidad.getContentPane().add(jruniprimaria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 180, -1));

        jruniSecundaria1.setText("Maneja Unidad Secundaria");
        jruniSecundaria1.setEnabled(false);
        jruniSecundaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jruniSecundaria1ActionPerformed(evt);
            }
        });
        DialogArtUnidad.getContentPane().add(jruniSecundaria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 190, -1));

        jTableArtUnidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unidad", "Descripcion", "P.Primaria", "Primaria", "Invertida", "Equivalencia", "Rect.Decimales", "N° Decimales"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableArtUnidad);
        if (jTableArtUnidad.getColumnModel().getColumnCount() > 0) {
            jTableArtUnidad.getColumnModel().getColumn(0).setResizable(false);
        }

        DialogArtUnidad.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 620, 90));

        txtcod_unidad2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcod_unidad2KeyPressed(evt);
            }
        });
        DialogArtUnidad.getContentPane().add(txtcod_unidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, -1));
        DialogArtUnidad.getContentPane().add(txtDescripcionArtUnidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 310, -1));

        btnAddArtUnidad.setText("Agregar");
        btnAddArtUnidad.setToolTipText("Agregar");
        btnAddArtUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddArtUnidadActionPerformed(evt);
            }
        });
        DialogArtUnidad.getContentPane().add(btnAddArtUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 100, -1));

        jchePrincipalPrimaria.setText("Principal Primaria");
        DialogArtUnidad.getContentPane().add(jchePrincipalPrimaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 130, 20));

        jchPrimariaUnidad.setText("Primaria");
        DialogArtUnidad.getContentPane().add(jchPrimariaUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 80, 20));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Equivalencia :");
        DialogArtUnidad.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        txtEquivalenciaUnidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEquivalenciaUnidad.setText("00");
        txtEquivalenciaUnidad.setToolTipText("Equivalencia");
        DialogArtUnidad.getContentPane().add(txtEquivalenciaUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 140, -1));

        jDialogPrecio.setTitle("Precio");
        jDialogPrecio.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar3.setRollover(true);

        btnGuardarArtPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_icon.png"))); // NOI18N
        btnGuardarArtPrecio.setToolTipText("Guardar");
        btnGuardarArtPrecio.setFocusable(false);
        btnGuardarArtPrecio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarArtPrecio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarArtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarArtPrecioActionPerformed(evt);
            }
        });
        jToolBar3.add(btnGuardarArtPrecio);

        btnImprimir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir_1.png"))); // NOI18N
        btnImprimir2.setToolTipText("Imprimir");
        btnImprimir2.setFocusable(false);
        btnImprimir2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(btnImprimir2);

        btnrestarPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restar.png"))); // NOI18N
        btnrestarPrecio.setToolTipText("Eliminar Fila");
        btnrestarPrecio.setFocusable(false);
        btnrestarPrecio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnrestarPrecio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnrestarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestarPrecioActionPerformed(evt);
            }
        });
        jToolBar3.add(btnrestarPrecio);

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh.png"))); // NOI18N
        btnRefresh.setToolTipText("Refrescar");
        btnRefresh.setFocusable(false);
        btnRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(btnRefresh);

        jDialogPrecio.getContentPane().add(jToolBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Almacen :");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 51, -1));

        txtCodAlmacenPrecio1.setToolTipText("");
        jPanel8.add(txtCodAlmacenPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 70, -1));
        jPanel8.add(txtdescripcionPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 140, -1));

        jlbPrecio.setText("Precio :");
        jPanel8.add(jlbPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));
        jPanel8.add(txtcodPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 70, -1));
        jPanel8.add(txtDescripcionPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 130, -1));

        btnBuscarPrecio.setText("Buscar");
        jPanel8.add(btnBuscarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 590, 80));

        jLabel22.setText("Articulo :");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles Ultimos Precios Agregados"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtablePrecio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(JtablePrecio);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 570, 80));

        jPanel7.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 600, 110));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Tipo Precio :");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 11, 70, -1));

        txtTipoPrecio.setToolTipText("tipo precio");
        jPanel9.add(txtTipoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 70, -1));

        lblAlmacen.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAlmacen.setText("Almacen :");
        jPanel9.add(lblAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 10, 60, -1));

        txtAlmacenPrecio.setToolTipText("Almacen");
        jPanel9.add(txtAlmacenPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 90, -1));

        jLblMoneda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLblMoneda.setText("Moneda :");
        jPanel9.add(jLblMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));
        jPanel9.add(txtMonedaPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 60, -1));

        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("Precio :");
        jPanel9.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));
        jPanel9.add(txtMontoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 60, -1));
        jPanel9.add(fechaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, -1));

        lblDesde.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDesde.setText("Desde :");
        jPanel9.add(lblDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, -1));
        jPanel9.add(fechaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 120, -1));

        lblHasta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHasta.setText("Hasta :");
        jPanel9.add(lblHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 60, -1));

        btnAgregarPrecio.setText("Agregar");
        btnAgregarPrecio.setToolTipText("Agregar");
        jPanel9.add(btnAgregarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 40, 80, -1));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 580, 90));

        txtArticuloPrecio.setEnabled(false);
        jPanel7.add(txtArticuloPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, -1));

        txtDescripcionArticuloPrecio.setToolTipText("");
        txtDescripcionArticuloPrecio.setEnabled(false);
        jPanel7.add(txtDescripcionArticuloPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 370, -1));

        jDialogPrecio.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, -1, 360));

        jDialogAlmacenPrecio.setTitle("Busqueda Asistida");
        jDialogAlmacenPrecio.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarValorAlmacen.setToolTipText("Buscar");
        jDialogAlmacenPrecio.getContentPane().add(txtBuscarValorAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 350, -1));

        jLabel24.setText("Buscar :");
        jDialogAlmacenPrecio.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtablaAlmacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jtablaAlmacen);

        jDialogAlmacenPrecio.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        grupoAlmacenOpcion.add(jRInicio2);
        jRInicio2.setText("1) Inicio");
        jRInicio2.setToolTipText("Coincida al inicio");

        grupoAlmacenOpcion.add(jRFinal2);
        jRFinal2.setText("2)Final");
        jRFinal2.setToolTipText("Coincida al Final");

        grupoAlmacenOpcion.add(jrCualquier2);
        jrCualquier2.setSelected(true);
        jrCualquier2.setText("3)Cualquier");
        jrCualquier2.setToolTipText("Cualquier Caracter");

        grupoAlmacenOpcion.add(jRexacta2);
        jRexacta2.setText("4)exacta");
        jRexacta2.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jrCualquier2)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jRInicio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jRInicio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogAlmacenPrecio.getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        GrupoAlmacenBusqueda.add(jrCodigo2);
        jrCodigo2.setSelected(true);
        jrCodigo2.setText("Codigo");
        jrCodigo2.setToolTipText("Codigo");

        GrupoAlmacenBusqueda.add(jrDescripcion2);
        jrDescripcion2.setText("Descripcion");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jrCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jrCodigo2)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion2)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogAlmacenPrecio.getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarAlmacen.setText("Aceptar");
        jDialogAlmacenPrecio.getContentPane().add(btnAceptarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 98, -1));

        btnCancelarAlmacen.setText("Cancelar");
        btnCancelarAlmacen.setToolTipText("Cancelar");
        jDialogAlmacenPrecio.getContentPane().add(btnCancelarAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel25.setText("Total de Registros Encontrados");
        jDialogAlmacenPrecio.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        jDialogTipoPrecio.setTitle("Busqueda Asistida");
        jDialogTipoPrecio.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setText("Buscar :");
        jDialogTipoPrecio.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        txtBuscarValorTipoPrecio.setToolTipText("Buscar");
        jDialogTipoPrecio.getContentPane().add(txtBuscarValorTipoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 350, -1));

        jtablaTipoPrecio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jtablaTipoPrecio);

        jDialogTipoPrecio.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        grupoAlmacenOpcion.add(jRInicio3);
        jRInicio3.setText("1) Inicio");
        jRInicio3.setToolTipText("Coincida al inicio");

        grupoAlmacenOpcion.add(jRFinal3);
        jRFinal3.setText("2)Final");
        jRFinal3.setToolTipText("Coincida al Final");

        grupoAlmacenOpcion.add(jrCualquier3);
        jrCualquier3.setText("3)Cualquier");
        jrCualquier3.setToolTipText("Cualquier Caracter");

        grupoAlmacenOpcion.add(jRexacta3);
        jRexacta3.setText("4)exacta");
        jRexacta3.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jrCualquier3)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jRInicio3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jRInicio3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogTipoPrecio.getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        GrupoAlmacenBusqueda.add(jrCodigo3);
        jrCodigo3.setText("Codigo");
        jrCodigo3.setToolTipText("Codigo");

        GrupoAlmacenBusqueda.add(jrDescripcion3);
        jrDescripcion3.setText("Descripcion");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jrCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jrCodigo3)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion3)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogTipoPrecio.getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptartipoPrecio.setText("Aceptar");
        jDialogTipoPrecio.getContentPane().add(btnAceptartipoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 98, -1));

        btnCancelarTipoPrecio.setText("Cancelar");
        btnCancelarTipoPrecio.setToolTipText("Cancelar");
        jDialogTipoPrecio.getContentPane().add(btnCancelarTipoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel27.setText("Total de Registros Encontrados");
        jDialogTipoPrecio.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        jDialogMoneda.setTitle("Busqueda Asistida");
        jDialogMoneda.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setText("Buscar :");
        jDialogMoneda.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        txtBuscarValorMoneda.setToolTipText("Buscar");
        jDialogMoneda.getContentPane().add(txtBuscarValorMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 350, -1));

        jtablaMoneda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jtablaMoneda);

        jDialogMoneda.getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionMoneda.add(jRInicio4);
        jRInicio4.setText("1) Inicio");
        jRInicio4.setToolTipText("Coincida al inicio");

        btnGrupoOpcionMoneda.add(jRFinal4);
        jRFinal4.setText("2)Final");
        jRFinal4.setToolTipText("Coincida al Final");

        btnGrupoOpcionMoneda.add(jrCualquier4);
        jrCualquier4.setSelected(true);
        jrCualquier4.setText("3)Cualquier");
        jrCualquier4.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionMoneda.add(jRexacta4);
        jRexacta4.setText("4)exacta");
        jRexacta4.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jrCualquier4)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jRInicio4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jRInicio4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogMoneda.getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaMoneda.add(jrCodigo4);
        jrCodigo4.setSelected(true);
        jrCodigo4.setText("Codigo");
        jrCodigo4.setToolTipText("Codigo");

        btnGrupoBusquedaMoneda.add(jrDescripcion4);
        jrDescripcion4.setText("Descripcion");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jrCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jrCodigo4)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion4)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogMoneda.getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarMoneda.setText("Aceptar");
        jDialogMoneda.getContentPane().add(btnAceptarMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 98, -1));

        btnCancelarMoneda.setText("Cancelar");
        btnCancelarMoneda.setToolTipText("Cancelar");
        jDialogMoneda.getContentPane().add(btnCancelarMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel29.setText("Total de Registros Encontrados");
        jDialogMoneda.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        jDialogArtUbicacion.setTitle("Ubicacion porAlmacen");
        jDialogArtUbicacion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar4.setRollover(true);

        btnGuardarArtUbicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_icon.png"))); // NOI18N
        btnGuardarArtUbicacion.setToolTipText("Guardar");
        btnGuardarArtUbicacion.setFocusable(false);
        btnGuardarArtUbicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarArtUbicacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarArtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarArtUbicacionActionPerformed(evt);
            }
        });
        jToolBar4.add(btnGuardarArtUbicacion);

        btnImprimir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir_1.png"))); // NOI18N
        btnImprimir3.setToolTipText("Imprimir");
        btnImprimir3.setFocusable(false);
        btnImprimir3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(btnImprimir3);

        btnrestaArtUbicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restar.png"))); // NOI18N
        btnrestaArtUbicacion.setToolTipText("Eliminar Fila");
        btnrestaArtUbicacion.setFocusable(false);
        btnrestaArtUbicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnrestaArtUbicacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnrestaArtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaArtUbicacionActionPerformed(evt);
            }
        });
        jToolBar4.add(btnrestaArtUbicacion);

        btnRefresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh.png"))); // NOI18N
        btnRefresh1.setToolTipText("Refrescar");
        btnRefresh1.setFocusable(false);
        btnRefresh1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefresh1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar4.add(btnRefresh1);

        jDialogArtUbicacion.getContentPane().add(jToolBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbPrecio1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbPrecio1.setText("Sucursal :");
        jPanel19.add(jlbPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 70, -1));
        jPanel19.add(txtCodSucursalUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 80, -1));
        jPanel19.add(txtDescripcionSucursalUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 250, -1));

        btbBuscarSucursal.setText("Buscar");
        jPanel19.add(btbBuscarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        btnLimpiar.setText("Limpiar");
        jPanel19.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 610, 70));

        jLabel31.setText("Articulo :");
        jPanel18.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles Ultimos Precios Agregados"));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtableArtUbicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(JtableArtUbicacion);

        jPanel20.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 600, 80));

        jPanel18.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 620, 110));

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarArtUbicacion.setText("Agregar");
        btnAgregarArtUbicacion.setToolTipText("Agregar");
        jPanel21.add(btnAgregarArtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 80, -1));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Almacén :");
        jPanel21.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, -1));
        jPanel21.add(txtCodAlmacenUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 50, -1));
        jPanel21.add(txtDescripcionAlmacenUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 140, -1));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Ubicación :");
        jPanel21.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 70, -1));
        jPanel21.add(txtCod1Ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 50, -1));
        jPanel21.add(txtdescripcionUbicacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 140, -1));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Ubicación2 :");
        jPanel21.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 60, -1));
        jPanel21.add(cod2Ubicacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 50, -1));
        jPanel21.add(txtdescripcionUbicacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 140, -1));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Ubicación3 :");
        jPanel21.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 70, -1));
        jPanel21.add(cod3Ubicacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 50, -1));
        jPanel21.add(txtdescripcionUbicacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 140, -1));

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Descripcion :");
        jPanel21.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, -1));
        jPanel21.add(txtDescripcionUbicacionAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 190, -1));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Orden :");
        jPanel21.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 80, -1));
        jPanel21.add(txtOrdenArtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 100, -1));

        jPanel18.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 600, 100));

        txtArticuloUbicacion.setEnabled(false);
        jPanel18.add(txtArticuloUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, -1));

        txtDescripcionArticuloUbicacion.setToolTipText("");
        txtDescripcionArticuloUbicacion.setEnabled(false);
        jPanel18.add(txtDescripcionArticuloUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 400, -1));

        jDialogArtUbicacion.getContentPane().add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, 620, 370));

        jDialogUbicacion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setText("Buscar :");
        jDialogUbicacion.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        txtBuscarValorUbicacion.setToolTipText("Buscar");
        jDialogUbicacion.getContentPane().add(txtBuscarValorUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 350, -1));

        jtablaUbicacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane9.setViewportView(jtablaUbicacion);

        jDialogUbicacion.getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 440, 110));

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionUbicacion.add(jRInicio5);
        jRInicio5.setText("1) Inicio");
        jRInicio5.setToolTipText("Coincida al inicio");

        btnGrupoOpcionUbicacion.add(jRFinal5);
        jRFinal5.setText("2)Final");
        jRFinal5.setToolTipText("Coincida al Final");

        btnGrupoOpcionUbicacion.add(jrCualquier5);
        jrCualquier5.setSelected(true);
        jrCualquier5.setText("3)Cualquier");
        jrCualquier5.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionUbicacion.add(jRexacta5);
        jRexacta5.setText("4)exacta");
        jRexacta5.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jrCualquier5)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jRInicio5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jRInicio5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta5)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogUbicacion.getContentPane().add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaUbicacion.add(jrCodigo5);
        jrCodigo5.setSelected(true);
        jrCodigo5.setText("Codigo");
        jrCodigo5.setToolTipText("Codigo");

        btnGrupoBusquedaUbicacion.add(jrDescripcion5);
        jrDescripcion5.setText("Descripcion");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jrCodigo5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jrCodigo5)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion5)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogUbicacion.getContentPane().add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarUbicacion.setText("Aceptar");
        jDialogUbicacion.getContentPane().add(btnAceptarUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 98, -1));

        btnCancelarUbicacion.setText("Cancelar");
        btnCancelarUbicacion.setToolTipText("Cancelar");
        jDialogUbicacion.getContentPane().add(btnCancelarUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel38.setText("Total de Registros Encontrados");
        jDialogUbicacion.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        JDialogoSucursal.setTitle("Busqueda Asistida");
        JDialogoSucursal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setText("Buscar :");
        JDialogoSucursal.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtableSucursal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(jtableSucursal);

        JDialogoSucursal.getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 120));

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btngrupoSucurOpcion.add(jRInicio6);
        jRInicio6.setText("1) Inicio");
        jRInicio6.setToolTipText("Coincida al inicio");

        btngrupoSucurOpcion.add(jRFinal6);
        jRFinal6.setText("2)Final");
        jRFinal6.setToolTipText("Coincida al Final");

        btngrupoSucurOpcion.add(jrCualquier6);
        jrCualquier6.setSelected(true);
        jrCualquier6.setText("3)Cualquier");
        jrCualquier6.setToolTipText("Cualquier Caracter");

        btngrupoSucurOpcion.add(jRexacta6);
        jRexacta6.setText("4)exacta");
        jRexacta6.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jrCualquier6)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jRInicio6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jRInicio6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta6)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        JDialogoSucursal.getContentPane().add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btngrupoSucurBusqueda.add(rjcodigo6);
        rjcodigo6.setSelected(true);
        rjcodigo6.setText("Codigo");
        rjcodigo6.setToolTipText("Codigo");

        btngrupoSucurBusqueda.add(jrDescripcion6);
        jrDescripcion6.setText("Descripcion");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(rjcodigo6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(rjcodigo6)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion6)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        JDialogoSucursal.getContentPane().add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarSucursal.setText("Aceptar");
        JDialogoSucursal.getContentPane().add(btnAceptarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 98, -1));

        btnCancelarSucursal.setText("Cancelar");
        btnCancelarSucursal.setToolTipText("Cancelar");
        JDialogoSucursal.getContentPane().add(btnCancelarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel40.setText("Total de Registros Encontrados");
        JDialogoSucursal.getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));
        JDialogoSucursal.getContentPane().add(txtValorBuscarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 370, -1));

        jDialogLinea.setTitle("Busqueda Asistida");
        jDialogLinea.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setText("Buscar :");
        jDialogLinea.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jTablaLinea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(jTablaLinea);

        jDialogLinea.getContentPane().add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 120));

        btnAceptarLinea.setText("Aceptar");
        jDialogLinea.getContentPane().add(btnAceptarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 98, -1));

        btnCancelarLinea.setText("Cancelar");
        btnCancelarLinea.setToolTipText("Cancelar");
        jDialogLinea.getContentPane().add(btnCancelarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        btnGrupoBusquedaLinea.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnBusquedaLinea.add(rjcodigo7);
        rjcodigo7.setSelected(true);
        rjcodigo7.setText("Codigo");
        rjcodigo7.setToolTipText("Codigo");

        btnBusquedaLinea.add(jrDescripcion7);
        jrDescripcion7.setText("Descripcion");

        javax.swing.GroupLayout btnGrupoBusquedaLineaLayout = new javax.swing.GroupLayout(btnGrupoBusquedaLinea);
        btnGrupoBusquedaLinea.setLayout(btnGrupoBusquedaLineaLayout);
        btnGrupoBusquedaLineaLayout.setHorizontalGroup(
            btnGrupoBusquedaLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGrupoBusquedaLineaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnGrupoBusquedaLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(btnGrupoBusquedaLineaLayout.createSequentialGroup()
                        .addComponent(rjcodigo7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        btnGrupoBusquedaLineaLayout.setVerticalGroup(
            btnGrupoBusquedaLineaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGrupoBusquedaLineaLayout.createSequentialGroup()
                .addComponent(rjcodigo7)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion7)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogLinea.getContentPane().add(btnGrupoBusquedaLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionLinea.add(jRInicio7);
        jRInicio7.setText("1) Inicio");
        jRInicio7.setToolTipText("Coincida al inicio");

        btnGrupoOpcionLinea.add(jRFinal7);
        jRFinal7.setText("2)Final");
        jRFinal7.setToolTipText("Coincida al Final");

        btnGrupoOpcionLinea.add(jrCualquier7);
        jrCualquier7.setSelected(true);
        jrCualquier7.setText("3)Cualquier");
        jrCualquier7.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionLinea.add(jRexacta7);
        jRexacta7.setText("4)exacta");
        jRexacta7.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jrCualquier7)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jRInicio7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jRInicio7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta7)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogLinea.getContentPane().add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        txtvalorLineaBuscar.setToolTipText("");
        jDialogLinea.getContentPane().add(txtvalorLineaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 370, -1));

        jDialogSubLinea.setTitle("Busqueda Asistida");
        jDialogSubLinea.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setText("Buscar :");
        jDialogSubLinea.getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        txtBuscarValorSubLinea.setToolTipText("Buscar");
        jDialogSubLinea.getContentPane().add(txtBuscarValorSubLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 350, -1));

        jtableSubLinea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane12.setViewportView(jtableSubLinea);

        jDialogSubLinea.getContentPane().add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btngrupoOpcionSublinea.add(jRInicio8);
        jRInicio8.setText("1) Inicio");
        jRInicio8.setToolTipText("Coincida al inicio");

        btngrupoOpcionSublinea.add(jRFinal8);
        jRFinal8.setText("2)Final");
        jRFinal8.setToolTipText("Coincida al Final");

        btngrupoOpcionSublinea.add(jrCualquier8);
        jrCualquier8.setSelected(true);
        jrCualquier8.setText("3)Cualquier");
        jrCualquier8.setToolTipText("Cualquier Caracter");

        btngrupoOpcionSublinea.add(jRexacta8);
        jRexacta8.setText("4)exacta");
        jRexacta8.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jrCualquier8)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jRInicio8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jRInicio8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta8)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogSubLinea.getContentPane().add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btngrupoBusquedaSublinea.add(jrCodigo8);
        jrCodigo8.setSelected(true);
        jrCodigo8.setText("Codigo");
        jrCodigo8.setToolTipText("Codigo");

        btngrupoBusquedaSublinea.add(jrDescripcion8);
        jrDescripcion8.setText("Descripcion");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jrCodigo8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jrCodigo8)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion8)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogSubLinea.getContentPane().add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarSubLinea.setText("Aceptar");
        jDialogSubLinea.getContentPane().add(btnAceptarSubLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 98, -1));

        btnCancelarSubLinea.setText("Cancelar");
        btnCancelarSubLinea.setToolTipText("Cancelar");
        jDialogSubLinea.getContentPane().add(btnCancelarSubLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel43.setText("Total de Registros Encontrados");
        jDialogSubLinea.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        jDialogCategoria.setTitle("Busqueda Asistida");
        jDialogCategoria.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setText("Buscar :");
        jDialogCategoria.getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtablaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane13.setViewportView(jtablaCategoria);

        jDialogCategoria.getContentPane().add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 440, 120));

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btngrupoOpcionCategoria.add(jRInicio9);
        jRInicio9.setText("1) Inicio");
        jRInicio9.setToolTipText("Coincida al inicio");

        btngrupoOpcionCategoria.add(jRFinal9);
        jRFinal9.setText("2)Final");
        jRFinal9.setToolTipText("Coincida al Final");

        btngrupoOpcionCategoria.add(jrCualquier9);
        jrCualquier9.setSelected(true);
        jrCualquier9.setText("3)Cualquier");
        jrCualquier9.setToolTipText("Cualquier Caracter");

        btngrupoOpcionCategoria.add(jRexacta9);
        jRexacta9.setText("4)exacta");
        jRexacta9.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jrCualquier9)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jRInicio9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jRInicio9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogCategoria.getContentPane().add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, -1));

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaCategoria.add(rjcodigo9);
        rjcodigo9.setSelected(true);
        rjcodigo9.setText("Codigo");
        rjcodigo9.setToolTipText("Codigo");

        btnGrupoBusquedaCategoria.add(jrDescripcion9);
        jrDescripcion9.setText("Descripcion");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(rjcodigo9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(rjcodigo9)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion9)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogCategoria.getContentPane().add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 120, 100));

        btnAceptarCategoria.setText("Aceptar");
        jDialogCategoria.getContentPane().add(btnAceptarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 98, -1));

        btnCancelarCategoria.setText("Cancelar");
        btnCancelarCategoria.setToolTipText("Cancelar");
        jDialogCategoria.getContentPane().add(btnCancelarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel45.setText("Total de Registros Encontrados");
        jDialogCategoria.getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));
        jDialogCategoria.getContentPane().add(txtvalorBusquedaCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 390, -1));

        jDialogColor.setTitle("Busqueda  Asistida");
        jDialogColor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtablaColor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane14.setViewportView(jtablaColor);

        jDialogColor.getContentPane().add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        jLabel46.setText("Buscar :");
        jDialogColor.getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionColor.add(jRInicio10);
        jRInicio10.setText("1) Inicio");
        jRInicio10.setToolTipText("Coincida al inicio");

        btnGrupoOpcionColor.add(jRFinal10);
        jRFinal10.setText("2)Final");
        jRFinal10.setToolTipText("Coincida al Final");

        btnGrupoOpcionColor.add(jrCualquier10);
        jrCualquier10.setSelected(true);
        jrCualquier10.setText("3)Cualquier");
        jrCualquier10.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionColor.add(jRexacta10);
        jRexacta10.setText("4)exacta");
        jRexacta10.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jrCualquier10)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jRInicio10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jRInicio10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta10)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogColor.getContentPane().add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaColor.add(jrCodigo10);
        jrCodigo10.setSelected(true);
        jrCodigo10.setText("Codigo");
        jrCodigo10.setToolTipText("Codigo");

        btnGrupoBusquedaColor.add(jrDescripcion10);
        jrDescripcion10.setText("Descripcion");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jrCodigo10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jrCodigo10)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion10)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogColor.getContentPane().add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarColor.setText("Aceptar");
        jDialogColor.getContentPane().add(btnAceptarColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 98, -1));

        btnCancelarColor.setText("Cancelar");
        btnCancelarColor.setToolTipText("Cancelar");
        jDialogColor.getContentPane().add(btnCancelarColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel47.setText("Total de Registros Encontrados");
        jDialogColor.getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        txtBuscarValorColor.setToolTipText("");
        jDialogColor.getContentPane().add(txtBuscarValorColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 390, -1));

        jDialogExixtencias.setTitle("Existencia");
        jDialogExixtencias.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("Articulo :");
        jLabel48.setToolTipText("");
        jDialogExixtencias.getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 70, -1));

        txtArticuloExiste.setEnabled(false);
        jDialogExixtencias.getContentPane().add(txtArticuloExiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 70, -1));

        txtArticuloExistenciaDescripcion.setEnabled(false);
        jDialogExixtencias.getContentPane().add(txtArticuloExistenciaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 210, -1));

        txtcodUnidadExistencia.setEnabled(false);
        jDialogExixtencias.getContentPane().add(txtcodUnidadExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 70, -1));

        txtUnidadExistenciaDescripcion.setEnabled(false);
        jDialogExixtencias.getContentPane().add(txtUnidadExistenciaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 210, -1));

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Unidad :");
        jDialogExixtencias.getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, -1));

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("Unid sec:");
        jDialogExixtencias.getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 60, 20));

        txtCodUnidadSecExistencia.setText("n/a");
        txtCodUnidadSecExistencia.setEnabled(false);
        jDialogExixtencias.getContentPane().add(txtCodUnidadSecExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 70, -1));

        txtUnidadSecExistenciaDescripcion.setText("n/a");
        txtUnidadSecExistenciaDescripcion.setEnabled(false);
        jDialogExixtencias.getContentPane().add(txtUnidadSecExistenciaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 160, -1));

        jtablaStockxAlmacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane15.setViewportView(jtablaStockxAlmacen);

        jDialogExixtencias.getContentPane().add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 700, 110));

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder("Minima Recomendado"));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Min recomendado :");

        txtMinRecomendada.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMinRecomendada.setEnabled(false);

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("Max recomendada :");

        txtMaxRecomendada.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMaxRecomendada.setEnabled(false);

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Punto pedido :");

        txtPuntoPedido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPuntoPedido.setEnabled(false);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMinRecomendada, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPuntoPedido)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMaxRecomendada, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMinRecomendada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(txtPuntoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtMaxRecomendada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogExixtencias.getContentPane().add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 440, 90));

        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder("Mostrar Existencia"));

        btnGrupoMostrarExistencia.add(jrTotal);
        jrTotal.setSelected(true);
        jrTotal.setText("Total");

        btnGrupoMostrarExistencia.add(jrPorAlmacen);
        jrPorAlmacen.setText("Por Almacen");

        btnBuscarExistencia.setText("Buscar");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrTotal)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jrPorAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jrTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarExistencia)
                    .addComponent(jrPorAlmacen))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jDialogExixtencias.getContentPane().add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 230, 90));

        jDialogReporteArticulo.setTitle("Reporte Articulos");
        jDialogReporteArticulo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboReporteSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Articulo con su Stock po Almacen" }));
        jPanel35.add(comboReporteSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 210, -1));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Reporte :");
        jPanel35.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, -1));

        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Descripcion" }));
        jPanel35.add(comboOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 90, -1));

        comboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descendente", "Ascendente" }));
        jPanel35.add(comboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 110, -1));

        jDialogReporteArticulo.getContentPane().add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 60));

        jPanel36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("Rangos :");
        jPanel36.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 48, -1));

        jButton1.setText("Hasta");
        jPanel36.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 190, -1));

        btnDesde.setText("Desde");
        jPanel36.add(btnDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 170, -1));

        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("Linea :");
        jPanel36.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 60, -1));
        jPanel36.add(txtCodLineaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 60, -1));
        jPanel36.add(txtCodLineadescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 120, -1));
        jPanel36.add(txtCodLineaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 60, -1));
        jPanel36.add(txtCodLineadescrip2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 120, -1));
        jPanel36.add(txtCodSubLineaDescriHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 120, -1));
        jPanel36.add(txtCodSubLineaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 60, -1));
        jPanel36.add(txtCodSubLineadescrip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 120, -1));
        jPanel36.add(txtCodSubLineaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 60, -1));

        jLabel58.setText("SubLinea :");
        jPanel36.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, -1));

        jLabel59.setText("Categoria :");
        jPanel36.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 60, -1));

        txtCodCategoDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodCategoDesdeActionPerformed(evt);
            }
        });
        jPanel36.add(txtCodCategoDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 60, -1));
        jPanel36.add(txtCodCategoDesdedescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 120, -1));

        txtCodCategoHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodCategoHastaActionPerformed(evt);
            }
        });
        jPanel36.add(txtCodCategoHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 60, -1));
        jPanel36.add(txtCodCategodescripHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 120, -1));
        jPanel36.add(txtCodAlmacenHastaDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 120, -1));
        jPanel36.add(txtcodAlmacenHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 60, -1));
        jPanel36.add(txtCodAlmacenDesdedescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 120, -1));
        jPanel36.add(txtcodAlmacenDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 60, -1));

        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel60.setText("Almacen :");
        jPanel36.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, -1));

        jLabel61.setText("Nivel Stock :");
        jPanel36.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 60, -1));

        comboNivelStock.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "      ", "Diferente a 0", "Igual 0", "Mayor a 0", "Menor a 0", "Mayor a punto maximo", "Menor a punto minimo", "Menor a punto Pedido", "Todos", " " }));
        jPanel36.add(comboNivelStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 190, 20));

        comboTipoStock.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "          ", "Actual", "Actual Secundario", "Comprometido", "Comprometido Secundario", "Por Llegar", "Por Llegar Secundario", "Por Despachar Secundario", "Por Despachar\t", "Disponible", "Disponible Secundario" }));
        jPanel36.add(comboTipoStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 190, -1));

        jLabel62.setText("Tipo Stock :");
        jPanel36.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 60, -1));
        jPanel36.add(txtDescripArtHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 120, -1));

        txtCodArtHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodArtHastaKeyPressed(evt);
            }
        });
        jPanel36.add(txtCodArtHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 60, -1));
        jPanel36.add(txtDescripArtDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 120, -1));

        txtCodArtDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodArtDesdeKeyPressed(evt);
            }
        });
        jPanel36.add(txtCodArtDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 60, -1));

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("Codigo :");
        jPanel36.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 60, -1));

        jDialogReporteArticulo.getContentPane().add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 480, 320));

        btnAceptarImprimirReporte.setText("Aceptar");
        btnAceptarImprimirReporte.setToolTipText("");
        jDialogReporteArticulo.getContentPane().add(btnAceptarImprimirReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 80, -1));

        btnCancelarImpresion.setText("Cancelar");
        jDialogReporteArticulo.getContentPane().add(btnCancelarImpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 80, -1));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar2.setRollover(true);

        btnNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevo1.setToolTipText("Nuevo");
        btnNuevo1.setFocusable(false);
        btnNuevo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnNuevo1);

        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_icon.png"))); // NOI18N
        btnGuardar1.setToolTipText("Guardar");
        btnGuardar1.setFocusable(false);
        btnGuardar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jToolBar2.add(btnGuardar1);

        btnactulizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/update.png"))); // NOI18N
        btnactulizar.setToolTipText("actualizar");
        btnactulizar.setFocusable(false);
        btnactulizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactulizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnactulizar);

        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_1.png"))); // NOI18N
        btnEliminar1.setToolTipText("Eliminar");
        btnEliminar1.setFocusable(false);
        btnEliminar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnEliminar1);

        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar_1.png"))); // NOI18N
        btnBuscar1.setToolTipText("Buscar");
        btnBuscar1.setFocusable(false);
        btnBuscar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        jToolBar2.add(btnBuscar1);

        btnImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir_1.png"))); // NOI18N
        btnImprimir1.setToolTipText("Imprimir");
        btnImprimir1.setFocusable(false);
        btnImprimir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnImprimir1);

        add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 680, 40));

        btnUnidad.setText("Unidad");
        add(btnUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 114, -1));

        btnCosto.setText("Costo");
        btnCosto.setToolTipText("Costo");
        add(btnCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 114, -1));

        btnPrecio.setText("Precio");
        btnPrecio.setToolTipText("Precio");
        add(btnPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 114, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Categoria");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, -1));

        jLabel4.setText("Ubicacion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, -1));

        jLabel5.setText("SubLinea");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, -1));

        jLabel7.setText("Linea");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, -1));

        jLabel6.setText("Color");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, -1));

        jLabel9.setText("Item");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, -1));

        txtItem.setToolTipText("Item");
        jPanel1.add(txtItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 90, -1));

        jLabel10.setText("Modelo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 50, -1));

        txtModelo.setToolTipText("Modelo");
        jPanel1.add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 100, -1));

        jLabel11.setText("Referencia");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 60, -1));

        txtReferencia.setToolTipText("Referencia");
        jPanel1.add(txtReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 100, -1));

        txtcodLinea.setToolTipText("Codigo Linea");
        jPanel1.add(txtcodLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 80, -1));

        txtDescripcionLinea.setToolTipText("Descripcion Linea");
        jPanel1.add(txtDescripcionLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 220, -1));

        txtCodSubLinea.setToolTipText("Codigo SubLinea");
        jPanel1.add(txtCodSubLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 80, -1));

        txtdescripSubLinea.setToolTipText("Descripcion Sublinea");
        jPanel1.add(txtdescripSubLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 220, -1));

        txtCodCategoria.setToolTipText("Cod Categoria");
        jPanel1.add(txtCodCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 80, -1));

        txtDescripcionCategoria.setToolTipText("Descripcion Categoria");
        jPanel1.add(txtDescripcionCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 220, -1));

        txtCod_Color.setToolTipText("Cod Color");
        jPanel1.add(txtCod_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 80, -1));

        txtDescripcionColor.setToolTipText("Descripcion Color");
        jPanel1.add(txtDescripcionColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 220, -1));

        txtCod_ubicacion.setToolTipText("Cod Ubicacion");
        jPanel1.add(txtCod_ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 80, -1));

        txtDescripcionUbicacion.setToolTipText("Descripcion Ubicacion");
        jPanel1.add(txtDescripcionUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 220, -1));

        jTabbedPane1.addTab("Datos Basicos", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSeriales.setBorder(javax.swing.BorderFactory.createTitledBorder("Lotes Seriales"));
        panelSeriales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jseriales.setText("Utiliza seriales");
        panelSeriales.add(jseriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 16, 142, -1));

        jutilizalotes.setText("utiliza lotes");
        panelSeriales.add(jutilizalotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 16, 125, -1));

        jvencidos.setText("Lotes Vencidos");
        panelSeriales.add(jvencidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 39, 142, -1));

        jPanel2.add(panelSeriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 0, -1, 70));

        panelUnidaes.setBorder(javax.swing.BorderFactory.createTitledBorder("Unidades"));
        panelUnidaes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GrupoOpcion.add(jRadioManejaPrimaria);
        jRadioManejaPrimaria.setText("Maneja Primaria");
        panelUnidaes.add(jRadioManejaPrimaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 140, -1));

        GrupoOpcion.add(jRadioManejaSecundaria);
        jRadioManejaSecundaria.setText("Maneja Secundaria");
        panelUnidaes.add(jRadioManejaSecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, -1));

        jPanel2.add(panelUnidaes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 342, 70));

        PanelTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Tributario"));
        PanelTributario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("I.V.A");
        PanelTributario.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 19, 34, -1));

        tipoImpuesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tasa General", "Tasa A1", "Tasa A2", "Tasa A3", "Ventas Exentas", "Compras Excentas", "Exentos", "Tasa A4", "Tasa A5" }));
        PanelTributario.add(tipoImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 16, 160, -1));

        jPanel2.add(PanelTributario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 635, 60));

        jTabbedPane1.addTab("Datos Adicionales", jPanel2);

        JpanelDatosVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo Base Precio"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Costo Base ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 19, 68, -1));

        jCostoBase.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ultimo costo", "Reposicion", "Proveedor", "PEPS/UEPS" }));
        jPanel3.add(jCostoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 16, 140, -1));

        lblPeso.setText("Peso");
        jPanel3.add(lblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 50, 79, -1));

        txtPeso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPeso.setText("00");
        txtPeso.setToolTipText("Peso");
        jPanel3.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 47, 99, -1));

        txtVolumen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtVolumen.setText("00");
        txtVolumen.setToolTipText("Volumen");
        jPanel3.add(txtVolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 73, 99, -1));

        txtGarantia.setText("n/a");
        txtGarantia.setToolTipText("Garantia");
        jPanel3.add(txtGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 99, 99, -1));

        lblVolumen.setText("Volumen");
        jPanel3.add(lblVolumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 76, 79, -1));

        lblGarantia.setText("Garantia");
        jPanel3.add(lblGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 99, 79, -1));

        lblMonto.setText("Monto");
        jPanel3.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 84, -1));

        txtMonto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMonto.setText("00");
        txtMonto.setToolTipText("monto comisiones");
        jPanel3.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 47, 125, -1));

        lblExistenciaMin.setText("Existencia Min");
        jPanel3.add(lblExistenciaMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 128, 89, -1));

        txtExistenciaMin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtExistenciaMin.setText("00");
        txtExistenciaMin.setToolTipText("Existencia Minima");
        jPanel3.add(txtExistenciaMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 125, 97, -1));

        txtExistenciaMax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtExistenciaMax.setText("00");
        txtExistenciaMax.setToolTipText("Exixtencia Maxima");
        jPanel3.add(txtExistenciaMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 73, 125, -1));

        lblExixtenciaMax.setText("Existencia Max");
        jPanel3.add(lblExixtenciaMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 84, -1));

        lblPntPedido.setText("Punto Pedido");
        jPanel3.add(lblPntPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 84, -1));

        txtPntPedido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPntPedido.setText("00");
        txtPntPedido.setToolTipText("Punto Pedido");
        jPanel3.add(txtPntPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 99, 125, -1));

        JpanelDatosVentas.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 645, 176));

        jTabbedPane1.addTab("Datos de ventas", JpanelDatosVentas);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, 670, 226));

        jLabel1.setText("Codigo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 58, 79, -1));

        txtcodArticulo.setToolTipText("Codigo");
        add(txtcodArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 55, 91, -1));

        jLabel3.setText("Descripcion");
        jLabel3.setToolTipText("");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 87, 79, -1));

        txtDescripcionArt.setToolTipText("Descripcion");
        add(txtDescripcionArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 84, 257, -1));

        jltipo.setText("tipo");
        add(jltipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 85, -1));

        selecTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Venta", "Consumo", "Servicio", "Fabricación", "Materia Prima" }));
        add(selecTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 62, 121, -1));

        btnUbicacion.setText("Ubicacion");
        btnUbicacion.setToolTipText("Ubicancion");
        btnUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbicacionActionPerformed(evt);
            }
        });
        add(btnUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 114, -1));

        jLabel8.setText("fecha de Registro");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 100, -1));
        add(fechregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 130, -1));

        jGenerico.setText("Generico");
        add(jGenerico, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        btnExistencia.setText("Exixtencia");
        add(btnExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
        setModel();
        articuloController.ubicacion=1;
        jDialogArticulo.setSize(472, 358);
        jDialogArticulo.setLocationRelativeTo(null);
        jDialogArticulo.setVisible(true);
        
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void txtBucscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBucscarKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String Opcion = "0", sfieldName = "";

            if (jRInicio.isSelected()) {
                Opcion = "0";
            } else if (jRFinal.isSelected()) {
                Opcion = "1";
            } else if (jrCualquier.isSelected()) {
                Opcion = "2";
            } else if (jRexacta.isSelected()) {
                Opcion = "3";
            }
            sfieldName = (btngrupoBusquedArticulo.isSelected()) ? "co_art" : "art_des";
            jtablaArticulos.setModel(new ModelTablaArticulos(articuloModel.pObtenerListadoDatosArticulos(
                    lblNombreEmpresa.getText(),//sDatabase_Name
                    sfieldName,//sField_Name
                    txtBucscar.getText(),//Valor
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
            )));
        }
    }//GEN-LAST:event_txtBucscarKeyPressed

    private void txtvalorUnidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalorUnidadKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String Opcion1 = "0", sfieldName1 = "";

            if (jRInicio1.isSelected()) {
                Opcion1 = "0";
            } else if (jRFinal1.isSelected()) {
                Opcion1 = "1";
            } else if (jrCualquier1.isSelected()) {
                Opcion1 = "2";
            } else if (jRexacta1.isSelected()) {
                Opcion1 = "3";
            }
            sfieldName1 = (jrCodigo1.isSelected()) ? "co_uni" : "Des_Uni";
            jtablaUnidad.setModel(new ModeloTablaUnidad(new UnidadModel().pObtenerListadoDatos(lblNombreEmpresa.getText(),
                    "saUnidad", sfieldName1, txtvalorUnidad.getText(), Opcion1)));
        }
    }//GEN-LAST:event_txtvalorUnidadKeyPressed

    private void txtCodUnidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodUnidadKeyPressed
        // TODO add your handling code here:
        //muestra un Dialogo de las tablas Unidad
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            JDialogUnidad.setVisible(true);
            JDialogUnidad.setSize(480, 360);
            JDialogUnidad.setLocationRelativeTo(null);
            jtablaUnidad.setModel(new ModeloTablaUnidad(new UnidadModel().pObtenerListadoDatos(lblNombreEmpresa.getText(), "saUnidad", "co_uni", txtvalorUnidad.getText(), "2")));
        }
    }//GEN-LAST:event_txtCodUnidadKeyPressed


    private void btnGuardarArrUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarArrUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarArrUnidadActionPerformed
//Evento donde Agrega las Unidaddes al Articulo 
    private void btnAddArtUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddArtUnidadActionPerformed
        // TODO add your handling code here:
        int equivalencia = Integer.parseInt(txtEquivalenciaUnidad.getText());
        String unidadPrimaria = "0" , principalPrimaria="0";
        unidadPrimaria = (jchPrimariaUnidad.isSelected()) ? "1" : "0";
        principalPrimaria=(jchePrincipalPrimaria.isSelected()) ? "1" : "0";
        
        System.err.println("unidadPrimaria :::::::::" + unidadPrimaria);
                
        if (txtcod_unidad2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "El Codigo Unidad no puede estar Vacia", "Software", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (equivalencia <= 0) {
            JOptionPane.showMessageDialog(new JFrame(), "La Equivalencia  no puede estar en cero", "Software", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (validarUnidad(txtcod_unidad2.getText().replaceAll("\\s", ""))) {

            JOptionPane.showMessageDialog(new JFrame(), "Existe la Unidad en la Tabla", "Software", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ArtUnidadBO a = new ArtUnidadBO();
        //a.setCo_art(txtcod_unidad2.getText());

        a.setCo_uni(txtcod_unidad2.getText());
        a.setCampoAuxiliar(txtDescripcionArtUnidad2.getText());
        a.setEquivalencia(txtEquivalenciaUnidad.getText());
        a.setNum_decimales("0");
        a.setUni_principal(principalPrimaria);
        a.setUso_principal(unidadPrimaria);

        modelotablaunidadartRenglon.addRow(a);
        txtcod_unidad2.setText("");
        txtDescripcionArtUnidad2.setText("");
        txtEquivalenciaUnidad.setText("00");
        jchPrimariaUnidad.setSelected(false);
        jchePrincipalPrimaria.setSelected(false);
    }//GEN-LAST:event_btnAddArtUnidadActionPerformed

    private void txtcod_unidad2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcod_unidad2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            JDialogUnidad.setVisible(true);
            JDialogUnidad.setSize(480, 360);
            JDialogUnidad.setLocationRelativeTo(null);
            jtablaUnidad.setModel(new ModeloTablaUnidad(new UnidadModel().pObtenerListadoDatos(lblNombreEmpresa.getText(), "saUnidad", "co_uni", txtvalorUnidad.getText(), "2")));
        }
    }//GEN-LAST:event_txtcod_unidad2KeyPressed

    //Muestra los Unidades del Articulo y lo carga en la Tabla Art Unidiad
    public boolean validarUnidad(String codUnidad) {
        Boolean bandera = false;
        int cantidad = jTableArtUnidad.getRowCount();
        for (int i = 0; i < cantidad; i++) {
            String unidad = jTableArtUnidad.getValueAt(i, 0).toString().replaceAll("\\s", "");
            if (unidad.equals(codUnidad)) {
                bandera = true;
            }
        }
        return bandera;
    }

    public void settearCamposPrecios() {
        txtCodAlmacenPrecio1.setText("");
        txtdescripcionPrecio.setText("");
        txtcodPrecio.setText("");
        txtDescripcionPrecio.setText("");
        txtTipoPrecio.setText("");
        txtAlmacenPrecio.setText("");
        txtMonedaPrecio.setText("");
        txtMontoPrecio.setText("");
    }

   // new JScrollPane(jtablaStockxAlmacen, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    private void btnUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbicacionActionPerformed

    private void btnrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrestarActionPerformed

    private void jruniSecundaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jruniSecundaria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jruniSecundaria1ActionPerformed

    private void btnGuardarArtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarArtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarArtPrecioActionPerformed

    private void btnrestarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestarPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrestarPrecioActionPerformed

    private void btnGuardarArtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarArtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarArtUbicacionActionPerformed

    private void btnrestaArtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaArtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrestaArtUbicacionActionPerformed

    private void txtCodCategoDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodCategoDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodCategoDesdeActionPerformed

    private void txtCodCategoHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodCategoHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodCategoHastaActionPerformed

    private void txtCodArtDesdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodArtDesdeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_F2){
            setModel();
            articuloController.ubicacion=2;
        jDialogArticulo.setSize(472,358);
        jDialogArticulo.setLocationRelativeTo(null);
        jDialogArticulo.setVisible(true);
        
        }
    }//GEN-LAST:event_txtCodArtDesdeKeyPressed

    private void txtCodArtHastaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodArtHastaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_F2){
            setModel();
            articuloController.ubicacion=3;
        jDialogArticulo.setSize(472,358);
        jDialogArticulo.setLocationRelativeTo(null);
        jDialogArticulo.setVisible(true);
        }
    }//GEN-LAST:event_txtCodArtHastaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Aceptar;
    public javax.swing.JDialog DialogArtUnidad;
    private javax.swing.ButtonGroup GrupoAlmacenBusqueda;
    public javax.swing.ButtonGroup GrupoOpcion;
    public javax.swing.JDialog JDialogUnidad;
    public javax.swing.JDialog JDialogoSucursal;
    public javax.swing.JPanel JpanelAddUnidadPrin;
    private javax.swing.JPanel JpanelDatosVentas;
    public javax.swing.JTable JtableArtUbicacion;
    public javax.swing.JTable JtablePrecio;
    public javax.swing.JPanel PanelTributario;
    public javax.swing.JButton btbBuscarSucursal;
    public javax.swing.JButton btnAceptarAlmacen;
    public javax.swing.JButton btnAceptarCategoria;
    public javax.swing.JButton btnAceptarColor;
    public javax.swing.JButton btnAceptarImprimirReporte;
    public javax.swing.JButton btnAceptarLinea;
    public javax.swing.JButton btnAceptarMoneda;
    public javax.swing.JButton btnAceptarSubLinea;
    public javax.swing.JButton btnAceptarSucursal;
    public javax.swing.JButton btnAceptarUbicacion;
    public javax.swing.JButton btnAceptartipoPrecio;
    public javax.swing.JButton btnAceptarunidad;
    public javax.swing.JButton btnAddArtUnidad;
    public javax.swing.JButton btnAgregarArtUbicacion;
    public javax.swing.JButton btnAgregarPrecio;
    public javax.swing.JButton btnBuscar1;
    public javax.swing.JButton btnBuscarExistencia;
    public javax.swing.JButton btnBuscarPrecio;
    private javax.swing.ButtonGroup btnBusquedaLinea;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnCancelarAlmacen;
    public javax.swing.JButton btnCancelarCategoria;
    public javax.swing.JButton btnCancelarColor;
    public javax.swing.JButton btnCancelarImpresion;
    public javax.swing.JButton btnCancelarLinea;
    public javax.swing.JButton btnCancelarMoneda;
    public javax.swing.JButton btnCancelarRelacionUnidad;
    public javax.swing.JButton btnCancelarSubLinea;
    public javax.swing.JButton btnCancelarSucursal;
    public javax.swing.JButton btnCancelarTipoPrecio;
    public javax.swing.JButton btnCancelarUbicacion;
    public javax.swing.JButton btnCancelarUnidad;
    public javax.swing.JButton btnCosto;
    private javax.swing.JButton btnDesde;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnEliminar1;
    public javax.swing.JButton btnExistencia;
    private javax.swing.ButtonGroup btnGrupoBusquedaCategoria;
    private javax.swing.ButtonGroup btnGrupoBusquedaColor;
    private javax.swing.JPanel btnGrupoBusquedaLinea;
    private javax.swing.ButtonGroup btnGrupoBusquedaMoneda;
    private javax.swing.ButtonGroup btnGrupoBusquedaUbicacion;
    public javax.swing.ButtonGroup btnGrupoBusquedaUnidad;
    public javax.swing.ButtonGroup btnGrupoMostrarExistencia;
    private javax.swing.ButtonGroup btnGrupoOpcionArticulo;
    private javax.swing.ButtonGroup btnGrupoOpcionColor;
    private javax.swing.ButtonGroup btnGrupoOpcionLinea;
    public javax.swing.ButtonGroup btnGrupoOpcionMoneda;
    private javax.swing.ButtonGroup btnGrupoOpcionUbicacion;
    public javax.swing.ButtonGroup btnGrupoOpcionUnidad;
    private javax.swing.ButtonGroup btnGrupobusquedaArticulo;
    public javax.swing.JButton btnGuardar1;
    public javax.swing.JButton btnGuardarArrUnidad;
    public javax.swing.JButton btnGuardarArtPrecio;
    public javax.swing.JButton btnGuardarArtUbicacion;
    public javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnImprimir1;
    public javax.swing.JButton btnImprimir2;
    public javax.swing.JButton btnImprimir3;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnNuevo1;
    public javax.swing.JButton btnPrecio;
    public javax.swing.JButton btnRefresh;
    public javax.swing.JButton btnRefresh1;
    public javax.swing.JButton btnUbicacion;
    public javax.swing.JButton btnUnidad;
    public javax.swing.JButton btnaceptarRelacionUnidad;
    public javax.swing.JButton btnactulizar;
    public javax.swing.JButton btnactulizar1;
    public javax.swing.JRadioButton btngrupoBusquedArticulo;
    private javax.swing.ButtonGroup btngrupoBusquedaSublinea;
    private javax.swing.ButtonGroup btngrupoOpcionCategoria;
    private javax.swing.ButtonGroup btngrupoOpcionSublinea;
    private javax.swing.ButtonGroup btngrupoSucurBusqueda;
    private javax.swing.ButtonGroup btngrupoSucurOpcion;
    public javax.swing.JButton btnrestaArtUbicacion;
    public javax.swing.JButton btnrestar;
    public javax.swing.JButton btnrestarPrecio;
    public javax.swing.JTextField cod2Ubicacion2;
    public javax.swing.JTextField cod3Ubicacion3;
    public javax.swing.JComboBox<String> comboCriterio;
    public javax.swing.JComboBox<String> comboNivelStock;
    public javax.swing.JComboBox<String> comboOrdenar;
    public javax.swing.JComboBox<String> comboReporteSucursal;
    public javax.swing.JComboBox<String> comboTipoStock;
    public com.toedter.calendar.JDateChooser fechaDesde;
    public com.toedter.calendar.JDateChooser fechaHasta;
    public com.toedter.calendar.JDateChooser fechregistro;
    private javax.swing.ButtonGroup grupoAlmacenOpcion;
    public javax.swing.ButtonGroup grupoBuscar;
    private javax.swing.JButton jButton1;
    public javax.swing.JComboBox jCostoBase;
    public javax.swing.JDialog jDialogAlmacenPrecio;
    public javax.swing.JDialog jDialogArtUbicacion;
    public javax.swing.JDialog jDialogArticulo;
    public javax.swing.JDialog jDialogCategoria;
    public javax.swing.JDialog jDialogColor;
    public javax.swing.JDialog jDialogExixtencias;
    public javax.swing.JDialog jDialogLinea;
    public javax.swing.JDialog jDialogMoneda;
    public javax.swing.JDialog jDialogPrecio;
    public javax.swing.JDialog jDialogRelacionUnidad;
    public javax.swing.JDialog jDialogReporteArticulo;
    public javax.swing.JDialog jDialogSubLinea;
    public javax.swing.JDialog jDialogTipoPrecio;
    public javax.swing.JDialog jDialogUbicacion;
    public javax.swing.JCheckBox jGenerico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblMoneda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JRadioButton jRFinal;
    public javax.swing.JRadioButton jRFinal1;
    public javax.swing.JRadioButton jRFinal10;
    public javax.swing.JRadioButton jRFinal2;
    public javax.swing.JRadioButton jRFinal3;
    public javax.swing.JRadioButton jRFinal4;
    public javax.swing.JRadioButton jRFinal5;
    public javax.swing.JRadioButton jRFinal6;
    public javax.swing.JRadioButton jRFinal7;
    public javax.swing.JRadioButton jRFinal8;
    public javax.swing.JRadioButton jRFinal9;
    public javax.swing.JRadioButton jRInicio;
    public javax.swing.JRadioButton jRInicio1;
    public javax.swing.JRadioButton jRInicio10;
    public javax.swing.JRadioButton jRInicio2;
    public javax.swing.JRadioButton jRInicio3;
    public javax.swing.JRadioButton jRInicio4;
    public javax.swing.JRadioButton jRInicio5;
    public javax.swing.JRadioButton jRInicio6;
    public javax.swing.JRadioButton jRInicio7;
    public javax.swing.JRadioButton jRInicio8;
    public javax.swing.JRadioButton jRInicio9;
    public javax.swing.JRadioButton jRadioManejaPrimaria;
    public javax.swing.JRadioButton jRadioManejaSecundaria;
    public javax.swing.JRadioButton jRexacta;
    public javax.swing.JRadioButton jRexacta1;
    public javax.swing.JRadioButton jRexacta10;
    public javax.swing.JRadioButton jRexacta2;
    public javax.swing.JRadioButton jRexacta3;
    public javax.swing.JRadioButton jRexacta4;
    public javax.swing.JRadioButton jRexacta5;
    public javax.swing.JRadioButton jRexacta6;
    public javax.swing.JRadioButton jRexacta7;
    public javax.swing.JRadioButton jRexacta8;
    public javax.swing.JRadioButton jRexacta9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTablaLinea;
    public javax.swing.JTable jTableArtUnidad;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    public javax.swing.JCheckBox jchPrimariaUnidad;
    public javax.swing.JCheckBox jchePrincipalPrimaria;
    private javax.swing.JLabel jlbPrecio;
    private javax.swing.JLabel jlbPrecio1;
    public javax.swing.JLabel jltipo;
    public javax.swing.JRadioButton jrCodigo1;
    public javax.swing.JRadioButton jrCodigo10;
    public javax.swing.JRadioButton jrCodigo2;
    public javax.swing.JRadioButton jrCodigo3;
    public javax.swing.JRadioButton jrCodigo4;
    public javax.swing.JRadioButton jrCodigo5;
    public javax.swing.JRadioButton jrCodigo8;
    public javax.swing.JRadioButton jrCualquier;
    public javax.swing.JRadioButton jrCualquier1;
    public javax.swing.JRadioButton jrCualquier10;
    public javax.swing.JRadioButton jrCualquier2;
    public javax.swing.JRadioButton jrCualquier3;
    public javax.swing.JRadioButton jrCualquier4;
    public javax.swing.JRadioButton jrCualquier5;
    public javax.swing.JRadioButton jrCualquier6;
    public javax.swing.JRadioButton jrCualquier7;
    public javax.swing.JRadioButton jrCualquier8;
    public javax.swing.JRadioButton jrCualquier9;
    public javax.swing.JRadioButton jrDescripcion;
    public javax.swing.JRadioButton jrDescripcion1;
    public javax.swing.JRadioButton jrDescripcion10;
    public javax.swing.JRadioButton jrDescripcion2;
    public javax.swing.JRadioButton jrDescripcion3;
    public javax.swing.JRadioButton jrDescripcion4;
    public javax.swing.JRadioButton jrDescripcion5;
    public javax.swing.JRadioButton jrDescripcion6;
    public javax.swing.JRadioButton jrDescripcion7;
    public javax.swing.JRadioButton jrDescripcion8;
    public javax.swing.JRadioButton jrDescripcion9;
    public javax.swing.JRadioButton jrPorAlmacen;
    public javax.swing.JRadioButton jrTotal;
    public javax.swing.JRadioButton jruniSecundaria;
    public javax.swing.JRadioButton jruniSecundaria1;
    public javax.swing.JRadioButton jruniprimaria;
    public javax.swing.JRadioButton jruniprimaria1;
    public javax.swing.JCheckBox jseriales;
    public javax.swing.JTable jtablaAlmacen;
    public javax.swing.JTable jtablaArticulos;
    public javax.swing.JTable jtablaCategoria;
    public javax.swing.JTable jtablaColor;
    public javax.swing.JTable jtablaMoneda;
    public javax.swing.JTable jtablaStockxAlmacen;
    public javax.swing.JTable jtablaTipoPrecio;
    public javax.swing.JTable jtablaUbicacion;
    public javax.swing.JTable jtablaUnidad;
    public javax.swing.JTable jtableSubLinea;
    public javax.swing.JTable jtableSucursal;
    public javax.swing.JCheckBox jutilizalotes;
    public javax.swing.JCheckBox jvencidos;
    private javax.swing.JLabel lblAlmacen;
    public javax.swing.JLabel lblArt;
    private javax.swing.JLabel lblDesde;
    public javax.swing.JLabel lblExistenciaMin;
    public javax.swing.JLabel lblExixtenciaMax;
    public javax.swing.JLabel lblGarantia;
    private javax.swing.JLabel lblHasta;
    public javax.swing.JLabel lblMonto;
    public javax.swing.JLabel lblPeso;
    public javax.swing.JLabel lblPntPedido;
    private javax.swing.JLabel lblPrecio;
    public javax.swing.JLabel lblVolumen;
    public javax.swing.JPanel panelSeriales;
    public javax.swing.JPanel panelUnidaes;
    public javax.swing.JRadioButton rjcodigo6;
    public javax.swing.JRadioButton rjcodigo7;
    public javax.swing.JRadioButton rjcodigo9;
    public javax.swing.JComboBox selecTipo;
    public javax.swing.JComboBox tipoImpuesto;
    public javax.swing.JTextField txtAlmacenPrecio;
    public javax.swing.JTextField txtArtdescripcion2;
    public javax.swing.JTextField txtArticuloExiste;
    public javax.swing.JTextField txtArticuloExistenciaDescripcion;
    public javax.swing.JTextField txtArticuloPrecio;
    public javax.swing.JTextField txtArticuloUbicacion;
    public javax.swing.JTextField txtBucscar;
    public javax.swing.JTextField txtBuscarValorAlmacen;
    public javax.swing.JTextField txtBuscarValorColor;
    public javax.swing.JTextField txtBuscarValorMoneda;
    public javax.swing.JTextField txtBuscarValorSubLinea;
    public javax.swing.JTextField txtBuscarValorTipoPrecio;
    public javax.swing.JTextField txtBuscarValorUbicacion;
    public javax.swing.JTextField txtCod1Ubicacion;
    public javax.swing.JTextField txtCodAlmacenDesdedescrip;
    public javax.swing.JTextField txtCodAlmacenHastaDescrip;
    public javax.swing.JTextField txtCodAlmacenPrecio1;
    public javax.swing.JTextField txtCodAlmacenUbicacion;
    public javax.swing.JTextField txtCodArtDesde;
    public javax.swing.JTextField txtCodArtHasta;
    public javax.swing.JTextField txtCodArticulo;
    public javax.swing.JTextField txtCodCategoDesde;
    public javax.swing.JTextField txtCodCategoDesdedescrip;
    public javax.swing.JTextField txtCodCategoHasta;
    public javax.swing.JTextField txtCodCategodescripHasta;
    public javax.swing.JTextField txtCodCategoria;
    public javax.swing.JTextField txtCodLineaDesde;
    public javax.swing.JTextField txtCodLineaHasta;
    public javax.swing.JTextField txtCodLineadescrip;
    public javax.swing.JTextField txtCodLineadescrip2;
    public javax.swing.JTextField txtCodSubLinea;
    public javax.swing.JTextField txtCodSubLineaDescriHasta;
    public javax.swing.JTextField txtCodSubLineaDesde;
    public javax.swing.JTextField txtCodSubLineaHasta;
    public javax.swing.JTextField txtCodSubLineadescrip1;
    public javax.swing.JTextField txtCodSucursalUbicacion;
    public javax.swing.JTextField txtCodUnidad;
    public javax.swing.JTextField txtCodUnidadSecExistencia;
    public javax.swing.JTextField txtCod_Color;
    public javax.swing.JTextField txtCod_articulo2;
    public javax.swing.JTextField txtCod_ubicacion;
    public javax.swing.JTextField txtDescripArtDesde;
    public javax.swing.JTextField txtDescripArtHasta;
    public javax.swing.JTextField txtDescripcionAlmacenUbicacion;
    public javax.swing.JTextField txtDescripcionArt;
    public javax.swing.JTextField txtDescripcionArtUnidad2;
    public javax.swing.JTextField txtDescripcionArticuloPrecio;
    public javax.swing.JTextField txtDescripcionArticuloUbicacion;
    public javax.swing.JTextField txtDescripcionCategoria;
    public javax.swing.JTextField txtDescripcionColor;
    public javax.swing.JTextField txtDescripcionLinea;
    public javax.swing.JTextField txtDescripcionPrecio;
    public javax.swing.JTextField txtDescripcionRelacionUnidad;
    public javax.swing.JTextField txtDescripcionSucursalUbicacion;
    public javax.swing.JTextField txtDescripcionUbicacion;
    public javax.swing.JTextField txtDescripcionUbicacionAlmacen;
    public javax.swing.JTextField txtEquivalenciaUnidad;
    public javax.swing.JTextField txtExistenciaMax;
    public javax.swing.JTextField txtExistenciaMin;
    public javax.swing.JTextField txtGarantia;
    public javax.swing.JTextField txtItem;
    public javax.swing.JTextField txtMaxRecomendada;
    public javax.swing.JTextField txtMinRecomendada;
    public javax.swing.JTextField txtModelo;
    public javax.swing.JTextField txtMonedaPrecio;
    public javax.swing.JTextField txtMonto;
    public javax.swing.JTextField txtMontoPrecio;
    public javax.swing.JTextField txtOrdenArtUbicacion;
    public javax.swing.JTextField txtPeso;
    public javax.swing.JTextField txtPntPedido;
    public javax.swing.JTextField txtPuntoPedido;
    public javax.swing.JTextField txtReferencia;
    public javax.swing.JTextField txtTipoPrecio;
    public javax.swing.JTextField txtUnidadExistenciaDescripcion;
    public javax.swing.JTextField txtUnidadSecExistenciaDescripcion;
    public javax.swing.JTextField txtValorBuscarSucursal;
    public javax.swing.JTextField txtVolumen;
    public javax.swing.JTextField txtcodAlmacenDesde;
    public javax.swing.JTextField txtcodAlmacenHasta;
    public javax.swing.JTextField txtcodArticulo;
    public javax.swing.JTextField txtcodLinea;
    public javax.swing.JTextField txtcodPrecio;
    public javax.swing.JTextField txtcodUnidadExistencia;
    public javax.swing.JTextField txtcod_unidad2;
    public javax.swing.JTextField txtdescripSubLinea;
    public javax.swing.JTextField txtdescripcionPrecio;
    public javax.swing.JTextField txtdescripcionUbicacion1;
    public javax.swing.JTextField txtdescripcionUbicacion2;
    public javax.swing.JTextField txtdescripcionUbicacion3;
    public javax.swing.JTextField txtvalorBusquedaCategoria;
    public javax.swing.JTextField txtvalorLineaBuscar;
    public javax.swing.JTextField txtvalorUnidad;
    // End of variables declaration//GEN-END:variables
}
