import java.time.*;
import java.time.format.DateTimeFormatter;
public class Exp18 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 1, 15);
        LocalDate nextWeek = date.plusWeeks(1);
        LocalTime time = LocalTime.of(10, 30);
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("After a week=" + nextWeek + ", time=" + time);
    }
}