/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.Date;

/**
 *
 * @author EArana
 */
public class FacturaVentaRengBO {
    
    private int  reng_num;
    private String doc_num ;
    private String co_art ;
    private String des_art;
    private String co_alma;
    private double total_art ;
    private double stotal_art;
    private String co_uni;
    private String sco_uni ;
    private Double co_precio;
    private double prec_vta;
    private double prec_vta_om;
    private String porc_desc;
    private double monto_desc;
    private String tipo_imp;
    private String tipo_imp2;
    private String tipo_imp3;
    private double porc_imp ;
    private double porc_imp2;
    private double porc_imp3;
    private double monto_imp;
    private double monto_imp2;
    private double monto_imp3;
    private double reng_neto;
    private double pendiente ;
    private double pendiente2;
    private String tipo_doc ;
    private String num_doc ;
    private int rowguid_doc ;
    private double total_dev;
    private double monto_dev ;
    private double otros;
    private String comentario ;
    private int lote_asignado;
    private double monto_desc_glob;
    private double monto_reca_glob;
    private double otros1_glob;
    private double otros2_glob;
    private double otros3_glob;
    private double monto_imp_afec_glob;
    private double monto_imp2_afec_glob;
    private double monto_imp3_afec_glob;
    private String dis_cen ;
    private String co_us_in;
    private String co_sucu_in;
    private Date  fe_us_in;
    private String co_us_mo;
    private String co_sucu_mo;
    private Date fe_us_mo ;
    private String revisado ;
    private String trasnfe;
    private int rowguid ;

    public FacturaVentaRengBO() {
    }

    public FacturaVentaRengBO(int reng_num, String doc_num, String co_art, String des_art, String co_alma, double total_art, double stotal_art, String co_uni, String sco_uni, String co_precio, double prec_vta, double prec_vta_om, String porc_desc, double monto_desc, String tipo_imp, String tipo_imp2, String tipo_imp3, double porc_imp, double porc_imp2, double porc_imp3, double monto_imp, double monto_imp2, double monto_imp3, double reng_neto, double pendiente, double pendiente2, String tipo_doc, String num_doc, int rowguid_doc, double total_dev, double monto_dev, double otros, String comentario, int lote_asignado, double monto_desc_glob, double monto_reca_glob, double otros1_glob, double otros2_glob, double otros3_glob, double monto_imp_afec_glob, double monto_imp2_afec_glob, double monto_imp3_afec_glob, String dis_cen, String co_us_in, String co_sucu_in, Date fe_us_in, String co_us_mo, String co_sucu_mo, Date fe_us_mo, String revisado, String trasnfe, int rowguid) {
        this.reng_num = reng_num;
        this.doc_num = doc_num;
        this.co_art = co_art;
        this.des_art = des_art;
        this.co_alma = co_alma;
        this.total_art = total_art;
        this.stotal_art = stotal_art;
        this.co_uni = co_uni;
        this.sco_uni = sco_uni;
       // this.co_precio = co_precio;
        this.prec_vta = prec_vta;
        this.prec_vta_om = prec_vta_om;
        this.porc_desc = porc_desc;
        this.monto_desc = monto_desc;
        this.tipo_imp = tipo_imp;
        this.tipo_imp2 = tipo_imp2;
        this.tipo_imp3 = tipo_imp3;
        this.porc_imp = porc_imp;
        this.porc_imp2 = porc_imp2;
        this.porc_imp3 = porc_imp3;
        this.monto_imp = monto_imp;
        this.monto_imp2 = monto_imp2;
        this.monto_imp3 = monto_imp3;
        this.reng_neto = reng_neto;
        this.pendiente = pendiente;
        this.pendiente2 = pendiente2;
        this.tipo_doc = tipo_doc;
        this.num_doc = num_doc;
        this.rowguid_doc = rowguid_doc;
        this.total_dev = total_dev;
        this.monto_dev = monto_dev;
        this.otros = otros;
        this.comentario = comentario;
        this.lote_asignado = lote_asignado;
        this.monto_desc_glob = monto_desc_glob;
        this.monto_reca_glob = monto_reca_glob;
        this.otros1_glob = otros1_glob;
        this.otros2_glob = otros2_glob;
        this.otros3_glob = otros3_glob;
        this.monto_imp_afec_glob = monto_imp_afec_glob;
        this.monto_imp2_afec_glob = monto_imp2_afec_glob;
        this.monto_imp3_afec_glob = monto_imp3_afec_glob;
        this.dis_cen = dis_cen;
        this.co_us_in = co_us_in;
        this.co_sucu_in = co_sucu_in;
        this.fe_us_in = fe_us_in;
        this.co_us_mo = co_us_mo;
        this.co_sucu_mo = co_sucu_mo;
        this.fe_us_mo = fe_us_mo;
        this.revisado = revisado;
        this.trasnfe = trasnfe;
        this.rowguid = rowguid;
    }

    public int getReng_num() {
        return reng_num;
    }

    public void setReng_num(int reng_num) {
        this.reng_num = reng_num;
    }

    public String getDoc_num() {
        return doc_num;
    }

    public void setDoc_num(String doc_num) {
        this.doc_num = doc_num;
    }

    public String getCo_art() {
        return co_art;
    }

    public void setCo_art(String co_art) {
        this.co_art = co_art;
    }

    public String getDes_art() {
        return des_art;
    }

    public void setDes_art(String des_art) {
        this.des_art = des_art;
    }

    public String getCo_alma() {
        return co_alma;
    }

    public void setCo_alma(String co_alma) {
        this.co_alma = co_alma;
    }

    public double getTotal_art() {
        return total_art;
    }

