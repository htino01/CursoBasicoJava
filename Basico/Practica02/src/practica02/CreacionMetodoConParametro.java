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
public class CreacionMetodoConParametro {
    
    public static double metodoValor(double valorDouble){
        valorDouble = valorDouble + 10;
        return valorDouble;
    }
    
    public static void main(String[] args) {
        double valor = metodoValor(15);
        System.out.println("Valor Double: " + valor);
    }
}
