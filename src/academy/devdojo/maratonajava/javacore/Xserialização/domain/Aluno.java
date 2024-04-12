package academy.devdojo.maratonajava.javacore.Xserialização.domain;

import java.io.Serializable;

public class Aluno implements Serializable {
    private long id;
    private String nome;
    private transient String passWord;

    public Aluno(long id, String nome, String passWord) {
        this.id = id;
        this.nome = nome;
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
