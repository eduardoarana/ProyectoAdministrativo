/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.security.Timestamp;
import java.util.Date;

/**
 *
 * @author EArana
 */
public class FacturaCompraBO {

    private String doc_num;
    private String nro_fact;
    private String descrip;
    private String co_prov;
    private String co_mone;
    private String co_cond;
    private String porc_desc_glob;
    private String porc_reca;
    private String status;
    private String n_control;
    private String fec_emis;
    private String fec_venc;
    private String fec_reg;
    private double tasa;
    private double saldo;
    private double total_bruto;
    private double total_neto;
    private double monto_desc_glob;
    private double monto_reca;
    private double otros1;
    private double otros2;
    private double otros3;
    private double monto_imp;
    private double monto_imp2;
    private double monto_imp3;
    private int anulado;
    private int impresa;
    private int seriales_e;
    private String salestax;
    private String dis_cen;
    private Date feccom;
    private int numcom;
    private String dir_ent;
    private String comentario;
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
    private Date fe_us_in;
    private String co_us_mo;
    private String co_sucu_mo;
    private Date fe_us_mo;
    private String revisado;
    private String trasnfe;
    private Timestamp validador;
    private int rowguid;
    private int nac;
    private String co_cta_ingr_egr;
    private String descripcionProveedor;
    private String descripciopnCodicionPago ;
    private String descripcionMoneda ;

    public FacturaCompraBO() {
    }

    
    
    public FacturaCompraBO(String doc_num, String nro_fact, String descrip, String co_prov, String co_mone, String co_cond, String porc_desc_glob, String porc_reca, String status, String n_control, String fec_emis, String fec_venc, String fec_reg, double tasa, double saldo, double total_bruto, double total_neto, double monto_desc_glob, double monto_reca, double otros1, double otros2, double otros3, double monto_imp, double monto_imp2, double monto_imp3, int anulado, int impresa, int seriales_e, String salestax, String dis_cen, Date feccom, int numcom, String dir_ent, String comentario, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, String campo7, String campo8, String co_us_in, String co_sucu_in, Date fe_us_in, String co_us_mo, String co_sucu_mo, Date fe_us_mo, String revisado, String trasnfe, Timestamp validador, int rowguid, int nac, String co_cta_ingr_egr) {
        this.doc_num = doc_num;
        this.nro_fact = nro_fact;
        this.descrip = descrip;
        this.co_prov = co_prov;
        this.co_mone = co_mone;
        this.co_cond = co_cond;
        this.porc_desc_glob = porc_desc_glob;
        this.porc_reca = porc_reca;
        this.status = status;
        this.n_control = n_control;
        this.fec_emis = fec_emis;
        this.fec_venc = fec_venc;
        this.fec_reg = fec_reg;
        this.tasa = tasa;
        this.saldo = saldo;
        this.total_bruto = total_bruto;
        this.total_neto = total_neto;
        this.monto_desc_glob = monto_desc_glob;
        this.monto_reca = monto_reca;
        this.otros1 = otros1;
        this.otros2 = otros2;
        this.otros3 = otros3;
        this.monto_imp = monto_imp;
        this.monto_imp2 = monto_imp2;
        this.monto_imp3 = monto_imp3;
        this.anulado = anulado;
        this.impresa = impresa;
        this.seriales_e = seriales_e;
        this.salestax = salestax;
        this.dis_cen = dis_cen;
        this.feccom = feccom;
        this.numcom = numcom;
        this.dir_ent = dir_ent;
        this.comentario = comentario;
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
        this.nac = nac;
        this.co_cta_ingr_egr = co_cta_ingr_egr;
    }

    public String getDoc_num() {
        return doc_num;
    }

    public void setDoc_num(String doc_num) {
        this.doc_num = doc_num;
    }

    public String getNro_fact() {
        return nro_fact;
    }

