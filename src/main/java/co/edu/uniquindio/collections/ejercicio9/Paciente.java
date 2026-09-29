package co.edu.uniquindio.collections.ejercicio9;

public class Paciente {

    private String nombre;
    private int gravedad;      //de 1 a 5
    private int ordenLlegada;

    public Paciente(String nombre, int gravedad, int ordenLlegada) {
        this.nombre = nombre;
        this.gravedad = gravedad;
        this.ordenLlegada = ordenLlegada;
    }

    public String getNombre() { return nombre; }
    public int getGravedad() { return gravedad; }
    public int getOrdenLlegada() { return ordenLlegada; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    public void setOrdenLlegada(int ordenLlegada) {
        this.ordenLlegada = ordenLlegada;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", gravedad=" + gravedad +
                ", ordenLlegada=" + ordenLlegada +
                '}';
    }
}
