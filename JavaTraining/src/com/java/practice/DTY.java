package com.java.practice;
import java.util.Scanner;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class DTY {
    public static String getDay(String day, String month, String year) {
        
        int intyear = Integer.parseInt(year);
        int intDay = Integer.parseInt(day);
        int intmonth = Integer.parseInt(month);

        String dateString = String.format("%d-%d-%d", intyear, intmonth, intDay);
        Date date = null;
        try {
             date = new SimpleDateFormat("yyyy-M-d").parse(dateString);
        }
        catch(ParseException ref){
            ref.printStackTrace();
        }
        String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
        
        return dayOfWeek.toUpperCase();
}public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String month = in.next();
    String day = in.next();
    String year = in.next();
    
    System.out.println(getDay(day, month, year));
}
}
