/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica01;

/**
 *
 * @author Hector Tino
 */
public class Motursa {
    public static void main(String[] args) {
        double valorEquipo = 12000;
        int vidaUtil = 5; //años
        double depreciacionAnual;
        //Calculo depreciacion anual
        double depreciacion = valorEquipo / vidaUtil;
        System.out.println("El valor del activo es : " + valorEquipo);
        System.out.println("La depreciacion para "+ vidaUtil +" años es : " + depreciacion);
        
        for(int i = 1; i <= vidaUtil; i++){
            depreciacionAnual = valorEquipo - depreciacion;
            
            System.out.println("Depreciacion año "+ i +": " + depreciacionAnual);
        }
    }
}
