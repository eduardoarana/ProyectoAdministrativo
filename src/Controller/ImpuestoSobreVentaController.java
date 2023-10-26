/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Beans.ImpuestoSobreVentaRengBO;
import Encabezado.GenionarEncabezado;
import Model.ImpuestoValorAgregadoModelo;
import Model.ModeloTablaImpuestoSobreVentaRenglon;
import Vista.VistaImpuestoValorAgregado;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.JTableHeader;
import proyectoadministrativo.GestionCeldas;

/**
 *
 * @author aranaVentur
 */
public class ImpuestoSobreVentaController implements ActionListener {

    VistaImpuestoValorAgregado vista;
    ImpuestoValorAgregadoModelo modelo;
    ModeloTablaImpuestoSobreVentaRenglon impuestoSobreVentaRenglon = new ModeloTablaImpuestoSobreVentaRenglon();

    public ImpuestoSobreVentaController(VistaImpuestoValorAgregado vista) {
        this.vista = vista;
        modelo = new ImpuestoValorAgregadoModelo();
        cargarDatosImpuestosSobreVentasRenglon("20070301");
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(vista.btnGuardar)) {

        } else if (event.getSource().equals(vista.btnEliminar)) {

        }
    }

    public void cargarDatosImpuestosSobreVentasRenglon(String fecha) {

        ArrayList<ImpuestoSobreVentaRengBO> lista = new ArrayList<>();
        lista = modelo.pSeleccionarRenglonesImpuestoSobreVenta("20070301");
        impuestoSobreVentaRenglon.setlista(lista);
        // se personaliza las celdas 
        vista.jTableImpuestoSobreVentaRenglon.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("numerico"));
        vista.jTableImpuestoSobreVentaRenglon.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("numerico"));
        vista.jTableImpuestoSobreVentaRenglon.getTableHeader().setReorderingAllowed(false);
        vista.jTableImpuestoSobreVentaRenglon.setRowHeight(25);
        vista.jTableImpuestoSobreVentaRenglon.setGridColor(new Color(0, 1, 0));
        // se define el tamaño de largo para cada Columna
        vista.jTableImpuestoSobreVentaRenglon.getColumnModel().getColumn(0).setPreferredWidth(24);

        //personalizar el Encabezado
        JTableHeader jTableHeader = vista.jTableImpuestoSobreVentaRenglon.getTableHeader();
        jTableHeader.setDefaultRenderer(new GenionarEncabezado());
        vista.jTableImpuestoSobreVentaRenglon.setTableHeader(jTableHeader);
        vista.jTableImpuestoSobreVentaRenglon.setModel(impuestoSobreVentaRenglon);

        impuestoSobreVentaRenglon.refrescarTable();
    }
}
