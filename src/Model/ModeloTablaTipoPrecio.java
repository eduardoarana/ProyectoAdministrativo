/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.TipoPrecioBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AranaV
 */
public class ModeloTablaTipoPrecio extends AbstractTableModel {

    public static String[] nombresCol = {"Código Precio", "Descripción Precio"};
    ArrayList<TipoPrecioBO> lista;

    public ModeloTablaTipoPrecio(ArrayList<TipoPrecioBO> lista) {
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

    public String getColumnName(int col) {
        return nombresCol[col].toString();
    }

    @Override
    public Object getValueAt(int fila, int columna) {

        switch (columna) {
            case 0:
                return lista.get(fila).getCo_precio();
            case 1:
                return lista.get(fila).getDes_precio();
            default:
                return null;
        }
    }

}
