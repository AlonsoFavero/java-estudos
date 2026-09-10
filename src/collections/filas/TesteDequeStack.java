package collections.filas;

import java.util.*;

public class TesteDequeStack {
    public static void main(String[] args){

        Deque<Integer> numerosDeque = new ArrayDeque<>();
        Deque<Integer> pilhaNumeros = new ArrayDeque<>();

        pilhaNumeros.push(10);
        pilhaNumeros.push(20);
        pilhaNumeros.push(30);

        numerosDeque.add(10);
        numerosDeque.add(20);
        numerosDeque.add(30);

        System.out.println(pilhaNumeros);
        System.out.println(pilhaNumeros.peek());
        System.out.println(pilhaNumeros.pop());
        System.out.println(pilhaNumeros);
        System.out.println(numerosDeque);
        System.out.println(numerosDeque.offerFirst(5));
        System.out.println(numerosDeque.offerLast(40));
        System.out.println(numerosDeque);
        System.out.println(numerosDeque.removeFirst());
        System.out.println(numerosDeque.removeLast());
        System.out.println(numerosDeque);

    }
}
