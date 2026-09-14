package collections.mapas;

import java.util.HashMap;
import java.util.Map;

public class TesteAtualizarEstoque {
    public static void main(String[] args){

        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Teclado", 10);
        produtos.put("Mouse", 20);
        produtos.put("Celular", 5);

        System.out.println(produtos);
        System.out.println(produtos.get("Mouse"));
        produtos.put("Mouse", 17);
        System.out.println(produtos);
        System.out.println(produtos.get("Mouse"));

    }
}
