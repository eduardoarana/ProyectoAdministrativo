/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModeloTablaSucursal;
import Model.SucursalModelo;
import Vista.VistaSucursalPrincipal;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static Vista.Vistaprincipal.lblNombreEmpresa;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AranaV
 */
public class SucursalPrincipalController implements ActionListener, KeyListener {

    VistaSucursalPrincipal vsp;
    Vistaprincipal vistaprincipal;
    SucursalModelo modelo;
    public SucursalPrincipalController(VistaSucursalPrincipal vsp) {
        this.vsp = vsp;
        modelo = new SucursalModelo();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(vsp.btnAceptar)) {
           if (modelo.validarSucursal(Vistaprincipal.tempEmpresa, vsp.txtCodSucursal.getText()) == 0) {
                System.out.println("Validando Sucurssal");
                JOptionPane.showMessageDialog(new JFrame(), "la sucursal No Existe . por Favor precione \n F2 para buscar la lista de Sucursales ", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            vistaprincipal = new Vistaprincipal();
            vistaprincipal.setLocationRelativeTo(null);
            vistaprincipal.setSize(1245, 587);
            vistaprincipal.setVisible(true);

            vsp.dispose();
        } else if (event.getSource().equals(vsp.btnCancelar)) {
            vsp.dispose();
        } else if (event.getSource().equals(vsp.btnAceptarSucursalPrincipal)) {
            int selection = vsp.jtableSucursal.getSelectedRow();
            if (selection != -1) {
                vsp.txtCodSucursal.setText(vsp.jtableSucursal.getValueAt(selection, 0).toString().replaceAll("\\s", ""));
                vsp.txtdescripcionSucursal.setText(vsp.jtableSucursal.getValueAt(selection, 1).toString().replaceAll("\\s", ""));
                Vistaprincipal.tempSucrsal = vsp.txtCodSucursal.getText().toString().replaceAll("\\s", "");

                vsp.jDialogSucursal.dispose();
            }
        } else if (event.getSource().equals(vsp.btnCancelarSucurPrincipal)) {
            vsp.jDialogSucursal.dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (vsp.txtBucscar == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                String Opcion6 = "0", sfieldName6 = "";
                if (vsp.jRInicio.isSelected()) {
                    Opcion6 = "0";
                } else if (vsp.jRFinal.isSelected()) {
                    Opcion6 = "1";
                } else if (vsp.jrCualquier.isSelected()) {
                    Opcion6 = "2";
                } else if (vsp.jRexacta.isSelected()) {
                    Opcion6 = "3";
                }
                sfieldName6 = (vsp.rjcodigo.isSelected()) ? "co_sucur" : "sucur_des";
                cargarDatosSucursal("ADMIN_A", "saSucursal", sfieldName6, vsp.txtBucscar.getText(), Opcion6);
            }
        } else if (vsp.txtCodSucursal == ke.getSource()) {
            if (ke.getKeyCode() == KeyEvent.VK_F2) {
                cargarDatosSucursal("ADMIN_A", "saSucursal", "co_sucur", "", "2");
                vsp.jDialogSucursal.setVisible(true);
                vsp.jDialogSucursal.setSize(472, 358);
                vsp.jDialogSucursal.setLocationRelativeTo(null);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    public void cargarDatosSucursal(String BD, String tabla, String fieldName, String Valor, String opcion) {
        vsp.jtableSucursal.setModel(new ModeloTablaSucursal(new SucursalModelo().pObtenerListadoDatos(BD, tabla, fieldName, Valor, opcion)));
    }
}
