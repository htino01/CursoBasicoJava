/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica03;

import javax.swing.JOptionPane;

/**
 *
 * @author Cursos
 */
public class BilleteDeDiez {
    public static void main(String[] args) {
        String montoDinero;
        montoDinero = JOptionPane.showInputDialog("Ingresa el monto de dinero:");
        String resultado = BilleteDeDiez.obtieneBilletesDeDiez(montoDinero);
        JOptionPane.showMessageDialog(null,"El numero de billetes de " + "Diez Dolares es: " + resultado);
    }
    
    public static String obtieneBilletesDeDiez(String valor){
        double montoDinero = Double.parseDouble(valor);
        int billetesDeDiez = (int) montoDinero/10;
        String resultado = String.valueOf(billetesDeDiez);
        return resultado;
    }
}
