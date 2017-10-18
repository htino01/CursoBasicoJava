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
public class InstruccionSwitchChar {
    public static void main(String[] args) {
        String valor= JOptionPane.showInputDialog("Digite el estado civil del ciudadano:");
        switchConChar(valor.toUpperCase().charAt(0));
    }
    public static void switchConChar(char estadoCivil){
        switch(estadoCivil){
            case 'S':
                JOptionPane.showMessageDialog(null, "El ciudadano es Soltero...");
                break;
            case 'C':
                JOptionPane.showMessageDialog(null, "El ciudadano es Casado...");
                break;
            case 'D':
                JOptionPane.showMessageDialog(null, "El ciudadano es Divorciado...");
                break;
            case 'A':
                JOptionPane.showMessageDialog(null, "El ciudadano es Acompañado...");
                break;
            case 'V':
                JOptionPane.showMessageDialog(null, "El ciudadano es Viudo...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El estado civil es invalido...");
        }
    }
}
