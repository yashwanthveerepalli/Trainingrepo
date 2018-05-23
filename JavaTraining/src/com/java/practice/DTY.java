package com.java.practice;
import java.util.Scanner;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
 * The code for displaying day for date
 * @author yashwanthveerepalli
 *the packages used are DFS,PE,SDF,date,locale,scanner
 */
public class DTY {
	/**
	 * the parameters used for the DTY are
	 * @param day-- to intake day (dd)
	 * @param month--to intake  month(mm)
	 * @param year-- to intake year (yyyy)
	 * @return-- to give the day out
	 */
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
    Scanner o = new Scanner(System.in);
    String month = o.next();
    String day = o.next();
    String year = o.next();
    
    System.out.println(getDay(day, month, year));
}
}