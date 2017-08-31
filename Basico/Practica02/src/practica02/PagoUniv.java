/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02;

import java.text.NumberFormat;
import java.text.DecimalFormat;
/**
 *
 * @author Hector Tino
 */
public class PagoUniv {
    
    public static String pagoDocente(double sueldoPorHora, int cantAsignaturas, int horasPorAsignatura, int cantSemanas){
        int horasMes = (cantAsignaturas * horasPorAsignatura) * cantSemanas;
        double subTotal = horasMes * sueldoPorHora;
        double calcRenta = subTotal / ((10/100)+1.1);
        double renta = subTotal - calcRenta;
        NumberFormat formato = new DecimalFormat("#0.00");
        
        System.out.println("Horas impartidas al Mes: " + horasMes + " Hrs");
        System.out.println("El sub-total a pagar es: $" + formato.format(subTotal));
        System.out.println("Menos 10% de Renta     : $" + formato.format(renta));
        System.out.println("Total a pagar          : $" + formato.format(calcRenta));
        return "";
    }
    
    public static void main(String[] args) {
        double sueldoPorHora = 6.50;
        int cantAsignaturas = 4;
        int horasPorAsignatura = 4;
        int cantSemanas = 4;
        
        pagoDocente(sueldoPorHora, cantAsignaturas, horasPorAsignatura, cantSemanas);
    }
}
