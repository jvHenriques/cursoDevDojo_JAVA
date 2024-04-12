package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DiretoryStreamTest01 {
    public static void main(String[] args) {
        //maneira fácil de percorrer todos os arquivos contidos no diretoio/arquivo.     -> se quiser percorrer as classes dentro dos arquivos tem uma classe mais especifica = SimpleFileVisitor
        Path dir = Paths.get(".");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path1 : stream) {
                System.out.println(path1);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
