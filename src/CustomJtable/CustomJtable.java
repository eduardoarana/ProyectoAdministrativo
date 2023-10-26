/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomJtable;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author earana
 */
public class CustomJtable extends JTable {

    public Component prepareRenderer(TableCellRenderer renderer, int rowindex, int columnIndex) {

        Component componente = super.prepareRenderer(renderer, rowindex, columnIndex);
       
        return componente;
    }

    @Override
    public void setCellEditor(TableCellEditor tce) {
        super.setCellEditor(tce); //To change body of generated methods, choose Tools | Templates.
    }
 
    @Override
   public void  addColumn(TableColumn aColumn){

       //addColumn(new TableColumn(modelColumn, width, cellRenderer, cellEditor));
   }
}
