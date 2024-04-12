package academy.devdojo.maratonajava.javacore.ZZEstreams.test;


import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Cathegory;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Cathegory,List<LightNovel>> cathegoryLightNovelMap = new HashMap<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCathegory()){
                case DRAMA: drama.add(lightNovel); break;
                case FANTASY: fantasy.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }
        }

        cathegoryLightNovelMap.put(Cathegory.DRAMA,drama);
        cathegoryLightNovelMap.put(Cathegory.FANTASY,fantasy);
        cathegoryLightNovelMap.put(Cathegory.ROMANCE,romance);
        System.out.println(cathegoryLightNovelMap);

        Map<Cathegory, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCathegory));
        System.out.println(collect);
    }
}
