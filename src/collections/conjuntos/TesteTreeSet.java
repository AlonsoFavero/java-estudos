package collections.conjuntos;

import java.util.TreeSet;

public class TesteTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(20);
        numeros.add(10);

        System.out.println(numeros);
        System.out.println(numeros.first());
        System.out.println(numeros.last());
        System.out.println(numeros.higher(0));
        System.out.println(numeros.lower(4));
    }
}
