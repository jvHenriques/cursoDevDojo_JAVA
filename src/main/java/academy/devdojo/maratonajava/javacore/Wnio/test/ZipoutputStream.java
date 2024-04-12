package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipoutputStream {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivoParaZipar = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(arquivoZip,arquivoParaZipar);
    }

    public static void zip(Path arquivoZip, Path arquivoParaZipar){
        try (ZipOutputStream zipStram = new ZipOutputStream(Files.newOutputStream(arquivoZip))){
            DirectoryStream<Path> diretory = Files.newDirectoryStream(arquivoParaZipar);
            for (Path path : diretory) {
                System.out.println(path.getFileName());
                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
                zipStram.putNextEntry(zipEntry);
                Files.copy(path,zipStram);
                zipStram.closeEntry();

            }
            System.out.println("arquivo criado com sucesso!");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
