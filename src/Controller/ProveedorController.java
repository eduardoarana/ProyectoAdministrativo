/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.CondicionPagoBO;
import Beans.CuentaInEgreBO;
import Beans.PaisBO;
import Beans.ProveedorBO;
import Beans.SegmentoBO;
import Beans.SucursalBO;
import Beans.TipoProveedorBO;
import Beans.ZonaBO;
import Conection.Conexion;
import Model.CondicionPagoModel;
import Model.CuentaInEgreModel;
import Model.ModelTablaCuentaInEgre;
import Model.ModeloTablaCoindicionPago;
import Model.ModeloTablaPais;
import Model.ModeloTablaSegmento;
import Model.ModeloTablaSucursal;
import Model.ModeloTablaTipoProveedor;
import Model.ModeloTablaZona;
import Model.PaisModel;
import Model.ProveedorModel;
import Model.SegmentoModelo;
import Model.SucursalModelo;
import Model.TipoProveedorModelo;
import Model.ZonaModel;
import Vista.VistaMoneda;
import Vista.VistaProveedor;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static Vista.Vistaprincipal.lblNombreEmpresa;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Desarrollo
 */
public class ProveedorController implements ActionListener, KeyListener {

    VistaProveedor vista;
    ProveedorModel modelo;
    ZonaModel modeloZona;
    SegmentoModelo modeloSegmento;
    PaisModel modeloPais;
    Model.CondicionPagoModel modeloCondicionPago;
    public Conexion conexion;

    CuentaInEgreModel cuentaInEgreModel;
    TipoProveedorModelo tipoProveedorModelo;
    ArrayList<ProveedorBO> listaProveedor;
    ArrayList<ZonaBO> listaZona;
    ArrayList<TipoProveedorBO> listaTipoProv;
    ArrayList<SegmentoBO> listaSegmento;
    ArrayList<CuentaInEgreBO> listaCuentaInEgre;
    ArrayList<PaisBO> listaPais;
    ArrayList<CondicionPagoBO> listaCondicionPag;
    ArrayList<SucursalBO> listaSucursal;
    SucursalModelo sucursalModelo;
    public int reporte = 0;
    int selection = 0;

