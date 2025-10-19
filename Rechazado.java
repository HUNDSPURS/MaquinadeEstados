public class Rechazado implements Estado {
    @Override
    public void avanzar(ProcesoProduccion proceso) {
        // Estado final de rechazo: No se puede avanzar más
        System.out.println("🚫 Proceso RECHAZADO. El ciclo de producción ha finalizado aquí.");
    }

    @Override
    public String obtenerNombre() {
        return "Rechazado";
    }
}