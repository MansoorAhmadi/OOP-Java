package fr.epita.conversions;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringDateConversion {
    public static void main(String[] args) {

        //getStringFromCSVLine();

        String dateAsString = "2021-01-01";
        String dateAndTimeAsString = "2021-01-01_20:00:01";
        //we have two string variables having date and date & time
        //we cannot parse this in Java because we don't know what is the format used.
        //the fields, is the year first, or is the month first and days and then year
        //we don't know the pattern.

        String dateAndTimePattern = "yyyy-MM-dd_HH:mm:ss";
        //we are creating a pattern of date and time storing it in dateAndTimePattern variable.

        String datePattern = "yyyy-MM-dd";
        //we created a pattern for the date

        //How can we read these dates?
        //we have to ways. 1: the plain old way of doing it.

        Date date = new Date();
        System.out.println(date);

        //How do we read dateAsString = "2021-01-01";
        //since we cannot parse it directly. We have SimpleDateFormat as java utility
        SimpleDateFormat formattingDate = new SimpleDateFormat(datePattern);
        //we pass the pattern as the parameter of the constructor.

        String formattedDate = formattingDate.format(date);
        //we are formatting the system date by datePattern as yyyy-MM-dd
        //datePattern is passed to dateFormat at line 33
        System.out.println(formattedDate);

    }

    private static void getStringFromCSVLine() {

    }
}
