package co.edu.uniquindio.collections.ejercicio8;

import java.util.TreeSet;

public class Ejercicio {
    /**
     *  En una universidad, los nombres de los estudiantes deben mantenerse ordenados alfabéticamente para
     *     facilitar su búsqueda. Para ello, se utilizará un TreeSet, que automáticamente organizará los
     *     nombres de los estudiantes a medida que se agregan y permitirá obtener fácilmente el primer y
     *     el último nombre de la lista.
     */

    private TreeSet<String> estudiantes = new TreeSet<>();

    /**
     * metodo que agrega un estudiante- orden alfabetico
     * @param nombre
     * @return
     */
    public boolean agregarEstudiante(String nombre) {
        if (estudiantes.add(nombre)) {
            System.out.println("Agregado: " + nombre);
            return true;
        } else {
            System.out.println("Ya estaba registrado: " + nombre);
            return false;
        }
    }

    /**
     * metodo que obtiene el primer nombre en orden alfabetico
     * @return
     */
    public String primero() {
        if (estudiantes.isEmpty()) {
            return null;
        }
        return estudiantes.first();
    }


    /**
     * metodo que obtiene el ultimo nombre del orden alfabetico
     * @return
     */
    public String ultimo() {
        if (estudiantes.isEmpty()) {
            return null;
        }
        return estudiantes.last();
    }

    // Buscar si un estudiante está registrado

    /**
     * metodo que busca si un estudiante está registrado
     * @param nombre
     * @return
     */
    public boolean existe(String nombre) {
        return estudiantes.contains(nombre);
    }

    /**
     * metodo que muestra la lista ordenada
     */
    public void mostrarEstudiantes() {
        System.out.println("Estudiantes (" + estudiantes.size() + "): " + estudiantes);
    }
}
