/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ClienteBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author EArana
 */
public class ModeloTablaCliente extends AbstractTableModel {

    
     public static String[] nombresCol = {"Codigo", "Descripcion","Tipo"};
     ArrayList<ClienteBO> lista = null ;

    public ModeloTablaCliente(ArrayList<ClienteBO> lista ) {
        this.lista= lista ;
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
    public String getColumnName(int col){
    return nombresCol[col];
    }

    @Override
    public Object getValueAt(int fila  , int columna) {
       switch (columna) {
           case 0:
                return lista.get(fila).getCo_cli();
                
           case 1 :
               return lista.get(fila).getCli_des();
               
           case 2 :
               return lista.get(fila).getTipo_cli();
               default:
                   return null;
       }
    }
}
