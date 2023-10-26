/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.AlmacenBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Desarrollo
 */
public class ModeloTablaAlmacen extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion"};
    ArrayList<AlmacenBO> lista;

    public ModeloTablaAlmacen(ArrayList<AlmacenBO> lista) {
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
                return lista.get(fila).getCo_alma();
            case 1:
                return lista.get(fila).getDes_alma();
            case 2:
                return lista.get(fila).getCampo1();
            case 3:
                return lista.get(fila).getCampo2();
            case 4:
                return lista.get(fila).getCampo3();
            case 5:
                return lista.get(fila).getCampo4();
            case 6:
                return lista.get(fila).getCampo5();
            case 7:
                return lista.get(fila).getCampo6();
            case 8:
                return lista.get(fila).getCampo7();
            case 9:
                return lista.get(fila).getCampo8();
            case 10:
                return lista.get(fila).getCo_sucu_in();
            case 11:
                return lista.get(fila).getCo_sucu_mo();
            case 12:
                return lista.get(fila).getCo_sucur();
            case 13:
                return lista.get(fila).getAlm_temp();
            case 14:
                return lista.get(fila).getCo_us_in();
            case 15:
                return lista.get(fila).getCo_us_mo();
            case 16:
                return lista.get(fila).getFe_us_in();
            case 17:
                return lista.get(fila).getFe_us_mo();
            case 18:
                return lista.get(fila).getMateriales();
            case 19:
                return lista.get(fila).getNocompra();
            case 20:
                return lista.get(fila).getNoventa();
            case 21:
                return lista.get(fila).getProduccion();
            case 22:
                return lista.get(fila).getRevisado();
            case 23:
                return lista.get(fila).getRowguid();
            case 24:
                return lista.get(fila).getTrasnfe();
            case 25:
                return lista.get(fila).getValidador();
            default:
                return null;
        }
    }
}
