package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class Jogadortest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("cafu");
        Jogador jogador3 = new Jogador("Romario");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};

        for (Jogador jogadoresss:jogadores){
            jogadoresss.imprime();
        }
    }
}
