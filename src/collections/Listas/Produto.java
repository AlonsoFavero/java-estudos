package collections.Listas;

public class Produto {

    String nome;
    double preco;

    @Override
    public String toString() {
        return nome + " - R$" + preco ;
    }
}
