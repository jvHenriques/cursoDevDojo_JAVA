package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.Arrays;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> listBarcos = criarArrayComObjeto(new Barco("canoa marota"));
        System.out.println(listBarcos);
    }

    private static <T> List<T> criarArrayComObjeto(T t){
        return List.of(t);
    }

//    private static <T extends Comparable<T>> List<T> criarArrayComObjeto(T t){
//        return List.of(t);
//    }
}
