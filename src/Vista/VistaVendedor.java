/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.VendedorController;
import java.util.Date;

/**
 *
 * @author AranaV
 */
public class VistaVendedor extends javax.swing.JPanel {

    /**
     * Creates new form VistaVendedor
     */
    VendedorController controller;
    
    public VistaVendedor() {
        initComponents();
       
        controller = new VendedorController(this);
        btnGuardar.addActionListener(controller);
        btnactulizar.addActionListener(controller);
        btnEliminar.addActionListener(controller);
        btnNuevo.addActionListener(controller);
        btnImprimir.addActionListener(controller);
        btnBuscar.addActionListener(controller);
        txtbuscarVendedor.addKeyListener(controller);
        btnCancelarVendedor.addActionListener(controller);
        btnAceptarVendedor.addActionListener(controller);
        btnAceptarImprimir.addActionListener(controller);
        txtCodZona.addKeyListener(controller);
        txtCodDesde.addKeyListener(controller);
        txtCodHasta.addKeyListener(controller);
        btnAceptarZona.addActionListener(controller);
        btnCancelarZona.addActionListener(controller);
        txtBuscarZona.addKeyListener(controller);
        btnCancelarReporte.addActionListener(controller);
         setteCampos();
    }
    
    public void setteCampos() {
        btnGuardar.setEnabled(true);
        btnactulizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        txtCampo1.setText("");
        txtCampo2.setText("");
        txtCampo3.setText("");
        txtCampo4.setText("");
        txtCampo5.setText("");
        txtCampo6.setText("");
        txtCedula.setText("");
        txtCobros.setText("00");
        txtCodZona.setText("");
        txtCodiVendedor.setText("");
        txtDescripcionZona.setText("");
        txtDireccion.setText("");
        txtNobreVendedor.setText("");
        txtTelefonos.setText("");
        txtVentas.setText("");
        txtbuscarVendedor.setText("");
        cheInactivo.setSelected(false);
        cheCobrador.setSelected(false);
        cheTipo.setSelectedIndex(0);
        cheVendedor.setSelected(false);
        fecha.setDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogVendedor = new javax.swing.JDialog();
        txtbuscarVendedor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtablaVendedor = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jRInicio = new javax.swing.JRadioButton();
        jRFinal = new javax.swing.JRadioButton();
        jrCualquier = new javax.swing.JRadioButton();
        jRexacta = new javax.swing.JRadioButton();
        jPanel11 = new javax.swing.JPanel();
        jrCodigo = new javax.swing.JRadioButton();
        jrDescripcion = new javax.swing.JRadioButton();
        btnAceptarVendedor = new javax.swing.JButton();
        btnCancelarVendedor = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnGrupoOpcionVe = new javax.swing.ButtonGroup();
        btnGrupoBusquedaVe = new javax.swing.ButtonGroup();
        jDialogReporteVendedor = new javax.swing.JDialog();
        jPanel26 = new javax.swing.JPanel();
        comboReporteVendedor = new javax.swing.JComboBox<>();
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
        btnCancelarReporte = new javax.swing.JButton();
        btnAceptarImprimir = new javax.swing.JButton();
        jDialogZona = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtablaZona = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jRInicio1 = new javax.swing.JRadioButton();
        jRFinal1 = new javax.swing.JRadioButton();
        jrCualquier1 = new javax.swing.JRadioButton();
        jRexacta1 = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jrCodigo1 = new javax.swing.JRadioButton();
        jrDescripcion1 = new javax.swing.JRadioButton();
        btnAceptarZona = new javax.swing.JButton();
        btnCancelarZona = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtBuscarZona = new javax.swing.JTextField();
        btnGrupoOpcionZona = new javax.swing.ButtonGroup();
        btnGrupoBusquedaZona = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnactulizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNobreVendedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cheTipo = new javax.swing.JComboBox<>();
        cheInactivo = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefonos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cheVendedor = new javax.swing.JCheckBox();
        cheCobrador = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtCodZona = new javax.swing.JTextField();
        txtDescripcionZona = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtVentas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCobros = new javax.swing.JTextField();
        txtCodiVendedor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCampo1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCampo2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCampo3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCampo4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCampo5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCampo6 = new javax.swing.JTextField();

        jDialogVendedor.setTitle("Busqueda Asistida");
        jDialogVendedor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtbuscarVendedor.setToolTipText("Valor");
        jDialogVendedor.getContentPane().add(txtbuscarVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 390, -1));

        jtablaVendedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtablaVendedor);

        jDialogVendedor.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 450, 120));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionVe.add(jRInicio);
        jRInicio.setText("1) Inicio");
        jRInicio.setToolTipText("Coincida al inicio");

        btnGrupoOpcionVe.add(jRFinal);
        jRFinal.setText("2)Final");
        jRFinal.setToolTipText("Coincida al Final");

        btnGrupoOpcionVe.add(jrCualquier);
        jrCualquier.setSelected(true);
        jrCualquier.setText("3)Cualquier");
        jrCualquier.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionVe.add(jRexacta);
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

        jDialogVendedor.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaVe.add(jrCodigo);
        jrCodigo.setSelected(true);
        jrCodigo.setText("Codigo");
        jrCodigo.setToolTipText("Codigo");

        btnGrupoBusquedaVe.add(jrDescripcion);
        jrDescripcion.setText("Descripcion");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jrCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
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

        jDialogVendedor.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarVendedor.setText("Aceptar");
        jDialogVendedor.getContentPane().add(btnAceptarVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 98, -1));

        btnCancelarVendedor.setText("Cancelar");
        btnCancelarVendedor.setToolTipText("Cancelar");
        jDialogVendedor.getContentPane().add(btnCancelarVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));

        jLabel21.setText("Total de Registros Encontrados");
        jDialogVendedor.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        jLabel20.setText("Buscar :");
        jDialogVendedor.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        jDialogReporteVendedor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboReporteVendedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor Datos Basicos" }));
        jPanel26.add(comboReporteVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 230, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Reporte :");
        jPanel26.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, -1));

        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Descripcion" }));
        jPanel26.add(comboOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 90, -1));

        comboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descendente", "Ascendente" }));
        jPanel26.add(comboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 110, -1));

        jDialogReporteVendedor.getContentPane().add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 60));

        jPanelReporteDatosBasicos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanelReporteDatosBasicos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Rangos :");
        jPanelReporteDatosBasicos.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));

        btnDesde.setText("Desde");
        jPanelReporteDatosBasicos.add(btnDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 190, -1));

        jButton3.setText("Hasta");
        jPanelReporteDatosBasicos.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 210, -1));
        jPanelReporteDatosBasicos.add(txtDescripDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 120, -1));
        jPanelReporteDatosBasicos.add(txtCodDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 60, -1));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("Codigo :");
        jPanelReporteDatosBasicos.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, -1));
        jPanelReporteDatosBasicos.add(txtCodHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 60, -1));
        jPanelReporteDatosBasicos.add(txtDescripHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 140, -1));

        jDialogReporteVendedor.getContentPane().add(jPanelReporteDatosBasicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 510, 270));

        btnCancelarReporte.setText("Cancelar");
        jDialogReporteVendedor.getContentPane().add(btnCancelarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 80, -1));

        btnAceptarImprimir.setText("Aceptar");
        btnAceptarImprimir.setToolTipText("");
        jDialogReporteVendedor.getContentPane().add(btnAceptarImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 80, -1));

        jDialogZona.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Buscar :");
        jDialogZona.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtablaZona.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jtablaZona);

        jDialogZona.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 450, 120));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionZona.add(jRInicio1);
        jRInicio1.setText("1) Inicio");
        jRInicio1.setToolTipText("Coincida al inicio");

        btnGrupoOpcionZona.add(jRFinal1);
        jRFinal1.setText("2)Final");
        jRFinal1.setToolTipText("Coincida al Final");

        btnGrupoOpcionZona.add(jrCualquier1);
        jrCualquier1.setSelected(true);
        jrCualquier1.setText("3)Cualquier");
        jrCualquier1.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionZona.add(jRexacta1);
        jRexacta1.setText("4)exacta");
        jRexacta1.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRexacta1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrCualquier1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRInicio1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jRInicio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexacta1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogZona.getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaZona.add(jrCodigo1);
        jrCodigo1.setSelected(true);
        jrCodigo1.setText("Codigo");
        jrCodigo1.setToolTipText("Codigo");

        btnGrupoBusquedaZona.add(jrDescripcion1);
        jrDescripcion1.setText("Descripcion");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jrCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jrCodigo1)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogZona.getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarZona.setText("Aceptar");
        jDialogZona.getContentPane().add(btnAceptarZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 98, -1));

        btnCancelarZona.setText("Cancelar");
        btnCancelarZona.setToolTipText("Cancelar");
        jDialogZona.getContentPane().add(btnCancelarZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));

        jLabel23.setText("Total de Registros Encontrados");
        jDialogZona.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        txtBuscarZona.setToolTipText("");
        jDialogZona.getContentPane().add(txtBuscarZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 380, -1));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Codigo : ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre :");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 40, 60, 20));

        txtNobreVendedor.setToolTipText("Nombre");
        jPanel2.add(txtNobreVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 510, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cedula :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 70, 50, 20));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 150, -1));
        jPanel2.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 120, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fecha : ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 60, 20));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tipo :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 50, 20));

        cheTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F", "E" }));
        jPanel2.add(cheTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 80, -1));

        cheInactivo.setText("Inactivo");
        jPanel2.add(cheInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Direccion :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 100, 60, 20));

        txtDireccion.setToolTipText("Direccion");
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 510, -1));

        txtTelefonos.setToolTipText("Telefonos");
        jPanel2.add(txtTelefonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 250, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telefonos :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 130, 70, 20));

        cheVendedor.setText("Vendedor");
        cheVendedor.setToolTipText("Funcion Vendedor");
        jPanel2.add(cheVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        cheCobrador.setText("Cobrador");
        jPanel2.add(cheCobrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 80, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Zona :");
        jLabel8.setToolTipText("");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, 20));

        txtCodZona.setToolTipText("");
        jPanel2.add(txtCodZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 110, -1));

        txtDescripcionZona.setToolTipText("");
        jPanel2.add(txtDescripcionZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 390, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Comision"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Ventas :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 60, 20));
        jPanel3.add(txtVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 130, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Cobros :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 80, 20));
        jPanel3.add(txtCobros, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 150, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 610, 70));

        txtCodiVendedor.setToolTipText("Codigo");
        jPanel2.add(txtCodiVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 150, -1));

        jTabbedPane1.addTab("General", jPanel2);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Campo1 :");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 60, 20));

        txtCampo1.setToolTipText("Campos");
        jPanel4.add(txtCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 110, -1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Campo2 :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 60, 20));

        txtCampo2.setToolTipText("Campos");
        jPanel4.add(txtCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 110, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Campo3 :");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 60, 20));

        txtCampo3.setToolTipText("Campos");
        jPanel4.add(txtCampo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 110, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Campo4 :");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 60, 20));

        txtCampo4.setToolTipText("Campos");
        jPanel4.add(txtCampo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 110, -1));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Campo5 :");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 60, 20));

        txtCampo5.setToolTipText("Campos");
        jPanel4.add(txtCampo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 110, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Campo6 :");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 60, 20));

        txtCampo6.setToolTipText("Campos");
        jPanel4.add(txtCampo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 110, -1));

        jTabbedPane1.addTab("Adicionales", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 300));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 720, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptarImprimir;
    public javax.swing.JButton btnAceptarVendedor;
    public javax.swing.JButton btnAceptarZona;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelarReporte;
    public javax.swing.JButton btnCancelarVendedor;
    public javax.swing.JButton btnCancelarZona;
    private javax.swing.JButton btnDesde;
    public javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup btnGrupoBusquedaVe;
    private javax.swing.ButtonGroup btnGrupoBusquedaZona;
    private javax.swing.ButtonGroup btnGrupoOpcionVe;
    private javax.swing.ButtonGroup btnGrupoOpcionZona;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnNuevo;
    public javax.swing.JButton btnactulizar;
    public javax.swing.JCheckBox cheCobrador;
    public javax.swing.JCheckBox cheInactivo;
    public javax.swing.JComboBox<String> cheTipo;
    public javax.swing.JCheckBox cheVendedor;
    public javax.swing.JComboBox<String> comboCriterio;
    public javax.swing.JComboBox<String> comboOrdenar;
    public javax.swing.JComboBox<String> comboReporteVendedor;
    public com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton jButton3;
    public javax.swing.JDialog jDialogReporteVendedor;
    public javax.swing.JDialog jDialogVendedor;
    public javax.swing.JDialog jDialogZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanelReporteDatosBasicos;
    public javax.swing.JRadioButton jRFinal;
    public javax.swing.JRadioButton jRFinal1;
    public javax.swing.JRadioButton jRInicio;
    public javax.swing.JRadioButton jRInicio1;
    public javax.swing.JRadioButton jRexacta;
    public javax.swing.JRadioButton jRexacta1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JRadioButton jrCodigo;
    public javax.swing.JRadioButton jrCodigo1;
    public javax.swing.JRadioButton jrCualquier;
    public javax.swing.JRadioButton jrCualquier1;
    public javax.swing.JRadioButton jrDescripcion;
    public javax.swing.JRadioButton jrDescripcion1;
    public javax.swing.JTable jtablaVendedor;
    public javax.swing.JTable jtablaZona;
    public javax.swing.JTextField txtBuscarZona;
    public javax.swing.JTextField txtCampo1;
    public javax.swing.JTextField txtCampo2;
    public javax.swing.JTextField txtCampo3;
    public javax.swing.JTextField txtCampo4;
    public javax.swing.JTextField txtCampo5;
    public javax.swing.JTextField txtCampo6;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtCobros;
    public javax.swing.JTextField txtCodDesde;
    public javax.swing.JTextField txtCodHasta;
    public javax.swing.JTextField txtCodZona;
    public javax.swing.JTextField txtCodiVendedor;
    public javax.swing.JTextField txtDescripDesde;
    public javax.swing.JTextField txtDescripHasta;
    public javax.swing.JTextField txtDescripcionZona;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtNobreVendedor;
    public javax.swing.JTextField txtTelefonos;
    public javax.swing.JTextField txtVentas;
    public javax.swing.JTextField txtbuscarVendedor;
    // End of variables declaration//GEN-END:variables
}
