package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SortedListTest01 {
    public static void main(String[] args) {
        List<String> manga = new ArrayList<>();
        manga.add("Hellsing Ultimate");
        manga.add("Berseck");
        manga.add("Attak on titan");
        manga.add("Pokemon");
        manga.add("Dragon Ball Z");
        Collections.sort(manga);

        for (String anime : manga) {
            System.out.println(anime);
        }

        System.out.println("____________");

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

        Manga manga1 = new Manga(null,null,0);
    }
}
