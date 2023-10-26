/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoadministrativo;

/**
 *
 * @author AranaV
 */
public class Argumentos {
    
    
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String usuario =args[i+1] ;
            String clave = args[i+2] ;
            
            if(usuario.equals("Usuario") && clave.equals("1234") ){
                System.out.println("usuario y contraseña VAlidad");
            }else {
                System.out.println("usuario y contraseña Invalida");
            }
        }
    
    }
    
}
