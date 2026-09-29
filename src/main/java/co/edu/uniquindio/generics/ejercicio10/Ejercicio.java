package co.edu.uniquindio.generics.ejercicio10;

public class Ejercicio {

    // Límite múltiple con dos interfaces: T debe ser Runnable Y Comparable<T>
    // Primero ejecuta el run() de "a" y después lo compara con "b"

    /**
     * metodo que primero ejecuta el run() de "a"y despues lo compara con "b".
     * Limite multiple con dos interfaces T- runable y comparable
     * @param a
     * @param b
     * @return
     * @param <T>
     */
    public static <T extends Runnable & Comparable<T>> int procesar(T a, T b) {
        a.run();
        return a.compareTo(b);
    }
}