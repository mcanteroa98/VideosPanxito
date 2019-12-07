/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosRetornoDeValores;

/**
 *
 * @author bataparato
 */
public class ejOperacion {
    public int sumar1 (int a, int b){
        int suma1 = a+b;
        return suma1;
    }
    public int restar (int a, int b){
        int resta = a - b;
        return resta;
    }
    public int multiplicar (int a, int b){
        int multiplicacion = a * b;
        return multiplicacion;
    }
    public int dividir (int a, int b){
        int division = a/b;
        return division;
    }
    public void mostrarResultados(int suma1, int resta, int multiplicacion){
        System.out.println("La suma es "+suma1);
        System.out.println("La resta es "+resta);
        System.out.println("La multiplicacion es "+multiplicacion);
    }
}
