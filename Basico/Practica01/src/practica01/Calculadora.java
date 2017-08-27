/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica01;

/**
 *
 * @author Cursos
 */
public class Calculadora {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 5;
        
        int suma = valor1 + valor2;
        int resta = valor1 - valor2;
        int multiplicacion = valor1 * valor2;
        int division = valor1 / valor2;
        
        System.out.println("La suma es              : " + suma);
        System.out.println("La resta es             : " + resta);
        System.out.println("La multiplicacion es    : " + multiplicacion);
        System.out.println("La division es          : " + division);
    }
}
