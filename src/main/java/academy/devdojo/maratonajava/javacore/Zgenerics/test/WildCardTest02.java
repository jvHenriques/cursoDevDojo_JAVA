package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatoes = List.of(new Gato(), new Gato());

        printConsulta(cachorros);
        System.out.println("-----");
        printConsulta(gatoes);





    }
    //type erasure
    private static void printConsulta(List<? extends Animal> animals){ //permite tudo que é animal
        for (Animal animal : animals) {
            animal.consultando();
        }

//        animals.add(new Cachorro());   ao usar o generics não é permitido adcionar elementos a lista
    }

    private static void printConsultaAnimal(List<? super Animal> animals) {
        for (Object animal : animals) {
            System.out.println(animal);
        }

    }
}

