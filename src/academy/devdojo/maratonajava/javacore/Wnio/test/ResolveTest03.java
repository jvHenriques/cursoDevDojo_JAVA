package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/vini/");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/vini/");
        Path relatico = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1 " + absoluto.resolve(resolve));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relatico.resolve(absoluto));
        System.out.println("4 " + relatico.resolve(file));
        System.out.println("5 " + file.resolve(absoluto));
        System.out.println("5 " + file.resolve(relatico));
    }
}
