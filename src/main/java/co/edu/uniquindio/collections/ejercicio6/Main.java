package co.edu.uniquindio.collections.ejercicio6;

public class Main {

    public static void main(String[] args) {
        Ejercicio edificio = new Ejercicio();

        edificio.registrarIngreso("EMP001");
        edificio.registrarIngreso("EMP002");
        edificio.registrarIngreso("EMP001");
        edificio.registrarIngreso("EMP003");
        edificio.mostrarEmpleados();

        System.out.println("\n¿EMP002 está dentro? " + edificio.estaDentro("EMP002"));
        System.out.println("¿EMP999 está dentro? " + edificio.estaDentro("EMP004"));

        System.out.println();
        edificio.registrarSalida("EMP002");
        edificio.registrarSalida("EMP002");
        edificio.mostrarEmpleados();
    }
}