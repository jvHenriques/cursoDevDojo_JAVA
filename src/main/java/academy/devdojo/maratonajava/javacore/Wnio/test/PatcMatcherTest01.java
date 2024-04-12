package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.*;

public class PatcMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");

        mather(path1,"glob:*.bkp");
        mather(path1,"glob:**/*.bkp");
        mather(path1,"glob:**/*.{bkp,txt,java}");
        mather(path2,"glob:**/*.{bkp,txt,java}");
        mather(path3,"glob:**/*.{bkp,txt,java}");
        mather(path1,"glob:**/*.???");
        mather(path2,"glob:**/*.???");
        mather(path3,"glob:**/*.???");
        mather(path3,"glob:**/*file.????");
    }

    public static void mather(Path path, String glob){
        PathMatcher match = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + match.matches(path));
    }
}
