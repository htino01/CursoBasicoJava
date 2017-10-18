/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.practica06;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector Tino
 */
public class NotaFinal {
    public static void main(String[] args) {
        String noCarnet = JOptionPane.showInputDialog("Ingrese el Carnet:");
        String nomEstudiante = JOptionPane.showInputDialog("Nombre del Alumno:");
        String notaLab1 = JOptionPane.showInputDialog("Nota Laboratorio 1:");
        String notaLab2 = JOptionPane.showInputDialog("Nota Laboratorio 2:");
        String notaLab3 = JOptionPane.showInputDialog("Nota Laboratorio 3:");
        String notaLab4 = JOptionPane.showInputDialog("Nota Laboratorio 4:");
        String notaPar1 = JOptionPane.showInputDialog("Nota Parcial 1:");
        String notaPar2 = JOptionPane.showInputDialog("Nota Parcial 2:");
        String notaPar3 = JOptionPane.showInputDialog("Nota Parcial 3:");
        String notaPar4 = JOptionPane.showInputDialog("Nota Parcial 4:");
        
        int notaL1 = Integer.parseInt(notaLab1);
        int notaL2 = Integer.parseInt(notaLab2);
        int notaL3 = Integer.parseInt(notaLab3);
        int notaL4 = Integer.parseInt(notaLab4);
        int notaP1 = Integer.parseInt(notaPar1);
        int notaP2 = Integer.parseInt(notaPar2);
        int notaP3 = Integer.parseInt(notaPar3);
        int notaP4 = Integer.parseInt(notaPar4);
        
        int notaFinalLab = notaL1 + notaL2 + notaL3 + notaL4;
        int notaFinalPar = notaP1 + notaP2 + notaP3 + notaP4;
        
        calcularEstudiante(notaFinalLab, notaFinalPar);
    }
    public static void calcularEstudiante(double notaFinalLab, double notaFinalParc){
        notaFinalLab = 
    }
}
