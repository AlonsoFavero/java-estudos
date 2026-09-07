package collections.conjuntos;

import collections.Listas.Produto;
import java.util.Comparator;
import java.util.TreeSet;

public class TesteComparator {
    public static void main(String[] args){

        Comparator<Produto> produtos = new Comparator<Produto>() {
            @Override
            public int compare(Produto produto, Produto t1) {
                return produto.nome.compareTo(t1.nome);
            }
        };

        TreeSet<Produto> outroProduto = new TreeSet<>(produtos);

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();

        produto1.nome = "teclado";
        produto1.preco = 200;

        produto2.nome = "tablet";
        produto2.preco = 1100;

        produto3.nome = "fone de ouvido";
        produto3.preco = 500;

        produto4.nome = "notebook";
        produto4.preco = 1200;

        outroProduto.add(produto1);
        outroProduto.add(produto2);
        outroProduto.add(produto3);
        outroProduto.add(produto4);

        System.out.println(outroProduto);
    }
}