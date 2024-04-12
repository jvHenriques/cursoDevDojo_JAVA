package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        ImpressoraEstudante imprimeestudantes = new ImpressoraEstudante();

        estudante1.idade= 15;
        estudante1.nome = "Midorya";
        estudante1.sexo ='M';

        Estudante estudante2 = new Estudante();

        estudante2.idade= 16;
        estudante2.nome = "Sakura";
        estudante2.sexo ='F';

        imprimeestudantes.imprimeDados(estudante1);
        System.out.println(" ");
        imprimeestudantes.imprimeDados(estudante2);
        System.out.println(" ");


        /*System.out.println("________________________");
        imprimeestudantes.imprimeDados02(estudante1.nome,estudante1.idade, estudante1.sexo);*/
    }
}
