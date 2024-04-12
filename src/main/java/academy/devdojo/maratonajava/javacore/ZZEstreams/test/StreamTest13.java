package academy.devdojo.maratonajava.javacore.ZZEstreams.test;


import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Cathegory;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy
                (ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));

        System.out.println(collect);
//      Map<Cathegory, Map<Promotion, List<LightNovel>>>

        Map<Cathegory, Map<Promotion, List<LightNovel>>> collect1 =
                lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCathegory,
                        Collectors.groupingBy
                        (ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));

        System.out.println(collect1);

    }
}




//        Map<Promotion, List<LightNovel>> promotionListMap = new HashMap<>();
//        List<LightNovel> underPromotion = new ArrayList<>();
//        List<LightNovel> normalPrice = new ArrayList<>();
//
//        for (LightNovel lightNovel : lightNovels) {
//            if (lightNovel.getPrice() >= 6){
//                lightNovel.setPromotion(Promotion.UNDER_PROMOTION);
//                underPromotion.add(lightNovel);
//            }else{
//                lightNovel.setPromotion(Promotion.NORMAL_PRICE);
//                normalPrice.add(lightNovel);
//            }
//        }
//
//        promotionListMap.put(Promotion.UNDER_PROMOTION, underPromotion);
//        promotionListMap.put(Promotion.NORMAL_PRICE, normalPrice);
//        System.out.println(promotionListMap);

