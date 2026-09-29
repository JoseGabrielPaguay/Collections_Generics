package co.edu.uniquindio.collections.ejercicio3;

public class Main {

    public static void main(String[] args) {
        Ejercicio banco = new Ejercicio();

        banco.agregarCliente("Ana");
        banco.agregarCliente("Luis");
        banco.agregarCliente("Marta");
        banco.mostrarFila();

        System.out.println("\nLlega un cliente urgente...");
        banco.agregarUrgente("Carlos");
        banco.mostrarFila();

        System.out.println("\nAtendiendo a: " + banco.atender());
        System.out.println("Atendiendo a: " + banco.atender());
        banco.mostrarFila();
    }
}
