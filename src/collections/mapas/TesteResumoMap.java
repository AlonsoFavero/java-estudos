package collections.mapas;

import java.util.HashMap;
import java.util.Map;

public class TesteResumoMap {
    public static void main(String[] args){

        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Teclado", 10);
        produtos.put("Mouse", 20);
        produtos.put("Celular", 5);

        System.out.println(produtos);
        System.out.println(produtos.size());
        System.out.println(produtos.containsKey("Mouse"));
        System.out.println(produtos.get("Celular"));
        System.out.println(produtos.containsValue(10));
    }
}
