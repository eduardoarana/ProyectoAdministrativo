/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author aranaVentur
 */
public class FacturaCompraRengBO {

    private int reng_num;
    private String doc_num;
    private String co_art;
    private String des_art;
    private String co_uni;
    private String sco_uni;
    private String co_alma;
    private String tipo_imp;
    private String tipo_imp2;
    private String tipo_imp3;
    private String tipo_doc;
    private String porc_desc;
    private String num_doc;
    private int rowguid_doc;
    private Double reng_neto;
    private Double cost_unit;
    private Double cost_unit_om;
    private int total_art;
    private Double stotal_art;
    private Double otros;
    private Double porc_imp;
    private Double porc_imp2;
    private Double porc_imp3;
    private Double monto_imp;
    private Double monto_imp2;
    private Double monto_imp3;
    private Double porc_gas;
    private Double total_dev;
    private Double monto_dev;
    private int lote_asignado;
    private Double monto_desc_glob;
    private Double monto_reca_glob;
    private Double otros1_glob;
    private Double otros2_glob;
    private Double otros3_glob;
    private Double monto_imp_afec_glob;
    private Double monto_imp2_afec_glob;
    private Double monto_imp3_afec_glob;
    private Double monto_desc;
    private Double pendiente;
    private Double pendiente2;
    private String comentario;
    private Double costo_adi1;
    private Double costo_adi2;
    private Double costo_adi3;
    private Double dis_cen;
    private String co_sucu_in;
    private String co_us_in;
    private String fe_us_in;
    private String co_sucu_mo;
    private String co_us_mo;
    private String fe_us_mo;
    private String revisado;
    private String trasnfe;
    private String rowguid;

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

    public String getCo_alma() {
        return co_alma;
    }

