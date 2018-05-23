package com.java.practice;


	import java.io.*;
	import java.util.*;
	/**
	 * the basic END OF THE FILE
	 * @author yashwanthveerepalli
	 * io and util packages are used
	 */
	public class JavaEOF {
 /**
  * the args are the strings used
  * @param args sc object to the lines while is the loop used to increment number
  */
		static void main(String []args)
	    {
	        Scanner sc = new Scanner(System.in);
	        int i=1;
	        while (sc.hasNext()) {
	        	String s=sc.nextLine();
	        	System.out.println(i + " " + s);
	        	i++;
	        }
	}}
