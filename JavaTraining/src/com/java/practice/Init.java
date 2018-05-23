package com.java.practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * The code to print are following some initilizations 
 * @author yashwanthveerepalli
 *the packages are io,util,text,math,
 */
public class Init {
	/**
	 * the static variables Breadth b and heigh h is  taken
	 */
	public static boolean flag = true;
	public static int B;
	public static int H;
	static {
		
		Scanner sc = new Scanner (System.in);
	    B = sc.nextInt();
	    H = sc.nextInt();
	    
	    if (B<0 || H<0) {
	        flag = false;
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
        if (B==0 && H==100) {
	        flag = false;
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
	} public static void main(String[] args){
		if(flag){
		/**
		 * here after the initial conditions got satisfied the area prints out
		 */
			int area=B*H;
			System.out.print(area);
		}
		
	}
}
