/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ArticulosBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author earana
 */
public class ModelTablaArticulos extends AbstractTableModel {

    public static String[] nombresCol = {"Codigo", "Descripcion"};
    ArrayList<ArticulosBO> lista;

    public ModelTablaArticulos(ArrayList<ArticulosBO> lista) {
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
                return lista.get(fila).getCo_art();
            case 1:
                return lista.get(fila).getArt_des();
            case 2:
                return lista.get(fila).getAux_imp01();
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
                return lista.get(fila).getAnulado();
            case 12:
                return lista.get(fila).getCo_cat();
            case 13:
                return lista.get(fila).getCo_color();
            case 14:
                return lista.get(fila).getCo_lin();
            case 15:
                return lista.get(fila).getCo_reten();
            case 16:
                return lista.get(fila).getCo_subl();
            case 17:
                return lista.get(fila).getCo_sucu_in();
            case 18:
                return lista.get(fila).getCo_sucu_mo();
            case 19:
                return lista.get(fila).getCo_ubicacion();
            case 20:
                return lista.get(fila).getCo_us_in();
            case 21:
                return lista.get(fila).getCo_us_mo();
            case 22:
                return lista.get(fila).getCod_proc();
            case 23:
                return lista.get(fila).getComentario();
            case 24:
                return lista.get(fila).getDis_cen();
            case 25:
                return lista.get(fila).getFe_us_in();
            case 26:
                return lista.get(fila).getFe_us_mo();
            case 27:
                return lista.get(fila).getFeccom();
            case 28:
                return lista.get(fila).getFecha_inac();
            case 29:
                return lista.get(fila).getFecha_reg();
            case 30:
                return lista.get(fila).getGarantia();
            case 31:
                return lista.get(fila).getGenerico();
            case 32:
                return lista.get(fila).getItem();
            case 33:
                return lista.get(fila).getLic_capacidad();
            case 34:
                return lista.get(fila).getLic_grado_al();
            case 35:
                return lista.get(fila).getLic_mon_ilc();
            case 36:
                return lista.get(fila).getLic_tipo();
            case 37:
                return lista.get(fila).getManeja_lote();
            case 38:
                return lista.get(fila).getManeja_lote_venc();
            case 39:
                return lista.get(fila).getManeja_serial();
            case 40:
                return lista.get(fila).getMargen_max();
            case 41:
                return lista.get(fila).getPorc_margen_minimo();
            case 42:
                return lista.get(fila).getPrec_om();
            case 43:
                return lista.get(fila).getPunt_cli();
            case 44:
                return lista.get(fila).getRef();
            case 45:
                return lista.get(fila).getRelac_unidad();
            case 46:
                return lista.get(fila).getReten_iva_tercero();
            case 47:
                return lista.get(fila).getRevisado();
            case 48:
                return lista.get(fila).getStock_max();
            case 49:
                return lista.get(fila).getStock_min();
            case 50:
                return lista.get(fila).getStock_pedido();
            case 51:
                return lista.get(fila).getTipo();
            case 52:
                return lista.get(fila).getTipo_cos();
            case 53:
                return lista.get(fila).getTipo_imp();
            case 54:
                return lista.get(fila).getTipo_imp2();
            case 55:
                return lista.get(fila).getTipo_imp3();
            case 56:
                return lista.get(fila).getTrasnfe();
            case 57:
                return lista.get(fila).getValidador();
            case 58:
                return lista.get(fila).getVolumen();
            default:
                return null;
        }
    }
}
