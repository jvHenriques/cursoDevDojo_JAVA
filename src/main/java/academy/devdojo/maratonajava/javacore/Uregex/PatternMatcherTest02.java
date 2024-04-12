package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = tudo o que for digito
        // \D tudo o que não é digito
        // \s = todos os espaços em branco -> \t \n \r \f
        // \S = todos os caracteres excetos espaços ^^
        // \w = a-ZA-Z / digitos /
        //\W Tudo exceso \w
        String regex = "\\w";
//        String texto = "abaaba";
        String texto2 = "@#1tf2gd waff234a";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:  " +texto2);
        System.out.println("indice  123456789" );
        System.out.println("regex " +regex);
        System.out.println("posição encontrada: " );
        while (matcher.find()){
            System.out.print(matcher.start() +" " +matcher.group()+"\n");
        }
    }
}
