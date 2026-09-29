package co.edu.uniquindio.generics.ejercicio5;

public class Main {

    public static void main(String[] args) {


        double suma1 = Ejercicio.sumar(10, 20);
        System.out.println("10 + 20 = " + suma1);


        double suma2 = Ejercicio.sumar(3.5, 2.25);
        System.out.println("3.5 + 2.25 = " + suma2);


        double suma3 = Ejercicio.sumar(5000L, 2500L);
        System.out.println("5000 + 2500 = " + suma3);


        double suma4 = Ejercicio.sumar(1.5f, 2.5f);
        System.out.println("1.5 + 2.5 = " + suma4);

    }
}