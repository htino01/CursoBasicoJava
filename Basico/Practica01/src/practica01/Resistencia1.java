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
public class Resistencia1 {
    public static void main(String[] args) {
        double resistencia1 = 2000;
        double resistencia2 = 1000;
        
        double valorResistencia = 1 / ((1/resistencia1) + (1/resistencia2));
        
        System.out.println(valorResistencia);
    }
}
