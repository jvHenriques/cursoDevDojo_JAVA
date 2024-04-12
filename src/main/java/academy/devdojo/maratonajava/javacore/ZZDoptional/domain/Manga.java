package academy.devdojo.maratonajava.javacore.ZZDoptional.domain;

import java.util.Objects;

public class Manga {
    private String tittle;
    private Integer id;
    private int chapters;

    public Manga(String tittle, Integer id, int chapters) {
        this.tittle = tittle;
        this.id = id;
        this.chapters = chapters;
    }

    public Manga(String tittle, int id, int chapters) {
        this.tittle = tittle;
        this.id = id;
        this.chapters = chapters;
    }


    @Override
    public String toString() {
        return "Manga{" +
                "tittle='" + tittle + '\'' +
                ", id=" + id +
                ", chapters=" + chapters +
                '}';
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public String getTittle() {
        return tittle;
    }
}


