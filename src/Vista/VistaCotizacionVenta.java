/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.CotizacionClienteController;
import java.util.Date;

/**
 *
 * @author AranaV
 */
public class VistaCotizacionVenta extends javax.swing.JPanel {

    CotizacionClienteController cotizacionClienteController;
   //public int FILA_jtablaCotizacionsReng = 0;
    public static int FILA_jtablaCotizacionReng = 0;

    /**
     * Creates new form VistaCotizacionVenta
     */
    public VistaCotizacionVenta() {
        initComponents();
        setterCampos();
        cotizacionClienteController = new CotizacionClienteController(this);
        cotizacionClienteController.cargarDatosCotizacionClientesVentasRenglon("0");
        btnGuardar1.addActionListener(cotizacionClienteController);
        btnactulizar.addActionListener(cotizacionClienteController);
        btnEliminar1.addActionListener(cotizacionClienteController);
        btnNuevo1.addActionListener(cotizacionClienteController);
        btnImprimir1.addActionListener(cotizacionClienteController);
        btnFacturar.addActionListener(cotizacionClienteController);
        btnBuscar.addActionListener(cotizacionClienteController);
        btnAceptarCotizacion.addActionListener(cotizacionClienteController);
        btnCancelarCotizacion.addActionListener(cotizacionClienteController);
        txtcdiCliente.addKeyListener(cotizacionClienteController);
        TxtCodPago.addKeyListener(cotizacionClienteController);
        txtCodVendedor.addKeyListener(cotizacionClienteController);
        txtTransporte.addKeyListener(cotizacionClienteController);
        TxtMoneda.addKeyListener(cotizacionClienteController);

        txtBuscarCliente.addKeyListener(cotizacionClienteController);
        txtBuscarVendedor.addKeyListener(cotizacionClienteController);
        txtBuscarTransporte.addKeyListener(cotizacionClienteController);
        txtBuscarMoneda.addKeyListener(cotizacionClienteController);

        btnAceptarCliente.addActionListener(cotizacionClienteController);
        btnAceptarVendedor.addActionListener(cotizacionClienteController);
        btnAceptarMonedas.addActionListener(cotizacionClienteController);
        btnAceptarTransporte.addActionListener(cotizacionClienteController);
        btnAceptarCondicionPag.addActionListener(cotizacionClienteController);

        btnCancelarCliente.addActionListener(cotizacionClienteController);
        btnCancelarCondicionPag.addActionListener(cotizacionClienteController);
        btnCancelarCotizacion.addActionListener(cotizacionClienteController);
        btnCancelarMoneda.addActionListener(cotizacionClienteController);
        btnCancelarTransporte.addActionListener(cotizacionClienteController);
        btnCancelarVendedor.addActionListener(cotizacionClienteController);
        btnagregar.addActionListener(cotizacionClienteController);
        btnrestar.addActionListener(cotizacionClienteController);

        txtValorCondicionPago.addKeyListener(cotizacionClienteController);
        txtBuscarCliente.addKeyListener(cotizacionClienteController);
        txtBuscarVendedor.addKeyListener(cotizacionClienteController);
        txtBuscarTransporte.addKeyListener(cotizacionClienteController);
        txtBuscarMoneda.addKeyListener(cotizacionClienteController);

        jTablaCotizacionRenglon.setCellSelectionEnabled(true);
        jTablaCotizacionRenglon.addKeyListener(cotizacionClienteController);

        txtSubTotalBruto.setEditable(false);
        txtImpuesto.setEditable(false);
        txtOtros.setEditable(false);
        txtTotalNeto.setEditable(false);
        txtMontoDescuento.setEditable(false);
        TxtRec2.setEditable(false);
    }

