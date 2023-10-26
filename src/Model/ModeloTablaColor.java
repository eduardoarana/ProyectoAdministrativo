/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ColorBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author earana
 */
public class ModeloTablaColor extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion"};
    ArrayList<ColorBO> listaColores;

    public ModeloTablaColor(ArrayList<ColorBO> lista) {
        this.listaColores = lista;
    }

    public void setLista(ArrayList<ColorBO> listas) {
        this.listaColores = listas;
    }

    @Override
    public int getRowCount() {
        return listaColores.size();
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
        //return valoresCol[fila][columna];

        switch (columna) {
            case 0:
                return listaColores.get(fila).getCo_color();
            case 1:
                return listaColores.get(fila).getDes_color();
            
            default:
                return null;
        }
    }
}