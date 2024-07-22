

public class Main {
    public static void main(String[] args) {
        GestionEmpleados gestion = new GestionEmpleados();

        EmpleadoTemporal temporal = new EmpleadoTemporal("Ana López", 30, 201, 1500, 12);
        EmpleadoPermanente permanente = new EmpleadoPermanente("Luis Martínez", 45, 202, 3200, 1000);

        gestion.agregarEmpleado(temporal);
        gestion.agregarEmpleado(permanente);

        System.out.println("Lista de empleados:");
        gestion.mostrarEmpleados();

        gestion.eliminarEmpleado(201);

        System.out.println("\nLista de empleados después de eliminar:");
        gestion.mostrarEmpleados();
    }
}
