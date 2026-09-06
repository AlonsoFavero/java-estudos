package collections.conjuntos;

import collections.Listas.Produto;

import java.util.TreeSet;

public class TesteTreeSet{
    public static void main(String[] args) {

        TreeSet<Integer> numeros = new TreeSet<>();
        TreeSet<Produto> produtos = new TreeSet<>();

        Produto produto3 = new Produto();

        produto3.nome = "Mouse";
        produto3.preco = 50;

        Produto produto1 = new Produto();

        produto1.nome = "Teclado";
        produto1.preco = 100;

        Produto produto2 = new Produto();

        produto2.nome = "Monitor";
        produto2.preco = 500;

        produtos.add(produto3);
        produtos.add(produto1);
        produtos.add(produto2);

        System.out.println(produtos);

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
