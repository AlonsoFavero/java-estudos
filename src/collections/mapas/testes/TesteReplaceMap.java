package collections.mapas.testes;

import java.util.HashMap;
import java.util.Map;

public class TesteReplaceMap {
    public static void main(String[] args){

        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Teclado", 10);
        produtos.put("Mouse", 20);
        produtos.put("Celular", 5);

        System.out.println(produtos);
        System.out.println(produtos.replace("Mouse", 30));
        System.out.println(produtos);
    }
}
