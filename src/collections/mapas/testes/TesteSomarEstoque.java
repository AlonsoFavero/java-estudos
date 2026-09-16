package collections.mapas.testes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TesteSomarEstoque {

    public static void main(String[] args) {

        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Teclado", 10);
        estoque.put("Mouse", 20);
        estoque.put("Celular", 5);

        Collection<Integer> valores = estoque.values();

        int total = 0;

        for (Integer quantidade : valores) {
            total = total + quantidade;
        }

        System.out.println("Quantidade total: " + total);
    }
}