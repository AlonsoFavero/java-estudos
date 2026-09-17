package collections.mapas.testes;

import java.util.Map;
import java.util.HashMap;

public class TestePutIfAbsentMap {
    public static void main(String[] args){

        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Teclado", 10);
        produtos.put("Mouse", 20);
        produtos.put("Celular", 5);

        System.out.println(produtos);
        System.out.println(produtos.putIfAbsent("Mouse", 30));
        System.out.println(produtos.putIfAbsent("tv", 30));
        System.out.println(produtos);
    }
}
