/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.TipoClienteController;

/**
 *
 * @author AranaV
 */
public class VistaTipoCliente extends javax.swing.JPanel {

    TipoClienteController controller;

    /**
     * Creates new form VistaTipoCliente
     */
    public VistaTipoCliente() {
        //  controller = new TipoClienteController(this);
        initComponents();
        controller = new TipoClienteController(this);
        btnBuscar.addActionListener(controller);
        btnEliminar.addActionListener(controller);
        btnGuardar.addActionListener(controller);
        btnImprimir.addActionListener(controller);
        btnNuevo.addActionListener(controller);
        btnactulizar.addActionListener(controller);
        btnAceptar.addActionListener(controller);
        btnCancelar.addActionListener(controller);
        txtBuscar.addKeyListener(controller);
        txtCodTipoPrecio.addKeyListener(controller);
        txtBuscarPrecio.addKeyListener(controller);
        txtCodDesde.addKeyListener(controller);
        txtCodHasta.addKeyListener(controller);
        btnCancelarTipoPrecio.addActionListener(controller);
        btnAceptarTipoPrecio.addActionListener(controller);
        btnAceptarImprimir.addActionListener(controller);
        btnCancelarReporte.addActionListener(controller);
        txtCodTipPrecioHasta.addKeyListener(controller);
        txtCodTipPrecioDesde.addKeyListener(controller);
    }

