import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Pila {

    public static void main(String[] args) {
        Stack<Integer> pila= new Stack<>();
        pila.push(5);
        pila.push(10);
        pila.push(12);
        System.out.println(pila.pop());

    }
}
