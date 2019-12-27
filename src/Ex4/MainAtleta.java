/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4;

import java.util.Scanner;

/**
 *
 * @author bataparato
 */
public class MainAtleta {
    public static int atletaGanador (Atleta corredor[]){
        int indice = 0;
        double tCarrera;
        
        tCarrera = corredor[0].gettCarrera();
        for (int i = 0; i < corredor.length; i++) {
            if (corredor[i].gettCarrera()<tCarrera){
                tCarrera = corredor[i].gettCarrera();
                indice = i;
            }
        }
        return indice;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nAtleta;
        String nombre;
        double tCarrera;
        int nAtletas, atletaG;
        
        System.out.println("Cuantos atletas hay? ");
        nAtletas = sc.nextInt();
        
        Atleta corredor [] = new Atleta[nAtletas];
        
        for (int i = 0; i < corredor.length; i++) {
            
            System.out.println("\nDigite las caracteristicas del corredor "  +(i+1)+ ":");
            System.out.println("Numero del dorsal:");
            nAtleta = sc.nextInt();
            sc.nextLine();
            System.out.println("El nombre del atleta:");
            nombre = sc.nextLine();
            System.out.println("Tiempo carrera:");
            tCarrera = sc.nextDouble();
            
            //Para crear con cada iteracion un atleta diferente
            corredor[i] = new Atleta(nAtleta, nombre, tCarrera);
            
        }
        
        atletaG = atletaGanador(corredor);
        
        System.out.println("\nEl ganador es: ");
        System.out.println(corredor[atletaG].mostrarResultados());
    }
}
