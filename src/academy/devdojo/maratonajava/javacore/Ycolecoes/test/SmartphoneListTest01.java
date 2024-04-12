package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("3333", "Pixel");
        Smartphone s3 = new Smartphone("2222", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);
//        Collections.sort(smartphones);  //dara erro, qual a logica por tras, omo vai ser ordenado? nem voê nem o java sabe
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("3333", "Pixel");

        System.out.println(smartphones.contains(s4));
        int indexSmartphones4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphones4));


    }
}
