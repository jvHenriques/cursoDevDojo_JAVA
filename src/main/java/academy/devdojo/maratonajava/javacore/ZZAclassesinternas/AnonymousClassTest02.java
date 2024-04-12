package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;


import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class BarcoNameComparator implements Comparator<Barco>{
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonymousClassTest02 {
    public static void main(String[] args) {
//        Animal animal = new Animal()
//        {
//            @Override
//            public void walk() {
//                System.out.println("Walking in the shadows");
//            }
//        };

        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

//        barcoList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
//        barcoList.sort(Comparator.comparing(Barco::getNome));
        barcoList.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        System.out.println(barcoList);


    }
}
