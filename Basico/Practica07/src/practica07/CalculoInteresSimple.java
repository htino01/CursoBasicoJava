/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica07;

import javax.swing.JOptionPane;

/**
 *
 * @author Hector Tino
 */
public class CalculoInteresSimple {
    public static void main(String[] args) {
        String montoDinero = JOptionPane.showInputDialog("Digite la cantidad de dinero depositada:");
        String numeroAnios = JOptionPane.showInputDialog("Digite el numero de años del deposito:");
        String interesAnual = JOptionPane.showInputDialog("Digite el interes anual por el deposito:");
        calculoInteres(Double.parseDouble(montoDinero), Integer.parseInt(numeroAnios), Double.parseDouble(interesAnual));
    }
    public static void calculoInteres(double montoDinero, int numeroAnios, double interesAnual){
        for (int i = 1; i <= numeroAnios; i++){
            double interesPorAnio = montoDinero * (interesAnual / 100);
            montoDinero += montoDinero * (interesAnual / 100);
            System.out.println("Monto Interes en el Año " + i + ": " + interesPorAnio);
            System.out.println("Monto Dinero Mas Interes: " + montoDinero);
            System.out.println("--------------------------");
        }
    }
}
