/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialyoutube;

/**
 *
 * @author Hector Tino
 */
public class SecuenciaNumeros {
    public static void main(String[] args) {
        long numInicial = 1000000;
        long numFinal = 2000000;
        int bandera = 1;
        
        for (long i = numInicial; i <= numFinal; i += 100){
            System.out.println(i);
            bandera++;
        }
        System.out.println("Cantidad de Numeros: " + bandera);
    }
}
