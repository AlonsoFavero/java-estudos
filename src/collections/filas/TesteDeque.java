package collections.filas;

import java.util.ArrayDeque;
import java.util.Deque;

public class TesteDeque {
    public static void main(String[] args){

        Deque<Integer> numeros = new ArrayDeque<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println(numeros.offerLast(10));
        System.out.println(numeros.offerFirst(30));
        System.out.println(numeros.removeFirst());
        System.out.println(numeros.removeLast());
        System.out.println(numeros.peekFirst());
        System.out.println(numeros.peekLast());
        System.out.println(numeros);

    }
}
