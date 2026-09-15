package collections.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestePercorrerMap {
    public static void main(String[] args){

        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Teclado", 10);
        produtos.put("Mouse", 20);
        produtos.put("Celular", 5);

        for(Entry<String, Integer> meusProdutos: produtos.entrySet()){

            System.out.println(meusProdutos.getKey());
            System.out.println(meusProdutos.getValue());
        }
    }
}
