package collections.stream.testes;

import java.util.List;

public class TesteStreamBasica {
    public static void main(String[] args) {
        // 1. Nossa lista original de cidades
        List<String> cidades = List.of("São Paulo", "Rio de Janeiro", "Santos", "Salvador", "Curitiba");

        // 2. Usando a Stream para filtrar e transformar
        List<String> resultado = cidades.stream()
                .filter(cidade -> cidade.startsWith("S")) // Pega só as que começam com 'S'
                .map(String::toUpperCase)                // Transforma em letras maiúsculas
                .toList();                               // Devolve o resultado em uma nova lista

        // 3. Mostra o resultado na tela
        System.out.println(resultado);
    }
}