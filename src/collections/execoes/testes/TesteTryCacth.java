package collections.execoes.testes;

public class TesteTryCacth {
    public static void main(String[] args){

        try{

            int resultado = 10 / 0;

        }catch(ArithmeticException e){

            System.out.println(e);
        }finally {
            System.out.println("finalizando execução");
        }

        int valor = -1;

        if(valor < 0){
            erro();
        }
    }

    static void erro() throws IllegalArgumentException{
        throw new IllegalArgumentException("mensagem de erro");
    }
}
