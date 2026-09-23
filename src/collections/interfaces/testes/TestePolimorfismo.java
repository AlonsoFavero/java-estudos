package collections.interfaces.testes;

public class TestePolimorfismo {
    public static void main(String[] args){

        Animal animal = new Cachorro();

        animal.fazerSom();

        System.out.println("au au");
    }

    interface Animal{

        void fazerSom();
    }

    static class Cachorro implements Animal{
        @Override
        public void fazerSom() {

        }
    }
}
