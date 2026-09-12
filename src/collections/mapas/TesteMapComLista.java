package collections.mapas;

import collections.Listas.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TesteMapComLista {
    public static void main(String[] args) {

        Map<String, ArrayList<Produto>> produtos = new HashMap<>();

        ArrayList<Produto> eletronicos = new ArrayList<>();
        ArrayList<Produto> acessorios = new ArrayList<>();

        Produto produto1 = new Produto("Teclado", 200.0);
        Produto produto2 = new Produto("Mouse", 40.0);
        Produto produto3 = new Produto("Celular", 2000.0);

        eletronicos.add(produto1);
        eletronicos.add(produto3);

        acessorios.add(produto2);

        produtos.put("Eletronicos", eletronicos);
        produtos.put("Acessorios", acessorios);

        System.out.println(produtos);

        System.out.println(produtos.get("Eletronicos"));

        produtos.get("Eletronicos").add(
                new Produto("Notebook", 3500.0)
        );

        System.out.println(produtos);
    }
}