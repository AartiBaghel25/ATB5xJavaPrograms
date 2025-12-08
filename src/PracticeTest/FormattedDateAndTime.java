//Write a Java program to display the current date and time in a specific format.
package src.PracticeTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class FormattedDateAndTime {
    public static void main(String[] args){

        SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));

        System.out.println("\nNow: " + cdt.format(System.currentTimeMillis()));
    }
}
