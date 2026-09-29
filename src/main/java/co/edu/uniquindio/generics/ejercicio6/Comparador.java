package co.edu.uniquindio.generics.ejercicio6;

/**
 * Clase Comparador<T extends Comparable<T>>
 *  Crear una clase genérica con un método mayor(T a, T b) que devuelva el mayor entre dos elementos comparables.
 * @param <T>
 */
public class Comparador<T extends Comparable<T>> {

    /**
     * metodo que devuelve el mayor entre a y b, si son iguales devuelve a
     * @param a
     * @param b
     * @return
     */
    public T mayor(T a, T b) {
        if (a.compareTo(b) >= 0) {
            return a;
        }
        return b;
    }
}