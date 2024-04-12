package academy.devdojo.maratonajava.javacore.ZZClambdas.services;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
public class AnimesComparator {
    public static int compareByTittle(Anime a1, Anime a2) {
        return a1.getTittle().compareTo(a2.getTittle());
    }

    public static Integer compareByEp(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public Integer compareByEpNoStatic(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
