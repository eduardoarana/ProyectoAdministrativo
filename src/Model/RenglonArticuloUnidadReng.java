/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ArtUnidadBO;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author jenny
 */
public class RenglonArticuloUnidadReng implements TableModel {

    public List<ArtUnidadBO> articulos;

    public RenglonArticuloUnidadReng(List<ArtUnidadBO> articulos) {
        this.articulos = articulos;
    }

    @Override
    public int getRowCount() {
        return articulos.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        switch (columnIndex) {
            case 0: {
                titulo = "ID";
                break;
            }
            case 1: {
                titulo = "Auxiliar";
                break;
            }

        }
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int roowIndex, int columnIndex) {
        return columnIndex != 0;
    }

    @Override
    public Object getValueAt(int roowIndex, int columnIndex) {
        String valor = null;
        ArtUnidadBO art = articulos.get(roowIndex);
        switch (columnIndex) {
            case 0: {
                valor = art.getCo_art();
                break;
            }
            case 1: {
                valor = art.getCampoAuxiliar();
                break;
            }
        }
        return valor;

    }

    @Override
    public void setValueAt(Object aValue, int roowIndex, int columnIndex) {
       ArtUnidadBO art = articulos.get(roowIndex);
       switch (columnIndex) {
            case 0: {
                art.setCo_art(aValue.toString());
                break;
            }
            case 1: {
               art.setCampoAuxiliar(aValue.toString());
                break;
            }
        }
    }

    @Override
    public void addTableModelListener(TableModelListener tl) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener tl) {
        articulos.remove(tl);
    }
    public void addRow(ArtUnidadBO p){
        this.articulos.add(p);
       // this.fireTableDataChanged();
    }

}
