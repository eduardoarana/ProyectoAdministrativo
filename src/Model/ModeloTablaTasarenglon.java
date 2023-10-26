/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.TasaBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AVentura
 */
public class ModeloTablaTasarenglon extends AbstractTableModel {

    private final String[] nombresCol;
    private final Class[] tipoColumnas;
    private ArrayList<TasaBO> lista = new ArrayList<TasaBO>();

    public ModeloTablaTasarenglon() {
        this.nombresCol = new String[]{"Tasa Venta", "Tasa Compra" ,"Fecha"};
        this.tipoColumnas = new Class[]{String.class, String.class, String.class};
    }
    public void setlistaTasa(ArrayList<TasaBO> lista) {
        this.lista = lista;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return tipoColumnas[columnIndex];
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }
    
    @Override
    public String getColumnName(int col) {
        return nombresCol[col];
    }

    @Override
    public int getColumnCount() {
        return nombresCol.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch (columna) {
            case 0:
                return lista.get(fila).getTasa_v();
            case 1:
                return lista.get(fila).getTasa_c();
            case 2:
                return lista.get(fila).getFecha();
            
            default:
                return null;
        }
    }
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                lista.get(rowIndex).setTasa_v(aValue.toString());
                break;
            case 1:
                lista.get(rowIndex).setTasa_c(aValue.toString());
                break;
            case 2 :
                lista.get(rowIndex).setFecha(aValue.toString());
                break ;
        }
    }
    public void addRow(TasaBO tasaBO) {
        lista.add(tasaBO);
        this.fireTableDataChanged();
    }
    public void removedRow(int linea) {
        this.lista.remove(linea);
        this.fireTableRowsDeleted(linea, linea);
    }
    public void refrescarTable() {
        this.fireTableDataChanged();
    }
}
