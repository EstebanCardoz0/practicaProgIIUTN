public class UsoCivil {
    public static void main(String[] args) {


        Cocher coche = new Cocher();
        coche.mostrarUso();
    }
}

interface UsoCivi {
    void mostrarUso();
}

class Coche implements UsoCivi {

    @Override
    public void mostrarUso() {
        System.out.println("Este coche es de uso civil");    }
}
