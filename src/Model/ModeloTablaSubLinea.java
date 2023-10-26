/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.SubLineaBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author earana
 */
public class ModeloTablaSubLinea extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion", " IDlinea"};
    ArrayList<SubLineaBO> lista;

    public ModeloTablaSubLinea(ArrayList<SubLineaBO> lista) {
        this.lista = lista;

    }

    public void setLista(ArrayList<SubLineaBO> lista) {
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
                return lista.get(fila).getCo_subl();

            case 1:
                return lista.get(fila).getSubl_des();
            case 2:
                return lista.get(fila).getCo_lin();
            default:
                return null;
        }
    }
}
