package AtSchool;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class WorkWIthCalendar {
    @Test
    public void constructors() {
        Calendar calendar1 = new GregorianCalendar(2014, Calendar.APRIL, 15, 16, 48, 32);
        Calendar calendar2 = new GregorianCalendar(1937, Calendar.SEPTEMBER, 6, 2, 13);
        Calendar calendar3 = new GregorianCalendar(3020, Calendar.MARCH, 30);
        System.out.println(calendar1.getTime());
        System.out.println(calendar2.getTime());
        System.out.println(calendar3.getTime());

    }
    @Test
    public void example1() {
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_YEAR, -10);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.clear(Calendar.MINUTE);
        calendar.clear(Calendar.SECOND);
        System.out.println("Дата начала дня 10 дней назад");
        System.out.println(calendar.getTime());

    }
}
