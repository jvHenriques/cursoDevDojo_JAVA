package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class Professortest1 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.idade = 35;
        professor.nome = "Airton";
        professor.sexo = 'M';

        System.out.println("nome: " + professor.nome + " idade: " + professor.idade + " sexo: "+professor.sexo);
    }
}
