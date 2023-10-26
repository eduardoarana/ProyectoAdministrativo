/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.CuentaInEgreController;

/**
 *
 * @author earana
 */
public class VistaCuentaInEgre extends javax.swing.JPanel {

    /**
     * Creates new form VistaCuentaInEgre
     */
    CuentaInEgreController controller;
    
    public VistaCuentaInEgre(){
        initComponents();
        controller = new CuentaInEgreController(this);
        btnBuscar.addActionListener(controller);
        btnEliminar.addActionListener(controller);
        btnGuardar.addActionListener(controller);
        btnImprimir.addActionListener(controller);
        btnNuevo.addActionListener(controller);
        btnactulizar.addActionListener(controller);
        txtValorCuentaInEgre.addKeyListener(controller);
        btnAceptarDialogo.addActionListener(controller);
        btnCancelarDialogCuentaIng.addActionListener(controller);
        txtCodISLR.addKeyListener(controller);
        btnAceptarImprimirCuenta.addActionListener(controller);
        txtCodDesde.addKeyListener(controller);
        txtCodHasta.addKeyListener(controller);
        btnCancelarReporte.addActionListener(controller);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogCuentaInEgre = new javax.swing.JDialog();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtablaCuentaInEgre = new javax.swing.JTable();
        btnAceptarDialogo = new javax.swing.JButton();
        btnCancelarDialogCuentaIng = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jrCodigo = new javax.swing.JRadioButton();
        jrDescripcion = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jRInicio = new javax.swing.JRadioButton();
        jRFinal = new javax.swing.JRadioButton();
        jrCualquier = new javax.swing.JRadioButton();
        jRexacta = new javax.swing.JRadioButton();
        txtValorCuentaInEgre = new javax.swing.JTextField();
        btnGrupoOpcion = new javax.swing.ButtonGroup();
        btnGrupoPor = new javax.swing.ButtonGroup();
        jDialogReporteCuentIngEgr = new javax.swing.JDialog();
        jPanel26 = new javax.swing.JPanel();
        comboReporteCuentInEgre = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        comboOrdenar = new javax.swing.JComboBox<>();
        comboCriterio = new javax.swing.JComboBox<>();
        btnAceptarImprimirCuenta = new javax.swing.JButton();
        btnCancelarReporte = new javax.swing.JButton();
        jPanelReporteDatosBasicos = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        btnDesde = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtDescripDesde = new javax.swing.JTextField();
        txtCodDesde = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtCodHasta = new javax.swing.JTextField();
        txtDescripHasta = new javax.swing.JTextField();
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
        txtCodCuentInEgre = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtDescripcionCuentInEgre = new javax.swing.JTextField();
        lblConceptoISLR = new javax.swing.JLabel();
        txtCodISLR = new javax.swing.JTextField();
        txtDescripcionISLR = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCampo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcampo4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCampo3 = new javax.swing.JTextField();
        txtcampo2 = new javax.swing.JTextField();

        jDialogCuentaInEgre.setTitle("Busqueda Asistida");
        jDialogCuentaInEgre.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setText("Buscar :");
        jDialogCuentaInEgre.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtablaCuentaInEgre.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtablaCuentaInEgre);

