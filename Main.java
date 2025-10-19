import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProcesoProduccion proceso = new ProcesoProduccion();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean continuar = true;

        // Bucle principal del menú
        while (continuar) {
            System.out.println("\n==============================================");
            System.out.println("ESTADO ACTUAL: " + proceso.obtenerEstadoActual() + " 🏭");
            System.out.println("==============================================");
            System.out.println("1. ⏩ Avanzar al siguiente paso del proceso");
            System.out.println("2. 🛑 Salir de la simulación");

            // Verificar si el proceso está en un estado final
            if (proceso.getEstado() instanceof DistribuidoProduccion || proceso.getEstado() instanceof Rechazado) {
                System.out.println("⚠️ EL PROCESO HA FINALIZADO. Seleccione 2 para salir.");
            }

            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese 1 o 2.");
                continue;
            }

            switch (opcion) {
                case 1:
                    // La llamada a avanzar() delega en el estado actual la lógica
                    // de transición y validación.
                    proceso.avanzar();
                    break;
                case 2:
                    continuar = false;
                    System.out.println("Simulación finalizada. 👋");
                    break;
                default:
                    System.out.println("Opción no reconocida. Intente de nuevo.");
            }

            // Si el proceso ha llegado a un estado final, se puede detener el bucle
            if (proceso.getEstado() instanceof DistribuidoProduccion || proceso.getEstado() instanceof Rechazado) {
                continuar = false;
                System.out.println("Automáticamente saliendo del menú ya que el proceso ha finalizado.");
            }
        }
        scanner.close();
    }
}
