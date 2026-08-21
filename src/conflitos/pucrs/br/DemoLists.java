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

    boolean hasRepeat(ArrayList<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i).equals(l.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> resultado = new ArrayList<>(l1);
        for (Integer el : l2) {
            if (!resultado.contains(el)) {
                resultado.add(el);
            }
        }
        return resultado;
    }

    int nroRepeat(ArrayList<Integer> l) {
        return listRepeat(l).size();
    }

    ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> resultado = new ArrayList<>();
        for (Integer el : l1) {
            if (l2.contains(el) && !resultado.contains(el)) {
                resultado.add(el);
            }
        }
        return resultado;
    }

}