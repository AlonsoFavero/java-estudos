package collections.mapas.testes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TesteRemoverProdutos {
    public static void main(String[] args) {

        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Teclado", 200);
        produtos.put("Mouse", 40);
        produtos.put("Celular", 2000);
        produtos.put("Fone", 80);

        Iterator<Map.Entry<String, Integer>> iterator = produtos.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Integer> meusProdutos = iterator.next();

            if (meusProdutos.getValue() < 100) {

                iterator.remove();
            }
        }

        System.out.println(produtos);
    }
}