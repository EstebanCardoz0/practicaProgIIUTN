public class autos {

    public static void main(String[] args) {
        Coch coche = new Coch();
        coche.mostrarMarca();
    }
}

class Coch {
    private String marca = "Toyota";

    public void mostrarMarca() {
        System.out.println(marca);
    }}

