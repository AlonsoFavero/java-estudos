package collections.mapas;

import collections.Listas.Produto;
import collections.Listas.ProdutoService;

import java.util.HashMap;

public class TesteHashMap {
    public static void main(String[] args){

        HashMap<Integer, Produto> Produto = new HashMap<>();

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

        Produto.put(1, produto1);
        Produto.put(2, produto2);
        Produto.put(3, produto3);
        Produto.put(4, produto4);

        System.out.println(Produto);
    }
}
