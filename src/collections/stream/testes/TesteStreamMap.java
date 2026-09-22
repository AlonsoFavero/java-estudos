package collections.stream.testes;

import java.util.List;

public class TesteStreamMap {
    public static void main(String[] args){

        List<Integer> numeros = List.of(10, 20, 30);

        List<Integer> resultado2 = numeros.stream()
                .filter(valor -> valor > 5)
                .map( valor -> valor * 2)
                .toList();

        System.out.println(resultado2);
    }
}
