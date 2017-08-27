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
public class TasaBanco {
    public static void main(String[] args) {
        double ahorro = 500.00;
        double tasaInteresPrimerAno = 2.5;
        double tasaInteresSegundoAno = 3;
        //Interes a un año
        double subTtotal = ahorro * (tasaInteresPrimerAno/100);
        double total = ahorro + subTtotal;
       
        System.out.println("Total en 1 año: " + total);
        
        //Interes a 18 meses
        subTtotal = total * ((tasaInteresSegundoAno/100)/2);
        total = total + subTtotal;
        
        System.out.println("Total a 18 meses: " + total);
        
        
    }
}
