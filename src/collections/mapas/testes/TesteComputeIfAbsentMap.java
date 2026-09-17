package collections.mapas.testes;

import java.util.HashMap;
import java.util.Map;

public class TesteComputeIfAbsentMap {
    public static void main(String[] args){

        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Teclado", 10);
        produtos.put("Mouse", 20);
        produtos.put("Celular", 5);

        System.out.println(produtos);
        System.out.println(produtos.computeIfAbsent("Monitor", k -> 50));
        System.out.println(produtos.computeIfAbsent("Mouse", k -> 99));
        System.out.println(produtos);
    }
}
