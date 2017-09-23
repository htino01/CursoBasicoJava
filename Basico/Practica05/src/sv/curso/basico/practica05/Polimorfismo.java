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
public class Polimorfismo {
    public String convertirAString(int valorInt){
        String conversion = String.valueOf(valorInt);
        return conversion;
    }
    
    public String convertirAString(double valorDouble){
        String conversion = String.valueOf(valorDouble);
        return conversion;
    }
    
    public String convertirAString(float valorFloat){
        String conversion = String.valueOf(valorFloat);
        return conversion;
    }
    
    public static void main(String[] args) {
        Polimorfismo p = new Polimorfismo();
        System.out.println("Valor INT en STRING     :" + p.convertirAString(10));
        System.out.println("Valor DOUBLE en STRING  :" + p.convertirAString(10.05));
        System.out.println("Valor FLOAT en STRING   :" + p.convertirAString(10));
    }
}
