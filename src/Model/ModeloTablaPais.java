/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.PaisBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AranaV
 */
public class ModeloTablaPais extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion"};
    ArrayList<PaisBO> listaPais;

    public ModeloTablaPais(ArrayList<PaisBO> listaPais) {
        this.listaPais = listaPais;
    }

    @Override
    public int getRowCount() {
        return listaPais.size();
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
                return listaPais.get(fila).getCo_pais();
            case 1:
                return listaPais.get(fila).getPais_des();
            default:
                return null;
        }
    }
}
