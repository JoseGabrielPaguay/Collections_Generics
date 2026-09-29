package co.edu.uniquindio.generics.ejercicio7;

public class Main {

    public static void main(String[] args) {

        IAlmacenable<Integer> numeros = new AlmacenMaximo<>();
        numeros.guardar(15);
        numeros.guardar(42);
        numeros.guardar(7);
        numeros.guardar(30);
        System.out.println("Números: " + numeros);
        System.out.println("Máximo: " + numeros.maximo());


        IAlmacenable<String> nombres = new AlmacenMaximo<>();
        nombres.guardar("Ana");
        nombres.guardar("Luis");
        nombres.guardar("Marta");
        nombres.guardar("Carlos");
        System.out.println("\nNombres: " + nombres);
        System.out.println("Máximo: " + nombres.maximo());


        IAlmacenable<Double> precios = new AlmacenMaximo<>();
        precios.guardar(2.5);
        precios.guardar(9.99);
        precios.guardar(4.0);
        System.out.println("\nPrecios: " + precios);
        System.out.println("Máximo: " + precios.maximo());


        System.out.println();
        IAlmacenable<Integer> vacio = new AlmacenMaximo<>();
        System.out.println("Máximo del vacío: " + vacio.maximo());
    }
}