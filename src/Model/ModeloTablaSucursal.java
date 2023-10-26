/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.SucursalBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Desarrollo
 */
public class ModeloTablaSucursal extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion"};

    ArrayList<SucursalBO> lista;

    public ModeloTablaSucursal(ArrayList<SucursalBO> listas) {
        this.lista = listas;
    }

    public void setLista(ArrayList<SucursalBO> lista) {
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
                return lista.get(fila).getCo_sucur();
            case 1:
                return lista.get(fila).getSucur_des();
            default:
                return null;
        }

    }

}
