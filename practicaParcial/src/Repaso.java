import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Repaso {



        public static void main(String[] args) {
            int resultado = multiplicar(a:3, b:4);
            System.out.println(resultado);
        }

        public static int multiplicar(int a, int b) {
            if (b == 0) {
                return 0;
            } else {
                return a + multiplicar(a, b - 1) - a;
            }
        }}



