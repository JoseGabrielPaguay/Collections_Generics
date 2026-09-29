package co.edu.uniquindio.collections.ejercicio5;
import java.util.Stack;

/**
 *  En la navegación web, los usuarios necesitan poder retroceder a páginas anteriores.
 *     Para este propósito, se usará un Stack, que funciona como una pila LIFO (Last In, First Out).
 *     Cada vez que el usuario visite una nueva página, esta se añadirá a la pila, y cuando decida
 *     volver atrás, se eliminará la última página visitada para regresar a la anterior.
 */
public class Ejercicio {

    private Stack<String> historial = new Stack<>();

    /**
     * metodo para visitar una pagina nueva
     * @param pagina
     */
    public void visitar(String pagina) {
        historial.push(pagina);
        System.out.println("Visitando: " + pagina);
    }

    /**
     * metodo que retrocede a la pagina anterior
     */
    public void retroceder() {
        if (historial.size() <= 1) {
            System.out.println("No hay páginas anteriores.");
            return;
        }
        historial.pop();
        System.out.println("Volviste a: " + historial.peek());
    }


    /**
     * metodo para ver la pagina actual sin sacarla de la pila
     * @return
     */
    public String paginaActual() {
        if (historial.isEmpty()) {
            return null;
        }
        return historial.peek();
    }

    /**
     * metodo que muestra todo el historial
     */
    public void mostrarHistorial() {
        System.out.println("Historial: " + historial);
    }
}
