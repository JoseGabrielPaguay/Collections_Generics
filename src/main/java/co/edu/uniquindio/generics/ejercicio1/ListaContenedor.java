package co.edu.uniquindio.generics.ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 * Interfaz genérica Contenedor<T>
 *  Definir una interfaz con métodos agregar(T item) y obtener(int indice).
 *  Implementarla con una clase ListaContenedor<T>.
 * @param <T>
 */
public class ListaContenedor<T> implements IContenedor<T> {
    private List<T> elementos = new ArrayList<>();

    @Override
    public void agregar(T item) {
        elementos.add(item);
    }

    @Override
    public T obtener(int indice) {
        if (indice < 0 || indice >= elementos.size()) {
            System.out.println("Índice fuera de rango: " + indice);
            return null;
        }
        return elementos.get(indice);
    }

    /**
     * método para ver cuantos elementos hay
     * @return
     */
    public int tamano() {
        return elementos.size();
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}
