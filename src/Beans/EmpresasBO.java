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
public class EmpresasBO {
    private String cod_empresa;
    private String desc_empresa;
    private String prioridad;
    private String backup_dir;
    private String ocul_emp;
    private String rif;
    private String nit;
    private String validador;
    private String producto;
    private String co_sucu_in;
    private String co_sucu_mo;
    private String rowguid ;

    public EmpresasBO() {
    }

    public EmpresasBO(String cod_empresa, String desc_empresa, String prioridad, String backup_dir, String ocul_emp, String rif, String nit, String validador, String producto, String co_sucu_in, String co_sucu_mo, String rowguid) {
        this.cod_empresa = cod_empresa;
        this.desc_empresa = desc_empresa;
        this.prioridad = prioridad;
        this.backup_dir = backup_dir;
        this.ocul_emp = ocul_emp;
        this.rif = rif;
        this.nit = nit;
        this.validador = validador;
        this.producto = producto;
        this.co_sucu_in = co_sucu_in;
        this.co_sucu_mo = co_sucu_mo;
        this.rowguid = rowguid;
    }

    public String getCod_empresa() {
        return cod_empresa;
    }

    public void setCod_empresa(String cod_empresa) {
        this.cod_empresa = cod_empresa;
    }

    public String getDesc_empresa() {
        return desc_empresa;
    }

    public void setDesc_empresa(String desc_empresa) {
        this.desc_empresa = desc_empresa;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getBackup_dir() {
        return backup_dir;
    }

    public void setBackup_dir(String backup_dir) {
        this.backup_dir = backup_dir;
    }

    public String getOcul_emp() {
        return ocul_emp;
    }

    public void setOcul_emp(String ocul_emp) {
        this.ocul_emp = ocul_emp;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getValidador() {
        return validador;
    }

    public void setValidador(String validador) {
        this.validador = validador;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
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

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.cod_empresa);
        hash = 79 * hash + Objects.hashCode(this.desc_empresa);
        hash = 79 * hash + Objects.hashCode(this.prioridad);
        hash = 79 * hash + Objects.hashCode(this.backup_dir);
        hash = 79 * hash + Objects.hashCode(this.ocul_emp);
        hash = 79 * hash + Objects.hashCode(this.rif);
        hash = 79 * hash + Objects.hashCode(this.nit);
        hash = 79 * hash + Objects.hashCode(this.validador);
        hash = 79 * hash + Objects.hashCode(this.producto);
        hash = 79 * hash + Objects.hashCode(this.co_sucu_in);
        hash = 79 * hash + Objects.hashCode(this.co_sucu_mo);
        hash = 79 * hash + Objects.hashCode(this.rowguid);
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
        final EmpresasBO other = (EmpresasBO) obj;
        if (!Objects.equals(this.cod_empresa, other.cod_empresa)) {
            return false;
        }
        if (!Objects.equals(this.desc_empresa, other.desc_empresa)) {
            return false;
        }
        if (!Objects.equals(this.prioridad, other.prioridad)) {
            return false;
        }
        if (!Objects.equals(this.backup_dir, other.backup_dir)) {
            return false;
        }
        if (!Objects.equals(this.ocul_emp, other.ocul_emp)) {
            return false;
        }
        if (!Objects.equals(this.rif, other.rif)) {
            return false;
        }
        if (!Objects.equals(this.nit, other.nit)) {
            return false;
        }
        if (!Objects.equals(this.validador, other.validador)) {
            return false;
        }
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        if (!Objects.equals(this.co_sucu_in, other.co_sucu_in)) {
            return false;
        }
        if (!Objects.equals(this.co_sucu_mo, other.co_sucu_mo)) {
            return false;
        }
        if (!Objects.equals(this.rowguid, other.rowguid)) {
            return false;
        }
        return true;
    }
}
