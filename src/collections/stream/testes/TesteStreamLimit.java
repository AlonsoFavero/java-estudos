package collections.stream.testes;

import java.util.List;

public class TesteStreamLimit {
    public static void main(String[] args){

        List<Integer> numeros = List.of(10,3,5,8,2,7,4);

        List<Integer> resultado = numeros.stream()
                .filter( n -> n % 2 == 0)
                .sorted()
                .limit(2)
                .toList();

        System.out.println(resultado);

    }
}
