/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class factura {

    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        Date fecha = new Date();
        
        
        String nombre = "";
        int compra = 0;
        int pagar1;
        int pagar2;
        double pagar3;
        
        System.out.println("Cual es su nombre?");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el valor de la compra");
        compra = entrada.nextInt();
        
        if (compra >= 200000){
            pagar1 = 15;
            compra = (int) (compra - (compra*0.15));
            System.out.println("************************");
            System.out.println("Hola! "+nombre+", le agradecemos su compra el dia de hoy");
            System.out.println("************************");
            System.out.println("Su compra a pagar es de: "+compra);
            System.out.println("************************");
            System.out.println("Recibiste un bono de: "+pagar1+"%"+" por compra mayor a $200.000");
            System.out.println("************************");
            System.out.println("Que tenga un feliz dia "+nombre+" y que vuelva pronto");
            System.out.println("************************");
            System.out.println("Fecha: "+fecha);
            
        } else if(compra >= 50000 && compra < 200000){
            pagar2 = 2;
            compra = (int)(compra - (compra*0.02));
            System.out.println("************************");
            System.out.println("Hola! "+nombre+", le agradecemos su compra el dia de hoy");
            System.out.println("************************");
            System.out.println("Su compra a pagar es de: "+compra);
            System.out.println("************************");
            System.out.println("Recibiste un bono de: "+pagar2+"%"+" por compra mayor a $50.000");
            System.out.println("************************");
            System.out.println("Que tenga un feliz dia "+nombre+" y que vuelva pronto");
            System.out.println("************************");
            System.out.println("Fecha: "+fecha);
            
        } else if(compra >= 20000 && compra < 50000){
            pagar3 = 1.5;
            compra = (int) (compra - (compra*0.015));
            System.out.println("************************");
            System.out.println("Hola! "+nombre+", le agradecemos su compra el dia de hoy");
            System.out.println("************************");
            System.out.println("Su compra a pagar es de: "+compra);
            System.out.println("************************");
            System.out.println("Recibiste un bono de: "+pagar3+"%"+" por compra mayor a $20.000");
            System.out.println("************************");
            System.out.println("Que tenga un feliz dia "+nombre+" y que vuelva pronto");
            System.out.println("************************");
            System.out.println("Fecha: "+fecha);
            
        }else if(compra < 20000){
            System.out.println("************************");
            System.out.println("Hola! "+nombre+", le agradecemos su compra el dia de hoy");
            System.out.println("************************");
            System.out.println("Su compra a pagar es de: "+compra);
            System.out.println("************************");
            System.out.println("Que tenga un feliz dia "+nombre+" y que vuelva pronto");
            System.out.println("************************");
            System.out.println("Fecha: "+fecha);
        }
    }
}
        
    
