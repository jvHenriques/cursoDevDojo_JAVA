package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = tudo o que for digito
        // \D tudo o que não é digito
        // \s = todos os espaços em branco -> \t \n \r \f
        // \S = todos os caracteres excetos espaços ^^
        // \w = a-ZA-Z / digitos /
        //\W Tudo exceso \w
        // []
        // ? = zero ou um
        // * = zero ou mais
        // + = uma ou mais
        //{n,m} = de n ate m
        //() = agrupamento
        // | = ou (v/c) o ovo/oco
        // $ = fim da linha
        // . = algo entre/operador coringa -> 1.3 --> 123 | 1@3


//        String regex = "[abcABC]";
//        String regex = "[a-zA-C]";


        String regex = "([a-zA-Z0-9._-])+@([a-zA-Z])+(\\.(a-zA-Z)+)+";
        String texto = "luffy@gmail.com, 123jotaro@gmail.com, @#$zoro@gmail.com, teste@gmail.com, sakura@gmail.com ";
        System.out.println("email válido");
        System.out.println("@#$zoro@gmail.com".matches(regex));
//        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " +texto);
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
