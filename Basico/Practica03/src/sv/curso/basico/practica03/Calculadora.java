/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Cursos
 */
public class Calculadora {
    public static void main(String[] args) {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        
        double valor1 = 0;
        double valor2 = 0;
        
        try{
            System.out.println("Valor 1:");
            valor1 = Double.parseDouble(lector.readLine());
            System.out.println("Valor 2:");
            valor2 = Double.parseDouble(lector.readLine());
            
            System.out.println("Suma            : " + Calculadora.sumar(valor1, valor2));
            System.out.println("Resta           : " + Calculadora.restar(valor1, valor2));
            System.out.println("Multiplicacion  : " + Calculadora.multiplicar(valor1, valor2));
            System.out.println("Division        : " + Calculadora.dividir(valor1, valor2));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static double sumar(double valor1, double valor2){
        double resultado = valor1 + valor2;
        return resultado;
    }
    
    public static double restar(double valor1, double valor2){
        double resultado = valor1 - valor2;
        return resultado;
    }
    
    public static double multiplicar(double valor1, double valor2){
        double resultado = valor1 * valor2;
        return resultado;
    }
    
    public static double dividir(double valor1, double valor2){
       double resultado = valor1 / valor2;
       return resultado;
    }
}
