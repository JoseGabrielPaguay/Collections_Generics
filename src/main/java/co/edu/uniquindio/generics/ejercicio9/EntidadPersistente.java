package co.edu.uniquindio.generics.ejercicio9;

/**
 * Clase EntidadPersistente<T extends Number & Comparable<T>>
 *  Crear una clase que almacene un valor T y permita compararlo con otros objetos del mismo tipo.
 * @param <T>
 */
public class EntidadPersistente<T extends Number & Comparable<T>> {

    private T valor;

    public EntidadPersistente(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }


    /**
     * metodo quye compara esta entidad con otra del mismo tipo.
     * Devuelve negativo si es menor, 0 si son iguales, positivo si es mayor
     * @param otra
     * @return
     */
    public int comparar(EntidadPersistente<T> otra) {
        return this.valor.compareTo(otra.valor);
    }


    /**
     * metodo para leer mejor las comparaciones
     * @param otra
     * @return
     */
    public boolean esMayorQue(EntidadPersistente<T> otra) {
        return comparar(otra) > 0;
    }

    /**
     * metodo para leer mejor las comparaciones
     * @param otra
     * @return
     */
    public boolean esMenorQue(EntidadPersistente<T> otra) {
        return comparar(otra) < 0;
    }

    /**
     * metodo para leer mejor las comparaciones
     * @param otra
     * @return
     */
    public boolean esIgualA(EntidadPersistente<T> otra) {
        return comparar(otra) == 0;
    }


    /**
     * metodo que convierte el valor guardado
     * @return
     */
    public double comoDouble() {
        return valor.doubleValue();
    }

    @Override
    public String toString() {
        return "EntidadPersistente[valor=" + valor + "]";
    }
}