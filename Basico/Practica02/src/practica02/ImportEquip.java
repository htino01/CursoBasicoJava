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
public class ImportEquip {
    
    public static String calculoDai(double valorEquipo, double valorFlete){
        double impSeguro = 5;
        double impAduana = 10;
        double impIva = 13;
        double valorSeguro = valorEquipo * (impSeguro/100);
        
        double dai = (valorEquipo - valorFlete - valorSeguro) * (impAduana/100);
        double ivaDai = dai * (impIva/100);
        
        System.out.println("El valor DAI es     : " + dai);
        System.out.println("El valor de IVA es  : " + ivaDai);
        
        return "";
    }
    
    public static void main(String[] args) {
        double valorEquipo = 10000;
        double valorFlete = 500;
        
        calculoDai(valorEquipo, valorFlete);
    }
}
