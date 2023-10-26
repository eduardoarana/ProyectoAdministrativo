/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ImpuestoSobreVentaRengBO;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aranaVentur
 */
public class ModeloTablaImpuestoSobreVentaRenglon extends AbstractTableModel {

    private boolean[] editable ={false ,false ,true ,true ,true} ;
    private final String[] nombresCol;
    private final Class[] tipoColumnas;
    private ArrayList<ImpuestoSobreVentaRengBO> lista = new ArrayList<ImpuestoSobreVentaRengBO>();

    public ModeloTablaImpuestoSobreVentaRenglon() {
        this.nombresCol = new String[]{"Reng", "Codigo", "Ventas", "Compras", "%tasa"};
        this.tipoColumnas = new Class[]{Integer.class, String.class, Boolean.class, Boolean.class, Integer.class};
    }
    

    public void setlista(ArrayList<ImpuestoSobreVentaRengBO> lista) {
        this.lista = lista;
    }
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return tipoColumnas[columnIndex];
    }

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
                return lista.get(fila).getTipo_imp();
            case 2:
                return lista.get(fila).getVentas().equals("1") ? true :false  ; // lista.get(fila).getVentas();
            case 3:
                return lista.get(fila).getCompras().equals("1") ? true :false  ;  //lista.get(fila).getCompras();
            case 4:
                return lista.get(fila).getPorc_tasa();
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
                lista.get(rowIndex).setTipo_imp(aValue.toString());
                break;
            case 2:
                lista.get(rowIndex).setVentas(aValue.toString());
                break;
            case 3:
                lista.get(rowIndex).setCompras(aValue.toString());
                break;
            case 4:
                lista.get(rowIndex).setPorc_tasa(aValue.toString());
                break;
        }
    }
    
       public void addRow(ImpuestoSobreVentaRengBO impuestoSobreVentaRengBO) {
        lista.add(impuestoSobreVentaRengBO);
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
       
        return editable[column];
      
         //To change body of generated methods, choose Tools | Templates.
    }
     public void limpiarRengloTabla(int cantLineas){
        for (int i = 0; i < cantLineas; i++) {
            this.removedRow(0);
            System.out.println("cantidad de veces " + i);
        }
    }
     
}
