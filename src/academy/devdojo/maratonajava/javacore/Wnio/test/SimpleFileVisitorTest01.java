package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
//        System.out.println(file.getFileName()); -> padrão
//        String regex = ".*\\.java$";
//        String fileString = file.getFileName().toString();
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(fileString);
//        while (matcher.find()){
//            System.out.println(matcher.group() + " ");
//        }
        if (file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    public static void main(String[] args) {
        Path root = Paths.get(".");
        try {
            Files.walkFileTree(root, new ListJavaFiles());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
