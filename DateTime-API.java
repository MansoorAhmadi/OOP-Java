//Date and Time PATTERN using API


package FilesExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimePatternAPI {
    private static final String DATE_PATTERN = "yyyy-MM-dd";
    public static final String DATE_AND_TIME_PATTERN = "yyyy-MM-dd_HH:mm:ss";

    public static void main(String[] args) {

        //Formatting date using the API
        String dateAsString = "2021-01-01";
        String dateAndTimeAsString = "2021-01-01_20:00:01";

        //Date Handling - Parsing
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        //we passed the DATE_Pattern constant to the formatter which gives the date formatter

        //we passed the dateAsString using dateTimeFormatter which gives a parsed local date.
        LocalDate parsedLocalDate = LocalDate.parse(dateAsString, dateTimeFormatter);
        System.out.println(parsedLocalDate);


        //Date & Time Handling - Parsing
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("now: "+ localDateTime);

        LocalDateTime parsedDateAndTime = LocalDateTime.parse(dateAndTimeAsString, DateTimeFormatter.ofPattern(DATE_AND_TIME_PATTERN));
        System.out.println(parsedDateAndTime);
    }
}


//OUTPUT
//2021-01-01
//now: 2021-09-05T17:48:59.722699
//2021-01-01T20:00:01
