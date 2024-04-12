package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangabeByIdComparator mangabeByIdComparator = new MangabeByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L,"Hellsing Ultimate",19.99));
        mangas.add(new Manga(1L, "Berseck",9.5));
        mangas.add(new Manga(4L,"Attak on titan",3.2));
        mangas.add(new Manga(3L,"Pokemon",11.20));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99));

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaBySearch = new Manga(6L, "Dragon Ball Z", 2.99);

        System.out.println(Collections.binarySearch(mangas,mangaBySearch,mangabeByIdComparator));

    }
}
