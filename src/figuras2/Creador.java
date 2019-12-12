/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras2;

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
    
        int v_filas=pasarDato();        
        String crearTriangulo="     ";
        
        for(int i = 1;i<=v_filas;i++){                                    
            for(int x = 1;x<=v_filas-i;x++){                                
                System.out.print(" ");
                }
           for(int y = 1;y<=(i*2)-1;y++){                                
                System.out.print("*");
                }
            System.out.println();
            }
            
        }    
    }            
