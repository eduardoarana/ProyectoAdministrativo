/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.CategoriaBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author earana
 */
public class ModeloTablaCategoria extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion", "validador"};
    ArrayList<CategoriaBO> lista;

    public ModeloTablaCategoria(ArrayList<CategoriaBO> lista) {
        this.lista = lista;
    }

    public void setLista(ArrayList<CategoriaBO> lista) {
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
                return lista.get(fila).getCo_cat();
            case 1:
                return lista.get(fila).getCat_des();

            default:
                return null;
        }
    }
}
