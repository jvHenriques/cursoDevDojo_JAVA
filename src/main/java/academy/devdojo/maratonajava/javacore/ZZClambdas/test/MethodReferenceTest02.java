package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.services.AnimesComparator;

import java.util.ArrayList;
import java.util.List;

//reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        //chamando a partir de um objeto
        AnimesComparator animesComprator = new AnimesComparator();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berseck", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));

        animeList.sort(animesComprator::compareByEpNoStatic);
        animeList.sort((a1,a2) -> animesComprator.compareByEpNoStatic(a1,a2));
        System.out.println(animeList);
    }
}
