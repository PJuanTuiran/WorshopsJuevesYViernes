

public class Empleado extends Persona {
    private int id;
    private double salario;

    public Empleado(String nombreCompleto, int edad, int id, double salario) {
        super(nombreCompleto, edad);
        this.id = id;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombreCompleto='" + getNombreCompleto() + '\'' +
                ", edad=" + getEdad() +
                ", salario=" + salario +
                '}';
    }
}
