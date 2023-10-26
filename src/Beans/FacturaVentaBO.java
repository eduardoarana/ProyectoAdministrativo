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
public class FacturaVentaBO {

    private String doc_num;
    private String descrip;
    private String co_cli;
    private String descripcionCliente;
    private String co_tran;
    private String descripciontransporte ;
    private String co_mone;
    private String descripcionMoneda;
    private String tasaMoneda;
    private String co_ven;
    private String descripcionVendedor;
    private String co_cond;
    private String descripcionCodPago;
    private String fec_emis;
    private String fec_venc;
    private String fec_reg;
    private String anulado;
    private String status;
    private String n_control;
    private String ven_ter;
    private String tasa;
    private String porc_desc_glob;
    private String monto_desc_glob;
    private String porc_reca;
    private String monto_reca;
    private String total_bruto;
    private String monto_imp;
    private String monto_imp2;
    private String monto_imp3;
    private String otros1;
    private String otros2;
    private String otros3;
    private String total_neto;
    private String saldo;
    private String dir_ent;
    private String comentario;
    private String dis_cen;
    private String feccom;
    private String numcom;
    private String contrib;
    private String impresa;
    private String seriales_s;
    private String salestax;
    private String impfis;
    private String impfisfac;
    private String imp_nro_z;
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
    private String co_cta_ingr_egr;
    private String co_Almacen;

    public FacturaVentaBO() {
    }

    public FacturaVentaBO(String doc_num, String descrip, String co_cli, String co_tran, String co_mone, String co_ven, String co_cond, String fec_emis, String fec_venc, String fec_reg, String anulado, String status, String n_control, String ven_ter, String tasa, String porc_desc_glob, String monto_desc_glob, String porc_reca, String monto_reca, String total_bruto, String monto_imp, String monto_imp2, String monto_imp3, String otros1, String otros2, String otros3, String total_neto, String saldo, String dir_ent, String comentario, String dis_cen, String feccom, String numcom, String contrib, String impresa, String seriales_s, String salestax, String impfis, String impfisfac, String imp_nro_z, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, String campo7, String campo8, String co_us_in, String co_sucu_in, String fe_us_in, String co_us_mo, String co_sucu_mo, String fe_us_mo, String revisado, String trasnfe, String validador, String rowguid, String co_cta_ingr_egr) {
        this.doc_num = doc_num;
        this.descrip = descrip;
        this.co_cli = co_cli;
        this.co_tran = co_tran;
        this.co_mone = co_mone;
        this.co_ven = co_ven;
        this.co_cond = co_cond;
        this.fec_emis = fec_emis;
        this.fec_venc = fec_venc;
        this.fec_reg = fec_reg;
        this.anulado = anulado;
        this.status = status;
        this.n_control = n_control;
        this.ven_ter = ven_ter;
        this.tasa = tasa;
        this.porc_desc_glob = porc_desc_glob;
        this.monto_desc_glob = monto_desc_glob;
        this.porc_reca = porc_reca;
        this.monto_reca = monto_reca;
        this.total_bruto = total_bruto;
        this.monto_imp = monto_imp;
        this.monto_imp2 = monto_imp2;
        this.monto_imp3 = monto_imp3;
        this.otros1 = otros1;
        this.otros2 = otros2;
        this.otros3 = otros3;
        this.total_neto = total_neto;
        this.saldo = saldo;
        this.dir_ent = dir_ent;
        this.comentario = comentario;
        this.dis_cen = dis_cen;
        this.feccom = feccom;
        this.numcom = numcom;
        this.contrib = contrib;
        this.impresa = impresa;
        this.seriales_s = seriales_s;
        this.salestax = salestax;
        this.impfis = impfis;
        this.impfisfac = impfisfac;
        this.imp_nro_z = imp_nro_z;
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
        this.co_cta_ingr_egr = co_cta_ingr_egr;
    }

    public String getDoc_num() {
        return doc_num;
    }

