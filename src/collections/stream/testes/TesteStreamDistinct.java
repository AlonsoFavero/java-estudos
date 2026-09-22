package collections.stream.testes;

import java.util.List;

public class TesteStreamDistinct {
    public static void main(String[] args){

        List<Integer> numeros = List.of(10, 20, 20, 30, 30, 30);

        List<Integer> resultado2 = numeros.stream()
                .filter(valor -> valor > 5)
                .distinct()
                .toList();

        System.out.println(resultado2);
    }
}
