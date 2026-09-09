package collections.filas;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestePriorityQueue {
    public static void main(String[] args){

        Comparator<Integer> comparadorMaiorNumero = new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return Integer.compare (t1,integer);
            }
        };

        Queue<Integer> numeros = new PriorityQueue<>(comparadorMaiorNumero);

        numeros.add(5);
        numeros.add(1);
        numeros.add(8);
        numeros.add(2);

        System.out.println(numeros.remove());
        System.out.println(numeros.remove());
        System.out.println(numeros.remove());
        System.out.println(numeros.remove());
        System.out.println(numeros);
    }
}