        jDialogCuentaInEgre.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 450, 120));

        btnAceptarDialogo.setText("Aceptar");
        jDialogCuentaInEgre.getContentPane().add(btnAceptarDialogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 98, -1));

        btnCancelarDialogCuentaIng.setText("Cancelar");
        btnCancelarDialogCuentaIng.setToolTipText("Cancelar");
        jDialogCuentaInEgre.getContentPane().add(btnCancelarDialogCuentaIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoPor.add(jrCodigo);
        jrCodigo.setSelected(true);
        jrCodigo.setText("Codigo");
        jrCodigo.setToolTipText("Codigo");

        btnGrupoPor.add(jrDescripcion);
        jrDescripcion.setText("Descripcion");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jrCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jrCodigo)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogCuentaInEgre.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

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

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jrCualquier)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jRInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexacta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jRInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogCuentaInEgre.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));
        jDialogCuentaInEgre.getContentPane().add(txtValorCuentaInEgre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 360, -1));

        jDialogReporteCuentIngEgr.setTitle("Reporte :Cuenta Ingreso Egreso");
        jDialogReporteCuentIngEgr.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboReporteCuentInEgre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta Ingreso Egreso" }));
        jPanel26.add(comboReporteCuentInEgre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 230, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Reporte :");
        jPanel26.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, -1));

        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Descripcion" }));
        jPanel26.add(comboOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 90, -1));

        comboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descendente", "Ascendente" }));
        jPanel26.add(comboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 110, -1));

        jDialogReporteCuentIngEgr.getContentPane().add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 60));

        btnAceptarImprimirCuenta.setText("Aceptar");
        btnAceptarImprimirCuenta.setToolTipText("");
        jDialogReporteCuentIngEgr.getContentPane().add(btnAceptarImprimirCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 80, -1));

        btnCancelarReporte.setText("Cancelar");
        btnCancelarReporte.setToolTipText("");
        jDialogReporteCuentIngEgr.getContentPane().add(btnCancelarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 80, -1));

        jPanelReporteDatosBasicos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanelReporteDatosBasicos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Rangos :");
        jPanelReporteDatosBasicos.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, -1));

        btnDesde.setText("Desde");
        jPanelReporteDatosBasicos.add(btnDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 190, -1));

        jButton3.setText("Hasta");
        jPanelReporteDatosBasicos.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 190, -1));
        jPanelReporteDatosBasicos.add(txtDescripDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 120, -1));
        jPanelReporteDatosBasicos.add(txtCodDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 60, -1));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("Codigo :");
        jPanelReporteDatosBasicos.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, -1));
        jPanelReporteDatosBasicos.add(txtCodHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 60, -1));
        jPanelReporteDatosBasicos.add(txtDescripHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 120, -1));

        jDialogReporteCuentIngEgr.getContentPane().add(jPanelReporteDatosBasicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 480, 230));

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

        add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 50));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescripcion.setText("Descripcion :");
        jPanel2.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, -1));

        txtCodCuentInEgre.setToolTipText("Codigo Zona");
        jPanel2.add(txtCodCuentInEgre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 130, -1));

        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Codigo :");
        jPanel2.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, -1));

        txtDescripcionCuentInEgre.setToolTipText("Descripcion Zona");
        jPanel2.add(txtDescripcionCuentInEgre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 330, -1));

        lblConceptoISLR.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblConceptoISLR.setText("Concepto de I.S.L.R :");
        jPanel2.add(lblConceptoISLR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, -1));
        jPanel2.add(txtCodISLR, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 80, -1));
        jPanel2.add(txtDescripcionISLR, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 240, -1));

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
                .addContainerGap(75, Short.MAX_VALUE))
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

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 500, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void setearCampos(){
    txtCampo1.setText("");
    txtCampo3.setText("");
    txtCodCuentInEgre.setText("");
    txtDescripcionCuentInEgre.setText("");
    txtValorCuentaInEgre.setText("");
    txtcampo2.setText("");
    txtcampo4.setText("");
    btnGuardar.setEnabled(true);
    btnEliminar.setEnabled(false);
    btnactulizar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarDialogo;
    public javax.swing.JButton btnAceptarImprimirCuenta;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelarDialogCuentaIng;
    public javax.swing.JButton btnCancelarReporte;
    private javax.swing.JButton btnDesde;
    public javax.swing.JButton btnEliminar;
    public javax.swing.ButtonGroup btnGrupoOpcion;
    public javax.swing.ButtonGroup btnGrupoPor;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnactulizar;
    public javax.swing.JComboBox<String> comboCriterio;
    public javax.swing.JComboBox<String> comboOrdenar;
    public javax.swing.JComboBox<String> comboReporteCuentInEgre;
    private javax.swing.JButton jButton3;
    public javax.swing.JDialog jDialogCuentaInEgre;
    public javax.swing.JDialog jDialogReporteCuentIngEgr;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanelReporteDatosBasicos;
    public javax.swing.JRadioButton jRFinal;
    public javax.swing.JRadioButton jRInicio;
    public javax.swing.JRadioButton jRexacta;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JRadioButton jrCodigo;
    public javax.swing.JRadioButton jrCualquier;
    public javax.swing.JRadioButton jrDescripcion;
    public javax.swing.JTable jtablaCuentaInEgre;
    public javax.swing.JLabel lblCodigo;
    public javax.swing.JLabel lblConceptoISLR;
    public javax.swing.JLabel lblDescripcion;
    public javax.swing.JTextField txtCampo1;
    public javax.swing.JTextField txtCampo3;
    public javax.swing.JTextField txtCodCuentInEgre;
    public javax.swing.JTextField txtCodDesde;
    public javax.swing.JTextField txtCodHasta;
    public javax.swing.JTextField txtCodISLR;
    public javax.swing.JTextField txtDescripDesde;
    public javax.swing.JTextField txtDescripHasta;
    public javax.swing.JTextField txtDescripcionCuentInEgre;
    public javax.swing.JTextField txtDescripcionISLR;
    public javax.swing.JTextField txtValorCuentaInEgre;
    public javax.swing.JTextField txtcampo2;
    public javax.swing.JTextField txtcampo4;
    // End of variables declaration//GEN-END:variables
}
