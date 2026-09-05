package collections.Listas;

public class TesteListaProdutos {
    public static void main(String[] args) {

        ProdutoService produto = new ProdutoService();

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        produto1.nome = "teclado";
        produto1.preco = 200;

        produto2.nome = "tablet";
        produto2.preco = 1100;

        produto3.nome = "fone de ouvido";
        produto3.preco = 500;

        produto.adicionarProduto(produto1);
        produto.adicionarProduto(produto2);
        produto.adicionarProduto(produto3);

        produto.removerProdutos(produto1);

        produto.listarProdutos();

        System.out.println(
                produto.verificarProduto(produto2)
        );

        System.out.println(
               produto.quantidadeProdutos()
        );
    }
}