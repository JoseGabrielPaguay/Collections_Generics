package co.edu.uniquindio.generics.ejercicio3;

public class Main {

    public static void main(String[] args) {

        Par<String> nombres = new Par<>("Ana", "Ana");
        System.out.println(nombres + " -> ¿iguales? " + nombres.sonIguales());

        Par<String> distintos = new Par<>("Ana", "Luis");
        System.out.println(distintos + " -> ¿iguales? " + distintos.sonIguales());

        Par<Integer> numeros = new Par<>(10, 10);
        System.out.println(numeros + " -> ¿iguales? " + numeros.sonIguales());

        Par<Integer> otros = new Par<>(10, 20);
        System.out.println(otros + " -> ¿iguales? " + otros.sonIguales());

        Par<Double> precios = new Par<>(2.5, 2.5);
        System.out.println(precios + " -> ¿iguales? " + precios.sonIguales());

        Par<String> nulos = new Par<>(null, null);
        System.out.println(nulos + " -> ¿iguales? " + nulos.sonIguales());
    }
}
