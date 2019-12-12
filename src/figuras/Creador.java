/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Creador {
    
    public int pasarDato(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");   
     int numero = sc.nextInt();        
     return numero;
    }            
    public void crearTriangulo(){         
       int v_numero=pasarDato();        
        String crearTriangulo="";
        for(int i = 0;i<v_numero;i++){                    
            crearTriangulo=crearTriangulo + "a";       
            System.out.println(crearTriangulo);
        }    
    }            
}
