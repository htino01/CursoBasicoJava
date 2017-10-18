/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica06;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector Tino
 */
public class InstruccionIfString {
    public static void main(String[] args) {
        String valorString = JOptionPane.showInputDialog("Digite el Sexo" + "\n" + "M = Masculino" + "\n" + "F = Femenino");
        ifstring(valorString.toUpperCase());
    }
    public static void ifstring(String sexo){
        if(sexo.equals("M")){
            JOptionPane.showMessageDialog(null, "Sexo Masculino...");
        } else if (sexo.equals("F")){
            JOptionPane.showMessageDialog(null, "Sexo Femenino");
        } else {
            JOptionPane.showMessageDialog(null, "Sexo no valido...");
        }
    }
}
