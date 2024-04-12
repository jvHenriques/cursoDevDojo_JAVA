package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.services.AnimesComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a Constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimesComparator> newAnimesComparator = AnimesComparator::new; //criação do objeto por reference method
        AnimesComparator animesComparator = newAnimesComparator.get(); // aqui o objeto é de fato criado(get)

        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berseck", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));

        animeList.sort(animesComparator::compareByEpNoStatic);
        System.out.println(animeList);

        BiFunction<String,Integer,Anime> animeBiFunction = (tittle, qnt) -> new Anime(tittle,qnt); // interface funcional do java, em que você passa duas coisas, e recebe uma terceira -> aqui atraves de lambdas
        BiFunction<String,Integer,Anime> animeBiFunction2 = Anime::new;                           // aqui por method reference

        System.out.println(animeBiFunction.apply("super Campeões" , 36));    // o apply se encarregou da criação do objeto de fato
    }
}
