package co.edu.uniquindio.collections.ejercicio1;

public class Main {

    public static void main(String[] args) {
        Ejercicio ejercicio = new Ejercicio();

        ejercicio.agregarProducto("Teclado", 50.0);
        ejercicio.agregarProducto("Mouse", 25.5);
        ejercicio.agregarProducto("Monitor", 300.0);
        ejercicio.agregarProducto("Audifonos", 80.0);
        ejercicio.agregarProducto("Camara", 60.0);

        ejercicio.mostrarHashMap();
        ejercicio.mostrarLinkedHashMap();
        ejercicio.mostrarTreeMap();
    }

    //El LinkedHashMap mantiene el orden de inserción de tus productos ("Teclado" primero, "Camara" al final).
    //El TreeMap los ordena alfabéticamente por su nombre ("Audifonos" pasa al inicio)
    //El HashMap los mezcla en un orden caótico e impredecible porque prioriza la velocidad de búsqueda
}