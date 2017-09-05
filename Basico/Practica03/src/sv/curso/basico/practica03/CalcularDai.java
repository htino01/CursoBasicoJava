/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica03;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Cursos
 */
public class CalcularDai {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        double valorMaquina = 0.0;
        double valorFlete = 0.0;
        double valorSeguro = 0.0;
        
        System.out.println("Valor Maquina:");
        valorMaquina = lector.nextDouble();
        
        System.out.println("Valor Flete");
        valorFlete = lector.nextDouble();
        
        System.out.println("Valor Seguro");
        valorSeguro = lector.nextDouble();
        
        double valorDai = CalcularDai.obtieneDai(valorMaquina, valorFlete, valorSeguro);
        double valorIva = CalcularDai.obtieneIva(valorDai);
        
        NumberFormat formato = new DecimalFormat("$#,###.##");
        
        System.out.println("Valor del Dai: " + formato.format(valorDai));
        System.out.println("Valor del Iva: " + formato.format(valorIva));
    }
    
    public static double obtieneDai(double valorMaquina, double valorFlete, double valorSeguro){
        double dai = 0.0;
        dai = (valorMaquina - valorFlete - valorSeguro) * 0.10;
        return dai;
    }
    
    public static double obtieneIva(double valorDai){
        double valorIva = 0.0;
        valorIva = valorDai * 1.13;
        return valorIva;
    }
}
