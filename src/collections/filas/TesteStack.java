package collections.filas;

import java.util.Deque;
import java.util.ArrayDeque;

public class TesteStack {
    public static void main(String[] args){

        Deque<Integer> numeros = new ArrayDeque<>();

        numeros.push(40);
        numeros.push(10);
        numeros.push(20);
        numeros.push(30);

        System.out.println(numeros);
        System.out.println(numeros.peek());
        System.out.println(numeros);
        System.out.println(numeros.pop());
        System.out.println(numeros);
    }
}
