package co.edu.uniquindio.generics.ejercicio7;

public interface IAlmacenable<T extends Comparable<T>> {

    /**
     * metodo que guarda un elemento
     * @param item
     */
    void guardar(T item);


    /**
     * metodo que devuelve el mayor de los elementos guardados
     * @return
     */
    T maximo();
}
