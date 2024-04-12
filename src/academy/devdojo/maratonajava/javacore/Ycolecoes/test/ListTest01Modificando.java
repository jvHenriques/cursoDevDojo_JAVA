package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01Modificando {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("William");
        nomes.add("Dev dojo");
        nomes2.add("suane");
        nomes2.add("Academy");

        nomes.addAll(nomes2);
        System.out.println(nomes);
//        System.out.println(nomes.remove("William"));

        for (String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("--------------");

        int size = nomes.size();

//        nomes.add("suanne");
        for (int i = 0; i < size; i++) {
            nomes.add("suanne");
            System.out.println(nomes.get(i));
        }

        System.out.println(nomes);
    }
}
