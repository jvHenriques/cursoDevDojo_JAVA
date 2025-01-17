package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("Dev dojo Academy");

        Manga manga1 = new Manga(5L,"Hellsing Ultimate",19.99);
        Manga manga2 = new Manga(1L, "Berseck",9.5);
        Manga manga3 = new Manga(4L,"Attak on titan",3.2);
        Manga manga4 = new Manga(3L,"Pokemon",11.20);
        Manga manga5 = new Manga(2L,"Dragon Ball Z",2.99);

        List<Manga> consumidor1listMangas = List.of(manga1,manga3,manga5);
        List<Manga> consumidor2listMangas = List.of(manga3,manga4);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,consumidor1listMangas);
        consumidorManga.put(consumidor2,consumidor2listMangas);

        for (Map.Entry<Consumidor,List<Manga>> entry: consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }

        }
    }
}
