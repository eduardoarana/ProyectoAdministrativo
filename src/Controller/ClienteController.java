/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.ClienteBO;
import Beans.CondicionPagoBO;
import Beans.CuentaInEgreBO;
import Beans.PaisBO;
import Beans.SegmentoBO;
import Beans.TipoClienteBO;
import Beans.VendedorBO;
import Beans.ZonaBO;
import Conection.Conexion;
import Model.ClienteModelo;
import Model.CondicionPagoModel;
import Model.CuentaInEgreModel;
import Model.ModelTablaCuentaInEgre;
import Model.ModeloTablaCliente;
import Model.ModeloTablaCoindicionPago;
import Model.ModeloTablaPais;
import Model.ModeloTablaSegmento;
import Model.ModeloTablaTipoCliente;
import Model.ModeloTablaVendedor;
import Model.ModeloTablaZona;
import Model.PaisModel;
import Model.SegmentoModelo;
import Model.TipoClienteModelo;
import Model.VendedorModelo;
import Model.ZonaModel;
import Vista.VistaCliente;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author AranaV
 */
public class ClienteController implements ActionListener, KeyListener, ChangeListener {

    VistaCliente vista;
    ClienteModelo modelo;
    ArrayList<ClienteBO> lista = null;
    ArrayList<PaisBO> listaPais;
    ArrayList<CuentaInEgreBO> listaCuentIngE;
    ArrayList<VendedorBO> listaVendedor;
    ArrayList<SegmentoBO> listaSegmento;
    ArrayList<ZonaBO> listaZona;
    ArrayList<CondicionPagoBO> listaCondicionP;
    public String contribuyenteSpecial = "";
    int resultado = 0;
    PaisModel paismosdelo;
    CuentaInEgreModel cuentaInEgreModel;
    VendedorModelo vendedorModelo;
    SegmentoModelo segementomodelo;
    ZonaModel modelozona;
    CondicionPagoModel condicionPagoModel;
    int selection = 0;
    TipoClienteModelo tipoClienteModel;
    ArrayList<TipoClienteBO> listaTipoCliente;
    public Conexion conexion;
    public int reporte = 0;

