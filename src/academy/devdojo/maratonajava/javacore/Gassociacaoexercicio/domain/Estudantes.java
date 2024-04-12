package academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.domain;

public class Estudantes {
    private String nome;
    private int idade;
    private Seminarios seminarios;

    public Estudantes(String nome) {
        this.nome = nome;
    }

    public Estudantes(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Estudantes(String nome, int idade, Seminarios seminarios) {
        this.nome = nome;
        this.idade = idade;
        this.seminarios = seminarios;
    }

    public void setNome(String nome) {this.nome = nome;}
    public void setIdade(int idade) {this.idade = idade;}
    public void setSeminarios(Seminarios seminarios){this.seminarios = seminarios;}

    public String getNome(){return nome;}
    public int getIdade() {return idade;}
    public Seminarios getSeminarios() {return seminarios;}
}
