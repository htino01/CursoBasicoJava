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
public class InstruccionDoWhile {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite el numero de veces a repetir el codigo:");
        if (valor == null){
            JOptionPane.showMessageDialog(null, "El codigo no se ejecuta por Cancelar la operacion.");
        } else {
            doWhileSencillo(Integer.parseInt(valor));
        }
    }
    public static void doWhileSencillo(int limite){
        int i = 1;
        do {
            System.out.println("El valor de I es: " + i);
            i++;
        } while (i <= limite);
    }
}
