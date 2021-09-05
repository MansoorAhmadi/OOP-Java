package FilesExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateAndTimeString {

    public static final String DATE_PATTERN = "yyyy-MM-dd";
    public static final String DATE_AND_TIME_PATTERN = "yyyy-MM-dd_HH:mm:ss";

    public static void main(String[] args) throws ParseException {

        String dateAsString = "2021-01-01";
        String dateAndTimeAsString = "2021-01-01_20:00:01";

        Date date = new Date();
        System.out.println("System: " + date);

        //Date Handling
        SimpleDateFormat myDateFormat = new SimpleDateFormat(DATE_PATTERN);
        String formattedDate = myDateFormat.format(date);
        System.out.println("Formatted Date: " + formattedDate);

        //Date Parsing
        Date parsedDate = myDateFormat.parse(dateAsString);
        System.out.println("Parsed Date as String: " + parsedDate);
        System.out.println();

        //Date & Time Handling
        SimpleDateFormat myDateAndTimeFormat = new SimpleDateFormat(DATE_AND_TIME_PATTERN);
        String formattedDateTime = myDateAndTimeFormat.format(date);
        System.out.println("Formatted Time: " + formattedDateTime);

        //Date & Time Parsing
        Date parsedDateTime = myDateAndTimeFormat.parse(dateAndTimeAsString);
        System.out.println("Parsed Date & Time as String: " + parsedDateTime);
        System.out.println();

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date & Time Method: " + localDateTime);
    }
}

//OUTPUT
//System: Sun Sep 05 17:26:00 CEST 2021
//Formatted Date: 2021-09-05
//Parsed Date as String: Fri Jan 01 00:00:00 CET 2021
//
//Formatted Time: 2021-09-05_17:26:00
//Parsed Date & Time as String: Fri Jan 01 20:00:01 CET 2021
//
//Local Date & Time Method: 2021-09-05T17:26:01.064650
