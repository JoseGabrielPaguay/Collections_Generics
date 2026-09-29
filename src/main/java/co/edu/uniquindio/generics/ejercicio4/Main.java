package co.edu.uniquindio.generics.ejercicio4;

public class Main {

    public static void main(String[] args) {

        CajaNumerica<Integer> cajaEntera = new CajaNumerica<>(10);
        System.out.println(cajaEntera + " -> doble: " + cajaEntera.doble());

        CajaNumerica<Double> cajaDecimal = new CajaNumerica<>(3.5);
        System.out.println(cajaDecimal + " -> doble: " + cajaDecimal.doble());

        CajaNumerica<Long> cajaLarga = new CajaNumerica<>(5000L);
        System.out.println(cajaLarga + " -> doble: " + cajaLarga.doble());

        CajaNumerica<Float> cajaFloat = new CajaNumerica<>(2.5f);
        System.out.println(cajaFloat + " -> doble: " + cajaFloat.doble());
    }
}