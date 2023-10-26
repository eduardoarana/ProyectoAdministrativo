/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.TipoAjusteBO;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Desarrollo
 */
public class ModeloTablaTipoAjuste extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion", "tipo"};
    ArrayList<TipoAjusteBO> lista;

    public ModeloTablaTipoAjuste(ArrayList<TipoAjusteBO> lista){
        this.lista = lista;
    }

    public void setLista(ArrayList<TipoAjusteBO> lista){
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

    public String getColumnName(int col) {
        return nombresCol[col].toString();
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch (columna) {
            case 0:
                return lista.get(fila).getCo_tipo();

            case 1:
                return lista.get(fila).getDes_tipo();

            case 2:
                return lista.get(fila).getTipo_trans();

            case 3:
                return lista.get(fila).getCampo1();
            case 4:
                return lista.get(fila).getCampo2();
            case 5:
                return lista.get(fila).getCampo3();
            case 6:
                return lista.get(fila).getCampo4();
            case 7:
                return lista.get(fila).getCampo5();
            case 8:
                return lista.get(fila).getCampo6();
            case 9:
                return lista.get(fila).getCampo7();
            case 10:
                return lista.get(fila).getCampo8();
            case 11:
                return lista.get(fila).getCo_sucu_in();
            case 12:
                return lista.get(fila).getCo_sucu_mo();
            case 13:
                return lista.get(fila).getCo_tipo();
            case 14:
                return lista.get(fila).getCo_us_in();
            case 15:
                return lista.get(fila).getCo_us_mo();
            case 16:
                return lista.get(fila).getFe_us_in();
            case 17:
                return lista.get(fila).getFe_us_mo();
            case 18:
                return lista.get(fila).getRevisado();
            case 19:
                return lista.get(fila).getTipo_trans();
            case 20:
                return lista.get(fila).getTrasnfe();
            case 21:
                return lista.get(fila).getValidador();

            default:
                return null;
        }
    }

}
