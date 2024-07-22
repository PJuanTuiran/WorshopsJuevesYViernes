public class Empleado {
    private String nombre;
    private String posicion;
    private double salario;
    private int id;

    public Empleado(String nombre, String posicion, double salario, int id) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void aumentarSalario(double porcentaje) {
        if (porcentaje > 0) {
            salario += salario * (porcentaje / 100);
        }
    }

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Pérez", "Desarrollador", 50000, 1);
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Posición: " + empleado.getPosicion());
        System.out.println("Salario: " + empleado.getSalario());
        System.out.println("ID: " + empleado.getId());
        empleado.aumentarSalario(10);
        System.out.println("Salario después del aumento: " + empleado.getSalario());
    }
}
