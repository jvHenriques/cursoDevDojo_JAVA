package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
        return smartphone1.getMarca().compareTo(smartphone2.getMarca());
    }
}

class MangaByPriceComparater implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(),o2.getPreco());
    }
}

public class NavigableTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphonesSet = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "nokia");
        smartphonesSet.add(smartphone);

        System.out.println(smartphonesSet);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaByPriceComparater());
        mangas.add(new Manga(5L,"Hellsing Ultimate",19.99));
        mangas.add(new Manga(1L, "Berseck",9.5));
        mangas.add(new Manga(4L,"Attak on titan",3.2));
        mangas.add(new Manga(3L,"Pokemon",11.20));
        mangas.add(new Manga(2L,"Dragon Ball Z",2.99));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L, "Yuyu Hakasho", 3.2, 5);
        System.out.println("---------------------------------------------------------");

        //lower <
        //floor <=
        //higher >
        //ceiling >=

        System.out.println(mangas.lower(yuyu));          //traz um valor inferior proximo ao passado
        System.out.println(mangas.floor(yuyu));          //traz um valor inferior ou igual ao passado
        System.out.println(mangas.higher(yuyu));          //traz um valor superior proximo ao passado
        System.out.println(mangas.ceiling(yuyu));          //traz um valor superior ou igual ao passado
        System.out.println("------------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());             //retorna e remove o elemento da lista -> first primeiro | last ultimo
        System.out.println(mangas.size());

    }
}
