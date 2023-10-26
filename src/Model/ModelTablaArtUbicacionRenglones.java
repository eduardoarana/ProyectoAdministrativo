/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ArtUbicacionBO;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author eduardo
 */
public class ModelTablaArtUbicacionRenglones extends AbstractTableModel {

    private final String[] nombresCol;
    private final Class[] tipoColumnas;
    private ArrayList<ArtUbicacionBO> lista = new ArrayList<ArtUbicacionBO>();

    public ModelTablaArtUbicacionRenglones() {
        this.nombresCol = new String[]{"Almacén", "Ubicación", "Ubicación 2", "Ubicación 3", "Descripcion", "Orden"};
        this.tipoColumnas = new Class[]{String.class, String.class, String.class, String.class, String.class, String.class};
    }

    public ArrayList<ArtUbicacionBO> getListaArtUbicacion() {
        return lista;
    }

    public void setListaArtUbicacion(ArrayList<ArtUbicacionBO> listaArtUbicacion) {
        this.lista = listaArtUbicacion;
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
        switch (columna) {
            case 0:
                return lista.get(fila).getCo_alma();
            case 1:
                return lista.get(fila).getCo_ubicacion();
            case 2:
                return lista.get(fila).getCo_ubicacion2();
            case 3:
                return lista.get(fila).getCo_ubicacion3();
            case 4:
                return lista.get(fila).getDes_ubicacion();
            case 5:
                return lista.get(fila).getOrden();
            default:
                return null;
        }
    }

    public void addRow(ArtUbicacionBO artUbicacion) {
        this.lista.add(artUbicacion);
        this.fireTableDataChanged();
    }
    public void removeRow(int fila) {
        this.lista.remove(fila);
        this.fireTableRowsDeleted(fila, fila);
    }

      public void refrescarTable(){
      this.fireTableDataChanged();
      }
}
