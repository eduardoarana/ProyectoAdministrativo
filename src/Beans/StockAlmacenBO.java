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
public class StockAlmacenBO {
    
    private String co_alma;
    private String co_art;
    private String tipo;
    private Double stock;
    private String revisado;
    private String validador;

    
     //  pInsertarStockAlmacen

    public StockAlmacenBO() {
        
    }
    public String getCo_alma() {
        return co_alma;
    }

    public void setCo_alma(String co_alma) {
        this.co_alma = co_alma;
    }

    public String getCo_art() {
        return co_art;
    }

    public void setCo_art(String co_art) {
        this.co_art = co_art;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
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
    
 
    
}