    public ClienteController(VistaCliente vista) {
        this.vista = vista;
        modelo = new ClienteModelo();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String inactivo = "0", sinCredito = "", lunes = "", martes = "", miercoles = "", jueves = "", viernes = "", sabado = "", domingo = "", contribuyente;
        double retencion = 0;
        int tipoPersona = 0;

        if (event.getSource() == vista.btnGuardar1) {
            inactivo = (vista.cheInactivo.isSelected()) ? "1" : "0";
            sinCredito = (vista.cheSinCredito.isSelected()) ? "1" : "0";
            lunes = (vista.cheLunes1.isSelected()) ? "1" : "0";
            martes = (vista.cheMartes.isSelected()) ? "1" : "0";
            miercoles = (vista.cheMiercoles.isSelected()) ? "1" : "0";
            jueves = (vista.cheJuves.isSelected()) ? "1" : "0";
            viernes = (vista.cheViernes.isSelected()) ? "1" : "0";
            sabado = (vista.cheSabado.isSelected()) ? "1" : "0";
            domingo = (vista.cheDomingo.isSelected()) ? "1" : "0";
            contribuyente = (vista.cheContribuyente.isSelected()) ? "1" : "0";
            contribuyenteSpecial = (vista.cheContribuyenteEspecial.isSelected()) ? "1" : "0";
            tipoPersona = vista.combTipoPersona.getSelectedIndex();
            System.out.println("Combo tp :" + tipoPersona);
            if (contribuyenteSpecial.equals("1")) {
                if (vista.TxtRetencion.getText().equals("00")) {
                    JOptionPane.showMessageDialog(new JFrame(), "la Retension no puede estar en cero", "Software", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            resultado = modelo.pInsertarCliente(
                    vista.TxtCodigocliente.getText(),// sCo_Cli,
                    null,//sLogin,
                    null,// sPassword,
                    null,// sSalesTax,
                    vista.txtNombreCliente.getText(), // sCli_Des,
                    vista.TxtSegmento.getText(), // sCo_seg,
                    vista.TxtZona.getText(),// sCo_zon,
                    vista.TxtVendedor.getText(),// sCo_Ven,
                    "A",// sEstado,
                    inactivo,// bInactivo,
                    "0",// bValido,
                    sinCredito,// bSinCredito,
                    lunes,// bLunes,
                    martes,// bLunes,
                    miercoles,// bMartes,,
                    jueves,// bLunes,
                    viernes,// bLunes,
                    sabado,// bLunes,
                    domingo,// bLunes,
                    vista.TxtDireccion.getText(), // sDirec1,
                    vista.TxtDireccion.getText(),// sDirec2,
                    vista.TxtDireccionEntrega.getText(),// sDir_Ent2,
                    vista.txtHoraCaja.getText(),// sHorar_Caja,
                    vista.txtFrecuencia.getText(),// sFrecu_Vist,
                    vista.TxtTelefono.getText(),// sTelefonos,
                    vista.TxtTelefono.getText(),// sFax,
                    vista.TxtContacto.getText(),// sRespons,
                    Utilitarios.Utilitario.obtenerFecha(vista.fecha),// sdFecha_reg,
                    vista.txtTipoCliente.getText(),// sTip_Cli,
                    "",// sSerialP,
                    "",// iPuntaje,
                    "1",// iId,
                    vista.txtMontoLimite.getText(),// deMont_cre,
                    vista.txtSimMoneda.getText(),// sCo_mone,
                    vista.txtCod_CondPago.getText(), // sCond_Pag,
                    vista.txtDias.getText(),// iPlaz_pag,
                    vista.txtProntoPago.getText(),// deDesc_ppago,
                    vista.txtGlobal.getText(),// deDesc_Glob,
                    "9",// sTipo_Iva,
                    "7",// deIva,
                    vista.TxtRIF.getText(),// sRif,
                    contribuyente,// bContrib,
                    "",// sDis_cen,
                    vista.TxtNIT.getText(),// sNit,
                    vista.TxtEmail.getText(),// sEmail,
                    vista.txtCuentIngEgr.getText(),// sCo_Cta_Ingr_Egr,
                    "Comentario",// sComentario,
                    vista.TxtCampo1.getText(),// sCampo1,
                    vista.TxtCampo2.getText(),
                    vista.TxtCampo3.getText(),
                    vista.TxtCampo4.getText(),
                    vista.TxtCampo5.getText(), vista.TxtCampo6.getText(),
                    null, null,
                    Vistaprincipal.tempUsuario,// sCo_Us_In,
                    Utilitarios.Utilitario.nombreHost(),// sMaquina,
                    "1",// sRevisado,
                    "",// sTrasnfe,
                    Vistaprincipal.tempSucrsal,// sCo_Sucu_In,
                    "1",// bJuridico,
                    "1",// iTipo_Adi,
                    "0",// sMatriz,
                    vista.TxtTabulador.getText(),// sCo_Tab,
                    "1",// sTipo_Per,
                    vista.TxtPais.getText(),// sCo_pais,
                    vista.TxtCiudad.getText(),// sCiudad,
                    "",// sZip,
                    "www",// sWebSite,
                    contribuyenteSpecial, // bContribu_E,
                    "1", // bRete_Regis_Doc,
                    "1",// dePorc_Esp,
                    "1",// sN_cr,
                    "1",// sN_db,
                    "1", // sTComp,
                    vista.TxtEmail.getText()// sEmail_alterno)
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setterCampos();
            }

        } else if (event.getSource() == vista.btnactulizar) {
            inactivo = (vista.cheInactivo.isSelected()) ? "1" : "0";
            sinCredito = (vista.cheSinCredito.isSelected()) ? "1" : "0";
            lunes = (vista.cheLunes1.isSelected()) ? "1" : "0";
            martes = (vista.cheMartes.isSelected()) ? "1" : "0";
            miercoles = (vista.cheMiercoles.isSelected()) ? "1" : "0";
            jueves = (vista.cheJuves.isSelected()) ? "1" : "0";
            viernes = (vista.cheViernes.isSelected()) ? "1" : "0";
            sabado = (vista.cheSabado.isSelected()) ? "1" : "0";
            domingo = (vista.cheDomingo.isSelected()) ? "1" : "0";
            contribuyente = (vista.cheContribuyente.isSelected()) ? "1" : "0";
            contribuyenteSpecial = (vista.cheContribuyenteEspecial.isSelected()) ? "1" : "0";
            tipoPersona = vista.combTipoPersona.getSelectedIndex();

            resultado = modelo.pActualizarCliente(
                    vista.TxtCodigocliente.getText(),// sCo_Cli,
                    vista.TxtCodigocliente.getText(),//sCo_CliOri
                    null,//sLogin,
                    null,// sPassword,
                    null,// sSalesTax,
                    vista.txtNombreCliente.getText(), // sCli_Des,
                    vista.TxtSegmento.getText(), // sCo_seg,
                    vista.TxtZona.getText(),// sCo_zon,
                    vista.TxtVendedor.getText(),// sCo_Ven,
                    "A",// sEstado,
                    inactivo,// bInactivo,
                    "0",// bValido,
                    sinCredito,// bSinCredito,
                    lunes,// bLunes,
                    martes,// bLunes,
                    miercoles,// bMartes,,
                    jueves,// bLunes,
                    viernes,// bLunes,
                    sabado,// bLunes,
                    domingo,// bLunes,
                    vista.TxtDireccion.getText(), // sDirec1,
                    vista.TxtDireccion.getText(),// sDirec2,
                    vista.TxtDireccionEntrega.getText(),// sDir_Ent2,
                    vista.txtHoraCaja.getText(),// sHorar_Caja,
                    vista.txtFrecuencia.getText(),// sFrecu_Vist,
                    vista.TxtTelefono.getText(),// sTelefonos,
                    vista.TxtTelefono.getText(),// sFax,
                    vista.TxtContacto.getText(),// sRespons,
                    Utilitarios.Utilitario.obtenerFecha(vista.fecha),// sdFecha_reg,
                    vista.txtTipoCliente.getText(),// sTip_Cli,
                    "",// sSerialP,
                    "",// iPuntaje,
                    "1",// iId,
                    vista.txtMontoLimite.getText(),// deMont_cre,
                    vista.txtSimMoneda.getText(),// sCo_mone,
                    vista.txtCod_CondPago.getText(), // sCond_Pag,
                    vista.txtDias.getText(),// iPlaz_pag,
                    vista.txtProntoPago.getText(),// deDesc_ppago,
                    vista.txtGlobal.getText(),// deDesc_Glob,
                    vista.TxtRIF.getText(),// @sRif,
                    contribuyente,// bContrib,
                    "",// ,sDis_cen
                    vista.TxtNIT.getText(),// ,sNit
                    vista.TxtEmail.getText(),// sEmail,
                    vista.txtCuentIngEgr.getText(),// sCo_Cta_Ingr_Egr,

                    "comentario",// sComentario,
                    vista.TxtCampo1.getText(),// sCampo1,
                    vista.TxtCampo2.getText(),
                    vista.TxtCampo3.getText(),
                    vista.TxtCampo4.getText(),
                    vista.TxtCampo5.getText(),
                    vista.TxtCampo6.getText(),
                    "Campo7",
                    "Camo8",
                    Vistaprincipal.tempUsuario,// Co_us_mo,
                    Vistaprincipal.tempSucrsal,// @sCo_Sucu_Mo,
                    Utilitarios.Utilitario.nombreHost(),// @sMaquina,
                    "c",// @sCampos,
                    "1",// @sRevisado,
                    "1",// @sTrasnfe,
                    "1",// @bJuridico,
                    "0",// @iTipo_Adi,
                    "1",// @sMatriz,
                    vista.TxtTabulador.getText(),// @sCo_Tab,
                    String.valueOf(tipoPersona),// @sTipo_Per,
                    vista.TxtPais.getText(),// @sCo_pais,
                    vista.TxtCiudad.getText(),// @sCiudad,
                    "z",// @@sZip,
                    "wwww", // sWebSite,
                    contribuyenteSpecial, // bContribu_E,
                    "1",// bRete_Regis_Doc,
                    "1",// dePorc_Esp,
                    "1",// @sN_cr,
                    "1", // sN_db,
                    "1",//sTComp
                    vista.TxtEmail.getText()// sEmail_alterno
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setterCampos();
            }

        } else if (event.getSource() == vista.btnEliminar1) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarCliente(vista.TxtCodigocliente.getText(),
                        Utilitarios.Utilitario.nombreHost(),
                        Vistaprincipal.tempUsuario, Vistaprincipal.tempSucrsal);
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                    vista.setterCampos();
                }
            }

        } else if (event.getSource() == vista.btnNuevo1) {
            vista.setterCampos();

        } else if (event.getSource() == vista.btnAceptarCliente) {
            selection = vista.jtablaCliente.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                ArrayList<ClienteBO> lista = modelo.pObtenerListadoDatos(
                        Vistaprincipal.tempEmpresa,
                        "saCliente",
                        "co_cli",
                        vista.jtablaCliente.getValueAt(selection, 0).toString(),
                        "3");
                if (reporte == 6) {
                    vista.txtCodDesde.setText(lista.get(0).getCo_cli().replaceAll("\\s", ""));
                    vista.txtDescripDesde.setText(lista.get(0).getCli_des());
                } else if (reporte == 7) {
                    vista.txtCodHasta.setText(lista.get(0).getCo_cli().replaceAll("\\s", ""));
                    vista.txtDescripDesde1.setText(lista.get(0).getCli_des());
                } else if (reporte == 8) {
                    vista.TxtCodigocliente.setText(lista.get(0).getCo_cli().replaceAll("\\s", ""));
                    vista.txtNombreCliente.setText(lista.get(0).getCli_des());
                    vista.TxtRIF.setText(lista.get(0).getRif());
                    vista.TxtNIT.setText(lista.get(0).getNit());
                    vista.txtTipoCliente.setText(lista.get(0).getTipo_cli());
                    vista.fecha.setDate(Utilitarios.Utilitario.obtenerFecha(lista.get(0).getFecha_reg()));
                    vista.TxtZona.setText(lista.get(0).getCo_zon().replaceAll("\\s", ""));
                    vista.TxtZona2.setText("bus");
                    vista.txtCuentIngEgr.setText(lista.get(0).getCo_cta_ingr_egr().replaceAll("\\s", ""));
                    vista.TxtPais.setText(lista.get(0).getCo_pais().replaceAll("\\s", ""));
                    vista.TxtPostal.setText(lista.get(0).getZip());
                    vista.TxtEmail.setText(lista.get(0).getEmail());
                    vista.TxtSegmento.setText(lista.get(0).getCo_seg().replaceAll("\\s", ""));
                    vista.TxtVendedor.setText(lista.get(0).getCo_ven().replaceAll("\\s", ""));
                    vista.TxtCiudad.setText(lista.get(0).getCiudad());
                    vista.TxtTelefono.setText(lista.get(0).getTelefonos());
                    vista.TxtContacto.setText(lista.get(0).getRespons());
                    vista.TxtDireccion.setText(lista.get(0).getDirec1());
                    vista.TxtDireccionEntrega.setText(lista.get(0).getDir_ent2());
                    vista.TxtTabulador.setText(lista.get(0).getCo_tab().replaceAll("\\s", ""));
                    vista.txtProntoPago.setText(lista.get(0).getDesc_ppago());
                    vista.txtGlobal.setText(lista.get(0).getDesc_glob());
                    vista.TxtZona2.setText(lista.get(0).getZonaDescripcion());
                    vista.TxtSegmento1.setText(lista.get(0).getSegmentDescripcion());
                    vista.TxtPais2.setText(lista.get(0).getPaisDescripcion());
                    vista.TxtCuenta2.setText(lista.get(0).getCo_cta_in_Descripcion());
                    vista.txtTipoDescripcionCliente.setText(lista.get(0).getTipoClienteDescricion());
                    vista.TxtVendedor1.setText(lista.get(0).getVendedorDdescripcion());
                    vista.TxtTabulador2.setText(lista.get(0).getTabuladorDescripcion());

                    if (lista.get(0).getContrib().toString().equals("0")) {
                        System.out.println("Entrooó");
                        vista.cheContribuyente.setSelected(false);
                        vista.cheContribuyenteEspecial.setSelected(false);
                        vista.cheRetenerDocum.setEnabled(false);
                        vista.TxtRetencion.setEnabled(false);
                    } else {
                        vista.cheContribuyente.setSelected(true);
                        vista.cheContribuyenteEspecial.setSelected(true);
                        vista.cheRetenerDocum.setEnabled(true);
                        vista.TxtRetencion.setEnabled(true);
                        if (lista.get(0).getContribu_e().toString().equals("0")) {
                            vista.cheContribuyenteEspecial.setSelected(false);
                            vista.cheRetenerDocum.setEnabled(false);
                            vista.TxtRetencion.setEnabled(false);
                        } else {
                            vista.cheContribuyenteEspecial.setSelected(true);
                            vista.cheRetenerDocum.setEnabled(true);
                            vista.TxtRetencion.setEnabled(true);
                            vista.TxtRetencion.setText(lista.get(0).getPorc_esp());
                            if (lista.get(0).getRete_regis_doc().equals("1")) {
                                vista.cheRetenerDocum.setSelected(true);
                            }
                        }
                    }
                    if (lista.get(0).getSincredito().equals("0")) {
                        vista.cheSinCredito.setSelected(true);
                        vista.txtMontoLimite.setEnabled(true);
                        vista.txtCod_CondPago.setEnabled(true);
                        vista.txtMontoLimite.setText(lista.get(0).getMont_cre());
                    } else {

                        vista.cheSinCredito.setSelected(false);
                        vista.txtMontoLimite.setEnabled(false);
                        vista.txtCod_CondPago.setEnabled(false);

                    }

                    if (lista.get(0).getLunes().equals("0")) {
                        vista.cheLunes1.setSelected(false);
                    } else {
                        vista.cheLunes1.setSelected(true);
                    }
                    if (lista.get(0).getMartes().equals("0")) {
                        vista.cheMartes.setSelected(false);
                    } else {
                        vista.cheMartes.setSelected(true);
                    }
                    if (lista.get(0).getMiercoles().equals("0")) {
                        vista.cheMiercoles.setSelected(false);
                    } else {
                        vista.cheMiercoles.setSelected(true);
                    }
                    if (lista.get(0).getJueves().equals("0")) {
                        vista.cheJuves.setSelected(false);
                    } else {
                        vista.cheJuves.setSelected(true);
                    }
                    if (lista.get(0).getViernes().equals("0")) {
                        vista.cheViernes.setSelected(false);
                    } else {
                        vista.cheViernes.setSelected(true);
                    }
                    if (lista.get(0).getSabado().equals("0")) {
                        vista.cheSabado.setSelected(false);
                    } else {
                        vista.cheSabado.setSelected(true);
                    }
                    if (lista.get(0).getDomingo().equals("0")) {
                        vista.cheDomingo.setSelected(false);
                    } else {
                        vista.cheDomingo.setSelected(true);
                    }
                    if (lista.get(0).getInactivo().equals("1")) {
                        vista.cheInactivo.setSelected(true);

                    } else {
                        vista.cheInactivo.setSelected(false);

                    }
                    vista.combTipoPersona.setSelectedIndex(Integer.parseInt(lista.get(0).getTipo_per()));
                    vista.txtHoraCaja.setText(lista.get(0).getHorar_caja());
                    vista.txtFrecuencia.setText(lista.get(0).getFrecu_vist());
                    vista.btnGuardar1.setEnabled(false);
                    vista.btnEliminar1.setEnabled(true);
                    vista.btnactulizar.setEnabled(true);
                }
                vista.jDialogClientes.dispose();
            }
        } else if (event.getSource() == vista.btnCancelarCliente) {
            vista.jDialogClientes.dispose();
        } else if (event.getSource() == vista.btnBuscarCliente) {
            reporte = 8;
            cargarDatosClientes(
                    Vistaprincipal.tempEmpresa,
                    "saCliente",
                    "co_cli",
                    "",
                    "2"
            );
            vista.jDialogClientes.setSize(472, 358);
            vista.jDialogClientes.setLocationRelativeTo(null);
            vista.jDialogClientes.setVisible(true);
            vista.txtSimMoneda.setEnabled(false);
            vista.txtDescripcionSimbMoneda.setEnabled(false);
        } else if (event.getSource() == vista.btnImprimir1) {
            vista.ReporteCliente.setSize(610, 450);
            vista.ReporteCliente.setLocationRelativeTo(null);
            vista.ReporteCliente.setVisible(true);
        } else if (event.getSource() == vista.btnAceptarImprimir) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepClienteDatosBasicos.jasper";
                Map parametro = new HashMap();
                String codDesde = vista.txtCodDesde.getText(),
                        codHasta = vista.txtCodHasta.getText(),
                        tipoClienteDesde = vista.txtCodTipoClientDesde.getText(),
                        tipoClienteHasta = vista.txtCodTipoClientHasta.getText(),
                        codZonaDesde = vista.txtCodZonaDesde.getText(),
                        codZonaHasta = vista.txtCodZonaHasta.getText(),
                        codSegmentoDesde = vista.txtCodSegmentoDesde.getText(),
                        codSegmentoHasta = vista.txtCodSegmentoHasta.getText(),
                        codVendedorDesde = vista.txtCodVendedorDesde.getText(),
                        codVendedorHasta = vista.txtCodVendedorHasta.getText(),
                        codPaisDesde = vista.txtCodPaisDesde.getText(),
                        codPaisHasta = vista.txtCodPaisHasta.getText();
                //    nacional = vista.comboNacional.getSelectedItem().toString(),
                //  inactivo = vista.comboInactivo.getSelectedItem().toString(),
                //codSucursalDesde = vista.txtCodSucursalDesde.getText();
                // filtro por Codigo de Proveedor
                if (codDesde.isEmpty() && codHasta.isEmpty()) {
                    codDesde = null;
                    codHasta = null;
                } else if (!codDesde.isEmpty() && codHasta.isEmpty()) {
                    codHasta = null;
                } else if (codDesde.isEmpty() && !codHasta.isEmpty()) {
                    codDesde = null;
                }