    public void setDoc_num(String doc_num) {
        this.doc_num = doc_num;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getCo_cli() {
        return co_cli;
    }

    public void setCo_cli(String co_cli) {
        this.co_cli = co_cli;
    }

    public String getCo_tran() {
        return co_tran;
    }

    public void setCo_tran(String co_tran) {
        this.co_tran = co_tran;
    }

    public String getCo_mone() {
        return co_mone;
    }

    public void setCo_mone(String co_mone) {
        this.co_mone = co_mone;
    }

    public String getCo_ven() {
        return co_ven;
    }

    public void setCo_ven(String co_ven) {
        this.co_ven = co_ven;
    }

    public String getCo_cond() {
        return co_cond;
    }

    public void setCo_cond(String co_cond) {
        this.co_cond = co_cond;
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

    public String getAnulado() {
        return anulado;
    }

    public void setAnulado(String anulado) {
        this.anulado = anulado;
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

    public String getVen_ter() {
        return ven_ter;
    }

    public void setVen_ter(String ven_ter) {
        this.ven_ter = ven_ter;
    }

    public String getTasa() {
        return tasa;
    }

    public void setTasa(String tasa) {
        this.tasa = tasa;
    }

    public String getPorc_desc_glob() {
        return porc_desc_glob;
    }

    public void setPorc_desc_glob(String porc_desc_glob) {
        this.porc_desc_glob = porc_desc_glob;
    }

    public String getMonto_desc_glob() {
        return monto_desc_glob;
    }

    public void setMonto_desc_glob(String monto_desc_glob) {
        this.monto_desc_glob = monto_desc_glob;
    }

    public String getPorc_reca() {
        return porc_reca;
    }

    public void setPorc_reca(String porc_reca) {
        this.porc_reca = porc_reca;
    }

    public String getMonto_reca() {
        return monto_reca;
    }

    public void setMonto_reca(String monto_reca) {
        this.monto_reca = monto_reca;
    }

    public String getTotal_bruto() {
        return total_bruto;
    }

    public void setTotal_bruto(String total_bruto) {
        this.total_bruto = total_bruto;
    }

    public String getMonto_imp() {
        return monto_imp;
    }

    public void setMonto_imp(String monto_imp) {
        this.monto_imp = monto_imp;
    }

    public String getMonto_imp2() {
        return monto_imp2;
    }

    public void setMonto_imp2(String monto_imp2) {
        this.monto_imp2 = monto_imp2;
    }

    public String getMonto_imp3() {
        return monto_imp3;
    }

    public void setMonto_imp3(String monto_imp3) {
        this.monto_imp3 = monto_imp3;
    }

    public String getOtros1() {
        return otros1;
    }

    public void setOtros1(String otros1) {
        this.otros1 = otros1;
    }

    public String getOtros2() {
        return otros2;
    }

    public void setOtros2(String otros2) {
        this.otros2 = otros2;
    }

    public String getOtros3() {
        return otros3;
    }

    public void setOtros3(String otros3) {
        this.otros3 = otros3;
    }

    public String getTotal_neto() {
        return total_neto;
    }

    public void setTotal_neto(String total_neto) {
        this.total_neto = total_neto;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
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

    public String getDis_cen() {
        return dis_cen;
    }

    public void setDis_cen(String dis_cen) {
        this.dis_cen = dis_cen;
    }

    public String getFeccom() {
        return feccom;
    }

    public void setFeccom(String feccom) {
        this.feccom = feccom;
    }

    public String getNumcom() {
        return numcom;
    }

    public void setNumcom(String numcom) {
        this.numcom = numcom;
    }

    public String getContrib() {
        return contrib;
    }

    public void setContrib(String contrib) {
        this.contrib = contrib;
    }

    public String getImpresa() {
        return impresa;
    }

    public void setImpresa(String impresa) {
        this.impresa = impresa;
    }

    public String getSeriales_s() {
        return seriales_s;
    }

    public void setSeriales_s(String seriales_s) {
        this.seriales_s = seriales_s;
    }

    public String getSalestax() {
        return salestax;
    }

    public void setSalestax(String salestax) {
        this.salestax = salestax;
    }

    public String getImpfis() {
        return impfis;
    }

    public void setImpfis(String impfis) {
        this.impfis = impfis;
    }

    public String getImpfisfac() {
        return impfisfac;
    }

    public void setImpfisfac(String impfisfac) {
        this.impfisfac = impfisfac;
    }

    public String getImp_nro_z() {
        return imp_nro_z;
    }

    public void setImp_nro_z(String imp_nro_z) {
        this.imp_nro_z = imp_nro_z;
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

    public String getCo_cta_ingr_egr() {
        return co_cta_ingr_egr;
    }

    public void setCo_cta_ingr_egr(String co_cta_ingr_egr) {
        this.co_cta_ingr_egr = co_cta_ingr_egr;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.doc_num);
        hash = 97 * hash + Objects.hashCode(this.descrip);
        hash = 97 * hash + Objects.hashCode(this.co_cli);
        hash = 97 * hash + Objects.hashCode(this.co_tran);
        hash = 97 * hash + Objects.hashCode(this.co_mone);
        hash = 97 * hash + Objects.hashCode(this.co_ven);
        hash = 97 * hash + Objects.hashCode(this.co_cond);
        hash = 97 * hash + Objects.hashCode(this.fec_emis);
        hash = 97 * hash + Objects.hashCode(this.fec_venc);
        hash = 97 * hash + Objects.hashCode(this.fec_reg);
        hash = 97 * hash + Objects.hashCode(this.anulado);
        hash = 97 * hash + Objects.hashCode(this.status);
        hash = 97 * hash + Objects.hashCode(this.n_control);
        hash = 97 * hash + Objects.hashCode(this.ven_ter);
        hash = 97 * hash + Objects.hashCode(this.tasa);
        hash = 97 * hash + Objects.hashCode(this.porc_desc_glob);
        hash = 97 * hash + Objects.hashCode(this.monto_desc_glob);
        hash = 97 * hash + Objects.hashCode(this.porc_reca);
        hash = 97 * hash + Objects.hashCode(this.monto_reca);
        hash = 97 * hash + Objects.hashCode(this.total_bruto);
        hash = 97 * hash + Objects.hashCode(this.monto_imp);
        hash = 97 * hash + Objects.hashCode(this.monto_imp2);
        hash = 97 * hash + Objects.hashCode(this.monto_imp3);
        hash = 97 * hash + Objects.hashCode(this.otros1);
        hash = 97 * hash + Objects.hashCode(this.otros2);
        hash = 97 * hash + Objects.hashCode(this.otros3);
        hash = 97 * hash + Objects.hashCode(this.total_neto);
        hash = 97 * hash + Objects.hashCode(this.saldo);
        hash = 97 * hash + Objects.hashCode(this.dir_ent);
        hash = 97 * hash + Objects.hashCode(this.comentario);
        hash = 97 * hash + Objects.hashCode(this.dis_cen);
        hash = 97 * hash + Objects.hashCode(this.feccom);
        hash = 97 * hash + Objects.hashCode(this.numcom);
        hash = 97 * hash + Objects.hashCode(this.contrib);
        hash = 97 * hash + Objects.hashCode(this.impresa);
        hash = 97 * hash + Objects.hashCode(this.seriales_s);
        hash = 97 * hash + Objects.hashCode(this.salestax);
        hash = 97 * hash + Objects.hashCode(this.impfis);
        hash = 97 * hash + Objects.hashCode(this.impfisfac);
        hash = 97 * hash + Objects.hashCode(this.imp_nro_z);
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
        hash = 97 * hash + Objects.hashCode(this.co_cta_ingr_egr);
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
        final FacturaVentaBO other = (FacturaVentaBO) obj;
        if (!Objects.equals(this.doc_num, other.doc_num)) {
            return false;
        }
        if (!Objects.equals(this.descrip, other.descrip)) {
            return false;
        }
        if (!Objects.equals(this.co_cli, other.co_cli)) {
            return false;
        }
        if (!Objects.equals(this.co_tran, other.co_tran)) {
            return false;
        }
        if (!Objects.equals(this.co_mone, other.co_mone)) {
            return false;
        }
        if (!Objects.equals(this.co_ven, other.co_ven)) {
            return false;
        }
        if (!Objects.equals(this.co_cond, other.co_cond)) {
            return false;
        }
        if (!Objects.equals(this.fec_emis, other.fec_emis)) {
            return false;
        }
        if (!Objects.equals(this.fec_venc, other.fec_venc)) {
            return false;
        }
        if (!Objects.equals(this.fec_reg, other.fec_reg)) {
            return false;
        }
        if (!Objects.equals(this.anulado, other.anulado)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.n_control, other.n_control)) {
            return false;
        }
        if (!Objects.equals(this.ven_ter, other.ven_ter)) {
            return false;
        }
        if (!Objects.equals(this.tasa, other.tasa)) {
            return false;
        }
        if (!Objects.equals(this.porc_desc_glob, other.porc_desc_glob)) {
            return false;
        }
        if (!Objects.equals(this.monto_desc_glob, other.monto_desc_glob)) {
            return false;
        }
        if (!Objects.equals(this.porc_reca, other.porc_reca)) {
            return false;
        }
        if (!Objects.equals(this.monto_reca, other.monto_reca)) {
            return false;
        }
        if (!Objects.equals(this.total_bruto, other.total_bruto)) {
            return false;
        }
        if (!Objects.equals(this.monto_imp, other.monto_imp)) {
            return false;
        }
        if (!Objects.equals(this.monto_imp2, other.monto_imp2)) {
            return false;
        }
        if (!Objects.equals(this.monto_imp3, other.monto_imp3)) {
            return false;
        }
        if (!Objects.equals(this.otros1, other.otros1)) {
            return false;
        }
        if (!Objects.equals(this.otros2, other.otros2)) {
            return false;
        }
        if (!Objects.equals(this.otros3, other.otros3)) {
            return false;
        }
        if (!Objects.equals(this.total_neto, other.total_neto)) {
            return false;
        }
        if (!Objects.equals(this.saldo, other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.dir_ent, other.dir_ent)) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        if (!Objects.equals(this.dis_cen, other.dis_cen)) {
            return false;
        }
        if (!Objects.equals(this.feccom, other.feccom)) {
            return false;
        }
        if (!Objects.equals(this.numcom, other.numcom)) {
            return false;
        }
        if (!Objects.equals(this.contrib, other.contrib)) {
            return false;
        }
        if (!Objects.equals(this.impresa, other.impresa)) {
            return false;
        }
        if (!Objects.equals(this.seriales_s, other.seriales_s)) {
            return false;
        }
        if (!Objects.equals(this.salestax, other.salestax)) {
            return false;
        }
        if (!Objects.equals(this.impfis, other.impfis)) {
            return false;
        }
        if (!Objects.equals(this.impfisfac, other.impfisfac)) {
            return false;
        }
        if (!Objects.equals(this.imp_nro_z, other.imp_nro_z)) {
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
        if (!Objects.equals(this.co_cta_ingr_egr, other.co_cta_ingr_egr)) {
            return false;
        }
        return true;
    }

    public String getDescripcionCliente() {
        return descripcionCliente;
    }

    public void setDescripcionCliente(String descripcionCliente) {
        this.descripcionCliente = descripcionCliente;
    }

    public String getDescripcionCodPago() {
        return descripcionCodPago;
    }

    public void setDescripcionCodPago(String descripcionCodPago) {
        this.descripcionCodPago = descripcionCodPago;
    }

    public String getDescripcionVendedor() {
        return descripcionVendedor;
    }

    public void setDescripcionVendedor(String descripcionVendedor) {
        this.descripcionVendedor = descripcionVendedor;
    }

    public String getDescripciontransporte() {
        return descripciontransporte;
    }

    public void setDescripciontransporte(String descripciontransporte) {
        this.descripciontransporte = descripciontransporte;
    }

    public String getDescripcionMoneda() {
        return descripcionMoneda;
    }

    public void setDescripcionMoneda(String descripcionMoneda) {
        this.descripcionMoneda = descripcionMoneda;
    }

    public String getTasaMoneda() {
        return tasaMoneda;
    }

    public void setTasaMoneda(String tasaMoneda) {
        this.tasaMoneda = tasaMoneda;
    }

    public String getCo_Almacen() {
        return co_Almacen;
    }

    public void setCo_Almacen(String co_Almacen) {
        this.co_Almacen = co_Almacen;
    }

   

}
