package co.edu.uniquindio.collections.ejercicio4;
import java.util.Vector;

/**
 * Un editor de texto necesita registrar los cambios recientes para que el usuario pueda deshacerlos
 *     cuando sea necesario. Para este caso, se utilizará un Vector, ya que permite almacenar los cambios
 *     de forma segura en entornos concurrentes. Se deberá implementar una función de "deshacer" que elimine
 *     el último cambio realizado, asegurando que se mantenga un historial de modificaciones.
 */
public class Ejercicio {

    private Vector<String> historial = new Vector<>();

    /**
     * metodo que registra un cambio al final
     * @param cambio
     */
    public void registrarCambio(String cambio) {
        historial.add(cambio);
    }

    /**
     * metodo para deshacer, elimina y devulve el ultimo cambio realizado
     * @return
     */
    public String deshacer() {
        if (historial.isEmpty()) {
            System.out.println("No hay cambios para deshacer.");
            return null;
        }
        return historial.remove(historial.size() - 1);
    }

    /**
     * metodo que muestra el hisotiral
     */
    public void mostrarHistorial() {
        System.out.println("Historial: " + historial);
    }
}
