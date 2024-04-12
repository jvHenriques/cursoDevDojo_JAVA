package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();

        estudante1.idade= 15;
        estudante1.nome = "Midorya";
        estudante1.sexo ='M';

        Estudante estudante2 = new Estudante();

        estudante2.idade= 16;
        estudante2.nome = "Sakura";
        estudante2.sexo ='F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
