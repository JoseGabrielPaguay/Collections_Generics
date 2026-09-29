package co.edu.uniquindio.generics.ejercicio1;

public class Main {

    public static void main(String[] args) {


        IContenedor<String> nombres = new ListaContenedor<>();
        nombres.agregar("Ana");
        nombres.agregar("Luis");
        nombres.agregar("Marta");

        System.out.println("Nombres: " + nombres);
        System.out.println("Posición 1: " + nombres.obtener(1));


        IContenedor<Integer> numeros = new ListaContenedor<>();
        numeros.agregar(10);
        numeros.agregar(20);
        numeros.agregar(30);

        System.out.println("\nNúmeros: " + numeros);
        System.out.println("Posición 2: " + numeros.obtener(2));

        int suma = numeros.obtener(0) + numeros.obtener(1);
        System.out.println("Suma de las posiciones 0 y 1: " + suma);

        System.out.println("\nPosición 9: " + nombres.obtener(9));
    }
}