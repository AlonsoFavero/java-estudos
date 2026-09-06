package Sets;

import collections.Listas.Produto;

import java.util.HashSet;

public class TesteHashSet {
    public static void main(String[] args){

        HashSet<String> nomes = new HashSet<>();
        HashSet<Produto> produtos = new HashSet<>();

        Produto produto1 = new Produto();

        produto1.nome = "notebook";
        produto1.preco = 1400;


        Produto produto2 = new Produto();

        produto2.nome = "notebook";
        produto2.preco = 1400;

        produtos.add(produto1);
        produtos.add(produto2);

        System.out.println(produtos);
        System.out.println(produto1.equals(produto2));

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
