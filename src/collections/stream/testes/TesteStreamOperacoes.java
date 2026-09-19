package collections.stream.testes;

import java.util.List;

public class TesteStreamOperacoes {
    public static void main(String[] args){

        List<Integer> numeros = List.of(10,3,5,8,2,7,4);

        boolean resultado = numeros.stream()
                .anyMatch(n -> n == 8);

        System.out.println(resultado);
    }
}
