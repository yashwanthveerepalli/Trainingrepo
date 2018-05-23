package com.java.practice;

import java.util.Scanner;
/**
 * Sample program used to take input and display output
 * @author yashwanthveerepalli
 *The Scanner and io is used
 */

public class IDS {
/**
 * In this the 3 datatypes char,int,double is used
 * @param args-- input is through
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
double d =scan.nextDouble();
      scan.nextLine();
        String s= scan.nextLine();
        
        // Write your code here.
/**
 * To print them all
 */
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


