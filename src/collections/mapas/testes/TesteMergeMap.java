package collections.mapas.testes;

import java.util.HashMap;
import java.util.Map;

public class TesteMergeMap {
    public static void main(String[] args){

        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Caneta", 10);

        estoque.merge("Caneta", 5, (antigo, novo) -> antigo + novo);
        estoque.merge("Caderno", 12, (antigo, novo) -> antigo + novo);

        System.out.println(estoque);
    }
}
