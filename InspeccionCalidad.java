public class InspeccionCalidad implements Estado {
    @Override
    public void avanzar(ProcesoProduccion proceso) {
        // En este punto, se debe decidir si el material es apto (CorteDimensionado)
        // o si es Rechazado. Se simulará una elección:

        System.out.println("\n¿Producto apto después de Inspección? (s/n)");
        // Usar un Scanner para la simulación
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            String eleccion = scanner.nextLine().trim().toLowerCase();

            if ("s".equals(eleccion)) {
                // Transición válida: InspeccionCalidad -> CorteDimensionado
                proceso.setEstado(new CorteDimensionado());
                System.out.println("➡️ Transición Válida: InspeccionCalidad -> CorteDimensionado (Aprobado)");
            } else if ("n".equals(eleccion)) {
                // Transición válida: InspeccionCalidad -> Rechazado
                proceso.setEstado(new Rechazado());
                System.out.println("❌ Transición Válida: InspeccionCalidad -> Rechazado (No apto)");
            } else {
                System.out.println("🚫 Entrada inválida. El proceso permanece en: " + obtenerNombre());
            }
        } catch (java.util.NoSuchElementException e) {
            System.out.println("🚫 No se pudo obtener la entrada. El proceso permanece en: " + obtenerNombre());
        }
    }

    @Override
    public String obtenerNombre() {
        return "InspeccionCalidad";
    }
}
