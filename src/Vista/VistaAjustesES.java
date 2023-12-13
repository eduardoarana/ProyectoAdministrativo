/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Beans.ArticulosBO;
import Conection.Conexion;
import Controller.AjustesESController;
import Model.ArticuloModel;
import Model.ModelTablaArticulos;
import Model.TipoAjusteModelo;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.Connection;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author earana
 */
public class VistaAjustesES extends javax.swing.JPanel {

    /**
     * Creates new form AjustesES
     */
    AjustesESController controller;
    //DefaultTableModel modeloTabla;
    TipoAjusteModelo modelo;
    ArticuloModel articuloModel;
    int filaTablaTipoAjuste = 0;
    ArrayList<ArticulosBO> listaArticulo;
    public static int FILA_jtableAjusteES = 0;
    public static int COLUMN_jtableAjusteES = 0;
    public int validador =0;
    public Conexion conexion;
    public static Connection con;
    public VistaAjustesES() {
      //  modeloTabla = new DefaultTableModel();
        articuloModel = new ArticuloModel();
        modelo = new TipoAjusteModelo();
        controller = new AjustesESController(this);
        con = conexion.conexions();
        initComponents();
        
        settearCampos();
        lblValidarNumero.setVisible(false);
        controller.cargarDatosAjustesESrenglon("");
        btnConvercion.addActionListener(controller);
        btnEliminar.addActionListener(controller);
        btnGuardar.addActionListener(controller);
        btnImprimirAjuste.addActionListener(controller);
        btnNuevo.addActionListener(controller);
        btnactulizar.addActionListener(controller);
        btnagregar.addActionListener(controller);
        jtableAjusteES.setCellSelectionEnabled(true);
        jtableAjusteES.addKeyListener(controller);
        btnrestar.addActionListener(controller);
        btnRefrescar.addActionListener(controller);
        txtMoneda.addKeyListener(controller);
        txtBuscarAjustes.addKeyListener(controller);
        btnBuscar.addActionListener(controller);
        btnCancelarAjustes.addActionListener(controller);
        btnAceptarAjustes.addActionListener(controller);
       

//        jtableAjusteES.isCellEditable(0, 0);
//        jtableAjusteES.getSelectionModel().addListSelectionListener(new RowListiner(this));
//        jtableAjusteES.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent ke) {
//
//            }
//
//            @Override
//            public void keyPressed(KeyEvent ke) {
//                if (ke.getKeyCode() == KeyEvent.VK_F2) {
//                    filaTablaTipoAjuste = jtableAjusteES.getSelectionModel().getLeadSelectionIndex();
//                    int column = jtableAjusteES.getColumnModel().getSelectionModel().getLeadSelectionIndex();
//                    System.out.println("Row" + filaTablaTipoAjuste + " Columns:" + column);
//
//                    if (column == 1) {
//                        JDialogTipo.setVisible(true);
//                        JDialogTipo.setSize(555, 350);
//
//                        JDialogTipo.setLocationRelativeTo(null);
//                        jtablaTipoAjustes.setModel(new Model.ModeloTablaTipoAjuste(modelo.pObtenerListadoDatos("admin_a", "saTipoAjuste", "des_tipo", "", "0")));
//                    }
//                    if (column == 2) {
//                        JDialogoArticulos.setVisible(true);
//                        JDialogoArticulos.setSize(555, 350);
//                        JDialogoArticulos.setLocationRelativeTo(null);
//                        jtablaArticulos.setModel(new ModelTablaArticulos(articuloModel.pObtenerListadoDatosArticulos(
//                                "admin_a",
//                                "Art_Des", "",
//                                "0",
//                                "1", "0", "0", "0", "0", "0", "0",
//                                /*
//                 * Obligatorio tipo
//                                 */ "0",
//                                "V",
//                                "0", "", "0", "", "0", "", "0", "", "0", "", "0", "", "0", "", "0", "", "")));
//                    }
//                }
//            }
//
//            @Override
//            public void keyReleased(KeyEvent ke) {
//            }
//        });
    }

