package academy.devdojo.maratonajava.javacore.Rdate;

import java.time.*;
import java.util.Map;

public class ZonaTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zonaAsian = ZoneId.of("Asia/Dhaka");
        System.out.println(zonaAsian);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(zonaAsian);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);

        ZonedDateTime zonedDateTime1 = nowInstant.atZone(zonaAsian);
        System.out.println(zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTimeManaus = now.atOffset(offSetManaus);
        System.out.println(offsetDateTimeManaus);


    }
}
