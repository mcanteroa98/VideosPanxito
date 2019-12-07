/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author bataparato
 */
public class Coche {
    //Atributos
    String color;
    String marca;
    int km;
    
    //Metodo
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        
        coche1.color = "Negro";
        coche1.km = 10000;
        coche1.marca = "Nissan";
        
        System.out.println("El color del coche1 es " + coche1.color);
        System.out.println("Tiene " + coche1.km + " km");
        System.out.println("Y es de la marca " + coche1.marca);
    }
}
