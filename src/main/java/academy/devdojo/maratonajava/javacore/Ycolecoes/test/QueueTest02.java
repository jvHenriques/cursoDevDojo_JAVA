package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaByPriceComparater().reversed());
        mangas.add(new Manga(5L,"Hellsing Ultimate",19.99));
        mangas.add(new Manga(1L, "Berseck",9.5));
        mangas.add(new Manga(4L,"Attak on titan",3.2));
        mangas.add(new Manga(3L,"Pokemon",11.20));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
