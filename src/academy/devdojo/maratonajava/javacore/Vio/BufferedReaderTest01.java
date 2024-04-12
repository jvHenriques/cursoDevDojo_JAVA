package academy.devdojo.maratonajava.javacore.Vio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("file.txt");
             BufferedReader br = new BufferedReader(fr)){
            String linha;
//            br.readLine();
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
