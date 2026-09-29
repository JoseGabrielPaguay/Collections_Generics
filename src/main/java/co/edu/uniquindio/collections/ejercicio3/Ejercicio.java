package co.edu.uniquindio.collections.ejercicio3;
import java.util.LinkedList;

/**
 * En un banco, el sistema de atención al cliente debe manejar los turnos de manera ordenada.
 *     Para lograrlo, se empleará una LinkedList (String), la cual permitirá agregar clientes en
 *     la cola de espera, atender al primero en la lista y ofrecer una funcionalidad especial para
 *     insertar clientes con urgencia al inicio de la cola sin afectar el rendimiento.
 */
public class Ejercicio {

    private LinkedList<String> fila = new LinkedList<>();

    /**
     * agregar al final de la cola
     * @param nombre
     */
    public void agregarCliente(String nombre) {
        fila.addLast(nombre);
    }


    /**
     * agregar un cleinte al inicio
     * @param nombre
     */
    public void agregarUrgente(String nombre) {
        fila.addFirst(nombre);
    }

    /**
     * metodo para atender al primero de la cola y lo saca de la lista
     * @return
     */
    public String atender() {
        if (fila.isEmpty()) {
            System.out.println("No hay clientes en espera.");
            return null;
        }
        return fila.pollFirst();
    }

    /**
     * mostrar la lista
     */
    public void mostrarFila() {
        System.out.println("Cola actual: " + fila);
    }
}
