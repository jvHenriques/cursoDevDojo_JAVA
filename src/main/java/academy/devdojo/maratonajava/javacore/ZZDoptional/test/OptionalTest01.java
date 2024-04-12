package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
    static Optional<String> name;
    public static void main(String[] args) {

        Optional<String> o1 = Optional.of("aha uhu o devDojo é massa");  //encapsula o conteudo, le da melhor com possiveis retornos "nulls"(Optional.ofNullable)
        Optional<String> o2 = Optional.ofNullable(null);                //Optional retorna vazio
        Optional<String> o3 = Optional.empty();                              //cria um optional vazio
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        Optional<String> nameOptional = findName("William");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);

        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));


    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("William", "Suanne");
        int i = list.indexOf(name);
        if (i >= 0) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }

    private static String retor(String name){
        return name.toUpperCase();
    }
}
