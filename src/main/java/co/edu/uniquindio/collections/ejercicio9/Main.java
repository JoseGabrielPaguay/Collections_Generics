package co.edu.uniquindio.collections.ejercicio9;

public class Main {

    public static void main(String[] args) {
        Ejercicio hospital = new Ejercicio();

        hospital.ingresarPaciente("Juan", 2);
        hospital.ingresarPaciente("Laura", 5);
        hospital.ingresarPaciente("Pedro", 3);
        hospital.ingresarPaciente("Elena", 4);
        hospital.ingresarPaciente("Sofia", 5);

        System.out.println("\nEn espera: " + hospital.pacientesEnEspera());
        System.out.println("Próximo a atender: " + hospital.proximo());

        System.out.println("\n--- Atendiendo ---");
        while (hospital.pacientesEnEspera() > 0) {
            System.out.println("Atendiendo a: " + hospital.atender());
        }

        System.out.println();
        hospital.atender();
    }
}
