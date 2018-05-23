package com.java.practice;


	import java.util.*;
	import java.text.*;

	/**
	 * Code to print the given number into respective currency
	 * @author yashwanthveerepalli
	 *Taking two pakages util and text
	 */
	public class Currency {
	   /**
	    *  using scanner taking the unput value
	    * @param payment is used to take the input
	    */
	    public static void main(String[] args) {
	    	System.out.println("Please use this console to enter your value");
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	         NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
	        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
/**
 * getting  all the currency instances of that particular country
 */
	        String us = usFormat.format(payment);
	        String india = inFormat.format(payment);
	        String france = frFormat.format(payment);
	        String china = cnFormat.format(payment);

	   /**
	    * changing the formats and printing them out
	    */
	        
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	    }
	}
