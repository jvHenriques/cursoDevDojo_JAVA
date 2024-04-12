package academy.devdojo.maratonajava.javacore.Sformatacao;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocateTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSuica = new Locale("it", "CH");
        Locale localeIndian = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeHoland = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndian);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHoland);

        System.out.println("Italia: " + df1.format(calendar.getTime()));
        System.out.println("Suica: " + df2.format(calendar.getTime()));
        System.out.println("India: " + df3.format(calendar.getTime()));
        System.out.println("Japan: " + df4.format(calendar.getTime()));
        System.out.println("Holanda: " + df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeItaly));
        System.out.println(localeSuica.getDisplayCountry(localeHoland));
        System.out.println(localeItaly.getDisplayCountry(localeJapan));
    }
}
