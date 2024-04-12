package academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.domain;

public class Seminarios {
    private String titulo;
    private Estudantes[] estudantes;
    private Professores professores;
    private Local local;

    public Seminarios(String titulo) {
        this.titulo = titulo;
    }

    public Seminarios(String titulo, Estudantes[] estudantes) {
        this.titulo = titulo;
        this.estudantes = estudantes;
    }

    public Seminarios(String titulo, Estudantes[] estudantes, Local local) {
        this.titulo = titulo;
        this.estudantes = estudantes;
        this.local = local;
    }


    public Seminarios(String titulo, Estudantes[] estudantes, Local local, Professores professores) {
        this.titulo = titulo;
        this.estudantes = estudantes;
        this.professores = professores;
        this.local = local;
    }

    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setEstudantes(Estudantes[] estudantes) {this.estudantes = estudantes;}
    public void setProfessores(Professores professores) {this.professores = professores;}
    public void setLocal(Local local) {this.local = local;}


    public String getTitulo() {return titulo;}

    public Estudantes[] getEstudantes() {return estudantes;}

    public Professores getProfessores() {return professores;}

    public Local getLocal() {return local;}
}
