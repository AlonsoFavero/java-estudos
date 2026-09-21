package collections.stream.testes;

import java.util.List;

public class TesteStreamAllMatch {
    public static void main(String[] args){

        List<Integer> numeros = List.of(10, 20, 30);

        boolean resultado2 = numeros.stream()
                .allMatch(valor -> valor > 5);

        System.out.println(resultado2);
    }
}
