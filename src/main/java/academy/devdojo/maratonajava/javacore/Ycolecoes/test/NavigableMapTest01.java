package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class    NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String,String> navigableMap = new TreeMap<>();
        navigableMap.put("A","LETRA A");
        navigableMap.put("D","LETRA D");
        navigableMap.put("B","LETRA B");
        navigableMap.put("C","LETRA C");
        navigableMap.put("E","LETRA E");

        for (Map.Entry<String,String> entry : navigableMap.entrySet()){
            System.out.println(entry);
        }

        System.out.println(navigableMap.headMap("C"));                     //(<)mostra dados abaixo do "C" no map
//        System.out.println(navigableMap.headMap("C").remove("A"));    //removeria a chave "A", pq esta linkado
//        System.out.println(navigableMap.headMap("C",true));      //(<=)mostra dados abaixo do "C" e o proprio "C" no map


        //lower <
        //floor <=
        //higher >
        //ceiling >=

        System.out.println(navigableMap.lowerEntry("C"));          //traz um valor inferior proximo ao passado
        System.out.println(navigableMap.higherEntry("C"));          //traz um valor inferior ou igual ao passado
        System.out.println(navigableMap.higherKey("C"));          //traz um valor superior proximo ao passado
        System.out.println(navigableMap.ceilingKey("C"));          //traz um valor superior ou igual ao passado
        System.out.println("------------------");
        System.out.println(navigableMap.size());
        System.out.println(navigableMap.pollFirstEntry());             //retorna e remove o elemento do mapa -> first primeiro | last ultimo
        System.out.println(navigableMap.size());
    }
}
