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
    
    public void removerProdutos(Produto produto){

        produtos.remove(produto);
    }

    public boolean verificarProduto(Produto produto){

       return produtos.contains(produto);

    }

    public int quantidadeProdutos(){

        return produtos.size();
    }

    public Produto buscarProduto(int indice){

        return produtos.get(indice);
    }
}
