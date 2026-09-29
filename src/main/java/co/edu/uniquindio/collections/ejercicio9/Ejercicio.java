package co.edu.uniquindio.collections.ejercicio9;
import java.util.PriorityQueue;

/**
 * En un hospital, los pacientes deben ser atendidos según la gravedad de su condición, con los más
 *     urgentes siendo tratados primero. Para manejar esto, se implementará una PriorityQueue, donde cada
 *     paciente será ingresado con un nivel de prioridad y el sistema garantizará que aquellos con mayor
 *     urgencia sean atendidos antes que los demás.
 */
public class Ejercicio {

    private PriorityQueue<Paciente> cola = new PriorityQueue<>((a, b) -> {
        int porGravedad = Integer.compare(b.getGravedad(), a.getGravedad());
        if (porGravedad != 0) {
            return porGravedad;
        }
        return Integer.compare(a.getOrdenLlegada(), b.getOrdenLlegada());
    });

    private int contadorLlegadas = 0;

    /**
     * metodo para ingresar a un paciente por su nivel de gravedad
     * @param nombre
     * @param gravedad
     */
    public void ingresarPaciente(String nombre, int gravedad) {
        if (gravedad < 1 || gravedad > 5) {
            System.out.println("Gravedad inválida para " + nombre + " (debe ser de 1 a 5)");
            return;
        }
        contadorLlegadas++;
        cola.offer(new Paciente(nombre, gravedad, contadorLlegadas));
        System.out.println("Ingresó: " + nombre + " (gravedad " + gravedad + ")");
    }

    /**
     * metodo que ateidne al paciente mas urgente (lo saca de la cola)
     * @return
     */
    public Paciente atender() {
        if (cola.isEmpty()) {
            System.out.println("No hay pacientes en espera.");
            return null;
        }
        return cola.poll();
    }

    /**
     * metodo que permite ver quien seria el proximo paciente
     * @return
     */
    public Paciente proximo() {
        return cola.peek();
    }

    /**
     * metodo que muestra los pacientes en espera
     * @return
     */
    public int pacientesEnEspera() {
        return cola.size();
    }
}
