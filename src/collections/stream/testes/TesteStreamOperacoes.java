package collections.stream.testes;

import java.util.List;
import java.util.Optional;

public class TesteStreamOperacoes {
    public static void main(String[] args){

        List<Integer> numeros = List.of(10,3,5,8,2,7,4);
        List<Integer> todosMaioresQueZero = List.of(10,3,5,8,2,7,4);
        List<Integer> semNegativos = List.of(10,3,5,8,2,7,4);
        List<Integer> numeros2 = List.of(10,3,5,8,2,7,4);

        boolean resultados1 = semNegativos.stream()
                .noneMatch(n -> n < 0);

        boolean resultados = todosMaioresQueZero.stream()
                .allMatch(n -> n > 0);

        boolean resultado = numeros.stream()
                .anyMatch(n -> n == 8);

        Optional<Integer> resultado2 = numeros.stream()
                .filter(n -> n > 5)
                .findFirst();


        System.out.println(resultado);
        System.out.println(resultados);
        System.out.println(resultados1);
        System.out.println(resultado2);
    }
}
