package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ClassesAlls2 extends SimpleFileVisitor<Path> {
    private static PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{file*}.{java,class}");
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//        String glob = "**/*{file*}.{java,class}";
//        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
//        System.out.println(matcher.matches(file));
//        if (file.getFileName().endsWith(glob)){
//            System.out.println(file.getFileName());
//        }
        if (matcher.matches(file)){
            System.out.println(file.getFileName());
        }


        return FileVisitResult.CONTINUE;
    }
}

public class PatcMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get(".");

        Files.walkFileTree(path1, new ClassesAlls2());
    }

//    public static void match(Path path , String glob){
//        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
//        System.out.println(matcher.matches(path));
//    }
}
