import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Diseña un sistema de reservas donde cada
// Cliente pueda hacer varias Reservas de
// Habitaciones.
//La clase Habitación debe tener información
// como el número y el tipo. Implementa métodos
// para realizar
//una reserva y listar todas las reservas de un
// cliente.
public class Ej7Reserva {
    public static void main(String[] args) {

        Client cli = new Client("Esteban");
        cli.agregarReserva("5 de enero", 5,
                "doble");
        cli.agregarReserva("6" +
                        " de enero", 55,
                "simple");
        cli.agregarReserva("6" +
                        " de agosto", 22335,
                "monoambiente");
        cli.mostrarReserva();
    }
}

class Client {
    private String nombre;
    private List<Reserva> reservas;

    public Client(String nombre) {
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
    }

    public void agregarReserva(String fecha,
                               int numero,
                               String tipo) {
        reservas.add(new Reserva(fecha, numero,
                tipo));
    }

    public void mostrarReserva() {
        for (Reserva reser : reservas) {
            System.out.println(reser.toString());
        }
    }

}

class Habitacion {
    private int numero;
    private String tipo;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

class Reserva {
    private String fecha;
    private Habitacion habi;

    public Reserva(String fecha, int numero,
                   String tipo) {
        this.fecha = fecha;
        this.habi = new Habitacion(numero, tipo);
    }

    @Override public String toString() {
        return "Reserva{" +
                "fecha=" + fecha +
                ", habi=" + habi +
                '}';
    }
}
