public class DistribuidoProduccion implements Estado {
    @Override
    public void avanzar(ProcesoProduccion proceso) {
        // Estado final: No se puede avanzar más
        System.out.println("🚫 Proceso TERMINADO y Distribuido. No se puede avanzar más.");
    }

    @Override
    public String obtenerNombre() {
        return "DistribuidoProduccion";
    }
}
