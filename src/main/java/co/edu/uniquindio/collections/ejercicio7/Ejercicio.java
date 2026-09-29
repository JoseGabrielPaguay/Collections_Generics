package co.edu.uniquindio.collections.ejercicio7;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * En una aplicación de música, los usuarios pueden marcar canciones como favoritas. Para garantizar
 *     que las canciones favoritas se mantengan en el orden en que fueron añadidas sin permitir duplicados,
 *     se empleará un LinkedHashSet, el cual conservará la secuencia de inserción y asegurará que no haya
 *     repeticiones.
 */
public class Ejercicio {

    private Set<String> favoritas = new LinkedHashSet<>();

    /**
     * metodo que marca una cancion como favorita
     * @param cancion
     * @return
     */
    public boolean agregarFavorita(String cancion) {
        if (favoritas.add(cancion)) {
            System.out.println("Agregada a favoritas: " + cancion);
            return true;
        } else {
            System.out.println("Ya estaba en favoritas: " + cancion);
            return false;
        }
    }

    /**
     * metodo que quita una cancion favorita
     * @param cancion
     * @return
     */
    public boolean quitarFavorita(String cancion) {
        if (favoritas.remove(cancion)) {
            System.out.println("Quitada de favoritas: " + cancion);
            return true;
        } else {
            System.out.println("No estaba en favoritas: " + cancion);
            return false;
        }
    }

    /**
     * metodo que verifica si una cancion está en favoritos
     * @param cancion
     * @return
     */
    public boolean esFavorita(String cancion) {
        return favoritas.contains(cancion);
    }

    /**
     * meotod que muestra las cancniones favoritas en orden de insecion
     */
    public void mostrarFavoritas() {
        System.out.println("Favoritas (" + favoritas.size() + "): " + favoritas);
    }
}
