/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica03;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Hector Tino
 */
public class DineroPlazo {
    public static void main(String[] args) {
        String nomCliente;
        String montoInvertido;
        
        nomCliente = JOptionPane.showInputDialog("Digite el nombre del Cliente:");
        montoInvertido = JOptionPane.showInputDialog("Digite el monto a Invertir");
        
        String result = DineroPlazo.ganaciaPlazo(montoInvertido);
        Double resultado = Double.parseDouble(result);
        Double invertido = Double.parseDouble(montoInvertido);
        NumberFormat formato = new DecimalFormat(" $#,###.##");
        
        JOptionPane.showMessageDialog(null, "NOMBRE CLIENTE: " + nomCliente + "\n" +
                                            "CANTIDAD INVERTIDA: " + formato.format(invertido) + "\n" +
                                            "GANANCIA EN 6 MESES: " + formato.format(resultado));
    }
    
    public static String ganaciaPlazo(String montoInvertido){
        double deposito = Double.parseDouble(montoInvertido);
        double interes = 2.25;
        
        double intAnual = deposito * (interes / 100);
        double intMitad = intAnual / 2;
        double saldo = deposito + intMitad;
        double retInt = saldo * (1.0 /100);
        String resultado = String.valueOf(saldo - retInt);
        
        return resultado;
    }
}
