/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.SaAjustesBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AVentura
 */
public class ModeloTablaAjuste extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion", "fecha"};
    ArrayList<SaAjustesBO> lista = new ArrayList<>();

    public ModeloTablaAjuste(ArrayList<SaAjustesBO> lista) {
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
                return lista.get(fila).getAjue_num();

            case 1:
                return lista.get(fila).getMotivo();
            case 2:
                return lista.get(fila).getFecha();

            default:
                return null;

        }
    }
}
