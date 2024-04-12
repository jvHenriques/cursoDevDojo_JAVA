package academy.devdojo.maratonajava.javacore.ZZEstreams.test;


import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//ao trabalhar com stream, ao usar, ele é basicamente fechado, sendo preciso chamar novamente

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Overgarden", 5.99),
            new LightNovel("No Game No Life", 2.99),
            new LightNovel("Fullmetal Alchemst", 5.99),
            new LightNovel("Kumo Desuka", 1.99),
            new LightNovel("Kumo Desuka", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
//        lightNovels.stream().forEach(ln -> System.out.println(ln));                                    //desperdicio
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(ln -> System.out.println(ln));

        long count = stream.filter(ln -> ln.getPrice() <= 4)
                .count();

        long count2 = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 4).count();

        System.out.println(count);
        System.out.println(count2);
    }
}
