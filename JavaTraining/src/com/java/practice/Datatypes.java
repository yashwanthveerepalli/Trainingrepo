package com.java.practice;


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

/**
 * Code to print the data types for the given number
 * @author yashwanthveerepalli
 *Firstly, taking the packages io,util,text,math,util.regex
 */
	public class Datatypes {
	   /**
	    * Inserting the number for which the data type is needed
	    * @param numString asthe input variable
	    * @return returns the answer as where can this datatype is being fitted
	    */
		static String whoCanFitTheNumber(String numString)
	    {
	        String answer = "";
	        try{
	            long num = Long.parseLong(numString);
	            answer = numString + " can be fitted in:\n";
	            if((num<=Byte.MAX_VALUE) && (num>=Byte.MIN_VALUE)){
	                answer = answer.concat("* byte\n* short\n* int\n* long");
	            }else if((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)){
	                answer = answer.concat("* short\n* int\n* long");
	            }else if((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)){
	                    answer = answer.concat("* int\n* long");
	            }else{
	                    answer = answer.concat("* long");
	            }
	        }catch (NumberFormatException e){
	            answer = numString+" can't be fitted anywhere.";
	        }
	        return answer;
	    }
	    public static void main(String[] args) {
	        /**
	         * here the scanner asks for the number of queries to be done
	         */
	    	Scanner scanner = new Scanner(System.in);
	        int numTestCases = scanner.nextInt() ;
	        scanner.nextLine();
	        for(int i=0; i<numTestCases;i++){
	            String numString = scanner.nextLine();
	            System.out.println(whoCanFitTheNumber(numString));
	        }
	    }
	}
