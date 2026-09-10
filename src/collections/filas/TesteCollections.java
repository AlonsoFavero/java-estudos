package collections.filas;

import java.util.*;

public class TesteCollections {
    public static void main(String[] args){

     ArrayList<String> nomesClientes = new ArrayList<>();
     HashSet<String> nomeUnicos = new HashSet<>();
     TreeSet<Integer> numerosOrdenados = new TreeSet<>();
     HashMap<Integer, String> clientePorId = new HashMap<>();
     Queue<String> filaCliente = new LinkedList<>();

        filaCliente.offer("João");
        filaCliente.offer("Maria");
        filaCliente.offer("Pedro");

        clientePorId.put(1,"João");
        clientePorId.put(2, "Maria");
        clientePorId.put(3, "Pedro");

        numerosOrdenados.add(50);
        numerosOrdenados.add(10);
        numerosOrdenados.add(30);
        numerosOrdenados.add(20);
        numerosOrdenados.add(40);
        numerosOrdenados.add(10);

        nomeUnicos.add("João");
        nomeUnicos.add("Maria");
        nomeUnicos.add("Pedro");
        nomeUnicos.add("João");

        nomesClientes.add("João");
        nomesClientes.add("Maria");
        nomesClientes.add("Pedro");
        nomesClientes.add("João");

        System.out.println(filaCliente.peek());
        System.out.println(filaCliente);
        System.out.println(filaCliente.poll());
        System.out.println(filaCliente);
        System.out.println(clientePorId);
        System.out.println(clientePorId.get(2));
        System.out.println(numerosOrdenados);
        System.out.println(nomeUnicos);
        System.out.println(nomesClientes);
        System.out.println(nomesClientes.get(1));
    }
}
