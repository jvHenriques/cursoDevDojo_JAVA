package academy.devdojo.maratonajava.javacore.Vio;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("criação "+isCreated);
            System.out.println("path: " + file.getPath());
            System.out.println("absolute path: " + file.getAbsolutePath());
            System.out.println("is Diretory: " + file.isDirectory());
            System.out.println("is File: " + file.isFile());
            System.out.println("is hiden: " + file.isHidden());
            System.out.println("last modifcated: " + Instant.ofEpochSecond(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean delete = file.delete();
            if (delete){
                System.out.println("deleted: " + delete);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
