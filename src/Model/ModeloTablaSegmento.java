/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.SegmentoBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author earana
 */
public class ModeloTablaSegmento extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion"};
    ArrayList<SegmentoBO> lista = null;

    public ModeloTablaSegmento(ArrayList<SegmentoBO> lista) {
        this.lista = lista;
    }

    public void setLista(ArrayList<SegmentoBO> lista) {
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
                return lista.get(fila).getCo_seg();
            case 1:
                return lista.get(fila).getSeg_des();
            default:
                return null;

        }
    }

}
