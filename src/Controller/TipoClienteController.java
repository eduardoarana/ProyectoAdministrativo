/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.TipoClienteBO;
import Beans.TipoPrecioBO;
import Conection.Conexion;
import Model.ModeloTablaTipoCliente;
import Model.ModeloTablaTipoPrecio;
import Model.TipoClienteModelo;
import Model.TipoPrecioModelo;
import Vista.VistaTipoCliente;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
public class TipoClienteController implements ActionListener, KeyListener {

    VistaTipoCliente vista;
    TipoClienteModelo modelo;
    TipoPrecioModelo modeloTipoPrecio;
    int resultado = 0;
    ArrayList<TipoClienteBO> listaCliente;
    ArrayList<TipoPrecioBO> listaPrecio;
    public int reporte = 0;
    public Conexion conexion;

    public TipoClienteController(VistaTipoCliente vista) {
        this.vista = vista;
        modelo = new TipoClienteModelo();
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == this.vista.btnGuardar) {

            if (vista.txtCodTipoCiente.getText().isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "El campo Codigo Cliente no puede estar vacio ", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            resultado = modelo.pInsertarTipoCliente(vista.txtCodTipoCiente.getText(),
                    vista.txtDescripcionTipoCliente.getText(),
                    vista.txtCodTipoPrecio.getText(),
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(),
                    "",
                    "",
                    "",
                    "",
                    Vistaprincipal.tempUsuario,
                    Utilitarios.Utilitario.nombreHost(),
                    "1",
                    "2",
                    Vistaprincipal.tempSucrsal);
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }
        } else if (event.getSource() == this.vista.btnactulizar) {
            resultado = modelo.pActualizarTipoCliente(vista.txtCodTipoCiente.getText(),
                    vista.txtCodTipoCiente.getText(),
                    vista.txtDescripcionTipoCliente.getText(),
                    vista.txtCodTipoPrecio.getText(),
                    vista.txtCampo1.getText(),
                    vista.txtcampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtcampo4.getText(), "", "", "", "",
                    Vistaprincipal.nombreUsuario,
                    Vistaprincipal.tempSucrsal,
                    Utilitarios.Utilitario.nombreHost(), "", "1", "1", "");
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }
        } else if (event.getSource() == this.vista.btnEliminar) {
            String tipoCLiente = vista.txtCodTipoCiente.getText();
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                resultado = modelo.pEliminarTipoCliente(tipoCLiente,
                        Utilitarios.Utilitario.nombreHost(),
                        Vistaprincipal.tempUsuario,
                        Vistaprincipal.tempSucrsal);
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                    vista.settearCampos();
                }
            } else {
                return;
            }
        } else if (event.getSource() == this.vista.btnBuscar) {

            cargartablaTipoCliente(Vistaprincipal.tempEmpresa,
                    "satipoCliente",
                    "tip_cli", "", "2");
            reporte = 1;

            vista.jDialogTipoCliente.setSize(472, 358);
            vista.jDialogTipoCliente.setLocationRelativeTo(null);
            vista.jDialogTipoCliente.setVisible(true);
        } else if (event.getSource() == this.vista.btnNuevo) {
            vista.settearCampos();
        } else if (event.getSource() == this.vista.btnAceptar) {
            int selection = vista.jtableTipoClientes.getSelectedRow();

            if (selection == -1) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaCliente = modelo.pObtenerListadoDatos(
                        Vistaprincipal.tempEmpresa,
                        "satipoCLiente",
                        "tip_cli",
                        vista.jtableTipoClientes.getValueAt(selection, 0).toString(),
                        "3");

                if (reporte == 1) {
                    vista.txtCodTipoCiente.setText(listaCliente.get(0).getTip_cli().replaceFirst("\\s", ""));
                    vista.txtDescripcionTipoCliente.setText(listaCliente.get(0).getDes_tipo());
                    vista.txtCampo1.setText(listaCliente.get(0).getCampo1());
                    vista.txtcampo2.setText(listaCliente.get(0).getCampo2());
                    vista.txtCampo3.setText(listaCliente.get(0).getCampo3());
                    vista.txtcampo4.setText(listaCliente.get(0).getCampo4());
                    vista.txtCodTipoPrecio.setText(listaCliente.get(0).getCo_precio().replaceFirst("\\s", ""));
                    vista.txtTipoPrecioDescrip.setText(listaCliente.get(0).getDescripcionTipoPrecio());
                    vista.btnEliminar.setEnabled(true);
                    vista.btnactulizar.setEnabled(true);
                    vista.btnGuardar.setEnabled(false);
                } else if (reporte == 2) {
                    vista.txtCodDesde.setText(listaCliente.get(0).getTip_cli().replaceFirst("\\s", ""));
                    vista.txtDescripDesde.setText(listaCliente.get(0).getDes_tipo());
                } else if (reporte == 3) {
                    vista.txtCodHasta.setText(listaCliente.get(0).getTip_cli().replaceFirst("\\s", ""));
                    vista.txtDescripHasta.setText(listaCliente.get(0).getDes_tipo());
                }
                vista.jDialogTipoCliente.dispose();
            }
        } else if (event.getSource() == this.vista.btnCancelar) {
            vista.jDialogTipoCliente.dispose();
        } else if (event.getSource() == this.vista.btnAceptarTipoPrecio) {
            int selection = vista.jtableTipoPrecio.getSelectedRow();
            if (selection == -1) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {

                listaPrecio = modeloTipoPrecio.pObtenerListadoDatos(Vistaprincipal.tempEmpresa,
                        "saTipoPrecio",
                        "co_precio",
                        vista.jtableTipoPrecio.getValueAt(selection, 0).toString(),
                        "2");
                if (reporte == 4) {
                    vista.txtCodTipoPrecio.setText(listaPrecio.get(0).getCo_precio().replaceAll("\\s", ""));
                    vista.txtTipoPrecioDescrip.setText(listaPrecio.get(0).getDes_precio());
                } else if (reporte == 5) {
                    vista.txtCodTipPrecioDesde.setText(listaPrecio.get(0).getCo_precio().replaceAll("\\s", ""));
                    vista.txtDescripPeriDesde.setText(listaPrecio.get(0).getDes_precio());
                } else if (reporte == 6) {
                    vista.txtCodTipPrecioHasta.setText(listaPrecio.get(0).getCo_precio().replaceAll("\\s", ""));
                    vista.txtDescripPeriHasta.setText(listaPrecio.get(0).getDes_precio());
                }
                vista.jDialogTipoPrecio.dispose();
            }

        } else if (event.getSource() == this.vista.btnCancelarTipoPrecio) {
            vista.jDialogTipoPrecio.dispose();
        } else if (event.getSource() == this.vista.btnImprimir) {

            vista.jDialogRpeorteTipoCliente.setSize(600, 445);
            vista.jDialogRpeorteTipoCliente.setLocationRelativeTo(null);
            vista.jDialogRpeorteTipoCliente.setVisible(true);
        } else if (event.getSource() == this.vista.btnAceptarImprimir) {
            try {
                String ruta = "C:\\Users\\aranaVentur\\Downloads\\ProyectoAdministrativo\\Reportes\\RepTipoCliente.jasper";
                Map parametro = new HashMap();
                String codDesde = vista.txtCodDesde.getText(),
                        codHasta = vista.txtCodHasta.getText(),
                        codTipoPrecioDesde = vista.txtCodTipPrecioDesde.getText(),
                        codTipoPrecioHasta = vista.txtCodTipPrecioHasta.getText();
                if (codDesde.isEmpty() && codHasta.isEmpty()) {
                    codDesde = null;
                    codHasta = null;
                } else if (!codDesde.isEmpty() && codHasta.isEmpty()) {
                    codHasta = null;
                } else if (codDesde.isEmpty() && !codHasta.isEmpty()) {
                    codDesde = null;
                }
                if (codTipoPrecioDesde.isEmpty() && codTipoPrecioHasta.isEmpty()) {
                    codTipoPrecioDesde = null;
                    codTipoPrecioHasta = null;
                } else if (!codTipoPrecioDesde.isEmpty() && codTipoPrecioHasta.isEmpty()) {
                    codTipoPrecioHasta = null;
                } else if (codTipoPrecioDesde.isEmpty() && !codTipoPrecioHasta.isEmpty()) {
                    codTipoPrecioDesde = null;
                }

                System.out.print("Desde " + codDesde + " Hasta " + codHasta);

                String criterio = vista.comboCriterio.getSelectedItem().toString().equals("Descendente") ? "DESC" : "ASC";

                parametro.put("sCo_Cli_d", codDesde);
                parametro.put("sCo_Cli_h", codHasta);
                parametro.put("sCo_Sucursal", null);
                parametro.put("sCo_Precio_d", codTipoPrecioDesde);
                parametro.put("sCo_Precio_h", codTipoPrecioHasta);
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
                Logger.getLogger(UnidadController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (event.getSource() == this.vista.btnCancelarReporte) {
            vista.jDialogRpeorteTipoCliente.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vista.txtBuscar == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion = "0", sfieldName = "";
                if (vista.jRInicio.isSelected()) {
                    Opcion = "0";
                } else if (vista.jRFinal.isSelected()) {
                    Opcion = "1";
                } else if (vista.jrCualquier.isSelected()) {
                    Opcion = "2";
                } else if (vista.jRexacta.isSelected()) {
                    Opcion = "3";
                }
                sfieldName = (vista.jrCodigo.isSelected()) ? "tip_cli" : "des_tipo";

                cargartablaTipoCliente(Vistaprincipal.tempEmpresa, "satipoCliente", sfieldName, vista.txtBuscar.getText(), Opcion);
            }
        } else if (vista.txtCodTipoPrecio == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 4;
                cargarTablaTipoPrecio(Vistaprincipal.tempEmpresa, "saTipoPrecio", "co_precio", "", "2");
                vista.jDialogTipoPrecio.setSize(472, 358);
                vista.jDialogTipoPrecio.setLocationRelativeTo(null);
                vista.jDialogTipoPrecio.setVisible(true);

            }
        } else if (vista.txtCodTipPrecioDesde == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 5;
                cargarTablaTipoPrecio(Vistaprincipal.tempEmpresa, "saTipoPrecio", "co_precio", "", "2");
                vista.jDialogTipoPrecio.setSize(472, 358);
                vista.jDialogTipoPrecio.setLocationRelativeTo(null);
                vista.jDialogTipoPrecio.setVisible(true);

            }
        } else if (vista.txtCodTipPrecioHasta == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 6;
                cargarTablaTipoPrecio(Vistaprincipal.tempEmpresa, "saTipoPrecio", "co_precio", "", "2");
                vista.jDialogTipoPrecio.setSize(472, 358);
                vista.jDialogTipoPrecio.setLocationRelativeTo(null);
                vista.jDialogTipoPrecio.setVisible(true);
            }
        } else if (vista.txtBuscarPrecio == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion1 = "0", sfieldName1 = "";
                if (vista.jRInicio1.isSelected()) {
                    Opcion1 = "0";
                } else if (vista.jRFinal1.isSelected()) {
                    Opcion1 = "1";
                } else if (vista.jrCualquier1.isSelected()) {
                    Opcion1 = "2";
                } else if (vista.jRexacta1.isSelected()) {
                    Opcion1 = "3";
                }
                sfieldName1 = (vista.jrCodigo1.isSelected()) ? "co_precio" : "des_precio";
                cargarTablaTipoPrecio(Vistaprincipal.tempEmpresa, "saTipoPrecio", sfieldName1, vista.txtBuscarPrecio.getText(), Opcion1);
            }
        } else if (vista.txtCodDesde.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 2;
                cargartablaTipoCliente(Vistaprincipal.tempEmpresa,
                        "satipoCliente",
                        "tip_cli", "", "2");
                vista.jDialogTipoCliente.setSize(472, 358);
                vista.jDialogTipoCliente.setLocationRelativeTo(null);
                vista.jDialogTipoCliente.setVisible(true);
            }
        } else if (vista.txtCodHasta.equals(ke.getSource())) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                reporte = 3;
                cargartablaTipoCliente(Vistaprincipal.tempEmpresa,
                        "satipoCliente",
                        "tip_cli", "", "2");
                vista.jDialogTipoCliente.setSize(472, 358);
                vista.jDialogTipoCliente.setLocationRelativeTo(null);
                vista.jDialogTipoCliente.setVisible(true);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    public void cargartablaTipoCliente(String dAtaBaseName, String tableName, String Field_Name, String valor, String option) {
        vista.jtableTipoClientes.setModel(new ModeloTablaTipoCliente(modelo.pObtenerListadoDatos(dAtaBaseName, tableName, Field_Name, valor, option)));

    }

    public void cargarTablaTipoPrecio(String dAtaBaseName, String tableName, String Field_Name, String valor, String option) {
        modeloTipoPrecio = new TipoPrecioModelo();
        vista.jtableTipoPrecio.setModel(new ModeloTablaTipoPrecio(modeloTipoPrecio.pObtenerListadoDatos(dAtaBaseName, tableName, Field_Name, valor, option)));
    }
}
