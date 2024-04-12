package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("José Alcantara", "Catarina Melo", "Josiely Camps");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Edisson", "Gustavo Lima", "Gustavo Mendes", "Guilherme");

        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }

        }
        System.out.println("_______________________________________");
        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);



    }
}
