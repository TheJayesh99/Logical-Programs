package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter The Number which you have to check weather is Prime or not ");

		int number = scanner.nextInt();
		scanner.close();

		if(number < 2)
		{
			System.out.println("Its not a Prime Number");
		}
		
		else if(number == 2)
		{
			System.out.println("Its a Even Prime Minister");
		}
		
		else {
			
			checkPrime(number);
		}
		
	}


	
//		Logic to check number is prime or not 
	private static void checkPrime(int number) {
		boolean is_prime = true;
		
		for (int i=2; i*i < number;i++ )
		{
			if ( number%i == 0 )
			{
				is_prime = false;
				break;
			}
		}
		
		
		if (is_prime) {
			System.out.println("Its a Prime Number");
		}
		else 
		{			
			System.out.println("Its not a Prime Number");
		}
	}
}
