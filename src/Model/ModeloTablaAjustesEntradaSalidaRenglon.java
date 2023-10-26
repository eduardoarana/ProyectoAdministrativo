/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.SaAjusteRengBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jenny
 */
public class ModeloTablaAjustesEntradaSalidaRenglon extends AbstractTableModel {

    private final String[] nombresCol;
    private final Class[] tipoColumnas;
    private ArrayList<SaAjusteRengBO> lista = new ArrayList<SaAjusteRengBO>();

    public ModeloTablaAjustesEntradaSalidaRenglon() {
        this.nombresCol = new String[]{"Reng", "Tipo", "Articulo", "Descripcion", "Modelo", "Almacen1", "Unidad", "Cantidad", "Costo Unit", "Costo Total"}; //, "P.Primaria", "Primaria", "Invertida", "Equivalecnia", "NªDecimales"};
        this.tipoColumnas = new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class,String.class};
    }

    public void setlistaAjustesES(ArrayList<SaAjusteRengBO> lista) {
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

        switch (columna){
            case 0:
                return lista.get(fila).getReng_num();
            case 1:
                return lista.get(fila).getCo_tipo();
            case 2:
                return lista.get(fila).getCo_art();
            case 3:
                return lista.get(fila).getArt_des();
            case 4:
                return lista.get(fila).getModelo();
            case 5:
                return lista.get(fila).getCo_alma();
            case 6:
                return lista.get(fila).getCo_uni();
            case 7:
                return lista.get(fila).getCantidad();
            case 8:
                return lista.get(fila).getCost_unit();
            case 9:
                return lista.get(fila).getCostoTotal();
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
                lista.get(rowIndex).setCo_tipo(aValue.toString());
                break;
            case 2:
                lista.get(rowIndex).setCo_art(aValue.toString());
                break;
            case 3:
                lista.get(rowIndex).setArt_des(aValue.toString());
                break;
            case 4:
                lista.get(rowIndex).setModelo(aValue.toString());
                break;
            case 5:
                lista.get(rowIndex).setCo_alma(aValue.toString());
                break;
            case 6:
                lista.get(rowIndex).setCo_uni(aValue.toString());
                break;
            case 7:
                lista.get(rowIndex).setCantidad(aValue.toString());
                break;
            case 8:
                lista.get(rowIndex).setCost_unit(aValue.toString());
                break;
            case 9:
                lista.get(rowIndex).setCostoTotal(Double.parseDouble(aValue.toString()));
                break;
   //      this.fireTableCellUpdated(rowIndex, columnIndex);
//        this.fireTableRowsUpdated(rowIndex, rowIndex);

        }
    }

    public void addRow(SaAjusteRengBO ajustesESBO) {
        lista.add(ajustesESBO);
        this.fireTableDataChanged();
    }

    public void removedRow(int linea) {
        this.lista.remove(linea);
        this.fireTableRowsDeleted(linea, linea);
    }

    public void refrescarTable() {
        this.fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        if(column !=9){
        return true;
        }
        else 
            return false;
         //To change body of generated methods, choose Tools | Templates.
    }
    
    public void limpiarRengloTabla(int cantLineas){
        for (int i = 0; i < cantLineas; i++) {
            this.removedRow(0);
            System.out.println("cantidad de veces " + i);
        }
    }
}
