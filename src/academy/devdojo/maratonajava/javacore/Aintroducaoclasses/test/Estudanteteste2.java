package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class Estudanteteste2 {
    public static void main(String[] args) {
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Italo";
        estudante2.idade = 22;
        estudante2.sexo = 'M';

        System.out.println("nome: " + estudante2.nome + " idade: " + estudante2.idade + " sexo: "+estudante2.sexo);
    }
}
