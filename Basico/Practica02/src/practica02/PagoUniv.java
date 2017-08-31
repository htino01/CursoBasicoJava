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
        double impRenta = 10;
        double subTotal = horasMes * sueldoPorHora;
        double total = subTotal / ((impRenta / 100) + 1);
        double renta = subTotal - total;
        NumberFormat formato = new DecimalFormat("#0.00");
        
        System.out.println("Horas impartidas al Mes: " + horasMes + " Hrs");
        System.out.println("El sub-total a pagar es: $" + formato.format(subTotal));
        System.out.println("Menos 10% de Renta     : $" + formato.format(renta));
        System.out.println("Total a pagar          : $" + formato.format(total));
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
