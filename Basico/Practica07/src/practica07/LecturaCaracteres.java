/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector Tino
 */
public class LecturaCaracteres {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite cadena de texto a leer:");
        if (valor == null){
            JOptionPane.showMessageDialog(null, "El codigo no se ejecuta por Cancelar la operacion.");
        } else {
            leerCaracteresDeUnString(valor.toUpperCase());
        }
    }
    public static void leerCaracteresDeUnString(String cadena){
        for (int i = 0; i < cadena.length(); i++){
            System.out.println("Caracter " + (i+1) + " - " + cadena.charAt(i));
        }
    }
}
