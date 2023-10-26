/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.FacturaCompraBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author EArana
 */
public class ModeloTablaFacturaCompra extends AbstractTableModel {

    public static String[] nombresCol = {"Número", "Proveedor", "Monto", "Saldo" ,"Factura" };
    public ArrayList<FacturaCompraBO> lista;

    public ModeloTablaFacturaCompra(ArrayList<FacturaCompraBO> lista) {
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
                return lista.get(fila).getDoc_num();
            case 1:
                return lista.get(fila).getCo_prov();
           // case 2:
               // return lista.get(fila).getFec_emis();
            case 2:
                return lista.get(fila).getTotal_bruto();
            case 3:
                return lista.get(fila).getSaldo();
                
            case 4 :
                return lista.get(fila).getNro_fact();
            default:
                return null;
        }
    }
}
