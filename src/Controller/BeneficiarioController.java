/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.BeneficiarioModelo;
import Vista.VistaBeneficiario;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aranaVentur
 */
public class BeneficiarioController implements ActionListener {

    VistaBeneficiario vista;
    BeneficiarioModelo modelo;
    int resultado = 0;

    public BeneficiarioController(VistaBeneficiario vista) {
        this.vista = vista;
        modelo = new BeneficiarioModelo();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int inactivo = vista.btnInactivo.isSelected() ? 1 : 0;

        String tipoImpo = vista.TipoPersona.getSelectedItem().toString();
        
        if (event.getSource() == this.vista.btnGuardar1) {

            resultado = modelo.pInsertarBeneficiario(vista.txtCodigoBeneficiario.getText(),
                    vista.txtDescripcionBeneficiario.getText(),
                    vista.txtRifBeneficiario.getText(), //rif
                    null,//nit
                    vista.txtTelefono.getText(),//telefonos
                    vista.txtDireccion.getText(),//direccion 
                    null, //dis_cen
                    inactivo, //bInactivo 
                    vista.txtCampo1.getText(),
                    vista.txtCampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtCampo4.getText(),
                    vista.txtCampo5.getText(),
                    vista.txtCampo6.getText(),
                    null,
                    null,
                    Vistaprincipal.tempUsuario,
                    Vistaprincipal.tempSucrsal,
                    Utilitarios.Utilitario.nombreHost(),
                    "1",//sRevisado
                    "1",//sTrasnfe,
                    tipoImpo, //sTipo_Per,
                    ""//sCo_Tab
            );

            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setterCampos();
            }

        } else if (event.getSource() == this.vista.btnactulizar) {
            resultado = modelo.pActualizarBeneficiario(vista.txtCodigoBeneficiario.getText(), vista.txtCodigoBeneficiario.getText(),
                    vista.txtDescripcionBeneficiario.getText(),
                    vista.txtRifBeneficiario.getText(),
                    null,
                    vista.txtTelefono.getText(),
                    vista.txtDireccion.getText(),
                    null,//dis_cen
                    inactivo,
                    vista.txtCampo1.getText(),
                    vista.txtCampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtCampo4.getText(),
                    vista.txtCampo5.getText(),
                    vista.txtCampo6.getText(),
                    null,
                    null,
                    Vistaprincipal.tempUsuario,
                    Vistaprincipal.tempSucrsal,
                    Utilitarios.Utilitario.nombreHost(),
                    "",//campos 
                    "1",//sRevisado,
                    "0",// trasnfe, 
                    tipoImpo,
                    "" 
            );
            
             if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.setterCampos();
            }
        } else if (event.getSource() == this.vista.btnEliminar1) {

        } else if (event.getSource() == this.vista.btnBuscar) {

        } else if (event.getSource() == this.vista.btnNuevo1) {

        }
    }
}
