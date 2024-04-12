package academy.devdojo.maratonajava.javacore.Xserialização.test;

import academy.devdojo.maratonajava.javacore.Xserialização.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Xserialização.domain.Turma;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class  SerializacionTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Wiliiam Suanne", "123412121");
//        Aluno aluno1 = new Aluno(1L, "arthur", "123412121"); Path path2 = Paths.get("pasta/alunos2.ser");
//        Aluno aluno2 = new Aluno(1L, "Wanderley", "123412121");Path path3 = Paths.get("pasta/alunos3.ser");
        Turma turma = new Turma("Maratona Java Virado no Jiraya");
//        serializar(aluno);
//        serializar(aluno1,path2);
//        serializar(aluno2,path3);
        desserializar();
     }

    public static void serializar(Aluno aluno){
//        public static void serializar(Aluno aluno, Path path){
        Path path = Paths.get("pasta/alunos.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
//            path = Paths.get("pasta/alunos.ser"+1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void desserializar(){
        Path path = Paths.get("pasta/alunos.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
