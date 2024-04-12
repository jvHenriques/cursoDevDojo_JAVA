package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Midorya");
        lista.add("Midorya");

        for (String o : lista) {
            System.out.println(o);
        }

        addc(lista, new Consumidor("Midorya"));

        for (Object o : lista) {
            System.out.println(o);
        }


    }

    public static void addc(List list , Consumidor consumidor){
        list.add(consumidor);

    }
}
