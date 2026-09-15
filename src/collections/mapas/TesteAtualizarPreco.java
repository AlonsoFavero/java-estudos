package collections.mapas;

import java.util.HashMap;
import java.util.Map;

public class TesteAtualizarPreco {
    public static void main(String[] args){

        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Teclado", 200);
        produtos.put("Mouse", 40);
        produtos.put("Celular" ,2000);

        for(Map.Entry<String , Integer> meusProdutos: produtos.entrySet()){

            if( meusProdutos.getValue() < 100){

                produtos.put(
                        meusProdutos.getKey(), meusProdutos.getValue() + 10
                );
            }
    }
        System.out.println(produtos);
}
}
