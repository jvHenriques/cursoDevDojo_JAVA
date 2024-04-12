package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static  int[] episodios;
    static {
        System.out.println("dentro do bloco de inicialização");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    static {
        System.out.println("dentro do bloco de inicialização 2");

    }
    static {
        System.out.println("dentro do bloco de inicialização 3");


    }
    public Anime(){
        Anime.episodios = new int [100];
        for (int i = 0; i < Anime.episodios.length; i++) {
            episodios[i] = i + 1;
            System.out.print(Anime.episodios[i] + " ");
        }
        System.out.println();
    }
    public Anime(String nome){

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
