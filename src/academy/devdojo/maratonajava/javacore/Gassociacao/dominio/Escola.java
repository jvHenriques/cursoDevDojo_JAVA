package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;

    public void imprime() {
        System.out.println(this.nome);
        if (professores == null) return;
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }

    }


    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessor(Professor[] professor) {
        this.professores = professor;
    }


    public String getNome() {
        return nome;
    }

    public Professor[] getProfessor() {
        return professores;
    }
}
