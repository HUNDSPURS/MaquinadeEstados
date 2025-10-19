public class Almacenado implements Estado {
    @Override
    public void avanzar(ProcesoProduccion proceso) {
        // Transición válida: Almacenado -> DistribuidoProduccion
        proceso.setEstado(new DistribuidoProduccion());
        System.out.println("➡️ Transición Válida: Almacenado -> DistribuidoProduccion");
    }

    @Override
    public String obtenerNombre() {
        return "Almacenado";
    }
}