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
public class ProveedorBO {
    private String co_prov;
    private String prov_des;
    private String co_seg;
    private String co_zon;
    private String tip_pro;
    private String inactivo;
    private String direc1;
    private String direc2;
    private String telefonos;
    private String fax;
    private String respons;
    private String fecha_reg;
    private String mont_cre;
    private String co_mone;
    private String cond_pag;
    private String plaz_pag;
    private String desc_ppago;
    private String desc_glob;
    private String rif;
    private String  nacional;
    private String numcom;
    private String feccom;
    private String dis_cen;
    private String nit;
    private String email;
    private String co_cta_ingr_egr;
    private String comentario;
    private String tipo_adi;
    private String matriz;
    private String co_tab;
    private String tipo_per;
    private String co_pais;
    private String ciudad;
    private String zip;
    private String website;
    private String formtype;
    private String taxid;
    private String contribu_e;
    private String rete_regis_doc;
    private String porc_esp;
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
    private String email_alterno;
    private String sujeto_obj_retenISLR_auto;
    private String sTComp;
    private String sTgasto;
    private String sMaquina;

    public ProveedorBO() {
    }

    public ProveedorBO(String co_prov, String prov_des, String co_seg, String co_zon, String tip_pro, String inactivo, String direc1, String direc2, String telefonos, String fax, String respons, String fecha_reg, String mont_cre, String co_mone, String cond_pag, String plaz_pag, String desc_ppago, String desc_glob, String rif, String nacional, String numcom, String feccom, String dis_cen, String nit, String email, String co_cta_ingr_egr, String comentario, String tipo_adi, String matriz, String co_tab, String tipo_per, String co_pais, String ciudad, String zip, String website, String formtype, String taxid, String contribu_e, String rete_regis_doc, String porc_esp, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, String campo7, String campo8, String co_us_in, String co_sucu_in, String fe_us_in, String co_us_mo, String co_sucu_mo, String fe_us_mo, String revisado, String trasnfe, String validador, String rowguid, String email_alterno, String sujeto_obj_retenISLR_auto,String sTComp , String sTgasto,String sMaquina) {
        this.co_prov = co_prov;
        this.prov_des = prov_des;
        this.co_seg = co_seg;
        this.co_zon = co_zon;
        this.tip_pro = tip_pro;
        this.inactivo = inactivo;
        this.direc1 = direc1;
        this.direc2 = direc2;
        this.telefonos = telefonos;
        this.fax = fax;
        this.respons = respons;
        this.fecha_reg = fecha_reg;
        this.mont_cre = mont_cre;
        this.co_mone = co_mone;
        this.cond_pag = cond_pag;
        this.plaz_pag = plaz_pag;
        this.desc_ppago = desc_ppago;
        this.desc_glob = desc_glob;
        this.rif = rif;
        this.nacional = nacional;
        this.numcom = numcom;
        this.feccom = feccom;
        this.dis_cen = dis_cen;
        this.nit = nit;
        this.email = email;
        this.co_cta_ingr_egr = co_cta_ingr_egr;
        this.comentario = comentario;
        this.tipo_adi = tipo_adi;
        this.matriz = matriz;
        this.co_tab = co_tab;
        this.tipo_per = tipo_per;
        this.co_pais = co_pais;
        this.ciudad = ciudad;
        this.zip = zip;
        this.website = website;
        this.formtype = formtype;
        this.taxid = taxid;
        this.contribu_e = contribu_e;
        this.rete_regis_doc = rete_regis_doc;
        this.porc_esp = porc_esp;
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
        this.email_alterno = email_alterno;
        this.sujeto_obj_retenISLR_auto = sujeto_obj_retenISLR_auto;
        this.sTComp = sTComp;
        this.sTgasto = sTgasto;
        this.sMaquina = sMaquina;
        
    }

    public String getMaquina(){
        return sMaquina;
    }
    public void setMaquina(String sMaquina){
    this.sMaquina=sMaquina ;
    }
    
