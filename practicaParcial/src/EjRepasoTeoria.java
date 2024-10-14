//Dado lo siguiente: casa, habitación, decoración. Se pide, abstraerse y encapsular un conjunto
//de clases utilizando como referencia lo dado previamente, que incluyan al menos dos atributos
//y dos métodos para demostrar los siguientes conceptos teóricos:
//• Principio de Ocultamiento.
//• Composición.
//• Constructores (por defecto y con parámetros)
//• Herencia entre clases.
//• Polimorfismo.
//• Métodos de Clase.
//• Sobrecarga de métodos.
//• Aclaración: Se pueden agregar tantas clases como usted considere necesario.

import java.util.List;

public class EjRepasoTeoria {
    public static void main(String[] args) {

    }
}

class Propiedad {
    // con el modificador private y luego con constructores se cumple el ocultamiento
    private String direccion;
    private Double metrosCuadrados;

    // constructores por defecto y parámetro, también implica sobrecarga
    public Propiedad() {

    }

    public Propiedad(String direccion, Double metrosCuadrados) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
    }

    // polimorfismo
    @Override
    public String toString() {
        return "Propiedad{" +
                "direccion='" + direccion + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                '}';
    }
}

// herencia
class Casa extends Propiedad {

    // composicion, no puede haber habitaciones sin casa
    private List<Habitacionn> habitaciones;

    //métodos de clase
    public static int cantidadHabitaciones(List<Habitacionn> habitaciones) {
        return habitaciones.size();
    }

    // constructores por defecto y parámetro, también implica sobrecarga
    public Casa() {
    }

    public Casa(String direccion, Double metrosCuadrados, List<Habitacionn> habitaciones) {
        super(direccion, metrosCuadrados);
        this.habitaciones = habitaciones;
    }

    //polimorfismo
    @Override
    public String toString() {
        return "Casa{" +
                "habitaciones=" + habitaciones +
                "} " + super.toString();
    }
}

class Habitacionn {
    //composicion, no puede haber decoracion sin habitacion
    private Decoracion deco;
    private String tipo;


}

class Decoracion {
    // con el modificador private y luego con constructores se cumple el ocultamiento
    private String estilo;
    private Decorador decorador;

    //método de clase
    public static void decorar(Habitacionn habi) {
        System.out.println("La habitación ahora está decorada");
    }

}

class Persona {
    // con el modificador private y luego con constructores se cumple el ocultamiento
    private String nombre;
    private String dni;
    private String edad;

    public Persona(String nombre, String dni, String edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
}

//herencia
class Decorador extends Persona {
    private int añosExperiencia;
    private String institucionFormadora;
    private List<String> reconocimientos;

    public Decorador(String nombre, String dni, String edad, int añosExperiencia, String institucionFormadora, List<String> reconocimientos) {
        super(nombre, dni, edad);
        this.añosExperiencia = añosExperiencia;
        this.institucionFormadora = institucionFormadora;
        this.reconocimientos = reconocimientos;
    }
}

