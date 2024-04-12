package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocoinicializacao.dominio.Anime;

public class Animeteste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("one pircing");

        System.out.println("\n" + anime.getNome());
        System.out.println(anime.getEpisodios());
    }
}
