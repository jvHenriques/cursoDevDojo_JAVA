package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangabeByIdComparator implements Comparator<Manga>{
    @Override
    public int compare(Manga manga01, Manga manga02) {
        return manga01.getId().compareTo(manga02.getId());
    }
}

public class MangaSortedTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Hellsing Ultimate",19.99));
        mangas.add(new Manga(1L, "Berseck",9.5));
        mangas.add(new Manga(4L,"Attak on titan",3.2));
        mangas.add(new Manga(3L,"Pokemon",11.20));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------------");

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


        Collections.sort(mangas, new MangabeByIdComparator());
        System.out.println("--------------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
