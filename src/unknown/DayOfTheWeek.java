package unknown;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DayOfTheWeek {

    public static void main(String[] args) throws ParseException {
        String day = dayOfTheWeek(29,2,2016);
        System.out.println(day);
     }

    public static String dayOfTheWeek(int day, int month, int year) {
        try {
            String[] days = new String[]{"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};

            int index = 0;

            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");

            Date d = formatter.parse(day + " " + month + " " + year);
            Date d1 = formatter.parse("1 1 1971");

            long milliseconds = d.getTime() - d1.getTime();
            long diff = TimeUnit.DAYS.convert(milliseconds, TimeUnit.MILLISECONDS);

            index = (int) (diff % 7);
            return days[index];
        } catch (ParseException e) {
            return "Sunday";
        }
    }

}
