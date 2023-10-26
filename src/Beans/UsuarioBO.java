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
public class UsuarioBO {

    private String cod_Usuario;
    private String desc_Usuario;
    private String password;
    private String prioridad;
    private String usuario_Nodo;
    private String id_Grupo;
    private String camb_Sucu;
    private String pide_Sucu;
    private String sucursal;
    private String id_Idioma;
    private String pcontrol_1;
    private String pcontrol_2;
    private String serie;
    private String Fec_Ult;
    private String Fec_Prox;
    private String veces;
    private String fec_Ult_FA;
    private String estado;
    private String ad_Login;
    private String cod_Empresa;
    private String cod_Empresa_Nomi;
    private String cod_Empresa_Admi;
    private String Sel_Emp;
    private String Sel_Emp_Admi;
    private String co_mapa;
    private String co_mapa_nomi;
    private String co_mapa_admi;
    private String Acceso_Todas_Empresa_Admi;
    private String co_us_in;
    private String fe_us_in;
    private String co_us_mo;
    private String fe_us_mo;
    private String campo1;
    private String campo2;
    private String campo3;
    private String campo4;
    private String campo5;
    private String campo6;
    private String campo7;
    private String campo8;
    private String co_sucu_in;
    private String co_sucu_mo;
    private String revisado;
    private String trasnfe;
    private String validador;
    private String Password2;
    private String maquina;
    private String producto;
    private String acceso_Todas_Empresa;

  

    public UsuarioBO() {
    }

    public UsuarioBO(String cod_Usuario, String desc_Usuario, String password, String prioridad, String usuario_Nodo, String id_Grupo, String camb_Sucu, String pide_Sucu, String sucursal, String id_Idioma, String pcontrol_1, String pcontrol_2, String serie, String Fec_Ult, String Fec_Prox, String veces, String fec_Ult_FA, String estado, String ad_Login, String cod_Empresa, String cod_Empresa_Nomi, String cod_Empresa_Admi, String Sel_Emp, String Sel_Emp_Admi, String co_mapa, String co_mapa_nomi, String co_mapa_admi, String Acceso_Todas_Empresa_Admi, String co_us_in, String fe_us_in, String co_us_mo, String fe_us_mo, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, String campo7, String campo8, String co_sucu_in, String co_sucu_mo, String revisado, String trasnfe, String validador, String Password2, String maquina, String producto) {
        this.cod_Usuario = cod_Usuario;
        this.desc_Usuario = desc_Usuario;
        this.password = password;
        this.prioridad = prioridad;
        this.usuario_Nodo = usuario_Nodo;
        this.id_Grupo = id_Grupo;
        this.camb_Sucu = camb_Sucu;
        this.pide_Sucu = pide_Sucu;
        this.sucursal = sucursal;
        this.id_Idioma = id_Idioma;
        this.pcontrol_1 = pcontrol_1;
        this.pcontrol_2 = pcontrol_2;
        this.serie = serie;
        this.Fec_Ult = Fec_Ult;
        this.Fec_Prox = Fec_Prox;
        this.veces = veces;
        this.fec_Ult_FA = fec_Ult_FA;
        this.estado = estado;
        this.ad_Login = ad_Login;
        this.cod_Empresa = cod_Empresa;
        this.cod_Empresa_Nomi = cod_Empresa_Nomi;
        this.cod_Empresa_Admi = cod_Empresa_Admi;
        this.Sel_Emp = Sel_Emp;
        this.Sel_Emp_Admi = Sel_Emp_Admi;
        this.co_mapa = co_mapa;
        this.co_mapa_nomi = co_mapa_nomi;
        this.co_mapa_admi = co_mapa_admi;
        this.Acceso_Todas_Empresa_Admi = Acceso_Todas_Empresa_Admi;
        this.co_us_in = co_us_in;
        this.fe_us_in = fe_us_in;
        this.co_us_mo = co_us_mo;
        this.fe_us_mo = fe_us_mo;
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.campo4 = campo4;
        this.campo5 = campo5;
        this.campo6 = campo6;
        this.campo7 = campo7;
        this.campo8 = campo8;
        this.co_sucu_in = co_sucu_in;
        this.co_sucu_mo = co_sucu_mo;
        this.revisado = revisado;
        this.trasnfe = trasnfe;
        this.validador = validador;
        this.Password2 = Password2;
        this.maquina = maquina;
        this.producto = producto;
    }
    
