/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.UsuarioController;
import Model.ModeloTablaUsuario;
import Model.UsuarioModel;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JFormattedTextField;

/**
 *
 * @author Desarrollo
 */
public class VistaUsuario extends javax.swing.JPanel {

    /**
     * Creates new form VistaUsuario
     */
    UsuarioModel modelo;
    UsuarioController controller;

    public VistaUsuario() {
        
        initComponents();
       
//        JFormattedTextField textField1 = new JFormattedTextField (new Integer(3));
        fechaUltimoAccso.setDate(new Date());
        fechaUltimoAccFallido.setDate(new Date());
        modelo = new UsuarioModel();
        controller = new UsuarioController(this);
        btnAceptar1.addActionListener(controller);
        btnEliminar.addActionListener(controller);
        btnGuardar.addActionListener(controller);
        btnNuevo.addActionListener(controller);
        btnCancelar1.addActionListener(controller);
        btnactulizar.addActionListener(controller);
        btnasignarPassword.addActionListener(controller);
        btnAceptarPassword.addActionListener(controller);
        btnCancelarPassword.addActionListener(controller);
    }
    
   

    public void settearCampos() {
        btnNuevo.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnImprimir.setEnabled(true);
        btnactulizar.setEnabled(false);
        txtcodigoUsuario.setText("");
        txtCampo1.setText("");
        txtcampo2.setText("");
        txtCampo3.setText("");
        txtcampo4.setText("");
        txtCampo5.setText("");
        txtCampo6.setText("");
        txtCampo7.setText("");
        txtCampo8.setText("");
        txtDescripcionUsu.setText("");
        txtPrioridad.setText("");
        txtcodSucursal.setText("");
        txtconfirmarpassword.setText("");
        txtdescrSucursal.setText("");
        txtintentosFallido.setText("");
        txtpasswordnew.setText("");
        txtvalorUsuario.setText("");
        jchPedirSucursalEnter.setSelected(false);
        jchePermiteCambiarSucursal.setSelected(false);
        jpermitirSelecEmpre.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogUsuarios = new javax.swing.JDialog();
        txtvalorUsuario = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtablaUsuario = new javax.swing.JTable();
        btnAceptar1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jrCodigo1 = new javax.swing.JRadioButton();
        jrDescripcion1 = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jRInicio1 = new javax.swing.JRadioButton();
        jRFinal1 = new javax.swing.JRadioButton();
        jrCualquier1 = new javax.swing.JRadioButton();
        jRexacta1 = new javax.swing.JRadioButton();
        grupoOpcion = new javax.swing.ButtonGroup();
        grupoBusqueda = new javax.swing.ButtonGroup();
        JDialogPassword = new javax.swing.JDialog();
        btnAceptarPassword = new javax.swing.JButton();
        btnCancelarPassword = new javax.swing.JButton();
        lblContrasena = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtpasswordnew = new javax.swing.JPasswordField();
        txtconfirmarpassword = new javax.swing.JPasswordField();
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
        txtcodigoUsuario = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtDescripcionUsu = new javax.swing.JTextField();
        btnasignarPassword = new javax.swing.JButton();
        jpermitirSelecEmpre = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtPrioridad = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtintentosFallido = new javax.swing.JTextField();
        fechaUltimoAccso = new com.toedter.calendar.JDateChooser();
        fechaUltimoAccFallido = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCampo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcampo2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCampo3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcampo4 = new javax.swing.JTextField();
        jchePermiteCambiarSucursal = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        txtcodSucursal = new javax.swing.JTextField();
        txtdescrSucursal = new javax.swing.JTextField();
        jchPedirSucursalEnter = new javax.swing.JCheckBox();
        txtCampo6 = new javax.swing.JTextField();
        txtCampo5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        lblCampo6 = new javax.swing.JLabel();
        Campo7 = new javax.swing.JLabel();
        txtCampo7 = new javax.swing.JTextField();
        Campo8 = new javax.swing.JLabel();
        txtCampo8 = new javax.swing.JTextField();

        jDialogUsuarios.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtvalorUsuario.setToolTipText("Busqueda");
        txtvalorUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtvalorUsuarioKeyPressed(evt);
            }
        });
        jDialogUsuarios.getContentPane().add(txtvalorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 360, -1));

        jLabel20.setText("Buscar :");
        jDialogUsuarios.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtablaUsuario);

        jDialogUsuarios.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        btnAceptar1.setText("Aceptar");
        jDialogUsuarios.getContentPane().add(btnAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 98, -1));

        btnCancelar1.setText("Cancelar");
        btnCancelar1.setToolTipText("Cancelar");
        jDialogUsuarios.getContentPane().add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));

        jLabel21.setText("Total de Registros Encontrados");
        jDialogUsuarios.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        grupoBusqueda.add(jrCodigo1);
        jrCodigo1.setSelected(true);
        jrCodigo1.setText("Codigo");
        jrCodigo1.setToolTipText("Codigo");

        grupoBusqueda.add(jrDescripcion1);
        jrDescripcion1.setText("Descripcion");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
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

        jDialogUsuarios.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        grupoOpcion.add(jRInicio1);
        jRInicio1.setText("1) Inicio");
        jRInicio1.setToolTipText("Coincida al inicio");

        grupoOpcion.add(jRFinal1);
        jRFinal1.setText("2)Final");
        jRFinal1.setToolTipText("Coincida al Final");

        grupoOpcion.add(jrCualquier1);
        jrCualquier1.setSelected(true);
        jrCualquier1.setText("3)Cualquier");
        jrCualquier1.setToolTipText("Cualquier Caracter");

        grupoOpcion.add(jRexacta1);
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

        jDialogUsuarios.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        JDialogPassword.setResizable(false);
        JDialogPassword.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptarPassword.setText("Aceptar");
        btnAceptarPassword.setToolTipText("");
        JDialogPassword.getContentPane().add(btnAceptarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btnCancelarPassword.setText("Cancelar");
        btnCancelarPassword.setToolTipText("");
        JDialogPassword.getContentPane().add(btnCancelarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        lblContrasena.setText("contraseña nueva");
        JDialogPassword.getContentPane().add(lblContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel12.setText("confirmar contraseña:");
        JDialogPassword.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, -1));
        JDialogPassword.getContentPane().add(txtpasswordnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, -1));
        JDialogPassword.getContentPane().add(txtconfirmarpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, -1));

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
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBuscar);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir_1.png"))); // NOI18N
        btnImprimir.setToolTipText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnImprimir);

        add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescripcion.setText("Descripcion :");
        jPanel2.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));

        txtcodigoUsuario.setToolTipText("Codigo Usuario");
        jPanel2.add(txtcodigoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 120, -1));

        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Codigo :");
        jPanel2.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, -1));

        txtDescripcionUsu.setToolTipText("Descripcion Usuario");
        jPanel2.add(txtDescripcionUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 440, -1));

        btnasignarPassword.setText("Asignar Contraseña");
        btnasignarPassword.setToolTipText("Asignar Contraseña");
        jPanel2.add(btnasignarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 170, -1));

        jpermitirSelecEmpre.setText("Permitir Seleccionar Empresa");
        jpermitirSelecEmpre.setToolTipText("Permitir Seleccionar Empresa");
        jPanel2.add(jpermitirSelecEmpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 200, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Prioridad :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 80, 70, -1));

        txtPrioridad.setText("0");
        jPanel2.add(txtPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 120, -1));

        jTabbedPane1.addTab("General", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Estado :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, -1));

        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo", "Bloqueado", "Contrasena Expirada" }));
        jPanel1.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 130, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Ultimo acceso :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 90, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Ultimo acceso fallido :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 110, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("intentos Fallidos :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 96, -1));

        txtintentosFallido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtintentosFallidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtintentosFallido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 130, -1));

        fechaUltimoAccso.setDateFormatString("dd-MM-yy");
        jPanel1.add(fechaUltimoAccso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 130, -1));

        fechaUltimoAccFallido.setDateFormatString("dd-MM-yy");
        jPanel1.add(fechaUltimoAccFallido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 130, -1));

        jTabbedPane1.addTab("Estado", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Campo1 :");
        jLabel4.setToolTipText("");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, -1));

        txtCampo1.setToolTipText("campo1");
        jPanel3.add(txtCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 160, -1));

        jLabel3.setText("Campo2:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 57, -1));

        txtcampo2.setToolTipText("Campo 2");
        jPanel3.add(txtcampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 150, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Campo3 :");
        jLabel8.setToolTipText("");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, -1));

        txtCampo3.setToolTipText("campo3");
        jPanel3.add(txtCampo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 160, -1));

        jLabel9.setText("Campo4:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 57, -1));

        txtcampo4.setToolTipText("Campo 4");
        jPanel3.add(txtcampo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 150, -1));

        jchePermiteCambiarSucursal.setText("Permite Cambiar Sucursal ");
        jPanel3.add(jchePermiteCambiarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 170, -1));

        jLabel10.setText("Sucursal :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));
        jPanel3.add(txtcodSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 100, -1));
        jPanel3.add(txtdescrSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 280, -1));

        jchPedirSucursalEnter.setText("Pedir suscursal al entrar");
        jPanel3.add(jchPedirSucursalEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 210, -1));
        jPanel3.add(txtCampo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 150, -1));
        jPanel3.add(txtCampo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 160, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Campo5 :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 60, -1));

        lblCampo6.setText("Campo6");
        jPanel3.add(lblCampo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 60, -1));

        Campo7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Campo7.setText("Campo7 :");
        jPanel3.add(Campo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 60, -1));
        jPanel3.add(txtCampo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, -1));

        Campo8.setText("Campo8");
        jPanel3.add(Campo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 60, -1));
        jPanel3.add(txtCampo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 150, -1));

        jTabbedPane1.addTab("Datos Adicionales", jPanel3);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 580, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        jtablaUsuario.setModel(new ModeloTablaUsuario(modelo.pObtenerListadoDatos(
                "admin_a",
                "MpUsuario",
                "Cod_Usuario",
                "",
                "2")));
        jDialogUsuarios.setVisible(true);
        jDialogUsuarios.setSize(460, 320);
        jDialogUsuarios.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtvalorUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvalorUsuarioKeyPressed
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
            sfieldName = (jrCodigo1.isSelected()) ? "Cod_Usuario" : "Desc_Usuario";
            jtablaUsuario.setModel(new ModeloTablaUsuario(modelo.pObtenerListadoDatos(
                    "admin_a",
                    "MpUsuario",
                    sfieldName,
                    txtvalorUsuario.getText(),
                    Opcion)
            ));
        }
    }//GEN-LAST:event_txtvalorUsuarioKeyPressed

    private void txtintentosFallidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtintentosFallidoKeyTyped
        // TODO add your handling code here:
       Utilitarios.Utilitario.ValidacionNumerica(evt);
    }//GEN-LAST:event_txtintentosFallidoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Campo7;
    private javax.swing.JLabel Campo8;
    public javax.swing.JDialog JDialogPassword;
    public javax.swing.JButton btnAceptar1;
    public javax.swing.JButton btnAceptarPassword;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar1;
    public javax.swing.JButton btnCancelarPassword;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnactulizar;
    public javax.swing.JButton btnasignarPassword;
    public javax.swing.JComboBox<String> estado;
    public com.toedter.calendar.JDateChooser fechaUltimoAccFallido;
    public com.toedter.calendar.JDateChooser fechaUltimoAccso;
    public javax.swing.ButtonGroup grupoBusqueda;
    public javax.swing.ButtonGroup grupoOpcion;
    public javax.swing.JDialog jDialogUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JRadioButton jRFinal1;
    public javax.swing.JRadioButton jRInicio1;
    public javax.swing.JRadioButton jRexacta1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JCheckBox jchPedirSucursalEnter;
    public javax.swing.JCheckBox jchePermiteCambiarSucursal;
    public javax.swing.JCheckBox jpermitirSelecEmpre;
    public javax.swing.JRadioButton jrCodigo1;
    public javax.swing.JRadioButton jrCualquier1;
    public javax.swing.JRadioButton jrDescripcion1;
    public javax.swing.JTable jtablaUsuario;
    public javax.swing.JLabel lblCampo6;
    public javax.swing.JLabel lblCodigo;
    public javax.swing.JLabel lblContrasena;
    public javax.swing.JLabel lblDescripcion;
    public javax.swing.JTextField txtCampo1;
    public javax.swing.JTextField txtCampo3;
    public javax.swing.JTextField txtCampo5;
    public javax.swing.JTextField txtCampo6;
    public javax.swing.JTextField txtCampo7;
    public javax.swing.JTextField txtCampo8;
    public javax.swing.JTextField txtDescripcionUsu;
    public javax.swing.JTextField txtPrioridad;
    public javax.swing.JTextField txtcampo2;
    public javax.swing.JTextField txtcampo4;
    public javax.swing.JTextField txtcodSucursal;
    public javax.swing.JTextField txtcodigoUsuario;
    public javax.swing.JPasswordField txtconfirmarpassword;
    public javax.swing.JTextField txtdescrSucursal;
    public javax.swing.JTextField txtintentosFallido;
    public javax.swing.JPasswordField txtpasswordnew;
    public javax.swing.JTextField txtvalorUsuario;
    // End of variables declaration//GEN-END:variables

}
