/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.UnidadBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author earana
 */
public class ModeloTablaUnidad extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion"};
    ArrayList<UnidadBO> listaUnidad;

    public ModeloTablaUnidad(ArrayList<UnidadBO> listaUnidad) {
        this.listaUnidad = listaUnidad;
    }

    public void setListaUnidad(ArrayList<UnidadBO> listaUnidad) {
        this.listaUnidad = listaUnidad;
    }

    @Override
    public int getRowCount() {
        return listaUnidad.size();
    }
     public String getColumnName(int col) {
        return nombresCol[col].toString();
    }


    @Override
    public int getColumnCount() {
        return nombresCol.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {

        switch (columna) {
            case 0:
                return listaUnidad.get(fila).getCo_uni();
            case 1:
                return listaUnidad.get(fila).getDes_uni();
            default:
                return null;
        }
    }
}
