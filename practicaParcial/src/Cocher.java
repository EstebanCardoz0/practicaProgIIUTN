public class Cocher {
    public static void main(String[] args) {

        Cochex coche1 = new Cochex("Toyota");
        System.out.println(coche1.getMarca());
    }
}

class Cochex {
    private String marca;

    public Cochex(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
}
