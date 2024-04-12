package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
//        String pattern = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String pattern = "'Amsterdan' dd 'de' MMMM 'de' yyyy ";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }
}
