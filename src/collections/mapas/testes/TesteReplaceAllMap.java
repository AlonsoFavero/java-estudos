package collections.mapas.testes;

import java.util.HashMap;
import java.util.Map;

public class TesteReplaceAllMap {
    public static void main(String[] args) {
        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Teclado", 100);
        produtos.put("Mouse", 50);
        produtos.put("Celular", 1000);

        System.out.println("Antes do replaceAll: " + produtos);

        // Usando lambda para somar 10 no preço de todos os produtos
        // O 'k' é a chave e o 'v' é o valor atual
        produtos.replaceAll((k, v) -> v + 10);

        System.out.println("Depois do replaceAll: " + produtos);
    }
}