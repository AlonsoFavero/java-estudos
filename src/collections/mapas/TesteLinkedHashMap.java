package collections.mapas;

import collections.Listas.Produto;

import java.util.Map;
import java.util.LinkedHashMap;

public class TesteLinkedHashMap {
    public static void main(String[] args){

        Map<Integer, Produto> Produto = new LinkedHashMap<>();

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
        Produto.put(2, produto3);
        Produto.put(4, produto4);

        System.out.println(Produto.entrySet());

        System.out.println(Produto);
    }
}
