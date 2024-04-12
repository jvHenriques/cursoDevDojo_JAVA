package academy.devdojo.maratonajava.javacore.Rdate;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime anuversario = LocalDateTime.of(1988, Month.AUGUST, 06,12,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(anuversario,now));
        System.out.println(ChronoUnit.WEEKS.between(anuversario,now));
        System.out.println(ChronoUnit.MONTHS.between(anuversario,now));
        System.out.println(ChronoUnit.YEARS.between(anuversario,now));
    }
}
