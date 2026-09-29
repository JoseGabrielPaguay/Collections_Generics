package co.edu.uniquindio.generics.ejercicio10;

public class Tarea implements Runnable, Comparable<Tarea> {

    private String nombre;
    private int prioridad;

    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public String getNombre() { return nombre; }
    public int getPrioridad() { return prioridad; }


    @Override
    public void run() {
        System.out.println("Ejecutando: " + nombre + " (prioridad " + prioridad + ")");
    }

    /**
     * metodo que compara por prioridad
     * @param otra the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Tarea otra) {
        return Integer.compare(this.prioridad, otra.prioridad);
    }

    @Override
    public String toString() {
        return nombre + " (prioridad " + prioridad + ")";
    }
}
