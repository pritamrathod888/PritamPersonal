package com.java;

import java.util.Scanner;

public class Condition_do_while_loop {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter Any Number: ");
		Scanner s=new Scanner(System.in);
		
		num=s.nextInt();
		do {
			System.out.println(num);
			++num;
		}
		while (num<10);   
	}

}
