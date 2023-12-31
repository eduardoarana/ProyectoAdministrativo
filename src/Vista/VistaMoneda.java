/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.MonedaController;
import Controller.TasaController;
import Model.MonedaModel;
import java.util.Date;

/**
 *
 * @author AVentura
 */
public class VistaMoneda extends javax.swing.JPanel {

    /**
     * Creates new form VistaMoneda
     */
    MonedaController controller ;
    TasaController tasaController;
    MonedaModel modelo;
    
    public VistaMoneda() {
        initComponents();
        controller = new MonedaController(this);
        tasaController = new TasaController(this);
        modelo = new MonedaModel();
        txtBuscar.addKeyListener(controller);
        btnAceptar.addActionListener(controller);
        btnGuardar.addActionListener(controller);
        btnImprimir.addActionListener(controller);
        btnEliminar.addActionListener(controller);
        btnactulizar.addActionListener(controller);
        btnNuevo.addActionListener(controller);
        btnCancelar.addActionListener(controller);
        btnBuscar.addActionListener(controller);
        btnTasa.addActionListener(controller);
        btnGuardarTasa.addActionListener(tasaController);
        btnEliminarTasa.addActionListener(tasaController);
        btnAceptarImprimirMoneda.addActionListener(controller);
        btnCancelarReporte.addActionListener(controller);
        txtCodDesde.addKeyListener(controller);
        txtCodHasta.addKeyListener(controller);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogMonedas = new javax.swing.JDialog();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtableMonedas = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jRInicio = new javax.swing.JRadioButton();
        jRFinal = new javax.swing.JRadioButton();
        jrCualquier = new javax.swing.JRadioButton();
        jRexacta = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jrCodigo = new javax.swing.JRadioButton();
        jrDescripcion = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGrupoOpcion = new javax.swing.ButtonGroup();
        btnGrupoBusqueda = new javax.swing.ButtonGroup();
        jDialogTasa = new javax.swing.JDialog();
        jToolBar2 = new javax.swing.JToolBar();
        btnGuardarTasa = new javax.swing.JButton();
        btnEliminarTasa = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoMonedaTasa = new javax.swing.JTextField();
        txtdescripTasa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTasaVenta = new javax.swing.JTextField();
        txtTasCompra = new javax.swing.JTextField();
        txtTasaCompra = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaTasa = new javax.swing.JTable();
        jDialogReporteMoneda = new javax.swing.JDialog();
        jPanel26 = new javax.swing.JPanel();
        comboReporteZona = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        comboOrdenar = new javax.swing.JComboBox<>();
        comboCriterio = new javax.swing.JComboBox<>();
        jPanelReporteDatosBasicos = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        btnDesde = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtDescripDesde = new javax.swing.JTextField();
        txtCodDesde = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtCodHasta = new javax.swing.JTextField();
        txtDescripHasta = new javax.swing.JTextField();
        btnAceptarImprimirMoneda = new javax.swing.JButton();
        btnCancelarReporte = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnactulizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        txtcodigoMoneda = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtDescripcionMoneda = new javax.swing.JTextField();
        cheInversaTasa = new javax.swing.JCheckBox();
        btnTasa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCampo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcampo2 = new javax.swing.JTextField();

        jDialogMonedas.setTitle("Busqueda Asistida");
        jDialogMonedas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setText("Buscar :");
        jDialogMonedas.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtableMonedas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jtableMonedas);

        jDialogMonedas.getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcion.add(jRInicio);
        jRInicio.setText("1) Inicio");
        jRInicio.setToolTipText("Coincida al inicio");

        btnGrupoOpcion.add(jRFinal);
        jRFinal.setText("2)Final");
        jRFinal.setToolTipText("Coincida al Final");

        btnGrupoOpcion.add(jrCualquier);
        jrCualquier.setSelected(true);
        jrCualquier.setText("3)Cualquier");
        jrCualquier.setToolTipText("Cualquier Caracter");

