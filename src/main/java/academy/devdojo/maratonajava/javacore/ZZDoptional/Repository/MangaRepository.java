package academy.devdojo.maratonajava.javacore.ZZDoptional.Repository;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static ArrayList<Manga> mangas = new ArrayList<>(List.of(new Manga("Boku no Hero", 1, 50), new Manga("Overlod", 1, 500), new Manga("Pirata que estica", 3, 2000)));

    public static Optional<Manga> findByTittle(String tittle) {
        return findBy(m -> m.getTittle().equals(tittle));
    }

    public static Optional<Manga> findById(Integer id) {
        return findBy(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }



}
