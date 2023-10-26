/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.Objects;

/**
 *
 * @author EArana
 */
public class ClienteBO {

    private String co_cli;
    private String tipo_cli;
    private String cli_des;
    private String direc1;
    private String dir_ent2;
    private String direc2;
    private String telefonos;
    private String fax;
    private String inactivo;
    private String comentario;
    private String respons;
    private String fecha_reg;
    private String puntaje;
    private String mont_cre;
    private String co_mone;
    private String cond_pag;
    private String plaz_pag;
    private String desc_ppago;
    private String co_zon;
    private String co_seg;
    private String co_ven;
    private String desc_glob;
    private String horar_caja;
    private String frecu_vist;
    private String lunes;
    private String martes;
    private String miercoles;
    private String jueves;
    private String viernes;
    private String sabado;
    private String domingo;
    private String rif;
    private String nit;
    private String contrib;
    private String numcom;
    private String feccom;
    private String dis_cen;
    private String email;
    private String co_cta_ingr_egr;
    private String juridico;
    private String tipo_adi;
    private String matriz;
    private String co_tab;
    private String tipo_per;
    private String valido;
    private String ciudad;
    private String zip;
    private String login;
    private String password;
    private String website;
    private String sincredito;
    private String contribu_e;
    private String rete_regis_doc;
    private String porc_esp;
    private String co_pais;
    private String serialp;
    private String id;
    private String salestax;
    private String estado;
    private String campo1;
    private String campo2;
    private String campo3;
    private String campo4;
    private String campo5;
    private String campo6;
    private String campo7;
    private String campo8;
    private String co_us_in;
    private String fe_us_in;
    private String co_sucu_in;
    private String co_us_mo;
    private String fe_us_mo;
    private String co_sucu_mo;
    private String revisado;
    private String validador;
    private String rowguid;
    private String email_alterno;
    private String zonaDescripcion;
    private String co_cta_in_Descripcion;
    private String segmentDescripcion ;
    private String vendedorDdescripcion;
    private String paisDescripcion;
    private String tipoClienteDescricion;
    private String tabuladorDescripcion ;
    
    

    public ClienteBO() {
    }

    public ClienteBO(String co_cli, String tipo_cli, String cli_des, String direc1, String dir_ent2, String direc2, String telefonos, String fax, String inactivo, String comentario, String respons, String fecha_reg, String puntaje, String mont_cre, String co_mone, String cond_pag, String plaz_pag, String desc_ppago, String co_zon, String co_seg, String co_ven, String desc_glob, String horar_caja, String frecu_vist, String lunes, String martes, String miercoles, String jueves, String viernes, String sabado, String domingo, String rif, String nit, String contrib, String numcom, String feccom, String dis_cen, String email, String co_cta_ingr_egr, String juridico, String tipo_adi, String matriz, String co_tab, String tipo_per, String valido, String ciudad, String zip, String login, String password, String website, String sincredito, String contribu_e, String rete_regis_doc, String porc_esp, String co_pais, String serialp, String id, String salestax, String estado, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, String campo7, String campo8, String co_us_in, String fe_us_in, String co_sucu_in, String co_us_mo, String fe_us_mo, String co_sucu_mo, String revisado, String validador, String rowguid, String email_alterno) {
        this.co_cli = co_cli;
        this.tipo_cli = tipo_cli;
        this.cli_des = cli_des;
        this.direc1 = direc1;
        this.dir_ent2 = dir_ent2;
        this.direc2 = direc2;
        this.telefonos = telefonos;
        this.fax = fax;
        this.inactivo = inactivo;
        this.comentario = comentario;
        this.respons = respons;
        this.fecha_reg = fecha_reg;
        this.puntaje = puntaje;
        this.mont_cre = mont_cre;
        this.co_mone = co_mone;
        this.cond_pag = cond_pag;
        this.plaz_pag = plaz_pag;
        this.desc_ppago = desc_ppago;
        this.co_zon = co_zon;
        this.co_seg = co_seg;
        this.co_ven = co_ven;
        this.desc_glob = desc_glob;
        this.horar_caja = horar_caja;
        this.frecu_vist = frecu_vist;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
        this.domingo = domingo;
        this.rif = rif;
        this.nit = nit;
        this.contrib = contrib;
        this.numcom = numcom;
        this.feccom = feccom;
        this.dis_cen = dis_cen;
        this.email = email;
        this.co_cta_ingr_egr = co_cta_ingr_egr;
        this.juridico = juridico;
        this.tipo_adi = tipo_adi;
        this.matriz = matriz;
        this.co_tab = co_tab;
        this.tipo_per = tipo_per;
        this.valido = valido;
        this.ciudad = ciudad;
        this.zip = zip;
        this.login = login;
        this.password = password;
        this.website = website;
        this.sincredito = sincredito;
        this.contribu_e = contribu_e;
        this.rete_regis_doc = rete_regis_doc;
        this.porc_esp = porc_esp;
        this.co_pais = co_pais;
        this.serialp = serialp;
        this.id = id;
        this.salestax = salestax;
        this.estado = estado;
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.campo4 = campo4;
        this.campo5 = campo5;
        this.campo6 = campo6;
        this.campo7 = campo7;
        this.campo8 = campo8;
        this.co_us_in = co_us_in;
        this.fe_us_in = fe_us_in;
        this.co_sucu_in = co_sucu_in;
        this.co_us_mo = co_us_mo;
        this.fe_us_mo = fe_us_mo;
        this.co_sucu_mo = co_sucu_mo;
        this.revisado = revisado;
        this.validador = validador;
        this.rowguid = rowguid;
        this.email_alterno = email_alterno;
    }

