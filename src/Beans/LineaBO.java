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
public class LineaBO {
   private String co_lin; 
   private String lin_des; 
   private String dis_cen; 
   private String co_imun; 
   private String co_reten; 
   private String comi_lin; 
   private String comi_lin2; 
   private String i_lin_des; 
   private String va; 
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
   private String feccom;  
   private String numcom;

    public LineaBO() {
    }

   
    public LineaBO(String co_lin, String lin_des, String dis_cen, String co_imun, String co_reten, String comi_lin, String comi_lin2, String i_lin_des, String va, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, String campo7, String campo8, String co_us_in, String co_sucu_in, String fe_us_in, String co_us_mo, String co_sucu_mo, String fe_us_mo, String revisado, String trasnfe, String validador, String feccom, String numcom) {
        this.co_lin = co_lin;
        this.lin_des = lin_des;
        this.dis_cen = dis_cen;
        this.co_imun = co_imun;
        this.co_reten = co_reten;
        this.comi_lin = comi_lin;
        this.comi_lin2 = comi_lin2;
        this.i_lin_des = i_lin_des;
        this.va = va;
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
        this.feccom = feccom;
        this.numcom = numcom;
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

    public String getCo_imun() {
        return co_imun;
    }

    public void setCo_imun(String co_imun) {
        this.co_imun = co_imun;
    }

    public String getCo_lin() {
        return co_lin;
    }

    public void setCo_lin(String co_lin) {
        this.co_lin = co_lin;
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

    public String getComi_lin() {
        return comi_lin;
    }

    public void setComi_lin(String comi_lin) {
        this.comi_lin = comi_lin;
    }

    public String getComi_lin2() {
        return comi_lin2;
    }

    public void setComi_lin2(String comi_lin2) {
        this.comi_lin2 = comi_lin2;
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

    public String getI_lin_des() {
        return i_lin_des;
    }

    public void setI_lin_des(String i_lin_des) {
        this.i_lin_des = i_lin_des;
    }

    public String getLin_des() {
        return lin_des;
    }

    public void setLin_des(String lin_des) {
        this.lin_des = lin_des;
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

    public String getVa() {
        return va;
    }

    public void setVa(String va) {
        this.va = va;
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
        final LineaBO other = (LineaBO) obj;
        if (!Objects.equals(this.co_lin, other.co_lin)) {
            return false;
        }
        if (!Objects.equals(this.lin_des, other.lin_des)) {
            return false;
        }
        if (!Objects.equals(this.dis_cen, other.dis_cen)) {
            return false;
        }
        if (!Objects.equals(this.co_imun, other.co_imun)) {
            return false;
        }
        if (!Objects.equals(this.co_reten, other.co_reten)) {
            return false;
        }
        if (!Objects.equals(this.comi_lin, other.comi_lin)) {
            return false;
        }
        if (!Objects.equals(this.comi_lin2, other.comi_lin2)) {
            return false;
        }
        if (!Objects.equals(this.i_lin_des, other.i_lin_des)) {
            return false;
        }
        if (!Objects.equals(this.va, other.va)) {
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
        if (!Objects.equals(this.feccom, other.feccom)) {
            return false;
        }
        if (!Objects.equals(this.numcom, other.numcom)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.co_lin);
        hash = 13 * hash + Objects.hashCode(this.lin_des);
        hash = 13 * hash + Objects.hashCode(this.dis_cen);
        hash = 13 * hash + Objects.hashCode(this.co_imun);
        hash = 13 * hash + Objects.hashCode(this.co_reten);
        hash = 13 * hash + Objects.hashCode(this.comi_lin);
        hash = 13 * hash + Objects.hashCode(this.comi_lin2);
        hash = 13 * hash + Objects.hashCode(this.i_lin_des);
        hash = 13 * hash + Objects.hashCode(this.va);
        hash = 13 * hash + Objects.hashCode(this.campo1);
        hash = 13 * hash + Objects.hashCode(this.campo2);
        hash = 13 * hash + Objects.hashCode(this.campo3);
        hash = 13 * hash + Objects.hashCode(this.campo4);
        hash = 13 * hash + Objects.hashCode(this.campo5);
        hash = 13 * hash + Objects.hashCode(this.campo6);
        hash = 13 * hash + Objects.hashCode(this.campo7);
        hash = 13 * hash + Objects.hashCode(this.campo8);
        hash = 13 * hash + Objects.hashCode(this.co_us_in);
        hash = 13 * hash + Objects.hashCode(this.co_sucu_in);
        hash = 13 * hash + Objects.hashCode(this.fe_us_in);
        hash = 13 * hash + Objects.hashCode(this.co_us_mo);
        hash = 13 * hash + Objects.hashCode(this.co_sucu_mo);
        hash = 13 * hash + Objects.hashCode(this.fe_us_mo);
        hash = 13 * hash + Objects.hashCode(this.revisado);
        hash = 13 * hash + Objects.hashCode(this.trasnfe);
        hash = 13 * hash + Objects.hashCode(this.validador);
        hash = 13 * hash + Objects.hashCode(this.feccom);
        hash = 13 * hash + Objects.hashCode(this.numcom);
        return hash;
    }
    
}
