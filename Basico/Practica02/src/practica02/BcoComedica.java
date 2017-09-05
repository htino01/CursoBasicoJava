/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Hector Tino
 */
public class BcoComedica {
    
    public static double calcularInteresPlazo(double cantAhorro){
        double interesPlazo = 5;
        int anosPlazo = 5;
        
        for(int i = 1; i <= anosPlazo; i++){
            double calcIntereses = cantAhorro * (interesPlazo/100);
            cantAhorro = cantAhorro + calcIntereses; 
       }
        return cantAhorro;
    }
    
    public static void main(String[] args) {
        double cantAhorro = 5000;
        NumberFormat formato = new DecimalFormat("#0.00");
        double total = calcularInteresPlazo(cantAhorro);
        System.out.println("Dinero ahorrado al final: $" + formato.format(total));
    }
}
