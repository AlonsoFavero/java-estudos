package collections.stream.testes;

import java.util.List;

public class TesteStreamSorted {
    public static void main(String[] args){

        List<Integer> numeros = List.of(30, 10, 40, 20);

        List<Integer> resultado2 = numeros.stream()
                .filter(valor -> valor > 5)
                .sorted()
                .toList();

        System.out.println(resultado2);
    }
}
