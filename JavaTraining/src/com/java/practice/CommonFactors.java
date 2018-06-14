package com.java.practice;
import java.io.*;
import java.lang.*;
import java.util.*;

public class CommonFactors {
	public void caluclation ()
	{
		System.out.println("USE THIS CONSOLE TO GIVE THE INPUT");
		System.out.println("Give the 2 integers ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int count =0;
		for(int i=1;i<1024;i++)
		{
			if(((a%i)==0)&&((b%i)==0))
			{
				count ++;
			}
		}
		System.out.println("The Number of Common factors are:  "+count);
	}
	public static void main(String[] args)
	{
		CommonFactors cf=new CommonFactors();
		
		cf.caluclation();
	}
}

