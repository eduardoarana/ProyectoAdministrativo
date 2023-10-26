/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.TipoClienteBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AranaV
 */
public class ModeloTablaTipoCliente extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion"};
    public ArrayList<TipoClienteBO> lista;

    public ModeloTablaTipoCliente(ArrayList<TipoClienteBO> lista) {
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
    public String getColumnName(int col) {
        return nombresCol[col];
    }

    @Override
    public Object getValueAt(int fila, int columna) {

        switch (columna) {
            case 0:
                return lista.get(fila).getTip_cli();
            case 1:
                return lista.get(fila).getDes_tipo();
            default:
                return null;
        }
    }
}
