package co.edu.uniquindio.generics.ejercicio5;

/**
 * Método genérico sumar<T extends Number>
 *  Implementar un método que reciba dos parámetros de tipo T y devuelva la suma como double.
 */
public class Ejercicio {

    /**
     * metodo generico con limite, T solo puede ser numerico, devuelve la suma entre dos valores como double
     *
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T extends Number> double sumar(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}