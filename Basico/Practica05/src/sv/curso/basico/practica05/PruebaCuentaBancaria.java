/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica05;

/**
 *
 * @author Hector Tino
 */
public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setAbonoCuenta(100);
        cuenta.setCargoCuenta(25);
        cuenta.setSaldoCuenta();
        
        cuenta.setNoDui(210000080);
        cuenta.setNombre("Hector Tino");
        cuenta.setTelefono("2228-5327");
        
        System.out.println("Abono: " + cuenta.getAbonoCuenta());
        System.out.println("Cargo: " + cuenta.getCargoCuenta());
        System.out.println("Saldo: " + cuenta.getSaldoCuenta());
        
        System.out.println("No DUI  : " + cuenta.getNoDui());
        System.out.println("Nombre  : " + cuenta.getNombre());
        System.out.println("Telefono: " + cuenta.getTelefono());
    }
}
