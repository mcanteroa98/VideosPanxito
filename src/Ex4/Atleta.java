/*
Construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas caracterizados por su número de atleta,
nombre y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganador de la carrera.
 */
package Ex4;

/**
 *
 * @author bataparato
 */
public class Atleta {
    private int nAtleta;
    private String nombre;
    private double tCarrera;

    public Atleta(int nAtleta, String nombre, double tCarrera) {
        this.nAtleta = nAtleta;
        this.nombre = nombre;
        this.tCarrera = tCarrera;
    }

    public double gettCarrera() {
        return tCarrera;
    }
    
    public String mostrarResultados(){
        return "El atleta numero " +nAtleta+ ", " +nombre+ " es el ganador, con un tiempo de " +tCarrera;
    }
}
