package co.edu.uniquindio.generics.ejercicio8;

public class Main {

    public static void main(String[] args) {


        Integer mayorEntero = Ejercicio.imprimirMayor(10, 25);
        System.out.println("Mayor entre 10 y 25: " + mayorEntero);


        Double mayorDecimal = Ejercicio.imprimirMayor(3.5, 2.25);
        System.out.println("Mayor entre 3.5 y 2.25: " + mayorDecimal);


        Long mayorLargo = Ejercicio.imprimirMayor(5000L, 9000L);
        System.out.println("Mayor entre 5000 y 9000: " + mayorLargo);


        System.out.println("Mayor entre 7 y 7: " + Ejercicio.imprimirMayor(7, 7));


        double comoDouble = Ejercicio.imprimirMayor(10, 25).doubleValue();
        System.out.println("El mayor como double: " + comoDouble);

    }
}