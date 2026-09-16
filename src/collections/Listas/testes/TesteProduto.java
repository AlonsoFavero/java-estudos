package collections.Listas.testes;

import collections.Listas.Produto;

public class TesteProduto {
    public static void main(String[] args){

        Produto produto = new Produto();

        produto.nome = "Celular";
        produto.preco = 1200;

        System.out.println(produto);
    }
}
