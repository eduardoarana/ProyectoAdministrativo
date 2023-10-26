/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModeloTablaSubLinea;
import Model.SublineaModel;
import VistaDialogos.DialogoBusquedaTabla;
import Vista.VistaSublinea;
import Vista.Vistaprincipal;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static Vista.Vistaprincipal.lblNombreEmpresa;
/**
 *
 * @author earana
 */
public class SubLineaController implements ActionListener {

    VistaSublinea vista;
    SublineaModel modelo;
    // DialogoBusquedaTabla vista2;

    public SubLineaController(VistaSublinea vista) {
        this.vista = vista;
        modelo = new SublineaModel();
    }

    public SubLineaController(Frame parent) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        String descripcion = "";

        if (event.getSource() == this.vista.btnGuardar) {
            descripcion = VistaSublinea.seletLinea.getSelectedItem().toString();

            resultado = modelo.pInsertarSubLinea(
                    vista.txtcodigoSubLinea.getText().replaceAll("\\s", ""),
                    vista.txtDescripcionSubLinea.getText(),
                    descripcion,
                    vista.txtCampo1.getText(), vista.txtcampo2.getText(),
                    Vistaprincipal.lblNombreUsuario1.getText(), //sCo_Us_In
                    Vistaprincipal.lblNombreSucursal.getText(), //sCo_Sucu_In
                    "", 
                    "", //sCo_Reten
                    "" //sI_Subl_Des
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                this.vista.setterCampos();
                try {
                    vista.setModel();
                } catch (SQLException ex) {
                    Logger.getLogger(SubLineaController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (event.getSource() == this.vista.btnactulizar) {
            descripcion = VistaSublinea.seletLinea.getSelectedItem().toString();

            resultado = modelo.pActualizarSubLinea(vista.txtcodigoSubLinea.getText(),
                    vista.txtDescripcionSubLinea.getText(), descripcion,
                    vista.txtCampo1.getText(), vista.txtcampo2.getText(),
                    "",
                    "",
                    "",
                    Vistaprincipal.lblNombreUsuario1.getText(),//sCo_Us_Mo
                    Vistaprincipal.lblNombreSucursal.getText()//sCo_Sucu_Mo
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                this.vista.setterCampos();
                try {
                    vista.setModel();
                } catch (SQLException ex) {
                    Logger.getLogger(SubLineaController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (event.getSource() == this.vista.btnEliminar) {

            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                resultado = modelo.pEliminarSubLinea(vista.txtcodigoSubLinea.getText());
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                    this.vista.setterCampos();
                    try {
                        vista.setModel();
                    } catch (SQLException ex) {
                        Logger.getLogger(SubLineaController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } else {
                return;
            }
        } else if (event.getSource() == this.vista.btnNuevo) {
            this.vista.txtcodigoSubLinea.setEnabled(true);
            this.vista.setterCampos();
            this.vista.btnGuardar.setEnabled(true);
            this.vista.btnEliminar.setEnabled(false);
            this.vista.btnactulizar.setEnabled(false);
        } else if (event.getSource() == this.vista.btnAceptarSubLinea) {
            int selection = vista.jtableSubLinea.getSelectedRow();
            if (selection != -1) {
                vista.txtcodigoSubLinea.setText(vista.jtableSubLinea.getValueAt(selection, 0).toString());
                vista.txtDescripcionSubLinea.setText(vista.jtableSubLinea.getValueAt(selection, 0).toString());
            }
            vista.jDialogSubLinea.dispose();
        } else if (event.getSource() == this.vista.btnCancelarSubLinea) {
            vista.jDialogSubLinea.dispose();
        }

    }
//        }else if (event.getSource() == this.vista2.btAceptar) {
//            vista.txtCoLinea.setText("23");
//            vista2.dispose();
//        }

    public void cagarSubLinea() {
        try {
            vista.jtableSubLinea.setModel(new ModeloTablaSubLinea(new SublineaModel().listaSubLineas()));
        } catch (SQLException ex) {
            Logger.getLogger(SubLineaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
