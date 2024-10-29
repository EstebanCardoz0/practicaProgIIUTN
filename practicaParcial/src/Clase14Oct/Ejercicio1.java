package Clase14Oct;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static void main(String[] args) {

        Edificio edificio = new Edificio("Torres correntinas");
        edificio.agregarPiso(new Piso(1, 4));
        edificio.agregarPiso(new Piso(2, 3));
        edificio.mostrarDetalles();
    }
}


class Piso {
    private int numero;
    private int cantidadDepartamentos;

    public Piso(int numero, int cantidadDepartamentos) {
        this.numero = numero;
        this.cantidadDepartamentos = cantidadDepartamentos;
    }

    public int getNumero() {
        return numero;
    }

    public int getCantidadDepartamentos() {
        return cantidadDepartamentos;
    }

    @Override
    public String toString() {
        return "Piso{" +
                "numero=" + numero +
                ", cantidadDepartamentos=" + cantidadDepartamentos +
                '}';
    }
}

class Edificio {
    private String nombre;
    private List<Piso> pisos;

    public Edificio(String nombre) {
        this.nombre = nombre;
        this.pisos = new ArrayList<>();
    }

    public void agregarPiso(Piso piso) {
        pisos.add(piso);
    }

    public void mostrarDetalles() {
        System.out.println("Edificio: " + nombre);
        for (Piso piso : pisos) {
            System.out.println(piso);
        }
    }
}

