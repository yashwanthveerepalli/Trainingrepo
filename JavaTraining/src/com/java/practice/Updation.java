package com.java.practice;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Updation {
	public void abc()
	{



		System.out.println("Use this console to give the input");
		int[] d=new int[1005];
		Scanner s=new Scanner(System.in); 
		int a=s.nextInt();

		for(int i=0;i<a;i++)
		{
			d[i]= s.nextInt();
		}


		int sum=0;
		for(int i=0;i<a;i++)
		{
			sum+=d[i];
		}
		for(int i=0;i<a;i++)
		{
			int x=a*i,y=a*(i+1),z=a*(i-1);
			if((sum== x)&&(sum<y))
			{
				System.out.println("the minimum need for update is	"+(i+1));
			}
			else if((sum>x)&&(sum<z))
			{
				System.out.println("the minimum need for update is	"+(i-1));

			}
		}
		s.close();
	}

	public static void main(String[] args)
	{
		Updation u=new Updation();
		u.abc();

	}


}
