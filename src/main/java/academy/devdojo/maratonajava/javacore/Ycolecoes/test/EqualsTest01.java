package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

public class    EqualsTest01 {
    public static void main(String[] args) {
//        String nome1 = "William suane";
//        String nome2 = "William suane";
//        System.out.println(nome1 == nome2);
        Smartphone s1 = new Smartphone("1ABC1", "Iphone");
        Smartphone s2 = new Smartphone("1ABC1", "Iphone");

        System.out.println(s1 == s2);
    }
}
