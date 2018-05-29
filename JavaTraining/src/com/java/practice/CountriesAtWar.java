package com.java.practice;


import java.util.*;
import java.lang.*;
import java.io.*;

public class CountriesAtWar {
	public static void main (String[] args) {
		//code
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();

		for(int i=0;i<a;i++)
		{
			int b =s.nextInt();

			int[] c=new int[b];   
			int[] d=new int[b];   
			int coa=0;
			int cob=0;

			for(int j=0;j<b;j++)
			{
				c[j]=s.nextInt();
			}
			for(int k=0;k<b;k++)
			{
				d[k]=s.nextInt();
			}
			for(int m=0;m<b;m++)
			{
				if(c[m]>d[m])
				{
					coa++;
				}
				else if(c[m]<d[m])
				{
					cob++;
				}


			}
			System.out.print(coa+" "+cob);

			if(coa==cob)
			{
				System.out.println(" DRAW");
			}
			else if(coa>cob)
			{
				System.out.println(" A");
			}
			else
			{
				System.out.println(" B");
			}
		}



	}
}