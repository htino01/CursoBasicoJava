/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.curso.basico.practica04;

/**
 *
 * @author Hector Tino
 */
public class CuentaBancaria {
    long numeroCuenta;
    Cliente propietarioCuenta;
    double saldoCuenta;
    
    public CuentaBancaria(long numeroCuenta, Cliente propietarioCuenta, double saldoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.propietarioCuenta = propietarioCuenta;
        this.saldoCuenta = saldoCuenta;
    }
    
    public void abonar(double cantidad){
        saldoCuenta += cantidad; //Logica de negocio
    }
    
    public void retirar(double cantidad){
        if(cantidad > saldoCuenta){
            System.out.println("Saldo Insuficiente");
        } else {
            saldoCuenta -= cantidad; //Logica de negocio
        }
    }
    
    public String datosPropietarioCuenta(){
        String informacion = "";
        informacion += "DUI: " + propietarioCuenta.noDui + "\n";
        informacion += "Nombre: " + propietarioCuenta.nombre + "\n";
        informacion += "Telefono: " + propietarioCuenta.telefono;
        return informacion;
    }
}