        btnGrupoOpcion.add(jRexacta);
        jRexacta.setText("4)exacta");
        jRexacta.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jrCualquier)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jRInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jRInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogMonedas.getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusqueda.add(jrCodigo);
        jrCodigo.setSelected(true);
        jrCodigo.setText("Codigo");
        jrCodigo.setToolTipText("Codigo");

        btnGrupoBusqueda.add(jrDescripcion);
        jrDescripcion.setText("Descripcion");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jrCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jrCodigo)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogMonedas.getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        jLabel29.setText("Total de Registros Encontrados");
        jDialogMonedas.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));
        jDialogMonedas.getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 380, -1));

        btnAceptar.setText("Aceptar");
        jDialogMonedas.getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 100, -1));

        btnCancelar.setText("Cancelar");
        jDialogMonedas.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jDialogTasa.setTitle("Tasa");

        jToolBar2.setRollover(true);

        btnGuardarTasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_icon.png"))); // NOI18N
        btnGuardarTasa.setToolTipText("Guardar");
        btnGuardarTasa.setFocusable(false);
        btnGuardarTasa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarTasa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarTasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTasaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnGuardarTasa);

        btnEliminarTasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_1.png"))); // NOI18N
        btnEliminarTasa.setToolTipText("Eliminar");
        btnEliminarTasa.setFocusable(false);
        btnEliminarTasa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarTasa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnEliminarTasa);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Codigo:");

        txtCodigoMonedaTasa.setEnabled(false);

        txtdescripTasa.setEnabled(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tasa Venta:");
        jLabel2.setToolTipText("");

        txtTasaCompra.setText("Tasa Compra:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha:");

        jtablaTasa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtablaTasa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoMonedaTasa, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(txtTasaVenta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTasaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTasCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtdescripTasa, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdescripTasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoMonedaTasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTasaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTasCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTasaCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("General", jPanel1);

        javax.swing.GroupLayout jDialogTasaLayout = new javax.swing.GroupLayout(jDialogTasa.getContentPane());
        jDialogTasa.getContentPane().setLayout(jDialogTasaLayout);
        jDialogTasaLayout.setHorizontalGroup(
            jDialogTasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTasaLayout.createSequentialGroup()
                .addGroup(jDialogTasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogTasaLayout.setVerticalGroup(
            jDialogTasaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogTasaLayout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2))
        );

        jDialogReporteMoneda.setTitle("Reporte Moneda");
        jDialogReporteMoneda.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboReporteZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moneda" }));
        jPanel26.add(comboReporteZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 230, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Reporte :");
        jPanel26.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, -1));

        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Descripcion" }));
        jPanel26.add(comboOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 90, -1));

        comboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descendente", "Ascendente" }));
        jPanel26.add(comboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 110, -1));

        jDialogReporteMoneda.getContentPane().add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 60));

        jPanelReporteDatosBasicos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanelReporteDatosBasicos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Rangos :");
        jPanelReporteDatosBasicos.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, -1));

        btnDesde.setText("Desde");
        jPanelReporteDatosBasicos.add(btnDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, -1));

        jButton3.setText("Hasta");
        jPanelReporteDatosBasicos.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 210, -1));
        jPanelReporteDatosBasicos.add(txtDescripDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 120, -1));
        jPanelReporteDatosBasicos.add(txtCodDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 60, -1));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("Codigo :");
        jPanelReporteDatosBasicos.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, -1));
        jPanelReporteDatosBasicos.add(txtCodHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 60, -1));
        jPanelReporteDatosBasicos.add(txtDescripHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 140, -1));

        jDialogReporteMoneda.getContentPane().add(jPanelReporteDatosBasicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 500, 250));

        btnAceptarImprimirMoneda.setText("Aceptar");
        btnAceptarImprimirMoneda.setToolTipText("");
        jDialogReporteMoneda.getContentPane().add(btnAceptarImprimirMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 80, -1));

        btnCancelarReporte.setText("Cancelar");
        jDialogReporteMoneda.getContentPane().add(btnCancelarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 80, -1));

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
        btnactulizar.setEnabled(false);
        btnactulizar.setFocusable(false);
        btnactulizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactulizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnactulizar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_1.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEliminar);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar_1.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnBuscar);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir_1.png"))); // NOI18N
        btnImprimir.setToolTipText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnImprimir);

        add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescripcion.setText("Descripcion :");
        jPanel2.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 70, -1));

        txtcodigoMoneda.setToolTipText("Codigo");
        jPanel2.add(txtcodigoMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, -1));

        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Codigo :");
        jPanel2.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, -1));

        txtDescripcionMoneda.setToolTipText("Descripcion Linea");
        jPanel2.add(txtDescripcionMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 400, -1));

        cheInversaTasa.setText("Relacion Inversa para la tasa");
        jPanel2.add(cheInversaTasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 220, -1));

        btnTasa.setText("Tasa");
        jPanel2.add(btnTasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 100, -1));

        jTabbedPane1.addTab("Datos Basicos", jPanel2);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Campo1 :");
        jLabel4.setToolTipText("");

        txtCampo1.setToolTipText("campo1");

        jLabel3.setText("Campo2:");

        txtcampo2.setToolTipText("Campo 2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtcampo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Adicionales", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 630, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarTasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarTasaActionPerformed

    public void settearCamposTasa (){
    txtTasCompra.setText("0.0");
    txtTasaVenta.setText("0.0");
    fecha.setDate(new Date());
    }
    public void settearCampos(){
    txtCampo1.setText("");
    txtcodigoMoneda.setText("");
    txtcampo2.setText("");
    txtDescripcionMoneda.setText("");
    btnEliminar.setEnabled(false);
    btnactulizar.setEnabled(false);
    btnGuardar.setEnabled(true);
    cheInversaTasa.setSelected(false);
    txtCodDesde.setText("");
    txtCodHasta.setText("");
    txtDescripDesde.setText("");
    txtDescripHasta.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnAceptarImprimirMoneda;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnCancelarReporte;
    private javax.swing.JButton btnDesde;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnEliminarTasa;
    private javax.swing.ButtonGroup btnGrupoBusqueda;
    private javax.swing.ButtonGroup btnGrupoOpcion;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnGuardarTasa;
    public javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnTasa;
    public javax.swing.JButton btnactulizar;
    public javax.swing.JCheckBox cheInversaTasa;
    public javax.swing.JComboBox<String> comboCriterio;
    public javax.swing.JComboBox<String> comboOrdenar;
    public javax.swing.JComboBox<String> comboReporteZona;
    public com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton jButton3;
    public javax.swing.JDialog jDialogMonedas;
    public javax.swing.JDialog jDialogReporteMoneda;
    public javax.swing.JDialog jDialogTasa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanelReporteDatosBasicos;
    public javax.swing.JRadioButton jRFinal;
    public javax.swing.JRadioButton jRInicio;
    public javax.swing.JRadioButton jRexacta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    public javax.swing.JRadioButton jrCodigo;
    public javax.swing.JRadioButton jrCualquier;
    public javax.swing.JRadioButton jrDescripcion;
    public static javax.swing.JTable jtablaTasa;
    public javax.swing.JTable jtableMonedas;
    public javax.swing.JLabel lblCodigo;
    public javax.swing.JLabel lblDescripcion;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtCampo1;
    public javax.swing.JTextField txtCodDesde;
    public javax.swing.JTextField txtCodHasta;
    public javax.swing.JTextField txtCodigoMonedaTasa;
    public javax.swing.JTextField txtDescripDesde;
    public javax.swing.JTextField txtDescripHasta;
    public javax.swing.JTextField txtDescripcionMoneda;
    public javax.swing.JTextField txtTasCompra;
    public javax.swing.JLabel txtTasaCompra;
    public javax.swing.JTextField txtTasaVenta;
    public javax.swing.JTextField txtcampo2;
    public javax.swing.JTextField txtcodigoMoneda;
    public javax.swing.JTextField txtdescripTasa;
    // End of variables declaration//GEN-END:variables
}