                //
                if (tipoClienteDesde.isEmpty() && tipoClienteHasta.isEmpty()) {
                    tipoClienteDesde = null;
                    tipoClienteHasta = null;
                } else if (!tipoClienteDesde.isEmpty() && tipoClienteHasta.isEmpty()) {
                    tipoClienteHasta = null;
                } else if (tipoClienteDesde.isEmpty() && !tipoClienteHasta.isEmpty()) {
                    tipoClienteDesde = null;
                }
                if (codVendedorDesde.isEmpty() && codVendedorHasta.isEmpty()) {
                    codVendedorDesde = null;
                    codVendedorHasta = null;
                } else if (!codVendedorDesde.isEmpty() && codVendedorHasta.isEmpty()) {
                    tipoClienteHasta = null;
                } else if (codVendedorDesde.isEmpty() && !codVendedorHasta.isEmpty()) {
                    codVendedorDesde = null;
                }
                ///Zona
                if (codZonaDesde.isEmpty() && codZonaHasta.isEmpty()) {
                    codZonaDesde = null;
                    codZonaHasta = null;
                } else if (!codZonaDesde.isEmpty() && codZonaHasta.isEmpty()) {
                    codZonaHasta = null;
                } else if (codZonaDesde.isEmpty() && !codZonaHasta.isEmpty()) {
                    codZonaDesde = null;
                }

