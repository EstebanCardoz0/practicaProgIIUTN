public class Herencia {
    public static void main(String[] args) {

        Vehiculo coche = new Coches();
        coche.mostrar();
    }
}

class Vehiculo {
    public void mostrar() {
        System.out.println("Este es un vehículo");
    }
}

class Coches extends Vehiculo {
    public void mostrar() {
        System.out.println("Este es un coche");
    }
}
