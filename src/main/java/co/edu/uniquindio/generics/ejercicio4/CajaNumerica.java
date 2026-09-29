package co.edu.uniquindio.generics.ejercicio4;

/**
 * Clase CajaNumerica<T extends Number>
 *  Crear una clase genérica que almacene un número y tenga un método doble() que devuelva el doble de su valor.
 * @param <T>
 */
public class CajaNumerica<T extends Number> {

    private T valor;

    public CajaNumerica(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    /**
     * metodo que devuelve el doble del valor almacenado
     * @return
     */
    public double doble() {
        return valor.doubleValue() * 2;
    }

    @Override
    public String toString() {
        return "CajaNumerica[valor=" + valor + "]";
    }
}
