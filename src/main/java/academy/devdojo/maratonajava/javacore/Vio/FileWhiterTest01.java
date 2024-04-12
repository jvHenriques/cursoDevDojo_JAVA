package academy.devdojo.maratonajava.javacore.Vio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWhiterTest01 {
    public static void main(String[] args) {
        //file                  arquivo em si
        //fileWhiter            escrita no arquivo, de forma não tão otimizada
        //fileReader            leitura de arquivo
        //BufferedWhiter        escrita no arquivo com uma performace melhor
        //BufferedReader        leitura no arquivo com uma performace melhor
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true)){
            fw.write("dev Dojo é muito lindo, o melhor curso Java do Brasil \ncontinuando a cantoria na linha seguinte");
            fw.flush();                                                                          //pegue tudo que você tem e jogue --> uma forma de garantir que t/odo conteudo seja passado antes do fechamento do arquivo
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
