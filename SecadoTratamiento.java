public class SecadoTratamiento implements Estado {
    @Override
    public void avanzar(ProcesoProduccion proceso) {
        // Transición válida: SecadoTratamiento -> Almacenado
        proceso.setEstado(new Almacenado());
        System.out.println("➡️ Transición Válida: SecadoTratamiento -> Almacenado");
    }

    @Override
    public String obtenerNombre() {
        return "SecadoTratamiento";
    }
}
