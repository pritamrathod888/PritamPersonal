package com.java;

import java.util.Scanner;

public class Condition_if_else {

	public static void main(String[] args) {

		int pwd;
		System.out.println("Enter Password:= ");
		Scanner obj=new Scanner(System.in);
		pwd=obj.nextInt();
		if(pwd==1416)
		{
			System.out.println("My Name: Pritam Rathod");
			System.out.println("My Age: 28");
			System.out.println("My Contact: 7038720888");
			System.out.println("My Address: Tugaon No.1, Tq-Omerga, Dist-Osmanabad");
			
			
		}
		else {
			System.out.println("Sorry! Wrong Password...");
		}
	}

}
