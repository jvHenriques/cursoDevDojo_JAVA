package academy.devdojo.maratonajava.javacore.Rdate;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("domingo!");
        }


//        Date d = c.getTime();

    }
}
