package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("William");
        nomes.add("Dev dojo Academy");

        for (String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("--------------");
        nomes.add("suanne");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
