/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Beans.ProveedorBO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author earana
 */
public class ModelTablaProveedores extends AbstractTableModel{

    public static String[] nombresCol = {"Codigo", "Descripcion", "validador"};
    ArrayList<ProveedorBO> lista ;

    public ModelTablaProveedores(ArrayList<ProveedorBO> lista) {
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
                return lista.get(fila).getCo_prov();    
            case 1:
                return lista.get(fila).getProv_des();
            case 2:
                return lista.get(fila).getCo_seg();
            case 3:
                return lista.get(fila).getCo_zon();
            case 4:
                return lista.get(fila).getTip_pro();
            case 5:
                return lista.get(fila).getInactivo();
            case 6:
                return lista.get(fila).getDirec1();
            case 7:
                return lista.get(fila).getDirec2();
            case 8:
                return lista.get(fila).getTelefonos();
            case 9:
                return lista.get(fila).getFax();
            case 10:
                return lista.get(fila).getRespons();
            case 11:
                return lista.get(fila).getFecha_reg();
            case 12:
                return lista.get(fila).getMont_cre();
            case 13:
                return lista.get(fila).getCo_mone();
            case 14:
                return lista.get(fila).getCond_pag();
            case 15:
                return lista.get(fila).getPlaz_pag();
            case 16:
                return lista.get(fila).getDesc_ppago();
            case 17:
                return lista.get(fila).getDesc_glob();
            case 18:
                return lista.get(fila).getRif();
            case 19:
                return lista.get(fila).getNacional();
            case 20:
                return lista.get(fila).getNumcom();
            case 21:
                return lista.get(fila).getFeccom();
            case 22:
                return lista.get(fila).getDis_cen();
            case 23:
                return lista.get(fila).getNit();
            case 24:
                return lista.get(fila).getEmail();
            case 25:
                return lista.get(fila).getCo_cta_ingr_egr();
            case 26:
                return lista.get(fila).getComentario();
            case 27:
                return lista.get(fila).getTipo_adi();
            case 28:
                return lista.get(fila).getMatriz();
            case 29:
                return lista.get(fila).getCo_tab();
            case 30:
                return lista.get(fila).getTipo_per();
            case 31:
                return lista.get(fila).getCo_pais();
            case 32:
                return lista.get(fila).getCiudad();
            case 33:
                return lista.get(fila).getZip();
            case 34:
                return lista.get(fila).getWebsite();
            case 35:
                return lista.get(fila).getFormtype();
            case 36:
                return lista.get(fila).getTaxid();
            case 37:
                return lista.get(fila).getContribu_e();
            case 38:
                return lista.get(fila).getRete_regis_doc();
            case 39:
                return lista.get(fila).getPorc_esp();
            case 40:
                return lista.get(fila).getCampo1();
            case 41:
                return lista.get(fila).getCampo2();
            case 42:
                return lista.get(fila).getCampo3();
            case 43:
                return lista.get(fila).getCampo4();
            case 44:
                return lista.get(fila).getCampo5();
            case 45:
                return lista.get(fila).getCampo6();
            case 46:
                return lista.get(fila).getCampo7();
            case 47:
                return lista.get(fila).getCampo8();
            case 48:
                return lista.get(fila).getCo_us_in();
            case 49:
                return lista.get(fila).getCo_sucu_in();
            case 50:
                return lista.get(fila).getFe_us_in();
            case 51:
                return lista.get(fila).getCo_us_mo();
            case 52:
                return lista.get(fila).getCo_sucu_mo();
            case 53:
                return lista.get(fila).getFe_us_mo();
            case 54:
                return lista.get(fila).getRevisado();
            case 55:
                return lista.get(fila).getTrasnfe();
            case 56:
                return lista.get(fila).getValidador();
            case 57:
                return lista.get(fila).getEmail_alterno();
            case 58:
                return lista.get(fila).getSujeto_obj_retenISLR_auto();    
        default:
                return null;
    }
    }
}
