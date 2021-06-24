package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Number which you have to check weather is perfect or not ");

		int number = scanner.nextInt();
		scanner.close();

		int sumOfFactors = 0;

		//		Finding Factors 
		for (int i = 1; i < number; i++) {
			if (number%i == 0)
			{
				sumOfFactors += i; 
			}
		}

		if(sumOfFactors == number)
		{
			System.out.println("Its a Perfect Number");
		}
		else
		{
			System.out.println("Its not a Perfect Number");
		}

	}

}
