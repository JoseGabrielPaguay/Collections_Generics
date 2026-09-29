package co.edu.uniquindio.generics.ejercicio8;

/**
 * Método imprimirMayor<T extends Number & Comparable<T>>
 *  Implementar un método que reciba dos números comparables y devuelva el mayor.
 */
public class Ejercicio {

    /**
     * metodo que retorna el mayor qu extiende de number y de comparable
     * @param a
     * @param b
     * @return
     * @param <T>
     */
    public static <T extends Number & Comparable<T>> T imprimirMayor(T a, T b) {
        if (a.compareTo(b) >= 0) {
            return a;
        }
        return b;
    }
}