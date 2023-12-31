/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.BeneficiarioController;

/**
 *
 * @author aranaVentur
 */
public class VistaBeneficiario extends javax.swing.JPanel {

    /**
     * Creates new form VistaBeneficiario
     */
    BeneficiarioController controller;

    public VistaBeneficiario() {
        initComponents();
        controller = new BeneficiarioController(this);
        btnBuscar.addActionListener(controller);
        btnGuardar1.addActionListener(controller);
        btnEliminar1.addActionListener(controller);
        btnImprimir.addActionListener(controller);
        btnactulizar.addActionListener(controller);
        btnBuscar.addActionListener(controller);
    }
    
    public void setterCampos(){
    txtCampo1.setText("");
    txtCampo2.setText("");
    txtCampo3.setText("");
    txtCampo4.setText("");
    txtCampo5.setText("");
    txtCampo6.setText("");
    txtCodigoBeneficiario.setText("");
    txtDescripcionBeneficiario.setText("");
    txtDireccion.setText("");
    txtTelefono.setText("");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        btnNuevo1 = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        btnactulizar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoBeneficiario = new javax.swing.JTextField();
        txtDescripcionBeneficiario = new javax.swing.JTextField();
        txtRifBeneficiario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        txtTelefono = new javax.swing.JTextField();
        txtDescripcionTabulador = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodTabulador = new javax.swing.JTextField();
        btnInactivo = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        TipoPersona = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCampo1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCampo2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCampo3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCampo4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCampo5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCampo6 = new javax.swing.JTextField();

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

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar_1.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnBuscar);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir_1.png"))); // NOI18N
        btnImprimir.setToolTipText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnImprimir);

        add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 440, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Tipo persona :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 80, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Codigo :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 100, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Descripcion :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, 20));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Direccion :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, 20));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("R.I.F :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 20));
        jPanel1.add(txtCodigoBeneficiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 170, -1));
        jPanel1.add(txtDescripcionBeneficiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 360, -1));
        jPanel1.add(txtRifBeneficiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 170, -1));

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        jScrollPane1.setViewportView(txtDireccion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 370, 50));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 130, -1));
        jPanel1.add(txtDescripcionTabulador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 270, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Tabulador I.S.L.R");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, -1));
        jPanel1.add(txtCodTabulador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 80, -1));

        btnInactivo.setText("Inactivo");
        jPanel1.add(btnInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Telefono :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 20));

        TipoPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Persona Natura Residente", "Persona Natura No Residente", "Persona juridica Domiciliada", "Persona juridica No Domiciliada", "Exenta" }));
        jPanel1.add(TipoPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 150, -1));

        jTabbedPane1.addTab("General", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Campo1 :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, -1));
        jPanel2.add(txtCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 100, -1));

        jLabel8.setText("Campo2 :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 60, -1));
        jPanel2.add(txtCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 100, -1));

        jLabel9.setText("Campo3 :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 60, -1));
        jPanel2.add(txtCampo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 100, -1));

        jLabel10.setText("Campo4 :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 60, -1));
        jPanel2.add(txtCampo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 100, -1));

        jLabel11.setText("Campo5 :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 60, -1));
        jPanel2.add(txtCampo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 100, -1));

        jLabel12.setText("Campo6 :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 60, -1));
        jPanel2.add(txtCampo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 100, -1));

        jTabbedPane1.addTab("Adicionales", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 510, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> TipoPersona;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar1;
    public javax.swing.JButton btnGuardar1;
    public javax.swing.JButton btnImprimir;
    public javax.swing.JRadioButton btnInactivo;
    public javax.swing.JButton btnNuevo1;
    public javax.swing.JButton btnactulizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar2;
    public javax.swing.JTextField txtCampo1;
    public javax.swing.JTextField txtCampo2;
    public javax.swing.JTextField txtCampo3;
    public javax.swing.JTextField txtCampo4;
    public javax.swing.JTextField txtCampo5;
    public javax.swing.JTextField txtCampo6;
    public javax.swing.JTextField txtCodTabulador;
    public javax.swing.JTextField txtCodigoBeneficiario;
    public javax.swing.JTextField txtDescripcionBeneficiario;
    public javax.swing.JTextField txtDescripcionTabulador;
    public javax.swing.JTextArea txtDireccion;
    public javax.swing.JTextField txtRifBeneficiario;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
