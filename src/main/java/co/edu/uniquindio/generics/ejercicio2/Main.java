package co.edu.uniquindio.generics.ejercicio2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] nombres = {"Ana", "Luis", "Marta", "Carlos"};
        System.out.println("Antes : " + Arrays.toString(nombres));
        Ejercicio.intercambiar(nombres, 0, 3);
        System.out.println("Después: " + Arrays.toString(nombres));

        Integer[] numeros = {10, 20, 30, 40, 50};
        System.out.println("\nAntes : " + Arrays.toString(numeros));
        Ejercicio.intercambiar(numeros, 1, 4);
        System.out.println("Después: " + Arrays.toString(numeros));

        Double[] precios = {1.5, 2.5, 3.5};
        System.out.println("\nAntes : " + Arrays.toString(precios));
        Ejercicio.intercambiar(precios, 0, 2);
        System.out.println("Después: " + Arrays.toString(precios));

        System.out.println();
        Ejercicio.intercambiar(nombres, 0, 9);
    }
}