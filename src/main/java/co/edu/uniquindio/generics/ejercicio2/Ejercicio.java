package co.edu.uniquindio.generics.ejercicio2;

/**
 * Método genérico intercambiar
 *  Implementar un método que reciba dos elementos de tipo T e intercambie sus posiciones en un arreglo.
 */
public class Ejercicio {

    /**
     * metodo generico que intercambia posiciones en un arreglo
     * @param arreglo
     * @param i
     * @param j
     * @param <T>
     */
    public static <T> void intercambiar(T[] arreglo, int i, int j) {
        if (i < 0 || j < 0 || i >= arreglo.length || j >= arreglo.length) {
            System.out.println("Posiciones inválidas: " + i + ", " + j);
            return;
        }
        T temporal = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = temporal;
    }
}
