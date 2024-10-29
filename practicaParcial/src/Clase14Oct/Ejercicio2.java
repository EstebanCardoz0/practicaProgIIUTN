package Clase14Oct;

public class Ejercicio2 {

    public static void main(String[] args) {

        Pantalla pantalla = new Pantalla(6.5);
        Bateria bateria = new Bateria(4000);
        Procesador procesador = new Procesador(2.8);

        Movil movil = new Movil(pantalla, bateria, procesador);
        System.out.println(movil.toString());
    }
}

class Pantalla {
    private double tamanio;

    public Pantalla(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getTamanio() {
        return tamanio;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "tamaño=" + tamanio +
                '}';
    }
}

class Bateria {
    private int capacidad;

    public Bateria(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "capacidad=" + capacidad +
                " mAh}";
    }
}

class Procesador {
    private double velocidad;

    public Procesador(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "velocidad=" + velocidad +
                " GHz}";
    }
}

class Movil {
    private Pantalla pantalla;
    private Bateria bateria;
    private Procesador procesador;

    public Movil(Pantalla pantalla, Bateria bateria, Procesador procesador) {
        this.pantalla = pantalla;
        this.bateria = bateria;
        this.procesador = procesador;
    }


    @Override
    public String toString() {
        return "Movil{" +
                "pantalla=" + pantalla +
                ", bateria=" + bateria +
                ", procesador=" + procesador +
                '}';
    }
}

