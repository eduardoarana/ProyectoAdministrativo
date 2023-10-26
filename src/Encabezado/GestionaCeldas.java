/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encabezado;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author aranaVentur
 */
public class GestionaCeldas extends DefaultTableCellRenderer{

    
    private String tipo="Text";
    
    private Font normal  = new Font("Verdana", Font.PLAIN,12 );
    private Font bol  = new Font("Verdana", Font.BOLD,12 );
    
    public GestionaCeldas() {
    }
    
    
    public GestionaCeldas(String tipo) {
        this.tipo= tipo;
    }
    
    
    @Override
    public  Component getTableCellRendererComponent(JTable tabla , Object value, boolean select, boolean focused ,int row , int column){
        
        Color colorFondo= null;
        Color colorPorDefecto=new Color(192,192,192);
        Color colorFondoSeleccion = new Color(140,140,140); 
        if(select){
            this.setBackground(colorPorDefecto);
                
        }else {
            this.setBackground(Color.white);
        
        }
        if(tipo.equals("texto")){
        
            if(focused){
                colorFondo = colorFondoSeleccion;
            }else {
                colorFondo= colorPorDefecto;
            }
            this.setHorizontalAlignment(JLabel.LEFT);
            this.setText((String) value );
            this.setBackground((select)? colorFondo:Color.WHITE);
            this.setFont(normal);
            return this;
        }
        
        if(tipo.equals("numerico")){
        
            if(focused){
                colorFondo = colorFondoSeleccion;
            }else {
                colorFondo= colorPorDefecto;
            }
            this.setHorizontalAlignment(JLabel.CENTER);
            this.setText((String) value );
            this.setForeground((select)? new Color(255,255,255) : new Color(32,117,32) );
            this.setBackground((select)? colorFondo:Color.WHITE);
            this.setFont(bol);
            return this;
        }
        
        
     return this;   
    }
    
    
}
