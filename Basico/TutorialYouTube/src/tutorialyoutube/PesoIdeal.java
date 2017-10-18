/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialyoutube;

import javax.swing.JOptionPane;
/**
 *
 * @author Hector Tino
 */
public class PesoIdeal {
    public static void main(String[] args) {
        String genero = "";
        
        do{
            genero = JOptionPane.showInputDialog("Introduce tu genero (M / F):");
        } while (genero.equalsIgnoreCase("M") == false && genero.equalsIgnoreCase("F") == false);
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en CM"));
        int pesoIdeal = 0;
        if (genero.equalsIgnoreCase("M")){
            pesoIdeal = altura - 110;
        } else if (genero.equalsIgnoreCase("F")){
            pesoIdeal = altura - 120; 
       }
        System.out.println("Tu peso ideal es " + pesoIdeal + "Kg");
    }
}
