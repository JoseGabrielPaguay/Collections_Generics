package co.edu.uniquindio.collections.ejercicio6;

import java.util.HashSet;
import java.util.Set;

/**
 * En un edificio con control de acceso, los empleados deben identificarse mediante un código único
 *     para poder ingresar. Para gestionar estos accesos sin permitir duplicados, se utilizará un HashSet,
 *     donde cada ID de empleado será almacenado y verificado antes de permitir la entrada.
 */
public class Ejercicio {

    private Set<String> empleadosDentro = new HashSet<>();

    /**
     * metodo que registra el ingreso de un empleado
     * @param idEmpleado
     * @return
     */
    public boolean registrarIngreso(String idEmpleado) {
        if (empleadosDentro.add(idEmpleado)) {
            System.out.println(idEmpleado + "acceso permitido");
            return true;
        } else {
            System.out.println(idEmpleado + "acceso denegado, el empleado ya está registrado");
            return false;
        }
    }

    /**
     * metodo que verifica si un empleado está dentro
     * @param idEmpleado
     * @return
     */
    public boolean estaDentro(String idEmpleado) {
        return empleadosDentro.contains(idEmpleado);
    }


    /**
     * metodo que registra la salida de un empleado
     * @param idEmpleado
     * @return
     */
    public boolean registrarSalida(String idEmpleado) {
        if (empleadosDentro.remove(idEmpleado)) {
            System.out.println(idEmpleado + " -> salida registrada");
            return true;
        } else {
            System.out.println(idEmpleado + " -> no estaba registrado dentro");
            return false;
        }
    }

    /**
     * metodo que muestra a los empleados
     */
    public void mostrarEmpleados() {
        System.out.println("Empleados dentro (" + empleadosDentro.size() + "): " + empleadosDentro);
    }
}