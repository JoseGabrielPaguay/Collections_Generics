package co.edu.uniquindio.generics.ejercicio9;

public class Main {

    public static void main(String[] args) {


        EntidadPersistente<Integer> e1 = new EntidadPersistente<>(10);
        EntidadPersistente<Integer> e2 = new EntidadPersistente<>(25);
        EntidadPersistente<Integer> e3 = new EntidadPersistente<>(10);

        System.out.println(e1 + " vs " + e2);
        System.out.println("comparar: " + e1.comparar(e2));
        System.out.println("¿e1 mayor que e2? " + e1.esMayorQue(e2));
        System.out.println("¿e1 menor que e2? " + e1.esMenorQue(e2));
        System.out.println("¿e1 igual a e3? " + e1.esIgualA(e3));


        EntidadPersistente<Double> d1 = new EntidadPersistente<>(3.5);
        EntidadPersistente<Double> d2 = new EntidadPersistente<>(2.25);

        System.out.println("\n" + d1 + " vs " + d2);
        System.out.println("¿d1 mayor que d2? " + d1.esMayorQue(d2));
        System.out.println("d1 como double: " + d1.comoDouble());


        EntidadPersistente<Long> l1 = new EntidadPersistente<>(5000L);
        EntidadPersistente<Long> l2 = new EntidadPersistente<>(9000L);

        System.out.println("\n" + l1 + " vs " + l2);
        System.out.println("¿l1 menor que l2? " + l1.esMenorQue(l2));

    }
}