package collections.filas;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Deque;

public class TesteDesafioCollections {
    public static void main(String[] args){

        PriorityQueue<String> filaPrioridade = new PriorityQueue<>();
        Deque<String> filaDupla = new ArrayDeque<>();
        Deque<String> historico = new ArrayDeque<>();

        filaPrioridade.add("normal");
        filaPrioridade.add("urgente");
        filaPrioridade.add("normal");

        filaDupla.addFirst("Pedro");
        filaDupla.addFirst("João");
        filaDupla.addLast("Maria");

        historico.push("pagina 3");
        historico.push("pagina 2");
        historico.push("pagina 1");

        System.out.println(filaPrioridade);
        System.out.println(filaPrioridade.peek());
        System.out.println(filaPrioridade.poll());
        System.out.println(filaPrioridade);

        System.out.println(filaDupla);
        System.out.println(filaDupla.removeFirst());
        System.out.println(filaDupla.removeLast());
        System.out.println(filaDupla);

        System.out.println(historico);
        System.out.println(historico.peek());
        System.out.println(historico.pop());
        System.out.println(historico);
    }
}
