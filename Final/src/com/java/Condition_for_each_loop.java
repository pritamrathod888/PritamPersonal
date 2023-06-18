package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Condition_for_each_loop {

	public static void main(String[] args) {

	                                                          	//int a[]= {10,20,30,40,50};
		int a[][]=new int[5][5];
		System.out.println("Enter Array Element: ");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<2;j++) 
			{
				a[i][j]=s.nextInt();
			}

		System.out.println("\nMatrix Element:\n");
		
		for(int i1=0;i1<2;i1++)
		{
			for(int j=0;j<2;j++) 
			{
				System.out.println(a[i1][j]+" ");
			}
			System.out.println();
		
		
	}

	}
	}}
