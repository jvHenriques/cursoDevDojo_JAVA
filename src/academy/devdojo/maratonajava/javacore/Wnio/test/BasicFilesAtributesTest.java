package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAtributesTest {
    public static void main(String[] args) throws IOException {
        //BasicFileAttributes, DosFileAttributes, PosixFileAttributes
        //BasicFileAttributesView, DosFileAttributesView, PosixFileAttributesView    <---- metodos que pode fazer alteração

        Path pasta2 = Paths.get("pasta2");

        if (Files.notExists(pasta2)) {
            Path directory = Files.createDirectory(pasta2);
            System.out.println(directory);
        }

        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("pasta2/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());


        Path path = Paths.get("pasta2/novo_path.txt");
        if (Files.notExists(path)) {
            Files.createFile(path);
        }
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);

        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
    }
}
