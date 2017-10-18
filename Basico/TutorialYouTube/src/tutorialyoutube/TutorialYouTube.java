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
public class TutorialYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre, por favor:");
        String nombre_usuario = teclado.nextLine();
        
        System.out.println("Introduce tu edad, por favor");
        int edad = teclado.nextInt();
        
        System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad + 1) + " años");
    }
}
