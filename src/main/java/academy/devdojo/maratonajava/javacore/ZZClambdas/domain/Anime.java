package academy.devdojo.maratonajava.javacore.ZZClambdas.domain;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;

public class Anime {
    private String tittle;
    private int episodes;

    public Anime(String name, int quantity) {
        this.tittle = name;
        this.episodes = quantity;
    }



    @Override
    public String toString() {
        return "Anime{" +
                "tittle='" + tittle + '\'' +
                ", quantity=" + episodes +
                '}';
    }

    public String getTittle() {
        return tittle;
    }

    public int getEpisodes() {
        return episodes;
    }
}
