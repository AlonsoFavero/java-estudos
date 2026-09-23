package collections.interfaces.testes;

public class TesteInterface {
    public static void main(String[] args){

    Cachorro cachorro = new Cachorro();

    cachorro.fazerSom();

    }

   public interface Animal{

        void fazerSom() ;
    }

    static class Cachorro implements Animal{

        @Override
        public void fazerSom() {

            System.out.println("au au");
        }
    }
}
