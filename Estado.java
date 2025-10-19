/**
 * Interfaz que define la estructura para todos los estados
 * del ciclo de producción.
 */
public interface Estado {
    /**
     * Lógica para avanzar al siguiente estado.
     * @param proceso El objeto ProcesoProduccion cuyo estado se va a cambiar.
     */
    void avanzar(ProcesoProduccion proceso);

    /**
     * Obtiene el nombre del estado actual.
     * @return El nombre del estado.
     */
    String obtenerNombre();
}
