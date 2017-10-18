/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialyoutube;

import java.util.Scanner;
/**
 *
 * @author Hector Tino
 */
public class AdivinarNumero {
    public static void main(String[] args) {
        int random = (int)(Math.random()*100);
        int numero = 0;
        int intentos = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        while (numero != random){
            intentos ++;
            System.out.println("Introduce un numero, por favor (Intento " + intentos +")");
            numero = entrada.nextInt();
            if (random < numero){
                System.out.println("Mas bajo");
            } else if (random > numero){
                System.out.println("Mas alto");
            }
        }
        System.out.println("Numero Correcto en " + intentos + " Intentos.");
    }
}
