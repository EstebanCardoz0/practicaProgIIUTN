//Implementa una relación entre Estudiante y Curso. Un Estudiante puede estar inscrito en múltiples Cursos,
//y un Curso puede tener múltiples Estudiantes.
//Crea las clases necesarias y métodos para inscribir estudiantes en cursos y
//mostrar los cursos de un estudiante.

import java.util.ArrayList;
import java.util.List;

public class Ej3Estudiante {
    public static void main(String[] args) {

        Estudiante est1 = new Estudiante();
        Curso cur1=new Curso();
        cur1.setNombre("estadistica");
  Curso cur2=new Curso();
        cur2.setNombre("base de datos");
  Curso cur3=new Curso();
        cur3.setNombre("matematica");

        est1.agregarCurso(cur1);
        est1.agregarCurso(cur2);
        est1.agregarCurso(cur3);

        System.out.println(est1.toString());

    }
}

class Estudiante {
    private String nombre;
    private List<Curso> curso;

    public void agregarCurso(Curso cur) {
        curso.add(cur);

    }

    public Estudiante() {
        this.curso = new ArrayList<>();
    }

    public Estudiante(String nombre, List<Curso> curso) {
        this.nombre = nombre;
        this.curso = new ArrayList<>();
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", curso=" + curso +
                '}';
    }
}

class Curso {
    private String nombre;
    private List<Estudiante> estudiante;

    public void agregarEstudiante(Estudiante est) {
        estudiante.add(est);

    }

    public Curso() {

    }

    public Curso(String nombre, List<Estudiante> estudiante) {
        this.nombre = nombre;
        this.estudiante = estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(List<Estudiante> estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nombre='" + nombre + '\'' +
                ", estudiante=" + estudiante +
                '}';
    }
}


