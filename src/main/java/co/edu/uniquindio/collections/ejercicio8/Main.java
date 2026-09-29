package co.edu.uniquindio.collections.ejercicio8;

public class Main {

    public static void main(String[] args) {
        Ejercicio universidad = new Ejercicio();

        universidad.agregarEstudiante("Sofia");
        universidad.agregarEstudiante("Andres");
        universidad.agregarEstudiante("Mariana");
        universidad.agregarEstudiante("Zoe");
        universidad.agregarEstudiante("Camilo");
        universidad.agregarEstudiante("Andres");
        universidad.mostrarEstudiantes();

        System.out.println("\nPrimero: " + universidad.primero());
        System.out.println("Último : " + universidad.ultimo());

        System.out.println("\n¿Existe Mariana? " + universidad.existe("Mariana"));
        System.out.println("¿Existe Julian? "+ universidad.existe("Julian"));
    }
}
