package collections.optional.testes;

import java.util.Optional;

public class TesteOptional {
    public static void main(String[] args){

        Optional<String> produtos = Optional.of("valor");
        Optional<String> produto = Optional.empty();

        System.out.println(produtos);
        System.out.println(produtos.isPresent());
        produtos.ifPresent(valor -> System.out.println(valor));
        System.out.println(produto.orElse("valor padrão"));
        System.out.println(produto);
        System.out.println(produtos);
    }
}
