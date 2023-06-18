package com.java;

public class Condition_nasted_if_else {

	public static void main(String[] args) {

		int num1=20,num2=10,num3=45;
		if (num1>num2)                                              //20>10
		{
			if (num1>num3) {                                        //20>45
			System.out.println("Maximum Number: "+num1);	
			}
			else {
				System.out.println("Maximum Number: "+num3);	

			}
		}
		else {
			if (num2>num3) {
				System.out.println("Maximum Number: "+num2);	

			}
			else {
				System.out.println("Maximum Number: "+num3);	

			}
			}
		}
	}
 

