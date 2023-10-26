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
public class ArticulosBO {

    private String co_art;
    private String fecha_reg;
    private String art_des;
    private String tipo;
    private String anulado;
    private String fecha_inac;
    private String co_lin;
    private String co_subl;
    private String co_cat;
    private String co_color;
    private String co_ubicacion;
    private String lineaDescripcion;
    private String subLineaDescripcion;
    private String categoriaDescripcion;
    private String colorDescripcion;
    private String ubicacionDescripcion;
    private String cod_proc;
    private String item;
    private String modelo;
    private String ref;
    private String generico;
    private String maneja_serial;
    private String maneja_lote;
    private String maneja_lote_venc;
    private String margen_min;
    private String margen_max;
    private String tipo_imp;
    private String tipo_imp2;
    private String tipo_imp3;
    private String co_reten;
    private String garantia;
    private String volumen;
    private String peso;
    private String stock_min;
    private String stock_max;
    private String stock_pedido;
    private String relac_unidad;
    private String punt_cli;
    private String lic_mon_ilc;
    private String lic_capacidad;
    private String lic_grado_al;
    private String lic_tipo;
    private String prec_om;
    private String comentario;
    private String tipo_cos;
    private String porc_margen_minimo;
    private String porc_margen_maximo;
    private String mont_comi;
    private String porc_arancel;
    private String numcom;
    private String feccom;
    private String dis_cen;
    private String reten_iva_tercero;
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
    private String aux_imp01;
    private String cod_Unidad ;
    private String cod_Almacen;

    public ArticulosBO(String co_art, String fecha_reg, String art_des, String tipo, String anulado, String fecha_inac, String co_lin, String co_subl, String co_cat, String co_color, String co_ubicacion, String cod_proc, String item, String modelo, String ref, String generico, String maneja_serial, String maneja_lote, String maneja_lote_venc, String margen_min, String margen_max, String tipo_imp, String tipo_imp2, String tipo_imp3, String co_reten, String garantia, String volumen, String peso, String stock_min, String stock_max, String stock_pedido, String relac_unidad, String punt_cli, String lic_mon_ilc, String lic_capacidad, String lic_grado_al, String lic_tipo, String prec_om, String comentario, String tipo_cos, String porc_margen_minimo, String porc_margen_maximo, String mont_comi, String porc_arancel, String numcom, String feccom, String dis_cen, String reten_iva_tercero, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, String campo7, String campo8, String co_us_in, String co_sucu_in, String fe_us_in, String co_us_mo, String co_sucu_mo, String fe_us_mo, String revisado, String trasnfe, String validador, String aux_imp01) {
        this.co_art = co_art;
        this.fecha_reg = fecha_reg;
        this.art_des = art_des;
        this.tipo = tipo;
        this.anulado = anulado;
        this.fecha_inac = fecha_inac;
        this.co_lin = co_lin;
        this.co_subl = co_subl;
        this.co_cat = co_cat;
        this.co_color = co_color;
        this.co_ubicacion = co_ubicacion;
        this.cod_proc = cod_proc;
        this.item = item;
        this.modelo = modelo;
        this.ref = ref;
        this.generico = generico;
        this.maneja_serial = maneja_serial;
        this.maneja_lote = maneja_lote;
        this.maneja_lote_venc = maneja_lote_venc;
        this.margen_min = margen_min;
        this.margen_max = margen_max;
        this.tipo_imp = tipo_imp;
        this.tipo_imp2 = tipo_imp2;
        this.tipo_imp3 = tipo_imp3;
        this.co_reten = co_reten;
        this.garantia = garantia;
        this.volumen = volumen;
        this.peso = peso;
        this.stock_min = stock_min;
        this.stock_max = stock_max;
        this.stock_pedido = stock_pedido;
        this.relac_unidad = relac_unidad;
        this.punt_cli = punt_cli;
        this.lic_mon_ilc = lic_mon_ilc;
        this.lic_capacidad = lic_capacidad;
        this.lic_grado_al = lic_grado_al;
        this.lic_tipo = lic_tipo;
        this.prec_om = prec_om;
        this.comentario = comentario;
        this.tipo_cos = tipo_cos;
        this.porc_margen_minimo = porc_margen_minimo;
        this.porc_margen_maximo = porc_margen_maximo;
        this.mont_comi = mont_comi;
        this.porc_arancel = porc_arancel;
        this.numcom = numcom;
        this.feccom = feccom;
        this.dis_cen = dis_cen;
        this.reten_iva_tercero = reten_iva_tercero;
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
        this.aux_imp01 = aux_imp01;
    }

