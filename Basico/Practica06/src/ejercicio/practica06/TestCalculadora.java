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
public class TestCalculadora {
    public static void main(String[] args) {
        String val1 = JOptionPane.showInputDialog("Ingrese el primer valor: ");
        int valor1 = Integer.parseInt(val1);
        String opera = JOptionPane.showInputDialog("Que operacion desa realizar:" + "\n" +
                                                       "S = SUMAR" + "\n" +
                                                       "R = RESTAR" + "\n" +
                                                       "M = MULTIPLICAR" + "\n" +
                                                       "D = DIVIDIR" + "\n");
        char operacion = opera.toUpperCase().charAt(0);
        String val2 = JOptionPane.showInputDialog("Ingrese el segundo valor: ");
        int valor2 = Integer.parseInt(val2);
        Calculadora cal = new Calculadora(valor1, valor2, 0, operacion);
        cal.calculadora(cal);
    }
}
