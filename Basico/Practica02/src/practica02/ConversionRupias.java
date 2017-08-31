/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02;

/**
 *
 * @author Hector Tino
 */
public class ConversionRupias {
    
    public static double conversionRupias(double cantDolares, double valorRupia){
        cantDolares = cantDolares * valorRupia;
        return cantDolares;
    }
    
    public static void main(String[] args) {
        double cantDolares = 1000;
        double valorRupia = 67.9098;
        double rupias = conversionRupias(cantDolares, valorRupia);
        System.out.println("$"+ cantDolares + " en Rupias son: $" +rupias);
    }
}
