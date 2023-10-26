/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.FacturaCompraRengBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author EArana
 */
public class ModeloTablaFacturaCompraRenglon extends AbstractTableModel {

     private final String[] nombresCol;
    private final Class[] tipoColumnas;
     private ArrayList<FacturaCompraRengBO> lista = new ArrayList<FacturaCompraRengBO>();

    public ModeloTablaFacturaCompraRenglon() {
        this.nombresCol = new String[]{"Regn", "Articulo", "Descripcion", "Almacen", "Unidad", "IVA", "Cantidad", "Precio", "Monto I.V.A ", "Neto"}; //, "P.Primaria", "Primaria", "Invertida", "Equivalecnia", "NªDecimales"};
        this.tipoColumnas = new Class[]{Integer.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Double.class, Double.class,Double.class};
     }
    public void setlistaFacturaCompraReng(ArrayList<FacturaCompraRengBO> lista) {
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
        switch (columna) {
            case 0:
                return lista.get(fila).getReng_num();
            case 1:
                return lista.get(fila).getCo_art();
            case 2:
                return lista.get(fila).getDes_art();
            case 3:
                return lista.get(fila).getCo_alma();
            case 4:
                return lista.get(fila).getCo_uni();
            case 5:
                return lista.get(fila).getPorc_imp();

            case 6:
                return lista.get(fila).getTotal_art();
            case 7:
                return lista.get(fila).getCost_unit();
            case 8:
                return lista.get(fila).getMonto_imp();
            case 9:
                return lista.get(fila).getReng_neto();
            /* case 7:
                return lista.get(fila).getPrec_vta();
            case 8:
                return lista.get(fila).getMonto_desc();*/
            default:
                return null;
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
        
        switch (columnIndex) {
            case 0:
                lista.get(rowIndex).setReng_num((int) aValue);
                break;

            case 1:
                lista.get(rowIndex).setCo_art(aValue.toString());
                break;
            case 2:
                lista.get(rowIndex).setDes_art(aValue.toString());
                break;
            case 3:
                lista.get(rowIndex).setCo_alma(aValue.toString());
                break;

            case 4:
                lista.get(rowIndex).setCo_uni(aValue.toString());
                break;
            case 5:
                lista.get(rowIndex).setPorc_imp((double)aValue );
                break;

            case 6:
                lista.get(rowIndex).setTotal_art( (int) aValue);
                break;
            case 7:
                lista.get(rowIndex).setCost_unit((double) aValue);
                break;
            case 8:
                lista.get(rowIndex).setMonto_imp((double) aValue);
                break;
            case 9:
                lista.get(rowIndex).setReng_neto((double) aValue);
                break;
            /*case 7:
                lista.get(rowIndex).setPrec_vta((double) aValue);
                break;
            
            case 8:
                lista.get(rowIndex).setMonto_desc((double) aValue);*/
        }
    }
    
     public void addRow(FacturaCompraRengBO facturaCompraRengBO) {
        lista.add(facturaCompraRengBO);
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

      /*  if (column != 9 && column !=5) {
            return true;
        } else {
            return false;
        }*/
        //To change body of generated methods, choose Tools | Templates.
        return true ;
    }

    public void limpiarRengloTabla(int cantLineas) {
        for (int i = 0; i < cantLineas; i++) {
            this.removedRow(0);
            System.out.println("cantidad de veces " + i);
        }
    }
    
    
    
    
    
}
