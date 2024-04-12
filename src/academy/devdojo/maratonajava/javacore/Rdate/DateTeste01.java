package academy.devdojo.maratonajava.javacore.Rdate;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1711029449754L);
        date.setTime(date.getTime()+ 3_600_000L);
        System.out.println(date);
    }
}
