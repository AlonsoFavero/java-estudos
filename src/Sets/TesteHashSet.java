package Sets;

import java.util.HashSet;

public class TesteHashSet {
    public static void main(String[] args){

        HashSet<String> nomes = new HashSet<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("João");

        System.out.println(nomes);

        System.out.println(nomes.contains("Maria"));
        System.out.println(nomes.contains("Carlos"));

        System.out.println(nomes.remove("Pedro"));
        System.out.println(nomes);

        System.out.println(nomes.size());

        System.out.println(nomes.isEmpty());

    }
}
