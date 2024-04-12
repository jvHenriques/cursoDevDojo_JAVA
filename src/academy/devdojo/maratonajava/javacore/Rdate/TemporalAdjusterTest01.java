package academy.devdojo.maratonajava.javacore.Rdate;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProxDiaUtil implements TemporalAdjuster{
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        return null;
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
//        System.out.println("primeiro dia Semana");
//        LocalDateTime d1 = LocalDateTime.now();
//        d1 = d1.with(ChronoField.DAY_OF_MONTH, 19);
//        if (d1.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
//            d1 = d1.with(ChronoField.DAY_OF_WEEK, 1);
//            System.out.println(d1.getDayOfWeek());
//        }else if (d1.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
//            d1 = d1.with(ChronoField.DAY_OF_WEEK, 1);
//            System.out.println(d1.getDayOfWeek());
//        }else if(d1.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
//            d1 = d1.with(ChronoField.DAY_OF_WEEK, 1);
//            System.out.println(d1.getDayOfWeek());
//        }else{
//            System.out.println(d1.getDayOfWeek());
//        }
//    }
    }
}
