package collections.stream.testes;

import java.util.List;

public class TesteStreamOperacoes {
    public static void main(String[] args){

        List<Integer> numeros = List.of(10,3,5,8,2,7,4);

        long resultado = numeros.stream()
                .filter(n -> n > 5)
                .count();

        System.out.println(resultado);
    }
}
