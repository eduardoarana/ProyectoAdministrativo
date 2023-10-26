/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ArtUnidadBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AranaV
 */
public class ModeloTablaArtUnidad extends AbstractTableModel {

    public static String[] nombresCol = {"Unidad", "Descripcion", "P.Primaria", "Primaria", "Inversa", "Equivalencia", "Nro.Decimales"};
    ArrayList<ArtUnidadBO> lista;

    public ModeloTablaArtUnidad(ArrayList<ArtUnidadBO> lista) {
        this.lista = lista;
    }

    public void setListaArtUnidad(ArrayList<ArtUnidadBO> lista) {
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
    public Object getValueAt(int fila, int columna) {

        switch (columna) {
            case 0:
                return lista.get(fila).getCo_uni();
            case 1:
                return lista.get(fila).getCo_art();
            default:
                return null;
        }
    }
}
