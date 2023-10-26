/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.Objects;

/**
 *
 * @author earana
 */
public class CategoriaBO {

    private String co_cat;
    private String cat_des;
    private String co_imun;
    private String co_reten;
    private String feccom;
    private String numcom;
    private String dis_cen;
    private String campo1;
    private String campo2;
    private String campo3;
    private String campo4;
    private String campo5;
    private String campo6;
    private String campo7;
    private String campo8;
    private String co_us_in;
    private String co_sucu_in;
    private String fe_us_in;
    private String co_us_mo;
    private String co_sucu_mo;
    private String fe_us_mo;
    private String revisado;
    private String trasnfe;
    private String validador;

    public CategoriaBO() {
    }

    
    
    public CategoriaBO(String co_cat, String cat_des, String co_imun, String co_reten, String feccom, String numcom, String dis_cen, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, String campo7, String campo8, String co_us_in, String co_sucu_in, String fe_us_in, String co_us_mo, String co_sucu_mo, String fe_us_mo, String revisado, String trasnfe, String validador) {
        this.co_cat = co_cat;
        this.cat_des = cat_des;
        this.co_imun = co_imun;
        this.co_reten = co_reten;
        this.feccom = feccom;
        this.numcom = numcom;
        this.dis_cen = dis_cen;
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.campo4 = campo4;
        this.campo5 = campo5;
        this.campo6 = campo6;
        this.campo7 = campo7;
        this.campo8 = campo8;
        this.co_us_in = co_us_in;
        this.co_sucu_in = co_sucu_in;
        this.fe_us_in = fe_us_in;
        this.co_us_mo = co_us_mo;
        this.co_sucu_mo = co_sucu_mo;
        this.fe_us_mo = fe_us_mo;
        this.revisado = revisado;
        this.trasnfe = trasnfe;
        this.validador = validador;
    }

