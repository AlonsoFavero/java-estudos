package collections.conjuntos;

import java.util.LinkedHashSet;

public class TesteLinkedHashSet {
    public static void main(String[] args){

        LinkedHashSet<String> nomes = new LinkedHashSet<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("João");

        System.out.println(nomes);
    }
}
