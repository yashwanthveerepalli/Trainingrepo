package com.java.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 * The code is for using the if-else condition 
 * @author yashwanthveerepalli
 *the packages are io,math,security,text,util,
 */
public class Ifelse {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       /**
        * the argument N is used to take the input
        */
    	int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
       
        /**
         * the if else condition is checked from here
         */
        if(N%2==1)
        {
            System.out.println("Weird");
        }
        else 
        {
            if((2<=N)&&(N<=5))
            { 
                System.out.println("Not Weird");
            }
            if((6<N)&&(N<20))
            {
                
                System.out.println("Weird");
            }
                if(N>20)
           {
                System.out.println("Not Weird");
            }
            }
    }
}