    public String getCampo1() {
        return campo1;
    }

    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    public String getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }

    public String getCampo3() {
        return campo3;
    }

    public void setCampo3(String campo3) {
        this.campo3 = campo3;
    }

    public String getCampo4() {
        return campo4;
    }

    public void setCampo4(String campo4) {
        this.campo4 = campo4;
    }

    public String getCampo5() {
        return campo5;
    }

    public void setCampo5(String campo5) {
        this.campo5 = campo5;
    }

    public String getCampo6() {
        return campo6;
    }

    public void setCampo6(String campo6) {
        this.campo6 = campo6;
    }

    public String getCampo7() {
        return campo7;
    }

    public void setCampo7(String campo7) {
        this.campo7 = campo7;
    }

    public String getCampo8() {
        return campo8;
    }

    public void setCampo8(String campo8) {
        this.campo8 = campo8;
    }

    public String getCat_des() {
        return cat_des;
    }

    public void setCat_des(String cat_des) {
        this.cat_des = cat_des;
    }

    public String getCo_cat() {
        return co_cat;
    }

    public void setCo_cat(String co_cat) {
        this.co_cat = co_cat;
    }

    public String getCo_imun() {
        return co_imun;
    }

    public void setCo_imun(String co_imun) {
        this.co_imun = co_imun;
    }

    public String getCo_reten() {
        return co_reten;
    }

    public void setCo_reten(String co_reten) {
        this.co_reten = co_reten;
    }

    public String getCo_sucu_in() {
        return co_sucu_in;
    }

    public void setCo_sucu_in(String co_sucu_in) {
        this.co_sucu_in = co_sucu_in;
    }

    public String getCo_sucu_mo() {
        return co_sucu_mo;
    }

    public void setCo_sucu_mo(String co_sucu_mo) {
        this.co_sucu_mo = co_sucu_mo;
    }

    public String getCo_us_in() {
        return co_us_in;
    }

    public void setCo_us_in(String co_us_in) {
        this.co_us_in = co_us_in;
    }

    public String getCo_us_mo() {
        return co_us_mo;
    }

    public void setCo_us_mo(String co_us_mo) {
        this.co_us_mo = co_us_mo;
    }

    public String getDis_cen() {
        return dis_cen;
    }

    public void setDis_cen(String dis_cen) {
        this.dis_cen = dis_cen;
    }

    public String getFe_us_in() {
        return fe_us_in;
    }

    public void setFe_us_in(String fe_us_in) {
        this.fe_us_in = fe_us_in;
    }

    public String getFe_us_mo() {
        return fe_us_mo;
    }

    public void setFe_us_mo(String fe_us_mo) {
        this.fe_us_mo = fe_us_mo;
    }

    public String getFeccom() {
        return feccom;
    }

    public void setFeccom(String feccom) {
        this.feccom = feccom;
    }

    public String getNumcom() {
        return numcom;
    }

    public void setNumcom(String numcom) {
        this.numcom = numcom;
    }

    public String getRevisado() {
        return revisado;
    }

    public void setRevisado(String revisado) {
        this.revisado = revisado;
    }

    public String getTrasnfe() {
        return trasnfe;
    }

    public void setTrasnfe(String trasnfe) {
        this.trasnfe = trasnfe;
    }

    public String getValidador() {
        return validador;
    }

    public void setValidador(String validador) {
        this.validador = validador;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CategoriaBO other = (CategoriaBO) obj;
        if (!Objects.equals(this.co_cat, other.co_cat)) {
            return false;
        }
        if (!Objects.equals(this.cat_des, other.cat_des)) {
            return false;
        }
        if (!Objects.equals(this.co_imun, other.co_imun)) {
            return false;
        }
        if (!Objects.equals(this.co_reten, other.co_reten)) {
            return false;
        }
        if (!Objects.equals(this.feccom, other.feccom)) {
            return false;
        }
        if (!Objects.equals(this.numcom, other.numcom)) {
            return false;
        }
        if (!Objects.equals(this.dis_cen, other.dis_cen)) {
            return false;
        }
        if (!Objects.equals(this.campo1, other.campo1)) {
            return false;
        }
        if (!Objects.equals(this.campo2, other.campo2)) {
            return false;
        }
        if (!Objects.equals(this.campo3, other.campo3)) {
            return false;
        }
        if (!Objects.equals(this.campo4, other.campo4)) {
            return false;
        }
        if (!Objects.equals(this.campo5, other.campo5)) {
            return false;
        }
        if (!Objects.equals(this.campo6, other.campo6)) {
            return false;
        }
        if (!Objects.equals(this.campo7, other.campo7)) {
            return false;
        }
        if (!Objects.equals(this.campo8, other.campo8)) {
            return false;
        }
        if (!Objects.equals(this.co_us_in, other.co_us_in)) {
            return false;
        }
        if (!Objects.equals(this.co_sucu_in, other.co_sucu_in)) {
            return false;
        }
        if (!Objects.equals(this.fe_us_in, other.fe_us_in)) {
            return false;
        }
        if (!Objects.equals(this.co_us_mo, other.co_us_mo)) {
            return false;
        }
        if (!Objects.equals(this.co_sucu_mo, other.co_sucu_mo)) {
            return false;
        }
        if (!Objects.equals(this.fe_us_mo, other.fe_us_mo)) {
            return false;
        }
        if (!Objects.equals(this.revisado, other.revisado)) {
            return false;
        }
        if (!Objects.equals(this.trasnfe, other.trasnfe)) {
            return false;
        }
        if (!Objects.equals(this.validador, other.validador)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.co_cat);
        hash = 47 * hash + Objects.hashCode(this.cat_des);
        hash = 47 * hash + Objects.hashCode(this.co_imun);
        hash = 47 * hash + Objects.hashCode(this.co_reten);
        hash = 47 * hash + Objects.hashCode(this.feccom);
        hash = 47 * hash + Objects.hashCode(this.numcom);
        hash = 47 * hash + Objects.hashCode(this.dis_cen);
        hash = 47 * hash + Objects.hashCode(this.campo1);
        hash = 47 * hash + Objects.hashCode(this.campo2);
        hash = 47 * hash + Objects.hashCode(this.campo3);
        hash = 47 * hash + Objects.hashCode(this.campo4);
        hash = 47 * hash + Objects.hashCode(this.campo5);
        hash = 47 * hash + Objects.hashCode(this.campo6);
        hash = 47 * hash + Objects.hashCode(this.campo7);
        hash = 47 * hash + Objects.hashCode(this.campo8);
        hash = 47 * hash + Objects.hashCode(this.co_us_in);
        hash = 47 * hash + Objects.hashCode(this.co_sucu_in);
        hash = 47 * hash + Objects.hashCode(this.fe_us_in);
        hash = 47 * hash + Objects.hashCode(this.co_us_mo);
        hash = 47 * hash + Objects.hashCode(this.co_sucu_mo);
        hash = 47 * hash + Objects.hashCode(this.fe_us_mo);
        return hash;
    }
    
    
    
    
    
    
}
