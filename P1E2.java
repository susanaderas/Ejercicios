/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1e2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P1E2 {

    public static void main(String[] args) {
     
    int plt, cant;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("ingreese 1 o 2 segun el plato: ");
        plt = Entrada.nextInt();
        System.out.println("numero de ordenes:");
        cant = Entrada.nextInt();
        double totIni= 0, desc=0, totFin = 0, precioPlato1 = 5, precioPlato2 = 7;
        if (plt == 1){
        
            if (cant >= 1 & cant <= 5){
                desc = 0.05;
            }else if (cant >= 6 & cant <= 10) {
                desc = 0.07;
            }else if (cant >= 11) { 
                desc = 0.09;
            }else{
                System.out.println("Cantidad equivocada");
            }
            
            totIni = cant * precioPlato1;
            totFin = totIni- (totIni* desc);
                
        }else if (plt == 2){
            if (cant >= 1 & cant <= 5){
                desc = 0.06;  
            }else if (cant >= 6 & cant <= 10) {       
                desc = 0.09;
            }else if (cant >= 11) {
                desc = 0.12;
            }else{
                System.out.println("Cantidad equivocada");
            }  
            
            totIni = cant*precioPlato2;
            totFin = totIni - (totIni* desc);
             
        }else{
            System.out.println("plato equivicado");
        }
        System.out.println("el menu es el plato: "+plt);
        System.out.println("la cantidad de platos son: "+cant);
        System.out.println("el total inicial es: $"+totIni);
        System.out.println("el total final (con descuento) es: $"+totFin);
        
    }
    
}
