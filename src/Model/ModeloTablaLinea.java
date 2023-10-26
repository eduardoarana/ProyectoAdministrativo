/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.LineaBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author earana
 */
public class ModeloTablaLinea extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion","Comision Ventas","Comision Cobros" };
    ArrayList<LineaBO> listaLineas;

    public ModeloTablaLinea(ArrayList<LineaBO> listaLineas) {
        this.listaLineas = listaLineas;
    }

    @Override
    public int getRowCount() {
        return listaLineas.size();
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
                return listaLineas.get(fila).getCo_lin();
            case 1:
                return listaLineas.get(fila).getLin_des();
            case 2:
                return listaLineas.get(fila).getComi_lin();
            case 3:
                return listaLineas.get(fila).getComi_lin2();
            default:
                return null;
        }
    }
}
