package util;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static String format(LocalDateTime date) {
        return date.format(formatter);
    }

        public static String format(LocalDate date) {
        return date.format(formatter);
    }

    public static DateTimeFormatter getFormatter(){
        return formatter;
    }
}
