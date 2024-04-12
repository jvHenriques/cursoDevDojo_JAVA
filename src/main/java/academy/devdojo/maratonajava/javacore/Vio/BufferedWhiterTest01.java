package academy.devdojo.maratonajava.javacore.Vio;

import java.io.*;

public class BufferedWhiterTest01 {
    public static void main(String[] args) {
        //file                  arquivo em si
        //fileWhiter            escrita no arquivo, de forma não tão otimizada
        //fileReader            leitura de arquivo
        //BufferedWhiter        escrita no arquivo com uma performace melhor
        //BufferedReader        leitura no arquivo com uma performace melhor
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("dev Dojo é muito lindo, o melhor curso Java do Brasillllll");
            bw.flush();                                                                          //pegue tudo que você tem e jogue --> uma forma de garantir que t/odo conteudo seja passado antes do fechamento do arquivo
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
