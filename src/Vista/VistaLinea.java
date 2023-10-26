/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.LineaController;
import Model.LineaModel;
import Model.ModeloTablaLinea;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

/**
 *
 * @author earana
 */
public final class VistaLinea extends javax.swing.JPanel {

    /**
     * Creates new form VistaLinea
     */
    LineaController controller;
    LineaModel modelo;

    public VistaLinea() {
        initComponents();
        
        modelo = new LineaModel();
        controller = new LineaController(this);
        btnGuardar.addActionListener(controller);
        btnactulizar.addActionListener(controller);
        btnNuevo.addActionListener(controller);
        btnEliminar.addActionListener(controller);
        btnBuscar.addActionListener(controller);
        btnCancelar.addActionListener(controller);
        btnAceptarLinea.addActionListener(controller);
        btnAceptarImprimir.addActionListener(controller);
        btnCancelarImpresion.addActionListener(controller);
        btnImprimir.addActionListener(controller);
        txtCodDesde.addKeyListener(controller);
        txtCodHasta.addKeyListener(controller);
        setterCampos();
        try {
            setModel();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void setModel() throws SQLException {
        jTablaLinea.setModel(new ModeloTablaLinea(modelo.listaLineas()));
    }

    public void setterCampos() {
        txtCampo1.setText("");
        txtcampo2.setText("");
        txtcodigoLinea.setText("");
        txtDescripcionLinea1.setText("");
        txtComisionVentas.setText("00");
        txtComisionCobros.setText("00");
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

        jDialogoLinea = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        txtBucscar = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jRInicio = new javax.swing.JRadioButton();
        jRFinal = new javax.swing.JRadioButton();
        jrCualquier = new javax.swing.JRadioButton();
        jRexacta = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        rjcodigo = new javax.swing.JRadioButton();
        jrDescripcion = new javax.swing.JRadioButton();
        btnAceptarLinea = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaLinea = new javax.swing.JTable();
        btngrupoOpcion = new javax.swing.ButtonGroup();
        btnGrupoBusqueda = new javax.swing.ButtonGroup();
        jDialogReporteLinea = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        comboReporteCategoria = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        comboOrdenar = new javax.swing.JComboBox<>();
        comboCriterio = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnDesde = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCodDesde = new javax.swing.JTextField();
        txtCodHasta = new javax.swing.JTextField();
        txtDescripHasta = new javax.swing.JTextField();
        txtDescripDesde = new javax.swing.JTextField();
        btnCancelarImpresion = new javax.swing.JButton();
        btnAceptarImprimir = new javax.swing.JButton();
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
        txtcodigoLinea = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtComisionCobros = new javax.swing.JTextField();
        lblComisonVentas = new javax.swing.JLabel();
        txtComisionVentas = new javax.swing.JTextField();
        txtDescripcionLinea1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCampo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcampo2 = new javax.swing.JTextField();

        jDialogoLinea.setTitle("Busqueda Asistida");
        jDialogoLinea.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Buscar :");
        jDialogoLinea.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        txtBucscar.setToolTipText("Busqueda");
        txtBucscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBucscarKeyPressed(evt);
            }
        });
        jDialogoLinea.getContentPane().add(txtBucscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 360, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btngrupoOpcion.add(jRInicio);
        jRInicio.setText("1) Inicio");
        jRInicio.setToolTipText("Coincida al inicio");

        btngrupoOpcion.add(jRFinal);
        jRFinal.setText("2)Final");
        jRFinal.setToolTipText("Coincida al Final");

        btngrupoOpcion.add(jrCualquier);
        jrCualquier.setSelected(true);
        jrCualquier.setText("3)Cualquier");
        jrCualquier.setToolTipText("Cualquier Caracter");

        btngrupoOpcion.add(jRexacta);
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

        jDialogoLinea.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusqueda.add(rjcodigo);
        rjcodigo.setSelected(true);
        rjcodigo.setText("Codigo");
        rjcodigo.setToolTipText("Codigo");

        btnGrupoBusqueda.add(jrDescripcion);
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
                        .addComponent(rjcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(rjcodigo)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogoLinea.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarLinea.setText("Aceptar");
        jDialogoLinea.getContentPane().add(btnAceptarLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 98, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar");
        jDialogoLinea.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel15.setText("Total de Registros Encontrados");
        jDialogoLinea.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

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
        jScrollPane1.setViewportView(jTablaLinea);

        jDialogoLinea.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 450, 120));

        jDialogReporteLinea.setTitle("Impresion Grupo de Reportes :Lineas");
        jDialogReporteLinea.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboReporteCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lineas" }));
        jPanel1.add(comboReporteCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 230, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Reporte :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, -1));

        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Descripcion" }));
        jPanel1.add(comboOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 90, -1));

        comboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descendente", "Ascendente" }));
        jPanel1.add(comboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 110, -1));

        jDialogReporteLinea.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 60));

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Rangos :");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 48, -1));

        jButton1.setText("Hasta");
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 190, -1));

        btnDesde.setText("Desde");
        jPanel6.add(btnDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 160, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Codigo :");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, -1));
        jPanel6.add(txtCodDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 60, -1));
        jPanel6.add(txtCodHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 60, -1));
        jPanel6.add(txtDescripHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 110, -1));
        jPanel6.add(txtDescripDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 90, -1));

        jDialogReporteLinea.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 450, 270));

        btnCancelarImpresion.setText("Cancelar");
        jDialogReporteLinea.getContentPane().add(btnCancelarImpresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 80, -1));

        btnAceptarImprimir.setText("Aceptar");
        btnAceptarImprimir.setToolTipText("");
        jDialogReporteLinea.getContentPane().add(btnAceptarImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 80, -1));

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

        add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 60));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescripcion.setText("Descripcion :");
        jPanel2.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 70, -1));

        txtcodigoLinea.setToolTipText("Codigo");
        jPanel2.add(txtcodigoLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 100, -1));

        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Codigo :");
        jPanel2.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Comision por cobros :");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 110, -1));

        txtComisionCobros.setToolTipText("Comision de Ventas");
        jPanel2.add(txtComisionCobros, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 130, -1));

        lblComisonVentas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblComisonVentas.setText("Comision Ventas :");
        lblComisonVentas.setToolTipText("");
        jPanel2.add(lblComisonVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, -1));

        txtComisionVentas.setToolTipText("Comision de Ventas");
        txtComisionVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComisionVentasActionPerformed(evt);
            }
        });
        jPanel2.add(txtComisionVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 120, -1));

        txtDescripcionLinea1.setToolTipText("Descripcion Linea");
        jPanel2.add(txtDescripcionLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 400, -1));

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
                .addContainerGap(151, Short.MAX_VALUE))
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
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Adicionales", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 61, 570, 160));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtComisionVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComisionVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComisionVentasActionPerformed

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
            sfieldName = (rjcodigo.isSelected()) ? "Co_lin" : "lin_des";
            jTablaLinea.setModel(new ModeloTablaLinea(modelo.pObtenerListadoDatos(
                "admin_a",//sDatabase_Name
                "saLineaArticulo",
                sfieldName,//sField_Name
                txtBucscar.getText(),//Valor
                Opcion//@iOpcion
            )));
        }
    }//GEN-LAST:event_txtBucscarKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarImprimir;
    public javax.swing.JButton btnAceptarLinea;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnCancelarImpresion;
    private javax.swing.JButton btnDesde;
    public javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGrupoBusqueda;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnactulizar;
    private javax.swing.ButtonGroup btngrupoOpcion;
    public javax.swing.JComboBox<String> comboCriterio;
    public javax.swing.JComboBox<String> comboOrdenar;
    public javax.swing.JComboBox<String> comboReporteCategoria;
    private javax.swing.JButton jButton1;
    public javax.swing.JDialog jDialogReporteLinea;
    public javax.swing.JDialog jDialogoLinea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JRadioButton jRFinal;
    public javax.swing.JRadioButton jRInicio;
    public javax.swing.JRadioButton jRexacta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTablaLinea;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JRadioButton jrCualquier;
    public javax.swing.JRadioButton jrDescripcion;
    public javax.swing.JLabel lblCodigo;
    public javax.swing.JLabel lblComisonVentas;
    public javax.swing.JLabel lblDescripcion;
    public javax.swing.JRadioButton rjcodigo;
    public javax.swing.JTextField txtBucscar;
    public javax.swing.JTextField txtCampo1;
    public javax.swing.JTextField txtCodDesde;
    public javax.swing.JTextField txtCodHasta;
    public javax.swing.JTextField txtComisionCobros;
    public javax.swing.JTextField txtComisionVentas;
    public javax.swing.JTextField txtDescripDesde;
    public javax.swing.JTextField txtDescripHasta;
    public javax.swing.JTextField txtDescripcionLinea1;
    public javax.swing.JTextField txtcampo2;
    public javax.swing.JTextField txtcodigoLinea;
    // End of variables declaration//GEN-END:variables
}