    public void setNro_fact(String nro_fact) {
        this.nro_fact = nro_fact;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getCo_prov() {
        return co_prov;
    }

    public void setCo_prov(String co_prov) {
        this.co_prov = co_prov;
    }

    public String getCo_mone() {
        return co_mone;
    }

    public void setCo_mone(String co_mone) {
        this.co_mone = co_mone;
    }

    public String getCo_cond() {
        return co_cond;
    }

    public void setCo_cond(String co_cond) {
        this.co_cond = co_cond;
    }

    public String getPorc_desc_glob() {
        return porc_desc_glob;
    }

    public void setPorc_desc_glob(String porc_desc_glob) {
        this.porc_desc_glob = porc_desc_glob;
    }

    public String getPorc_reca() {
        return porc_reca;
    }

    public void setPorc_reca(String porc_reca) {
        this.porc_reca = porc_reca;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getN_control() {
        return n_control;
    }

    public void setN_control(String n_control) {
        this.n_control = n_control;
    }

 

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTotal_bruto() {
        return total_bruto;
    }

    public void setTotal_bruto(double total_bruto) {
        this.total_bruto = total_bruto;
    }

    public double getTotal_neto() {
        return total_neto;
    }

    public void setTotal_neto(double total_neto) {
        this.total_neto = total_neto;
    }

    public double getMonto_desc_glob() {
        return monto_desc_glob;
    }

    public void setMonto_desc_glob(double monto_desc_glob) {
        this.monto_desc_glob = monto_desc_glob;
    }

    public double getMonto_reca() {
        return monto_reca;
    }

    public void setMonto_reca(double monto_reca) {
        this.monto_reca = monto_reca;
    }

    public double getOtros1() {
        return otros1;
    }

    public void setOtros1(double otros1) {
        this.otros1 = otros1;
    }

    public double getOtros2() {
        return otros2;
    }

    public void setOtros2(double otros2) {
        this.otros2 = otros2;
    }

    public double getOtros3() {
        return otros3;
    }

    public void setOtros3(double otros3) {
        this.otros3 = otros3;
    }

    public double getMonto_imp() {
        return monto_imp;
    }

    public void setMonto_imp(double monto_imp) {
        this.monto_imp = monto_imp;
    }

    public double getMonto_imp2() {
        return monto_imp2;
    }

    public void setMonto_imp2(double monto_imp2) {
        this.monto_imp2 = monto_imp2;
    }

    public double getMonto_imp3() {
        return monto_imp3;
    }

    public void setMonto_imp3(double monto_imp3) {
        this.monto_imp3 = monto_imp3;
    }

    public int getAnulado() {
        return anulado;
    }

    public void setAnulado(int anulado) {
        this.anulado = anulado;
    }

    public int getImpresa() {
        return impresa;
    }

    public void setImpresa(int impresa) {
        this.impresa = impresa;
    }

    public int getSeriales_e() {
        return seriales_e;
    }

    public void setSeriales_e(int seriales_e) {
        this.seriales_e = seriales_e;
    }

    public String getSalestax() {
        return salestax;
    }

    public void setSalestax(String salestax) {
        this.salestax = salestax;
    }

    public String getDis_cen() {
        return dis_cen;
    }

    public void setDis_cen(String dis_cen) {
        this.dis_cen = dis_cen;
    }

    public Date getFeccom() {
        return feccom;
    }

    public void setFeccom(Date feccom) {
        this.feccom = feccom;
    }

    public int getNumcom() {
        return numcom;
    }

    public void setNumcom(int numcom) {
        this.numcom = numcom;
    }

    public String getDir_ent() {
        return dir_ent;
    }

    public void setDir_ent(String dir_ent) {
        this.dir_ent = dir_ent;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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

    public Date getFe_us_in() {
        return fe_us_in;
    }

    public void setFe_us_in(Date fe_us_in) {
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

    public Date getFe_us_mo() {
        return fe_us_mo;
    }

    public void setFe_us_mo(Date fe_us_mo) {
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

    public Timestamp getValidador() {
        return validador;
    }

    public void setValidador(Timestamp validador) {
        this.validador = validador;
    }

    public int getRowguid() {
        return rowguid;
    }

    public void setRowguid(int rowguid) {
        this.rowguid = rowguid;
    }

    public int getNac() {
        return nac;
    }

    public void setNac(int nac) {
        this.nac = nac;
    }

    public String getCo_cta_ingr_egr() {
        return co_cta_ingr_egr;
    }

    public void setCo_cta_ingr_egr(String co_cta_ingr_egr) {
        this.co_cta_ingr_egr = co_cta_ingr_egr;
    }

    public String getFec_emis() {
        return fec_emis;
    }

    public void setFec_emis(String fec_emis) {
        this.fec_emis = fec_emis;
    }

    public String getFec_venc() {
        return fec_venc;
    }

    public void setFec_venc(String fec_venc) {
        this.fec_venc = fec_venc;
    }

    public String getFec_reg() {
        return fec_reg;
    }

    public void setFec_reg(String fec_reg) {
        this.fec_reg = fec_reg;
    }

    public String getDescripcionProveedor() {
        return descripcionProveedor;
    }

    public void setDescripcionProveedor(String descripcionProveedor) {
        this.descripcionProveedor = descripcionProveedor;
    }

    public String getDescripciopnCodicionPago() {
        return descripciopnCodicionPago;
    }

    public void setDescripciopnCodicionPago(String descripciopnCodicionPago) {
        this.descripciopnCodicionPago = descripciopnCodicionPago;
    }

    public String getDescripcionMoneda() {
        return descripcionMoneda;
    }

    public void setDescripcionMoneda(String descripcionMoneda) {
        this.descripcionMoneda = descripcionMoneda;
    }
}
