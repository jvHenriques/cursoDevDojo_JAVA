package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        System.out.println("dentro do bloco de inicialização");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
//            System.out.print(episodios[i] + " ");
        }
    }
    public Anime(String nome){
//        System.out.println(episodios);
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
            System.out.print(episodios[i] + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
