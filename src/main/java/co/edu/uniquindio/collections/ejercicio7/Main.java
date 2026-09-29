package co.edu.uniquindio.collections.ejercicio7;

public class Main {

    public static void main(String[] args) {
        Ejercicio musica = new Ejercicio();

        musica.agregarFavorita("Canción C");
        musica.agregarFavorita("Canción A");
        musica.agregarFavorita("Canción B");
        musica.agregarFavorita("Canción A");
        musica.mostrarFavoritas();

        System.out.println("\n¿Canción B es favorita? " + musica.esFavorita("Canción B"));
        System.out.println("¿Canción D es favorita? " + musica.esFavorita("Canción D"));

        System.out.println();
        musica.quitarFavorita("Canción A");
        musica.quitarFavorita("Canción A");
        musica.mostrarFavoritas();
    }
}