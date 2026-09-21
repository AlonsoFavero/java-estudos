package collections.stream.testes;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TesteStreamMax {
    public static void main(String[] args){

        List<Integer> numeros = List.of(10, 20, 30);

        Optional<Integer> resultado2 = numeros.stream()
                .filter(valor -> valor > 5)
                .max(Comparator.naturalOrder());

        System.out.println(resultado2);
    }
}
