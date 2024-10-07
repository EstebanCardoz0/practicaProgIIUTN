import java.sql.SQLOutput;

//Crea una clase base Vehículo y clases
// derivadas Coche y Motocicleta. La clase
// Coche debe tener un Conductor
//y la clase Motocicleta debe tener un Pasajero
// . Implementa métodos que permitan obtener la
// información
//del vehículo y del conductor/pasajero.
public class Ej4Vehiculo {

    public static void main(String[] args) {

//Koche ku=new Vehiculoo();
        Vehiculoo vee = new Koche();
        Koche ko = new Koche("34343");
        ko.setConductor("eseban");
        System.out.println(ko.toString());


    }
}

class Vehiculoo {
    private String patente;

    @Override public String toString() {
        return "Vehiculoo{" +
                "patente='" + patente + '\'' +
                '}';
    }

    public Vehiculoo(String patente) {
        this.patente = patente;
    }

    public Vehiculoo() {
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setConductor(String eseban) {
    }
}

class Koche extends Vehiculoo {
    private String conductor;

    @Override public String toString() {
        return super.toString() +
                ", Conductor: " + conductor;
    }

    public Koche(String patente) {
        super(patente);
        this.conductor = conductor;
    }

    public Koche() {
    }

    public String getConductor() {
        return conductor;
    }

    public Koche(String patente,
                 String conductor) {
        super(patente);
        this.conductor = conductor;
    }
}

class Moto extends Vehiculoo {
    private String pasajero;

    @Override public String toString() {
        return super.toString() + ", Pasajero: " +
                pasajero;
    }

    public Moto(String patente, String pasajero) {
        super(patente);
        this.pasajero = pasajero;
    }

    public String getPasajero() {
        return pasajero;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }
}

