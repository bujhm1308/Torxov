package Zd11;
import java.time.*;

public class Time {


    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        System.out.println("Сейчас: " + today);
        LocalDateTime randDate = LocalDateTime.of(2018, Month.MARCH, today.getDayOfMonth(), 0, 0, 0);
        System.out.println("завтра: " + randDate.plusDays(1));

        System.out.println(today.minusDays(today.getDayOfWeek().ordinal()));
        System.out.println(today.plusDays(6 - today.getDayOfWeek().ordinal()));
        today = today.plusMonths(1);
        System.out.println(today.minusDays(today.getDayOfMonth() - 1));
    }
}



