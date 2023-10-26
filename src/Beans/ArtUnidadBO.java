/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;


import java.util.Objects;

/**
 *
 * @author earana
 */
public class ArtUnidadBO {
    
    private String co_art ;
    private String co_uni;
    private String relacion;
    private String equivalencia;
    private String uso_venta;
    private String uso_compra;
    private String uni_principal;
    private String uso_principal;
    private String uni_secundaria;
    private String uso_secundaria;
    private String uso_numDecimales;
    private String num_decimales;
    private String co_us_in;
    private String co_sucu_in;
    private String fe_us_in;
    private String co_us_mo;
    private String co_sucu_mo;
    private String fe_us_mo;
    private String revisado;
    private String trasnfe;
    private String validador;
    private String rowguid;
    private String campoAuxiliar;
    private Boolean campoPprincipal;
    private Boolean campoPrimaria;
    private Boolean invertida ;
    public String getRelacion;
   
    

   

   

    public ArtUnidadBO() {
    }

    public ArtUnidadBO(String co_art, String co_uni, String relacion, String equivalencia, String uso_venta, String uso_compra, String uni_principal, String uso_principal, String uni_secundaria, String uso_secundaria, String uso_numDecimales, String num_decimales, String co_us_in, String co_sucu_in, String fe_us_in, String co_us_mo, String co_sucu_mo, String fe_us_mo, String revisado, String trasnfe, String validador, String rowguid) {
        this.co_art = co_art;
        this.co_uni = co_uni;
        this.relacion = relacion;
        this.equivalencia = equivalencia;
        this.uso_venta = uso_venta;
        this.uso_compra = uso_compra;
        this.uni_principal = uni_principal;
        this.uso_principal = uso_principal;
        this.uni_secundaria = uni_secundaria;
        this.uso_secundaria = uso_secundaria;
        this.uso_numDecimales = uso_numDecimales;
        this.num_decimales = num_decimales;
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

    public String getCo_art() {
        return co_art;
    }

    public void setCo_art(String co_art) {
        this.co_art = co_art;
    }

    public String getCo_uni() {
        return co_uni;
    }

    public void setCo_uni(String co_uni) {
        this.co_uni = co_uni;
    }

    public String getRelacion() {
        return relacion;
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

    public String getEquivalencia() {
        return equivalencia;
    }

    public void setEquivalencia(String equivalencia) {
        this.equivalencia = equivalencia;
    }

    public String getUso_venta() {
        return uso_venta;
    }

    public void setUso_venta(String uso_venta) {
        this.uso_venta = uso_venta;
    }

    public String getUso_compra() {
        return uso_compra;
    }

    public void setUso_compra(String uso_compra) {
        this.uso_compra = uso_compra;
    }

    public String getUni_principal() {
        return uni_principal;
    }

    public void setUni_principal(String uni_principal) {
        this.uni_principal = uni_principal;
    }

    public String getUso_principal() {
        return uso_principal;
    }

    public void setUso_principal(String uso_principal) {
        this.uso_principal = uso_principal;
    }

    public String getUni_secundaria() {
        return uni_secundaria;
    }

    public void setUni_secundaria(String uni_secundaria) {
        this.uni_secundaria = uni_secundaria;
    }

    public String getUso_secundaria() {
        return uso_secundaria;
    }

    public void setUso_secundaria(String uso_secundaria) {
        this.uso_secundaria = uso_secundaria;
    }

    public String getUso_numDecimales() {
        return uso_numDecimales;
    }

    public void setUso_numDecimales(String uso_numDecimales) {
        this.uso_numDecimales = uso_numDecimales;
    }

    public String getNum_decimales() {
        return num_decimales;
    }

    public void setNum_decimales(String num_decimales) {
        this.num_decimales = num_decimales;
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
    
     public String getCampoAuxiliar() {
        return campoAuxiliar;
    }

    public void setCampoAuxiliar(String campoAuxiliar) {
        this.campoAuxiliar = campoAuxiliar;
    }
     public String getGetRelacion() {
        return getRelacion;
    }

    public void setGetRelacion(String getRelacion) {
        this.getRelacion = getRelacion;
    }

    public Boolean getCampoPprincipal() {
        return campoPprincipal;
    }

    public void setCampoPprincipal(Boolean campoPprincipal) {
        this.campoPprincipal = campoPprincipal;
    }

    public Boolean getCampoPrimaria() {
        return campoPrimaria;
    }

    public void setCampoPrimaria(Boolean campoPrimaria) {
        this.campoPrimaria = campoPrimaria;
    }

    public Boolean getInvertida() {
        return invertida;
    }

    public void setInvertida(Boolean invertida) {
        this.invertida = invertida;
    }

    
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.co_art);
        hash = 97 * hash + Objects.hashCode(this.co_uni);
        hash = 97 * hash + Objects.hashCode(this.relacion);
        hash = 97 * hash + Objects.hashCode(this.equivalencia);
        hash = 97 * hash + Objects.hashCode(this.uso_venta);
        hash = 97 * hash + Objects.hashCode(this.uso_compra);
        hash = 97 * hash + Objects.hashCode(this.uni_principal);
        hash = 97 * hash + Objects.hashCode(this.uso_principal);
        hash = 97 * hash + Objects.hashCode(this.uni_secundaria);
        hash = 97 * hash + Objects.hashCode(this.uso_secundaria);
        hash = 97 * hash + Objects.hashCode(this.uso_numDecimales);
        hash = 97 * hash + Objects.hashCode(this.num_decimales);
        hash = 97 * hash + Objects.hashCode(this.co_us_in);
        hash = 97 * hash + Objects.hashCode(this.co_sucu_in);
        hash = 97 * hash + Objects.hashCode(this.fe_us_in);
        hash = 97 * hash + Objects.hashCode(this.co_us_mo);
        hash = 97 * hash + Objects.hashCode(this.co_sucu_mo);
        hash = 97 * hash + Objects.hashCode(this.fe_us_mo);
        hash = 97 * hash + Objects.hashCode(this.revisado);
        hash = 97 * hash + Objects.hashCode(this.trasnfe);
        hash = 97 * hash + Objects.hashCode(this.validador);
        hash = 97 * hash + Objects.hashCode(this.rowguid);
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
        final ArtUnidadBO other = (ArtUnidadBO) obj;
        if (!Objects.equals(this.co_art, other.co_art)) {
            return false;
        }
        if (!Objects.equals(this.co_uni, other.co_uni)) {
            return false;
        }
        if (!Objects.equals(this.relacion, other.relacion)) {
            return false;
        }
        if (!Objects.equals(this.equivalencia, other.equivalencia)) {
            return false;
        }
        if (!Objects.equals(this.uso_venta, other.uso_venta)) {
            return false;
        }
        if (!Objects.equals(this.uso_compra, other.uso_compra)) {
            return false;
        }
        if (!Objects.equals(this.uni_principal, other.uni_principal)) {
            return false;
        }
        if (!Objects.equals(this.uso_principal, other.uso_principal)) {
            return false;
        }
        if (!Objects.equals(this.uni_secundaria, other.uni_secundaria)) {
            return false;
        }
        if (!Objects.equals(this.uso_secundaria, other.uso_secundaria)) {
            return false;
        }
        if (!Objects.equals(this.uso_numDecimales, other.uso_numDecimales)) {
            return false;
        }
        if (!Objects.equals(this.num_decimales, other.num_decimales)) {
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
