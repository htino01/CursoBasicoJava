/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaprueba03;

/**
 *
 * @author Cursos
 */
public class ConversionDatos {
    public static void main(String[] args) {
        String valorString = "50";
        
        int valorInt = Integer.parseInt(valorString);
        long valorLong = Long.parseLong(valorString);
        float valorFloat = Float.parseFloat(valorString);
        double valorDouble = Double.parseDouble(valorString);
        
        System.out.println("Entero  : " + valorInt);
        System.out.println("Long    : " + valorLong);
        System.out.println("Float   : " + valorFloat);
        System.out.println("Double  : " + valorDouble);
    }
}
