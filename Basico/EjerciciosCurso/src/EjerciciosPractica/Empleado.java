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
public class Empleado {
    private String noNit;
    private String apellidos, nombres, direccion;
    private double salarioDevengado, salarioConDescuento;
    private boolean estadoEmpleado;

    @Override
    public String toString() {
        return "Empleado{" + "noNit=" + noNit + ", apellidos=" + apellidos + ", nombres=" + nombres + ", direccion=" + direccion + ", salarioDevengado=" + salarioDevengado + ", salarioConDescuento=" + salarioConDescuento + ", estadoEmpleado=" + estadoEmpleado + '}';
    }

    public String getNoNit() {
        return noNit;
    }

    public void setNoNit(String noNit) {
        this.noNit = noNit;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSalarioDevengado() {
        return salarioDevengado;
    }

    public void setSalarioDevengado(double salarioDevengado) {
        this.salarioDevengado = salarioDevengado;
    }

    public double getSalarioConDescuento() {
        return salarioConDescuento;
    }

    public void setSalarioConDescuento(double salarioConDescuento) {
        this.salarioConDescuento = salarioConDescuento;
    }

    public boolean isEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(boolean estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public Empleado(String noNit, String apellidos, String nombres, String direccion, double salarioDevengado, boolean estadoEmpleado) {
        this.noNit = noNit;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.direccion = direccion;
        this.salarioDevengado = salarioDevengado;
        //this.salarioConDescuento = salarioConDescuento;
        this.estadoEmpleado = estadoEmpleado;
    }
    
    public void salarioConDescuento(Empleado e, double porcentaje){
        e.setSalarioConDescuento(e.getSalarioDevengado() - (e.getSalarioDevengado() * (porcentaje / 100)));
        System.out.println("El salario con descuento es $ "
        + e.getSalarioConDescuento());
    }
    
    public void nombreCliente(Empleado e){
        System.out.println("El nombre del contribuyente es "
        +e.getNombres() + " "
        +e.getApellidos());
    }
}
