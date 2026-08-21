package conflitos.pucrs.br;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        DemoLists demo = new DemoLists();

        ArrayList<Integer> l = new ArrayList<>();
        l.add(1); l.add(2); l.add(3); l.add(2); l.add(4); l.add(1);

        System.out.println("Lista: " + l);
        System.out.println("Ocorrencias do 2: " + demo.nOcorrencias(l, 2));
        System.out.println("Tem repetidos: " + demo.hasRepeat(l));
        System.out.println("Numero de repetidos: " + demo.nroRepeat(l));
        System.out.println("Lista de repetidos: " + demo.listRepeat(l));

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1); l1.add(2); l1.add(3);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(2); l2.add(3); l2.add(4);

        System.out.println("Uniao: " + demo.union(l1, l2));
        System.out.println("Interseccao: " + demo.intersect(l1, l2));
    }
}