    public ProveedorController(VistaProveedor vista) {
        this.vista = vista;
        modelo = new ProveedorModel();
        modeloZona = new ZonaModel();
        modeloSegmento = new SegmentoModelo();
        tipoProveedorModelo = new TipoProveedorModelo();
        cuentaInEgreModel = new CuentaInEgreModel();
        listaProveedor = new ArrayList<ProveedorBO>();
        listaTipoProv = new ArrayList<TipoProveedorBO>();
        listaZona = new ArrayList<ZonaBO>();
        listaSegmento = new ArrayList<SegmentoBO>();
        listaCuentaInEgre = new ArrayList<>();
        modeloPais = new PaisModel();
        listaPais = new ArrayList<PaisBO>();
        modeloCondicionPago = new CondicionPagoModel();
        sucursalModelo = new SucursalModelo();

        listaCondicionPag = new ArrayList<>();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;

        if (event.getSource() == this.vista.btnGuardar) {

            if (vista.txtcodigoProveedor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vista, "El campo Proveedor no puede estar vacio ", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            int validarExixtencia = Utilitarios.Utilitario.validarRegistro(modelo.con, "co_prov", lblNombreEmpresa.getText(), "saProveedor", "co_prov", vista.txtcodigoProveedor.getText());
            if (validarExixtencia == 1) {
                JOptionPane.showMessageDialog(new JFrame(), "Ya existe el registro con el mismo codigo", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String nacional = (vista.cheNacional.isSelected()) ? "1" : "0";
            String ianctivo = vista.jinactivo.isSelected() ? "1" : "0";

            String sujetoRetencioAutomati = (vista.jretencionAutomatico.isSelected()) ? "1" : "0";

            ProveedorBO proveedorBO = new ProveedorBO();
            resultado = modelo.pInsertarProveedor(
                    vista.txtcodigoProveedor.getText(),
                    vista.txtDescripcionProveedor.getText(),
                    vista.txtCod_segmento.getText(),
                    vista.txtCod_zona.getText(),
                    ianctivo,
                    vista.txtdireccion.getText(),//direccion 1
                    vista.txtdireccion.getText(),//sDirec2
                    vista.txttelefono.getText(),//telefon
                    vista.txttelefono.getText(),//fax
                    "2", // respons
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaIngres),//sdFecha_reg
                    vista.txtcod_tipo.getText(),// sTip_Pro
                    vista.txtmontocre.getText(), //deMont_cre
                    vista.txtcod_mone.getText(), //sCo_Mone,
                    vista.txtCod_condPago.getText(),//condPag
                    "0",// iPlaz_pag
                    vista.txtdescuPago.getText(),//deDesc_ppago
                    vista.txtDescGlobal.getText(),//deDesc_Glob
                    vista.txtrif.getText(),//sRif
                    nacional,
                    null,//sDis_cen
                    vista.txtNit.getText(),//nit 
                    vista.txtEmail.getText(),//sEmail
                    vista.txtcodCtaIngEgr.getText(), //sCo_Cta_Ingr_Egr
                    "comewntario", //sComentario
                    "1", //iTipo_Adi
                    "1",//Matriz
                    vista.txtCodTabISLR.getText(), //sCo_Tab
                    "90", //tipo persona
                    vista.txtcod_pais.getText(),//sCo_pais 
                    vista.txtCiudad.getText(),//sCiudad
                    "0", //sZip 
                    "0", //sFormType
                    "020", //sTaxid
                    "88", //bContribu_E
                    "9", // bRete_Regis_Doc
                    "00",//dePorc_Esp
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    null,
                    null,
                    null, null, null, null,
                    Vistaprincipal.lblNombreUsuario1.getText(),//sCo_Us_In
                    Vistaprincipal.lblNombreSucursal.getText(), //sCo_Sucu_In
                    Utilitarios.Utilitario.nombreHost(),
                    "0", //revisado
                    "1",//sTrasnfe
                    "12",//sTgasto
                    "2", //sTComp
                    vista.txtemailAltern.getText(),
                    sujetoRetencioAutomati);

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente",
                        "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }
        } else if (event.getSource() == this.vista.btnactulizar) {
            String nacional = vista.cheNacional.isSelected() ? "1" : "0",
                    Sujeto_Obj_RetenISLR_Auto = vista.jretencionAutomatico.isSelected() ? "1" : "0",
                    inactiv = vista.jinactivo.isSelected() ? "1" : "0";

            resultado = modelo.pActualizarProveedor(
                    vista.txtcodigoProveedor.getText(),
                    vista.txtcodigoProveedor.getText(),
                    vista.txtDescripcionProveedor.getText(),
                    vista.txtCod_segmento.getText(),
                    vista.txtCod_zona.getText(),
                    inactiv, vista.txtdireccion.getText(),
                    vista.txtdireccion.getText(),
                    vista.txttelefono.getText(),
                    "", "1",
                    Utilitarios.Utilitario.obtenerFecha(vista.fechaIngres),
                    vista.txtcod_tipo.getText(), vista.txtmontocre.getText(), vista.txtcod_mone.getText(),
                    vista.txtCod_condPago.getText(),
                    "0",
                    vista.txtdescuPago.getText(),
                    vista.txtDescGlobal.getText(), vista.txtrif.getText(), nacional/*Nacional*/, "dicen", vista.txtNit.getText(), vista.txtEmail.getText(),
                    vista.txtcodCtaIngEgr.getText(), "comentario", "1" /*iTipo_Adi*/, "1", vista.txtCodTabISLR.getText()/*sCo_Tab*/,
                    vista.jctipoPersona.getSelectedItem().toString()/*Tipo_Per*/,
                    vista.txtcod_pais.getText(), vista.txtCiudad.getText(), "1"/*ZIP*/,
                    ""/*sWebSite*/,
                    "1",
                    "1"/*taxiid*/,
                    "1"/*bContribu_E*/, "0"/*bRete_Regis_Doc*/,
                    "0"/*dePorc_Esp*/, vista.txtCampo1.getText(), vista.txtcampo2.getText(), null, null, null, "", "", "",
                    Vistaprincipal.lblNombreUsuario1.getText(),
                    Vistaprincipal.lblNombreSucursal.getText(),
                    Utilitarios.Utilitario.nombreHost(), "1", "1", "1", "1", vista.txtemailAltern.getText(), Sujeto_Obj_RetenISLR_Auto);

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }

        } else if (event.getSource() == this.vista.btnEliminar) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarProveedor(vista.txtcodigoProveedor.getText(),
                        Utilitarios.Utilitario.nombreHost(),
                        Vistaprincipal.lblNombreUsuario1.getText(), //co_usu_mo
                        Vistaprincipal.lblNombreSucursal.getText()// "su_cu_mo"
                );
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.settearCampos();
                }
            } else {
                return;
            }
        } else if (event.getSource() == this.vista.btnNuevo) {
            vista.settearCampos();

        } else if (event.getSource() == this.vista.btnImprimir) {

            vista.jDialogReporteProveedor.setSize(600, 450);
            vista.jDialogReporteProveedor.setLocationRelativeTo(null);
            vista.jDialogReporteProveedor.setVisible(true);

        } else if (event.getSource().equals(vista.btnAceptarImprimir)) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepProveedorDatosBasicos.jasper";
                Map parametro = new HashMap();
                String codDesde = vista.txtCodDesde.getText(),
                        codHasta = vista.txtCodHasta.getText(),
                        tipoProveeDesde = vista.txtCodTipoProveesorDesde.getText(),
                        tipoProveeHasta = vista.txtCodTipoProveedorHasta.getText(),
                        codZonaDesde = vista.txtCodZonaDesde.getText(),
                        codZonaHasta = vista.txtCodZonaHasta.getText(),
                        codSegmentoDesde = vista.txtCodSegmentoDesde.getText(),
                        codSegmentoHasta = vista.txtCodSegmentoHasta.getText(),
                        nacional = vista.comboNacional.getSelectedItem().toString(),
                        inactivo = vista.comboInactivo.getSelectedItem().toString(),
                        codSucursalDesde = vista.txtCodSucursalDesde.getText();
                // filtro por Codigo de Proveedor
                if (codDesde.isEmpty() && codHasta.isEmpty()) {
                    codDesde = null;
                    codHasta = null;
                } else if (!codDesde.isEmpty() && codHasta.isEmpty()) {
                    codHasta = null;
                } else if (codDesde.isEmpty() && !codHasta.isEmpty()) {
                    codDesde = null;
                }
                //filtro por Tipo de  Proveedor 
                if (tipoProveeDesde.isEmpty() && tipoProveeHasta.isEmpty()) {
                    tipoProveeDesde = null;
                    tipoProveeHasta = null;
                } else if (!tipoProveeDesde.isEmpty() && tipoProveeHasta.isEmpty()) {
                    tipoProveeHasta = null;
                } else if (tipoProveeDesde.isEmpty() && !tipoProveeHasta.isEmpty()) {
                    tipoProveeDesde = null;
                }

                //   filtro por Zona
                if (codZonaDesde.isEmpty() && codZonaHasta.isEmpty()) {
                    codZonaDesde = null;
                    codZonaHasta = null;
                } else if (!codZonaDesde.isEmpty() && codZonaHasta.isEmpty()) {
                    codZonaHasta = null;
                } else if (codZonaDesde.isEmpty() && !codZonaHasta.isEmpty()) {
                    codZonaDesde = null;
                }

                if (codSucursalDesde.isEmpty()) {
                    codSucursalDesde = null;
                }

                // Filtrar Por Segmento
                if (codSegmentoDesde.isEmpty() && codSegmentoHasta.isEmpty()) {
                    codSegmentoDesde = null;
                    codSegmentoHasta = null;
                } else if (!codSegmentoDesde.isEmpty() && codSegmentoHasta.isEmpty()) {
                    codSegmentoDesde = null;
                } else if (codSegmentoDesde.isEmpty() && !codSegmentoHasta.isEmpty()) {
                    codSegmentoDesde = null;
                }

                if (nacional.isEmpty()) {
                    nacional = null;
                }
                if (inactivo.isEmpty()) {
                    inactivo = null;
                }

                String criterio = vista.comboCriterio.getSelectedItem().toString().equals("Descendente") ? "DESC" : "ASC";
                System.out.println(""
                        + "Cod Proveedor Desde :: " + codDesde
                        + "Cod Proveedor Hasta :: " + codHasta
                        + "Zona Desde :: " + codZonaDesde
                        + "Zona Hasta ::" + codZonaHasta
                        + "Tipo Proveedor  Desde::" + tipoProveeDesde
                        + "Tipo Proveedor Hast :: " + tipoProveeHasta
                        + "Segmento :: " + codSegmentoDesde
                        + "Segmento Hasta ::" + codSegmentoHasta
                        + "Naciona ::" + nacional
                        + "inactivo ::" + inactivo
                        + "Sucursal ::" + codSucursalDesde
                );

                parametro.put("sCo_Prov_d", codDesde);
                parametro.put("sCo_Prov_h", codHasta);
                parametro.put("sCo_TipPro_d", tipoProveeDesde);
                parametro.put("sCo_TipPro_h", tipoProveeHasta);
                parametro.put("sCo_Zon_d", codZonaDesde);
                parametro.put("sCo_Zon_h", codZonaHasta);
                parametro.put("sCo_Seg_d", codSegmentoDesde);
                parametro.put("sCo_Seg_h", codSegmentoHasta);
                parametro.put("sCo_Nacional", null);
                parametro.put("sCo_Inactivo", null);
                parametro.put("bCo_Inactivo_Filtro", null);
                parametro.put("sCo_Sucursal", codSucursalDesde);
                parametro.put("sCampOrderBy", vista.comboOrdenar.getSelectedItem().toString());
                parametro.put("sDir", criterio);
                parametro.put("bHeaderRep", "0");
                JasperReport reporte = null;
                reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
                // reporte = (JasperReport) JRLoader.loadObject(getClass().getResource(ruta))   ;
                JasperPrint jprint = JasperFillManager.fillReport(ruta, parametro, conexion.conexions());
                JasperViewer view = new JasperViewer(jprint, false);
                view.setVisible(true);
            } catch (JRException ex) {
                ex.printStackTrace();
            }
        } //Cuando selecciona un  Proveedor para Modificarlo o Eliminar el Registro  btnAceptarDialoPro 
        else if (event.getSource().equals(vista.btnAceptarDialoPro)) {
            int selection = vista.jtablaProveedores.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Proveedor", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            listaProveedor = modelo.pObtenerListadoDatosProveedor(
                    lblNombreEmpresa.getText(),
                    "co_prov",
                    vista.jtablaProveedores.getValueAt(selection, 0).toString().replaceAll("\\s", ""),//Valor
                    "0",
                    "1",
                    "0",
                    "0",
                    "0",
                    "",
                    "",
                    /*Fecha_desde*/ "",
                    /*Fecha_hasta*/ "",
                    /*@bAplica_Tipo*/ "0",
                    /*@sTipo*/ "0",
                    /*bAplica_RIF*/ "0",
                    /*sRIF*/ "",
                    /*bAlica_Zona*/ "0",
                    /*sTipo_Zona*/ "",
                    /*bAplica_Segmento*/ "0",
                    /*sSegmento*/ "",
                    /*bAplica_Cta_ing*/ "0",
                    /*sCta_ing*/ "",
                    /*@iOpcion*/ "3"
            );
            if (listaProveedor.get(0).getNacional().equals("1")) {
                vista.cheNacional.setSelected(true);
            } else {
                vista.cheNacional.setSelected(false);
            }
            if (listaProveedor.get(0).getInactivo().equals("1")) {
                vista.jinactivo.setSelected(true);
            } else {
                vista.jinactivo.setSelected(false);
            }
            if (reporte == 2) {
                vista.txtCodDesde.setText(listaProveedor.get(0).getCo_prov().replaceAll("\\s", ""));
                vista.txtDescripDesde.setText(listaProveedor.get(0).getProv_des());
            } else if (reporte == 3) {
                vista.txtCodHasta.setText(listaProveedor.get(0).getCo_prov().replaceAll("\\s", ""));
                vista.txtDescripHasta.setText(listaProveedor.get(0).getProv_des());
            } else if (reporte == 1) {

                vista.txtcodigoProveedor.setText(listaProveedor.get(0).getCo_prov().replaceAll("\\s", ""));
                vista.txtDescripcionProveedor.setText(listaProveedor.get(0).getProv_des());
                vista.txtrif.setText(listaProveedor.get(0).getRif());
                vista.txtNit.setText(listaProveedor.get(0).getNit());
                vista.txtcod_tipo.setText(listaProveedor.get(0).getTip_pro().replaceAll("\\s", ""));
                vista.txtdes_tipoProvee.setText(tipoProveedorModelo.pObtenerListadoDatosProveedor(lblNombreEmpresa.getText(),
                        "saTipoProveedor", "tip_pro", listaProveedor.get(0).getTip_pro(), "3").get(0).getDes_tipo());
                vista.txtcodCtaIngEgr.setText(listaProveedor.get(0).getCo_zon().replaceAll("\\s", ""));

                //optiene la descripcion del segmento cuando selelcciona un Proveedor . lo busca por el Codigo del
                //segmento..
                vista.txtCod_segmento.setText(listaProveedor.get(0).getCo_seg().replaceAll("\\s", ""));
                vista.txtDes_Segmento.setText(modeloSegmento.pOptenerListadoDatosSegmento(lblNombreEmpresa.getText(),
                        "saSegmento", "co_seg", listaProveedor.get(0).getCo_seg().replaceAll("\\s", ""), "3").get(0).getSeg_des());

                // optiene la descripcion Cuenta Ingresso de la tabla ,  
                vista.txtcodCtaIngEgr.setText(listaProveedor.get(0).getCo_cta_ingr_egr().replaceAll("\\s", ""));
                vista.txtDes_ctaIngEgr.setText(cuentaInEgreModel.pObtenerListadoDatosCuentaInEgre(lblNombreEmpresa.getText(),
                        "saCuentaIngEgr", "co_cta_ingr_egr", listaProveedor.get(0).getCo_cta_ingr_egr().replaceAll("\\s", ""), "3").get(0).getDescrip());

                vista.txtCiudad.setText(listaProveedor.get(0).getCiudad());
                vista.txtcod_pais.setText(listaProveedor.get(0).getCo_pais().replaceAll("\\s", ""));
                vista.txtdes_pais.setText(modeloPais.pObtenerListadoDatos(lblNombreEmpresa.getText(), "saPais", "co_pais", listaProveedor.get(0).getCo_pais().replaceAll("\\s", ""), "3").get(0).getPais_des());

                vista.txttelefono.setText(listaProveedor.get(0).getTelefonos());
                vista.txtEmail.setText(listaProveedor.get(0).getEmail());
                vista.txtemailAltern.setText(listaProveedor.get(0).getEmail_alterno());
                vista.txtdireccion.setText(listaProveedor.get(0).getDirec1());
                vista.txtmontocre.setText(listaProveedor.get(0).getMont_cre());
                vista.txtCod_condPago.setText(listaProveedor.get(0).getCond_pag());
                vista.txtdescripCodPago.setText(modeloCondicionPago.pObtenerListadoDatos(lblNombreEmpresa.getText(), "saCondicionPago", "co_cond",
                        listaProveedor.get(0).getCond_pag().replaceAll("\\s", ""), "3").get(0).getCond_des());
                vista.txtdias.setText(modeloCondicionPago.pObtenerListadoDatos(lblNombreEmpresa.getText(), "saCondicionPago", "co_cond",
                        listaProveedor.get(0).getCond_pag().replaceAll("\\s", ""), "3").get(0).getDias_cred());

                vista.txtdescuPago.setText(listaProveedor.get(0).getDesc_ppago());
                vista.txtDescGlobal.setText(listaProveedor.get(0).getDesc_glob());
                vista.jctipoPersona.setSelectedItem(listaProveedor.get(0).getTipo_per());
                vista.txtCodTabISLR.setText(listaProveedor.get(0).getCo_tab().replaceAll("\\s", ""));
                vista.txtContacto.setText(listaProveedor.get(0).getRespons());
                vista.txtCod_zona.setText(listaProveedor.get(0).getCo_zon().replaceAll("\\s", ""));

                vista.txtDes_zona.setText(modeloZona.pObtenerListadoDatosZona("ADMIN_A", "saZona", "co_zon",
                        listaProveedor.get(0).getCo_zon().replaceAll("\\s", ""), "3").get(0).getZon_des());

                if (listaProveedor.get(0).getSujeto_obj_retenISLR_auto().equals("0")) {
                    vista.jretencionAutomatico.setSelected(false);
                } else {
                    vista.jretencionAutomatico.setSelected(true);
                }
                if (listaProveedor.get(0).getRete_regis_doc().equals("0")) {
                    vista.jsujReteIVA.setSelected(false);
                } else {
                    vista.jsujReteIVA.setSelected(true);
                }
                vista.txtRetencion.setText(listaProveedor.get(0).getRete_regis_doc().replaceAll("\\s", ""));
                vista.fechaIngres.setDate(Utilitarios.Utilitario.obtenerFecha(listaProveedor.get(0).getFecha_reg()));
            }
            vista.JDialogProveedor.dispose();
        } else if (event.getSource().equals(vista.btnCancelar)) {
            vista.JDialogProveedor.dispose();
        } else if (event.getSource().equals(vista.btnJDialogZonaAceptar)) {
            selection = vista.jtablaZona.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar una Zona", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            listaZona = modeloZona.pObtenerListadoDatosZona(lblNombreEmpresa.getText(), "saZona", "co_zon",
                    vista.jtablaZona.getValueAt(selection, 0).toString(),
                    "3");
            if (reporte == 13) {
                vista.txtCod_zona.setText(listaZona.get(0).getCo_zon().replaceAll("\\s", ""));
                vista.txtDes_zona.setText(listaZona.get(0).getZon_des());
            } else if (reporte == 8) {
                vista.txtCodZonaDesde.setText(listaZona.get(0).getCo_zon().replaceAll("\\s", ""));
                vista.txtDescripcionZonaDesde.setText(listaZona.get(0).getZon_des());
            } else if (reporte == 9) {
                vista.txtCodZonaHasta.setText(listaZona.get(0).getCo_zon().replaceAll("\\s", ""));
                vista.txtDescripcionZonaHasta.setText(listaZona.get(0).getZon_des());
            }
            vista.jDialogZona.dispose();
        } else if (event.getSource().equals(vista.btnJDialogZonaCancelar)) {
            vista.txtvalorZona.setText("");
            vista.jDialogZona.dispose();
        } else if (event.getSource().equals(vista.AceptarDialogoTipProv)) {
            selection = vista.jtablaTipo.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Tipo Proveedor", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            listaTipoProv = tipoProveedorModelo.pObtenerListadoDatosProveedor(lblNombreEmpresa.getText(), "saTipoProveedor",
                    "tip_pro", vista.jtablaTipo.getValueAt(selection, 0).toString(), "3");
            if (reporte == 16) {
                vista.txtcod_tipo.setText(listaTipoProv.get(0).getTip_pro().replaceAll("\\s", ""));
                vista.txtdes_tipoProvee.setText(listaTipoProv.get(0).getDes_tipo());
            } else if (reporte == 6) {
                vista.txtCodTipoProveesorDesde.setText(listaTipoProv.get(0).getTip_pro().replaceAll("\\s", ""));
                vista.txtDescripcionTipoProveeDesde.setText(listaTipoProv.get(0).getDes_tipo());
            } else if (reporte == 7) {
                vista.txtCodTipoProveedorHasta.setText(listaTipoProv.get(0).getTip_pro().replaceAll("\\s", ""));
                vista.txtDescripcionTipoProveeHasta.setText(listaTipoProv.get(0).getDes_tipo());
            }

            vista.jDialogTipoprovee.dispose();
        } else if (event.getSource().equals(vista.btnCancelarTipoProv)) {
            vista.jDialogTipoprovee.dispose();
        } else if (event.getSource().equals(vista.btnAceptarSegmento)) {
            selection = vista.jtablaSegmento.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Segmento", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            listaSegmento = modeloSegmento.pOptenerListadoDatosSegmento(lblNombreEmpresa.getText(), "sasegmento",
                    "co_seg",
                    vista.jtablaSegmento.getValueAt(selection, 0).toString(),
                    "3");
            if (reporte == 14) {
                vista.txtCod_segmento.setText(listaSegmento.get(0).getCo_seg().replaceAll("\\s", ""));
                vista.txtDes_Segmento.setText(listaSegmento.get(0).getSeg_des());

            } else if (reporte == 10) {
                vista.txtCodSegmentoDesde.setText(listaSegmento.get(0).getCo_seg().replaceAll("\\s", ""));
                vista.txtDescripcionSegmentoDesde.setText(listaSegmento.get(0).getSeg_des());

            } else if (reporte == 11) {
                vista.txtCodSegmentoHasta.setText(listaSegmento.get(0).getCo_seg().replaceAll("\\s", ""));
                vista.txtDescripcionSegmentoHasta.setText(listaSegmento.get(0).getSeg_des());
            }
            vista.jDialogoSegmento.dispose();
        } else if (event.getSource().equals(vista.btnCancelarSegmento)) {
            vista.jDialogoSegmento.dispose();
        } else if (event.getSource().equals(vista.btnAceptarDialogoCuentaInEgre)) {
            selection = vista.jtablaCuentaInEgre.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            listaCuentaInEgre = cuentaInEgreModel.pObtenerListadoDatosCuentaInEgre(lblNombreEmpresa.getText(),
                    "saCuentaIngEgr", "co_cta_ingr_egr",
                    vista.jtablaCuentaInEgre.getValueAt(selection, 0).toString(),
                    "3");
            vista.txtcodCtaIngEgr.setText(listaCuentaInEgre.get(0).getCo_cta_ingr_egr().replaceAll("\\s", ""));
            vista.txtDes_ctaIngEgr.setText(listaCuentaInEgre.get(0).getDescrip());
            vista.jDialogCuentaInEgre.dispose();
        } else if (event.getSource().equals(vista.btnAceptarPais)) {
            selection = vista.jtablaPais.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            listaPais = modeloPais.pObtenerListadoDatos(lblNombreEmpresa.getText(), "saPais",
                    "co_pais",
                    vista.jtablaPais.getValueAt(selection, 0).toString(), "3");
            vista.txtcod_pais.setText(listaPais.get(0).getCo_pais().replaceAll("\\s", ""));
            vista.txtdes_pais.setText(listaPais.get(0).getPais_des());
            vista.jDialogPais.dispose();
        } else if (event.getSource().equals(vista.btnCancelarPais)) {
            vista.jDialogPais.dispose();
        } else if (event.getSource() == this.vista.btnAceptarCondicionPag) {
            selection = vista.jtablaCondicionPago.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar una Condicion de Pago", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            listaCondicionPag = modeloCondicionPago.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                    "saCondicionPago", "co_cond",
                    vista.jtablaCondicionPago.getValueAt(selection, 0).toString(),
                    "3");

            vista.txtCod_condPago.setText(listaCondicionPag.get(0).getCo_cond().replaceAll("\\s", ""));
            vista.txtdescripCodPago.setText(listaCondicionPag.get(0).getCond_des());
            vista.txtdias.setText(listaCondicionPag.get(0).getDias_cred());
            vista.jDialogCondcionPago.dispose();
        } else if (event.getSource() == this.vista.btnCancelarCondicionPag) {
            vista.jDialogCondcionPago.dispose();
        } else if (event.getSource() == this.vista.btnCancelarCuentaInEgr) {
            vista.jDialogCuentaInEgre.dispose();
        } else if (event.getSource() == this.vista.btnAceptarSucursal) {
            selection = vista.jtableSucursal.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Proveedor", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            listaSucursal = sucursalModelo.pObtenerListadoDatos(
                    Vistaprincipal.tempEmpresa,
                    "saSucursal",
                    "co_sucur",
                    vista.jtableSucursal.getValueAt(selection, 0).toString().replaceAll("\\s", ""),//Valor,
                    "3");
            vista.txtCodSucursalDesde.setText(listaSucursal.get(0).getCo_sucur().toString().replaceAll("\\s", ""));
            vista.txtDescripcionSucursal1.setText(listaSucursal.get(0).getSucur_des());
            vista.jDialogSucursal.dispose();
        } 
        else if (event.getSource() == this.vista.btnCancelarSucursal) {
         vista.jDialogSucursal.dispose();
        }else if (event.getSource() == this.vista.btnCancelarReporte) {
            vista.jDialogReporteProveedor.dispose();
        }
        
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //System.err.println("KeyEvent ke");
        // System.out.println("Evento :  "+ KeyEvent.getKeyText(ke.getKeyCode()));
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int i = 0;
        if (i == 0) {
            if (vista.txtCod_zona == ke.getSource()) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    setModelZona();
                    reporte = 13;
                    vista.jDialogZona.setVisible(true);
                    vista.jDialogZona.setSize(472, 358);
                    vista.jDialogZona.setLocationRelativeTo(null);
                    i = 0;
                }
            } else if (vista.txtCod_segmento == ke.getSource()) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    setModeSegmento();
                    reporte = 14;
                    vista.jDialogoSegmento.setVisible(true);
                    vista.jDialogoSegmento.setSize(472, 358);
                    vista.jDialogoSegmento.setLocationRelativeTo(null);
                    i = 0;
                }
            } else if (vista.txtValorSegmento == ke.getSource()) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    String Opcion = "0", sfieldName = "";
                    if (vista.jRInicio3.isSelected()) {
                        Opcion = "0";
                    } else if (vista.jRFinal3.isSelected()) {
                        Opcion = "1";
                    } else if (vista.jrCualquier3.isSelected()) {
                        Opcion = "2";
                    } else if (vista.jRexacta3.isSelected()) {
                        Opcion = "3";
                    }
                    sfieldName = (vista.jrCodigo3.isSelected()) ? "co_seg" : "seg_des";
                    vista.jtablaSegmento.setModel(new ModeloTablaSegmento(modeloSegmento.pOptenerListadoDatosSegmento(
                            lblNombreEmpresa.getText(),
                            "saSegmento",
                            sfieldName,
                            vista.txtValorSegmento.getText(),
                            Opcion
                    )));

                }
            } else if (vista.txtcodCtaIngEgr == ke.getSource()) { //
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    setModelCuentaIngre();
                    vista.jDialogCuentaInEgre.setSize(472, 358);
                    vista.jDialogCuentaInEgre.setVisible(true);
                    vista.jDialogCuentaInEgre.setLocationRelativeTo(null);

                }
                System.out.println("evento teclado");
            } else if (vista.txtcod_pais.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    setModelPais();
                    vista.jDialogPais.setSize(472, 358);
                    vista.jDialogPais.setVisible(true);
                    vista.jDialogPais.setLocationRelativeTo(null);

                }
            } else if (vista.txtValorCuentaInEgre.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    String Opcion4 = "0", sfieldName4 = "";
                    if (vista.jRInicio4.isSelected()) {
                        Opcion4 = "0";
                    } else if (vista.jRFinal4.isSelected()) {
                        Opcion4 = "1";
                    } else if (vista.jrCualquier4.isSelected()) {
                        Opcion4 = "2";
                    } else if (vista.jRexacta4.isSelected()) {
                        Opcion4 = "3";
                    }
                    sfieldName4 = (vista.jrCodigo.isSelected()) ? "co_cta_ingr_egr" : "descrip";
                    vista.jtablaCuentaInEgre.setModel(new ModelTablaCuentaInEgre(cuentaInEgreModel.pObtenerListadoDatosCuentaInEgre(lblNombreEmpresa.getText(),
                            "saCuentaIngEgr", sfieldName4,
                            vista.txtValorCuentaInEgre.getText(),
                            Opcion4)));
                }
            } else if (vista.txtValorPais == ke.getSource()) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    String Opcion5 = "0", sfieldName5 = "";
                    if (vista.jRInicio5.isSelected()) {
                        Opcion5 = "0";
                    } else if (vista.jRFinal5.isSelected()) {
                        Opcion5 = "1";
                    } else if (vista.jrCualquier5.isSelected()) {
                        Opcion5 = "2";
                    } else if (vista.jRexacta5.isSelected()) {
                        Opcion5 = "3";
                    }
                    sfieldName5 = (vista.jrCodigo5.isSelected()) ? "co_pais" : "pais_des";
                    vista.jtablaPais.setModel(new ModeloTablaPais(modeloPais.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                            "saPais", sfieldName5,
                            vista.txtValorPais.getText(),
                            Opcion5)));
                }
            } else if (vista.txtcod_tipo.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {

                }
            } else if (vista.txtCodDesde.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    vista.setModel();
                    reporte = 2;
                    vista.JDialogProveedor.setSize(472, 358);
                    vista.JDialogProveedor.setVisible(true);
                    vista.JDialogProveedor.setLocationRelativeTo(null);
                }
            } else if (vista.txtCodHasta.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    vista.setModel();
                    reporte = 3;
                    vista.JDialogProveedor.setSize(472, 358);
                    vista.JDialogProveedor.setVisible(true);
                    vista.JDialogProveedor.setLocationRelativeTo(null);
                    System.out.println("# Reporte  " + reporte);
                }
            } else if (vista.txtCodSucursalDesde.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    reporte = 4;
                    vista.jDialogSucursal.setSize(472, 358);
                    vista.jDialogSucursal.setLocationRelativeTo(null);
                    vista.jDialogSucursal.setVisible(true);
                    System.out.println("# Reporte  " + reporte);
                }
            } else if (vista.txtCodTipoProveesorDesde.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    setModelTipoProveedor();
                    reporte = 6;
                    vista.jDialogTipoprovee.setSize(472, 358);
                    vista.jDialogTipoprovee.setLocationRelativeTo(null);
                    vista.jDialogTipoprovee.setVisible(true);
                }
            } else if (vista.txtBuscarSucursal.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    String Opcion = "0", sfieldName = "";

                    if (vista.jRInicio7.isSelected()) {
                        Opcion = "0";
                    } else if (vista.jRFinal7.isSelected()) {
                        Opcion = "1";
                    } else if (vista.jrCualquier7.isSelected()) {
                        Opcion = "2";
                    } else if (vista.jRexacta7.isSelected()) {
                        Opcion = "3";
                    }
                    sfieldName = (vista.rjcodigo.isSelected()) ? "co_sucur" : "sucur_des";
                    vista.jtableSucursal.setModel(new ModeloTablaSucursal(
                            sucursalModelo.pObtenerListadoDatos(
                                    Vistaprincipal.tempEmpresa,//sDatabase_Name
                                    "saSucursal",
                                    sfieldName,//sField_Name
                                    vista.txtBuscarSucursal.getText(),//Valor
                                    Opcion//@iOpcion
                            )));
                }
            }
            else if (vista.txtCodTipoProveedorHasta.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    setModelTipoProveedor();
                    reporte = 7;
                    vista.jDialogTipoprovee.setSize(472, 358);
                    vista.jDialogTipoprovee.setVisible(true);
                    vista.jDialogTipoprovee.setLocationRelativeTo(null);
                    System.out.println("# Reporte  " + reporte);
                }
            } else if (vista.txtCodZonaDesde.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    setModelZona();
                    reporte = 8;
                    vista.jDialogZona.setSize(472, 358);
                    vista.jDialogZona.setVisible(true);
                    vista.jDialogZona.setLocationRelativeTo(null);
                }
            } else if (vista.txtCodZonaHasta.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    setModelZona();
                    reporte = 9;
                    vista.jDialogZona.setSize(472, 358);
                    vista.jDialogZona.setLocationRelativeTo(null);
                    vista.jDialogZona.setVisible(true);
                    System.out.println("# Reporte  " + reporte);
                }
            } else if (vista.txtCodSegmentoDesde.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    setModeSegmento();
                    reporte = 10;
                    vista.jDialogoSegmento.setSize(472, 358);
                    vista.jDialogoSegmento.setLocationRelativeTo(null);
                    vista.jDialogoSegmento.setVisible(true);
                    System.out.println("# Reporte  " + reporte);
                }
            } else if (vista.txtCodSegmentoHasta.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    setModeSegmento();
                    reporte = 11;
                    vista.jDialogoSegmento.setSize(472, 358);
                    vista.jDialogoSegmento.setLocationRelativeTo(null);
                    vista.jDialogoSegmento.setVisible(true);
                    System.out.println("# Reporte  " + reporte);
                }
            }
            
            else if (vista.txtCod_condPago.equals(ke.getSource())) {
                if (ke.getKeyCode() == KeyEvent.VK_F2) {
                    //carga la Tabla dentro del Dialogo de busqueda
                    setModelCondicionPago();
                    vista.jDialogCondcionPago.setVisible(true);
                    vista.jDialogCondcionPago.setSize(472, 358);
                    vista.jDialogCondcionPago.setLocationRelativeTo(null);
                }
            } else if (vista.txtValorCondicionPago == ke.getSource()) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    String Opcion6 = "0", sfieldName6 = "";
                    if (vista.jRInicio6.isSelected()) {
                        Opcion6 = "0";
                    } else if (vista.jRFinal6.isSelected()) {
                        Opcion6 = "1";
                    } else if (vista.jrCualquier6.isSelected()) {
                        Opcion6 = "2";
                    } else if (vista.jRexacta6.isSelected()) {
                        Opcion6 = "3";
                    }
                    sfieldName6 = (vista.jrCodigo6.isSelected()) ? "co_cond" : "cond_des";
                    vista.jtablaCondicionPago.setModel(new ModeloTablaCoindicionPago(modeloCondicionPago.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                            "saCondicionPago", sfieldName6, vista.txtValorCondicionPago.getText(), Opcion6)));
                }
                i++;
            }
            i++;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    //cargar datos tabla Zona 
    public void setModelZona() {
        vista.jtablaZona.setModel(new ModeloTablaZona(modeloZona.pObtenerListadoDatosZona(lblNombreEmpresa.getText(), "saZona", "zon_des", "", "0")));
    }

    //Cargar datos tabla Segmento
    public void setModeSegmento() {
        vista.jtablaSegmento.setModel(new ModeloTablaSegmento(modeloSegmento.pOptenerListadoDatosSegmento(lblNombreEmpresa.getText(), "saSegmento", "seg_des", "", "0")));
    }

    public void setModelCuentaIngre() {
        vista.jtablaCuentaInEgre.setModel(new ModelTablaCuentaInEgre(cuentaInEgreModel.pObtenerListadoDatosCuentaInEgre(lblNombreEmpresa.getText(),
                "saCuentaIngEgr", "descrip", "", "2")));
    }

    public void setModelTipoProveedor() {
        vista.jtablaTipo.setModel(new ModeloTablaTipoProveedor(tipoProveedorModelo.pObtenerListadoDatosProveedor(lblNombreEmpresa.getText(),
                "saTipoProveedor", "tip_pro", "", "2")));
    }

    public void setModelPais() {
        vista.jtablaPais.setModel(new ModeloTablaPais(modeloPais.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                "saPais", "pais_des",
                "",
                "2")));
    }

    public void setModelCondicionPago() {
        vista.jtablaCondicionPago.setModel(new ModeloTablaCoindicionPago(modeloCondicionPago.pObtenerListadoDatos(lblNombreEmpresa.getText(),
                "saCondicionPago", "co_cond", "", "2")));
    }
}
