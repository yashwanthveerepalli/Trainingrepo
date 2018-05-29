package com.java.practice;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ModuleTask {

	public static void main (String[] args) 
	{
		//code
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		for(a=a;a>0;a--)
		{
		    long n = sc.nextLong();

		    System.out.println(String.format("%.0f", Math.ceil((n/2)+1)));
		}
	}
}