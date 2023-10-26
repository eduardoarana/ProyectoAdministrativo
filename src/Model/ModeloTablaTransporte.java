/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.TransportesBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AranaV
 */
public class ModeloTablaTransporte extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion"};

    ArrayList<TransportesBO> lista;

    public ModeloTablaTransporte(ArrayList<TransportesBO> lista) {
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
                return lista.get(fila).getCo_tran();
            case 1:
                return lista.get(fila).getDes_tran();
            default:
                return null;
        }
    }
}
