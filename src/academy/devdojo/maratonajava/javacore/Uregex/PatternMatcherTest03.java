package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = tudo o que for digito
        // \D tudo o que não é digito
        // \s = todos os espaços em branco -> \t \n \r \f
        // \S = todos os caracteres excetos espaços ^^
        // \w = a-ZA-Z / digitos /
        //\W Tudo exceso \w
        // []


//        String regex = "[abcABC]";
//        String regex = "[a-zA-C]";
//        String texto = "abaaba";


        String regex = "0[xX][1-9a-fA-F]";
        String texto2 = "12 0x 0x 0xFFABC 0X109 0X1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println("texto:  " +texto2);
        System.out.println("indice  123456789" );
        System.out.println("regex " +regex);
        System.out.println("posição encontrada: " );
        while (matcher.find()){
            System.out.print(matcher.start() +" " +matcher.group()+"\n");
        }
        int numExaDecimal = 0x59F68A;
        System.out.println(numExaDecimal);
    }
}