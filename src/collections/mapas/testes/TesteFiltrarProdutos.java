package collections.mapas.testes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TesteFiltrarProdutos {
    public static void main(String[] args){

        Map<String, Integer> produtos = new HashMap<>();

        produtos.put("Teclado", 200);
        produtos.put("Mouse", 40);
        produtos.put("Celular" ,2000);

        for(Entry<String , Integer> meusProdutos: produtos.entrySet()){

            if( meusProdutos.getValue() > 100){
               System.out.println(meusProdutos);
            }
        }
    }
}
