/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.Objects;

/**
 *
 * @author Desarrollo
 */
public class AlmacenBO {

    private String co_alma;
    private String des_alma;
    private String co_sucur;
    private String noventa;
    private String nocompra;
    private String materiales;
    private String produccion;
    private String alm_temp;
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
    private String rowguid;
    private String descripcionSucursal;

    public AlmacenBO() {
    }

    public AlmacenBO(String co_alma, String des_alma, String co_sucur, String noventa, String nocompra, String materiales, String produccion, String alm_temp, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, String campo7, String campo8, String co_us_in, String co_sucu_in, String fe_us_in, String co_us_mo, String co_sucu_mo, String fe_us_mo, String revisado, String trasnfe, String validador, String rowguid) {
        this.co_alma = co_alma;
        this.des_alma = des_alma;
        this.co_sucur = co_sucur;
        this.noventa = noventa;
        this.nocompra = nocompra;
        this.materiales = materiales;
        this.produccion = produccion;
        this.alm_temp = alm_temp;
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

    public String getCo_alma() {
        return co_alma;
    }

    public void setCo_alma(String co_alma) {
        this.co_alma = co_alma;
    }

    public String getDes_alma() {
        return des_alma;
    }

    public void setDes_alma(String des_alma) {
        this.des_alma = des_alma;
    }

    public String getCo_sucur() {
        return co_sucur;
    }

    public void setCo_sucur(String co_sucur) {
        this.co_sucur = co_sucur;
    }

    public String getNoventa() {
        return noventa;
    }

    public void setNoventa(String noventa) {
        this.noventa = noventa;
    }

    public String getNocompra() {
        return nocompra;
    }

    public void setNocompra(String nocompra) {
        this.nocompra = nocompra;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public String getProduccion() {
        return produccion;
    }

    public void setProduccion(String produccion) {
        this.produccion = produccion;
    }

    public String getAlm_temp() {
        return alm_temp;
    }

    public void setAlm_temp(String alm_temp) {
        this.alm_temp = alm_temp;
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
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.co_alma);
        hash = 73 * hash + Objects.hashCode(this.des_alma);
        hash = 73 * hash + Objects.hashCode(this.co_sucur);
        hash = 73 * hash + Objects.hashCode(this.noventa);
        hash = 73 * hash + Objects.hashCode(this.nocompra);
        hash = 73 * hash + Objects.hashCode(this.materiales);
        hash = 73 * hash + Objects.hashCode(this.produccion);
        hash = 73 * hash + Objects.hashCode(this.alm_temp);
        hash = 73 * hash + Objects.hashCode(this.campo1);
        hash = 73 * hash + Objects.hashCode(this.campo2);
        hash = 73 * hash + Objects.hashCode(this.campo3);
        hash = 73 * hash + Objects.hashCode(this.campo4);
        hash = 73 * hash + Objects.hashCode(this.campo5);
        hash = 73 * hash + Objects.hashCode(this.campo6);
        hash = 73 * hash + Objects.hashCode(this.campo7);
        hash = 73 * hash + Objects.hashCode(this.campo8);
        hash = 73 * hash + Objects.hashCode(this.co_us_in);
        hash = 73 * hash + Objects.hashCode(this.co_sucu_in);
        hash = 73 * hash + Objects.hashCode(this.fe_us_in);
        hash = 73 * hash + Objects.hashCode(this.co_us_mo);
        hash = 73 * hash + Objects.hashCode(this.co_sucu_mo);
        hash = 73 * hash + Objects.hashCode(this.fe_us_mo);
        hash = 73 * hash + Objects.hashCode(this.revisado);
        hash = 73 * hash + Objects.hashCode(this.trasnfe);
        hash = 73 * hash + Objects.hashCode(this.validador);
        hash = 73 * hash + Objects.hashCode(this.rowguid);
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
        final AlmacenBO other = (AlmacenBO) obj;
        if (!Objects.equals(this.co_alma, other.co_alma)) {
            return false;
        }
        if (!Objects.equals(this.des_alma, other.des_alma)) {
            return false;
        }
        if (!Objects.equals(this.co_sucur, other.co_sucur)) {
            return false;
        }
        if (!Objects.equals(this.noventa, other.noventa)) {
            return false;
        }
        if (!Objects.equals(this.nocompra, other.nocompra)) {
            return false;
        }
        if (!Objects.equals(this.materiales, other.materiales)) {
            return false;
        }
        if (!Objects.equals(this.produccion, other.produccion)) {
            return false;
        }
        if (!Objects.equals(this.alm_temp, other.alm_temp)) {
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

    public String getDescripcionSucursal() {
        return descripcionSucursal;
    }

    public void setDescripcionSucursal(String descripcionSucursal) {
        this.descripcionSucursal = descripcionSucursal;
    }

    
    
    

}
