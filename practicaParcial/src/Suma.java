public class Suma {
    public static void main(String[] args) {

        int resultado = suma(5);
        System.out.println(resultado);
    }

    public static int suma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + suma(n - 1);

        }
    }
}


