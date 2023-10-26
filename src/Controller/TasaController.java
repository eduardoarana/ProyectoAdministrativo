/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TasaModelo;
import Utilitarios.Utilitario;
import Vista.VistaMoneda;
import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author AVentura
 */
public class TasaController implements ActionListener {

    VistaMoneda vistaMoneda;
    TasaModelo tasaModelo;
    MonedaController monedaController;

    public TasaController(VistaMoneda vista) {
        this.vistaMoneda = vista;
        tasaModelo = new TasaModelo();
        monedaController = new MonedaController();
        vista.settearCamposTasa();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        int resultado = 0;
        if (event.getSource() == vistaMoneda.btnGuardarTasa) {
            
            resultado = tasaModelo.pInsertarTasa(vistaMoneda.txtcodigoMoneda.getText(),
                    Utilitario.obtenerFecha(vistaMoneda.fecha),
                    vistaMoneda.txtTasCompra.getText(),
                    vistaMoneda.txtTasaVenta.getText(), vistaMoneda.txtCampo1.getText(),
                    vistaMoneda.txtcampo2.getText(),
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    Vistaprincipal.lblNombreUsuario1.getText(), //sCo_Us_In,
                    Vistaprincipal.lblNombreSucursal.getText(),//sCo_Sucu_In,
                    Utilitarios.Utilitario.nombreHost(),//sMaquina,
                    "0",//sTrasnfe,
                    "1" //sRevisado
            );
            if (resultado != 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Se ha Guardado Satisfactoriamente", "Software", JOptionPane.INFORMATION_MESSAGE);
                vistaMoneda.settearCamposTasa();
                monedaController.cargarDatosTasa(vistaMoneda.txtcodigoMoneda.getText());
            }
        } else if (event.getSource() == vistaMoneda.btnEliminarTasa) {
            String tasa_c="" , fecha ="";
            int selectcion = vistaMoneda.jtablaTasa.getSelectedRow();
            String sCadenaFecha = "";
           String sSubCadenaFecha ="";
          
            
            if (selectcion == -1) {
                JOptionPane.showMessageDialog(new JFrame(), "Debe seleccionar una Tasa", "Software", JOptionPane.INFORMATION_MESSAGE);
                return;
            }else {
            tasa_c = vistaMoneda.jtablaTasa.getValueAt(selectcion, 0).toString().replaceAll("\\s", "") ;
             sCadenaFecha= vistaMoneda.jtablaTasa.getValueAt(selectcion, 2).toString().replaceAll("\\s", "") ;
             sSubCadenaFecha  = sCadenaFecha.substring(0,10);
            }
            
            if (JOptionPane.showConfirmDialog(null, "Está seguro que desea realizar esta acción", "WARNING",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
               
                
                resultado = tasaModelo.pEliminarTasa(
                        vistaMoneda.txtcodigoMoneda.getText(),//sCo_MoneOri,
                        sSubCadenaFecha,
                        Utilitarios.Utilitario.nombreHost(),
                        Vistaprincipal.lblNombreUsuario1.getText(),// sCo_Us_Mo,
                        Vistaprincipal.lblNombreSucursal.getText()// sCo_Sucu_Mo
                );
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Se ha Eliminado Satisfactoriamente", "Software", JOptionPane.ERROR_MESSAGE);
                    vistaMoneda.settearCamposTasa();
                     monedaController.cargarDatosTasa(vistaMoneda.txtcodigoMoneda.getText());
                    
                }
            } else {
                return;
            }
        }
    }
}
