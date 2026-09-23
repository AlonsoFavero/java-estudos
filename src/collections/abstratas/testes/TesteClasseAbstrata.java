package collections.abstratas.testes;

public class TesteClasseAbstrata {
    public static void main(String[] args){

        Animal animal = new Cachorro();

        animal.fazerSom();
    }
    static abstract class Animal{

      abstract void fazerSom();
    }

   static class Cachorro extends Animal{

        @Override
        void fazerSom() {

            System.out.println("Au au");
        }
    }
}
