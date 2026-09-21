package collections.stream.testes;

import java.util.List;
import java.util.Optional;

public class TesteStreamFindFirst {
    public static void main(String[] args){

        List<Integer> produtos = List.of(10, 20, 30);

        Optional<Integer> resultado2 = produtos.stream()
                .filter(valor -> valor > 10)
                .findFirst();

        System.out.println(resultado2);
    }
}
