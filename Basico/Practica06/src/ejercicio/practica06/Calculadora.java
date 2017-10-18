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
public class Calculadora {
    private int valor1, valor2, resultado;
    private char operacion;

    @Override
    public String toString() {
        return "Calculadora{" + "valor1=" + valor1 + ", valor2=" + valor2 + ", resultado=" + resultado + ", operacion=" + operacion + '}';
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }

    public Calculadora(int valor1, int valor2, int resultado, char operacion) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.resultado = resultado;
        this.operacion = operacion;
    }
    
    public void calculadora(Calculadora cal){
        switch (cal.operacion){
            case 'S':
                cal.setResultado(cal.getValor1() + cal.getValor2());
                JOptionPane.showMessageDialog(null, "El resultado de la Suma es: " + "\n" + cal.getResultado());
                break;
            case 'R':
                cal.setResultado(cal.getValor1() - cal.getValor2());
                JOptionPane.showMessageDialog(null, "El resultado de la Resta es: " + "\n" + cal.getResultado());
                break;
            case 'M':
                cal.setResultado(cal.getValor1() * cal.getValor2());
                JOptionPane.showMessageDialog(null, "El resultado de la Multiplicacion es: " + "\n" + cal.getResultado());
                break;
            case 'D':
                cal.setResultado(cal.getValor1() / cal.getValor2());
                JOptionPane.showMessageDialog(null, "El resultado de la Division es: " + "\n" + cal.getResultado());
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operacion invalida...");
        }
    }
}
