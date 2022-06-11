import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class Classwork11 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("The year is " + calendar.get(Calendar.YEAR));

        LocalDate localDate = LocalDate.now();

        System.out.println("The year is " + localDate.getYear());

        LocalDate mydate = LocalDate.of(2009,3,14);

        System.out.println(mydate.getYear());

        System.out.println(mydate.getMonth());

        System.out.println(mydate.getDayOfMonth());


    }
}
