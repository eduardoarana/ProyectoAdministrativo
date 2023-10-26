/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.CotizacionClienteBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aranaVentur
 */
public class ModeloTablaCotizacion extends AbstractTableModel {

    public static String[] nombresCol = {"Número", "Cliente",  "Saldo", "Status"};
    public ArrayList<CotizacionClienteBO> lista;

    public ModeloTablaCotizacion(ArrayList<CotizacionClienteBO> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {

        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return nombresCol.length;
    }

    @Override
    public String getColumnName(int col) {
        return nombresCol[col];
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch (columna) {
            case 0:
                return lista.get(fila).getDoc_num();
            case 1:
                return lista.get(fila).getCo_cli();
          
            case 2 :
                return lista.get(fila).getSaldo();
            case 3 :
                return lista.get(fila).getStatus();
            default:
                return null;
        }
    }
}
