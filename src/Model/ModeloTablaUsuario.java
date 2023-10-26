/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.UsuarioBO;
import static Model.ModeloTablaUnidad.nombresCol;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Desarrollo
 */
public class ModeloTablaUsuario extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion"};
    ArrayList<UsuarioBO> listaUsuario;

    public ModeloTablaUsuario(ArrayList<UsuarioBO> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    
    public void setListaUsuario(ArrayList<UsuarioBO> lista){
    this.listaUsuario=lista;
    }

    @Override
    public int getRowCount() {
        return listaUsuario.size();
    }

    @Override
    public int getColumnCount() {
        return nombresCol.length;
    }

    public String getColumnName(int col) {
        return nombresCol[col].toString();
    }

    @Override
    public Object getValueAt(int fila, int columna) {

        switch (columna) {
            case 0:
                return listaUsuario.get(fila).getCod_Usuario();
            case 1:
                return listaUsuario.get(fila).getDesc_Usuario();

            default:
                return null;
        }
    }
}
