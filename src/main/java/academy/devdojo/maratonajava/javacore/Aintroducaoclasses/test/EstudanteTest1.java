package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest1 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.idade = 22;
        estudante.sexo = 'M';
        estudante.nome = "Jorge";

        System.out.println("nome: " + estudante.nome + " idade: " + estudante.idade + " sexo: "+estudante.sexo);
    }
}
