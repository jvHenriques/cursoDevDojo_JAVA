package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.services.AnimesComparator;

import java.util.ArrayList;
import java.util.List;
//reference to Static Method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berseck", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
//        animeList.sort((a1, a2) -> a1.getTittle().compareTo(a2.getTittle()));
        animeList.sort(AnimesComparator::compareByTittle);
        animeList.sort(AnimesComparator::compareByEp);
        System.out.println(animeList);
    }
}
