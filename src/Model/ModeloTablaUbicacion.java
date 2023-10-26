/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import Beans.UbicacionBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author earana
 */
public class ModeloTablaUbicacion extends AbstractTableModel{
  public static String[] nombresCol = {"Codigo", "Descripcion"};
    ArrayList<UbicacionBO> lista;

    public ModeloTablaUbicacion(ArrayList<UbicacionBO> lista) {
        this.lista = lista;
    }
    
    
      public void setLista(ArrayList<UbicacionBO> lista ){
            this.lista = lista;
      }
    
    
    
    @Override
    public int getRowCount() {
          return lista.size();
    }

    @Override
    public int getColumnCount() {
        return nombresCol.length ;
    }
    public String getColumnName(int col) {
        return nombresCol[col].toString();
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch (columna) {
            case 0:
                return lista.get(fila).getCo_ubicacion();

            case 1:
                return lista.get(fila).getDes_ubicacion();
            default:
                return null;
        }
    }
    
}
