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
public class FacturaElectrica {
    private int noCuenta,
            lecturaActualMedidor, 
            lecturaAnteriorMedidor, 
            multiplicador = 10, 
            consumoMensual, 
            consumoDiario; 
    private double valorFactura;

    @Override
    public String toString() {
        return "FacturaElectrica{" + "noCuenta=" + noCuenta + ", lecturaActualMedidor=" + lecturaActualMedidor + ", lecturaAnteriorMedidor=" + lecturaAnteriorMedidor + '}';
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public int getLecturaActualMedidor() {
        return lecturaActualMedidor;
    }

    public void setLecturaActualMedidor(int lecturaActualMedidor) {
        this.lecturaActualMedidor = lecturaActualMedidor;
    }

    public int getLecturaAnteriorMedidor() {
        return lecturaAnteriorMedidor;
    }

    public void setLecturaAnteriorMedidor(int lecturaAnteriorMedidor) {
        this.lecturaAnteriorMedidor = lecturaAnteriorMedidor;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getConsumoMensual() {
        return consumoMensual;
    }

    public void setConsumoMensual(int consumoMensual) {
        this.consumoMensual = consumoMensual;
    }

    public int getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(int consumoDiario) {
        this.consumoDiario = consumoDiario;
    }

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }

    public FacturaElectrica(int noCuenta, int lecturaActualMedidor, int lecturaAnteriorMedidor) {
        this.noCuenta = noCuenta;
        this.lecturaActualMedidor = lecturaActualMedidor;
        this.lecturaAnteriorMedidor = lecturaAnteriorMedidor;
    }
    
    public void consumoMes(FacturaElectrica face){
        face.setConsumoMensual((face.getLecturaActualMedidor() - face.getLecturaAnteriorMedidor()) * face.getMultiplicador());
        System.out.println("Consumo mensual es: " + face.getConsumoMensual() + "kWh");
    }
    
    public void consumoDiario(FacturaElectrica face, int diasFacturados){
        face.setConsumoDiario(face.getConsumoMensual() / diasFacturados);
        System.out.println("Consumo diario es: " + face.getConsumoDiario() + "kWh");
    }
    
    public void valorFactura(FacturaElectrica face){
        face.setValorFactura(face.getConsumoMensual() * 0.20);
        System.out.println("Valor de la Factura: $" + face.getValorFactura());
    }
}
