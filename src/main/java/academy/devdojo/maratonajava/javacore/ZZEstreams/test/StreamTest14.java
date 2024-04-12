package academy.devdojo.maratonajava.javacore.ZZEstreams.test;


import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Cathegory;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shitara", 8.99, Cathegory.FANTASY),
            new LightNovel("Overlord", 3.99, Cathegory.FANTASY),
            new LightNovel("Violet Overgarden", 5.99, Cathegory.DRAMA),
            new LightNovel("No Game No Life", 2.99, Cathegory.FANTASY),
            new LightNovel("Fullmetal Alchemst", 5.99, Cathegory.FANTASY),
            new LightNovel("Kumo Desuka", 1.99, Cathegory.FANTASY),
            new LightNovel("Kumo Desuka", 1.99, Cathegory.FANTASY),
            new LightNovel("Monogatari", 4.00, Cathegory.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Cathegory, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCathegory, Collectors.counting()));
        System.out.println(collect);

        Map<Cathegory, Optional<LightNovel>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCathegory,
                Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Cathegory, LightNovel> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCathegory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Cathegory, LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCathegory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }
}