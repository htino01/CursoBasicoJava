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
public class ConversionMonedas {
    public static void main(String[] args) {
        double monedaDolares = 75.00;
        
        //1 USD     0.70 Europa     0.61 Reino Unido       0.95 Australia      0.97 Canada
        
        //Declaramos las monedas a convertir
        double monedaEuropa = monedaDolares * 0.7;
        double monedaReinoUnido = monedaDolares * 0.61;
        double monedaAustralia = monedaDolares * 0.95;
        double monedaCanada = monedaDolares * 0.97;
        
        System.out.println("Moneda Europea  : " + monedaEuropa);
        System.out.println("Moneda Reino unido  : " + monedaReinoUnido);
        System.out.println("Moneda Australia  : " + monedaAustralia);
        System.out.println("Moneda Canada  : " + monedaCanada);
       
    }
}
