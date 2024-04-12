package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class Jogadortest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("pele");
        Jogador[] jogadores = {jogador,jogador2};

        Time time1 = new Time("Brasil F.c");

        jogador.setTime(time1);
        jogador2.setTime(time1);
        time1.setJogadores(jogadores);

        System.out.println("---JOGADORES---");
        jogador.imprime();
        jogador2.imprime();
        System.out.println("---TIME---");
        time1.imprime();

    }
}
