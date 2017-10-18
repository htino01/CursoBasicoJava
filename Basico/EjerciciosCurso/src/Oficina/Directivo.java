/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oficina;

/**
 *
 * @author Hector Tino
 */
public class Directivo {
    private String cargo;
    private int numDespacho;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return "Directivo{" + "cargo=" + cargo + ", numDespacho=" + numDespacho + '}';
    }

    public Directivo(String cargo, int numDespacho) {
        this.cargo = cargo;
        this.numDespacho = numDespacho;
    }
    
    public void aumentarSueldo(Persona e, double porcentaje){
        e.setSueldo(e.getSueldo() * (1 + porcentaje / 100));
        System.out.println("El nuevo sueldo de "
        +e.getNombre()+""
        +e.getApellidos()+" es $"
        +e.getSueldo());
    }
}
