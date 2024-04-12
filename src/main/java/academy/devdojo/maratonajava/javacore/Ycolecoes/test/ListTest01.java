package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("William");
        nomes.add("Dev dojo Academy");
//        nomes.remove("william");
        nomes2.add("Suanne");
        nomes2.add("Acad emy");

        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("--------------");

        nomes.add("suanne");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("--------------");
        System.out.println(removerRepetidos(nomes, nomes2));
    }

    private static List<String> removerRepetidos(List<String> nomes, List<String> nomes2) {
        List<String> novaListNomes = new ArrayList<>();
        for (int i = 0; i < nomes.size(); i++) {
            if (!novaListNomes.contains(nomes.get(i))) {
                novaListNomes.add(nomes.get(i));
            }
            for (int j = 0; j < nomes2.size(); j++) {
                if (!novaListNomes.contains(nomes2.get(j))) {
                    novaListNomes.add(nomes2.get(j));
                }
            }
        }

        return novaListNomes;
    }
}
