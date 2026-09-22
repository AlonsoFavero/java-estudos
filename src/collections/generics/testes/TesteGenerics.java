package collections.generics.testes;

public class TesteGenerics {
    public static void main(String[] args){

        String nomes = "João";
        Integer idade = 14;

        Caixa<String> caixa = new Caixa<>();
        Caixa<Integer> caixas = new Caixa<>();

        caixa.valor = "João";
        caixas.valor = 14;

        System.out.println(caixa.valor);
        System.out.println(caixas.valor);

    }

   static class Caixa<T>{

        T valor;

    }

}
