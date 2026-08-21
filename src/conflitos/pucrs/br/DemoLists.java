package conflitos.pucrs.br;

import java.util.ArrayList;

public class DemoLists {

    int nOcorrencias(ArrayList<Integer> l, Integer el) {
        int count = 0;
        for (Integer i : l) {
            if (i.equals(el)) {
                count++;
            }
        }
        return count;
    }

    ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> repetidos = new ArrayList<>();
        for (Integer el : l) {
            if (nOcorrencias(l, el) > 1 && !repetidos.contains(el)) {
                repetidos.add(el);
            }
        }
        return repetidos;
    }

}