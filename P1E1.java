/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodo1ejercicio1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Periodo1Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner Entrada = new Scanner (System.in);
        System.out.println("ingrese el numero de meses: ");
        float Nmes = Entrada.nextFloat ();
        double prec, prima, desc, deuda, cuota;
        
        if (Nmes >=1 && Nmes <=65){
            prec=23000*1.13;
            desc=0;
            if (Nmes == 36) {
                desc = prec * 0.2;
                prima = (prec - desc)*0.15;
                deuda = (prec - desc)-prima;
            }else{
                prima = prec*0.15;
                deuda = prec - prima;        
            }
            cuota = deuda/Nmes;
            System.out.println("El precio es: $"+prec);
            System.out.println("El descuento es de: $"+desc);
            System.out.println("La deuda es de: $"+deuda);
            System.out.println("La cuota es: $"+cuota);
        }else{
            System.out.println("Numeros incorrectos");
        }
    }
    
}
