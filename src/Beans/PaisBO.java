/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.Objects;

/**
 *
 * @author AranaV
 */
public class PaisBO {
    
    private String  co_pais;
    private String  pais_des;
    private String  co_mone;
    private String  campo1;
    private String  campo2;
    private String  campo3;
    private String  campo4;
    private String  campo5;
    private String  campo6;
    private String  campo7;
    private String  campo8;
    private String  co_us_in;
    private String  co_sucu_in;
    private String  fe_us_in;
    private String  co_us_mo;
    private String  co_sucu_mo;
    private String  fe_us_mo;
    private String  revisado;
    private String  trasnfe;
    private String  validador;
    private String  rowguid;

    public PaisBO() {
    }
    public PaisBO(String co_pais, String pais_des, String co_mone, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, String campo7, String campo8, String co_us_in, String co_sucu_in, String fe_us_in, String co_us_mo, String co_sucu_mo, String fe_us_mo, String revisado, String trasnfe, String validador, String rowguid) {
        this.co_pais = co_pais;
        this.pais_des = pais_des;
        this.co_mone = co_mone;
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
        this.rowguid = rowguid;
    }

    public String getCo_pais() {
        return co_pais;
    }

    public void setCo_pais(String co_pais) {
        this.co_pais = co_pais;
    }

    public String getPais_des() {
        return pais_des;
    }

    public void setPais_des(String pais_des) {
        this.pais_des = pais_des;
    }

    public String getCo_mone() {
        return co_mone;
    }

    public void setCo_mone(String co_mone) {
        this.co_mone = co_mone;
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

    public String getCo_us_in() {
        return co_us_in;
    }

    public void setCo_us_in(String co_us_in) {
        this.co_us_in = co_us_in;
    }

    public String getCo_sucu_in() {
        return co_sucu_in;
    }

    public void setCo_sucu_in(String co_sucu_in) {
        this.co_sucu_in = co_sucu_in;
    }

    public String getFe_us_in() {
        return fe_us_in;
    }

    public void setFe_us_in(String fe_us_in) {
        this.fe_us_in = fe_us_in;
    }

    public String getCo_us_mo() {
        return co_us_mo;
    }

    public void setCo_us_mo(String co_us_mo) {
        this.co_us_mo = co_us_mo;
    }

    public String getCo_sucu_mo() {
        return co_sucu_mo;
    }

    public void setCo_sucu_mo(String co_sucu_mo) {
        this.co_sucu_mo = co_sucu_mo;
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

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.co_pais);
        hash = 41 * hash + Objects.hashCode(this.pais_des);
        hash = 41 * hash + Objects.hashCode(this.co_mone);
        hash = 41 * hash + Objects.hashCode(this.campo1);
        hash = 41 * hash + Objects.hashCode(this.campo2);
        hash = 41 * hash + Objects.hashCode(this.campo3);
        hash = 41 * hash + Objects.hashCode(this.campo4);
        hash = 41 * hash + Objects.hashCode(this.campo5);
        hash = 41 * hash + Objects.hashCode(this.campo6);
        hash = 41 * hash + Objects.hashCode(this.campo7);
        hash = 41 * hash + Objects.hashCode(this.campo8);
        hash = 41 * hash + Objects.hashCode(this.co_us_in);
        hash = 41 * hash + Objects.hashCode(this.co_sucu_in);
        hash = 41 * hash + Objects.hashCode(this.fe_us_in);
        hash = 41 * hash + Objects.hashCode(this.co_us_mo);
        hash = 41 * hash + Objects.hashCode(this.co_sucu_mo);
        hash = 41 * hash + Objects.hashCode(this.fe_us_mo);
        hash = 41 * hash + Objects.hashCode(this.revisado);
        hash = 41 * hash + Objects.hashCode(this.trasnfe);
        hash = 41 * hash + Objects.hashCode(this.validador);
        hash = 41 * hash + Objects.hashCode(this.rowguid);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaisBO other = (PaisBO) obj;
        if (!Objects.equals(this.co_pais, other.co_pais)) {
            return false;
        }
        if (!Objects.equals(this.pais_des, other.pais_des)) {
            return false;
        }
        if (!Objects.equals(this.co_mone, other.co_mone)) {
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
   
    
    
}
