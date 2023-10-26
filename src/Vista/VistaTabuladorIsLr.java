/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.TabuladorIslrController;

/**
 *
 * @author AranaV
 */
public class VistaTabuladorIsLr extends javax.swing.JPanel {

    /**
     * Creates new form VistaTabuladorIsLr
     */
    TabuladorIslrController controller;

    public VistaTabuladorIsLr() {
        controller = new TabuladorIslrController(this);
        
        initComponents();
        controller.cargarTabuladorIsLrRenglon("");
        btnBuscarTabulador.addActionListener(controller);
        btnEliminar.addActionListener(controller);
        btnGuardar.addActionListener(controller);
        btnImprimir.addActionListener(controller);
        btnNuevo.addActionListener(controller);
        btnactulizar.addActionListener(controller);
        btnAceptarTabulador.addActionListener(controller);
        btnCancelarTabu.addActionListener(controller);
        txtBuscarTabulador.addKeyListener(controller);
        
    }
    
    public void settearCampos(){
    txtCodigo.setText("");
    txtDescripcionTabulador.setText("");
    btnGuardar.setEnabled(true);
    btnEliminar.setEnabled(false);
    btnactulizar.setEnabled(false);
    txtCampo1.setText("");
    txtCampo2.setText("");
    txtCampo3.setText("");
    txtCampo4.setText("");
    txtCampo5.setText("");
    txtCampo6.setText("");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogTabulador = new javax.swing.JDialog();
        txtBuscarTabulador = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtableTabulador = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();
        jRInicioTabu = new javax.swing.JRadioButton();
        jRFinalTabu = new javax.swing.JRadioButton();
        jrCualquierTabu = new javax.swing.JRadioButton();
        jRExactaTabu = new javax.swing.JRadioButton();
        jPanel25 = new javax.swing.JPanel();
        jrCodigoTabu = new javax.swing.JRadioButton();
        jrDescripcionTabu = new javax.swing.JRadioButton();
        btnAceptarTabulador = new javax.swing.JButton();
        btnCancelarTabu = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        btnOpcionTabu = new javax.swing.ButtonGroup();
        btnGrupoBusquedaTabu = new javax.swing.ButtonGroup();
        jToolBar2 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnactulizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscarTabulador = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        combTipoPersona = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcionTabulador = new javax.swing.JTextField();
        jTablaTabulador = new javax.swing.JScrollPane();
        jTableTabuladorRenglon = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCampo1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCampo2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCampo3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCampo4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCampo5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCampo6 = new javax.swing.JTextField();

        jDialogTabulador.setTitle("Busqueda Asistida");
        jDialogTabulador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDialogTabulador.getContentPane().add(txtBuscarTabulador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 340, -1));

        jLabel50.setText("Buscar :");
        jDialogTabulador.getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtableTabulador.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(jtableTabulador);