      public String getAcceso_Todas_Empresa() {
        return acceso_Todas_Empresa;
    }

    public void setAcceso_Todas_Empresa(String acceso_Todas_Empresa) {
        this.acceso_Todas_Empresa = acceso_Todas_Empresa;
    }

    public String getCod_Usuario() {
        return cod_Usuario;
    }

    public void setCod_Usuario(String cod_Usuario) {
        this.cod_Usuario = cod_Usuario;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDesc_Usuario() {
        return desc_Usuario;
    }

    public void setDesc_Usuario(String desc_Usuario) {
        this.desc_Usuario = desc_Usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getUsuario_Nodo() {
        return usuario_Nodo;
    }

    public void setUsuario_Nodo(String usuario_Nodo) {
        this.usuario_Nodo = usuario_Nodo;
    }

    public String getId_Grupo() {
        return id_Grupo;
    }

    public void setId_Grupo(String id_Grupo) {
        this.id_Grupo = id_Grupo;
    }

    public String getCamb_Sucu() {
        return camb_Sucu;
    }

    public void setCamb_Sucu(String camb_Sucu) {
        this.camb_Sucu = camb_Sucu;
    }

    public String getPide_Sucu() {
        return pide_Sucu;
    }

    public void setPide_Sucu(String pide_Sucu) {
        this.pide_Sucu = pide_Sucu;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getId_Idioma() {
        return id_Idioma;
    }

    public void setId_Idioma(String id_Idioma) {
        this.id_Idioma = id_Idioma;
    }

    public String getPcontrol_1() {
        return pcontrol_1;
    }

    public void setPcontrol_1(String pcontrol_1) {
        this.pcontrol_1 = pcontrol_1;
    }

    public String getPcontrol_2() {
        return pcontrol_2;
    }

    public void setPcontrol_2(String pcontrol_2) {
        this.pcontrol_2 = pcontrol_2;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFec_Ult() {
        return Fec_Ult;
    }

    public void setFec_Ult(String Fec_Ult) {
        this.Fec_Ult = Fec_Ult;
    }

    public String getFec_Prox() {
        return Fec_Prox;
    }

    public void setFec_Prox(String Fec_Prox) {
        this.Fec_Prox = Fec_Prox;
    }

    public String getVeces() {
        return veces;
    }

    public void setVeces(String veces) {
        this.veces = veces;
    }

    public String getFec_Ult_FA() {
        return fec_Ult_FA;
    }

    public void setFec_Ult_FA(String fec_Ult_FA) {
        this.fec_Ult_FA = fec_Ult_FA;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAd_Login() {
        return ad_Login;
    }

    public void setAd_Login(String ad_Login) {
        this.ad_Login = ad_Login;
    }

    public String getCod_Empresa() {
        return cod_Empresa;
    }

    public void setCod_Empresa(String cod_Empresa) {
        this.cod_Empresa = cod_Empresa;
    }

    public String getCod_Empresa_Nomi() {
        return cod_Empresa_Nomi;
    }

    public void setCod_Empresa_Nomi(String cod_Empresa_Nomi) {
        this.cod_Empresa_Nomi = cod_Empresa_Nomi;
    }

    public String getCod_Empresa_Admi() {
        return cod_Empresa_Admi;
    }

    public void setCod_Empresa_Admi(String cod_Empresa_Admi) {
        this.cod_Empresa_Admi = cod_Empresa_Admi;
    }

    public String getSel_Emp() {
        return Sel_Emp;
    }

    public void setSel_Emp(String Sel_Emp) {
        this.Sel_Emp = Sel_Emp;
    }

    public String getSel_Emp_Admi() {
        return Sel_Emp_Admi;
    }

    public void setSel_Emp_Admi(String Sel_Emp_Admi) {
        this.Sel_Emp_Admi = Sel_Emp_Admi;
    }

    public String getCo_mapa() {
        return co_mapa;
    }

    public void setCo_mapa(String co_mapa) {
        this.co_mapa = co_mapa;
    }

    public String getCo_mapa_nomi() {
        return co_mapa_nomi;
    }

    public void setCo_mapa_nomi(String co_mapa_nomi) {
        this.co_mapa_nomi = co_mapa_nomi;
    }

    public String getCo_mapa_admi() {
        return co_mapa_admi;
    }

    public void setCo_mapa_admi(String co_mapa_admi) {
        this.co_mapa_admi = co_mapa_admi;
    }

    public String getAcceso_Todas_Empresa_Admi() {
        return Acceso_Todas_Empresa_Admi;
    }

    public void setAcceso_Todas_Empresa_Admi(String Acceso_Todas_Empresa_Admi) {
        this.Acceso_Todas_Empresa_Admi = Acceso_Todas_Empresa_Admi;
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

    public String getPassword2() {
        return Password2;
    }

    public void setPassword2(String Password2) {
        this.Password2 = Password2;
    }

    public void setMaquina(String Maquina) {
        this.maquina = Maquina;
    }

    public String getMaquina() {
        return maquina;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.cod_Usuario);
        hash = 37 * hash + Objects.hashCode(this.desc_Usuario);
        hash = 37 * hash + Objects.hashCode(this.password);
        hash = 37 * hash + Objects.hashCode(this.prioridad);
        hash = 37 * hash + Objects.hashCode(this.usuario_Nodo);
        hash = 37 * hash + Objects.hashCode(this.id_Grupo);
        hash = 37 * hash + Objects.hashCode(this.camb_Sucu);
        hash = 37 * hash + Objects.hashCode(this.pide_Sucu);
        hash = 37 * hash + Objects.hashCode(this.sucursal);
        hash = 37 * hash + Objects.hashCode(this.id_Idioma);
        hash = 37 * hash + Objects.hashCode(this.pcontrol_1);
        hash = 37 * hash + Objects.hashCode(this.pcontrol_2);
        hash = 37 * hash + Objects.hashCode(this.serie);
        hash = 37 * hash + Objects.hashCode(this.Fec_Ult);
        hash = 37 * hash + Objects.hashCode(this.Fec_Prox);
        hash = 37 * hash + Objects.hashCode(this.veces);
        hash = 37 * hash + Objects.hashCode(this.fec_Ult_FA);
        hash = 37 * hash + Objects.hashCode(this.estado);
        hash = 37 * hash + Objects.hashCode(this.ad_Login);
        hash = 37 * hash + Objects.hashCode(this.cod_Empresa);
        hash = 37 * hash + Objects.hashCode(this.cod_Empresa_Nomi);
        hash = 37 * hash + Objects.hashCode(this.cod_Empresa_Admi);
        hash = 37 * hash + Objects.hashCode(this.Sel_Emp);
        hash = 37 * hash + Objects.hashCode(this.Sel_Emp_Admi);
        hash = 37 * hash + Objects.hashCode(this.co_mapa);
        hash = 37 * hash + Objects.hashCode(this.co_mapa_nomi);
        hash = 37 * hash + Objects.hashCode(this.co_mapa_admi);
        hash = 37 * hash + Objects.hashCode(this.Acceso_Todas_Empresa_Admi);
        hash = 37 * hash + Objects.hashCode(this.co_us_in);
        hash = 37 * hash + Objects.hashCode(this.fe_us_in);
        hash = 37 * hash + Objects.hashCode(this.co_us_mo);
        hash = 37 * hash + Objects.hashCode(this.fe_us_mo);
        hash = 37 * hash + Objects.hashCode(this.campo1);
        hash = 37 * hash + Objects.hashCode(this.campo2);
        hash = 37 * hash + Objects.hashCode(this.campo3);
        hash = 37 * hash + Objects.hashCode(this.campo4);
        hash = 37 * hash + Objects.hashCode(this.campo5);
        hash = 37 * hash + Objects.hashCode(this.campo6);
        hash = 37 * hash + Objects.hashCode(this.campo7);
        hash = 37 * hash + Objects.hashCode(this.campo8);
        hash = 37 * hash + Objects.hashCode(this.co_sucu_in);
        hash = 37 * hash + Objects.hashCode(this.co_sucu_mo);
        hash = 37 * hash + Objects.hashCode(this.revisado);
        hash = 37 * hash + Objects.hashCode(this.trasnfe);
        hash = 37 * hash + Objects.hashCode(this.validador);
        hash = 37 * hash + Objects.hashCode(this.Password2);
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
        final UsuarioBO other = (UsuarioBO) obj;
        if (!Objects.equals(this.cod_Usuario, other.cod_Usuario)) {
            return false;
        }
        if (!Objects.equals(this.desc_Usuario, other.desc_Usuario)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.prioridad, other.prioridad)) {
            return false;
        }
        if (!Objects.equals(this.usuario_Nodo, other.usuario_Nodo)) {
            return false;
        }
        if (!Objects.equals(this.id_Grupo, other.id_Grupo)) {
            return false;
        }
        if (!Objects.equals(this.camb_Sucu, other.camb_Sucu)) {
            return false;
        }
        if (!Objects.equals(this.pide_Sucu, other.pide_Sucu)) {
            return false;
        }
        if (!Objects.equals(this.sucursal, other.sucursal)) {
            return false;
        }
        if (!Objects.equals(this.id_Idioma, other.id_Idioma)) {
            return false;
        }
        if (!Objects.equals(this.pcontrol_1, other.pcontrol_1)) {
            return false;
        }
        if (!Objects.equals(this.pcontrol_2, other.pcontrol_2)) {
            return false;
        }
        if (!Objects.equals(this.serie, other.serie)) {
            return false;
        }
        if (!Objects.equals(this.Fec_Ult, other.Fec_Ult)) {
            return false;
        }
        if (!Objects.equals(this.Fec_Prox, other.Fec_Prox)) {
            return false;
        }
        if (!Objects.equals(this.veces, other.veces)) {
            return false;
        }
        if (!Objects.equals(this.fec_Ult_FA, other.fec_Ult_FA)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.ad_Login, other.ad_Login)) {
            return false;
        }
        if (!Objects.equals(this.cod_Empresa, other.cod_Empresa)) {
            return false;
        }
        if (!Objects.equals(this.cod_Empresa_Nomi, other.cod_Empresa_Nomi)) {
            return false;
        }
        if (!Objects.equals(this.cod_Empresa_Admi, other.cod_Empresa_Admi)) {
            return false;
        }
        if (!Objects.equals(this.Sel_Emp, other.Sel_Emp)) {
            return false;
        }
        if (!Objects.equals(this.Sel_Emp_Admi, other.Sel_Emp_Admi)) {
            return false;
        }
        if (!Objects.equals(this.co_mapa, other.co_mapa)) {
            return false;
        }
        if (!Objects.equals(this.co_mapa_nomi, other.co_mapa_nomi)) {
            return false;
        }
        if (!Objects.equals(this.co_mapa_admi, other.co_mapa_admi)) {
            return false;
        }
        if (!Objects.equals(this.Acceso_Todas_Empresa_Admi, other.Acceso_Todas_Empresa_Admi)) {
            return false;
        }
        if (!Objects.equals(this.co_us_in, other.co_us_in)) {
            return false;
        }
        if (!Objects.equals(this.fe_us_in, other.fe_us_in)) {
            return false;
        }
        if (!Objects.equals(this.co_us_mo, other.co_us_mo)) {
            return false;
        }
        if (!Objects.equals(this.fe_us_mo, other.fe_us_mo)) {
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
        if (!Objects.equals(this.co_sucu_in, other.co_sucu_in)) {
            return false;
        }
        if (!Objects.equals(this.co_sucu_mo, other.co_sucu_mo)) {
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
        if (!Objects.equals(this.Password2, other.Password2)) {
            return false;
        }
        return true;
    }

}
