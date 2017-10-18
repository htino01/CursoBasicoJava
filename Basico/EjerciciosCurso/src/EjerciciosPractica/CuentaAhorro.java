/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosPractica;

/**
 *
 * @author Hector Tino
 */
public class CuentaAhorro extends ClienteCooperativa{
    private int noCuenta;
    private double montoTotalAdeudado, montoTotalPagado, saldoCuenta;
    private boolean estadoCuenta;

    @Override
    public String toString() {
        return "CuentaAhorro{" + "noCuenta=" + noCuenta + ", montoTotalAdeudado=" + montoTotalAdeudado + ", montoTotalPagado=" + montoTotalPagado + ", saldoCuenta=" + saldoCuenta + ", estadoCuenta=" + estadoCuenta + '}';
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getMontoTotalAdeudado() {
        return montoTotalAdeudado;
    }

    public void setMontoTotalAdeudado(double montoTotalAdeudado) {
        this.montoTotalAdeudado = montoTotalAdeudado;
    }

    public double getMontoTotalPagado() {
        return montoTotalPagado;
    }

    public void setMontoTotalPagado(double montoTotalPagado) {
        this.montoTotalPagado = montoTotalPagado;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public boolean isEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(boolean estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public CuentaAhorro(int noCuenta, double montoTotalAdeudado, double montoTotalPagado, double saldoCuenta, boolean estadoCuenta) {
        this.noCuenta = noCuenta;
        this.montoTotalAdeudado = montoTotalAdeudado;
        this.montoTotalPagado = montoTotalPagado;
        this.saldoCuenta = saldoCuenta;
        this.estadoCuenta = estadoCuenta;
    }
    
    public void calcularSaldo(CuentaAhorro ca){
        ca.setSaldoCuenta(ca.getMontoTotalAdeudado() - ca.getMontoTotalPagado());
        System.out.println("El saldo de la Cuenta es de: $" + ca.getSaldoCuenta());
    }
    
    public void imprimirDatos(CuentaAhorro ca){
        System.out.println("No Cuenta #         : " + ca.getNoCuenta() + "\n" +
                           "Monto total Adeudado: $" + ca.getMontoTotalAdeudado() + "\n" +
                           "Monto total Pagado  : $" + ca.getMontoTotalPagado());
    }
}
