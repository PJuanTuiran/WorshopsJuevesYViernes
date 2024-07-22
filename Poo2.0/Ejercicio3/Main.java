package com.miempresa.cursos;

public class Main {
    public static void main(String[] args) {
        AdministradorCursos adminCursos = new AdministradorCursos();

        Curso curso1 = new Curso("LS134", "Introducción a la Programación");
        Curso curso2 = new Curso("LS152", "Estructuras de Datos");

        adminCursos.agregarCurso(curso1);
        adminCursos.agregarCurso(curso2);

        Estudiante estudiante1 = new Estudiante("001", "Maria Lopez", "maria@example.com");
        Estudiante estudiante2 = new Estudiante("002", "Carlos Perez", "carlos@example.com");

        adminCursos.registrarEstudianteEnCurso("CS101", estudiante1);
        adminCursos.registrarEstudianteEnCurso("CS101", estudiante2);

        System.out.println("Estudiantes inscritos en CS101:");
        adminCursos.mostrarEstudiantesEnCurso("CS101");
    }
}
