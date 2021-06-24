package com.bridgelabz.logicalprograms;

import java.util.Scanner;



public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number which you have to reverse");
		
		int number = scanner.nextInt();
		scanner.close();
		int reverse = 0;
		while (number != 0)
		{
			reverse = reverse*10 + number%10;
			number = number/10;
		}
		System.out.println("The required reverse number is "+reverse);
	}

}