    public ArticulosBO() {
    }

    public String getAnulado() {
        return anulado;
    }

    public void setAnulado(String anulado) {
        this.anulado = anulado;
    }

    public String getArt_des() {
        return art_des;
    }

    public void setArt_des(String art_des) {
        this.art_des = art_des;
    }

    public String getAux_imp01() {
        return aux_imp01;
    }

    public void setAux_imp01(String aux_imp01) {
        this.aux_imp01 = aux_imp01;
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

    public String getCo_art() {
        return co_art;
    }

    public void setCo_art(String co_art) {
        this.co_art = co_art;
    }

    public String getCo_cat() {
        return co_cat;
    }

    public void setCo_cat(String co_cat) {
        this.co_cat = co_cat;
    }

    public String getCo_color() {
        return co_color;
    }

    public void setCo_color(String co_color) {
        this.co_color = co_color;
    }

    public String getCo_lin() {
        return co_lin;
    }

    public void setCo_lin(String co_lin) {
        this.co_lin = co_lin;
    }

    public String getCo_reten() {
        return co_reten;
    }

    public void setCo_reten(String co_reten) {
        this.co_reten = co_reten;
    }

    public String getCo_subl() {
        return co_subl;
    }

    public void setCo_subl(String co_subl) {
        this.co_subl = co_subl;
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

    public String getCo_ubicacion() {
        return co_ubicacion;
    }

    public void setCo_ubicacion(String co_ubicacion) {
        this.co_ubicacion = co_ubicacion;
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

    public String getCod_proc() {
        return cod_proc;
    }

    public void setCod_proc(String cod_proc) {
        this.cod_proc = cod_proc;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getDis_cen() {
        return dis_cen;
    }

    public void setDis_cen(String dis_cen) {
        this.dis_cen = dis_cen;
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

    public String getFecha_inac() {
        return fecha_inac;
    }

    public void setFecha_inac(String fecha_inac) {
        this.fecha_inac = fecha_inac;
    }

    public String getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(String fecha_reg) {
        this.fecha_reg = fecha_reg;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getGenerico() {
        return generico;
    }

    public void setGenerico(String generico) {
        this.generico = generico;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getLic_capacidad() {
        return lic_capacidad;
    }

    public void setLic_capacidad(String lic_capacidad) {
        this.lic_capacidad = lic_capacidad;
    }

    public String getLic_grado_al() {
        return lic_grado_al;
    }

    public void setLic_grado_al(String lic_grado_al) {
        this.lic_grado_al = lic_grado_al;
    }

    public String getLic_mon_ilc() {
        return lic_mon_ilc;
    }

    public void setLic_mon_ilc(String lic_mon_ilc) {
        this.lic_mon_ilc = lic_mon_ilc;
    }

    public String getLic_tipo() {
        return lic_tipo;
    }

    public void setLic_tipo(String lic_tipo) {
        this.lic_tipo = lic_tipo;
    }

    public String getManeja_lote() {
        return maneja_lote;
    }

    public void setManeja_lote(String maneja_lote) {
        this.maneja_lote = maneja_lote;
    }

    public String getManeja_lote_venc() {
        return maneja_lote_venc;
    }

    public void setManeja_lote_venc(String maneja_lote_venc) {
        this.maneja_lote_venc = maneja_lote_venc;
    }

    public String getManeja_serial() {
        return maneja_serial;
    }

    public void setManeja_serial(String maneja_serial) {
        this.maneja_serial = maneja_serial;
    }

    public String getMargen_max() {
        return margen_max;
    }

    public void setMargen_max(String margen_max) {
        this.margen_max = margen_max;
    }

    public String getMargen_min() {
        return margen_min;
    }

    public void setMargen_min(String margen_min) {
        this.margen_min = margen_min;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMont_comi() {
        return mont_comi;
    }

    public void setMont_comi(String mont_comi) {
        this.mont_comi = mont_comi;
    }

    public String getNumcom() {
        return numcom;
    }

    public void setNumcom(String numcom) {
        this.numcom = numcom;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPorc_arancel() {
        return porc_arancel;
    }

    public void setPorc_arancel(String porc_arancel) {
        this.porc_arancel = porc_arancel;
    }

    public String getPorc_margen_maximo() {
        return porc_margen_maximo;
    }

    public void setPorc_margen_maximo(String porc_margen_maximo) {
        this.porc_margen_maximo = porc_margen_maximo;
    }

    public String getPorc_margen_minimo() {
        return porc_margen_minimo;
    }

    public void setPorc_margen_minimo(String porc_margen_minimo) {
        this.porc_margen_minimo = porc_margen_minimo;
    }

    public String getPrec_om() {
        return prec_om;
    }

    public void setPrec_om(String prec_om) {
        this.prec_om = prec_om;
    }

    public String getPunt_cli() {
        return punt_cli;
    }

    public void setPunt_cli(String punt_cli) {
        this.punt_cli = punt_cli;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRelac_unidad() {
        return relac_unidad;
    }

    public void setRelac_unidad(String relac_unidad) {
        this.relac_unidad = relac_unidad;
    }

    public String getReten_iva_tercero() {
        return reten_iva_tercero;
    }

    public void setReten_iva_tercero(String reten_iva_tercero) {
        this.reten_iva_tercero = reten_iva_tercero;
    }

    public String getRevisado() {
        return revisado;
    }

    public void setRevisado(String revisado) {
        this.revisado = revisado;
    }

    public String getStock_max() {
        return stock_max;
    }

    public void setStock_max(String stock_max) {
        this.stock_max = stock_max;
    }

    public String getStock_min() {
        return stock_min;
    }

    public void setStock_min(String stock_min) {
        this.stock_min = stock_min;
    }

    public String getStock_pedido() {
        return stock_pedido;
    }

    public void setStock_pedido(String stock_pedido) {
        this.stock_pedido = stock_pedido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo_cos() {
        return tipo_cos;
    }

    public void setTipo_cos(String tipo_cos) {
        this.tipo_cos = tipo_cos;
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

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ArticulosBO other = (ArticulosBO) obj;
        if (!Objects.equals(this.co_art, other.co_art)) {
            return false;
        }
        if (!Objects.equals(this.fecha_reg, other.fecha_reg)) {
            return false;
        }
        if (!Objects.equals(this.art_des, other.art_des)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.anulado, other.anulado)) {
            return false;
        }
        if (!Objects.equals(this.fecha_inac, other.fecha_inac)) {
            return false;
        }
        if (!Objects.equals(this.co_lin, other.co_lin)) {
            return false;
        }
        if (!Objects.equals(this.co_subl, other.co_subl)) {
            return false;
        }
        if (!Objects.equals(this.co_cat, other.co_cat)) {
            return false;
        }
        if (!Objects.equals(this.co_color, other.co_color)) {
            return false;
        }
        if (!Objects.equals(this.co_ubicacion, other.co_ubicacion)) {
            return false;
        }
        if (!Objects.equals(this.cod_proc, other.cod_proc)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.ref, other.ref)) {
            return false;
        }
        if (!Objects.equals(this.generico, other.generico)) {
            return false;
        }
        if (!Objects.equals(this.maneja_serial, other.maneja_serial)) {
            return false;
        }
        if (!Objects.equals(this.maneja_lote_venc, other.maneja_lote_venc)) {
            return false;
        }
        if (!Objects.equals(this.margen_min, other.margen_min)) {
            return false;
        }
        if (!Objects.equals(this.margen_max, other.margen_max)) {
            return false;
        }
        if (!Objects.equals(this.tipo_imp, other.tipo_imp)) {
            return false;
        }
        if (!Objects.equals(this.tipo_imp2, other.tipo_imp2)) {
            return false;
        }
        if (!Objects.equals(this.tipo_imp3, other.tipo_imp3)) {
            return false;
        }
        if (!Objects.equals(this.co_reten, other.co_reten)) {
            return false;
        }
        if (!Objects.equals(this.garantia, other.garantia)) {
            return false;
        }
        if (!Objects.equals(this.volumen, other.volumen)) {
            return false;
        }
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        if (!Objects.equals(this.stock_min, other.stock_min)) {
            return false;
        }
        if (!Objects.equals(this.stock_max, other.stock_max)) {
            return false;
        }
        if (!Objects.equals(this.stock_pedido, other.stock_pedido)) {
            return false;
        }
        if (!Objects.equals(this.relac_unidad, other.relac_unidad)) {
            return false;
        }
        if (!Objects.equals(this.punt_cli, other.punt_cli)) {
            return false;
        }
        if (!Objects.equals(this.lic_mon_ilc, other.lic_mon_ilc)) {
            return false;
        }
        if (!Objects.equals(this.lic_capacidad, other.lic_capacidad)) {
            return false;
        }
        if (!Objects.equals(this.lic_grado_al, other.lic_grado_al)) {
            return false;
        }
        if (!Objects.equals(this.lic_tipo, other.lic_tipo)) {
            return false;
        }
        if (!Objects.equals(this.prec_om, other.prec_om)) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        if (!Objects.equals(this.tipo_cos, other.tipo_cos)) {
            return false;
        }
        if (!Objects.equals(this.porc_margen_minimo, other.porc_margen_minimo)) {
            return false;
        }
        if (!Objects.equals(this.porc_margen_maximo, other.porc_margen_maximo)) {
            return false;
        }
        if (!Objects.equals(this.mont_comi, other.mont_comi)) {
            return false;
        }
        if (!Objects.equals(this.porc_arancel, other.porc_arancel)) {
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
        if (!Objects.equals(this.reten_iva_tercero, other.reten_iva_tercero)) {
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
        if (!Objects.equals(this.aux_imp01, other.aux_imp01)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.co_art);
        hash = 29 * hash + Objects.hashCode(this.fecha_reg);
        hash = 29 * hash + Objects.hashCode(this.art_des);
        hash = 29 * hash + Objects.hashCode(this.tipo);
        hash = 29 * hash + Objects.hashCode(this.anulado);
        hash = 29 * hash + Objects.hashCode(this.fecha_inac);
        hash = 29 * hash + Objects.hashCode(this.co_lin);
        hash = 29 * hash + Objects.hashCode(this.co_subl);
        hash = 29 * hash + Objects.hashCode(this.co_cat);
        hash = 29 * hash + Objects.hashCode(this.co_color);
        hash = 29 * hash + Objects.hashCode(this.co_ubicacion);
        hash = 29 * hash + Objects.hashCode(this.cod_proc);
        hash = 29 * hash + Objects.hashCode(this.item);
        hash = 29 * hash + Objects.hashCode(this.modelo);
        hash = 29 * hash + Objects.hashCode(this.ref);
        hash = 29 * hash + Objects.hashCode(this.generico);
        hash = 29 * hash + Objects.hashCode(this.maneja_serial);
        hash = 29 * hash + Objects.hashCode(this.maneja_lote);
        hash = 29 * hash + Objects.hashCode(this.maneja_lote_venc);
        hash = 29 * hash + Objects.hashCode(this.margen_min);
        hash = 29 * hash + Objects.hashCode(this.margen_max);
        hash = 29 * hash + Objects.hashCode(this.tipo_imp);
        hash = 29 * hash + Objects.hashCode(this.tipo_imp2);
        hash = 29 * hash + Objects.hashCode(this.tipo_imp3);
        hash = 29 * hash + Objects.hashCode(this.garantia);
        hash = 29 * hash + Objects.hashCode(this.volumen);
        hash = 29 * hash + Objects.hashCode(this.peso);
        hash = 29 * hash + Objects.hashCode(this.stock_min);
        hash = 29 * hash + Objects.hashCode(this.stock_max);
        hash = 29 * hash + Objects.hashCode(this.stock_pedido);
        hash = 29 * hash + Objects.hashCode(this.relac_unidad);
        hash = 29 * hash + Objects.hashCode(this.punt_cli);
        hash = 29 * hash + Objects.hashCode(this.lic_mon_ilc);
        hash = 29 * hash + Objects.hashCode(this.lic_capacidad);
        hash = 29 * hash + Objects.hashCode(this.lic_grado_al);
        hash = 29 * hash + Objects.hashCode(this.lic_tipo);
        hash = 29 * hash + Objects.hashCode(this.prec_om);
        hash = 29 * hash + Objects.hashCode(this.comentario);
        hash = 29 * hash + Objects.hashCode(this.tipo_cos);
        hash = 29 * hash + Objects.hashCode(this.porc_margen_minimo);
        hash = 29 * hash + Objects.hashCode(this.porc_margen_maximo);
        hash = 29 * hash + Objects.hashCode(this.mont_comi);
        hash = 29 * hash + Objects.hashCode(this.porc_arancel);
        hash = 29 * hash + Objects.hashCode(this.numcom);
        hash = 29 * hash + Objects.hashCode(this.feccom);
        hash = 29 * hash + Objects.hashCode(this.dis_cen);
        hash = 29 * hash + Objects.hashCode(this.reten_iva_tercero);
        hash = 29 * hash + Objects.hashCode(this.campo1);
        hash = 29 * hash + Objects.hashCode(this.campo2);
        hash = 29 * hash + Objects.hashCode(this.campo3);
        hash = 29 * hash + Objects.hashCode(this.campo4);
        hash = 29 * hash + Objects.hashCode(this.campo5);
        hash = 29 * hash + Objects.hashCode(this.campo6);
        hash = 29 * hash + Objects.hashCode(this.campo7);
        hash = 29 * hash + Objects.hashCode(this.campo8);
        hash = 29 * hash + Objects.hashCode(this.co_us_in);
        hash = 29 * hash + Objects.hashCode(this.co_sucu_in);
        hash = 29 * hash + Objects.hashCode(this.fe_us_in);
        hash = 29 * hash + Objects.hashCode(this.co_us_mo);
        hash = 29 * hash + Objects.hashCode(this.co_sucu_mo);
        hash = 29 * hash + Objects.hashCode(this.fe_us_mo);
        hash = 29 * hash + Objects.hashCode(this.revisado);
        hash = 29 * hash + Objects.hashCode(this.trasnfe);
        hash = 29 * hash + Objects.hashCode(this.validador);
        hash = 29 * hash + Objects.hashCode(this.aux_imp01);
        return hash;
    }

    public String getLineaDescripcion() {
        return lineaDescripcion;
    }

    public void setLineaDescripcion(String lineaDescripcion) {
        this.lineaDescripcion = lineaDescripcion;
    }

    public String getSubLineaDescripcion() {
        return subLineaDescripcion;
    }

    public void setSubLineaDescripcion(String subLineaDescripcion) {
        this.subLineaDescripcion = subLineaDescripcion;
    }

    public String getCategoriaDescripcion() {
        return categoriaDescripcion;
    }

    public void setCategoriaDescripcion(String categoriaDescripcion) {
        this.categoriaDescripcion = categoriaDescripcion;
    }

    public String getColorDescripcion() {
        return colorDescripcion;
    }

    public void setColorDescripcion(String colorDescripcion) {
        this.colorDescripcion = colorDescripcion;
    }

    public String getUbicacionDescripcion() {
        return ubicacionDescripcion;
    }

    public void setUbicacionDescripcion(String ubicacionDescripcion) {
        this.ubicacionDescripcion = ubicacionDescripcion;
    }

    public String getCod_Unidad() {
        return cod_Unidad;
    }

    public void setCod_Unidad(String cod_Unidad) {
        this.cod_Unidad = cod_Unidad;
    }

    public String getCod_Almacen() {
        return cod_Almacen;
    }

    public void setCod_Almacen(String cod_Almacen) {
        this.cod_Almacen = cod_Almacen;
    }
}