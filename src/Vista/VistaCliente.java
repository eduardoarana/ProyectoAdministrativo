/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controller.ClienteController;
import java.util.Date;

/**
 *
 * @author AranaV
 */
public class VistaCliente extends javax.swing.JPanel {

    /**
     * Creates new form VistaCliente
     */
    ClienteController controller;

    public VistaCliente() {
        controller = new ClienteController(this);
        initComponents();
        btnAceptarCliente.addActionListener(controller);
        btnBuscarCliente.addActionListener(controller);
        btnCancelarCliente.addActionListener(controller);
        btnEliminar1.addActionListener(controller);
        btnGuardar1.addActionListener(controller);
        btnImprimir1.addActionListener(controller);
        btnNuevo1.addActionListener(controller);
        btnactulizar.addActionListener(controller);
        txtBuscarCliente.addKeyListener(controller);
        TxtSegmento.addKeyListener(controller);
        TxtZona.addKeyListener(controller);
        TxtVendedor.addKeyListener(controller);
        TxtPais.addKeyListener(controller);
        txtCuentIngEgr.addKeyListener(controller);
        TxtPostal.addKeyListener(controller);
        txtCod_CondPago.addKeyListener(controller);
        btnAceptarCta.addActionListener(controller);
        btnAceptarPais.addActionListener(controller);
        btnAceptarSeg.addActionListener(controller);
        btnAceptarVendedor.addActionListener(controller);
        btnAceptarZona.addActionListener(controller);
        btnCancelarDialogCuentaIng.addActionListener(controller);
        btnCancelarPais.addActionListener(controller);
        btnCancelarSeg.addActionListener(controller);
        btnCancelarVendedor.addActionListener(controller);
        btnCancelarZona.addActionListener(controller);
        btnAceptarCondicionPag.addActionListener(controller);
        btnCancelarCondicionPag.addActionListener(controller);
        txtValorCondicionPago.addKeyListener(controller);
        txtvalorZona.addKeyListener(controller);
        txtValorSegmento.addKeyListener(controller);
        txtValorPais.addKeyListener(controller);
        txtValorCuentaInEgre.addKeyListener(controller);
        txtValorCondicionPago.addKeyListener(controller);
        TxtTabulador.addKeyListener(controller);
        txtTipoCliente.addKeyListener(controller);
        btnCancelarTipoCliente.addActionListener(controller);
        btnAceptarTipoCliente.addActionListener(controller);
        txtBuscartipoCliente.addKeyListener(controller);
        cheContribuyenteEspecial.addChangeListener(controller);
        cheSinCredito.addChangeListener(controller);
        cheContribuyente.addChangeListener(controller);
        btnImprimir1.addActionListener(controller);
        btnAceptarImprimir.addActionListener(controller);
        txtCodDesde.addKeyListener(controller);
        txtCodHasta.addKeyListener(controller);
        txtCodTipoClientDesde.addKeyListener(controller);
        txtCodTipoClientHasta.addKeyListener(controller);
        txtCodVendedorDesde.addKeyListener(controller);
        txtCodVendedorHasta.addKeyListener(controller);
        txtCodZonaDesde.addKeyListener(controller);
        txtCodZonaHasta.addKeyListener(controller);
        txtCodSegmentoDesde.addKeyListener(controller);
        txtCodSegmentoHasta.addKeyListener(controller);
        txtCodPaisDesde.addKeyListener(controller);
        txtCodPaisHasta.addKeyListener(controller);
        btnCancelarReporte.addActionListener(controller);
        setterCampos();
    }

