/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.TabuladorIsLrRengBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author EArana
 */
public class ModeloTablaTabuladorRenglon extends AbstractTableModel {

    private final String[] nombresCol;
    private final Class[] tipoColumnas;
    public ArrayList<TabuladorIsLrRengBO> lista = new ArrayList<TabuladorIsLrRengBO>();

    public ModeloTablaTabuladorRenglon() {
        this.nombresCol = new String[]{"Reng", "Concepto", "Descripcion", "Base Imp", "Retencion", "Sustraendo"}; //, "P.Primaria", "Primaria", "Invertida", "Equivalecnia", "NªDecimales"};
        this.tipoColumnas = new Class[]{String.class, String.class, String.class, String.class, String.class, String.class};
    }

    public void setListaTabuladorIsLrRenglon(ArrayList<TabuladorIsLrRengBO> lista) {
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
    public int getColumnCount() {
        return nombresCol.length;
    }

    @Override
    public String getColumnName(int col) {
        return nombresCol[col];
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch (columna) {
            case 0:
                return lista.get(fila).getReng_num();

            case 1:
                return lista.get(fila).getCo_islr();
            case 2:
                return lista.get(fila).getIslr_des();
            case 3:
                return lista.get(fila).getPorc_imp();
            case 4:
                return lista.get(fila).getPorc_ret();
            case 5:
                return lista.get(fila).getSustraen();
            default:
                return null;
        }

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                lista.get(rowIndex).setReng_num(aValue.toString());
                break;

            case 1:
                lista.get(rowIndex).setCo_islr(aValue.toString());

            case 2:
                lista.get(rowIndex).setFe_us_mo(aValue.toString());
        }
    }

    public void addRow(TabuladorIsLrRengBO tabuladorIsLrRengBO) {
        lista.add(tabuladorIsLrRengBO);
        this.fireTableDataChanged();
    }

    public void removedRow(int linea) {
        this.lista.remove(linea);
        this.fireTableRowsDeleted(linea, linea);
    }

    public void refrescarTable() {
        this.fireTableDataChanged();
    }

    public void limpiarRengloTabla(int cantLineas) {
        for (int i = 0; i < cantLineas; i++) {
            this.removedRow(0);
            System.out.println("cantidad de veces " + i);
        }
    }
}
