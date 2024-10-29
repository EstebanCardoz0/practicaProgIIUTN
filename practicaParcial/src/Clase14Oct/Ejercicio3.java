package Clase14Oct;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {


    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("La vaca atada");
        restaurante.agregarPlato(new Plato("Ensalada César", 12.50));
        restaurante.agregarPlato(new Plato("Sopa de Tomate", 8.00));
        restaurante.agregarPlato(new Plato("Filete de Res", 20.00));
        restaurante.mostrarMenu();
    }
}

class Restaurante {
    private String nombre;
    private Menu menu;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.menu = new Menu();
    }

    public void agregarPlato(Plato plato) {
        menu.agregarPlato(plato);
    }

    public void mostrarMenu() {
        System.out.println("Restaurante: " + nombre);
        menu.mostrarDetalles();
    }
}

class Menu {
    private List<Plato> platos;

    public Menu() {
        this.platos = new ArrayList<>();
    }

    public void agregarPlato(Plato plato) {
        platos.add(plato);
    }

    public void mostrarDetalles() {
        System.out.println("Menú:");
        for (Plato plato : platos) {
            System.out.println(plato);
        }
    }
}

class Plato {
    private String nombre;
    private double precio;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