                //// Segmento  txtCodSegmentoDesde 
                if (codSegmentoDesde.isEmpty() && codSegmentoHasta.isEmpty()) {
                    codSegmentoDesde = null;
                    codSegmentoHasta = null;
                } else if (!codSegmentoDesde.isEmpty() && codSegmentoHasta.isEmpty()) {
                    codSegmentoHasta = null;
                } else if (codSegmentoDesde.isEmpty() && !codSegmentoHasta.isEmpty()) {
                    codSegmentoDesde = null;
                }
                //codPaisDesde
                if (codPaisDesde.isEmpty() && codPaisHasta.isEmpty()) {
                    codPaisDesde = null;
                    codPaisHasta = null;
                } else if (!codPaisDesde.isEmpty() && codPaisHasta.isEmpty()) {
                    codPaisHasta = null;
                } else if (codPaisDesde.isEmpty() && !codPaisHasta.isEmpty()) {
                    codPaisDesde = null;
                }
                String criterio = vista.comboCriterio.getSelectedItem().toString().equals("Descendente") ? "DESC" : "ASC";

                System.out.println("codigo Cliente " + codDesde
                        + " hasta : " + codHasta
                        + " Ven :" + codVendedorDesde
                        + " Hasta :" + codVendedorHasta
                        + ""
                        + ""
                        + ""
                        + "" + codDesde
                );

