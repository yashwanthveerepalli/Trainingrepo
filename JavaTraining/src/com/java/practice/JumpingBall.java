package com.java.practice;


	import java.util.*;
	import java.lang.*;
	import java.io.*;
	import java.lang.Math.*;

	public class JumpingBall {
		public static void main (String[] args) {
			//code
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			for(t=t;t>0;t--)
			{
			    long h = sc.nextLong();
			    long d=0;
			    while(h>0){
			        d =d+ (2*h);
			        h = h/2;
			    }
			    System.out.println(d);
			}
		}
	}