        jDialogTabulador.getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 400, 120));

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnOpcionTabu.add(jRInicioTabu);
        jRInicioTabu.setText("1) Inicio");
        jRInicioTabu.setToolTipText("Coincida al inicio");

        btnOpcionTabu.add(jRFinalTabu);
        jRFinalTabu.setText("2)Final");
        jRFinalTabu.setToolTipText("Coincida al Final");

        btnOpcionTabu.add(jrCualquierTabu);
        jrCualquierTabu.setSelected(true);
        jrCualquierTabu.setText("3)Cualquier");
        jrCualquierTabu.setToolTipText("Cualquier Caracter");

        btnOpcionTabu.add(jRExactaTabu);
        jRExactaTabu.setText("Exacta");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinalTabu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jRInicioTabu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRExactaTabu, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrCualquierTabu))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jRInicioTabu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinalTabu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquierTabu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRExactaTabu)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jDialogTabulador.getContentPane().add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaTabu.add(jrCodigoTabu);
        jrCodigoTabu.setSelected(true);
        jrCodigoTabu.setText("Codigo");
        jrCodigoTabu.setToolTipText("Codigo");

        btnGrupoBusquedaTabu.add(jrDescripcionTabu);
        jrDescripcionTabu.setText("Descripcion");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcionTabu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jrCodigoTabu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jrCodigoTabu)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcionTabu)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogTabulador.getContentPane().add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarTabulador.setText("Aceptar");
        jDialogTabulador.getContentPane().add(btnAceptarTabulador, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 100, -1));

        btnCancelarTabu.setText("Cancelar");
        jDialogTabulador.getContentPane().add(btnCancelarTabu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 100, -1));

        jLabel51.setText("Total de Registros Encontrados");
        jDialogTabulador.getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 170, -1));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar2.setRollover(true);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnNuevo);

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
        jToolBar2.add(btnGuardar);

        btnactulizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/update.png"))); // NOI18N
        btnactulizar.setToolTipText("actualizar");
        btnactulizar.setEnabled(false);
        btnactulizar.setFocusable(false);
        btnactulizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactulizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnactulizar);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_1.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnEliminar);

        btnBuscarTabulador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar_1.png"))); // NOI18N
        btnBuscarTabulador.setToolTipText("Buscar");
        btnBuscarTabulador.setFocusable(false);
        btnBuscarTabulador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarTabulador.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarTabulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTabuladorActionPerformed(evt);
            }
        });
        jToolBar2.add(btnBuscarTabulador);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir_1.png"))); // NOI18N
        btnImprimir.setToolTipText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnImprimir);

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar2.png"))); // NOI18N
        btnagregar.setFocusable(false);
        btnagregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnagregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnagregar);

        add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 560, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combTipoPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(PNR) Persona Natural Residente", "(PNNR) Persona Natural No Residente", "(PJD) Persona Júridica Domiciliada", "(PJND Persona juridica No Domiciliada)", "Exenta", "Tesorería Nacional", "Otros", " " }));
        jPanel3.add(combTipoPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 210, -1));

        jLabel25.setText("Tipo de Persona");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 80, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Codigo :");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, -1));
        jPanel3.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 120, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Descripcion :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));
        jPanel3.add(txtDescripcionTabulador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 380, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 90));

        jTableTabuladorRenglon.setColumnSelectionAllowed(true);
        jTablaTabulador.setViewportView(jTableTabuladorRenglon);
        jTableTabuladorRenglon.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel1.add(jTablaTabulador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 550, 200));

        jTabbedPane1.addTab("General", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Campo1 :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 70, 20));
        jPanel2.add(txtCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 130, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Campo2 :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 70, 20));
        jPanel2.add(txtCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 130, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Campo3 :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 70, 20));
        jPanel2.add(txtCampo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 130, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Campo4 :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 70, 20));
        jPanel2.add(txtCampo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 130, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Campo5 :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, 20));
        jPanel2.add(txtCampo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 130, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Campo6 :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 70, 20));
        jPanel2.add(txtCampo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 130, -1));

        jTabbedPane1.addTab("Adicionales", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 570, 360));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarTabuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTabuladorActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBuscarTabuladorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarTabulador;
    public javax.swing.JButton btnBuscarTabulador;
    public javax.swing.JButton btnCancelarTabu;
    public javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGrupoBusquedaTabu;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup btnOpcionTabu;
    public javax.swing.JButton btnactulizar;
    public javax.swing.JButton btnagregar;
    public javax.swing.JComboBox<String> combTipoPersona;
    public javax.swing.JDialog jDialogTabulador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JRadioButton jRExactaTabu;
    public javax.swing.JRadioButton jRFinalTabu;
    public javax.swing.JRadioButton jRInicioTabu;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JScrollPane jTablaTabulador;
    public javax.swing.JTable jTableTabuladorRenglon;
    private javax.swing.JToolBar jToolBar2;
    public javax.swing.JRadioButton jrCodigoTabu;
    public javax.swing.JRadioButton jrCualquierTabu;
    public javax.swing.JRadioButton jrDescripcionTabu;
    public javax.swing.JTable jtableTabulador;
    public javax.swing.JTextField txtBuscarTabulador;
    public javax.swing.JTextField txtCampo1;
    public javax.swing.JTextField txtCampo2;
    public javax.swing.JTextField txtCampo3;
    public javax.swing.JTextField txtCampo4;
    public javax.swing.JTextField txtCampo5;
    public javax.swing.JTextField txtCampo6;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtDescripcionTabulador;
    // End of variables declaration//GEN-END:variables
}