package com.java;

import java.util.Scanner;

public class Condition_for_loop {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter Any Number: ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		
		for(int i=1;i<=10;i++) 
		{
		System.out.println(num*i);	
		}
		
		//System.out.println(num*1);
		//System.out.println(num*2);
		//System.out.println(num*3);
		//System.out.println(num*4);
		//System.out.println(num*5);
		//System.out.println(num*6);
		//System.out.println(num*7);
		//System.out.println(num*8);
		//System.out.println(num*9);
		//System.out.println(num*10);

	}

}
