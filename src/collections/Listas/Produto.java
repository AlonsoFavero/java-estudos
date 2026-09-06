package collections.Listas;

import java.util.Objects;

public class Produto implements Comparable <Produto>{

   public String nome;
   public double preco;

    @Override
    public String toString() {
        return nome + " - R$" + preco ;
    }


    @Override
    public boolean equals(Object obj){

        if (!(obj instanceof Produto)) {
            return false;
        }

        Produto outroProduto = (Produto) obj;

        return nome.equals(outroProduto.nome) && preco == outroProduto.preco;
    }

    @Override
    public int hashCode(){

        return Objects.hash(nome,preco);
    }

    @Override
    public int compareTo(Produto produto) {
        return Double.compare(preco,produto.preco);
    }
}
