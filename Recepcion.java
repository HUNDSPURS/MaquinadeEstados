public class Recepcion implements Estado {
    @Override
    public void avanzar(ProcesoProduccion proceso) {
        // En la recepción, el usuario debe decidir si inspeccionar o rechazar de inmediato
        // Para simplificar el ejemplo, asumiremos que siempre va a InspeccionCalidad por defecto.
        // En un sistema real, se pediría la entrada del usuario aquí.

        // Transición válida: Recepcion -> InspeccionCalidad
        proceso.setEstado(new InspeccionCalidad());
        System.out.println("➡️ Transición Válida: Recepcion -> InspeccionCalidad");
    }

    @Override
    public String obtenerNombre() {
        return "Recepcion";
    }
}
