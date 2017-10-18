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
public class Factura {
    private int noFactura;
    private String nomCliente, telCliente, dirCliente;
    private double montoTotalFac, impIva;
    private boolean estadoCliente;

    @Override
    public String toString() {
        return "Factura{" + "noFactura=" + noFactura + ", nomCliente=" + nomCliente + ", telCliente=" + telCliente + ", dirCliente=" + dirCliente + ", montoTotalFac=" + montoTotalFac + ", impIva=" + impIva + ", estadoCliente=" + estadoCliente + '}';
    }

    public int getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(int noFactura) {
        this.noFactura = noFactura;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getTelCliente() {
        return telCliente;
    }

    public void setTelCliente(String telCliente) {
        this.telCliente = telCliente;
    }

    public String getDirCliente() {
        return dirCliente;
    }

    public void setDirCliente(String dirCliente) {
        this.dirCliente = dirCliente;
    }

    public double getMontoTotalFac() {
        return montoTotalFac;
    }

    public void setMontoTotalFac(double montoTotalFac) {
        this.montoTotalFac = montoTotalFac;
    }

    public double getImpIva() {
        return impIva;
    }

    public void setImpIva(double impIva) {
        this.impIva = impIva;
    }

    public boolean isEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(boolean estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public Factura(int noFactura, String nomCliente, String telCliente, String dirCliente, double montoTotalFac, double impIva, boolean estadoCliente) {
        this.noFactura = noFactura;
        this.nomCliente = nomCliente;
        this.telCliente = telCliente;
        this.dirCliente = dirCliente;
        this.montoTotalFac = montoTotalFac;
        this.impIva = impIva;
        this.estadoCliente = estadoCliente;
    }
    
    public void impIva(Factura fac){
        fac.setMontoTotalFac(fac.getMontoTotalFac() * (fac.getImpIva() / 100));
        System.out.println("Impuesto IVA: " + fac.getMontoTotalFac());
    }
    
    public void imprimir(Factura fac){
        System.out.println("Nombre      : " + fac.getNomCliente() + "\n" +
                           "Telefono    : " + fac.getTelCliente() + "\n" +
                           "Direccion   : " + fac.getDirCliente() + "\n");
    }
}
