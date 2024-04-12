package academy.devdojo.maratonajava.javacore.Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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


//        String regex = "[abcABC]";
//        String regex = "[a-zA-C]";


        String regex = "0[xX]([1-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0x 0xFFABC 0X10G 0X1";
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
