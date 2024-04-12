package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZDoptional.Repository.MangaRepository;
import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
//        MangaRepository.findByTittle("Boku no Hero").ifPresent(m -> m.setTittle("Boku no Hero 2"));
        Optional<Manga> mangaByTittle = MangaRepository.findByTittle("Boku no Hero");
        mangaByTittle.ifPresent(m -> m.setTittle("Boku no Hero 2"));
        System.out.println(mangaByTittle);

        MangaRepository.findById(3).orElseThrow(IllegalArgumentException::new);

        Manga newManga = MangaRepository.findByTittle("Drifters").orElse(new Manga("Drifters", 3, 34));
        System.out.println(newManga);
    }
}
