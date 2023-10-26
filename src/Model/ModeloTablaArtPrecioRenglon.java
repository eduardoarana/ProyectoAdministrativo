/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ArtPrecioBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jenny
 */
public class ModeloTablaArtPrecioRenglon extends AbstractTableModel {

    private final String[] nombresCol;
    private final Class[] tipoColumnas;
    private ArrayList<ArtPrecioBO> listaPrecio = new ArrayList<ArtPrecioBO>();

    public ArrayList<ArtPrecioBO> getListaArtPrecio() {
        return listaPrecio;
    }

    public void setArrayListaartPrecio(ArrayList<ArtPrecioBO> listaPrecio) {
        this.listaPrecio = listaPrecio;
    }

    public ModeloTablaArtPrecioRenglon() {
        this.nombresCol = new String[]{"Tipo Precio", "Precio", "Almacen", "Desde", "Hasta", "Moneda", "Inactivo"};
        this.tipoColumnas = new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class};
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return tipoColumnas[columnIndex];
    }

    @Override
    public int getRowCount() {
        return listaPrecio.size();
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
                return listaPrecio.get(fila).getCo_precio();
            case 1:
                return listaPrecio.get(fila).getMonto();
            case 2:
                return listaPrecio.get(fila).getCo_alma_calculado();
            case 3:
                return listaPrecio.get(fila).getDesde();
            case 4:
                return listaPrecio.get(fila).getHasta();
            case 5:
                return listaPrecio.get(fila).getCo_mone();
            case 6:
                return false; //listaPrecio.get(fila).getInactivo();
            default:
                return null;
        }
    }

    public void addRow(ArtPrecioBO bo) {
        listaPrecio.add(bo);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.listaPrecio.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public void refrescarTable() {
        this.fireTableDataChanged();
    }
}
