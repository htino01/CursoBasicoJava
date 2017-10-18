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
public class Empleado {
    private int categoria, numDepartamento;
    private String tipoContrato;

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getNumDepartamento() {
        return numDepartamento;
    }

    public void setNumDepartamento(int numDepartamento) {
        this.numDepartamento = numDepartamento;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String toString() {
        return "Empleado{" + "categoria=" + categoria + ", numDepartamento=" + numDepartamento + ", tipoContrato=" + tipoContrato + '}';
    }

    public Empleado(int categoria, int numDepartamento, String tipoContrato) {
        this.categoria = categoria;
        this.numDepartamento = numDepartamento;
        this.tipoContrato = tipoContrato;
    }
}
