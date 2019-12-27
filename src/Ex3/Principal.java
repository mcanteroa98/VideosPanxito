/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class Principal {
    public static int indiceCocheMBarato(Vehiculo coches[]){
        double precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for(int i = 1; i<coches.length;i++){
            if (coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
                
            }
        }
        return indice;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca;
        String modelo;
        double precio;
        int nVehiculos, indiceBarato;
        
        System.out.println("Cuantos vehiculos hay? ");
        nVehiculos = sc.nextInt();
        
        //Creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[nVehiculos];
        
        for (int i = 0; i < coches.length; i++) {
            sc.nextLine(); //Limpiar buffer
            System.out.println("\nDigite las caracteristicas del coche " + (i+1) + ":");
            System.out.println("Introduce la marca ");
            marca = sc.nextLine();
            System.out.println("Introduce el modelo ");
            modelo = sc.nextLine();
            System.out.println("Introduce el precio ");
            precio = sc.nextDouble();
            
            coches[i] = new Vehiculo(marca, modelo, precio);
        }
        
        indiceBarato = indiceCocheMBarato(coches);
        
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].MostrarDatos());
    }
}
