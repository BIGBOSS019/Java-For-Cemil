package AtHome;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class Home6 {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);


        long millisecondsFor2000 = 30L * 365 * 24 * 60 * 60 * 1000 + 7L * 24 * 60 * 60 * 1000;
        Date date2000 = new Date(millisecondsFor2000);

        System.out.println("дата 1 января 2000 года: " + date2000);

        System.out.println("миллисекунд с 1 января 1970 г. по 1 января 2000 г. = " + millisecondsFor2000);



                LocalDate msec = LocalDate.now();
                System.out.println("текущая дата: " + date);


                int dayOfYear = date.getYear();
                System.out.println("номер дня в году: " + dayOfYear);


                DayOfWeek datePlus100 = date.getDay();
                System.out.println("дата + 100 дней: " + datePlus100);


                DayOfWeek dayOfWeek100 = DayOfWeek.from(datePlus100);
                System.out.println("день недели через 100 дней: " + dayOfWeek100);


                LocalDate newYear2025 = LocalDate.of(2025, 12, 31);
                System.out.println("31 декабря 2025 года: " + newYear2025);


                DayOfWeek dayOfWeekNY = newYear2025.getDayOfWeek();
                System.out.println("день недели 31.12.2025: " + dayOfWeekNY);


                int dayOfYearNY = newYear2025.getDayOfYear();
                System.out.println("номер дня в году для 31.12.2025: " + dayOfYearNY);


            }
        }

