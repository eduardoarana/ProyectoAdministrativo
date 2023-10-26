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
public class ProcedenciaBO {
    
    private String cod_proc="";
    private String des_proc="";
    private String campo1="";
    private String campo2="";
    private String campo3="";
    private String campo4="";
    private String campo5="";
    private String campo6="";
    private String campo7="";
    private String campo8="";
    private String co_us_in="";
    private String co_sucu_in="";
    private String fe_us_in="";
    private String co_us_mo="";
    private String co_sucu_mo="";
    private String fe_us_mo="";
    private String revisado="";
    private String trasnfe="";
    private String validador="";
    private String rowguid="";

    public ProcedenciaBO() {
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

    public String getCod_proc() {
        return cod_proc;
    }

    public void setCod_proc(String cod_proc) {
        this.cod_proc = cod_proc;
    }

    public String getDes_proc() {
        return des_proc;
    }

    public void setDes_proc(String des_proc) {
        this.des_proc = des_proc;
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

    public String getRevisado() {
        return revisado;
    }

    public void setRevisado(String revisado) {
        this.revisado = revisado;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
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
        final ProcedenciaBO other = (ProcedenciaBO) obj;
        if (!Objects.equals(this.cod_proc, other.cod_proc)) {
            return false;
        }
        if (!Objects.equals(this.des_proc, other.des_proc)) {
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
        if (!Objects.equals(this.rowguid, other.rowguid)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.cod_proc);
        hash = 71 * hash + Objects.hashCode(this.des_proc);
        hash = 71 * hash + Objects.hashCode(this.campo1);
        hash = 71 * hash + Objects.hashCode(this.campo2);
        hash = 71 * hash + Objects.hashCode(this.campo3);
        hash = 71 * hash + Objects.hashCode(this.campo4);
        hash = 71 * hash + Objects.hashCode(this.campo5);
        hash = 71 * hash + Objects.hashCode(this.campo6);
        hash = 71 * hash + Objects.hashCode(this.campo7);
        hash = 71 * hash + Objects.hashCode(this.campo8);
        hash = 71 * hash + Objects.hashCode(this.co_us_in);
        hash = 71 * hash + Objects.hashCode(this.co_sucu_in);
        hash = 71 * hash + Objects.hashCode(this.fe_us_in);
        hash = 71 * hash + Objects.hashCode(this.co_us_mo);
        hash = 71 * hash + Objects.hashCode(this.co_sucu_mo);
        hash = 71 * hash + Objects.hashCode(this.fe_us_mo);
        hash = 71 * hash + Objects.hashCode(this.revisado);
        hash = 71 * hash + Objects.hashCode(this.trasnfe);
        hash = 71 * hash + Objects.hashCode(this.validador);
        hash = 71 * hash + Objects.hashCode(this.rowguid);
        return hash;
    }
   
    
    
    
}
