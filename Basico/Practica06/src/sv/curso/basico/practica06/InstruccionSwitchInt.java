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
public class InstruccionSwitchInt {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite un numero para el dia de la semana [Del 1 al 7]:");
        switchConInt(Integer.parseInt(valor));
    }
    public static void switchConInt(int diaSemana){
        switch(diaSemana){
            case 1:
                JOptionPane.showMessageDialog(null, "Dia Lunes...");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Dia Martes...");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Dia Miercoles...");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Dia Jueves...");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Dia Viernes...");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Dia Sabado...");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Dia Domingo...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Dia ingresado no existe!!!");
        }
    }
}
