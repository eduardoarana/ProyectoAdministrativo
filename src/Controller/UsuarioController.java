/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.UsuarioBO;
import Model.UsuarioModel;
import Vista.VistaUsuario;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static Vista.Vistaprincipal.lblNombreEmpresa;
/**
 *
 * @author Desarrollo
 */
public class UsuarioController implements ActionListener {

    Vista.VistaUsuario vista;
    UsuarioModel modelo;
    UsuarioBO usuarioBo;
    ArrayList<UsuarioBO> listaUsuario;
    int resultado = 0;

    public UsuarioController(VistaUsuario vista) {
        this.vista = vista;
        modelo = new UsuarioModel();
        usuarioBo = new UsuarioBO();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == this.vista.btnGuardar) {
            String permitirCambiarSucursal = (vista.jchePermiteCambiarSucursal.isSelected()) ? "0" : "1";
            //Validar Fecha 
            if (vista.fechaUltimoAccso.equals(null)) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe ingresar la Fecha ultimo Acceso ", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else if (vista.fechaUltimoAccFallido.equals(null)) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe ingresar la Fecha ultimo Acceso Fallido ", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            usuarioBo.setCod_Usuario(vista.txtcodigoUsuario.getText().replaceAll("\\s", ""));
            usuarioBo.setDesc_Usuario(vista.txtDescripcionUsu.getText());
            usuarioBo.setPrioridad(vista.txtPrioridad.getText());
            usuarioBo.setUsuario_Nodo("1");
            usuarioBo.setId_Grupo("0");
            usuarioBo.setCamb_Sucu("0");
            usuarioBo.setPide_Sucu(permitirCambiarSucursal);
            usuarioBo.setSucursal("1");
            usuarioBo.setId_Idioma("1");
            usuarioBo.setPcontrol_1("0");
            usuarioBo.setPcontrol_2("0");
            usuarioBo.setSerie("0");
            usuarioBo.setFec_Ult(Utilitarios.Utilitario.obtenerFecha(vista.fechaUltimoAccso));
            usuarioBo.setFec_Prox(Utilitarios.Utilitario.obtenerFecha(vista.fechaUltimoAccso));
            usuarioBo.setVeces(vista.txtintentosFallido.getText());
            usuarioBo.setFec_Ult_FA(Utilitarios.Utilitario.obtenerFecha(vista.fechaUltimoAccFallido));
            usuarioBo.setEstado(vista.estado.getSelectedItem().toString());
            usuarioBo.setAd_Login("1");
            usuarioBo.setAcceso_Todas_Empresa_Admi("0");
            usuarioBo.setAcceso_Todas_Empresa("0");
            usuarioBo.setCod_Empresa("23");
            usuarioBo.setSel_Emp("9");
            usuarioBo.setSel_Emp_Admi("8");
            usuarioBo.setCo_mapa("300");
            usuarioBo.setPassword(new String(vista.txtpasswordnew.getPassword()));
            usuarioBo.setCampo1(vista.txtCampo1.getText());
            usuarioBo.setCampo2(vista.txtcampo2.getText());
            usuarioBo.setCampo3(vista.txtCampo3.getText());
            usuarioBo.setCampo4(vista.txtcampo4.getText());
            usuarioBo.setCampo5(vista.txtCampo5.getText());
            usuarioBo.setCampo6(vista.txtCampo6.getText());
            usuarioBo.setCampo7(vista.txtCampo7.getText());
            usuarioBo.setCampo8(vista.txtCampo8.getText());
            usuarioBo.setRevisado("1");
            usuarioBo.setTrasnfe("1");
            usuarioBo.setCo_sucu_in( Vistaprincipal.lblNombreSucursal.getText() );
            usuarioBo.setCo_us_in( Vistaprincipal.lblNombreUsuario1.getText());
            usuarioBo.setMaquina(Utilitarios.Utilitario.nombreHost());
            resultado = modelo.pInsertarUsuario(usuarioBo);
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }

        } else if (event.getSource() == this.vista.btnactulizar) {
            usuarioBo.setCod_Usuario(vista.txtcodigoUsuario.getText().replaceAll("\\s", ""));
            usuarioBo.setDesc_Usuario(vista.txtDescripcionUsu.getText());
            usuarioBo.setPrioridad(vista.txtPrioridad.getText());
            usuarioBo.setUsuario_Nodo("1");
            usuarioBo.setId_Grupo("0");
            usuarioBo.setCamb_Sucu("0");
          //  usuarioBo.setPide_Sucu(permitirCambiarSucursal);
            usuarioBo.setSucursal("1");
            usuarioBo.setId_Idioma("1");
            usuarioBo.setPcontrol_1("0");
            usuarioBo.setPcontrol_2("0");
            usuarioBo.setSerie("0");
            usuarioBo.setFec_Ult(Utilitarios.Utilitario.obtenerFecha(vista.fechaUltimoAccso));
            usuarioBo.setFec_Prox(Utilitarios.Utilitario.obtenerFecha(vista.fechaUltimoAccso));
            usuarioBo.setVeces(vista.txtintentosFallido.getText());
            usuarioBo.setFec_Ult_FA(Utilitarios.Utilitario.obtenerFecha(vista.fechaUltimoAccFallido));
            usuarioBo.setEstado(vista.estado.getSelectedItem().toString());
            usuarioBo.setAd_Login("1");
            usuarioBo.setAcceso_Todas_Empresa_Admi("0");
            usuarioBo.setAcceso_Todas_Empresa("0");
            usuarioBo.setCod_Empresa("23");
            usuarioBo.setSel_Emp("9");
            usuarioBo.setSel_Emp_Admi("8");
            usuarioBo.setCo_mapa("300");
            usuarioBo.setPassword(new String(vista.txtpasswordnew.getPassword()));
            usuarioBo.setCampo1(vista.txtCampo1.getText());
            usuarioBo.setCampo2(vista.txtcampo2.getText());
            usuarioBo.setCampo3(vista.txtCampo3.getText());
            usuarioBo.setCampo4(vista.txtcampo4.getText());
            usuarioBo.setCampo5(vista.txtCampo5.getText());
            usuarioBo.setCampo6(vista.txtCampo6.getText());
            usuarioBo.setCampo7(vista.txtCampo7.getText());
            usuarioBo.setCampo8(vista.txtCampo8.getText());
            usuarioBo.setRevisado("1");
            usuarioBo.setTrasnfe("1");
            usuarioBo.setCo_sucu_in( Vistaprincipal.lblNombreSucursal.getText() );
            usuarioBo.setCo_us_in( Vistaprincipal.lblNombreUsuario1.getText());
            usuarioBo.setMaquina(Utilitarios.Utilitario.nombreHost());
           resultado = modelo.pActualizarUsuario(usuarioBo);
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            } 
        } else if (event.getSource() == this.vista.btnEliminar) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                resultado = modelo.pEliminarUsuario(vista.txtcodigoUsuario.getText(), 
                        Utilitarios.Utilitario.nombreHost(), 
                       Vistaprincipal.lblNombreUsuario1.getText(),//co_usu 
                         Vistaprincipal.lblNombreUsuario1.getText() //"mod"
                );
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                    vista.settearCampos();
                }
            } else {
                return;
            }

        } else if (event.getSource() == this.vista.btnBuscar) {

        } else if (event.getSource() == this.vista.btnNuevo) {
            vista.settearCampos();

        } else if (event.getSource() == this.vista.btnImprimir) {

        } else if (event.getSource() == this.vista.btnAceptar1) {
            //seleccionar en la tabla de busqueda
            int selecionado = vista.jtablaUsuario.getSelectedRow();
            vista.btnGuardar.setEnabled(false);
            vista.btnEliminar.setEnabled(true);
            vista.btnactulizar.setEnabled(true);

            if (selecionado != -1) {
                String codigoUsuario = vista.jtablaUsuario.getValueAt(selecionado, 0).toString();
                vista.txtcodigoUsuario.setText(codigoUsuario);
                listaUsuario = new ArrayList<UsuarioBO>();
                listaUsuario = modelo.pObtenerListadoDatos(
                        lblNombreEmpresa.getText(),
                        "MpUsuario",
                        "Cod_Usuario",
                        codigoUsuario,
                        "3");
                String pideSucursal = listaUsuario.get(0).getPide_Sucu();
                String permitirCambio = listaUsuario.get(0).getCamb_Sucu();
                String permitirSeleccionarEmpresa = listaUsuario.get(0).getSel_Emp();
                if (pideSucursal.equals("1")) {
                    vista.jchPedirSucursalEnter.setSelected(true);
                } else {
                    vista.jchPedirSucursalEnter.setSelected(false);
                }
                if (permitirCambio.equals("1")) {
                    vista.jchePermiteCambiarSucursal.setSelected(true);
                } else {
                    vista.jchePermiteCambiarSucursal.setSelected(false);
                }
                if (permitirSeleccionarEmpresa.equals("1")) {
                    vista.jpermitirSelecEmpre.setSelected(true);
                } else {
                    vista.jpermitirSelecEmpre.setSelected(false);
                }
                vista.txtDescripcionUsu.setText(listaUsuario.get(0).getDesc_Usuario());
                vista.txtCampo1.setText(listaUsuario.get(0).getCampo1());
                vista.txtcampo2.setText(listaUsuario.get(0).getCampo2());
                vista.txtCampo3.setText(listaUsuario.get(0).getCampo3());
                vista.txtcampo4.setText(listaUsuario.get(0).getCampo4());
                vista.txtCampo5.setText(listaUsuario.get(0).getCampo5());
                vista.txtCampo6.setText(listaUsuario.get(0).getCampo6());
                vista.txtCampo7.setText(listaUsuario.get(0).getCampo7());
                vista.txtCampo8.setText(listaUsuario.get(0).getCampo8());
                vista.txtintentosFallido.setText(listaUsuario.get(0).getVeces());
                vista.txtcodSucursal.setText("");
                vista.txtcodSucursal.setText(listaUsuario.get(0).getSucursal());
                vista.txtdescrSucursal.setText("");
                vista.jchPedirSucursalEnter.setSelected(false);
                vista.jchePermiteCambiarSucursal.setSelected(false);
                vista.jpermitirSelecEmpre.setSelected(false);

                vista.jDialogUsuarios.dispose();
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        } else if (event.getSource() == this.vista.btnasignarPassword) {
            vista.JDialogPassword.setVisible(true);
            vista.JDialogPassword.setTitle("Cambiar Contraseña");
            vista.JDialogPassword.setSize(271, 217);
            vista.JDialogPassword.setLocationRelativeTo(null);
        } else if (event.getSource() == this.vista.btnAceptarPassword) {
            //Verificar el Password 
            String newPassword = new String(vista.txtpasswordnew.getPassword());
            String confPassword = new String(vista.txtconfirmarpassword.getPassword());
            Boolean bandera = validarPassword(newPassword, confPassword);
            if (bandera) {
                JOptionPane.showMessageDialog(new JFrame(), "Se Ha cambiado con exito", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.JDialogPassword.dispose();
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "la contraseña no coinciden", "Software", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else if (event.getSource() == this.vista.btnCancelarPassword) {
            vista.JDialogPassword.dispose();
        }
    }

    public Boolean validarPassword(String newPassword, String confiPassword) {
        System.out.println("password new" + newPassword + "confirmar" + confiPassword);
        Boolean bandera = false;
        if (newPassword.equals(confiPassword)) {
            bandera = true;
        }
        return bandera;
    }
}