                parametro.put("sCo_Cli_d", codDesde);
                parametro.put("sCo_Cli_h", codHasta);
                parametro.put("sCo_Ven_d", codVendedorDesde);
                parametro.put("sCo_Ven_h", codVendedorHasta);
                parametro.put("sCo_Tipcli_d", tipoClienteDesde);
                parametro.put("sCo_Tipcli_h", tipoClienteHasta);
                parametro.put("sCo_Zon_d", codZonaDesde);
                parametro.put("sCo_Zon_h", codZonaHasta);
                parametro.put("sCo_Seg_d", codSegmentoDesde);
                parametro.put("sCo_Seg_h", codSegmentoHasta);
                parametro.put("sCo_Pais_d", codPaisDesde);
                parametro.put("sCo_Pais_h", codPaisHasta);
                parametro.put("sCo_Inactivo", null);
                parametro.put("bCo_Inactivo_Filtro", null);
                parametro.put("sCo_Sucursal", null);
                parametro.put("sCampOrderBy", vista.comboOrdenar.getSelectedItem().toString());
                parametro.put("sDir", criterio);
                parametro.put("bHeaderRep", "0");
                JasperReport reportes = null;
                reportes = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                // reporte = (JasperReport) JRLoader.loadObject(getClass().getResource(ruta))   ;
                JasperPrint jprint = JasperFillManager.fillReport(ruta, parametro, conexion.conexions());
                JasperViewer view = new JasperViewer(jprint, false);
                view.setVisible(true);
            } catch (JRException ex) {
                ex.printStackTrace();
            }
        } else if (event.getSource() == vista.btnCancelarDialogCuentaIng) {
            vista.jDialogCtaIng.dispose();
        } else if (event.getSource() == vista.btnCancelarPais) {
            vista.jDialogPais.dispose();
        } else if (event.getSource() == vista.btnCancelarSeg) {
            vista.jDialogSegemento.dispose();
        } else if (event.getSource() == vista.btnCancelarVendedor) {
            vista.jDialogVendedor.dispose();
        } else if (event.getSource() == vista.btnCancelarZona) {
            vista.jDialogZona.dispose();
        } else if (event.getSource() == vista.btnAceptarZona) {
            selection = vista.jtablaZona.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaZona = modelozona.pObtenerListadoDatosZona(Vistaprincipal.tempEmpresa,
                        "saZona",
                        "co_zon",
                        vista.jtablaZona.getValueAt(selection, 0).toString(),
                        "3");
                if (reporte == 17) {
                    vista.TxtZona.setText(listaZona.get(0).getCo_zon().replaceAll("\\s", ""));
                    vista.TxtZona2.setText(listaZona.get(0).getZon_des());
                } else if (reporte == 18) {
                    vista.txtCodZonaDesde.setText(listaZona.get(0).getCo_zon().replaceAll("\\s", ""));
                    vista.txtDescripcionZonaDesde.setText(listaZona.get(0).getZon_des());
                } else if (reporte == 19) {
                    vista.txtCodZonaHasta.setText(listaZona.get(0).getCo_zon().replaceAll("\\s", ""));
                    vista.txtDescripcionZonaHasta.setText(listaZona.get(0).getZon_des());
                }
                vista.jDialogZona.dispose();
            }
        } else if (event.getSource() == vista.btnAceptarCta) {
            selection = vista.jtablaCuentaInEgre.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {

                listaCuentIngE = cuentaInEgreModel.pObtenerListadoDatosCuentaInEgre(
                        Vistaprincipal.tempEmpresa,
                        "saCuentaIngEgr",
                        "co_cta_ingr_egr",
                        vista.jtablaCuentaInEgre.getValueAt(selection, 0).toString(),
                        "3"
                );
                vista.txtCuentIngEgr.setText(listaCuentIngE.get(0).getCo_cta_ingr_egr().replaceAll("\\s", ""));
                vista.jDialogCtaIng.dispose();
            }
        } else if (event.getSource() == vista.btnAceptarVendedor) {
            selection = vista.jtablaVendedor.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaVendedor = vendedorModelo.pObtenerListadoDatos(Vistaprincipal.tempEmpresa,
                        "saVendedor",
                        "co_ven",
                        vista.jtablaVendedor.getValueAt(selection, 0).toString(),
                        "3");

                if (reporte == 2) {
                    vista.txtCodVendedorDesde.setText(listaVendedor.get(0).getCo_ven().replaceAll("\\s", ""));
                    vista.txtDescripcionTVendedorDesde.setText(listaVendedor.get(0).getVen_des());
                } else if (reporte == 3) {
                    vista.txtCodVendedorHasta.setText(listaVendedor.get(0).getCo_ven().replaceAll("\\s", ""));
                    vista.txtDescripcionVendedorHasta.setText(listaVendedor.get(0).getVen_des());
                } else if (reporte == 9) {
                    vista.TxtVendedor.setText(listaVendedor.get(0).getCo_ven().replaceAll("\\s", ""));
                    vista.TxtVendedor1.setText(listaVendedor.get(0).getVen_des());
                    vista.jDialogVendedor.dispose();
                }
                vista.jDialogVendedor.dispose();
            }
        } else if (event.getSource() == vista.btnAceptarSeg) {
            selection = vista.jtablaSegmento.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaSegmento = segementomodelo.pOptenerListadoDatosSegmento(Vistaprincipal.tempEmpresa,
                        "saSegmento",
                        "co_seg",
                        vista.jtablaSegmento.getValueAt(selection, 0).toString(),
                        "3");

                if (reporte == 10) {
                    vista.TxtSegmento.setText(listaSegmento.get(0).getCo_seg().replaceAll("\\s", ""));
                    vista.TxtSegmento1.setText(listaSegmento.get(0).getSeg_des());
                } else if (reporte == 11) {
                    vista.txtCodSegmentoDesde.setText(listaSegmento.get(0).getCo_seg().replaceAll("\\s", ""));
                    vista.txtDescripcionSegmentoDesde.setText(listaSegmento.get(0).getSeg_des());
                } else if (reporte == 12) {
                    vista.txtCodSegmentoHasta.setText(listaSegmento.get(0).getCo_seg().replaceAll("\\s", ""));
                    vista.txtDescripcionSegmentoHasta.setText(listaSegmento.get(0).getSeg_des());

                }
                vista.jDialogSegemento.dispose();
            }
        } else if (event.getSource() == vista.btnAceptarPais) {

            selection = vista.jtablaPais.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaPais = paismosdelo.pObtenerListadoDatos(
                        Vistaprincipal.tempEmpresa,
                        "saPais",
                        "co_Pais",
                        vista.jtablaPais.getValueAt(selection, 0).toString(),
                        "3");

                if (reporte == 13) {
                    vista.TxtPais.setText(listaPais.get(0).getCo_pais().replaceAll("\\s", ""));
                    vista.TxtPais2.setText(listaPais.get(0).getPais_des());
                } else if (reporte == 14) {
                    vista.txtCodPaisDesde.setText(listaPais.get(0).getCo_pais().replaceAll("\\s", ""));
                    vista.txtDescripPaisDesde.setText(listaPais.get(0).getPais_des());
                } else if (reporte == 15) {
                    vista.txtCodPaisHasta.setText(listaPais.get(0).getCo_pais().replaceAll("\\s", ""));
                    vista.txtDescripcionPaisHasta.setText(listaPais.get(0).getPais_des());
                }
                vista.jDialogPais.dispose();
            }
        } else if (event.getSource() == vista.btnAceptarCondicionPag) {
            selection = vista.jtablaCondicionPago.getSelectedRow();

            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaCondicionP = condicionPagoModel.pObtenerListadoDatos(
                        Vistaprincipal.tempEmpresa,
                        "saCondicionPago",
                        "co_cond",
                        vista.jtablaCondicionPago.getValueAt(selection, 0).toString(),
                        "3"
                );

                vista.txtCod_CondPago.setText(listaCondicionP.get(0).getCo_cond().replaceAll("\\s", ""));
                vista.txtDescripcionCondPago.setText(listaCondicionP.get(0).getCond_des());
                vista.txtDias.setText(listaCondicionP.get(0).getDias_cred().replaceAll("\\s", ""));
                vista.jDialogCondicionPago.dispose();
            }
        } else if (event.getSource() == vista.btnAceptarTipoCliente) {
            selection = vista.jtableTipoClientes.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaTipoCliente = tipoClienteModel.pObtenerListadoDatos(
                        Vistaprincipal.tempEmpresa,
                        "saTipoCliente",
                        "tip_cli",
                        vista.jtableTipoClientes.getValueAt(selection, 0).toString(),
                        "3"
                );
                vista.jDialogTipoCliente.dispose();
                if (reporte == 4) {
                    vista.txtTipoCliente.setText(listaTipoCliente.get(0).getTip_cli().replaceAll("\\s", ""));
                    vista.txtTipoDescripcionCliente.setText(listaTipoCliente.get(0).getDes_tipo());
                } else if (reporte == 5) {
                    vista.txtCodTipoClientDesde.setText(listaTipoCliente.get(0).getTip_cli().replaceAll("\\s", ""));
                    vista.txtDescripcionTipoClient.setText(listaTipoCliente.get(0).getDes_tipo());
                } else if (reporte == 6) {
                    vista.txtCodTipoClientHasta.setText(listaTipoCliente.get(0).getTip_cli().replaceAll("\\s", ""));
                    vista.txtDescripcionTipoClientHasta.setText(listaTipoCliente.get(0).getDes_tipo());
                }
            }
        } else if (event.getSource() == vista.btnCancelarTipoCliente) {
            vista.jDialogTipoCliente.dispose();
        } else if (event.getSource() == vista.btnCancelarReporte) {
            vista.ReporteCliente.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtBuscarCliente == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion = "0", sfieldName = "";
                if (vista.jRInicio1.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinal1.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquier1.isSelected()) {
                    Opcion = "2";
                } else if (vista.jrExacta1.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigo1.isSelected()) ? "Co_cli" : "cli_des";
                vista.jtablaCliente.setModel(new ModeloTablaCliente(modelo.pObtenerListadoDatos(
                        Vistaprincipal.tempEmpresa,
                        "saCliente",
                        sfieldName,
                        vista.txtBuscarCliente.getText(),
                        Opcion)));
            }
        } else if (vista.txtValorCuentaInEgre.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion = "0", sfieldName = "";
                if (vista.jRInicioCta.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinalCta.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquierCta.isSelected()) {
                    Opcion = "2";
                } else if (vista.jRexactaCta.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigoCta.isSelected()) ? "co_cta_ingr_egr" : "descrip";
                cargarDatosCuentaIngresoEgreso(
                        Vistaprincipal.tempEmpresa,
                        "saCuentaIngEgr",
                        sfieldName,
                        vista.txtValorCuentaInEgre.getText(),
                        Opcion
                );
            }
        } else if (vista.txtValorSegmento.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion = "0", sfieldName = "";
                if (vista.jRInicioSeg.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinalSeg.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquierSeg.isSelected()) {
                    Opcion = "2";
                } else if (vista.jRexactaSeg.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigoSeg.isSelected()) ? "co_seg" : "seg_des";
                cargarDatosSegmento(Vistaprincipal.tempEmpresa,
                        "saSegmento",
                        sfieldName,
                        vista.txtValorSegmento.getText(),
                        Opcion);
            }

        } else if (vista.txtvalorZona.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion = "0", sfieldName = "";
                if (vista.jRInicioZ.isSelected()) {
                    Opcion = "0";

                } else if (vista.jRFinalZ.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquierZ.isSelected()) {
                    Opcion = "2";
                } else if (vista.jRexactaZ.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigoZ.isSelected()) ? "co_zon" : "zon_des";
                cargarDatosZona(Vistaprincipal.tempEmpresa,
                        "saZona",
                        sfieldName,
                        vista.txtvalorZona.getText(),
                        Opcion);
            }
        } else if (vista.txtValorPais.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion = "0", sfieldName = "";
                if (vista.jRInicioP.isSelected()) {
                    Opcion = "0";

                } else if (vista.jRFinalP.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquierP.isSelected()) {
                    Opcion = "2";
                } else if (vista.jRexactaP.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigoP.isSelected()) ? "co_pais" : "pais_des";
                cargarDatosPais(
                        Vistaprincipal.tempEmpresa,
                        "saPais",
                        sfieldName,
                        vista.txtValorPais.getText(),
                        Opcion);
            }
        } else if (vista.txtBuscartipoCliente.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion = "0", sfieldName = "";
                if (vista.jRInicioP.isSelected()) {
                    Opcion = "0";

                } else if (vista.jRFinalTipClient.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquierTipClient.isSelected()) {
                    Opcion = "2";
                } else if (vista.jRExactaTipoCliente.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigoP.isSelected()) ? "tip_cli" : "des_tipo";
                cargarTipoCliente(
                        Vistaprincipal.tempEmpresa,
                        "saTipoCliente",
                        sfieldName,
                        vista.txtBuscartipoCliente.getText(),
                        Opcion);
            }

        } else if (vista.TxtZona == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 17;
                cargarDatosZona(Vistaprincipal.tempEmpresa, "saZona", "co_zon", "", "2");
                vista.jDialogZona.setSize(472, 358);
                vista.jDialogZona.setLocationRelativeTo(null);
                vista.jDialogZona.setVisible(true);
            }
        } else if (vista.txtCodZonaDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 18;
                cargarDatosZona(Vistaprincipal.tempEmpresa, "saZona", "co_zon", "", "2");
                vista.jDialogZona.setSize(472, 358);
                vista.jDialogZona.setLocationRelativeTo(null);
                vista.jDialogZona.setVisible(true);
            }
        } else if (vista.txtCodZonaHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 19;
                cargarDatosZona(Vistaprincipal.tempEmpresa, "saZona", "co_zon", "", "2");
                vista.jDialogZona.setSize(472, 358);
                vista.jDialogZona.setLocationRelativeTo(null);
                vista.jDialogZona.setVisible(true);
            }
        } else if (vista.txtCodZonaHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 19;
                cargarDatosSegmento(Vistaprincipal.tempEmpresa, "saSegmento", "co_seg", "", "2");
                vista.jDialogSegemento.setSize(472, 358);
                vista.jDialogSegemento.setLocationRelativeTo(null);
                vista.jDialogSegemento.setVisible(true);
            }
        } else if (vista.txtCodSegmentoDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 11;
                cargarDatosSegmento(Vistaprincipal.tempEmpresa, "saSegmento", "co_seg", "", "2");
                vista.jDialogSegemento.setSize(472, 358);
                vista.jDialogSegemento.setLocationRelativeTo(null);
                vista.jDialogSegemento.setVisible(true);

            }
        } else if (vista.txtCodSegmentoHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 12;
                cargarDatosSegmento(Vistaprincipal.tempEmpresa, "saSegmento", "co_seg", "", "2");
                vista.jDialogSegemento.setSize(472, 358);
                vista.jDialogSegemento.setLocationRelativeTo(null);
                vista.jDialogSegemento.setVisible(true);

            }
        } else if (vista.TxtPais == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 13;
                cargarDatosPais(Vistaprincipal.tempEmpresa, "saPais", "co_pais", "", "2");
                vista.jDialogPais.setSize(472, 358);
                vista.jDialogPais.setLocationRelativeTo(null);
                vista.jDialogPais.setVisible(true);
            }
        } else if (vista.txtCodPaisDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 14;
                cargarDatosPais(Vistaprincipal.tempEmpresa, "saPais", "co_pais", "", "2");
                vista.jDialogPais.setSize(472, 358);
                vista.jDialogPais.setLocationRelativeTo(null);
                vista.jDialogPais.setVisible(true);
            }
        } else if (vista.txtCodPaisHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 15;
                cargarDatosPais(Vistaprincipal.tempEmpresa, "saPais", "co_pais", "", "2");
                vista.jDialogPais.setSize(472, 358);
                vista.jDialogPais.setLocationRelativeTo(null);
                vista.jDialogPais.setVisible(true);
            }
        } else if (vista.TxtVendedor == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 9;
                cargarDatosVendedor(Vistaprincipal.tempEmpresa, "saVendedor", "co_ven", "", "2");
                vista.jDialogVendedor.setSize(472, 358);
                vista.jDialogVendedor.setLocationRelativeTo(null);
                vista.jDialogVendedor.setVisible(true);
            }
        } else if (vista.txtCodVendedorDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 2;
                cargarDatosVendedor(Vistaprincipal.tempEmpresa, "saVendedor", "co_ven", "", "2");
                vista.jDialogVendedor.setSize(472, 358);
                vista.jDialogVendedor.setLocationRelativeTo(null);
                vista.jDialogVendedor.setVisible(true);

            }
        } else if (vista.txtCodVendedorHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 3;
                cargarDatosVendedor(Vistaprincipal.tempEmpresa, "saVendedor", "co_ven", "", "2");
                vista.jDialogVendedor.setSize(472, 358);
                vista.jDialogVendedor.setLocationRelativeTo(null);
                vista.jDialogVendedor.setVisible(true);
            }
        } else if (vista.txtCuentIngEgr == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosCuentaIngresoEgreso(Vistaprincipal.tempEmpresa, "saCuentaIngEgr", "co_cta_ingr_egr", "", "2");
                vista.jDialogCtaIng.setSize(472, 358);
                vista.jDialogCtaIng.setLocationRelativeTo(null);
                vista.jDialogCtaIng.setVisible(true);
            }
        } else if (vista.txtCod_CondPago == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosCondicionPago(Vistaprincipal.tempEmpresa,
                        "saCondicionPago",
                        "co_cond",
                        "",
                        "2"
                );
                vista.jDialogCondicionPago.setSize(472, 358);
                vista.jDialogCondicionPago.setLocationRelativeTo(null);
                vista.jDialogCondicionPago.setVisible(true);
            }
        } else if (vista.TxtTabulador == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {

            }
        } else if (vista.txtTipoCliente == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 4;
                cargarTipoCliente(Vistaprincipal.tempEmpresa,
                        "saTipoCliente",
                        "tip_cli",
                        "",
                        "2");
                vista.jDialogTipoCliente.setSize(472, 358);
                vista.jDialogTipoCliente.setLocationRelativeTo(null);
                vista.jDialogTipoCliente.setVisible(true);
            }
        } else if (vista.txtCodTipoClientDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 5;
                cargarTipoCliente(Vistaprincipal.tempEmpresa,
                        "saTipoCliente",
                        "tip_cli",
                        "",
                        "2");
                vista.jDialogTipoCliente.setSize(472, 358);
                vista.jDialogTipoCliente.setLocationRelativeTo(null);
                vista.jDialogTipoCliente.setVisible(true);
            }

        } else if (vista.txtCodTipoClientHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 6;
                cargarTipoCliente(Vistaprincipal.tempEmpresa,
                        "saTipoCliente",
                        "tip_cli",
                        "",
                        "2");
                vista.jDialogTipoCliente.setSize(472, 358);
                vista.jDialogTipoCliente.setLocationRelativeTo(null);
                vista.jDialogTipoCliente.setVisible(true);
            }
        } else if (vista.txtCodDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 6;
                vista.jDialogClientes.setSize(472, 358);
                vista.jDialogClientes.setLocationRelativeTo(null);
                vista.jDialogClientes.setVisible(true);
            }
        } else if (vista.txtCodHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 7;
                vista.jDialogClientes.setSize(472, 358);
                vista.jDialogClientes.setLocationRelativeTo(null);
                vista.jDialogClientes.setVisible(true);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    public void cargarDatosClientes(
            String sDatabase_Nam,
            String sTable_Name,
            String sField_Name,
            String sValor,
            String iOpcion
    ) {
        lista = modelo.pObtenerListadoDatos(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtablaCliente.setModel(new ModeloTablaCliente(lista));

    }

    @Override
    public void stateChanged(ChangeEvent event) {
        if (vista.cheContribuyente.isSelected()) {

            vista.cheContribuyenteEspecial.setEnabled(true);
            vista.cheRetenerDocum.setEnabled(true);
            vista.TxtRetencion.setEnabled(true);
        } else {

            vista.cheContribuyenteEspecial.setEnabled(false);
            vista.cheRetenerDocum.setEnabled(false);
            vista.TxtRetencion.setEnabled(false);
        }

        if (vista.cheContribuyenteEspecial.isSelected()) {
            contribuyenteSpecial = "1";
            vista.cheRetenerDocum.setEnabled(true);
            vista.TxtRetencion.setEnabled(true);
        } else {
            contribuyenteSpecial = "0";
            vista.TxtRetencion.setText("00");
            vista.cheRetenerDocum.setEnabled(false);
            vista.TxtRetencion.setEnabled(false);

        }
        if (vista.cheSinCredito.isSelected()) {
            vista.txtMontoLimite.setEnabled(false);
            vista.txtCod_CondPago.setEnabled(false);
            vista.txtDescripcionCondPago.setEnabled(false);
        } else if (!vista.cheSinCredito.isSelected()) {
            vista.txtMontoLimite.setEnabled(true);
            vista.txtCod_CondPago.setEnabled(true);
            vista.txtDescripcionCondPago.setEnabled(true);

        }
    }

    public void cargarDatosZona(String sDatabase_Nam, String sTable_Name, String sField_Name, String sValor, String iOpcion) {
        modelozona = new ZonaModel();
        listaZona = modelozona.pObtenerListadoDatosZona(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtablaZona.setModel(new ModeloTablaZona(listaZona));
    }

    public void cargarDatosSegmento(String sDatabase_Nam, String sTable_Name, String sField_Name, String sValor, String iOpcion) {
        segementomodelo = new SegmentoModelo();
        listaSegmento = segementomodelo.pOptenerListadoDatosSegmento(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtablaSegmento.setModel(new ModeloTablaSegmento(listaSegmento));
    }

    public void cargarDatosPais(String sDatabase_Nam, String sTable_Name, String sField_Name, String sValor, String iOpcion) {
        paismosdelo = new PaisModel();
        listaPais = paismosdelo.pObtenerListadoDatos(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtablaPais.setModel(new ModeloTablaPais(listaPais));
    }

    public void cargarDatosVendedor(String sDatabase_Nam, String sTable_Name, String sField_Name, String sValor, String iOpcion) {

        vendedorModelo = new VendedorModelo();
        listaVendedor = vendedorModelo.pObtenerListadoDatos(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtablaVendedor.setModel(new ModeloTablaVendedor(listaVendedor));
    }

    public void cargarDatosCuentaIngresoEgreso(String sDatabase_Nam, String sTable_Name, String sField_Name, String sValor, String iOpcion) {
        cuentaInEgreModel = new CuentaInEgreModel();
        listaCuentIngE = new ArrayList<>();
        listaCuentIngE = cuentaInEgreModel.pObtenerListadoDatosCuentaInEgre(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtablaCuentaInEgre.setModel(new ModelTablaCuentaInEgre(listaCuentIngE));
    }

    public void cargarDatosCondicionPago(String sDatabase_Nam, String sTable_Name, String sField_Name, String sValor, String iOpcion) {
        condicionPagoModel = new CondicionPagoModel();
        listaCondicionP = condicionPagoModel.pObtenerListadoDatos(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtablaCondicionPago.setModel(new ModeloTablaCoindicionPago(listaCondicionP));
    }

    public void cargarTipoCliente(String sDatabase_Nam, String sTable_Name, String sField_Name, String sValor, String iOpcion) {
        tipoClienteModel = new TipoClienteModelo();
        listaTipoCliente = tipoClienteModel.pObtenerListadoDatos(sDatabase_Nam, sTable_Name, sField_Name, sValor, iOpcion);
        vista.jtableTipoClientes.setModel(new ModeloTablaTipoCliente(listaTipoCliente));
    }
}
