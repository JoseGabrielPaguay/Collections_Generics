package co.edu.uniquindio.collections.ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * En una tienda se necesita una aplicación para gestionar el inventario de
 *     productos(codigo, nombre, precio), permitiendo agregar nuevos artículos, eliminar los que
 *     están agotados, buscar productos específicos y listar todo el inventario en orden alfabético
 *     y por orden de precio. Para ello, se utilizará una ArrayList, que ofrece acceso rápido a los
 *     elementos y permite su manipulación de manera eficiente.
 */
public class Ejercicio {

    private List<Producto> inventario = new ArrayList<>();

    /**
     * Agregar un producto nuevo sin codigos repetidos
     * @param p
     */
    public void agregar(Producto p) {
        if (buscarPorCodigo(p.getCodigo()) != null) {
            System.out.println("Ya existe un producto con el código " + p.getCodigo());
            return;
        }
        inventario.add(p);
    }

    /**
     * Eleminar un producto por codigo
     * @param codigo
     * @return
     */
    public boolean eliminarAgotado(String codigo) {
        return inventario.removeIf(p -> p.getCodigo().equalsIgnoreCase(codigo));
    }


    /**
     * Buiscar producto por codigo
     * @param codigo
     * @return
     */
    public Producto buscarPorCodigo(String codigo) {
        for (Producto p : inventario) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }


    /**
     * Buscar productos por texto contenido
     * @param texto
     * @return
     */
    public List<Producto> buscarPorNombre(String texto) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : inventario) {
            if (p.getNombre().toLowerCase().contains(texto.toLowerCase())) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    /**
     * Listar productos por orden alfabetico
     */
    public void listarAlfabetico() {
        List<Producto> copia = new ArrayList<>(inventario);
        copia.sort(Comparator.comparing(Producto::getNombre, String.CASE_INSENSITIVE_ORDER));
        for (Producto p : copia) {
            System.out.println(p);
        }
    }


    /**
     * Listar por precio-mayor a menor
     */
    public void listarPorPrecio() {
        List<Producto> copia = new ArrayList<>(inventario);
        copia.sort(Comparator.comparingDouble(Producto::getPrecio));
        for (Producto p : copia) {
            System.out.println(p);
        }
    }
}