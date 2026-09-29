package co.edu.uniquindio.generics.ejercicio1;

public interface IContenedor<T> {
    /**
     * metodo que agrega un elemento al contenedor
     * @param item
     */
    void agregar(T item);

    /**
     * metodo que devuelve el elemnto de la posicion indicada
     * @param indice
     * @return
     */
    T obtener(int indice);
}
