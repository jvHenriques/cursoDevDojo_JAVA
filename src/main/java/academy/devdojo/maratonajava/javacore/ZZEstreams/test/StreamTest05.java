package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Gomu", "Gomu", "No", "Mi"));
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        Stream<String[]> collect = words.stream().map(w -> w.split(""));
        Stream<String> stream = Arrays.stream(letters);

        List<String> letters2 = words.stream()
                .map(w -> w.split("")) //Stream<String[]>
                .flatMap(Arrays::stream)    //Stream<String>
                .collect(Collectors.toList());

        System.out.println(letters2);

        Stream<String> limit = letters2.stream().limit(3);
        System.out.println(limit);
    }
}
