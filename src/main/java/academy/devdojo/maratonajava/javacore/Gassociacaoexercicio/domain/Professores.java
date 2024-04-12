package academy.devdojo.maratonajava.javacore.Gassociacaoexercicio.domain;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminarios[] seminarios;

    public Professores(String nome) {
        this.nome = nome;
    }

    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professores(String nome, String especialidade, Seminarios[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (this.seminarios == null)return;
        System.out.println("##SEMINARIO CADASTRADO");

        for (Seminarios seminarios1: this.seminarios){
            System.out.println("Professor: " + this.nome);
            System.out.println("Especialidade: " + this.especialidade);
            System.out.println("##SEMINARIO CADASTRADO:");
            System.out.println(seminarios1.getTitulo());
            System.out.println("local: " + seminarios1.getLocal().getEndereco());

            if (seminarios1.getEstudantes()==null)continue;

            System.out.println("alunos: ");
            for (Estudantes estudante : seminarios1.getEstudantes()) {
                System.out.println( estudante.getNome()+" - idade: "+estudante.getIdade());
            }
            System.out.println();

        }

    }

    public void setNome(String nome) {this.nome = nome;}
    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}

    public void setSeminarios(Seminarios[] seminarios) {this.seminarios = seminarios;}

    public String getNome(String nome) {return nome;}

    public String getEspecialidade() {return especialidade;}

    public Seminarios[] getSeminarios() {return seminarios;}
}
