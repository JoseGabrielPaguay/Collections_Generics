package co.edu.uniquindio.generics.ejercicio10;

public class Main {

    public static void main(String[] args) {

        Tarea t1 = new Tarea("Enviar correo", 3);
        Tarea t2 = new Tarea("Generar reporte", 5);
        Tarea t3 = new Tarea("Respaldar datos", 3);

        mostrar(t1, t2, Ejercicio.procesar(t1, t2));
        mostrar(t2, t1, Ejercicio.procesar(t2, t1));
        mostrar(t1, t3, Ejercicio.procesar(t1, t3));

    }

    /**
     * metodo que interpreta el resultado de CompareTO
     * @param a
     * @param b
     * @param resultado
     */
    private static void mostrar(Tarea a, Tarea b, int resultado) {
        String relacion;
        if (resultado < 0) {
            relacion = "menor";
        } else if (resultado > 0) {
            relacion = "mayor";
        } else {
            relacion = "igual";
        }
        System.out.println("Resultado: " + resultado + " -> "
                + a.getNombre() + " tiene " + relacion
                + " prioridad que " + b.getNombre() + "\n");
    }
}