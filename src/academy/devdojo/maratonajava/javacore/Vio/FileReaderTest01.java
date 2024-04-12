package academy.devdojo.maratonajava.javacore.Vio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("file.txt")){
//            char[] in = new char[30];
//            fr.read(in);
//            for (char c : in){
//                System.out.print(c);
//            }
            int i = fr.read();
            while ((i= fr.read()) != -1){
                System.out.print((char) i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
