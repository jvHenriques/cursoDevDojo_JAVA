package academy.devdojo.maratonajava.javacore.Rdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDataTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
//        LocalDate date = LocalDate.of(2025,Month.AUGUST,23);
        LocalDate date = LocalDate.parse("2025-06-23");
//        LocalTime time = LocalTime.of(9,45,21);
        LocalTime time = LocalTime.parse("09:45:21");

        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt1);
        System.out.println(ldt2);

    }
}
