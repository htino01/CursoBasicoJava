/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica04;

import javax.swing.JOptionPane;
/**
 *
 * @author Hector Tino
 */
public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        //Cliente propietario = new Cliente("021000093", "Hector Tino", 22285327); //Instanciamos la clase Cliente
        CuentaBancaria cuenta = new CuentaBancaria(14812345,
                                new Cliente("021000093", "Hector Tino", 22285327), 100.00); //Instancia la clase CuentaBancaria
        /*
        propietario.noDui = "021000093";
        propietario.nombre = "Hector Tino";
        propietario.telefono = 22285327;
        */
        //cuenta.propietarioCuenta = propietario;
        /*
        String montoDinero;
        montoDinero = JOptionPane.showInputDialog("Ingrese el monto a Abonar:");
        cuenta.abonar(Double.parseDouble(montoDinero));
        
        montoDinero = JOptionPane.showInputDialog("Ingreso el monto a Retirar");
        cuenta.retirar(Double.parseDouble(montoDinero));
        
        JOptionPane.showMessageDialog(null, "El saldo de la cuenta es: " + cuenta.saldoCuenta);
        */
        JOptionPane.showMessageDialog(null, "Datos del propietario de la Cuenta:\n " +
                                            cuenta.datosPropietarioCuenta());
    }
}
