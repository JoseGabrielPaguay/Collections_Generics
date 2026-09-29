package co.edu.uniquindio.generics.ejercicio6;

public class Main{

    public static void main(String[] args) {


        Comparador<Integer> compEnteros = new Comparador<>();
        System.out.println("Mayor entre 10 y 25: " + compEnteros.mayor(10, 25));


        Comparador<Double> compDecimales = new Comparador<>();
        System.out.println("Mayor entre 3.5 y 2.25: " + compDecimales.mayor(3.5, 2.25));


        Comparador<String> compTextos = new Comparador<>();
        System.out.println("Mayor entre Ana y Luis: " + compTextos.mayor("Ana", "Luis"));


        Comparador<Character> compLetras = new Comparador<>();
        System.out.println("Mayor entre 'a' y 'z': " + compLetras.mayor('a', 'z'));


        System.out.println("Mayor entre 7 y 7: " + compEnteros.mayor(7, 7));


    }
}