    public void setCo_alma(String co_alma) {
        this.co_alma = co_alma;
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

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getPorc_desc() {
        return porc_desc;
    }

    public void setPorc_desc(String porc_desc) {
        this.porc_desc = porc_desc;
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

    public Double getReng_neto() {
        return reng_neto;
    }

    public void setReng_neto(Double reng_neto) {
        this.reng_neto = reng_neto;
    }

    public Double getCost_unit() {
        return cost_unit;
    }

    public void setCost_unit(Double cost_unit) {
        this.cost_unit = cost_unit;
    }

    public Double getCost_unit_om() {
        return cost_unit_om;
    }

    public void setCost_unit_om(Double cost_unit_om) {
        this.cost_unit_om = cost_unit_om;
    }

    public Double getStotal_art() {
        return stotal_art;
    }

    public void setStotal_art(Double stotal_art) {
        this.stotal_art = stotal_art;
    }

    public Double getOtros() {
        return otros;
    }

    public void setOtros(Double otros) {
        this.otros = otros;
    }

    public Double getPorc_imp() {
        return porc_imp;
    }

    public void setPorc_imp(Double porc_imp) {
        this.porc_imp = porc_imp;
    }

    public Double getPorc_imp2() {
        return porc_imp2;
    }

    public void setPorc_imp2(Double porc_imp2) {
        this.porc_imp2 = porc_imp2;
    }

    public Double getPorc_imp3() {
        return porc_imp3;
    }

    public void setPorc_imp3(Double porc_imp3) {
        this.porc_imp3 = porc_imp3;
    }

    public Double getMonto_imp() {
        return monto_imp;
    }

    public void setMonto_imp(Double monto_imp) {
        this.monto_imp = monto_imp;
    }

    public Double getMonto_imp2() {
        return monto_imp2;
    }

    public void setMonto_imp2(Double monto_imp2) {
        this.monto_imp2 = monto_imp2;
    }

    public Double getMonto_imp3() {
        return monto_imp3;
    }

    public void setMonto_imp3(Double monto_imp3) {
        this.monto_imp3 = monto_imp3;
    }

    public Double getPorc_gas() {
        return porc_gas;
    }

    public void setPorc_gas(Double porc_gas) {
        this.porc_gas = porc_gas;
    }

    public Double getTotal_dev() {
        return total_dev;
    }

    public void setTotal_dev(Double total_dev) {
        this.total_dev = total_dev;
    }

    public Double getMonto_dev() {
        return monto_dev;
    }

    public void setMonto_dev(Double monto_dev) {
        this.monto_dev = monto_dev;
    }

    public int getLote_asignado() {
        return lote_asignado;
    }

    public void setLote_asignado(int lote_asignado) {
        this.lote_asignado = lote_asignado;
    }

    public Double getMonto_desc_glob() {
        return monto_desc_glob;
    }

    public void setMonto_desc_glob(Double monto_desc_glob) {
        this.monto_desc_glob = monto_desc_glob;
    }

    public Double getMonto_reca_glob() {
        return monto_reca_glob;
    }

    public void setMonto_reca_glob(Double monto_reca_glob) {
        this.monto_reca_glob = monto_reca_glob;
    }

    public Double getOtros1_glob() {
        return otros1_glob;
    }

    public void setOtros1_glob(Double otros1_glob) {
        this.otros1_glob = otros1_glob;
    }

    public Double getOtros2_glob() {
        return otros2_glob;
    }

    public void setOtros2_glob(Double otros2_glob) {
        this.otros2_glob = otros2_glob;
    }

    public Double getOtros3_glob() {
        return otros3_glob;
    }

    public void setOtros3_glob(Double otros3_glob) {
        this.otros3_glob = otros3_glob;
    }

    public Double getMonto_imp_afec_glob() {
        return monto_imp_afec_glob;
    }

    public void setMonto_imp_afec_glob(Double monto_imp_afec_glob) {
        this.monto_imp_afec_glob = monto_imp_afec_glob;
    }

    public Double getMonto_imp2_afec_glob() {
        return monto_imp2_afec_glob;
    }

    public void setMonto_imp2_afec_glob(Double monto_imp2_afec_glob) {
        this.monto_imp2_afec_glob = monto_imp2_afec_glob;
    }

    public Double getMonto_imp3_afec_glob() {
        return monto_imp3_afec_glob;
    }

    public void setMonto_imp3_afec_glob(Double monto_imp3_afec_glob) {
        this.monto_imp3_afec_glob = monto_imp3_afec_glob;
    }

    public Double getMonto_desc() {
        return monto_desc;
    }

    public void setMonto_desc(Double monto_desc) {
        this.monto_desc = monto_desc;
    }

    public Double getPendiente() {
        return pendiente;
    }

    public void setPendiente(Double pendiente) {
        this.pendiente = pendiente;
    }

    public Double getPendiente2() {
        return pendiente2;
    }

    public void setPendiente2(Double pendiente2) {
        this.pendiente2 = pendiente2;
    }

   

    public Double getCosto_adi1() {
        return costo_adi1;
    }

    public void setCosto_adi1(Double costo_adi1) {
        this.costo_adi1 = costo_adi1;
    }

    public Double getCosto_adi2() {
        return costo_adi2;
    }

    public void setCosto_adi2(Double costo_adi2) {
        this.costo_adi2 = costo_adi2;
    }

    public Double getCosto_adi3() {
        return costo_adi3;
    }

    public void setCosto_adi3(Double costo_adi3) {
        this.costo_adi3 = costo_adi3;
    }

    public Double getDis_cen() {
        return dis_cen;
    }

    public void setDis_cen(Double dis_cen) {
        this.dis_cen = dis_cen;
    }

    public String getCo_sucu_in() {
        return co_sucu_in;
    }

    public void setCo_sucu_in(String co_sucu_in) {
        this.co_sucu_in = co_sucu_in;
    }

    public String getCo_us_in() {
        return co_us_in;
    }

    public void setCo_us_in(String co_us_in) {
        this.co_us_in = co_us_in;
    }

    public String getFe_us_in() {
        return fe_us_in;
    }

    public void setFe_us_in(String fe_us_in) {
        this.fe_us_in = fe_us_in;
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

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public int getTotal_art() {
        return total_art;
    }

    public void setTotal_art(int total_art) {
        this.total_art = total_art;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}
