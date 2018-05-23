package com.java.practice;


	import java.util.*;
	import java.io.*;
	/**
	 * this is an other example for looping
	 * @author yashwanthveerepalli
	 *util and io are the importing packages
	 */

	public class Loop2{
		/**
		 * this displays im a binary format
		 * @param argh is to take the input
		 */
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int calc = a;
	            for(int j=0;j<n;j++)
	            {
	                calc+=(Math.pow(2,j)*b);
	                System.out.print(calc+" ");
	            }
	            System.out.println();
	        }
	        in.close();
	    }
	}