    public void settearCampos() {
        txtCampo1.setText("");
        txtCampo3.setText("");
        txtCodTipoCiente.setText("");
        txtDescripcionTipoCliente.setText("");
        txtTipoPrecioDescrip.setText("");
        txtcampo4.setText("");
        txtcampo2.setText("");
        txtCodTipoPrecio.setText("");
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnactulizar.setEnabled(false);
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogTipoCliente = new javax.swing.JDialog();
        txtBuscar = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtableTipoClientes = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jRInicio = new javax.swing.JRadioButton();
        jRFinal = new javax.swing.JRadioButton();
        jrCualquier = new javax.swing.JRadioButton();
        jRexacta = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jrCodigo = new javax.swing.JRadioButton();
        jrDescripcion = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        btnGrupoOpcion = new javax.swing.ButtonGroup();
        btnGrupoBusqueda = new javax.swing.ButtonGroup();
        jDialogTipoPrecio = new javax.swing.JDialog();
        txtBuscarPrecio = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtableTipoPrecio = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jRInicio1 = new javax.swing.JRadioButton();
        jRFinal1 = new javax.swing.JRadioButton();
        jrCualquier1 = new javax.swing.JRadioButton();
        jRexacta1 = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        jrCodigo1 = new javax.swing.JRadioButton();
        jrDescripcion1 = new javax.swing.JRadioButton();
        btnAceptarTipoPrecio = new javax.swing.JButton();
        btnCancelarTipoPrecio = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        btnGrupBusqueda = new javax.swing.ButtonGroup();
        btnGrupOpcion2 = new javax.swing.ButtonGroup();
        jDialogRpeorteTipoCliente = new javax.swing.JDialog();
        jPanel26 = new javax.swing.JPanel();
        comboReporteTipoCliente = new javax.swing.JComboBox<>();
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
        jLabel7 = new javax.swing.JLabel();
        txtDescripPeriHasta = new javax.swing.JTextField();
        txtCodTipPrecioDesde = new javax.swing.JTextField();
        txtDescripPeriDesde = new javax.swing.JTextField();
        txtCodTipPrecioHasta = new javax.swing.JTextField();
        btnCancelarReporte = new javax.swing.JButton();
        btnAceptarImprimir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
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
        txtCodTipoCiente = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtDescripcionTipoCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTipoPrecioDescrip = new javax.swing.JTextField();
        txtCodTipoPrecio = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCampo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcampo4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCampo3 = new javax.swing.JTextField();
        txtcampo2 = new javax.swing.JTextField();

        jDialogTipoCliente.setTitle("Busqueda Asistida");
        jDialogTipoCliente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDialogTipoCliente.getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 380, -1));

        jLabel28.setText("Buscar :");
        jDialogTipoCliente.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtableTipoClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jtableTipoClientes);

        jDialogTipoCliente.getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

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

        jDialogTipoCliente.getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupOpcion2.add(jrCodigo);
        jrCodigo.setSelected(true);
        jrCodigo.setText("Codigo");
        jrCodigo.setToolTipText("Codigo");

        btnGrupOpcion2.add(jrDescripcion);
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

        jDialogTipoCliente.getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptar.setText("Aceptar");
        jDialogTipoCliente.getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 100, -1));

        btnCancelar.setText("Cancelar");
        jDialogTipoCliente.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel29.setText("Total de Registros Encontrados");
        jDialogTipoCliente.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        jDialogTipoPrecio.setTitle("Busqueda Asistida");
        jDialogTipoPrecio.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDialogTipoPrecio.getContentPane().add(txtBuscarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 380, -1));

        jLabel30.setText("Buscar :");
        jDialogTipoPrecio.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtableTipoPrecio.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(jtableTipoPrecio);

        jDialogTipoPrecio.getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupOpcion2.add(jRInicio1);
        jRInicio1.setText("1) Inicio");
        jRInicio1.setToolTipText("Coincida al inicio");

        btnGrupOpcion2.add(jRFinal1);
        jRFinal1.setText("2)Final");
        jRFinal1.setToolTipText("Coincida al Final");

        btnGrupOpcion2.add(jrCualquier1);
        jrCualquier1.setText("3)Cualquier");
        jrCualquier1.setToolTipText("Cualquier Caracter");

        btnGrupOpcion2.add(jRexacta1);
        jRexacta1.setText("4)exacta");
        jRexacta1.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jrCualquier1)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jRInicio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jRInicio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogTipoPrecio.getContentPane().add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupBusqueda.add(jrCodigo1);
        jrCodigo1.setSelected(true);
        jrCodigo1.setText("Codigo");
        jrCodigo1.setToolTipText("Codigo");

        btnGrupBusqueda.add(jrDescripcion1);
        jrDescripcion1.setText("Descripcion");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jrCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jrCodigo1)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogTipoPrecio.getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarTipoPrecio.setText("Aceptar");
        jDialogTipoPrecio.getContentPane().add(btnAceptarTipoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 100, -1));

        btnCancelarTipoPrecio.setText("Cancelar");
        jDialogTipoPrecio.getContentPane().add(btnCancelarTipoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel31.setText("Total de Registros Encontrados");
        jDialogTipoPrecio.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        jDialogRpeorteTipoCliente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboReporteTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Clientes" }));
        jPanel26.add(comboReporteTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 230, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Reporte :");
        jPanel26.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, -1));

        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Descripcion" }));
        jPanel26.add(comboOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 90, -1));

        comboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descendente", "Ascendente" }));
        jPanel26.add(comboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 110, -1));

        jDialogRpeorteTipoCliente.getContentPane().add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 60));

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

        jLabel7.setText("Codigo Precio :");
        jPanelReporteDatosBasicos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, 20));
        jPanelReporteDatosBasicos.add(txtDescripPeriHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 70, 140, -1));

        txtCodTipPrecioDesde.setToolTipText("");
        jPanelReporteDatosBasicos.add(txtCodTipPrecioDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 60, -1));
        jPanelReporteDatosBasicos.add(txtDescripPeriDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 120, -1));

        txtCodTipPrecioHasta.setToolTipText("");
        jPanelReporteDatosBasicos.add(txtCodTipPrecioHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 60, -1));

        jDialogRpeorteTipoCliente.getContentPane().add(jPanelReporteDatosBasicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 500, 250));

        btnCancelarReporte.setText("Cancelar");
        jDialogRpeorteTipoCliente.getContentPane().add(btnCancelarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 80, -1));

        btnAceptarImprimir.setText("Aceptar");
        btnAceptarImprimir.setToolTipText("");
        jDialogRpeorteTipoCliente.getContentPane().add(btnAceptarImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 80, -1));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNuevo);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Save_icon.png"))); // NOI18N
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescripcion.setText("Descripcion :");
        jPanel2.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, -1));

        txtCodTipoCiente.setToolTipText("Codigo Tipo Cliente");
        jPanel2.add(txtCodTipoCiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 130, -1));

        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Codigo :");
        jPanel2.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, -1));

        txtDescripcionTipoCliente.setToolTipText("Descripcion tipo cliente");
        jPanel2.add(txtDescripcionTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 330, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Tipo de Precio :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 130, 90, -1));

        txtTipoPrecioDescrip.setToolTipText("Descripcion Tipo Precio");
        jPanel2.add(txtTipoPrecioDescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 260, -1));

        txtCodTipoPrecio.setToolTipText("tipo Precio");
        jPanel2.add(txtCodTipoPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 50, -1));

        jTabbedPane1.addTab("Datos Basicos", jPanel2);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Campo1 :");
        jLabel4.setToolTipText("");

        txtCampo1.setToolTipText("campo1");

        jLabel3.setText("Campo2:");

        txtcampo4.setToolTipText("Campo 2");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Campo3 :");
        jLabel5.setToolTipText("");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Campo4:");
        jLabel6.setToolTipText("");

        txtCampo3.setToolTipText("campo1");

        txtcampo2.setToolTipText("Campo 2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtCampo3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcampo4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
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
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtCampo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcampo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Adicionales", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 560, 200));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    public javax.swing.JButton btnAceptarImprimir;
    public javax.swing.JButton btnAceptarTipoPrecio;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnCancelarReporte;
    public javax.swing.JButton btnCancelarTipoPrecio;
    private javax.swing.JButton btnDesde;
    public javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGrupBusqueda;
    private javax.swing.ButtonGroup btnGrupOpcion2;
    private javax.swing.ButtonGroup btnGrupoBusqueda;
    private javax.swing.ButtonGroup btnGrupoOpcion;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnactulizar;
    public javax.swing.JComboBox<String> comboCriterio;
    public javax.swing.JComboBox<String> comboOrdenar;
    public javax.swing.JComboBox<String> comboReporteTipoCliente;
    private javax.swing.JButton jButton3;
    public javax.swing.JDialog jDialogRpeorteTipoCliente;
    public javax.swing.JDialog jDialogTipoCliente;
    public javax.swing.JDialog jDialogTipoPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanelReporteDatosBasicos;
    public javax.swing.JRadioButton jRFinal;
    public javax.swing.JRadioButton jRFinal1;
    public javax.swing.JRadioButton jRInicio;
    public javax.swing.JRadioButton jRInicio1;
    public javax.swing.JRadioButton jRexacta;
    public javax.swing.JRadioButton jRexacta1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JRadioButton jrCodigo;
    public javax.swing.JRadioButton jrCodigo1;
    public javax.swing.JRadioButton jrCualquier;
    public javax.swing.JRadioButton jrCualquier1;
    public javax.swing.JRadioButton jrDescripcion;
    public javax.swing.JRadioButton jrDescripcion1;
    public javax.swing.JTable jtableTipoClientes;
    public javax.swing.JTable jtableTipoPrecio;
    public javax.swing.JLabel lblCodigo;
    public javax.swing.JLabel lblDescripcion;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtBuscarPrecio;
    public javax.swing.JTextField txtCampo1;
    public javax.swing.JTextField txtCampo3;
    public javax.swing.JTextField txtCodDesde;
    public javax.swing.JTextField txtCodHasta;
    public javax.swing.JTextField txtCodTipPrecioDesde;
    public javax.swing.JTextField txtCodTipPrecioHasta;
    public javax.swing.JTextField txtCodTipoCiente;
    public javax.swing.JTextField txtCodTipoPrecio;
    public javax.swing.JTextField txtDescripDesde;
    public javax.swing.JTextField txtDescripHasta;
    public javax.swing.JTextField txtDescripPeriDesde;
    public javax.swing.JTextField txtDescripPeriHasta;
    public javax.swing.JTextField txtDescripcionTipoCliente;
    public javax.swing.JTextField txtTipoPrecioDescrip;
    public javax.swing.JTextField txtcampo2;
    public javax.swing.JTextField txtcampo4;
    // End of variables declaration//GEN-END:variables
}