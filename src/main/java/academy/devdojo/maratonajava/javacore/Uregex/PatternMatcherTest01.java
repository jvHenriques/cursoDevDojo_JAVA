package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
//        String texto = "abaaba";
        String texto2 = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:  " +texto2);
        System.out.println("indice  123456789" );
        System.out.println("regex " +regex);
        System.out.println("posição encontrada: " );
        while (matcher.find()){
            System.out.print(matcher.start() +" ");
        }
    }
}