package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pathPast = Paths.get("pastaa");                                       //dado a pasta que deseja criar

        if (Files.notExists(pathPast)) {
            Path pastaDirectories = Files.createDirectories(pathPast);               //criação da pasta->diretorio)
        }
        Path subPatch = Paths.get("pastaa/subSastas/subSubPastas");           //dada as pastar e subpastas deseja criar
        Path subPatchDiretory = Files.createDirectories(subPatch);                //criação das pastas+subpastas

        Path filePath = Paths.get(subPatch.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_rename.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
    }
}
