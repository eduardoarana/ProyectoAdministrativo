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
public class ColorBO {

    private String co_color;
    private String des_color;
    private String campo_Adic;
    private String campo1;
    private String campo2; 
    private String fe_us_in;
    private String co_us_mo;
    private String co_sucu_mo;
    private String fe_us_mo;
    private String revisado;
    private String valdador;

    public ColorBO(String co_color, String des_color, String campo_Adic, String campo1, String campo2, String fe_us_in, String co_us_mo, String co_sucu_mo, String fe_us_mo, String revisado, String valdador) {
        this.co_color = co_color;
        this.des_color = des_color;
        this.campo_Adic = campo_Adic;
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.fe_us_in = fe_us_in;
        this.co_us_mo = co_us_mo;
        this.co_sucu_mo = co_sucu_mo;
        this.fe_us_mo = fe_us_mo;
        this.revisado = revisado;
        this.valdador = valdador;
    }

    public ColorBO() {
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

    public String getCampo_Adic() {
        return campo_Adic;
    }

    public void setCampo_Adic(String campo_Adic) {
        this.campo_Adic = campo_Adic;
    }

    public String getCo_color() {
        return co_color;
    }

    public void setCo_color(String co_color) {
        this.co_color = co_color;
    }

    public String getCo_sucu_mo() {
        return co_sucu_mo;
    }

    public void setCo_sucu_mo(String co_sucu_mo) {
        this.co_sucu_mo = co_sucu_mo;
    }

    public String getCo_us_mo() {
        return co_us_mo;
    }

    public void setCo_us_mo(String co_us_mo) {
        this.co_us_mo = co_us_mo;
    }

    public String getDes_color() {
        return des_color;
    }

    public void setDes_color(String des_color) {
        this.des_color = des_color;
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

    public String getValdador() {
        return valdador;
    }

    public void setValdador(String valdador) {
        this.valdador = valdador;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ColorBO other = (ColorBO) obj;
        if (!Objects.equals(this.co_color, other.co_color)) {
            return false;
        }
        if (!Objects.equals(this.des_color, other.des_color)) {
            return false;
        }
        if (!Objects.equals(this.campo_Adic, other.campo_Adic)) {
            return false;
        }
        if (!Objects.equals(this.campo1, other.campo1)) {
            return false;
        }
        if (!Objects.equals(this.campo2, other.campo2)) {
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
        if (!Objects.equals(this.valdador, other.valdador)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.co_color);
        hash = 23 * hash + Objects.hashCode(this.des_color);
        hash = 23 * hash + Objects.hashCode(this.campo_Adic);
        hash = 23 * hash + Objects.hashCode(this.campo1);
        hash = 23 * hash + Objects.hashCode(this.campo2);
        hash = 23 * hash + Objects.hashCode(this.fe_us_in);
        hash = 23 * hash + Objects.hashCode(this.co_us_mo);
        hash = 23 * hash + Objects.hashCode(this.co_sucu_mo);
        hash = 23 * hash + Objects.hashCode(this.fe_us_mo);
        hash = 23 * hash + Objects.hashCode(this.revisado);
        hash = 23 * hash + Objects.hashCode(this.valdador);
        return hash;
    }
    
    
    
    
    
}
