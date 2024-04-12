package academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.domain.Estudantes;
import academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.domain.Professores;
import academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.domain.Seminarios;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua laranjeiras");
        Estudantes estudante1 = new Estudantes("arthur", 19);
        Estudantes estudante2 = new Estudantes("bruno", 19);
        Estudantes estudante3 = new Estudantes("lucas", 19);

//        estudante1.nome = "jose";


        Professores professor = new Professores("Jiraya", "relações Humanas");
        Estudantes[] estudantes = {estudante1, estudante2, estudante3};

        Seminarios seminarioo = new Seminarios("ADS",estudantes,local,professor);
        Seminarios seminarioo2 = new Seminarios("projeto",estudantes,local,professor);
        Seminarios[] seminariosArray = {seminarioo,seminarioo2};

        Seminarios[] seminarios = {seminarioo};

        professor.setSeminarios(seminariosArray);

        professor.imprime();


    }
}
