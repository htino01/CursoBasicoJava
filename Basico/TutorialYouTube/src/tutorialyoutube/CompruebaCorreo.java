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
public class CompruebaCorreo {
    public static void main(String[] args) {
        int arroba = 0;
        boolean punto = false;
        
        String mail = JOptionPane.showInputDialog("Introduce tu correo:");
        
        for (int i = 0; i < mail.length(); i++){
            if (mail.charAt(i) == '@'){
                arroba++;
            }
            if (mail.charAt(i) == '.'){
                punto = true;
            }
        }
        if (arroba == 1 && punto == true){
            System.out.println("Correo es Correctgo!");
        } else {
            System.out.println("Correo NO es Correcto!");
        }
    }
}
