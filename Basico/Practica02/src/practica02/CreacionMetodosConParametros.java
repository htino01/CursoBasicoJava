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
public class CreacionMetodosConParametros {
    
    public static void metodoConVoid(int valorInt, double valorDouble, String valorString){
        System.out.println("Ejecucion con Void");
        System.out.println("Valor Int   : " + valorInt);
        System.out.println("Valor Double: " + valorDouble);
        System.out.println("Valor String: " + valorString);    
    }
    
    public static double metodoConDouble(double valorDouble){
        System.out.println("Ejecucion con Double");
        System.out.println("Valor Double: " + valorDouble);
        return valorDouble;
    }
    
    public static String metodoConString(String valorString){
        System.out.println("Ejecucion con String");
        System.out.println("Valor String: " + valorString);
        return valorString;
    }
    
    public static void main(String[] args) {
        metodoConVoid(1, 10.0, "Jose");
        System.out.println("-------------------");
        double valorDouble = metodoConDouble(10.0);
        System.out.println("-------------------");
        String valorString = metodoConString("Jose");
    }
}
