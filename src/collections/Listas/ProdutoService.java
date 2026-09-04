package collections.Listas;

import java.util.ArrayList;

public class ProdutoService {

    ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto (Produto produto){

        produtos.add(produto);

    }

    public void listarProdutos(){

        produtos.forEach(produto -> System.out.println(produto));
    }


}