    public void setterCampos() {
        fecha.setDate(new Date());
        TxtZona.setText("");
        TxtCampo1.setText("");
        TxtCampo2.setText("");
        TxtCampo3.setText("");
        TxtCampo4.setText("");
        TxtCampo5.setText("");
        TxtCampo6.setText("");
        TxtCiudad.setText("");
        TxtCodigocliente.setText("");
        TxtContacto.setText("");
        txtCuentIngEgr.setText("");
        TxtCuenta2.setText("");
        TxtDireccion.setText("");
        TxtDireccionEntrega.setText("");
        TxtEmail.setText("");
        TxtNIT.setText("");
        TxtPais.setText("");
        TxtPais2.setText("");
        TxtPostal.setText("");
        TxtRIF.setText("");
        TxtRetencion.setText("");
        TxtSegmento.setText("");
        TxtSegmento1.setText("");
        TxtTabulador.setText("");
        TxtTabulador2.setText("");
        TxtTelefono.setText("");
        txtTipoCliente.setText("");
        TxtVendedor.setText("");
        TxtVendedor1.setText("");
        TxtZona.setText("");
        TxtZona2.setText("");
        txtCod_CondPago.setText("");
        txtDescripcionCondPago.setText("");
        txtDescripcionSimbMoneda.setText("");
        txtDias.setText("");
        txtFrecuencia.setText("00");
        txtGlobal.setText("00");
        txtHoraCaja.setText("");
        txtMontoLimite.setText("00");
        txtNombreCliente.setText("");
        txtProntoPago.setText("00");
        txtSimMoneda.setText("");
        cheDomingo.setSelected(false);
        cheJuves.setSelected(false);
        cheLunes1.setSelected(false);
        cheMartes.setSelected(false);
        cheMiercoles.setSelected(false);
        cheViernes.setSelected(false);
        cheSabado.setSelected(false);
        cheInactivo.setSelected(false);
        cheContribuyente.setSelected(false);
        btnGuardar1.setEnabled(true);
        btnEliminar1.setEnabled(false);
        btnactulizar.setEnabled(false);
        combTipoPersona.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogClientes = new javax.swing.JDialog();
        txtBuscarCliente = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtablaCliente = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jrCodigo1 = new javax.swing.JRadioButton();
        jrDescripcion = new javax.swing.JRadioButton();
        btnAceptarCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jRInicio1 = new javax.swing.JRadioButton();
        jRFinal1 = new javax.swing.JRadioButton();
        jrCualquier1 = new javax.swing.JRadioButton();
        jrExacta1 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        btnGrupoOpcion = new javax.swing.ButtonGroup();
        btnGrupoBusqueda = new javax.swing.ButtonGroup();
        jDialogZona = new javax.swing.JDialog();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtablaZona = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jRInicioZ = new javax.swing.JRadioButton();
        jRFinalZ = new javax.swing.JRadioButton();
        jrCualquierZ = new javax.swing.JRadioButton();
        jRexactaZ = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        jrCodigoZ = new javax.swing.JRadioButton();
        jrDescripcionZ = new javax.swing.JRadioButton();
        btnAceptarZona = new javax.swing.JButton();
        btnCancelarZona = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        txtvalorZona = new javax.swing.JTextField();
        jDialogCtaIng = new javax.swing.JDialog();
        txtValorCuentaInEgre = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtablaCuentaInEgre = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jRInicioCta = new javax.swing.JRadioButton();
        jRFinalCta = new javax.swing.JRadioButton();
        jrCualquierCta = new javax.swing.JRadioButton();
        jRexactaCta = new javax.swing.JRadioButton();
        jPanel21 = new javax.swing.JPanel();
        jrCodigoCta = new javax.swing.JRadioButton();
        jrDescripcionCta = new javax.swing.JRadioButton();
        btnAceptarCta = new javax.swing.JButton();
        btnCancelarDialogCuentaIng = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jDialogPais = new javax.swing.JDialog();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtablaPais = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jRInicioP = new javax.swing.JRadioButton();
        jRFinalP = new javax.swing.JRadioButton();
        jrCualquierP = new javax.swing.JRadioButton();
        jRexactaP = new javax.swing.JRadioButton();
        jPanel15 = new javax.swing.JPanel();
        jrCodigoP = new javax.swing.JRadioButton();
        jrDescripcionP = new javax.swing.JRadioButton();
        btnAceptarPais = new javax.swing.JButton();
        btnCancelarPais = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        txtValorPais = new javax.swing.JTextField();
        jDialogSegemento = new javax.swing.JDialog();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtablaSegmento = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jRInicioSeg = new javax.swing.JRadioButton();
        jRFinalSeg = new javax.swing.JRadioButton();
        jrCualquierSeg = new javax.swing.JRadioButton();
        jRexactaSeg = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jrCodigoSeg = new javax.swing.JRadioButton();
        jrDescripcionSeg = new javax.swing.JRadioButton();
        btnAceptarSeg = new javax.swing.JButton();
        btnCancelarSeg = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        txtValorSegmento = new javax.swing.JTextField();
        jDialogVendedor = new javax.swing.JDialog();
        txtbuscarVendedor = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtablaVendedor = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jRInicioVen = new javax.swing.JRadioButton();
        jRFinalVen = new javax.swing.JRadioButton();
        jrCualquierVen = new javax.swing.JRadioButton();
        jRexactaVen = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        jrCodigoVen = new javax.swing.JRadioButton();
        jrDescripcionVen = new javax.swing.JRadioButton();
        btnAceptarVendedor = new javax.swing.JButton();
        btnCancelarVendedor = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btnOpcionZona = new javax.swing.ButtonGroup();
        btnBusquedaZona = new javax.swing.ButtonGroup();
        btnBusquedaCta = new javax.swing.ButtonGroup();
        btnOpcionCta = new javax.swing.ButtonGroup();
        btnOpcionPais = new javax.swing.ButtonGroup();
        btnBusquedaPais = new javax.swing.ButtonGroup();
        btnOpcionSeg = new javax.swing.ButtonGroup();
        btnBusquedaSeg = new javax.swing.ButtonGroup();
        btnOpcionVen = new javax.swing.ButtonGroup();
        btnBusquedaVen = new javax.swing.ButtonGroup();
        jDialogCondicionPago = new javax.swing.JDialog();
        jLabel48 = new javax.swing.JLabel();
        txtValorCondicionPago = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtablaCondicionPago = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jRInicioPago = new javax.swing.JRadioButton();
        jRFinalPago = new javax.swing.JRadioButton();
        jrCualquierPago = new javax.swing.JRadioButton();
        jRexactaPago = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        jrCodigoPago = new javax.swing.JRadioButton();
        jrDescripcionPago = new javax.swing.JRadioButton();
        jLabel49 = new javax.swing.JLabel();
        btnCancelarCondicionPag = new javax.swing.JButton();
        btnAceptarCondicionPag = new javax.swing.JButton();
        btnBusquedaCondPago = new javax.swing.ButtonGroup();
        btnOpcionConPag = new javax.swing.ButtonGroup();
        jDialogTipoCliente = new javax.swing.JDialog();
        txtBuscartipoCliente = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtableTipoClientes = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();
        jRInicioTipClient = new javax.swing.JRadioButton();
        jRFinalTipClient = new javax.swing.JRadioButton();
        jrCualquierTipClient = new javax.swing.JRadioButton();
        jRExactaTipoCliente = new javax.swing.JRadioButton();
        jPanel25 = new javax.swing.JPanel();
        jrCodigoTipClient = new javax.swing.JRadioButton();
        jrDescripcionTipClient = new javax.swing.JRadioButton();
        btnAceptarTipoCliente = new javax.swing.JButton();
        btnCancelarTipoCliente = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        btnOpcionTipCli = new javax.swing.ButtonGroup();
        btnBusquedaTipoClie = new javax.swing.ButtonGroup();
        ReporteCliente = new javax.swing.JDialog();
        jPanel26 = new javax.swing.JPanel();
        comboReporteCliente = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        comboOrdenar = new javax.swing.JComboBox<>();
        comboCriterio = new javax.swing.JComboBox<>();
        jPanelReporteDatosBasicos = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        btnDesde = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtDescripDesde = new javax.swing.JTextField();
        txtCodDesde = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtDescripcionVendedorHasta = new javax.swing.JTextField();
        txtCodVendedorHasta = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        txtCodTipoClientDesde = new javax.swing.JTextField();
        txtDescripcionTipoClient = new javax.swing.JTextField();
        txtCodZonaDesde = new javax.swing.JTextField();
        txtDescripcionZonaDesde = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        txtCodVendedorDesde = new javax.swing.JTextField();
        txtDescripcionTVendedorDesde = new javax.swing.JTextField();
        txtCodZonaHasta = new javax.swing.JTextField();
        txtDescripcionZonaHasta = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txtCodSegmentoDesde = new javax.swing.JTextField();
        txtDescripcionSegmentoDesde = new javax.swing.JTextField();
        txtCodSegmentoHasta = new javax.swing.JTextField();
        txtDescripcionSegmentoHasta = new javax.swing.JTextField();
        comboInactivo = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtDescripcionTipoClientHasta = new javax.swing.JTextField();
        txtCodTipoClientHasta = new javax.swing.JTextField();
        txtCodPaisDesde = new javax.swing.JTextField();
        txtDescripPaisDesde = new javax.swing.JTextField();
        txtCodPaisHasta = new javax.swing.JTextField();
        txtDescripcionPaisHasta = new javax.swing.JTextField();
        txtCodHasta = new javax.swing.JTextField();
        txtDescripDesde1 = new javax.swing.JTextField();
        btnAceptarImprimir = new javax.swing.JButton();
        btnCancelarReporte = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        TxtCodigocliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        TxtZona = new javax.swing.JTextField();
        TxtZona2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCuentIngEgr = new javax.swing.JTextField();
        TxtCuenta2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TxtPais = new javax.swing.JTextField();
        TxtPais2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TxtPostal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TxtEmail = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TxtDireccionEntrega = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TxtSegmento = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TxtVendedor = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        TxtCiudad = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        TxtContacto = new javax.swing.JTextField();
        TxtSegmento1 = new javax.swing.JTextField();
        TxtVendedor1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        combTipoPersona = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        TxtTabulador = new javax.swing.JTextField();
        TxtTabulador2 = new javax.swing.JTextField();
        cheContribuyenteEspecial = new javax.swing.JCheckBox();
        cheRetenerDocum = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        TxtRetencion = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel28 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        cheSinCredito = new javax.swing.JCheckBox();
        jLabel30 = new javax.swing.JLabel();
        txtSimMoneda = new javax.swing.JTextField();
        txtMontoLimite = new javax.swing.JTextField();
        txtDescripcionSimbMoneda = new javax.swing.JTextField();
        btnSaldoActual = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        txtCod_CondPago = new javax.swing.JTextField();
        txtDescripcionCondPago = new javax.swing.JTextField();
        txtDias = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtGlobal = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtProntoPago = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        cheMartes = new javax.swing.JCheckBox();
        cheLunes1 = new javax.swing.JCheckBox();
        cheMiercoles = new javax.swing.JCheckBox();
        cheJuves = new javax.swing.JCheckBox();
        cheViernes = new javax.swing.JCheckBox();
        cheSabado = new javax.swing.JCheckBox();
        cheDomingo = new javax.swing.JCheckBox();
        txtHoraCaja = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtFrecuencia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTipoCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtRIF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtNIT = new javax.swing.JTextField();
        cheContribuyente = new javax.swing.JCheckBox();
        cheInactivo = new javax.swing.JCheckBox();
        fecha = new com.toedter.calendar.JDateChooser();
        txtTipoDescripcionCliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel7 = new javax.swing.JLabel();
        TxtCampo1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtCampo2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtCampo3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtCampo4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtCampo5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtCampo6 = new javax.swing.JTextField();
        jToolBar2 = new javax.swing.JToolBar();
        btnNuevo1 = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        btnactulizar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnImprimir1 = new javax.swing.JButton();

        jDialogClientes.setTitle("Busqueda Asistida");
        jDialogClientes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDialogClientes.getContentPane().add(txtBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 350, -1));

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

