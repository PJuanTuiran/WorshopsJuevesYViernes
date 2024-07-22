
import java.util.ArrayList;

public class Curso {
    private String codigoCurso;
    private String nombreCurso;
    private ArrayList<Estudiante> estudiantesInscritos = new ArrayList<>();;

    public Curso(String codigoCurso, String nombreCurso) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public ArrayList<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantesInscritos.add(estudiante);
    }

    public void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiantesInscritos) {
            System.out.println(estudiante);
        }
    }

    @Override
    public String toString() {
        return "Curso [codigoCurso=" + codigoCurso + ", nombreCurso=" + nombreCurso + "]";
    }
}
