package com.java;

import java.util.Scanner;

public class Condition_while_loop {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter Any Number: ");
		Scanner s=new Scanner(System.in);
		
		num=s.nextInt();
		while(num>=0)
		{
			if(num %2==0)
			{
				System.out.println("Even Number");
				break;
			}
			else {
				System.out.println("Odd Number");
				break;
			}
		}
		System.out.println("while loop ended...");
	}

}
