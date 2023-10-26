/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package evento;

import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author earana
 */
public class VistaPrincipalevent implements ActionListener {

    Vistaprincipal vistaprincipal;
    static JInternalFrame ventanaInterna, ventanaLinea, ventanaSublinea, ventanaColor,
            ventanaUbicacion, ventanaCategoria, ventanaUnidad, ventanatipoAjuste, ventaProveedor,
            ventanaAlmacen, ventanaUsuario, ventanaAjusteES, ventanaTipoProveedor, ventanaZonaCCxP, ventanaSegmentoCXP, ventanaCuentaIngresoEgresoCxP, ventanaPais, ventanaCondicionPagoVCxC,
            ventanaCLiente, ventanaNotaEntregaVentCxC, ventanaDespachoVentaCxC, ventanaFacturaVentaCxC, ventanaCotizacionVeCXC, ventanaNotaEntregaVenCxC,
            ventanaProcedencia, ventanaDevolucionVCxC, ventanaSucursal, ventanaMonedas, ventanaTipoCliente, ventanaTransporte,
            ventanaVendedor, ventanaTabulador, ventanaIVAtributario, ventanaFacturaCompraCxP, ventanaBanco, ventanaBeneficiario;

    public VistaPrincipalevent(Vistaprincipal vista) {
        this.vistaprincipal = vista;

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == this.vistaprincipal.btnArticulo) {

            if (ventanaInterna == null || ventanaInterna.isClosed()) {
                //  
                ventanaInterna = new JInternalFrame("Articulo ", true, true, true, true);
                ventanaInterna.setBounds(1 * 3, 1 * 3, 750, 450);
                VistaArticulo articulo = new VistaArticulo();

                ventanaInterna.add(articulo);
                ventanaInterna.setVisible(true);
                System.out.println(ventanaInterna.isEnabled());

                vistaprincipal.escritorio.add(ventanaInterna);
                try {
                    ventanaInterna.setSelected(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //abrir.setEnabled(false);
                ventanaInterna.repaint();
            } else {
                System.out.println("La ventana ya se encuentra abierta.");
            }
        } else if (event.getSource() == this.vistaprincipal.btnlinea) {
            if (ventanaLinea == null || ventanaLinea.isClosed()) {
                ventanaLinea = new JInternalFrame("Linea ", true, true, false, true);
                ventanaLinea.setResizable(false);
                ventanaLinea.setBounds(2 * 3, 1 * 3, 700, 300);
                VistaLinea linea = new VistaLinea();
                ventanaLinea.add(linea);
                ventanaLinea.setVisible(true);
                vistaprincipal.escritorio.add(ventanaLinea);
                try {
                    ventanaLinea.setSelected(true);
                } catch (Exception e) {
                    ventanaLinea.repaint();
                }
            }
        } else if (event.getSource() == this.vistaprincipal.btnSublinea) {
            if (ventanaSublinea == null || ventanaSublinea.isClosed()) {
                ventanaSublinea = new JInternalFrame("Sublinea ", true, true, false, true);
                ventanaSublinea.setResizable(false);
                ventanaSublinea.setBounds(3 * 3, 1 * 3, 650, 300);
                VistaSublinea sublinea = new VistaSublinea();
                ventanaSublinea.add(sublinea);
                ventanaSublinea.setVisible(true);
                vistaprincipal.escritorio.add(ventanaSublinea);
            }
        } else if (event.getSource() == this.vistaprincipal.btnColor) {
            if (ventanaColor == null || ventanaColor.isClosed()) {
                ventanaColor = new JInternalFrame("Color", true, true, false, true);
                ventanaColor.setResizable(false);
                ventanaColor.setBounds(4 * 3, 1 * 3, 670, 290);
                VistaColor color = new VistaColor();
                ventanaColor.add(color);
                ventanaColor.setVisible(true);
                vistaprincipal.escritorio.add(ventanaColor);
            }
        } else if (event.getSource() == this.vistaprincipal.btnUnidad) {
            if (ventanaUnidad == null || ventanaUnidad.isClosed()) {
                ventanaUnidad = new JInternalFrame("Unidad", true, true, false, true);
                ventanaUnidad.setResizable(false);
                ventanaUnidad.setBounds(5 * 3, 1 * 3, 650, 300);

                VistaUnidad unidad = new VistaUnidad();
                ventanaUnidad.add(unidad);
                ventanaUnidad.setVisible(true);
                vistaprincipal.escritorio.add(ventanaUnidad);
            }
        } else if (event.getSource() == this.vistaprincipal.btnCategoria) {
            if (ventanaCategoria == null || ventanaCategoria.isClosed()) {
                ventanaCategoria = new JInternalFrame("Categoria", true, true, false, true);
                ventanaCategoria.setResizable(false);
                ventanaCategoria.setBounds(6 * 3, 1 * 3, 650, 300);
                VistaCategoria categoria = new VistaCategoria();
                ventanaCategoria.add(categoria);
                ventanaCategoria.setVisible(true);
                vistaprincipal.escritorio.add(ventanaCategoria);
            }
        } else if (event.getSource() == this.vistaprincipal.btnUbicacion) {
            if (ventanaUbicacion == null || ventanaUbicacion.isClosed()) {
                ventanaUbicacion = new JInternalFrame("Ubicacion", true, true, false, true);
                ventanaUbicacion.setResizable(false);
                ventanaUbicacion.setBounds(6 * 3, 1 * 3, 650, 300);
                VistaUbicacion ubicacion = new VistaUbicacion();
                ventanaUbicacion.add(ubicacion);
                ventanaUbicacion.setVisible(true);
                vistaprincipal.escritorio.add(ventanaUbicacion);
            }

            VistaUbicacion ubicacion = new VistaUbicacion();
            vistaprincipal.escritorio.add(ubicacion);
            ubicacion.show();
        } else if (event.getSource() == this.vistaprincipal.btnSucursal) {
            if (ventanaSucursal == null || ventanaSucursal.isClosed()) {
                ventanaSucursal = new JInternalFrame("Sucursal", true, true, false, true);
                ventanaSucursal.setResizable(false);
                ventanaSucursal.setBounds(6 * 3, 1 * 3, 650, 300);
                VistaSucursal sucursal = new VistaSucursal();
                ventanaSucursal.add(sucursal);
                ventanaSucursal.setVisible(true);
                vistaprincipal.escritorio.add(ventanaSucursal);
            }

        } else if (event.getSource() == this.vistaprincipal.btnProcedencia) {
            if (ventanaProcedencia == null || ventanaProcedencia.isClosed()) {
                ventanaProcedencia = new JInternalFrame("Procedencia ", true, true, false, true);
                ventanaProcedencia.setResizable(false);
                ventanaProcedencia.setBounds(6 * 3, 1 * 3, 650, 300);
                VistaProcedencia procedencia = new VistaProcedencia();
                ventanaProcedencia.add(procedencia);
                ventanaProcedencia.setVisible(true);
                vistaprincipal.escritorio.add(ventanaProcedencia);
            }

        } else if (event.getSource().equals(this.vistaprincipal.btnTipoAjuste)) {
            if (ventanatipoAjuste == null || ventanatipoAjuste.isClosed()) {
                ventanatipoAjuste = new JInternalFrame("Tipo de Ajustes", true, true, false, true);
                ventanatipoAjuste.setResizable(false);
                ventanatipoAjuste.setBounds(6 * 3, 1 * 3, 650, 300);
                VistaTipoAjuste vistaTipoAjuste = new VistaTipoAjuste();
                ventanatipoAjuste.add(vistaTipoAjuste);
                ventanatipoAjuste.setVisible(true);
                vistaprincipal.escritorio.add(ventanatipoAjuste);

            }
        } else if (event.getSource().equals(this.vistaprincipal.btnProveedor) || event.getSource().equals(vistaprincipal.btnProveedorCompras)) {
            if (ventaProveedor == null || ventaProveedor.isClosed()) {
                ventaProveedor = new JInternalFrame("Proveedor ", true, true, false, true);
                ventaProveedor.setResizable(false);
                ventaProveedor.setBounds(6 * 3, 1 * 4, 660, 490);
                VistaProveedor proveedor = new VistaProveedor();
                ventaProveedor.add(proveedor);
                ventaProveedor.setVisible(true);
                vistaprincipal.escritorio.add(ventaProveedor);
            }
        } else if (event.getSource().equals(this.vistaprincipal.btnTipoAjuste)) {
            if (ventanatipoAjuste == null || ventanatipoAjuste.isClosed()) {
                ventanatipoAjuste = new JInternalFrame("Tipo de Ajustes ", true, true, false, true);
                ventanatipoAjuste.setResizable(false);
                ventanatipoAjuste.setBounds(6 * 3, 1 * 4, 650, 300);
                VistaTipoAjuste vistaTipoAjuste = new VistaTipoAjuste();
                ventanatipoAjuste.add(vistaTipoAjuste);
                ventanatipoAjuste.setVisible(true);
                vistaprincipal.escritorio.add(ventanatipoAjuste);
            }
        } else if (event.getSource().equals(this.vistaprincipal.btnAlmacen) || event.getSource().equals(this.vistaprincipal.btnAlmacenVCxC)) {

            if (ventanaAlmacen == null || ventanaAlmacen.isClosed()) {
                ventanaAlmacen = new JInternalFrame("Almacen ", true, true, false, true);
                ventanaAlmacen.setResizable(false);
                ventanaAlmacen.setBounds(6 * 4, 1 * 4, 666, 350);
                VistaAlmacen vistaAlmacen = new VistaAlmacen();
                ventanaAlmacen.add(vistaAlmacen);
                ventanaAlmacen.setVisible(true);
                vistaprincipal.escritorio.add(ventanaAlmacen);
            }
        } else if (event.getSource().equals(this.vistaprincipal.btnUsuario)) {

            if (ventanaUsuario == null || ventanaUsuario.isClosed()) {

                ventanaUsuario = new JInternalFrame("Usuario", true, true, false, true);
                ventanaUsuario.setResizable(false);
                ventanaUsuario.setBounds(6 * 4, 1 * 4, 585, 335);
                VistaUsuario vistaUsuario = new VistaUsuario();
                ventanaUsuario.add(vistaUsuario);
                ventanaUsuario.setVisible(true);
                vistaprincipal.escritorio.add(ventanaUsuario);
            }
        } else if (event.getSource().equals(this.vistaprincipal.btnAjusteES)) {
            if (ventanaAjusteES == null || ventanaAjusteES.isClosed()) {
                ventanaAjusteES = new JInternalFrame("Ajuste Entrada Salida", true, true, true, true);
                ventanaAjusteES.setBounds(7 * 4, 1 * 4, 820, 400);
                VistaAjustesES ajustesES = new VistaAjustesES();
                ventanaAjusteES.add(ajustesES);
                ventanaAjusteES.setVisible(true);
                vistaprincipal.escritorio.add(ventanaAjusteES);
            }
        } else if (event.getSource().equals(this.vistaprincipal.btnTipoComprasCxP)) {
            if (ventanaTipoProveedor == null || ventanaTipoProveedor.isClosed()) {
                ventanaTipoProveedor = new JInternalFrame("Tipo Proveedor", true, true, true, true);
                ventanaTipoProveedor.setBounds(7 * 4, 1 * 4, 650, 300);
                VistaTipoProveedor tipoProveedor = new VistaTipoProveedor();
                ventanaTipoProveedor.add(tipoProveedor);
                ventanaTipoProveedor.setVisible(true);
                vistaprincipal.escritorio.add(ventanaTipoProveedor);
            }
        } else if (event.getSource().equals(this.vistaprincipal.btnZonaCxP) || event.getSource().equals(this.vistaprincipal.btnZonaVCxC)) {
            if (ventanaZonaCCxP == null || ventanaZonaCCxP.isClosed()) {
                ventanaZonaCCxP = new JInternalFrame("Zona", true, true, true, true);
                ventanaZonaCCxP.setBounds(7 * 4, 1 * 4, 650, 300);
                VistaZona vistaZona = new VistaZona();
                ventanaZonaCCxP.add(vistaZona);
                ventanaZonaCCxP.setVisible(true);
                vistaprincipal.escritorio.add(ventanaZonaCCxP);

            }
        } else if (event.getSource().equals(this.vistaprincipal.btnSegmentoCxP) || event.getSource().equals(this.vistaprincipal.btnSegmentoVCxC)) {
            if (ventanaSegmentoCXP == null || ventanaSegmentoCXP.isClosed()) {
                ventanaSegmentoCXP = new JInternalFrame("Segmento", true, true, true, true);
                ventanaSegmentoCXP.setBounds(8 * 4, 1 * 4, 650, 300);
                VistaSegmento vistaSegmento = new VistaSegmento();
                ventanaSegmentoCXP.add(vistaSegmento);
                ventanaSegmentoCXP.setVisible(true);
                vistaprincipal.escritorio.add(ventanaSegmentoCXP);
            }
        } else if (event.getSource().equals(vistaprincipal.btnCuntaIngresoEgresoCxP)) {
            if (ventanaCuentaIngresoEgresoCxP == null || ventanaCuentaIngresoEgresoCxP.isClosed()) {
                ventanaCuentaIngresoEgresoCxP = new JInternalFrame("Cuenta Ingreso / Egreso", true, true, true, true);
                ventanaCuentaIngresoEgresoCxP.setBounds(8 * 4, 1 * 4, 650, 300);
                VistaCuentaInEgre cuentaInEgre = new VistaCuentaInEgre();
                ventanaCuentaIngresoEgresoCxP.add(cuentaInEgre);
                ventanaCuentaIngresoEgresoCxP.setVisible(true);
                vistaprincipal.escritorio.add(ventanaCuentaIngresoEgresoCxP);

            }
        } else if (event.getSource().equals(vistaprincipal.btnPaisVCxC)) {
            if (ventanaPais == null || ventanaPais.isClosed()) {
                ventanaPais = new JInternalFrame("Pais ", true, true, true, true);
                ventanaPais.setBounds(8 * 4, 1 * 4, 650, 300);
                VistaPais vistaPais = new VistaPais();
                ventanaPais.add(vistaPais);
                ventanaPais.setVisible(true);
                vistaprincipal.escritorio.add(ventanaPais);
            }
        } else if (event.getSource().equals(vistaprincipal.btnClienteVCxC)) {
            if (ventanaCLiente == null || ventanaCLiente.isClosed()) {
                ventanaCLiente = new JInternalFrame("Cliente ", true, true, true, true);
                ventanaCLiente.setBounds(8 * 4, 1 * 4, 1140, 670);
                VistaCliente cliente = new VistaCliente();
                ventanaCLiente.add(cliente);
                ventanaCLiente.setVisible(true);
                vistaprincipal.escritorio.add(ventanaCLiente);
            }
        } else if (event.getSource().equals(vistaprincipal.btnNotaEntregaVenCxC)) {

            if (ventanaNotaEntregaVentCxC == null || ventanaNotaEntregaVentCxC.isClosed()) {
                ventanaNotaEntregaVentCxC = new JInternalFrame("Nota de Entrega", true, true, true, true);
                ventanaNotaEntregaVentCxC.setBounds(8 * 4, 1 * 4, 1140, 670);
                VistaNotadeEntregaVentas vistaNotadeEntrega = new VistaNotadeEntregaVentas();
                ventanaNotaEntregaVentCxC.add(vistaNotadeEntrega);
                ventanaNotaEntregaVentCxC.setVisible(true);
                vistaprincipal.escritorio.add(ventanaNotaEntregaVentCxC);
            }
        } else if (event.getSource().equals(vistaprincipal.btnfacturaVentaCxC)) {
            if (ventanaFacturaVentaCxC == null || ventanaFacturaVentaCxC.isClosed()) {
                ventanaFacturaVentaCxC = new JInternalFrame("Factura de Venta ", true, true, true, true);
                ventanaFacturaVentaCxC.setBounds(8 * 4, 1 * 4, 1140, 670);
                VistaFacturaVenta vistaFacturaVenta = new VistaFacturaVenta();
                ventanaFacturaVentaCxC.add(vistaFacturaVenta);
                ventanaFacturaVentaCxC.setVisible(true);
                vistaprincipal.escritorio.add(ventanaFacturaVentaCxC);

            }
        } else if (event.getSource().equals(vistaprincipal.btnCotizacionVeCXC)) {
            if (ventanaCotizacionVeCXC == null || ventanaCotizacionVeCXC.isClosed()) {
                ventanaCotizacionVeCXC = new JInternalFrame("Cotizacion  ", true, true, true, true);
                ventanaCotizacionVeCXC.setBounds(8 * 4, 1 * 4, 1140, 670);
                VistaCotizacionVenta vistaCotizacionVenta = new VistaCotizacionVenta();
                ventanaCotizacionVeCXC.add(vistaCotizacionVenta);
                ventanaCotizacionVeCXC.setVisible(true);
                vistaprincipal.escritorio.add(ventanaCotizacionVeCXC);
            }
        } else if (event.getSource().equals(vistaprincipal.btnNotaEntregaVenCxC)) {
            if (ventanaNotaEntregaVenCxC == null || ventanaNotaEntregaVenCxC.isClosed()) {
                ventanaNotaEntregaVenCxC = new JInternalFrame("Nota de Entrega", true, true, true, true);
                ventanaNotaEntregaVenCxC.setBounds(8 * 4, 1 * 4, 1140, 670);
                VistaNotadeEntregaVentas vistaNotadeEntrega = new VistaNotadeEntregaVentas();
                ventanaNotaEntregaVenCxC.add(vistaNotadeEntrega);
                ventanaNotaEntregaVenCxC.setVisible(true);
                vistaprincipal.escritorio.add(ventanaNotaEntregaVenCxC);
            }

        } else if (event.getSource().equals(vistaprincipal.btnDevolucionVCxC)) {
            if (ventanaDevolucionVCxC == null || ventanaDevolucionVCxC.isClosed()) {
                ventanaDevolucionVCxC = new JInternalFrame("Devolucion", true, true, true, true);
                ventanaDevolucionVCxC.setBounds(8 * 4, 1 * 4, 1140, 670);
                VistaDevolucionCliente devolucionCliente = new VistaDevolucionCliente();
                ventanaDevolucionVCxC.add(devolucionCliente);
                ventanaDevolucionVCxC.setVisible(true);
                vistaprincipal.escritorio.add(ventanaDevolucionVCxC);
            }
        } else if (event.getSource().equals(vistaprincipal.btnCxCDespacho)) {
            if (ventanaDespachoVentaCxC == null || ventanaDespachoVentaCxC.isClosed()) {
                ventanaDespachoVentaCxC = new JInternalFrame("Despacho", true, true, true, true);
                ventanaDespachoVentaCxC.setBounds(8 * 4, 1 * 4, 1140, 670);
                VistaDespachos despacho = new VistaDespachos();
                ventanaDespachoVentaCxC.add(despacho);
                ventanaDespachoVentaCxC.setVisible(true);
                vistaprincipal.escritorio.add(ventanaDespachoVentaCxC);
            }

        } else if (event.getSource().equals(vistaprincipal.btnMoneda)) {
            if (ventanaMonedas == null || ventanaMonedas.isClosed()) {
                ventanaMonedas = new JInternalFrame("Monedas", true, true, true, true);
                ventanaMonedas.setBounds(8 * 4, 1 * 4, 670, 400);
                VistaMoneda vistaMoneda = new VistaMoneda();
                ventanaMonedas.add(vistaMoneda);
                ventanaMonedas.setVisible(true);
                vistaprincipal.escritorio.add(ventanaMonedas);
            }
        } else if (event.getSource().equals(vistaprincipal.btnTipoClienteVCxC)) {
            if (ventanaTipoCliente == null || ventanaTipoCliente.isClosed()) {
                ventanaTipoCliente = new JInternalFrame("Tipo  Clientes", true, true, true, true);
                ventanaTipoCliente.setBounds(8 * 4, 1 * 4, 670, 400);
                VistaTipoCliente vistaTipoCliente = new VistaTipoCliente();
                ventanaTipoCliente.add(vistaTipoCliente);
                ventanaTipoCliente.setVisible(true);
                vistaprincipal.escritorio.add(ventanaTipoCliente);
            }
        } else if (event.getSource().equals(vistaprincipal.btnTransporteVCxC)) {
            if (ventanaTransporte == null || ventanaTransporte.isClosed()) {
                ventanaTransporte = new JInternalFrame("Transporte", true, true, true, true);
                ventanaTransporte.setBounds(7 * 4, 1 * 4, 650, 300);
                VistaTransporte vistaTransporte = new VistaTransporte();
                ventanaTransporte.add(vistaTransporte);
                ventanaTransporte.setVisible(true);
                vistaprincipal.escritorio.add(ventanaTransporte);
            }

        } else if (event.getSource().equals(vistaprincipal.btnVendedor)) {
            if (ventanaVendedor == null || ventanaVendedor.isClosed()) {
                ventanaVendedor = new JInternalFrame("Vendedor", true, true, true, true);
                ventanaVendedor.setBounds(7 * 4, 1 * 4, 735, 378);
                VistaVendedor vistaVendedor = new VistaVendedor();
                ventanaVendedor.add(vistaVendedor);
                ventanaVendedor.setVisible(true);
                vistaprincipal.escritorio.add(ventanaVendedor);
            }
        } else if (event.getSource().equals(vistaprincipal.btnCondicionPagoVCxC) || event.getSource().equals(vistaprincipal.btnCondicionPagoCxP)) {

            if (ventanaCondicionPagoVCxC == null || ventanaCondicionPagoVCxC.isClosed()) {
                ventanaCondicionPagoVCxC = new JInternalFrame("Condicion de Pago", true, true, true, true);
                ventanaCondicionPagoVCxC.setBounds(7 * 4, 1 * 4, 650, 300);
                VistaCondicionPago vistaCondicionPago = new VistaCondicionPago();
                ventanaCondicionPagoVCxC.add(vistaCondicionPago);
                ventanaCondicionPagoVCxC.setVisible(true);
                vistaprincipal.escritorio.add(ventanaCondicionPagoVCxC);
            }
        } else if (event.getSource().equals(vistaprincipal.btnTabulador)) {

            if (ventanaTabulador == null || ventanaTabulador.isClosed()) {
                ventanaTabulador = new JInternalFrame("Tabulador I.S.L.R.", true, true, true, true);
                ventanaTabulador.setBounds(7 * 4, 1 * 4, 650, 450);
                VistaTabuladorIsLr tabuladorIsLr = new VistaTabuladorIsLr();
                ventanaTabulador.add(tabuladorIsLr);
                ventanaTabulador.setVisible(true);
                vistaprincipal.escritorio.add(ventanaTabulador);
            }
        } else if (event.getSource().equals(vistaprincipal.btnIVATributario)) {

            if (ventanaIVAtributario == null || ventanaIVAtributario.isClosed()) {
                ventanaIVAtributario = new JInternalFrame("Impuesto al Valor Agregado", true, true, true, true);
                ventanaIVAtributario.setBounds(7 * 4, 1 * 4, 650, 450);
                VistaImpuestoValorAgregado vistaImpuestoValorAgregado = new VistaImpuestoValorAgregado();
                ventanaIVAtributario.add(vistaImpuestoValorAgregado);
                ventanaIVAtributario.setVisible(true);
                vistaprincipal.escritorio.add(ventanaIVAtributario);
            }
        } else if (event.getSource().equals(vistaprincipal.btnFacturaCompra)) {
            if (ventanaFacturaCompraCxP == null || ventanaFacturaCompraCxP.isClosed()) {
                ventanaFacturaCompraCxP = new JInternalFrame("Factura de Compras", true, true, true, true);
                ventanaFacturaCompraCxP.setBounds(8 * 4, 1 * 4, 1140, 670);
                VistaFacturaCompras vistaFacturaCompra = new VistaFacturaCompras();
                ventanaFacturaCompraCxP.add(vistaFacturaCompra);
                ventanaFacturaCompraCxP.setVisible(true);
                vistaprincipal.escritorio.add(ventanaFacturaCompraCxP);
            }
        } else if (event.getSource().equals(vistaprincipal.btnBanco)) {
            if (ventanaBanco == null || ventanaBanco.isClosed()) {
                ventanaBanco = new JInternalFrame("Banco ", true, true, true, true);
                ventanaBanco.setBounds(7 * 4, 1 * 4, 450, 450);
                VistaBanco vistaBanco = new VistaBanco();
                ventanaBanco.add(vistaBanco);
                ventanaBanco.setVisible(true);
                vistaprincipal.escritorio.add(ventanaBanco);
            }
        } else if (event.getSource().equals(vistaprincipal.btnBeneficiario)) {//ventanaBeneficiario
            if (ventanaBeneficiario == null || ventanaBeneficiario.isClosed()) {
                ventanaBeneficiario = new JInternalFrame("Beneficiario", true, true, true, true);
                ventanaBeneficiario.setBounds(7 * 4, 1 * 4, 650, 450);
                VistaBeneficiario beneficiario = new VistaBeneficiario();
                ventanaBeneficiario.add(beneficiario);
                ventanaBeneficiario.setVisible(true);
                vistaprincipal.escritorio.add(ventanaBeneficiario);
            }
        } else if (event.getSource() == this.vistaprincipal.jMSalir) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                vistaprincipal.dispose();
            } else {
                return;
            }
        }
    }
}
