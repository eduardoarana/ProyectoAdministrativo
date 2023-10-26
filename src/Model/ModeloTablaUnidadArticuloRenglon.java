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
 * @author jenny
 */
public class ModeloTablaUnidadArticuloRenglon extends AbstractTableModel {

    private final String[] nombresCol;
    private final Class[] tipoColumnas;
    private ArrayList<ArtUnidadBO> listArtUnidad = new ArrayList<>() ;

    public ArrayList<ArtUnidadBO> getListArtUnidad() {
        return listArtUnidad;
    }

    public void setListArtUnidad(ArrayList<ArtUnidadBO> listArtUnidad) {
        this.listArtUnidad = listArtUnidad;
    }

    public ModeloTablaUnidadArticuloRenglon() {
        listArtUnidad = new ArrayList<ArtUnidadBO>();
        this.nombresCol = new String[]{"Codigo", "Descripcion" ,"P.Primaria", "Primaria", "Invertida", "Equivalecnia", "NªDecimales"}; //, "P.Primaria", "Primaria", "Invertida", "Equivalecnia", "NªDecimales"};
        this.tipoColumnas = new Class[]{String.class, String.class , Boolean.class, Boolean.class, Boolean.class , String.class, String.class}; // , Boolean.class, Boolean.class, Boolean.class, String.class, String.class};
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return tipoColumnas[columnIndex];
    }

//    @Override
//    public boolean isCellEditable(int rowIndex, int columnIndex) {
//        return true;
//    }
    @Override
    public int getRowCount() {
        return listArtUnidad.size();
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
               return listArtUnidad.get(fila).getCo_uni();
            case 1:
                return listArtUnidad.get(fila).getCampoAuxiliar();             
            case 2: //  (listArtUnidad.get(fila).getUso_principal().equals("1")? return true : retur false);
              
                if(listArtUnidad.get(fila).getUni_principal()=="1"){
                return true;
                }else {
                return false;
                }
            case 3:
                if(listArtUnidad.get(fila).getUso_principal()=="1"){
                return true;
                }else {
                return false;
                }//(listArtUnidad.get(fila).getUni_principal().equals("1")? true : false);
            case 4:
                return false  ; // listArtUnidad.get(fila).getEquivalencia();
            case 5:
                return listArtUnidad.get(fila).getEquivalencia();
            case 6:
                return listArtUnidad.get(fila).getNum_decimales();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                listArtUnidad.get(rowIndex).setCo_art(aValue.toString());
            break;
            case 1:
                listArtUnidad.get(rowIndex).setCampoAuxiliar(aValue.toString());
                break;
            case 2:
                listArtUnidad.get(rowIndex).setUso_principal(aValue.toString());
                break;
            case 3:
                 listArtUnidad.get(rowIndex).setInvertida(true);
                break;
            case 4:
                 listArtUnidad.get(rowIndex).setEquivalencia(aValue.toString());
                break;
            case 5:
                 listArtUnidad.get(rowIndex).setNum_decimales(aValue.toString());
                break;
        }
        this.fireTableCellUpdated(rowIndex, columnIndex);
        this.fireTableRowsUpdated(rowIndex, rowIndex);
    }
    
     public void addRow(ArtUnidadBO p){
         System.out.println("Agregar ");
        this.listArtUnidad.add(p);
        this.fireTableDataChanged();
    }
     
      public void removeRow(int linha){
          System.out.println("Eliminar");
          
        this.listArtUnidad.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
      
      public void refrescarTable(){
      this.fireTableDataChanged();
      }
}
