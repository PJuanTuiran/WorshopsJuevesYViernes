import java.util.Scanner;

public class Taller {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Capacidad máxima: ");
        int capacidadMaxima = Integer.parseInt(entrada.nextLine().trim());

        System.out.print("Trabajos a registrar: ");
        int numeroTrabajos = Integer.parseInt(entrada.nextLine().trim());

        if (numeroTrabajos > capacidadMaxima) {
            System.out.println("Excede la capacidad.");
            return;
        }

        String[][][] registroTrabajos = new String[capacidadMaxima][2][4];

        for (int i = 0; i < numeroTrabajos; i++) {
            System.out.print("Nombre del empleado: ");
            String nombreEmpleado = entrada.nextLine().trim();

            String tipoVehiculo;
            while (true) {
                System.out.print("Tipo de vehículo (Moto/Carro): ");
                tipoVehiculo = entrada.nextLine().trim().toLowerCase();
                if (tipoVehiculo.equals("moto") || tipoVehiculo.equals("carro")) {
                    break;
                } else {
                    System.out.println("Inválido. 'Moto' o 'Carro'.");
                }
            }

            int indiceTipo = tipoVehiculo.equals("moto") ? 0 : 1;

            System.out.print("Marca: ");
            String marcaVehiculo = entrada.nextLine().trim();

            System.out.print("Modelo: ");
            String modeloVehiculo = entrada.nextLine().trim();

            System.out.print("Año: ");
            String añoVehiculo = entrada.nextLine().trim();

            String estadoVehiculo;
            while (true) {
                System.out.print("Estado (Pendiente, En reparación, Reparado): ");
                estadoVehiculo = entrada.nextLine().trim();
                if (estadoVehiculo.equalsIgnoreCase("Pendiente") || estadoVehiculo.equalsIgnoreCase("En reparación") || estadoVehiculo.equalsIgnoreCase("Reparado")) {
                    break;
                } else {
                    System.out.println("Inválido. 'Pendiente', 'En reparación' o 'Reparado'.");
                }
            }

            registroTrabajos[i][indiceTipo][0] = marcaVehiculo;
            registroTrabajos[i][indiceTipo][1] = modeloVehiculo;
            registroTrabajos[i][indiceTipo][2] = añoVehiculo;
            registroTrabajos[i][indiceTipo][3] = estadoVehiculo;
        }

        System.out.println("\nAgenda:");
        System.out.println("| Tipo  | Marca   | Modelo  | Año  | Estado        |");

        for (int i = 0; i < numeroTrabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (registroTrabajos[i][j][0] != null) {
                    String tipo = j == 0 ? "Moto" : "Carro";
                    System.out.printf("| %-5s | %-7s | %-7s | %-4s | %-12s |\n", tipo, registroTrabajos[i][j][0], registroTrabajos[i][j][1], registroTrabajos[i][j][2], registroTrabajos[i][j][3]);
                }
            }
        }

        int cantidadPendientes = 0, cantidadEnReparacion = 0, cantidadReparados = 0;

        for (int i = 0; i < numeroTrabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (registroTrabajos[i][j][3] != null) {
                    switch (registroTrabajos[i][j][3].toLowerCase()) {
                        case "pendiente":
                            cantidadPendientes++;
                            break;
                        case "en reparación":
                            cantidadEnReparacion++;
                            break;
                        case "reparado":
                            cantidadReparados++;
                            break;
                    }
                }
            }
        }

        System.out.println("\nEstado de los vehículos:");
        System.out.println("Pendientes: " + cantidadPendientes);
        System.out.println("En reparación: " + cantidadEnReparacion);
        System.out.println("Reparados: " + cantidadReparados);

        System.out.print("\nIngrese la marca del vehículo a buscar: ");
        String buscarMarca = entrada.nextLine().trim();

        System.out.print("Ingrese el modelo del vehículo a buscar: ");
        String buscarModelo = entrada.nextLine().trim();

        boolean encontrado = false;

        for (int i = 0; i < numeroTrabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (registroTrabajos[i][j][0] != null && registroTrabajos[i][j][0].equalsIgnoreCase(buscarMarca) && registroTrabajos[i][j][1].equalsIgnoreCase(buscarModelo)) {
                    String tipo = j == 0 ? "Moto" : "Carro";
                    System.out.printf("Vehículo encontrado: %s %s %s %s %s\n", tipo, registroTrabajos[i][j][0], registroTrabajos[i][j][1], registroTrabajos[i][j][2], registroTrabajos[i][j][3]);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
        }

        System.out.print("\nIngrese la marca del vehículo a actualizar: ");
        String actualizarMarca = entrada.nextLine().trim();

        System.out.print("Ingrese el modelo del vehículo a actualizar: ");
        String actualizarModelo = entrada.nextLine().trim();

        encontrado = false;

        for (int i = 0; i < numeroTrabajos; i++) {
            for (int j = 0; j < 2; j++) {
                if (registroTrabajos[i][j][0] != null && registroTrabajos[i][j][0].equalsIgnoreCase(actualizarMarca) && registroTrabajos[i][j][1].equalsIgnoreCase(actualizarModelo)) {
                    System.out.print("Ingrese el nuevo estado (Pendiente, En reparación, Reparado): ");
                    String nuevoEstado = entrada.nextLine().trim();
                    registroTrabajos[i][j][3] = nuevoEstado;
                    System.out.printf("Estado actualizado: %s %s %s %s %s\n", j == 0 ? "Moto" : "Carro", registroTrabajos[i][j][0], registroTrabajos[i][j][1], registroTrabajos[i][j][2], registroTrabajos[i][j][3]);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
        }
    }
}
