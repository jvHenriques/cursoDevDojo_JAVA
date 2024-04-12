package academy.devdojo.maratonajava.javacore.Xserialização.domain;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {
    private long id;
    private String nome;
    private transient String passWord;
    private transient   Turma turma;

    public Aluno(long id, String nome, String passWord) {
        this.id = id;
        this.nome = nome;
        this.passWord = passWord;
    }

    private void writeObject(ObjectOutputStream oos){
         try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getName());
         }catch (IOException e){
             e.printStackTrace();
         }
    }

    private void readObject(ObjectInputStream ois){
         try {
            ois.defaultReadObject();
            String nomaTurma = ois.readUTF();
            turma = new Turma(nomaTurma);
         }catch (IOException | ClassNotFoundException e){
             e.printStackTrace();
         }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", passWord='" + passWord + '\'' +
                ", turma='" + turma + '\'' +
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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
