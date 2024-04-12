package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
//        new Person("William", "Suane", "viradonojiraya", "willliam.suane@devdojo.academy");
        Person build = Person.PersonBuilder
                .builder()
                .firstName("William")
                .lastName("Suane")
                .userName("viradonojeraya")
                .email("william.suane@devdoj.academy")
                .build();
        System.out.println(build);
    }
}
