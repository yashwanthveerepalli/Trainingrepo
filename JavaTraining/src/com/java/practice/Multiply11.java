package com.java.practice;


	import java.util.*;
	import java.lang.*;
	import java.io.*;
	public class Multiply11 {

		public static void main (String[] args) {
			//code
			Scanner s= new Scanner(System.in);
			int a=s.nextInt();
			 Long[] b=new  Long[a];
		     Long[] c=new  Long[a];
			for(int i=0;i<a;i++)
			{
			    b[i]=s.nextLong();
			}
			for(int j=0;j<a;j++)
			{
			    c[j]= 11*b[j];
			}
			for(int k=0;k<a;k++)
			{
			    System.out.println(c[k]);
			}


			
		}
	}