    public String getCo_cli() {
        return co_cli;
    }

    public void setCo_cli(String co_cli) {
        this.co_cli = co_cli;
    }

    public String getTipo_cli() {
        return tipo_cli;
    }

    public void setTipo_cli(String tipo_cli) {
        this.tipo_cli = tipo_cli;
    }

    public String getCli_des() {
        return cli_des;
    }

    public void setCli_des(String cli_des) {
        this.cli_des = cli_des;
    }

    public String getDirec1() {
        return direc1;
    }

    public void setDirec1(String direc1) {
        this.direc1 = direc1;
    }

    public String getDir_ent2() {
        return dir_ent2;
    }

    public void setDir_ent2(String dir_ent2) {
        this.dir_ent2 = dir_ent2;
    }

    public String getDirec2() {
        return direc2;
    }

    public void setDirec2(String direc2) {
        this.direc2 = direc2;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getInactivo() {
        return inactivo;
    }

    public void setInactivo(String inactivo) {
        this.inactivo = inactivo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getRespons() {
        return respons;
    }

    public void setRespons(String respons) {
        this.respons = respons;
    }

    public String getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(String fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public String getMont_cre() {
        return mont_cre;
    }

    public void setMont_cre(String mont_cre) {
        this.mont_cre = mont_cre;
    }

    public String getCo_mone() {
        return co_mone;
    }

    public void setCo_mone(String co_mone) {
        this.co_mone = co_mone;
    }

    public String getCond_pag() {
        return cond_pag;
    }

    public void setCond_pag(String cond_pag) {
        this.cond_pag = cond_pag;
    }

    public String getPlaz_pag() {
        return plaz_pag;
    }

    public void setPlaz_pag(String plaz_pag) {
        this.plaz_pag = plaz_pag;
    }

    public String getDesc_ppago() {
        return desc_ppago;
    }

    public void setDesc_ppago(String desc_ppago) {
        this.desc_ppago = desc_ppago;
    }

    public String getCo_zon() {
        return co_zon;
    }

    public void setCo_zon(String co_zon) {
        this.co_zon = co_zon;
    }

    public String getCo_seg() {
        return co_seg;
    }

    public void setCo_seg(String co_seg) {
        this.co_seg = co_seg;
    }

    public String getCo_ven() {
        return co_ven;
    }

    public void setCo_ven(String co_ven) {
        this.co_ven = co_ven;
    }

    public String getDesc_glob() {
        return desc_glob;
    }

    public void setDesc_glob(String desc_glob) {
        this.desc_glob = desc_glob;
    }

    public String getHorar_caja() {
        return horar_caja;
    }

    public void setHorar_caja(String horar_caja) {
        this.horar_caja = horar_caja;
    }

    public String getFrecu_vist() {
        return frecu_vist;
    }

    public void setFrecu_vist(String frecu_vist) {
        this.frecu_vist = frecu_vist;
    }

    public String getLunes() {
        return lunes;
    }

    public void setLunes(String lunes) {
        this.lunes = lunes;
    }

    public String getMartes() {
        return martes;
    }

    public void setMartes(String martes) {
        this.martes = martes;
    }

    public String getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }

    public String getJueves() {
        return jueves;
    }

    public void setJueves(String jueves) {
        this.jueves = jueves;
    }

    public String getViernes() {
        return viernes;
    }

    public void setViernes(String viernes) {
        this.viernes = viernes;
    }

    public String getSabado() {
        return sabado;
    }

    public void setSabado(String sabado) {
        this.sabado = sabado;
    }

    public String getDomingo() {
        return domingo;
    }

    public void setDomingo(String domingo) {
        this.domingo = domingo;
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

    public String getContrib() {
        return contrib;
    }

    public void setContrib(String contrib) {
        this.contrib = contrib;
    }

    public String getNumcom() {
        return numcom;
    }

    public void setNumcom(String numcom) {
        this.numcom = numcom;
    }

    public String getFeccom() {
        return feccom;
    }

    public void setFeccom(String feccom) {
        this.feccom = feccom;
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

    public String getCo_cta_ingr_egr() {
        return co_cta_ingr_egr;
    }

    public void setCo_cta_ingr_egr(String co_cta_ingr_egr) {
        this.co_cta_ingr_egr = co_cta_ingr_egr;
    }

    public String getJuridico() {
        return juridico;
    }

    public void setJuridico(String juridico) {
        this.juridico = juridico;
    }

    public String getTipo_adi() {
        return tipo_adi;
    }

    public void setTipo_adi(String tipo_adi) {
        this.tipo_adi = tipo_adi;
    }

    public String getMatriz() {
        return matriz;
    }

    public void setMatriz(String matriz) {
        this.matriz = matriz;
    }

    public String getCo_tab() {
        return co_tab;
    }

    public void setCo_tab(String co_tab) {
        this.co_tab = co_tab;
    }

    public String getTipo_per() {
        return tipo_per;
    }

    public void setTipo_per(String tipo_per) {
        this.tipo_per = tipo_per;
    }

    public String getValido() {
        return valido;
    }

    public void setValido(String valido) {
        this.valido = valido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSincredito() {
        return sincredito;
    }

    public void setSincredito(String sincredito) {
        this.sincredito = sincredito;
    }

    public String getContribu_e() {
        return contribu_e;
    }

    public void setContribu_e(String contribu_e) {
        this.contribu_e = contribu_e;
    }

    public String getRete_regis_doc() {
        return rete_regis_doc;
    }

    public void setRete_regis_doc(String rete_regis_doc) {
        this.rete_regis_doc = rete_regis_doc;
    }

    public String getPorc_esp() {
        return porc_esp;
    }

    public void setPorc_esp(String porc_esp) {
        this.porc_esp = porc_esp;
    }

    public String getCo_pais() {
        return co_pais;
    }

    public void setCo_pais(String co_pais) {
        this.co_pais = co_pais;
    }

    public String getSerialp() {
        return serialp;
    }

    public void setSerialp(String serialp) {
        this.serialp = serialp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSalestax() {
        return salestax;
    }

    public void setSalestax(String salestax) {
        this.salestax = salestax;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public String getFe_us_in() {
        return fe_us_in;
    }

    public void setFe_us_in(String fe_us_in) {
        this.fe_us_in = fe_us_in;
    }

    public String getCo_sucu_in() {
        return co_sucu_in;
    }

    public void setCo_sucu_in(String co_sucu_in) {
        this.co_sucu_in = co_sucu_in;
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

    public String getCo_sucu_mo() {
        return co_sucu_mo;
    }

    public void setCo_sucu_mo(String co_sucu_mo) {
        this.co_sucu_mo = co_sucu_mo;
    }

    public String getRevisado() {
        return revisado;
    }

    public void setRevisado(String revisado) {
        this.revisado = revisado;
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

    public String getEmail_alterno() {
        return email_alterno;
    }

    public void setEmail_alterno(String email_alterno) {
        this.email_alterno = email_alterno;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.co_cli);
        hash = 31 * hash + Objects.hashCode(this.tipo_cli);
        hash = 31 * hash + Objects.hashCode(this.cli_des);
        hash = 31 * hash + Objects.hashCode(this.direc1);
        hash = 31 * hash + Objects.hashCode(this.dir_ent2);
        hash = 31 * hash + Objects.hashCode(this.direc2);
        hash = 31 * hash + Objects.hashCode(this.telefonos);
        hash = 31 * hash + Objects.hashCode(this.fax);
        hash = 31 * hash + Objects.hashCode(this.inactivo);
        hash = 31 * hash + Objects.hashCode(this.comentario);
        hash = 31 * hash + Objects.hashCode(this.respons);
        hash = 31 * hash + Objects.hashCode(this.fecha_reg);
        hash = 31 * hash + Objects.hashCode(this.puntaje);
        hash = 31 * hash + Objects.hashCode(this.mont_cre);
        hash = 31 * hash + Objects.hashCode(this.co_mone);
        hash = 31 * hash + Objects.hashCode(this.cond_pag);
        hash = 31 * hash + Objects.hashCode(this.plaz_pag);
        hash = 31 * hash + Objects.hashCode(this.desc_ppago);
        hash = 31 * hash + Objects.hashCode(this.co_zon);
        hash = 31 * hash + Objects.hashCode(this.co_seg);
        hash = 31 * hash + Objects.hashCode(this.co_ven);
        hash = 31 * hash + Objects.hashCode(this.desc_glob);
        hash = 31 * hash + Objects.hashCode(this.horar_caja);
        hash = 31 * hash + Objects.hashCode(this.frecu_vist);
        hash = 31 * hash + Objects.hashCode(this.lunes);
        hash = 31 * hash + Objects.hashCode(this.martes);
        hash = 31 * hash + Objects.hashCode(this.miercoles);
        hash = 31 * hash + Objects.hashCode(this.jueves);
        hash = 31 * hash + Objects.hashCode(this.viernes);
        hash = 31 * hash + Objects.hashCode(this.sabado);
        hash = 31 * hash + Objects.hashCode(this.domingo);
        hash = 31 * hash + Objects.hashCode(this.rif);
        hash = 31 * hash + Objects.hashCode(this.nit);
        hash = 31 * hash + Objects.hashCode(this.contrib);
        hash = 31 * hash + Objects.hashCode(this.numcom);
        hash = 31 * hash + Objects.hashCode(this.feccom);
        hash = 31 * hash + Objects.hashCode(this.dis_cen);
        hash = 31 * hash + Objects.hashCode(this.email);
        hash = 31 * hash + Objects.hashCode(this.co_cta_ingr_egr);
        hash = 31 * hash + Objects.hashCode(this.juridico);
        hash = 31 * hash + Objects.hashCode(this.tipo_adi);
        hash = 31 * hash + Objects.hashCode(this.matriz);
        hash = 31 * hash + Objects.hashCode(this.co_tab);
        hash = 31 * hash + Objects.hashCode(this.tipo_per);
        hash = 31 * hash + Objects.hashCode(this.valido);
        hash = 31 * hash + Objects.hashCode(this.ciudad);
        hash = 31 * hash + Objects.hashCode(this.zip);
        hash = 31 * hash + Objects.hashCode(this.login);
        hash = 31 * hash + Objects.hashCode(this.password);
        hash = 31 * hash + Objects.hashCode(this.website);
        hash = 31 * hash + Objects.hashCode(this.sincredito);
        hash = 31 * hash + Objects.hashCode(this.contribu_e);
        hash = 31 * hash + Objects.hashCode(this.rete_regis_doc);
        hash = 31 * hash + Objects.hashCode(this.porc_esp);
        hash = 31 * hash + Objects.hashCode(this.co_pais);
        hash = 31 * hash + Objects.hashCode(this.serialp);
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + Objects.hashCode(this.salestax);
        hash = 31 * hash + Objects.hashCode(this.estado);
        hash = 31 * hash + Objects.hashCode(this.campo1);
        hash = 31 * hash + Objects.hashCode(this.campo2);
        hash = 31 * hash + Objects.hashCode(this.campo3);
        hash = 31 * hash + Objects.hashCode(this.campo4);
        hash = 31 * hash + Objects.hashCode(this.campo5);
        hash = 31 * hash + Objects.hashCode(this.campo6);
        hash = 31 * hash + Objects.hashCode(this.campo7);
        hash = 31 * hash + Objects.hashCode(this.campo8);
        hash = 31 * hash + Objects.hashCode(this.co_us_in);
        hash = 31 * hash + Objects.hashCode(this.fe_us_in);
        hash = 31 * hash + Objects.hashCode(this.co_sucu_in);
        hash = 31 * hash + Objects.hashCode(this.co_us_mo);
        hash = 31 * hash + Objects.hashCode(this.fe_us_mo);
        hash = 31 * hash + Objects.hashCode(this.co_sucu_mo);
        hash = 31 * hash + Objects.hashCode(this.revisado);
        hash = 31 * hash + Objects.hashCode(this.validador);
        hash = 31 * hash + Objects.hashCode(this.rowguid);
        hash = 31 * hash + Objects.hashCode(this.email_alterno);
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
        final ClienteBO other = (ClienteBO) obj;
        if (!Objects.equals(this.co_cli, other.co_cli)) {
            return false;
        }
        if (!Objects.equals(this.tipo_cli, other.tipo_cli)) {
            return false;
        }
        if (!Objects.equals(this.cli_des, other.cli_des)) {
            return false;
        }
        if (!Objects.equals(this.direc1, other.direc1)) {
            return false;
        }
        if (!Objects.equals(this.dir_ent2, other.dir_ent2)) {
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
        if (!Objects.equals(this.inactivo, other.inactivo)) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        if (!Objects.equals(this.respons, other.respons)) {
            return false;
        }
        if (!Objects.equals(this.fecha_reg, other.fecha_reg)) {
            return false;
        }
        if (!Objects.equals(this.puntaje, other.puntaje)) {
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
        if (!Objects.equals(this.co_zon, other.co_zon)) {
            return false;
        }
        if (!Objects.equals(this.co_seg, other.co_seg)) {
            return false;
        }
        if (!Objects.equals(this.co_ven, other.co_ven)) {
            return false;
        }
        if (!Objects.equals(this.desc_glob, other.desc_glob)) {
            return false;
        }
        if (!Objects.equals(this.horar_caja, other.horar_caja)) {
            return false;
        }
        if (!Objects.equals(this.frecu_vist, other.frecu_vist)) {
            return false;
        }
        if (!Objects.equals(this.lunes, other.lunes)) {
            return false;
        }
        if (!Objects.equals(this.martes, other.martes)) {
            return false;
        }
        if (!Objects.equals(this.miercoles, other.miercoles)) {
            return false;
        }
        if (!Objects.equals(this.jueves, other.jueves)) {
            return false;
        }
        if (!Objects.equals(this.viernes, other.viernes)) {
            return false;
        }
        if (!Objects.equals(this.sabado, other.sabado)) {
            return false;
        }
        if (!Objects.equals(this.domingo, other.domingo)) {
            return false;
        }
        if (!Objects.equals(this.rif, other.rif)) {
            return false;
        }
        if (!Objects.equals(this.nit, other.nit)) {
            return false;
        }
        if (!Objects.equals(this.contrib, other.contrib)) {
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
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.co_cta_ingr_egr, other.co_cta_ingr_egr)) {
            return false;
        }
        if (!Objects.equals(this.juridico, other.juridico)) {
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
        if (!Objects.equals(this.valido, other.valido)) {
            return false;
        }
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
        if (!Objects.equals(this.zip, other.zip)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.website, other.website)) {
            return false;
        }
        if (!Objects.equals(this.sincredito, other.sincredito)) {
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
        if (!Objects.equals(this.co_pais, other.co_pais)) {
            return false;
        }
        if (!Objects.equals(this.serialp, other.serialp)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.salestax, other.salestax)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
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
        if (!Objects.equals(this.fe_us_in, other.fe_us_in)) {
            return false;
        }
        if (!Objects.equals(this.co_sucu_in, other.co_sucu_in)) {
            return false;
        }
        if (!Objects.equals(this.co_us_mo, other.co_us_mo)) {
            return false;
        }
        if (!Objects.equals(this.fe_us_mo, other.fe_us_mo)) {
            return false;
        }
        if (!Objects.equals(this.co_sucu_mo, other.co_sucu_mo)) {
            return false;
        }
        if (!Objects.equals(this.revisado, other.revisado)) {
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
        return true;
    }

    public String getZonaDescripcion() {
        return zonaDescripcion;
    }

    public void setZonaDescripcion(String zonaDescripcion) {
        this.zonaDescripcion = zonaDescripcion;
    }

    public String getCo_cta_in_Descripcion() {
        return co_cta_in_Descripcion;
    }

    public void setCo_cta_in_Descripcion(String co_cta_in_Descripcion) {
        this.co_cta_in_Descripcion = co_cta_in_Descripcion;
    }

    public String getSegmentDescripcion() {
        return segmentDescripcion;
    }

    public void setSegmentDescripcion(String segmentDescripcion) {
        this.segmentDescripcion = segmentDescripcion;
    }

    public String getVendedorDdescripcion() {
        return vendedorDdescripcion;
    }

    public void setVendedorDdescripcion(String vendedorDdescripcion) {
        this.vendedorDdescripcion = vendedorDdescripcion;
    }

    public String getPaisDescripcion() {
        return paisDescripcion;
    }

    public void setPaisDescripcion(String paisDescripcion) {
        this.paisDescripcion = paisDescripcion;
    }

    public String getTipoClienteDescricion() {
        return tipoClienteDescricion;
    }

    public void setTipoClienteDescricion(String tipoClienteDescricion) {
        this.tipoClienteDescricion = tipoClienteDescricion;
    }

    public String getTabuladorDescripcion() {
        return tabuladorDescripcion;
    }

    public void setTabuladorDescripcion(String tabuladorDescripcion) {
        this.tabuladorDescripcion = tabuladorDescripcion;
    }

}
