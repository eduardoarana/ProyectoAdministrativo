/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.EmpresaModel;
import Vista.VistaEmpresa;
import Vista.VistaSucursalPrincipal;
import Vista.Vistaprincipal;
//import Vista.Vistaprincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Desarrollo
 */
public class EmpresaController implements ActionListener {

    VistaEmpresa vista;
    VistaSucursalPrincipal vistaSucursalPrincipal;
//    Vistaprincipal vistaprincipal; 
    EmpresaModel modelo;

    public EmpresaController(VistaEmpresa vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(vista.btnAceptar)) {
            String empresa = vista.jComboEmpresas.getSelectedItem().toString();
            System.out.println("empresa Seleccionada" + empresa);
             modelo = new EmpresaModel();
            System.out.println(modelo.pObtenerMpEmpresa(empresa, 2).get(0).getCod_empresa());

            Vistaprincipal.tempEmpresa = modelo.pObtenerMpEmpresa(empresa, 2).get(0).getCod_empresa();
            vistaSucursalPrincipal = new VistaSucursalPrincipal();
            //vistaSucursal.setSize(200, 400);
            vistaSucursalPrincipal.setVisible(true);
            vistaSucursalPrincipal.setLocationRelativeTo(null);
//          vistaprincipal = new Vistaprincipal();
//          vistaprincipal.setVisible(true);
            vista.dispose();
        }
    }
}
