package co.edu.uniquindio.generics.ejercicio7;
import java.util.ArrayList;
import java.util.List;

/**
 * Interfaz genérica Almacenable<T extends Comparable<T>>
 *  Definir una interfaz con métodos guardar(T item) y maximo(). Implementar en una clase que calcule el mayor elemento almacenado.
 * @param <T>
 */
public class AlmacenMaximo<T extends Comparable<T>> implements IAlmacenable<T> {

    private List<T> elementos = new ArrayList<>();

    @Override
    public void guardar(T item) {
        elementos.add(item);
    }

    @Override
    public T maximo() {
        if (elementos.isEmpty()) {
            System.out.println("No hay elementos guardados.");
            return null;
        }

        T mayor = elementos.get(0);
        for (T elemento : elementos) {
            if (elemento.compareTo(mayor) > 0) {
                mayor = elemento;
            }
        }
        return mayor;
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}
