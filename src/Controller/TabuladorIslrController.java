/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.TabuladorIsLrRengBO;
import Beans.TabuladorIslrBO;
import Model.ModeloTablaTabuladorRenglon;
import Model.ModelotabuladorIslr;
import Model.TabuladorIslrModel;
import Utilitarios.Utilitario;
import Vista.VistaTabuladorIsLr;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AranaV
 */
public class TabuladorIslrController implements ActionListener, KeyListener {

    VistaTabuladorIsLr vista;
    int resultado;
    TabuladorIslrModel modelo;
    public ArrayList<TabuladorIslrBO> listaTabulador;
    public ArrayList<TabuladorIsLrRengBO> listaTabuladorIslrBORenglon;
    ModeloTablaTabuladorRenglon modeloTablaTabuladorRenglon = new ModeloTablaTabuladorRenglon();
            
    public int selection = 0;

    public TabuladorIslrController(VistaTabuladorIsLr vista) {
        this.vista = vista;
        modelo = new TabuladorIslrModel();
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        if (event.getSource().equals(vista.btnGuardar)) {

            resultado = modelo.pInsertarTabuladorIslr(
                    vista.txtCodigo.getText(),
                    vista.txtDescripcionTabulador.getText(),
                    vista.combTipoPersona.getSelectedItem().toString(),
                    vista.txtCampo1.getText(),
                    vista.txtCampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtCampo4.getText(),
                    vista.txtCampo5.getText(),
                    vista.txtCampo6.getText(),
                    "Campo7",
                    "Campo8",
                    Vistaprincipal.tempUsuario,
                    Vistaprincipal.tempSucrsal,
                    "1", "1", Utilitarios.Utilitario.nombreHost());
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }

        } else if (event.getSource().equals(vista.btnactulizar)) {

            resultado = modelo.pActualizarTabuladorIslr(
                    vista.txtCodigo.getText(),
                    vista.txtCodigo.getText(),
                    vista.txtDescripcionTabulador.getText(),
                    vista.combTipoPersona.getSelectedItem().toString(),
                    vista.txtCampo1.getText(),
                    vista.txtCampo2.getText(),
                    vista.txtCampo3.getText(),
                    vista.txtCampo4.getText(),
                    vista.txtCampo5.getText(),
                    vista.txtCampo6.getText(),
                    "Campo7",
                    "Campo8",
                    Vistaprincipal.tempUsuario,
                    Vistaprincipal.tempSucrsal,
                    Utilitario.nombreHost(),
                    "Ca",
                    "1",
                    "1"
                   );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Actualizado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vista.settearCampos();
            }
        } else if (event.getSource().equals(vista.btnEliminar)) {
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                resultado = modelo.pEliminarTabuladorIslr(vista.txtCodigo.getText(),
                        Utilitario.nombreHost(),
                        Vistaprincipal.tempUsuario,
                        Vistaprincipal.tempSucrsal);
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                    vista.settearCampos();
                }
            }

        } else if (event.getSource().equals(vista.btnBuscarTabulador)) {
            cargarTabuladorIsLr(Vistaprincipal.tempEmpresa,
                    "saTabuladorIslr",
                    "tab_des",
                    "",
                    "2");
            vista.jDialogTabulador.setSize(472, 358);
            vista.jDialogTabulador.setLocationRelativeTo(null);
            vista.jDialogTabulador.setVisible(true);

        } else if (event.getSource().equals(vista.btnNuevo)) {
            vista.settearCampos();
            cargarTabuladorIsLrRenglon(null);
        } else if (event.getSource().equals(vista.btnImprimir)) {

        } else if (event.getSource().equals(vista.btnCancelarTabu)) {
            vista.jDialogTabulador.dispose();
        } else if (event.getSource().equals(vista.btnAceptarTabulador)) {
            selection = vista.jtableTabulador.getSelectedRow();

            if (selection == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar un Registro", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                listaTabulador = modelo.pObtenerListadoDatos(
                        Vistaprincipal.tempEmpresa,
                        "saTabuladorIslr",
                        "co_tab",
                        vista.jtableTabulador.getValueAt(selection, 0).toString(),
                        "2");
                vista.txtCampo1.setText(listaTabulador.get(0).getCampo1());
                vista.txtCampo2.setText(listaTabulador.get(0).getCampo2());
                vista.txtCampo3.setText(listaTabulador.get(0).getCampo3());
                vista.txtCampo4.setText(listaTabulador.get(0).getCampo4());
                vista.txtCampo5.setText(listaTabulador.get(0).getCampo5());
                vista.txtCampo6.setText(listaTabulador.get(0).getCampo6());
                vista.txtCodigo.setText(listaTabulador.get(0).getCo_tab().replaceAll("\\s", ""));
                vista.txtDescripcionTabulador.setText(listaTabulador.get(0).getTab_des());
                vista.btnEliminar.setEnabled(true);
                vista.btnactulizar.setEnabled(true);
                vista.btnGuardar.setEnabled(true);
                cargarTabuladorIsLrRenglon(listaTabulador.get(0).getCo_tab().replaceAll("\\s", ""));
                vista.jDialogTabulador.dispose();
                
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void cargarTabuladorIsLr(String Database_Name, String Table_Name, String sField_Name, String sValor, String iOpcion) {
        listaTabulador = modelo.pObtenerListadoDatos(Database_Name, Table_Name, sField_Name, sValor, iOpcion);
        vista.jtableTabulador.setModel(new ModelotabuladorIslr(listaTabulador)
        );

    }
    public void cargarTabuladorIsLrRenglon(String co_tab){
        listaTabuladorIslrBORenglon = new ArrayList<>();
        listaTabuladorIslrBORenglon =modelo.pSeleccionarTabuladorIslrRenglon(co_tab);
//        System.out.println("Cargar Tabulador:::" + listaTabuladorIslrBORenglon.get(0).getPorc_ret()); 
        modeloTablaTabuladorRenglon.setListaTabuladorIsLrRenglon(listaTabuladorIslrBORenglon);
        vista.jTableTabuladorRenglon.setModel(modeloTablaTabuladorRenglon);
        modeloTablaTabuladorRenglon.refrescarTable();
        
        
    }
}
