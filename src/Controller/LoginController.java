/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.LoginModel;
import Vista.Login;
import Vista.VistaEmpresa;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author earana
 */
public class LoginController implements ActionListener  {

    LoginModel modelo;
    Login vista;
    Vista.Vistaprincipal  vistaprincipal;
   

    public LoginController(Login vista){
        this.vista = vista;
        modelo = new LoginModel();
    }

  
    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == this.vista.btnAceptar) {
            try {
                String contrasena = new String(vista.txtPassword.getPassword());
                resultado = modelo.pAutenticarUsuario(vista.txtUsuario.getText(), contrasena);
                if (resultado >0){
//                    vistaprincipal = new Vistaprincipal();
//                    vistaprincipal.setVisible(true);
                VistaEmpresa empresa = new VistaEmpresa();
                Vistaprincipal.tempUsuario=vista.txtUsuario.getText();
                
                empresa.setVisible(true);
                empresa.setLocationRelativeTo(null);
                
                 this.vista.dispose();
                }else {
                  vista.lblmenValidacion.setVisible(true);
                //JOptionPane.showMessageDialog(new JFrame(), "Warning", "el usuario no existe", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(new JFrame(), "Warning", e.toString(), JOptionPane.INFORMATION_MESSAGE);
                e.printStackTrace();
            }
        }if (event.getSource().equals(vista.btnCancelar)) {
            vista.dispose();
        } 
    }
}