    public void setterCampos() {
        TxtCampo1.setText("");
        TxtCampo2.setText("");
        TxtCampo3.setText("");
        TxtCampo4.setText("");
        TxtCampo5.setText("");
        TxtCampo6.setText("");
        txtDescripcionClientes.setText("");
        txtcdiCliente.setText("");
        TxtCodPago.setText("");
        TxtDescripcionCodPago.setText("");
        txtDescuesto.setText("");
        TxtDireccionEntrega.setText("");
        TxtMoneda.setText("");
        TxtMoneda2.setText("");
        txtRec.setText("");
        txtTransporte.setText("");
        TxtTransporte2.setText("");
        txtCodVendedor.setText("");
        TxtVendedor2.setText("");
        txtNumCotizacion.setText("");
        txtDescripcionCotizacion.setText("");
        txtTasa.setText("");
        fechaEmision.setDate(new Date());
        fechaVencimiento.setDate(new Date());
        fechaVencimiento.setDate(new Date());
        btnGuardar1.setEnabled(true);
        btnEliminar1.setEnabled(false);
        btnactulizar.setEnabled(false);
        txtTotalNeto.setText("0.0");
        txtOtros.setText("0.0");
        txtImpuesto.setText("0.0");
        txtSubTotalBruto.setText("0.0");
        txtMontoDescuento.setText("0.0");
        TxtRec2.setText("0.0");
        txtStatusCotizcion.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogCotizacionCliente = new javax.swing.JDialog();
        jLabel34 = new javax.swing.JLabel();
        txtBuscarCotizacion = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtablaCotizacion = new javax.swing.JTable();
        btnAceptarCotizacion = new javax.swing.JButton();
        btnCancelarCotizacion = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jrCodigo2 = new javax.swing.JRadioButton();
        jrCliente = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jRInicio = new javax.swing.JRadioButton();
        jRFinal = new javax.swing.JRadioButton();
        jrCualquier = new javax.swing.JRadioButton();
        JRExacta = new javax.swing.JRadioButton();
        jDialogCliente = new javax.swing.JDialog();
        jLabel33 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtablaCliente = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jRInicioCliente = new javax.swing.JRadioButton();
        jRFinalCliente = new javax.swing.JRadioButton();
        jrCualquierCliente = new javax.swing.JRadioButton();
        jrExactaCliente = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jrCodigoCliente = new javax.swing.JRadioButton();
        jrClienteCliente = new javax.swing.JRadioButton();
        btnAceptarCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        jDialogCondiicionPago = new javax.swing.JDialog();
        jLabel35 = new javax.swing.JLabel();
        txtValorCondicionPago = new javax.swing.JTextField();
        jtableCondPago = new javax.swing.JScrollPane();
        jtablaCondicionPago = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jRInicioCondPago = new javax.swing.JRadioButton();
        jRFinalCondPago = new javax.swing.JRadioButton();
        jrCualquierCondPago = new javax.swing.JRadioButton();
        jRexactaCondPago = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jrCodigoCondPago = new javax.swing.JRadioButton();
        jrDescripcionCondPago = new javax.swing.JRadioButton();
        btnAceptarCondicionPag = new javax.swing.JButton();
        btnCancelarCondicionPag = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jDialogVendedor = new javax.swing.JDialog();
        jLabel37 = new javax.swing.JLabel();
        txtBuscarVendedor = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtablaVendedor = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jRInicioVendedor = new javax.swing.JRadioButton();
        jRFinalVendedor = new javax.swing.JRadioButton();
        jrCualquierVendedor = new javax.swing.JRadioButton();
        JRExactaVendedor = new javax.swing.JRadioButton();
        jPanel12 = new javax.swing.JPanel();
        jrCodigoVendedor = new javax.swing.JRadioButton();
        jrClienteVendedor = new javax.swing.JRadioButton();
        btnAceptarVendedor = new javax.swing.JButton();
        btnCancelarVendedor = new javax.swing.JButton();
        jDialogTransporte = new javax.swing.JDialog();
        txtBuscarTransporte = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtablaTransporte = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jRInicioTransporte = new javax.swing.JRadioButton();
        jRFinalTransporte = new javax.swing.JRadioButton();
        jrCualquierTransporte = new javax.swing.JRadioButton();
        jRexactaTransporte = new javax.swing.JRadioButton();
        jPanel16 = new javax.swing.JPanel();
        jrCodigoTransporte = new javax.swing.JRadioButton();
        jrDescripcionTransporte = new javax.swing.JRadioButton();
        btnAceptarTransporte = new javax.swing.JButton();
        btnCancelarTransporte = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jDialogMoneda = new javax.swing.JDialog();
        jLabel40 = new javax.swing.JLabel();
        txtBuscarMoneda = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtableMonedas = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jRInicioMoneda = new javax.swing.JRadioButton();
        jRFinalMoneda = new javax.swing.JRadioButton();
        jrCualquierMoneda = new javax.swing.JRadioButton();
        jRexactaMoneda = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        jrCodigoMoneda = new javax.swing.JRadioButton();
        jrDescripcion = new javax.swing.JRadioButton();
        btnAceptarMonedas = new javax.swing.JButton();
        btnCancelarMoneda = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        btnGrupoOpcionCliente = new javax.swing.ButtonGroup();
        btnGrupoBusquedaCliente = new javax.swing.ButtonGroup();
        btnGrupoOpcionCondPago = new javax.swing.ButtonGroup();
        btnGrupoBusquedaCondPago = new javax.swing.ButtonGroup();
        btnGrupoOpcionVendedor = new javax.swing.ButtonGroup();
        btnGrupoBusqudaVendedor = new javax.swing.ButtonGroup();
        btnGrupoOpcionTransporte = new javax.swing.ButtonGroup();
        btnGrupoBusquedaTransporte = new javax.swing.ButtonGroup();
        btnGrupoOpcionMoneda = new javax.swing.ButtonGroup();
        btnGrupoBusquedaMoneda = new javax.swing.ButtonGroup();
        btnGrupoOpcionCotizacion = new javax.swing.ButtonGroup();
        btnGrupoBusquedaCotizacion = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtCodPago = new javax.swing.JTextField();
        TxtDescripcionCodPago = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCodVendedor = new javax.swing.JTextField();
        TxtVendedor2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTransporte = new javax.swing.JTextField();
        TxtTransporte2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        TxtMoneda = new javax.swing.JTextField();
        TxtMoneda2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtTasa = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaCotizacionRenglon = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel46 = new javax.swing.JLabel();
        txtMontoIGTF = new javax.swing.JTextField();
        btnFacturar = new javax.swing.JButton();
        btnProcesar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtDescuesto = new javax.swing.JTextField();
        txtMontoDescuento = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtRec = new javax.swing.JTextField();
        TxtRec2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtSubTotalBruto = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtImpuesto = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtOtros = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTotalNeto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        fechaVencimiento = new com.toedter.calendar.JDateChooser();
        fechaEmision = new com.toedter.calendar.JDateChooser();
        txtNumCotizacion = new javax.swing.JTextField();
        txtcdiCliente = new javax.swing.JTextField();
        txtDescripcionClientes = new javax.swing.JTextField();
        txtDescripcionCotizacion = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        txtStatusCotizcion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        TxtDireccionEntrega = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtCampo1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtCampo2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxtCampo3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TxtCampo4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TxtCampo5 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TxtCampo6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtxComentario = new javax.swing.JTextArea();
        jToolBar2 = new javax.swing.JToolBar();
        btnNuevo1 = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        btnactulizar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnImprimir1 = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btnrestar = new javax.swing.JButton();

        jDialogCotizacionCliente.setTitle("Busqueda Asistida");
        jDialogCotizacionCliente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setText("Buscar :");
        jDialogCotizacionCliente.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        jDialogCotizacionCliente.getContentPane().add(txtBuscarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 350, -1));

        jtablaCotizacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jtablaCotizacion);

        jDialogCotizacionCliente.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 470, 110));

        btnAceptarCotizacion.setText("Aceptar");
        btnAceptarCotizacion.setToolTipText("Aceptar");
        jDialogCotizacionCliente.getContentPane().add(btnAceptarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 110, 30));

        btnCancelarCotizacion.setText("Cancelar");
        btnCancelarCotizacion.setToolTipText("Cancelar");
        jDialogCotizacionCliente.getContentPane().add(btnCancelarCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 110, 30));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaCotizacion.add(jrCodigo2);
        jrCodigo2.setSelected(true);
        jrCodigo2.setText("Codigo");
        jrCodigo2.setToolTipText("Codigo");

        btnGrupoBusquedaCotizacion.add(jrCliente);
        jrCliente.setText("Cliente");

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
                    .addComponent(jrCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrCodigo2)
                .addGap(11, 11, 11)
                .addComponent(jrCliente)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogCotizacionCliente.getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 150, 100));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionCotizacion.add(jRInicio);
        jRInicio.setText("1) Coincida al Inicio");
        jRInicio.setToolTipText("Coincida al inicio");

        btnGrupoOpcionCotizacion.add(jRFinal);
        jRFinal.setText("2)Coincida al Final");
        jRFinal.setToolTipText("Coincida al Final");

        btnGrupoOpcionCotizacion.add(jrCualquier);
        jrCualquier.setSelected(true);
        jrCualquier.setText("3)Cualquier Caracter");
        jrCualquier.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionCotizacion.add(JRExacta);
        JRExacta.setText("5)Exacta");
        JRExacta.setToolTipText("Exacta");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jrCualquier)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JRExacta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jRInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JRExacta)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jDialogCotizacionCliente.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 140));

        jDialogCliente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setText("Buscar :");
        jDialogCliente.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        jDialogCliente.getContentPane().add(txtBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 340, -1));

        jtablaCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jtablaCliente);

        jDialogCliente.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 440, 110));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionCliente.add(jRInicioCliente);
        jRInicioCliente.setText("1) Coincida al Inicio");
        jRInicioCliente.setToolTipText("Coincida al inicio");

        btnGrupoOpcionCliente.add(jRFinalCliente);
        jRFinalCliente.setText("2)Coincida al Final");
        jRFinalCliente.setToolTipText("Coincida al Final");

        btnGrupoOpcionCliente.add(jrCualquierCliente);
        jrCualquierCliente.setSelected(true);
        jrCualquierCliente.setText("3)Cualquier Caracter");
        jrCualquierCliente.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionCliente.add(jrExactaCliente);
        jrExactaCliente.setText("5)Exacta");
        jrExactaCliente.setToolTipText("Exacta");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jrCualquierCliente)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRFinalCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRInicioCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrExactaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jRInicioCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinalCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquierCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrExactaCliente)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jDialogCliente.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 150));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaCliente.add(jrCodigoCliente);
        jrCodigoCliente.setSelected(true);
        jrCodigoCliente.setText("Codigo");
        jrCodigoCliente.setToolTipText("Codigo");

        btnGrupoBusquedaCliente.add(jrClienteCliente);
        jrClienteCliente.setText("Cliente");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jrCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jrClienteCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrCodigoCliente)
                .addGap(11, 11, 11)
                .addComponent(jrClienteCliente)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogCliente.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 130, 100));

        btnAceptarCliente.setText("Aceptar");
        btnAceptarCliente.setToolTipText("Aceptar");
        jDialogCliente.getContentPane().add(btnAceptarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 110, 30));

        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.setToolTipText("Cancelar");
        jDialogCliente.getContentPane().add(btnCancelarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 110, 30));

        jDialogCondiicionPago.setTitle("Busqueda Asistida");
        jDialogCondiicionPago.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setText("Buscar :");
        jDialogCondiicionPago.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        txtValorCondicionPago.setToolTipText("Valor");
        jDialogCondiicionPago.getContentPane().add(txtValorCondicionPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 370, -1));

        jtablaCondicionPago.setModel(new javax.swing.table.DefaultTableModel(
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
        jtableCondPago.setViewportView(jtablaCondicionPago);

        jDialogCondiicionPago.getContentPane().add(jtableCondPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 440, 120));

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionCondPago.add(jRInicioCondPago);
        jRInicioCondPago.setText("1) Inicio");
        jRInicioCondPago.setToolTipText("Coincida al inicio");

        btnGrupoOpcionCondPago.add(jRFinalCondPago);
        jRFinalCondPago.setText("2)Final");
        jRFinalCondPago.setToolTipText("Coincida al Final");

        btnGrupoOpcionCondPago.add(jrCualquierCondPago);
        jrCualquierCondPago.setSelected(true);
        jrCualquierCondPago.setText("3)Cualquier");
        jrCualquierCondPago.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionCondPago.add(jRexactaCondPago);
        jRexactaCondPago.setText("4)exacta");
        jRexactaCondPago.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinalCondPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jrCualquierCondPago)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jRInicioCondPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexactaCondPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jRInicioCondPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinalCondPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquierCondPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexactaCondPago)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogCondiicionPago.getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaCondPago.add(jrCodigoCondPago);
        jrCodigoCondPago.setSelected(true);
        jrCodigoCondPago.setText("Codigo");
        jrCodigoCondPago.setToolTipText("Codigo");

        btnGrupoBusquedaCondPago.add(jrDescripcionCondPago);
        jrDescripcionCondPago.setText("Descripcion");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcionCondPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jrCodigoCondPago, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jrCodigoCondPago)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcionCondPago)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogCondiicionPago.getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarCondicionPag.setText("Aceptar");
        jDialogCondiicionPago.getContentPane().add(btnAceptarCondicionPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 98, -1));

        btnCancelarCondicionPag.setText("Cancelar");
        btnCancelarCondicionPag.setToolTipText("Cancelar");
        jDialogCondiicionPago.getContentPane().add(btnCancelarCondicionPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));

        jLabel36.setText("Total de Registros Encontrados");
        jDialogCondiicionPago.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        jDialogVendedor.setTitle("Busqueda Asistida");
        jDialogVendedor.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setText("Buscar :");
        jDialogVendedor.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        jDialogVendedor.getContentPane().add(txtBuscarVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 350, -1));

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
        jScrollPane6.setViewportView(jtablaVendedor);

        jDialogVendedor.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 440, 110));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionVendedor.add(jRInicioVendedor);
        jRInicioVendedor.setText("1) Coincida al Inicio");
        jRInicioVendedor.setToolTipText("Coincida al inicio");

        btnGrupoOpcionVendedor.add(jRFinalVendedor);
        jRFinalVendedor.setText("2)Coincida al Final");
        jRFinalVendedor.setToolTipText("Coincida al Final");

        btnGrupoOpcionVendedor.add(jrCualquierVendedor);
        jrCualquierVendedor.setSelected(true);
        jrCualquierVendedor.setText("3)Cualquier Caracter");
        jrCualquierVendedor.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionVendedor.add(JRExactaVendedor);
        JRExactaVendedor.setText("5)Exacta");
        JRExactaVendedor.setToolTipText("Exacta");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jrCualquierVendedor)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRFinalVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRInicioVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JRExactaVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jRInicioVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinalVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquierVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JRExactaVendedor)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jDialogVendedor.getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 140));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusqudaVendedor.add(jrCodigoVendedor);
        jrCodigoVendedor.setSelected(true);
        jrCodigoVendedor.setText("Codigo");
        jrCodigoVendedor.setToolTipText("Codigo");

        btnGrupoBusqudaVendedor.add(jrClienteVendedor);
        jrClienteVendedor.setText("Cliente");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jrCodigoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jrClienteVendedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrCodigoVendedor)
                .addGap(11, 11, 11)
                .addComponent(jrClienteVendedor)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogVendedor.getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 130, 100));

        btnAceptarVendedor.setText("Aceptar");
        btnAceptarVendedor.setToolTipText("Aceptar");
        jDialogVendedor.getContentPane().add(btnAceptarVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 110, 30));

        btnCancelarVendedor.setText("Cancelar");
        btnCancelarVendedor.setToolTipText("Cancelar");
        jDialogVendedor.getContentPane().add(btnCancelarVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 110, 30));

        jDialogTransporte.setTitle("Busqueda Asistida");
        jDialogTransporte.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDialogTransporte.getContentPane().add(txtBuscarTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 360, -1));

        jLabel38.setText("Buscar :");
        jDialogTransporte.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtablaTransporte.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtablaTransporte);

        jDialogTransporte.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 450, 120));

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionTransporte.add(jRInicioTransporte);
        jRInicioTransporte.setText("1) Inicio");
        jRInicioTransporte.setToolTipText("Coincida al inicio");

        btnGrupoOpcionTransporte.add(jRFinalTransporte);
        jRFinalTransporte.setText("2)Final");
        jRFinalTransporte.setToolTipText("Coincida al Final");

        btnGrupoOpcionTransporte.add(jrCualquierTransporte);
        jrCualquierTransporte.setSelected(true);
        jrCualquierTransporte.setText("3)Cualquier");
        jrCualquierTransporte.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionTransporte.add(jRexactaTransporte);
        jRexactaTransporte.setText("4)exacta");
        jRexactaTransporte.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinalTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jrCualquierTransporte)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jRInicioTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexactaTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jRInicioTransporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinalTransporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquierTransporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexactaTransporte)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogTransporte.getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaTransporte.add(jrCodigoTransporte);
        jrCodigoTransporte.setSelected(true);
        jrCodigoTransporte.setText("Codigo");
        jrCodigoTransporte.setToolTipText("Codigo");

        btnGrupoBusquedaTransporte.add(jrDescripcionTransporte);
        jrDescripcionTransporte.setText("Descripcion");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcionTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jrCodigoTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jrCodigoTransporte)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcionTransporte)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogTransporte.getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarTransporte.setText("Aceptar");
        jDialogTransporte.getContentPane().add(btnAceptarTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 98, -1));

        btnCancelarTransporte.setText("Cancelar");
        btnCancelarTransporte.setToolTipText("Cancelar");
        jDialogTransporte.getContentPane().add(btnCancelarTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));

        jLabel39.setText("Total de Registros Encontrados");
        jDialogTransporte.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        jDialogMoneda.setTitle("Busqueda Asistida");
        jDialogMoneda.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setText("Buscar :");
        jDialogMoneda.getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));
        jDialogMoneda.getContentPane().add(txtBuscarMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 380, -1));

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

        jDialogMoneda.getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcionMoneda.add(jRInicioMoneda);
        jRInicioMoneda.setText("1) Inicio");
        jRInicioMoneda.setToolTipText("Coincida al inicio");

        btnGrupoOpcionMoneda.add(jRFinalMoneda);
        jRFinalMoneda.setText("2)Final");
        jRFinalMoneda.setToolTipText("Coincida al Final");

        btnGrupoOpcionMoneda.add(jrCualquierMoneda);
        jrCualquierMoneda.setSelected(true);
        jrCualquierMoneda.setText("3)Cualquier");
        jrCualquierMoneda.setToolTipText("Cualquier Caracter");

        btnGrupoOpcionMoneda.add(jRexactaMoneda);
        jRexactaMoneda.setText("4)exacta");
        jRexactaMoneda.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinalMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jrCualquierMoneda)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jRInicioMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexactaMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jRInicioMoneda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinalMoneda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquierMoneda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexactaMoneda)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogMoneda.getContentPane().add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusquedaMoneda.add(jrCodigoMoneda);
        jrCodigoMoneda.setSelected(true);
        jrCodigoMoneda.setText("Codigo");
        jrCodigoMoneda.setToolTipText("Codigo");

        btnGrupoBusquedaMoneda.add(jrDescripcion);
        jrDescripcion.setText("Descripcion");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jrCodigoMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jrCodigoMoneda)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcion)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogMoneda.getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarMonedas.setText("Aceptar");
        jDialogMoneda.getContentPane().add(btnAceptarMonedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 100, -1));

        btnCancelarMoneda.setText("Cancelar");
        jDialogMoneda.getContentPane().add(btnCancelarMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel41.setText("Total de Registros Encontrados");
        jDialogMoneda.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Numero :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 60, 20));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cliente :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 50, 20));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cod.Pago :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 60, 20));
        jPanel1.add(TxtCodPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 60, -1));
        jPanel1.add(TxtDescripcionCodPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 200, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Vendedor :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 60, 20));
        jPanel1.add(txtCodVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 60, -1));
        jPanel1.add(TxtVendedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 200, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripcion :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, 20));

        jLabel6.setText("Status :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, 20));

        jLabel7.setText("Fecha :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 40, 20));

        jLabel8.setText("Fecha Venc:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, 20));

        jLabel10.setText("Transporte:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, 20));
        jPanel1.add(txtTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 70, -1));
        jPanel1.add(TxtTransporte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 230, -1));

        jLabel26.setText("Moneda.");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 50, -1));
        jPanel1.add(TxtMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 70, -1));
        jPanel1.add(TxtMoneda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 200, -1));

        jButton1.setText("Conversion");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 100, -1));
        jPanel1.add(txtTasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 100, -1));

        jTabbedPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablaCotizacionRenglon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTablaCotizacionRenglon);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1010, 110));

        jTabbedPane2.addTab("Detalles", jPanel3);

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Desea Calcular el IGTF ?");
        jPanel20.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 20));

        jCheckBox1.setText("SI");
        jPanel20.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 40, -1));

        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("3 %");
        jPanel20.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 30, 20));

        txtMontoIGTF.setToolTipText("");
        jPanel20.add(txtMontoIGTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 90, -1));

        jTabbedPane2.addTab("IGTF", jPanel20);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1030, 160));

        btnFacturar.setText("Facturar");
        jPanel1.add(btnFacturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, -1));

        btnProcesar.setText("Procesar");
        jPanel1.add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 90, -1));

        jButton6.setText("Despachar");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 90, -1));

        jLabel27.setText("%");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        jLabel28.setText("Monto");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        jLabel29.setText("Desc:");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));
        jPanel1.add(txtDescuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 40, -1));
        jPanel1.add(txtMontoDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 120, -1));

        jLabel30.setText("Rec:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));
        jPanel1.add(txtRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 40, -1));

        TxtRec2.setToolTipText("");
        jPanel1.add(TxtRec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 120, -1));

        jLabel31.setText("Sub-Total:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 60, 20));

        txtSubTotalBruto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSubTotalBruto.setToolTipText("");
        jPanel1.add(txtSubTotalBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 90, -1));

        jLabel32.setText("I.V.A:");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, 20));

        txtImpuesto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtImpuesto.setToolTipText("");
        jPanel1.add(txtImpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 90, -1));

        jLabel18.setText("Otros:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, -1, 20));

        txtOtros.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 90, -1));
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, -1, -1));

        txtTotalNeto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalNeto.setToolTipText("");
        jPanel1.add(txtTotalNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 90, -1));

        jLabel21.setText("Total:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, -1, 20));
        jPanel1.add(fechaVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 130, -1));
        jPanel1.add(fechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 130, -1));
        jPanel1.add(txtNumCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 270, -1));
        jPanel1.add(txtcdiCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, -1));
        jPanel1.add(txtDescripcionClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 200, -1));
        jPanel1.add(txtDescripcionCotizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 270, -1));

        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Monto en otra moneda :");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 180, -1));

        jButton7.setText("Importar");
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 90, -1));

        txtStatusCotizcion.setToolTipText("Estatus");
        jPanel1.add(txtStatusCotizcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 130, -1));

        jTabbedPane1.addTab("General", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Direccion de Entrega");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, 60));
        jPanel2.add(TxtDireccionEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 290, 100));

        jLabel12.setText("Campo1");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));
        jPanel2.add(TxtCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 160, 40));

        jLabel13.setText("Campo2");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));
        jPanel2.add(TxtCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 160, 40));

        jLabel14.setText("Campo3");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));
        jPanel2.add(TxtCampo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, 40));

        jLabel15.setText("Campo4");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));
        jPanel2.add(TxtCampo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 160, 40));

        jLabel16.setText("Campo5");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));
        jPanel2.add(TxtCampo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 160, 40));

        jLabel17.setText("Campo6");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, -1));
        jPanel2.add(TxtCampo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 160, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Comentario :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 100, -1));

        txtxComentario.setColumns(20);
        txtxComentario.setRows(5);
        jScrollPane2.setViewportView(txtxComentario);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 360, -1));

        jTabbedPane1.addTab("Adicionales", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1080, 530));

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
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jToolBar2.add(btnBuscar);

        btnImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir_1.png"))); // NOI18N
        btnImprimir1.setToolTipText("Imprimir");
        btnImprimir1.setFocusable(false);
        btnImprimir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnImprimir1);

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar2.png"))); // NOI18N
        btnagregar.setFocusable(false);
        btnagregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnagregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnagregar);

        btnrestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/restar.png"))); // NOI18N
        btnrestar.setFocusable(false);
        btnrestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnrestar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnrestar);

        add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 970, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton JRExacta;
    public javax.swing.JRadioButton JRExactaVendedor;
    public javax.swing.JTextField TxtCampo1;
    public javax.swing.JTextField TxtCampo2;
    public javax.swing.JTextField TxtCampo3;
    public javax.swing.JTextField TxtCampo4;
    public javax.swing.JTextField TxtCampo5;
    public javax.swing.JTextField TxtCampo6;
    public javax.swing.JTextField TxtCodPago;
    public javax.swing.JTextField TxtDescripcionCodPago;
    public javax.swing.JTextField TxtDireccionEntrega;
    public javax.swing.JTextField TxtMoneda;
    public javax.swing.JTextField TxtMoneda2;
    public javax.swing.JTextField TxtRec2;
    public javax.swing.JTextField TxtTransporte2;
    public javax.swing.JTextField TxtVendedor2;
    public javax.swing.JButton btnAceptarCliente;
    public javax.swing.JButton btnAceptarCondicionPag;
    public javax.swing.JButton btnAceptarCotizacion;
    public javax.swing.JButton btnAceptarMonedas;
    public javax.swing.JButton btnAceptarTransporte;
    public javax.swing.JButton btnAceptarVendedor;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelarCliente;
    public javax.swing.JButton btnCancelarCondicionPag;
    public javax.swing.JButton btnCancelarCotizacion;
    public javax.swing.JButton btnCancelarMoneda;
    public javax.swing.JButton btnCancelarTransporte;
    public javax.swing.JButton btnCancelarVendedor;
    public javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnFacturar;
    private javax.swing.ButtonGroup btnGrupoBusqudaVendedor;
    private javax.swing.ButtonGroup btnGrupoBusquedaCliente;
    private javax.swing.ButtonGroup btnGrupoBusquedaCondPago;
    private javax.swing.ButtonGroup btnGrupoBusquedaCotizacion;
    private javax.swing.ButtonGroup btnGrupoBusquedaMoneda;
    private javax.swing.ButtonGroup btnGrupoBusquedaTransporte;
    private javax.swing.ButtonGroup btnGrupoOpcionCliente;
    private javax.swing.ButtonGroup btnGrupoOpcionCondPago;
    private javax.swing.ButtonGroup btnGrupoOpcionCotizacion;
    private javax.swing.ButtonGroup btnGrupoOpcionMoneda;
    private javax.swing.ButtonGroup btnGrupoOpcionTransporte;
    private javax.swing.ButtonGroup btnGrupoOpcionVendedor;
    public javax.swing.JButton btnGuardar1;
    public javax.swing.JButton btnImprimir1;
    public javax.swing.JButton btnNuevo1;
    private javax.swing.JButton btnProcesar;
    public javax.swing.JButton btnactulizar;
    public javax.swing.JButton btnagregar;
    public javax.swing.JButton btnrestar;
    public com.toedter.calendar.JDateChooser fechaEmision;
    public com.toedter.calendar.JDateChooser fechaVencimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    public javax.swing.JDialog jDialogCliente;
    public javax.swing.JDialog jDialogCondiicionPago;
    public javax.swing.JDialog jDialogCotizacionCliente;
    public javax.swing.JDialog jDialogMoneda;
    public javax.swing.JDialog jDialogTransporte;
    public javax.swing.JDialog jDialogVendedor;
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
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JRadioButton jRFinal;
    public javax.swing.JRadioButton jRFinalCliente;
    public javax.swing.JRadioButton jRFinalCondPago;
    public javax.swing.JRadioButton jRFinalMoneda;
    public javax.swing.JRadioButton jRFinalTransporte;
    public javax.swing.JRadioButton jRFinalVendedor;
    public javax.swing.JRadioButton jRInicio;
    public javax.swing.JRadioButton jRInicioCliente;
    public javax.swing.JRadioButton jRInicioCondPago;
    public javax.swing.JRadioButton jRInicioMoneda;
    public javax.swing.JRadioButton jRInicioTransporte;
    public javax.swing.JRadioButton jRInicioVendedor;
    public javax.swing.JRadioButton jRexactaCondPago;
    public javax.swing.JRadioButton jRexactaMoneda;
    public javax.swing.JRadioButton jRexactaTransporte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JTable jTablaCotizacionRenglon;
    private javax.swing.JToolBar jToolBar2;
    public javax.swing.JRadioButton jrCliente;
    public javax.swing.JRadioButton jrClienteCliente;
    public javax.swing.JRadioButton jrClienteVendedor;
    public javax.swing.JRadioButton jrCodigo2;
    public javax.swing.JRadioButton jrCodigoCliente;
    public javax.swing.JRadioButton jrCodigoCondPago;
    public javax.swing.JRadioButton jrCodigoMoneda;
    public javax.swing.JRadioButton jrCodigoTransporte;
    public javax.swing.JRadioButton jrCodigoVendedor;
    public javax.swing.JRadioButton jrCualquier;
    public javax.swing.JRadioButton jrCualquierCliente;
    public javax.swing.JRadioButton jrCualquierCondPago;
    public javax.swing.JRadioButton jrCualquierMoneda;
    public javax.swing.JRadioButton jrCualquierTransporte;
    public javax.swing.JRadioButton jrCualquierVendedor;
    public javax.swing.JRadioButton jrDescripcion;
    public javax.swing.JRadioButton jrDescripcionCondPago;
    public javax.swing.JRadioButton jrDescripcionTransporte;
    public javax.swing.JRadioButton jrExactaCliente;
    public javax.swing.JTable jtablaCliente;
    public javax.swing.JTable jtablaCondicionPago;
    public javax.swing.JTable jtablaCotizacion;
    public javax.swing.JTable jtablaTransporte;
    public javax.swing.JTable jtablaVendedor;
    public javax.swing.JScrollPane jtableCondPago;
    public javax.swing.JTable jtableMonedas;
    public javax.swing.JTextField txtBuscarCliente;
    public javax.swing.JTextField txtBuscarCotizacion;
    public javax.swing.JTextField txtBuscarMoneda;
    public javax.swing.JTextField txtBuscarTransporte;
    public javax.swing.JTextField txtBuscarVendedor;
    public javax.swing.JTextField txtCodVendedor;
    public javax.swing.JTextField txtDescripcionClientes;
    public javax.swing.JTextField txtDescripcionCotizacion;
    public javax.swing.JTextField txtDescuesto;
    public javax.swing.JTextField txtImpuesto;
    public javax.swing.JTextField txtMontoDescuento;
    public javax.swing.JTextField txtMontoIGTF;
    public javax.swing.JTextField txtNumCotizacion;
    public javax.swing.JTextField txtOtros;
    public javax.swing.JTextField txtRec;
    public javax.swing.JTextField txtStatusCotizcion;
    public javax.swing.JTextField txtSubTotalBruto;
    public javax.swing.JTextField txtTasa;
    public javax.swing.JTextField txtTotalNeto;
    public javax.swing.JTextField txtTransporte;
    public javax.swing.JTextField txtValorCondicionPago;
    public javax.swing.JTextField txtcdiCliente;
    public javax.swing.JTextArea txtxComentario;
    // End of variables declaration//GEN-END:variables
}
