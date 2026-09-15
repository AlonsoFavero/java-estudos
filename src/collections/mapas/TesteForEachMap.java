package collections.mapas;

import java.util.HashMap;
import java.util.Map;

public class TesteForEachMap {
    public static void main(String[] args){

        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Teclado", 10);
        produtos.put("Mouse", 20);
        produtos.put("Celular", 5);

        produtos.forEach((produto , quantidade) -> {

            System.out.println(produto);
            System.out.println(quantidade);
        });
    }
}
