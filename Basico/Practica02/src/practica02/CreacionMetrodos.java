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
public class CreacionMetrodos {
    
    public static void metodoConVoid(){
        System.out.println("Ejecucion con Void");
    }
    
    public static int metodoConInt(){
        System.out.println("Ejecucion con Int");
        return 0;
    }
    
    public static double metodoConDouble(){
        System.out.println("Ejecucion con Double");
        return 0.0;
    }
    
    public static String metodoConString(){
        System.out.println("Ejecucion con String");
        return "";
    }
    
    public static void main(String[] args) {
        metodoConVoid();
        metodoConInt();
        metodoConDouble();
        metodoConString();
    }
}
