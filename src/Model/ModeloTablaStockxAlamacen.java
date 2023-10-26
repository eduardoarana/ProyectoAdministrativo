/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.StockxAlmacenBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AranaV
 */
public class ModeloTablaStockxAlamacen extends AbstractTableModel {

    public static String[] nombresCol = {"Almacen", "Actual.P", "Por LLegar", "Comprom.P", "Por Despa", "Actual S", "X llegar S", "Comprom S"};
    private ArrayList<StockxAlmacenBO> lista = new ArrayList<>();

    public ModeloTablaStockxAlamacen(ArrayList<StockxAlmacenBO> lista) {
        this.lista = lista;
    }

    public void setListaStockxAlamcen(ArrayList<StockxAlmacenBO> lista) {
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
                return lista.get(fila).getCo_alma();
            case 1:
                return lista.get(fila).getStock_act();

            case 2:
                return lista.get(fila).getStock_lle();

            case 3:
                return lista.get(fila).getStock_com();

            case 4:
                return lista.get(fila).getStock_des();
            case 5:
                return lista.get(fila).getSstock_act();
                
            case 6 :
                return lista.get(fila).getSstock_lle();
                
            case 7 :
                return lista.get(fila).getSstock_com();
            default:
                return null;
        }
    }
}
