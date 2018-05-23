package com.java.practice;

	import java.util.Scanner;
	/**
	 * The program is for specified display java output formatting
	 * @author yashwanthveerepalli
	 * scanner is used as the importing file
	 */

	public class JOF  {
/**
 * the arguments are used to take the inputs
 * @param args --taking the values
 */
	    public static void main(String[] args) {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            for(int i=0;i<3;i++)
	            {
	            	/**
	            	 * s1,s2,s3 are string inputs
	            	 * x,y,z are the int inputs
	            	 */
	                String s1=sc.next();
	                int x=sc.nextInt();
	                String s2=sc.next();
	                int y=sc.nextInt();
	                String s3=sc.next();
	                int z=sc.nextInt();
	                System.out.printf("%-14s %03d", s1, x);
	                System.out.println();
	                System.out.printf("%-14s %03d", s2, y);
	                System.out.println();
	                System.out.printf("%-14s %03d", s3, z);
	                System.out.println();
	            System.out.println("================================");
	    }}}



