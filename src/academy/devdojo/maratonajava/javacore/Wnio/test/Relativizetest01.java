package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Relativizetest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/vini");
        Path clazz = Paths.get("/home/vini/cursodevdojo/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/vini");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/vini/cursodevdojo/OlaMundo.java");
        Path relativize1 = Paths.get("temp");
        Path relarivize2 = Paths.get("temp/temp.2021921");

        System.out.println("1 "+absoluto1.relativize(absoluto3));
        System.out.println("1 "+absoluto3.relativize(absoluto1));
        System.out.println("1 "+absoluto1.relativize(absoluto2));
        System.out.println("1 "+relativize1.relativize(relarivize2));
//        System.out.println("1 "+absoluto1.relativize(relativize1));

    }
}
