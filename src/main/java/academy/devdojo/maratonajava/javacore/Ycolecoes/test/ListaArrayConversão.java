package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class   ListaArrayConversão {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("____________________________________");

        Integer[] numerosArrays = new Integer[3];
        numerosArrays[0] = 1;
        numerosArrays[1] = 2;
        numerosArrays[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArrays);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(numerosArrays));
        System.out.println(arrayToList);
        System.out.println("____________________________________");

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArrays));
        numerosList.add(15);
        System.out.println(numerosList   );
    }
}
