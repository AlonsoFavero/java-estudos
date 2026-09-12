package collections.mapas;

import collections.Listas.Produto;

import java.util.HashMap;
import java.util.Map;

public class TesteBuscarProduto {
    public static void main(String[] args){

        Map<Integer, Produto> produtos = new HashMap<>();

        Produto produto1 = new Produto("Teclado", 200.0);

        produtos.put(1, produto1 );

        Produto produto2 = new Produto("Mouse", 40.0);

        produtos.put(2, produto2);

        Produto produto3 = new Produto("celular", 2000.0);

        produtos.put(3, produto3);

        System.out.println(produtos);
        System.out.println(produtos.get(2));
        System.out.println(produtos.containsKey(3));
        System.out.println(produtos.remove(1));
        System.out.println(produtos.size());
        System.out.println(produtos);


      }
}
