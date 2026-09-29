package co.edu.uniquindio.collections.ejercicio4;

public class Main {

    public static void main(String[] args) {
        Ejercicio editor = new Ejercicio();

        editor.registrarCambio("Escribir 'Hola'");
        editor.registrarCambio("Poner negrita a 'Hola'");
        editor.registrarCambio("Borrar la letra 'a'");
        editor.mostrarHistorial();

        System.out.println("\nDeshaciendo: " + editor.deshacer());
        editor.mostrarHistorial();

        System.out.println("\nDeshaciendo: " + editor.deshacer());
        System.out.println("Deshaciendo: " + editor.deshacer());
        editor.mostrarHistorial();

        System.out.println("\nDeshaciendo: " + editor.deshacer());
    }
}