    public String getsTgasto(){
        return sTgasto;
    }
    public void setsTgasto(String sTgasto ){
        this.sTgasto = sTgasto;
    }
    public String getSTcomp(){
        return sTComp;
    }
    public void setSTcomp(String  sTcomp){
        this.sTComp = sTcomp;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCo_cta_ingr_egr() {
        return co_cta_ingr_egr;
    }

    public void setCo_cta_ingr_egr(String co_cta_ingr_egr) {
        this.co_cta_ingr_egr = co_cta_ingr_egr;
    }

    public String getCo_mone() {
        return co_mone;
    }

    public void setCo_mone(String co_mone) {
        this.co_mone = co_mone;
    }

    public String getCo_pais() {
        return co_pais;
    }

    public void setCo_pais(String co_pais) {
        this.co_pais = co_pais;
    }

    public String getCo_prov() {
        return co_prov;
    }

    public void setCo_prov(String co_prov) {
        this.co_prov = co_prov;
    }

    public String getCo_seg() {
        return co_seg;
    }

    public void setCo_seg(String co_seg) {
        this.co_seg = co_seg;
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

    public String getCo_tab() {
        return co_tab;
    }

    public void setCo_tab(String co_tab) {
        this.co_tab = co_tab;
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

    public String getCo_zon() {
        return co_zon;
    }

    public void setCo_zon(String co_zon) {
        this.co_zon = co_zon;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getCond_pag() {
        return cond_pag;
    }

    public void setCond_pag(String cond_pag) {
        this.cond_pag = cond_pag;
    }

    public String getContribu_e() {
        return contribu_e;
    }

    public void setContribu_e(String contribu_e) {
        this.contribu_e = contribu_e;
    }

    public String getDesc_glob() {
        return desc_glob;
    }

    public void setDesc_glob(String desc_glob) {
        this.desc_glob = desc_glob;
    }

    public String getDesc_ppago() {
        return desc_ppago;
    }

    public void setDesc_ppago(String desc_ppago) {
        this.desc_ppago = desc_ppago;
    }

    public String getDirec1() {
        return direc1;
    }

    public void setDirec1(String direc1) {
        this.direc1 = direc1;
    }

    public String getDirec2() {
        return direc2;
    }

    public void setDirec2(String direc2) {
        this.direc2 = direc2;
    }

    public String getDis_cen() {
        return dis_cen;
    }

    public void setDis_cen(String dis_cen) {
        this.dis_cen = dis_cen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail_alterno() {
        return email_alterno;
    }

    public void setEmail_alterno(String email_alterno) {
        this.email_alterno = email_alterno;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public String getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(String fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    public String getFormtype() {
        return formtype;
    }

    public void setFormtype(String formtype) {
        this.formtype = formtype;
    }

    public String getInactivo() {
        return inactivo;
    }

    public void setInactivo(String inactivo) {
        this.inactivo = inactivo;
    }

    public String getMatriz() {
        return matriz;
    }

    public void setMatriz(String matriz) {
        this.matriz = matriz;
    }

    public String getMont_cre() {
        return mont_cre;
    }

    public void setMont_cre(String mont_cre) {
        this.mont_cre = mont_cre;
    }

    public String getNacional() {
        return nacional;
    }

    public void setNacional(String nacional) {
        this.nacional = nacional;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNumcom() {
        return numcom;
    }

    public void setNumcom(String numcom) {
        this.numcom = numcom;
    }

    public String getPlaz_pag() {
        return plaz_pag;
    }

    public void setPlaz_pag(String plaz_pag) {
        this.plaz_pag = plaz_pag;
    }

    public String getPorc_esp() {
        return porc_esp;
    }

    public void setPorc_esp(String porc_esp) {
        this.porc_esp = porc_esp;
    }

    public String getProv_des() {
        return prov_des;
    }

    public void setProv_des(String prov_des) {
        this.prov_des = prov_des;
    }

    public String getRespons() {
        return respons;
    }

    public void setRespons(String respons) {
        this.respons = respons;
    }

    public String getRete_regis_doc() {
        return rete_regis_doc;
    }

    public void setRete_regis_doc(String rete_regis_doc) {
        this.rete_regis_doc = rete_regis_doc;
    }

    public String getRevisado() {
        return revisado;
    }

    public void setRevisado(String revisado) {
        this.revisado = revisado;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public String getSujeto_obj_retenISLR_auto() {
        return sujeto_obj_retenISLR_auto;
    }

    public void setSujeto_obj_retenISLR_auto(String sujeto_obj_retenISLR_auto) {
        this.sujeto_obj_retenISLR_auto = sujeto_obj_retenISLR_auto;
    }

    public String getTaxid() {
        return taxid;
    }

    public void setTaxid(String taxid) {
        this.taxid = taxid;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getTip_pro() {
        return tip_pro;
    }

    public void setTip_pro(String tip_pro) {
        this.tip_pro = tip_pro;
    }

    public String getTipo_adi() {
        return tipo_adi;
    }

    public void setTipo_adi(String tipo_adi) {
        this.tipo_adi = tipo_adi;
    }

    public String getTipo_per() {
        return tipo_per;
    }

    public void setTipo_per(String tipo_per) {
        this.tipo_per = tipo_per;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProveedorBO other = (ProveedorBO) obj;
        if (!Objects.equals(this.co_prov, other.co_prov)) {
            return false;
        }
        if (!Objects.equals(this.prov_des, other.prov_des)) {
            return false;
        }
        if (!Objects.equals(this.co_seg, other.co_seg)) {
            return false;
        }
        if (!Objects.equals(this.co_zon, other.co_zon)) {
            return false;
        }
        if (!Objects.equals(this.tip_pro, other.tip_pro)) {
            return false;
        }
        if (!Objects.equals(this.inactivo, other.inactivo)) {
            return false;
        }
        if (!Objects.equals(this.direc1, other.direc1)) {
            return false;
        }
        if (!Objects.equals(this.direc2, other.direc2)) {
            return false;
        }
        if (!Objects.equals(this.telefonos, other.telefonos)) {
            return false;
        }
        if (!Objects.equals(this.fax, other.fax)) {
            return false;
        }
        if (!Objects.equals(this.respons, other.respons)) {
            return false;
        }
        if (!Objects.equals(this.fecha_reg, other.fecha_reg)) {
            return false;
        }
        if (!Objects.equals(this.mont_cre, other.mont_cre)) {
            return false;
        }
        if (!Objects.equals(this.co_mone, other.co_mone)) {
            return false;
        }
        if (!Objects.equals(this.cond_pag, other.cond_pag)) {
            return false;
        }
        if (!Objects.equals(this.plaz_pag, other.plaz_pag)) {
            return false;
        }
        if (!Objects.equals(this.desc_ppago, other.desc_ppago)) {
            return false;
        }
        if (!Objects.equals(this.desc_glob, other.desc_glob)) {
            return false;
        }
        if (!Objects.equals(this.rif, other.rif)) {
            return false;
        }
        if (!Objects.equals(this.nacional, other.nacional)) {
            return false;
        }
        if (!Objects.equals(this.numcom, other.numcom)) {
            return false;
        }
        if (!Objects.equals(this.feccom, other.feccom)) {
            return false;
        }
        if (!Objects.equals(this.dis_cen, other.dis_cen)) {
            return false;
        }
        if (!Objects.equals(this.nit, other.nit)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.co_cta_ingr_egr, other.co_cta_ingr_egr)) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        if (!Objects.equals(this.tipo_adi, other.tipo_adi)) {
            return false;
        }
        if (!Objects.equals(this.matriz, other.matriz)) {
            return false;
        }
        if (!Objects.equals(this.co_tab, other.co_tab)) {
            return false;
        }
        if (!Objects.equals(this.tipo_per, other.tipo_per)) {
            return false;
        }
        if (!Objects.equals(this.co_pais, other.co_pais)) {
            return false;
        }
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
        if (!Objects.equals(this.zip, other.zip)) {
            return false;
        }
        if (!Objects.equals(this.website, other.website)) {
            return false;
        }
        if (!Objects.equals(this.formtype, other.formtype)) {
            return false;
        }
        if (!Objects.equals(this.taxid, other.taxid)) {
            return false;
        }
        if (!Objects.equals(this.contribu_e, other.contribu_e)) {
            return false;
        }
        if (!Objects.equals(this.rete_regis_doc, other.rete_regis_doc)) {
            return false;
        }
        if (!Objects.equals(this.porc_esp, other.porc_esp)) {
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
        if (!Objects.equals(this.email_alterno, other.email_alterno)) {
            return false;
        }
        if (!Objects.equals(this.sujeto_obj_retenISLR_auto, other.sujeto_obj_retenISLR_auto)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.co_prov);
        hash = 97 * hash + Objects.hashCode(this.prov_des);
        hash = 97 * hash + Objects.hashCode(this.co_seg);
        hash = 97 * hash + Objects.hashCode(this.co_zon);
        hash = 97 * hash + Objects.hashCode(this.tip_pro);
        hash = 97 * hash + Objects.hashCode(this.inactivo);
        hash = 97 * hash + Objects.hashCode(this.direc1);
        hash = 97 * hash + Objects.hashCode(this.direc2);
        hash = 97 * hash + Objects.hashCode(this.telefonos);
        hash = 97 * hash + Objects.hashCode(this.fax);
        hash = 97 * hash + Objects.hashCode(this.respons);
        hash = 97 * hash + Objects.hashCode(this.fecha_reg);
        hash = 97 * hash + Objects.hashCode(this.mont_cre);
        hash = 97 * hash + Objects.hashCode(this.co_mone);
        hash = 97 * hash + Objects.hashCode(this.cond_pag);
        hash = 97 * hash + Objects.hashCode(this.plaz_pag);
        hash = 97 * hash + Objects.hashCode(this.desc_ppago);
        hash = 97 * hash + Objects.hashCode(this.desc_glob);
        hash = 97 * hash + Objects.hashCode(this.rif);
        hash = 97 * hash + Objects.hashCode(this.nacional);
        hash = 97 * hash + Objects.hashCode(this.numcom);
        hash = 97 * hash + Objects.hashCode(this.feccom);
        hash = 97 * hash + Objects.hashCode(this.dis_cen);
        hash = 97 * hash + Objects.hashCode(this.nit);
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + Objects.hashCode(this.co_cta_ingr_egr);
        hash = 97 * hash + Objects.hashCode(this.comentario);
        hash = 97 * hash + Objects.hashCode(this.tipo_adi);
        hash = 97 * hash + Objects.hashCode(this.matriz);
        hash = 97 * hash + Objects.hashCode(this.co_tab);
        hash = 97 * hash + Objects.hashCode(this.tipo_per);
        hash = 97 * hash + Objects.hashCode(this.co_pais);
        hash = 97 * hash + Objects.hashCode(this.ciudad);
        hash = 97 * hash + Objects.hashCode(this.zip);
        hash = 97 * hash + Objects.hashCode(this.website);
        hash = 97 * hash + Objects.hashCode(this.formtype);
        hash = 97 * hash + Objects.hashCode(this.taxid);
        hash = 97 * hash + Objects.hashCode(this.contribu_e);
        hash = 97 * hash + Objects.hashCode(this.rete_regis_doc);
        hash = 97 * hash + Objects.hashCode(this.porc_esp);
        hash = 97 * hash + Objects.hashCode(this.campo1);
        hash = 97 * hash + Objects.hashCode(this.campo2);
        hash = 97 * hash + Objects.hashCode(this.campo3);
        hash = 97 * hash + Objects.hashCode(this.campo4);
        hash = 97 * hash + Objects.hashCode(this.campo5);
        hash = 97 * hash + Objects.hashCode(this.campo6);
        hash = 97 * hash + Objects.hashCode(this.campo7);
        hash = 97 * hash + Objects.hashCode(this.campo8);
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
        hash = 97 * hash + Objects.hashCode(this.email_alterno);
        hash = 97 * hash + Objects.hashCode(this.sujeto_obj_retenISLR_auto);
        return hash;
    }
    
    
    
            
}
