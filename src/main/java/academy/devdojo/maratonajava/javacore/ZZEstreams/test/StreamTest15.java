package academy.devdojo.maratonajava.javacore.ZZEstreams.test;


import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Cathegory;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class StreamTest15 {
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
        Map<Cathegory, DoubleSummaryStatistics> collect = lightNovels.stream().collect(groupingBy(LightNovel::getCathegory,
                Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);
        //Map<Cathegory, List<Promotion>>
        Map<Cathegory, Set<Promotion>> collect1 = lightNovels.stream().
                collect(groupingBy(LightNovel::getCathegory, mapping(StreamTest15::getPromotion, Collectors.toSet())));
        System.out.println(collect1);

        Map<Cathegory, LinkedHashSet<Promotion>> collect2 = lightNovels.stream().
                collect(groupingBy(LightNovel::getCathegory, mapping(StreamTest15::getPromotion,
                        Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
    }

    private static Promotion getPromotion(LightNovel ln){return  ln.getPrice() <6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;}
}