    public void setTotal_art(double total_art) {
        this.total_art = total_art;
    }

    public double getStotal_art() {
        return stotal_art;
    }

    public void setStotal_art(double stotal_art) {
        this.stotal_art = stotal_art;
    }

    public String getCo_uni() {
        return co_uni;
    }

    public void setCo_uni(String co_uni) {
        this.co_uni = co_uni;
    }

    public String getSco_uni() {
        return sco_uni;
    }

    public void setSco_uni(String sco_uni) {
        this.sco_uni = sco_uni;
    }

   

    public double getPrec_vta() {
        return prec_vta;
    }

    public void setPrec_vta(double prec_vta) {
        this.prec_vta = prec_vta;
    }

    public double getPrec_vta_om() {
        return prec_vta_om;
    }

    public void setPrec_vta_om(double prec_vta_om) {
        this.prec_vta_om = prec_vta_om;
    }

    public String getPorc_desc() {
        return porc_desc;
    }

    public void setPorc_desc(String porc_desc) {
        this.porc_desc = porc_desc;
    }

    public double getMonto_desc() {
        return monto_desc;
    }

    public void setMonto_desc(double monto_desc) {
        this.monto_desc = monto_desc;
    }

    public String getTipo_imp() {
        return tipo_imp;
    }

    public void setTipo_imp(String tipo_imp) {
        this.tipo_imp = tipo_imp;
    }

    public String getTipo_imp2() {
        return tipo_imp2;
    }

    public void setTipo_imp2(String tipo_imp2) {
        this.tipo_imp2 = tipo_imp2;
    }

    public String getTipo_imp3() {
        return tipo_imp3;
    }

    public void setTipo_imp3(String tipo_imp3) {
        this.tipo_imp3 = tipo_imp3;
    }

    public double getPorc_imp() {
        return porc_imp;
    }

    public void setPorc_imp(double porc_imp) {
        this.porc_imp = porc_imp;
    }

    public double getPorc_imp2() {
        return porc_imp2;
    }

    public void setPorc_imp2(double porc_imp2) {
        this.porc_imp2 = porc_imp2;
    }

    public double getPorc_imp3() {
        return porc_imp3;
    }

    public void setPorc_imp3(double porc_imp3) {
        this.porc_imp3 = porc_imp3;
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

    public double getReng_neto() {
        return reng_neto;
    }

    public void setReng_neto(double reng_neto) {
        this.reng_neto = reng_neto;
    }

    public double getPendiente() {
        return pendiente;
    }

    public void setPendiente(double pendiente) {
        this.pendiente = pendiente;
    }

    public double getPendiente2() {
        return pendiente2;
    }

    public void setPendiente2(double pendiente2) {
        this.pendiente2 = pendiente2;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public int getRowguid_doc() {
        return rowguid_doc;
    }

    public void setRowguid_doc(int rowguid_doc) {
        this.rowguid_doc = rowguid_doc;
    }

    public double getTotal_dev() {
        return total_dev;
    }

    public void setTotal_dev(double total_dev) {
        this.total_dev = total_dev;
    }

    public double getMonto_dev() {
        return monto_dev;
    }

    public void setMonto_dev(double monto_dev) {
        this.monto_dev = monto_dev;
    }

    public double getOtros() {
        return otros;
    }

    public void setOtros(double otros) {
        this.otros = otros;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getLote_asignado() {
        return lote_asignado;
    }

    public void setLote_asignado(int lote_asignado) {
        this.lote_asignado = lote_asignado;
    }

    public double getMonto_desc_glob() {
        return monto_desc_glob;
    }

    public void setMonto_desc_glob(double monto_desc_glob) {
        this.monto_desc_glob = monto_desc_glob;
    }

    public double getMonto_reca_glob() {
        return monto_reca_glob;
    }

    public void setMonto_reca_glob(double monto_reca_glob) {
        this.monto_reca_glob = monto_reca_glob;
    }

    public double getOtros1_glob() {
        return otros1_glob;
    }

    public void setOtros1_glob(double otros1_glob) {
        this.otros1_glob = otros1_glob;
    }

    public double getOtros2_glob() {
        return otros2_glob;
    }

    public void setOtros2_glob(double otros2_glob) {
        this.otros2_glob = otros2_glob;
    }

    public double getOtros3_glob() {
        return otros3_glob;
    }

    public void setOtros3_glob(double otros3_glob) {
        this.otros3_glob = otros3_glob;
    }

    public double getMonto_imp_afec_glob() {
        return monto_imp_afec_glob;
    }

    public void setMonto_imp_afec_glob(double monto_imp_afec_glob) {
        this.monto_imp_afec_glob = monto_imp_afec_glob;
    }

    public double getMonto_imp2_afec_glob() {
        return monto_imp2_afec_glob;
    }

    public void setMonto_imp2_afec_glob(double monto_imp2_afec_glob) {
        this.monto_imp2_afec_glob = monto_imp2_afec_glob;
    }

    public double getMonto_imp3_afec_glob() {
        return monto_imp3_afec_glob;
    }

    public void setMonto_imp3_afec_glob(double monto_imp3_afec_glob) {
        this.monto_imp3_afec_glob = monto_imp3_afec_glob;
    }

    public String getDis_cen() {
        return dis_cen;
    }

    public void setDis_cen(String dis_cen) {
        this.dis_cen = dis_cen;
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

    public int getRowguid() {
        return rowguid;
    }

    public void setRowguid(int rowguid) {
        this.rowguid = rowguid;
    }

    public Double getCo_precio() {
        return co_precio;
    }

    public void setCo_precio(Double co_precio) {
        this.co_precio = co_precio;
    }
}
