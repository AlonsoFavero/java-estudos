package collections.stream.testes;

import java.util.List;

public class TesteStreamCount {
    public static void main(String[] args){

        List<Integer> numeros = List.of(10, 20, 30);

        long resultado2 = numeros.stream()
                .filter(valor -> valor > 5)
                .count();

        System.out.println(resultado2);
    }
}