    public void settearCampos() {
        txtajue_num.setText("");
        txtInvFisico.setText("");
        sdFecha.setDate(new Date());
        txtDescripcion.setText("");
        txtMoneda.setText("");
        txtTasa.setText("");
        txtSucursalAjuste.setText("");
        txtNComprobante.setText("");
        txtTotalSto.setText("0");
        txtCostoTotal.setText("0");
        fechaComprobante.setDate(new Date());
        txtCampo1.setText("");
        txtCampo2.setText("");
        txtCampo3.setText("");
        txtCampo4.setText("");
        txtCampo5.setText("");
        txtCampo6.setText("");
        txtCampo7.setText("");
        txtCampo8.setText("");
        validador=0;
        btnEliminar.setEnabled(false);
        btnactulizar.setEnabled(false);
        btnGuardar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDialogTipo = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        txtBucscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablaTipoAjustes = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jRInicio = new javax.swing.JRadioButton();
        jRFinal = new javax.swing.JRadioButton();
        jrCualquier = new javax.swing.JRadioButton();
        jRexacta = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jrCodigo = new javax.swing.JRadioButton();
        jrDescripcion = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        grupoOpcion = new javax.swing.ButtonGroup();
        grupobusquedaPor = new javax.swing.ButtonGroup();
        JDialogoArticulos = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        txtBucscarArticulo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtablaArticulos = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jRInicio1 = new javax.swing.JRadioButton();
        jRFinal1 = new javax.swing.JRadioButton();
        jrCualquier1 = new javax.swing.JRadioButton();
        jRexacta1 = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jrCodigo1 = new javax.swing.JRadioButton();
        jrDescripcion1 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        btnCancelar1 = new javax.swing.JButton();
        AceptarArt = new javax.swing.JButton();
        grupArtBusqueda = new javax.swing.ButtonGroup();
        grupArtOpcion = new javax.swing.ButtonGroup();
        jDialogAjustes = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtablaAjustes = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jRInicio2 = new javax.swing.JRadioButton();
        jRFinal2 = new javax.swing.JRadioButton();
        jrCualquier2 = new javax.swing.JRadioButton();
        jRexacta2 = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jrCodigo2 = new javax.swing.JRadioButton();
        jrDescripcion2 = new javax.swing.JRadioButton();
        btnAceptarAjustes = new javax.swing.JButton();
        btnCancelarAjustes = new javax.swing.JButton();
        txtBuscarAjustes = new javax.swing.JTextField();
        btngrupoOpcionAjust = new javax.swing.ButtonGroup();
        btnGrupoBusquedaAjust = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnactulizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnImprimirAjuste = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btnrestar = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        jtabbGeneral = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtajue_num = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtInvFisico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMoneda = new javax.swing.JTextField();
        sdFecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtTasa = new javax.swing.JTextField();
        btnConvercion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableAjusteES = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtTotalSto = new javax.swing.JTextField();
        txtCostoTotal = new javax.swing.JTextField();
        lblValidarNumero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSucursalAjuste = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCampo3 = new javax.swing.JTextField();
        txtCampo5 = new javax.swing.JTextField();
        txtCampo7 = new javax.swing.JTextField();
        txtCampo2 = new javax.swing.JTextField();
        txtCampo4 = new javax.swing.JTextField();
        txtCampo6 = new javax.swing.JTextField();
        txtCampo8 = new javax.swing.JTextField();
        txtCampo1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNComprobante = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        fechaComprobante = new com.toedter.calendar.JDateChooser();

        JDialogTipo.setTitle("Busqueda Asistida");
        JDialogTipo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Buscar :");
        JDialogTipo.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txtBucscar.setToolTipText("Busqueda");
        txtBucscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBucscarKeyPressed(evt);
            }
        });
        JDialogTipo.getContentPane().add(txtBucscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 350, -1));

        jtablaTipoAjustes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtablaTipoAjustes);

        JDialogTipo.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 510, 110));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        grupoOpcion.add(jRInicio);
        jRInicio.setText("1) Inicio");
        jRInicio.setToolTipText("Coincida al inicio");

        grupoOpcion.add(jRFinal);
        jRFinal.setText("2)Final");
        jRFinal.setToolTipText("Coincida al Final");

        grupoOpcion.add(jrCualquier);
        jrCualquier.setText("3)Cualquier");
        jrCualquier.setToolTipText("Cualquier Caracter");

        grupoOpcion.add(jRexacta);
        jRexacta.setText("4)exacta");
        jRexacta.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jrCualquier)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addComponent(jRexacta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
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

        JDialogTipo.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        grupobusquedaPor.add(jrCodigo);
        jrCodigo.setText("Codigo");
        jrCodigo.setToolTipText("Codigo");

        grupobusquedaPor.add(jrDescripcion);
        jrDescripcion.setText("Descripcion");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jrCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jrDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrCodigo)
                .addGap(11, 11, 11)
                .addComponent(jrDescripcion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JDialogTipo.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar");
        JDialogTipo.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 110, 30));

        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("Aceptar");
        JDialogTipo.getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 110, 30));

        JDialogoArticulos.setTitle("Busqueda Asistida");
        JDialogoArticulos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Buscar :");
        JDialogoArticulos.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        txtBucscarArticulo.setToolTipText("Busqueda");
        txtBucscarArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBucscarArticuloKeyPressed(evt);
            }
        });
        JDialogoArticulos.getContentPane().add(txtBucscarArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 360, -1));

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
        jScrollPane3.setViewportView(jtablaArticulos);

        JDialogoArticulos.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        grupArtOpcion.add(jRInicio1);
        jRInicio1.setText("1) Inicio");
        jRInicio1.setToolTipText("Coincida al inicio");

        grupArtOpcion.add(jRFinal1);
        jRFinal1.setText("2)Final");
        jRFinal1.setToolTipText("Coincida al Final");

        grupArtOpcion.add(jrCualquier1);
        jrCualquier1.setSelected(true);
        jrCualquier1.setText("3)Cualquier");
        jrCualquier1.setToolTipText("Cualquier Caracter");

        grupArtOpcion.add(jRexacta1);
        jRexacta1.setText("4)exacta");
        jRexacta1.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jrCualquier1)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jRInicio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jRInicio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        JDialogoArticulos.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        grupArtBusqueda.add(jrCodigo1);
        jrCodigo1.setSelected(true);
        jrCodigo1.setText("Codigo");
        jrCodigo1.setToolTipText("Codigo");

        grupArtBusqueda.add(jrDescripcion1);
        jrDescripcion1.setText("Descripcion");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jrCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jrCodigo1)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        JDialogoArticulos.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        jLabel16.setText("Total de Registros Encontrados");
        JDialogoArticulos.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        btnCancelar1.setText("Cancelar");
        btnCancelar1.setToolTipText("Cancelar");
        JDialogoArticulos.getContentPane().add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));

        AceptarArt.setText("Aceptar");
        AceptarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarArtActionPerformed(evt);
            }
        });
        JDialogoArticulos.getContentPane().add(AceptarArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 98, -1));

        jDialogAjustes.setTitle("Busqueda Asistida");
        jDialogAjustes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Buscar :");
        jDialogAjustes.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jtablaAjustes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jtablaAjustes);

        jDialogAjustes.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 430, 110));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btngrupoOpcionAjust.add(jRInicio2);
        jRInicio2.setText("1) Inicio");
        jRInicio2.setToolTipText("Coincida al inicio");

        btngrupoOpcionAjust.add(jRFinal2);
        jRFinal2.setText("2)Final");
        jRFinal2.setToolTipText("Coincida al Final");

        btngrupoOpcionAjust.add(jrCualquier2);
        jrCualquier2.setSelected(true);
        jrCualquier2.setText("3)Cualquier");
        jrCualquier2.setToolTipText("Cualquier Caracter");

        btngrupoOpcionAjust.add(jRexacta2);
        jRexacta2.setText("4)exacta");
        jRexacta2.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jrCualquier2)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addComponent(jRexacta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRFinal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRInicio2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jRInicio2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogAjustes.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaAjust.add(jrCodigo2);
        jrCodigo2.setSelected(true);
        jrCodigo2.setText("Codigo");
        jrCodigo2.setToolTipText("Codigo");

        btnGrupoBusquedaAjust.add(jrDescripcion2);
        jrDescripcion2.setText("Descripcion");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jrCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jrDescripcion2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrCodigo2)
                .addGap(11, 11, 11)
                .addComponent(jrDescripcion2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogAjustes.getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        btnAceptarAjustes.setText("Aceptar");
        btnAceptarAjustes.setToolTipText("Aceptar");
        jDialogAjustes.getContentPane().add(btnAceptarAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 110, 30));

        btnCancelarAjustes.setText("Cancelar");
        btnCancelarAjustes.setToolTipText("Cancelar");
        jDialogAjustes.getContentPane().add(btnCancelarAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 110, 30));
        jDialogAjustes.getContentPane().add(txtBuscarAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 350, -1));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNuevo);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_icon.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnactulizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/update.png"))); // NOI18N
        btnactulizar.setToolTipText("actualizar");
        btnactulizar.setFocusable(false);
        btnactulizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactulizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnactulizar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_1.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEliminar);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar_1.png"))); // NOI18N
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnBuscar);

        btnImprimirAjuste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir_1.png"))); // NOI18N
        btnImprimirAjuste.setToolTipText("Imprimir");
        btnImprimirAjuste.setFocusable(false);
        btnImprimirAjuste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimirAjuste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnImprimirAjuste);

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar2.png"))); // NOI18N
        btnagregar.setFocusable(false);
        btnagregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnagregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnagregar);

        btnrestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restar.png"))); // NOI18N
        btnrestar.setFocusable(false);
        btnrestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnrestar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnrestar);

        btnRefrescar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refresh_.png"))); // NOI18N
        btnRefrescar.setFocusable(false);
        btnRefrescar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefrescar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnRefrescar);

        add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 50));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Numero :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        txtajue_num.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtajue_num.setToolTipText("Numero");
        jPanel1.add(txtajue_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 87, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Descripcion :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 80, -1));

        txtDescripcion.setToolTipText("Descripcion");
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 210, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Inv Fisico :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 70, -1));

        txtInvFisico.setToolTipText("Inv Fisico");
        jPanel1.add(txtInvFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 90, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Moneda :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 40, 60, -1));

        txtMoneda.setToolTipText("Moneda");
        jPanel1.add(txtMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 110, -1));
        jPanel1.add(sdFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 130, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 10, 60, -1));

        txtTasa.setToolTipText("Conversion");
        jPanel1.add(txtTasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 100, -1));

        btnConvercion.setText("Conversion");
        btnConvercion.setToolTipText("Conversion");
        jPanel1.add(btnConvercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 90, -1));

        jtableAjusteES.setAutoCreateRowSorter(true);
        jtableAjusteES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtableAjusteES.setCellSelectionEnabled(true);
        jtableAjusteES.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtableAjusteESKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtableAjusteES);
        jtableAjusteES.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 780, 110));

        jButton1.setText("jButton1");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel20.setText("Total Stock :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 90, -1));

        jLabel21.setText("Total costo :");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 90, -1));

        txtTotalSto.setEditable(false);
        txtTotalSto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtTotalSto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtTotalSto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 100, -1));

        txtCostoTotal.setEditable(false);
        txtCostoTotal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCostoTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 100, -1));

        lblValidarNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/remove.png"))); // NOI18N
        jPanel1.add(lblValidarNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 20, 20));

        jtabbGeneral.addTab("General", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Sucursal :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, -1));

        txtSucursalAjuste.setEditable(false);
        jPanel2.add(txtSucursalAjuste, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 110, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Campo3 :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Campo5 :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 60, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Campo7 :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Campo2 :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 50, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Campo6 :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 50, -1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Campo1 :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 50, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Campo8  :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 50, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Campo4 :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 50, -1));
        jPanel2.add(txtCampo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 270, -1));
        jPanel2.add(txtCampo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 270, -1));
        jPanel2.add(txtCampo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 270, -1));
        jPanel2.add(txtCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 270, -1));
        jPanel2.add(txtCampo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 270, -1));
        jPanel2.add(txtCampo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 270, -1));
        jPanel2.add(txtCampo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 270, -1));
        jPanel2.add(txtCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 270, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("N Comprobante :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 100, -1));
        jPanel2.add(txtNComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 120, -1));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Fecha Comprobante :");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 120, -1));

        fechaComprobante.setEnabled(false);
        jPanel2.add(fechaComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 130, -1));

        jtabbGeneral.addTab("Adicionales", jPanel2);

        add(jtabbGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 790, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jtableAjusteESKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtableAjusteESKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtableAjusteESKeyPressed

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
            sfieldName = (jrCodigo.isSelected()) ? "co_tipo" : "des_tipo";
            jtablaTipoAjustes.setModel(new Model.ModeloTablaTipoAjuste(
                    modelo.pObtenerListadoDatos(Vistaprincipal.tempEmpresa,
                            "saTipoAjuste",
                            sfieldName,
                            txtBucscar.getText().toString(),
                            Opcion)));
        }
    }//GEN-LAST:event_txtBucscarKeyPressed

    private void txtBucscarArticuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBucscarArticuloKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String Opcion = "0", sfieldName = "";

            if (jRInicio1.isSelected()) {
                Opcion = "0";
            } else if (jRFinal1.isSelected()) {
                Opcion = "1";
            } else if (jrCualquier1.isSelected()) {
                Opcion = "2";
            } else if (jRexacta1.isSelected()) {
                Opcion = "3";
            }
            sfieldName = (jrCodigo1.isSelected()) ? "co_art" : "art_des";
            mostrarTablaArticulos(sfieldName, Opcion);
        }
    }//GEN-LAST:event_txtBucscarArticuloKeyPressed

    public void mostrarTablaArticulos(String sfieldName, String Opcion) {
        jtablaArticulos.setModel(new ModelTablaArticulos(
                articuloModel.pObtenerListadoDatosArticulos(
                Vistaprincipal.tempEmpresa,//sDatabase_Name
                sfieldName,//sField_Name
                txtBucscarArticulo.getText(),//Valor
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

    //cuando seleccionas un articulo del JDIALOG 
    private void AceptarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarArtActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jtablaArticulos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Debe Selecionar una Fila", "advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("ENTRENDOOOOOOOOOOOOOOOOOOOOOOOOO" );
            String Articulo = jtablaArticulos.getValueAt(filaSeleccionada, 0).toString();
            String ArtDescripcion = jtablaArticulos.getValueAt(filaSeleccionada, 1).toString();
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
            jtableAjusteES.setValueAt(Articulo, filaTablaTipoAjuste, 2);
            jtableAjusteES.setValueAt(ArtDescripcion, filaTablaTipoAjuste, 4);
            jtableAjusteES.setValueAt(listaArticulo.get(0).getModelo().toString(), filaTablaTipoAjuste, 5);
            jtableAjusteES.setValueAt(Utilitarios.Utilitario.optenerCodUnidadArt(con, Articulo), filaTablaTipoAjuste, 6);
         
            System.out.println("Valor Unidad" +Utilitarios.Utilitario.optenerCodUnidadArt(con, Articulo));
            JDialogoArticulos.dispose();
        }
    }//GEN-LAST:event_AceptarArtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AceptarArt;
    public javax.swing.JDialog JDialogTipo;
    public javax.swing.JDialog JDialogoArticulos;
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnAceptarAjustes;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnCancelar1;
    public javax.swing.JButton btnCancelarAjustes;
    public javax.swing.JButton btnConvercion;
    public javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGrupoBusquedaAjust;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnImprimirAjuste;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnRefrescar;
    public javax.swing.JButton btnactulizar;
    public javax.swing.JButton btnagregar;
    private javax.swing.ButtonGroup btngrupoOpcionAjust;
    public javax.swing.JButton btnrestar;
    public com.toedter.calendar.JDateChooser fechaComprobante;
    public javax.swing.ButtonGroup grupArtBusqueda;
    public javax.swing.ButtonGroup grupArtOpcion;
    public javax.swing.ButtonGroup grupoOpcion;
    public javax.swing.ButtonGroup grupobusquedaPor;
    private javax.swing.JButton jButton1;
    public javax.swing.JDialog jDialogAjustes;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JRadioButton jRFinal;
    public javax.swing.JRadioButton jRFinal1;
    public javax.swing.JRadioButton jRFinal2;
    public javax.swing.JRadioButton jRInicio;
    public javax.swing.JRadioButton jRInicio1;
    public javax.swing.JRadioButton jRInicio2;
    public javax.swing.JRadioButton jRexacta;
    public javax.swing.JRadioButton jRexacta1;
    public javax.swing.JRadioButton jRexacta2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JRadioButton jrCodigo;
    public javax.swing.JRadioButton jrCodigo1;
    public javax.swing.JRadioButton jrCodigo2;
    public javax.swing.JRadioButton jrCualquier;
    public javax.swing.JRadioButton jrCualquier1;
    public javax.swing.JRadioButton jrCualquier2;
    public javax.swing.JRadioButton jrDescripcion;
    public javax.swing.JRadioButton jrDescripcion1;
    public javax.swing.JRadioButton jrDescripcion2;
    public javax.swing.JTabbedPane jtabbGeneral;
    public javax.swing.JTable jtablaAjustes;
    public javax.swing.JTable jtablaArticulos;
    public javax.swing.JTable jtablaTipoAjustes;
    public static javax.swing.JTable jtableAjusteES;
    public javax.swing.JLabel lblValidarNumero;
    public com.toedter.calendar.JDateChooser sdFecha;
    public javax.swing.JTextField txtBucscar;
    public javax.swing.JTextField txtBucscarArticulo;
    public javax.swing.JTextField txtBuscarAjustes;
    public javax.swing.JTextField txtCampo1;
    public javax.swing.JTextField txtCampo2;
    public javax.swing.JTextField txtCampo3;
    public javax.swing.JTextField txtCampo4;
    public javax.swing.JTextField txtCampo5;
    public javax.swing.JTextField txtCampo6;
    public javax.swing.JTextField txtCampo7;
    public javax.swing.JTextField txtCampo8;
    public static javax.swing.JTextField txtCostoTotal;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtInvFisico;
    public static javax.swing.JTextField txtMoneda;
    public javax.swing.JTextField txtNComprobante;
    public javax.swing.JTextField txtSucursalAjuste;
    public javax.swing.JTextField txtTasa;
    public static javax.swing.JTextField txtTotalSto;
    public javax.swing.JTextField txtajue_num;
    // End of variables declaration//GEN-END:variables
}