        jDialogClientes.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 470, 110));

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnGrupoBusqueda.add(jrCodigo1);
        jrCodigo1.setSelected(true);
        jrCodigo1.setText("Codigo");
        jrCodigo1.setToolTipText("Codigo");

        btnGrupoBusqueda.add(jrDescripcion);
        jrDescripcion.setText("Descripcion");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jrCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jrDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrCodigo1)
                .addGap(11, 11, 11)
                .addComponent(jrDescripcion)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogClientes.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 150, 100));

        btnAceptarCliente.setText("Aceptar");
        btnAceptarCliente.setToolTipText("Aceptar");
        jDialogClientes.getContentPane().add(btnAceptarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 110, 30));

        btnCancelarCliente.setText("Cancelar");
        btnCancelarCliente.setToolTipText("Cancelar");
        jDialogClientes.getContentPane().add(btnCancelarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 110, 30));

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnGrupoOpcion.add(jRInicio1);
        jRInicio1.setText("1) Coincida al Inicio");
        jRInicio1.setToolTipText("Coincida al inicio");

        btnGrupoOpcion.add(jRFinal1);
        jRFinal1.setText("2)Coincida al Final");
        jRFinal1.setToolTipText("Coincida al Final");

        btnGrupoOpcion.add(jrCualquier1);
        jrCualquier1.setSelected(true);
        jrCualquier1.setText("3)Cualquier Caracter");
        jrCualquier1.setToolTipText("Cualquier Caracter");

        btnGrupoOpcion.add(jrExacta1);
        jrExacta1.setText("5)Exacta");
        jrExacta1.setToolTipText("Exacta");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jrCualquier1)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRFinal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRInicio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrExacta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jRInicio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquier1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrExacta1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jDialogClientes.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 140));

        jLabel29.setText("Buscar :");
        jLabel29.setToolTipText("");
        jDialogClientes.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jDialogZona.setTitle("Busqueda Asistida");
        jDialogZona.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setText("Buscar :");
        jDialogZona.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

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
        jScrollPane3.setViewportView(jtablaZona);

        jDialogZona.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 450, 120));

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnOpcionZona.add(jRInicioZ);
        jRInicioZ.setText("1) Inicio");
        jRInicioZ.setToolTipText("Coincida al inicio");

        btnOpcionZona.add(jRFinalZ);
        jRFinalZ.setText("2)Final");
        jRFinalZ.setToolTipText("Coincida al Final");

        btnOpcionZona.add(jrCualquierZ);
        jrCualquierZ.setSelected(true);
        jrCualquierZ.setText("3)Cualquier");
        jrCualquierZ.setToolTipText("Cualquier Caracter");

        btnOpcionZona.add(jRexactaZ);
        jRexactaZ.setText("4)exacta");
        jRexactaZ.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinalZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jrCualquierZ)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jRInicioZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexactaZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jRInicioZ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinalZ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquierZ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexactaZ)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogZona.getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnBusquedaZona.add(jrCodigoZ);
        jrCodigoZ.setSelected(true);
        jrCodigoZ.setText("Codigo");
        jrCodigoZ.setToolTipText("Codigo");

        btnBusquedaZona.add(jrDescripcionZ);
        jrDescripcionZ.setText("Descripcion");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcionZ, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jrCodigoZ, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jrCodigoZ)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcionZ)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogZona.getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarZona.setText("Aceptar");
        jDialogZona.getContentPane().add(btnAceptarZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 98, -1));

        btnCancelarZona.setText("Cancelar");
        btnCancelarZona.setToolTipText("Cancelar");
        jDialogZona.getContentPane().add(btnCancelarZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));

        jLabel40.setText("Total de Registros Encontrados");
        jDialogZona.getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));
        jDialogZona.getContentPane().add(txtvalorZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 370, -1));

        jDialogCtaIng.setTitle("Busqueda Asistida");
        jDialogCtaIng.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDialogCtaIng.getContentPane().add(txtValorCuentaInEgre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 340, -1));

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
        jScrollPane8.setViewportView(jtablaCuentaInEgre);

        jDialogCtaIng.getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 430, 120));

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnOpcionCta.add(jRInicioCta);
        jRInicioCta.setText("1) Inicio");
        jRInicioCta.setToolTipText("Coincida al inicio");

        btnOpcionCta.add(jRFinalCta);
        jRFinalCta.setText("2)Final");
        jRFinalCta.setToolTipText("Coincida al Final");

        btnOpcionCta.add(jrCualquierCta);
        jrCualquierCta.setSelected(true);
        jrCualquierCta.setText("3)Cualquier");
        jrCualquierCta.setToolTipText("Cualquier Caracter");

        btnOpcionCta.add(jRexactaCta);
        jRexactaCta.setText("4)exacta");
        jRexactaCta.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinalCta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jrCualquierCta)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jRInicioCta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexactaCta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jRInicioCta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinalCta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquierCta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexactaCta)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogCtaIng.getContentPane().add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnBusquedaCta.add(jrCodigoCta);
        jrCodigoCta.setSelected(true);
        jrCodigoCta.setText("Codigo");
        jrCodigoCta.setToolTipText("Codigo");

        btnBusquedaCta.add(jrDescripcionCta);
        jrDescripcionCta.setText("Descripcion");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcionCta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jrCodigoCta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jrCodigoCta)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcionCta)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogCtaIng.getContentPane().add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarCta.setText("Aceptar");
        jDialogCtaIng.getContentPane().add(btnAceptarCta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 98, -1));

        btnCancelarDialogCuentaIng.setText("Cancelar");
        btnCancelarDialogCuentaIng.setToolTipText("Cancelar");
        jDialogCtaIng.getContentPane().add(btnCancelarDialogCuentaIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 100, -1));

        jLabel47.setText("Buscar :");
        jDialogCtaIng.getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jDialogPais.setTitle("Busqueda Asistida");
        jDialogPais.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setText("Buscar :");
        jDialogPais.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, -1));

        jtablaPais.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jtablaPais);

        jDialogPais.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnOpcionPais.add(jRInicioP);
        jRInicioP.setText("1) Inicio");
        jRInicioP.setToolTipText("Coincida al inicio");

        btnOpcionPais.add(jRFinalP);
        jRFinalP.setText("2)Final");
        jRFinalP.setToolTipText("Coincida al Final");

        btnOpcionPais.add(jrCualquierP);
        jrCualquierP.setSelected(true);
        jrCualquierP.setText("3)Cualquier");
        jrCualquierP.setToolTipText("Cualquier Caracter");

        btnOpcionPais.add(jRexactaP);
        jRexactaP.setText("4)exacta");
        jRexactaP.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinalP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jrCualquierP)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jRInicioP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexactaP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jRInicioP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinalP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquierP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexactaP)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogPais.getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnBusquedaPais.add(jrCodigoP);
        jrCodigoP.setSelected(true);
        jrCodigoP.setText("Codigo");
        jrCodigoP.setToolTipText("Codigo");

        btnBusquedaPais.add(jrDescripcionP);
        jrDescripcionP.setText("Descripcion");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcionP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jrCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jrCodigoP)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcionP)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogPais.getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 120, 100));

        btnAceptarPais.setText("Aceptar");
        jDialogPais.getContentPane().add(btnAceptarPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 98, -1));

        btnCancelarPais.setText("Cancelar");
        btnCancelarPais.setToolTipText("Cancelar");
        jDialogPais.getContentPane().add(btnCancelarPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel42.setText("Total de Registros Encontrados");
        jDialogPais.getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 180, -1));
        jDialogPais.getContentPane().add(txtValorPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 360, -1));

        jDialogSegemento.setTitle("Busqueda Asistida");
        jDialogSegemento.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setText("Buscar :");
        jDialogSegemento.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        jtablaSegmento.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jtablaSegmento);

        jDialogSegemento.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 450, 120));

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnOpcionSeg.add(jRInicioSeg);
        jRInicioSeg.setText("1) Inicio");
        jRInicioSeg.setToolTipText("Coincida al inicio");

        btnOpcionSeg.add(jRFinalSeg);
        jRFinalSeg.setText("2)Final");
        jRFinalSeg.setToolTipText("Coincida al Final");

        btnOpcionSeg.add(jrCualquierSeg);
        jrCualquierSeg.setSelected(true);
        jrCualquierSeg.setText("3)Cualquier");
        jrCualquierSeg.setToolTipText("Cualquier Caracter");

        btnOpcionSeg.add(jRexactaSeg);
        jRexactaSeg.setText("4)exacta");
        jRexactaSeg.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinalSeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jrCualquierSeg)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jRInicioSeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexactaSeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jRInicioSeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinalSeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquierSeg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexactaSeg)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogSegemento.getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnBusquedaSeg.add(jrCodigoSeg);
        jrCodigoSeg.setSelected(true);
        jrCodigoSeg.setText("Codigo");
        jrCodigoSeg.setToolTipText("Codigo");

        btnBusquedaSeg.add(jrDescripcionSeg);
        jrDescripcionSeg.setText("Descripcion");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcionSeg, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jrCodigoSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jrCodigoSeg)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcionSeg)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogSegemento.getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarSeg.setText("Aceptar");
        jDialogSegemento.getContentPane().add(btnAceptarSeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 98, -1));

        btnCancelarSeg.setText("Cancelar");
        btnCancelarSeg.setToolTipText("Cancelar");
        jDialogSegemento.getContentPane().add(btnCancelarSeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));

        jLabel44.setText("Total de Registros Encontrados");
        jDialogSegemento.getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));
        jDialogSegemento.getContentPane().add(txtValorSegmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 370, -1));

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
        jScrollPane7.setViewportView(jtablaVendedor);

        jDialogVendedor.getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 450, 120));

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnOpcionVen.add(jRInicioVen);
        jRInicioVen.setText("1) Inicio");
        jRInicioVen.setToolTipText("Coincida al inicio");

        btnOpcionVen.add(jRFinalVen);
        jRFinalVen.setText("2)Final");
        jRFinalVen.setToolTipText("Coincida al Final");

        btnOpcionVen.add(jrCualquierVen);
        jrCualquierVen.setSelected(true);
        jrCualquierVen.setText("3)Cualquier");
        jrCualquierVen.setToolTipText("Cualquier Caracter");

        btnOpcionVen.add(jRexactaVen);
        jRexactaVen.setText("4)exacta");
        jRexactaVen.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinalVen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jrCualquierVen)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jRInicioVen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexactaVen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jRInicioVen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinalVen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquierVen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexactaVen)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogVendedor.getContentPane().add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnBusquedaVen.add(jrCodigoVen);
        jrCodigoVen.setSelected(true);
        jrCodigoVen.setText("Codigo");
        jrCodigoVen.setToolTipText("Codigo");

        btnBusquedaVen.add(jrDescripcionVen);
        jrDescripcionVen.setText("Descripcion");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcionVen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jrCodigoVen, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jrCodigoVen)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcionVen)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogVendedor.getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarVendedor.setText("Aceptar");
        jDialogVendedor.getContentPane().add(btnAceptarVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 98, -1));

        btnCancelarVendedor.setText("Cancelar");
        btnCancelarVendedor.setToolTipText("Cancelar");
        jDialogVendedor.getContentPane().add(btnCancelarVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));

        jLabel45.setText("Total de Registros Encontrados");
        jDialogVendedor.getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        jLabel46.setText("Buscar :");
        jDialogVendedor.getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        jDialogCondicionPago.setTitle("Busqueda Asistida");
        jDialogCondicionPago.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setText("Buscar :");
        jDialogCondicionPago.getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        txtValorCondicionPago.setToolTipText("Valor");
        jDialogCondicionPago.getContentPane().add(txtValorCondicionPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 390, -1));

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
        jScrollPane9.setViewportView(jtablaCondicionPago);

        jDialogCondicionPago.getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 450, 120));

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnOpcionConPag.add(jRInicioPago);
        jRInicioPago.setText("1) Inicio");
        jRInicioPago.setToolTipText("Coincida al inicio");

        btnOpcionConPag.add(jRFinalPago);
        jRFinalPago.setText("2)Final");
        jRFinalPago.setToolTipText("Coincida al Final");

        btnOpcionConPag.add(jrCualquierPago);
        jrCualquierPago.setSelected(true);
        jrCualquierPago.setText("3)Cualquier");
        jrCualquierPago.setToolTipText("Cualquier Caracter");

        btnOpcionConPag.add(jRexactaPago);
        jRexactaPago.setText("4)exacta");
        jRexactaPago.setToolTipText("Exacta Caracter");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinalPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jrCualquierPago)
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jRInicioPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jRexactaPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jRInicioPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinalPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquierPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRexactaPago)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jDialogCondicionPago.getContentPane().add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnBusquedaCondPago.add(jrCodigoPago);
        jrCodigoPago.setSelected(true);
        jrCodigoPago.setText("Codigo");
        jrCodigoPago.setToolTipText("Codigo");

        btnBusquedaCondPago.add(jrDescripcionPago);
        jrDescripcionPago.setText("Descripcion");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcionPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jrCodigoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jrCodigoPago)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcionPago)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogCondicionPago.getContentPane().add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        jLabel49.setText("Total de Registros Encontrados");
        jDialogCondicionPago.getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        btnCancelarCondicionPag.setText("Cancelar");
        btnCancelarCondicionPag.setToolTipText("Cancelar");
        jDialogCondicionPago.getContentPane().add(btnCancelarCondicionPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 100, -1));

        btnAceptarCondicionPag.setText("Aceptar");
        jDialogCondicionPago.getContentPane().add(btnAceptarCondicionPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 98, -1));

        jDialogTipoCliente.setTitle("Busqueda Asistida");
        jDialogTipoCliente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jDialogTipoCliente.getContentPane().add(txtBuscartipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 380, -1));

        jLabel50.setText("Buscar :");
        jDialogTipoCliente.getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

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
        jScrollPane10.setViewportView(jtableTipoClientes);

        jDialogTipoCliente.getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 450, 120));

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));

        btnOpcionTipCli.add(jRInicioTipClient);
        jRInicioTipClient.setText("1) Inicio");
        jRInicioTipClient.setToolTipText("Coincida al inicio");

        btnOpcionTipCli.add(jRFinalTipClient);
        jRFinalTipClient.setText("2)Final");
        jRFinalTipClient.setToolTipText("Coincida al Final");

        btnOpcionTipCli.add(jrCualquierTipClient);
        jrCualquierTipClient.setSelected(true);
        jrCualquierTipClient.setText("3)Cualquier");
        jrCualquierTipClient.setToolTipText("Cualquier Caracter");

        jRExactaTipoCliente.setText("jRadioButton1");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRFinalTipClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jRInicioTipClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRExactaTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrCualquierTipClient))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addComponent(jRInicioTipClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRFinalTipClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrCualquierTipClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRExactaTipoCliente)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jDialogTipoCliente.getContentPane().add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 120, 130));

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda por:"));

        btnBusquedaTipoClie.add(jrCodigoTipClient);
        jrCodigoTipClient.setSelected(true);
        jrCodigoTipClient.setText("Codigo");
        jrCodigoTipClient.setToolTipText("Codigo");

        btnBusquedaTipoClie.add(jrDescripcionTipClient);
        jrDescripcionTipClient.setText("Descripcion");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDescripcionTipClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jrCodigoTipClient, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jrCodigoTipClient)
                .addGap(18, 18, 18)
                .addComponent(jrDescripcionTipClient)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDialogTipoCliente.getContentPane().add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 120, 100));

        btnAceptarTipoCliente.setText("Aceptar");
        jDialogTipoCliente.getContentPane().add(btnAceptarTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 100, -1));

        btnCancelarTipoCliente.setText("Cancelar");
        jDialogTipoCliente.getContentPane().add(btnCancelarTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 100, -1));

        jLabel51.setText("Total de Registros Encontrados");
        jDialogTipoCliente.getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 180, -1));

        ReporteCliente.setTitle("Impresion del Grupo de Reporte : Cliente");
        ReporteCliente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboReporteCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes con sus datos Basicós" }));
        jPanel26.add(comboReporteCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 230, -1));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Reporte :");
        jPanel26.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, -1));

        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Descripcion" }));
        jPanel26.add(comboOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 90, -1));

        comboCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Descendente", "Ascendente" }));
        jPanel26.add(comboCriterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 110, -1));

        ReporteCliente.getContentPane().add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 60));

        jPanelReporteDatosBasicos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanelReporteDatosBasicos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Rangos :");
        jPanelReporteDatosBasicos.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 10, 70, -1));

        btnDesde.setText("Desde");
        jPanelReporteDatosBasicos.add(btnDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 190, -1));

        jButton3.setText("Hasta");
        jPanelReporteDatosBasicos.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 210, -1));
        jPanelReporteDatosBasicos.add(txtDescripDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 120, -1));
        jPanelReporteDatosBasicos.add(txtCodDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 60, -1));

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("Zona :");
        jPanelReporteDatosBasicos.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 20));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("Codigo :");
        jPanelReporteDatosBasicos.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 50, -1));
        jPanelReporteDatosBasicos.add(txtDescripcionVendedorHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 140, -1));
        jPanelReporteDatosBasicos.add(txtCodVendedorHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 60, -1));

        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("Tipo Cliente :");
        jPanelReporteDatosBasicos.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, -1));
        jPanelReporteDatosBasicos.add(txtCodTipoClientDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 60, -1));
        jPanelReporteDatosBasicos.add(txtDescripcionTipoClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 120, -1));
        jPanelReporteDatosBasicos.add(txtCodZonaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 60, -1));
        jPanelReporteDatosBasicos.add(txtDescripcionZonaDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 120, -1));

        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel58.setText(" Vendedor :");
        jPanelReporteDatosBasicos.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, -1));
        jPanelReporteDatosBasicos.add(txtCodVendedorDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 60, -1));
        jPanelReporteDatosBasicos.add(txtDescripcionTVendedorDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 120, -1));
        jPanelReporteDatosBasicos.add(txtCodZonaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 60, -1));
        jPanelReporteDatosBasicos.add(txtDescripcionZonaHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 140, -1));

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("Inactivo :");
        jPanelReporteDatosBasicos.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 80, -1));
        jPanelReporteDatosBasicos.add(txtCodSegmentoDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 60, -1));
        jPanelReporteDatosBasicos.add(txtDescripcionSegmentoDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 120, -1));
        jPanelReporteDatosBasicos.add(txtCodSegmentoHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 60, -1));
        jPanelReporteDatosBasicos.add(txtDescripcionSegmentoHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 140, -1));

        comboInactivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "SI", "NO" }));
        jPanelReporteDatosBasicos.add(comboInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 190, -1));

        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel60.setText("Segmento :");
        jPanelReporteDatosBasicos.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, -1));

        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("Pais :");
        jPanelReporteDatosBasicos.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, -1));
        jPanelReporteDatosBasicos.add(txtDescripcionTipoClientHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 140, -1));
        jPanelReporteDatosBasicos.add(txtCodTipoClientHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 60, -1));
        jPanelReporteDatosBasicos.add(txtCodPaisDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 60, -1));
        jPanelReporteDatosBasicos.add(txtDescripPaisDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 120, -1));
        jPanelReporteDatosBasicos.add(txtCodPaisHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 60, -1));
        jPanelReporteDatosBasicos.add(txtDescripcionPaisHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 140, -1));
        jPanelReporteDatosBasicos.add(txtCodHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 60, -1));
        jPanelReporteDatosBasicos.add(txtDescripDesde1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 140, -1));

        ReporteCliente.getContentPane().add(jPanelReporteDatosBasicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 520, 270));

        btnAceptarImprimir.setText("Aceptar");
        btnAceptarImprimir.setToolTipText("");
        ReporteCliente.getContentPane().add(btnAceptarImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 80, -1));

        btnCancelarReporte.setText("Cancelar");
        ReporteCliente.getContentPane().add(btnCancelarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 80, -1));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTabbedPane1.setName(""); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(TxtCodigocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 220, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Codigo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, -1));

        jTabbedPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Zona");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));
        jPanel3.add(TxtZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 90, -1));
        jPanel3.add(TxtZona2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 230, -1));

        jLabel14.setText("Cta. Ing/Egr");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));
        jPanel3.add(txtCuentIngEgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 90, -1));
        jPanel3.add(TxtCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 230, -1));

        jLabel15.setText("Pais");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel3.add(TxtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 90, -1));
        jPanel3.add(TxtPais2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 230, -1));

        jLabel16.setText("Cod. Postal");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 100, 60, -1));
        jPanel3.add(TxtPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 330, -1));

        jLabel17.setText("E-mail");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 40, 20));
        jPanel3.add(TxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 330, 20));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Direccion");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 60, -1));
        jPanel3.add(TxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 650, 40));

        jLabel19.setText("Direccion Entrega");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 110, 30));
        jPanel3.add(TxtDireccionEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 590, 40));

        jLabel20.setText("Segmento");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        TxtSegmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSegmentoActionPerformed(evt);
            }
        });
        jPanel3.add(TxtSegmento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 50, -1));

        jLabel21.setText("Vendedor");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));
        jPanel3.add(TxtVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 50, -1));

        jLabel22.setText("Cuidad");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));
        jPanel3.add(TxtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 240, -1));

        jLabel23.setText("Telefono");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));
        jPanel3.add(TxtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 240, -1));

        jLabel24.setText("Contacto");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));
        jPanel3.add(TxtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 240, -1));
        jPanel3.add(TxtSegmento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 180, -1));
        jPanel3.add(TxtVendedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 180, -1));

        jTabbedPane2.addTab("General", jPanel3);

        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setText("Tipo de Persona");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        combTipoPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "(PNR) Persona Natural Residente", "(PNNR) Persona Natural No Residente", "(PJD) Persona Júridica Domiciliada", "(PJND Persona juridica No Domiciliada)", "Exenta", "Tesorería Nacional", "Otros", " " }));
        jPanel6.add(combTipoPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 310, -1));

        jLabel26.setText("Tabulador I.S.L.R");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel6.add(TxtTabulador, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 60, -1));
        jPanel6.add(TxtTabulador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 240, -1));

        cheContribuyenteEspecial.setText("Contribuyente Especial");
        jPanel6.add(cheContribuyenteEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        cheRetenerDocum.setText("Retener al Registrar Documento");
        cheRetenerDocum.setEnabled(false);
        jPanel6.add(cheRetenerDocum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel27.setText("Retencion");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        TxtRetencion.setEnabled(false);
        jPanel6.add(TxtRetencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 90, 30));

        jToggleButton1.setText("Consultar R.I.F");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel28.setText("%");
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 30, 40));

        jTabbedPane3.addTab("Datos Tributarios", jPanel6);

        jPanel5.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 790, 270));

        jTabbedPane2.addTab("Tributario", jPanel5);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Credíto"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cheSinCredito.setText("Sin crédito");
        jPanel7.add(cheSinCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Límite: ");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 50, 20));

        txtSimMoneda.setToolTipText("");
        jPanel7.add(txtSimMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 60, -1));

        txtMontoLimite.setToolTipText("");
        jPanel7.add(txtMontoLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 180, -1));

        txtDescripcionSimbMoneda.setToolTipText("");
        jPanel7.add(txtDescripcionSimbMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 160, -1));

        btnSaldoActual.setText("Saldo Actual");
        jPanel7.add(btnSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 110, -1));

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Cond. de pago: ");
        jPanel7.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 20));
        jPanel7.add(txtCod_CondPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 90, -1));

        txtDescripcionCondPago.setToolTipText("");
        jPanel7.add(txtDescripcionCondPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 300, -1));

        txtDias.setToolTipText("");
        txtDias.setEnabled(false);
        jPanel7.add(txtDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 70, -1));

        jLabel32.setText("día(s)");
        jPanel7.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, 60, 20));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 750, 99));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Descuento"));
        jPanel8.setToolTipText("");
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(txtGlobal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 160, -1));

        jLabel33.setText("%");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 20, 20));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Global: ");
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 70, 20));
        jPanel8.add(txtProntoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 160, -1));

        jLabel35.setText("%");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 20, 20));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel52.setText("Pronto Pago:");
        jPanel8.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, -1));

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 750, 60));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Visitas"));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Dias de visitas: ");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, 20));

        cheMartes.setText("Martes");
        jPanel9.add(cheMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        cheLunes1.setText("Lunes");
        jPanel9.add(cheLunes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        cheMiercoles.setText("Miércoles");
        jPanel9.add(cheMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        cheJuves.setText("Jueves");
        jPanel9.add(cheJuves, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        cheViernes.setText("Viernes");
        cheViernes.setToolTipText("");
        jPanel9.add(cheViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        cheSabado.setText("Sábado");
        cheSabado.setToolTipText("");
        jPanel9.add(cheSabado, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        cheDomingo.setText("Domingo");
        jPanel9.add(cheDomingo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));
        jPanel9.add(txtHoraCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 130, -1));

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Horario caja: ");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, 20));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Frecuencia: ");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 80, 20));
        jPanel9.add(txtFrecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 140, -1));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 750, 110));

        jTabbedPane2.addTab("Crédito y Saldo", jPanel4);

        jPanel2.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 780, 340));

        jLabel2.setText("Fecha");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 70, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, -1));
        jPanel2.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 560, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tipo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 40, 20));
        jPanel2.add(txtTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 70, -1));

        jLabel5.setText("R.I.F");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));
        jPanel2.add(TxtRIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 130, -1));

        jLabel6.setText("N.I.T");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));
        jPanel2.add(TxtNIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 110, -1));

        cheContribuyente.setText("Contribuyente");
        jPanel2.add(cheContribuyente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        cheInactivo.setText("Inactivo");
        jPanel2.add(cheInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 140, -1));
        jPanel2.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 140, -1));
        jPanel2.add(txtTipoDescripcionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 140, -1));

        jTabbedPane1.addTab("General", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 5, -1, -1));

        jLabel7.setText("Campo1");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        jPanel1.add(TxtCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 190, -1));

        jLabel8.setText("Campo2");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        TxtCampo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCampo2ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 170, -1));

        jLabel9.setText("Campo3");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 50, -1));
        jPanel1.add(TxtCampo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, -1));

        jLabel10.setText("Campo4");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));
        jPanel1.add(TxtCampo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 170, -1));

        jLabel11.setText("Campo5");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, 20));
        jPanel1.add(TxtCampo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 190, -1));

        jLabel12.setText("Campo6");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));
        jPanel1.add(TxtCampo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 170, -1));

        jTabbedPane1.addTab("Adicionales", jPanel1);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 510));

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
        btnactulizar.setEnabled(false);
        btnactulizar.setFocusable(false);
        btnactulizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnactulizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnactulizar);

        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar_1.png"))); // NOI18N
        btnEliminar1.setToolTipText("Eliminar");
        btnEliminar1.setEnabled(false);
        btnEliminar1.setFocusable(false);
        btnEliminar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnEliminar1);

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar_1.png"))); // NOI18N
        btnBuscarCliente.setToolTipText("Buscar");
        btnBuscarCliente.setFocusable(false);
        btnBuscarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        jToolBar2.add(btnBuscarCliente);

        btnImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir_1.png"))); // NOI18N
        btnImprimir1.setToolTipText("Imprimir");
        btnImprimir1.setFocusable(false);
        btnImprimir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(btnImprimir1);

        add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 810, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void TxtSegmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSegmentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSegmentoActionPerformed

    private void TxtCampo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCampo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCampo2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDialog ReporteCliente;
    public javax.swing.JTextField TxtCampo1;
    public javax.swing.JTextField TxtCampo2;
    public javax.swing.JTextField TxtCampo3;
    public javax.swing.JTextField TxtCampo4;
    public javax.swing.JTextField TxtCampo5;
    public javax.swing.JTextField TxtCampo6;
    public javax.swing.JTextField TxtCiudad;
    public javax.swing.JTextField TxtCodigocliente;
    public javax.swing.JTextField TxtContacto;
    public javax.swing.JTextField TxtCuenta2;
    public javax.swing.JTextField TxtDireccion;
    public javax.swing.JTextField TxtDireccionEntrega;
    public javax.swing.JTextField TxtEmail;
    public javax.swing.JTextField TxtNIT;
    public javax.swing.JTextField TxtPais;
    public javax.swing.JTextField TxtPais2;
    public javax.swing.JTextField TxtPostal;
    public javax.swing.JTextField TxtRIF;
    public javax.swing.JTextField TxtRetencion;
    public javax.swing.JTextField TxtSegmento;
    public javax.swing.JTextField TxtSegmento1;
    public javax.swing.JTextField TxtTabulador;
    public javax.swing.JTextField TxtTabulador2;
    public javax.swing.JTextField TxtTelefono;
    public javax.swing.JTextField TxtVendedor;
    public javax.swing.JTextField TxtVendedor1;
    public javax.swing.JTextField TxtZona;
    public javax.swing.JTextField TxtZona2;
    public javax.swing.JButton btnAceptarCliente;
    public javax.swing.JButton btnAceptarCondicionPag;
    public javax.swing.JButton btnAceptarCta;
    public javax.swing.JButton btnAceptarImprimir;
    public javax.swing.JButton btnAceptarPais;
    public javax.swing.JButton btnAceptarSeg;
    public javax.swing.JButton btnAceptarTipoCliente;
    public javax.swing.JButton btnAceptarVendedor;
    public javax.swing.JButton btnAceptarZona;
    public javax.swing.JButton btnBuscarCliente;
    private javax.swing.ButtonGroup btnBusquedaCondPago;
    private javax.swing.ButtonGroup btnBusquedaCta;
    private javax.swing.ButtonGroup btnBusquedaPais;
    private javax.swing.ButtonGroup btnBusquedaSeg;
    private javax.swing.ButtonGroup btnBusquedaTipoClie;
    private javax.swing.ButtonGroup btnBusquedaVen;
    public javax.swing.ButtonGroup btnBusquedaZona;
    public javax.swing.JButton btnCancelarCliente;
    public javax.swing.JButton btnCancelarCondicionPag;
    public javax.swing.JButton btnCancelarDialogCuentaIng;
    public javax.swing.JButton btnCancelarPais;
    public javax.swing.JButton btnCancelarReporte;
    public javax.swing.JButton btnCancelarSeg;
    public javax.swing.JButton btnCancelarTipoCliente;
    public javax.swing.JButton btnCancelarVendedor;
    public javax.swing.JButton btnCancelarZona;
    private javax.swing.JButton btnDesde;
    public javax.swing.JButton btnEliminar1;
    private javax.swing.ButtonGroup btnGrupoBusqueda;
    private javax.swing.ButtonGroup btnGrupoOpcion;
    public javax.swing.JButton btnGuardar1;
    public javax.swing.JButton btnImprimir1;
    public javax.swing.JButton btnNuevo1;
    private javax.swing.ButtonGroup btnOpcionConPag;
    private javax.swing.ButtonGroup btnOpcionCta;
    private javax.swing.ButtonGroup btnOpcionPais;
    private javax.swing.ButtonGroup btnOpcionSeg;
    private javax.swing.ButtonGroup btnOpcionTipCli;
    private javax.swing.ButtonGroup btnOpcionVen;
    private javax.swing.ButtonGroup btnOpcionZona;
    public javax.swing.JButton btnSaldoActual;
    public javax.swing.JButton btnactulizar;
    public javax.swing.JCheckBox cheContribuyente;
    public javax.swing.JCheckBox cheContribuyenteEspecial;
    public javax.swing.JCheckBox cheDomingo;
    public javax.swing.JCheckBox cheInactivo;
    public javax.swing.JCheckBox cheJuves;
    public javax.swing.JCheckBox cheLunes1;
    public javax.swing.JCheckBox cheMartes;
    public javax.swing.JCheckBox cheMiercoles;
    public javax.swing.JCheckBox cheRetenerDocum;
    public javax.swing.JCheckBox cheSabado;
    public javax.swing.JCheckBox cheSinCredito;
    public javax.swing.JCheckBox cheViernes;
    public javax.swing.JComboBox<String> combTipoPersona;
    public javax.swing.JComboBox<String> comboCriterio;
    public javax.swing.JComboBox<String> comboInactivo;
    public javax.swing.JComboBox<String> comboOrdenar;
    public javax.swing.JComboBox<String> comboReporteCliente;
    public com.toedter.calendar.JDateChooser fecha;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton3;
    public javax.swing.JDialog jDialogClientes;
    public javax.swing.JDialog jDialogCondicionPago;
    public javax.swing.JDialog jDialogCtaIng;
    public javax.swing.JDialog jDialogPais;
    public javax.swing.JDialog jDialogSegemento;
    public javax.swing.JDialog jDialogTipoCliente;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
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
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
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
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JPanel jPanelReporteDatosBasicos;
    public javax.swing.JRadioButton jRExactaTipoCliente;
    public javax.swing.JRadioButton jRFinal1;
    public javax.swing.JRadioButton jRFinalCta;
    public javax.swing.JRadioButton jRFinalP;
    public javax.swing.JRadioButton jRFinalPago;
    public javax.swing.JRadioButton jRFinalSeg;
    public javax.swing.JRadioButton jRFinalTipClient;
    public javax.swing.JRadioButton jRFinalVen;
    public javax.swing.JRadioButton jRFinalZ;
    public javax.swing.JRadioButton jRInicio1;
    public javax.swing.JRadioButton jRInicioCta;
    public javax.swing.JRadioButton jRInicioP;
    public javax.swing.JRadioButton jRInicioPago;
    public javax.swing.JRadioButton jRInicioSeg;
    public javax.swing.JRadioButton jRInicioTipClient;
    public javax.swing.JRadioButton jRInicioVen;
    public javax.swing.JRadioButton jRInicioZ;
    public javax.swing.JRadioButton jRexactaCta;
    public javax.swing.JRadioButton jRexactaP;
    public javax.swing.JRadioButton jRexactaPago;
    public javax.swing.JRadioButton jRexactaSeg;
    public javax.swing.JRadioButton jRexactaVen;
    public javax.swing.JRadioButton jRexactaZ;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar2;
    public javax.swing.JRadioButton jrCodigo1;
    public javax.swing.JRadioButton jrCodigoCta;
    public javax.swing.JRadioButton jrCodigoP;
    public javax.swing.JRadioButton jrCodigoPago;
    public javax.swing.JRadioButton jrCodigoSeg;
    public javax.swing.JRadioButton jrCodigoTipClient;
    public javax.swing.JRadioButton jrCodigoVen;
    public javax.swing.JRadioButton jrCodigoZ;
    public javax.swing.JRadioButton jrCualquier1;
    public javax.swing.JRadioButton jrCualquierCta;
    public javax.swing.JRadioButton jrCualquierP;
    public javax.swing.JRadioButton jrCualquierPago;
    public javax.swing.JRadioButton jrCualquierSeg;
    public javax.swing.JRadioButton jrCualquierTipClient;
    public javax.swing.JRadioButton jrCualquierVen;
    public javax.swing.JRadioButton jrCualquierZ;
    public javax.swing.JRadioButton jrDescripcion;
    public javax.swing.JRadioButton jrDescripcionCta;
    public javax.swing.JRadioButton jrDescripcionP;
    public javax.swing.JRadioButton jrDescripcionPago;
    public javax.swing.JRadioButton jrDescripcionSeg;
    public javax.swing.JRadioButton jrDescripcionTipClient;
    public javax.swing.JRadioButton jrDescripcionVen;
    public javax.swing.JRadioButton jrDescripcionZ;
    public javax.swing.JRadioButton jrExacta1;
    public javax.swing.JTable jtablaCliente;
    public javax.swing.JTable jtablaCondicionPago;
    public javax.swing.JTable jtablaCuentaInEgre;
    public javax.swing.JTable jtablaPais;
    public javax.swing.JTable jtablaSegmento;
    public javax.swing.JTable jtablaVendedor;
    public javax.swing.JTable jtablaZona;
    public javax.swing.JTable jtableTipoClientes;
    public javax.swing.JTextField txtBuscarCliente;
    public javax.swing.JTextField txtBuscartipoCliente;
    public javax.swing.JTextField txtCodDesde;
    public javax.swing.JTextField txtCodHasta;
    public javax.swing.JTextField txtCodPaisDesde;
    public javax.swing.JTextField txtCodPaisHasta;
    public javax.swing.JTextField txtCodSegmentoDesde;
    public javax.swing.JTextField txtCodSegmentoHasta;
    public javax.swing.JTextField txtCodTipoClientDesde;
    public javax.swing.JTextField txtCodTipoClientHasta;
    public javax.swing.JTextField txtCodVendedorDesde;
    public javax.swing.JTextField txtCodVendedorHasta;
    public javax.swing.JTextField txtCodZonaDesde;
    public javax.swing.JTextField txtCodZonaHasta;
    public javax.swing.JTextField txtCod_CondPago;
    public javax.swing.JTextField txtCuentIngEgr;
    public javax.swing.JTextField txtDescripDesde;
    public javax.swing.JTextField txtDescripDesde1;
    public javax.swing.JTextField txtDescripPaisDesde;
    public javax.swing.JTextField txtDescripcionCondPago;
    public javax.swing.JTextField txtDescripcionPaisHasta;
    public javax.swing.JTextField txtDescripcionSegmentoDesde;
    public javax.swing.JTextField txtDescripcionSegmentoHasta;
    public javax.swing.JTextField txtDescripcionSimbMoneda;
    public javax.swing.JTextField txtDescripcionTVendedorDesde;
    public javax.swing.JTextField txtDescripcionTipoClient;
    public javax.swing.JTextField txtDescripcionTipoClientHasta;
    public javax.swing.JTextField txtDescripcionVendedorHasta;
    public javax.swing.JTextField txtDescripcionZonaDesde;
    public javax.swing.JTextField txtDescripcionZonaHasta;
    public javax.swing.JTextField txtDias;
    public javax.swing.JTextField txtFrecuencia;
    public javax.swing.JTextField txtGlobal;
    public javax.swing.JTextField txtHoraCaja;
    public javax.swing.JTextField txtMontoLimite;
    public javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtProntoPago;
    public javax.swing.JTextField txtSimMoneda;
    public javax.swing.JTextField txtTipoCliente;
    public javax.swing.JTextField txtTipoDescripcionCliente;
    public javax.swing.JTextField txtValorCondicionPago;
    public javax.swing.JTextField txtValorCuentaInEgre;
    public javax.swing.JTextField txtValorPais;
    public javax.swing.JTextField txtValorSegmento;
    public javax.swing.JTextField txtbuscarVendedor;
    public javax.swing.JTextField txtvalorZona;
    // End of variables declaration//GEN-END:variables
}
