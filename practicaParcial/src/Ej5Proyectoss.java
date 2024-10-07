//Diseña un sistema de gestión de proyectos
// donde cada Proyecto tenga varios Empleados
// asociados.
//Cada Empleado debe tener un nombre y un rol
// en el proyecto. Implementa métodos para
// agregar empleados
//a un proyecto y mostrar la lista de empleados
// que trabajan en un proyecto específico.

import java.util.ArrayList;
import java.util.List;

public class Ej5Proyectoss {
    public static void main(String[] args) {

        Proyecto proy = new Proyecto("Gestion");
        Proyecto proye = new Proyecto("Admin");
        Empleado emple1= new Empleado("pepito");
        Empleado emple2= new Empleado("cachito");
        Empleado emple3= new Empleado("pedrito");
        proy.agregarEmpleado(emple1,"lider");
        proy.agregarEmpleado(emple2,"capataz");
        proy.agregarEmpleado(emple3,"cadete");
        proy.mostrarEmpleados();

    }
}

class Proyecto {
    private String nombre;
    private List<Empleado> empleados;

    public void agregarEmpleado(Empleado emple,
                                String rol) {
        empleados.add(emple);
        emple.setProyecto(nombre);
        emple.setRol(rol);

    }

    public void mostrarEmpleados() {
        for (Empleado emple : empleados) {
            System.out.println(emple.toString());
        }
    }

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

}

class Empleado {
    private String nombre;
    private String rol;
    private String proyecto;


    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    @Override public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", rol='" + rol + '\'' +
                ", proyecto='" + proyecto + '\'' +
                '}';
    }
}