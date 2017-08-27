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
public class ResistenciaCircuito {
    public static void main(String[] args) {
        int resistencia1 = 5000;
        int resistencia2 = 10000;
        
        int valorResistencia = (resistencia1 * resistencia2) / (resistencia1 + resistencia2);
        
        System.out.println("El valor de la Resistencia es : " + valorResistencia);
    }
}
