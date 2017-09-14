/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapractica04;

/**
 *
 * @author Hector Tino
 */
public class CuentaBancaria {
    long numeroCuenta;
    Cliente titular;
    double saldoCuenta;
    
    public CuentaBancaria(long numeroCuenta, Cliente titular, long saldoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldoCuenta = saldoCuenta;
    }
}
