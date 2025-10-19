public class CorteDimensionado implements Estado {
    @Override
    public void avanzar(ProcesoProduccion proceso) {
        // Transición válida: CorteDimensionado -> SecadoTratamiento
        proceso.setEstado(new SecadoTratamiento());
        System.out.println("➡️ Transición Válida: CorteDimensionado -> SecadoTratamiento");
    }

    @Override
    public String obtenerNombre() {
        return "CorteDimensionado";
    }
}
