package com.java.practice;
import java.io.*;
import java.lang.*;
import java.util.*;

public class ThreeD {
public void insertion()
{
	System.out.println("Use This console to give the input");
	int [][] a=new int[3][3];
	Scanner s= new Scanner(System.in);
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			a[i][j]=s.nextInt();
		}
	}

	int sum=0;
	for(int i=0;i<3;i++)
	{
		sum += a[i][i];
	}
	System.out.println("The Diagnol sum is     "+sum);
}
public static void main(String[] args)
{
	ThreeD t=new ThreeD();
	t.insertion();
	
}
}
