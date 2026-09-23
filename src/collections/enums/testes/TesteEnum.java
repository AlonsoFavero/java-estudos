package collections.enums.testes;

public class TesteEnum {
    public static void main(String[] args){

        Status status = Status.APROVADO;

        System.out.println(status);
    }

    enum Status{
        PENDENTE,
        APROVADO,
        CANCELADO

    }

}
