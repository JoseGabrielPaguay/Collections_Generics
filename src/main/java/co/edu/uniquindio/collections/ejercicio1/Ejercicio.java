package co.edu.uniquindio.collections.ejercicio1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Crear una lista de productos de tipo HashMap, otra lista de tipo LinkedHashMap y otra de tipo
 *      TreeMap y explicar las diferencias de cada una.
 */
public class Ejercicio {

    private Map<String, Double> hashMap = new HashMap<>();
    private Map<String, Double> linkedHashMap = new LinkedHashMap<>();
    private Map<String, Double> treeMap = new TreeMap<>();

    /**
     * agrega el mismo producto a las 3 estructuras
     * @param nombre
     * @param precio
     */
    public void agregarProducto(String nombre, double precio) {
        hashMap.put(nombre, precio);
        linkedHashMap.put(nombre, precio);
        treeMap.put(nombre, precio);
    }

    public void mostrarHashMap() {
        System.out.println("HashMap       : " + hashMap);
    }

    public void mostrarLinkedHashMap() {
        System.out.println("LinkedHashMap : " + linkedHashMap);
    }

    public void mostrarTreeMap() {
        System.out.println("TreeMap       : " + treeMap);
    }
}

