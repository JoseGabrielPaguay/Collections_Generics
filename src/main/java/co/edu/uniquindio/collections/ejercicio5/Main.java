package co.edu.uniquindio.collections.ejercicio5;

public class Main {

    public static void main(String[] args) {
        Ejercicio navegador = new Ejercicio();

        navegador.visitar("google.com");
        navegador.visitar("chagepete.com");
        navegador.visitar("github.com");
        navegador.mostrarHistorial();
        System.out.println("Página actual: " + navegador.paginaActual()+"\n");

        navegador.retroceder();
        navegador.retroceder();
        navegador.mostrarHistorial();

        System.out.println();
        navegador.retroceder();
    }
}
