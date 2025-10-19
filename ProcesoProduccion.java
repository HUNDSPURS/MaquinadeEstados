/**
 * Clase Contexto que gestiona el estado actual
 * del ciclo de producción y delega las acciones.
 */
public class ProcesoProduccion {
    private Estado estadoActual;

    /**
     * Constructor: Inicializa el proceso en el estado de Recepcion.
     */
    public ProcesoProduccion() {
        // El estado inicial es Recepcion
        this.estadoActual = new Recepcion();
        System.out.println("✅ Proceso de Producción iniciado en estado: " + estadoActual.obtenerNombre());
    }

    /**
     * Permite cambiar el estado actual del proceso.
     * SOLO DEBE SER LLAMADO POR LAS CLASES DE ESTADO.
     * @param nuevoEstado El nuevo estado al que se transiciona.
     */
    public void setEstado(Estado nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    /**
     * Delega la acción de avanzar al estado actual.
     * La lógica de validación de transición está en la clase de estado.
     */
    public void avanzar() {
        this.estadoActual.avanzar(this);
    }

    /**
     * Devuelve el nombre del estado actual.
     * @return El nombre del estado.
     */
    public String obtenerEstadoActual() {
        return estadoActual.obtenerNombre();
    }

    /**
     * Devuelve el objeto estado actual.
     * @return El objeto Estado.
     */
    public Estado getEstado() {
        return estadoActual;
    }
}
