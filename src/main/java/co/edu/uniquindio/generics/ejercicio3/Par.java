package co.edu.uniquindio.generics.ejercicio3;
import java.util.Objects;

/**
 * Clase Par<T>
 *  Implementar una clase que guarde dos valores de tipo T y un método para verificar si ambos son iguales.
 * @param <T>
 */
public class Par<T> {

    private T primero;
    private T segundo;

    public Par(T primero, T segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    /**
     * metodo que verifica si ambos valores son iguales
     * @return
     */
    public boolean sonIguales() {
        return Objects.equals(primero, segundo);
    }

    public T getPrimero() {
        return primero;
    }

    public T getSegundo() {
        return segundo;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }

    public void setSegundo(T segundo) {
        this.segundo = segundo;
    }


    @Override
    public String toString() {
        return "(" + primero + ", " + segundo + ")";
    }
}
