package co.edu.uniquindio.collections.ejercicio2;

public class Main {

    public static void main(String[] args) {
        Ejercicio tienda = new Ejercicio();

        tienda.agregar(new Producto("P01", "Teclado", 50.0));
        tienda.agregar(new Producto("P02", "Mouse", 25.5));
        tienda.agregar(new Producto("P03", "Monitor", 300.0));
        tienda.agregar(new Producto("P04", "Audifonos", 80.0));

        System.out.println("Buscar por código P02: " + tienda.buscarPorCodigo("P02"));
        System.out.println("Buscar por nombre 'mon': " + tienda.buscarPorNombre("mon"));

        System.out.println("\n--- Orden alfabético ---");
        tienda.listarAlfabetico();

        System.out.println("\n--- Orden por precio ---");
        tienda.listarPorPrecio();

        System.out.println("\nEliminando P02...");
        tienda.eliminarAgotado("P02");
        tienda.listarAlfabetico();
    }
}