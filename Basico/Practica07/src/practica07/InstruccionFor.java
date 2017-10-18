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
public class InstruccionFor {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite el numero de veces a repetir el codigo:");
        if (valor == null){
            JOptionPane.showMessageDialog(null, "El codigo no se ejecuto por Cancelar la operacion");
        } else {
            forSencillo(Integer.parseInt(valor));
        }
    }
    public static void forSencillo(int limite){
        for (int i = 1; i <= limite; i++){
            System.out.println("El valor de I es: " + i);
        }
    }
}
