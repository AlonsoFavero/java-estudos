package collections.stream.testes;

import java.util.List;
import java.util.Optional;

public class TesteStreamReduce {
    public static void main(String[] args){

        List<Integer> numeros = List.of(10, 20, 30);

        Optional<Integer> resultado2 = numeros.stream()
                .filter(valor -> valor > 5)
                .reduce((valor1, valor2) -> valor1 + valor2);

        System.out.println(resultado2);
    }
}
