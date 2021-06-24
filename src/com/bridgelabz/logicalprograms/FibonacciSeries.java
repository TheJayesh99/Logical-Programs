package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of value till which you want to print Fibonacci Series");

		int number = scanner.nextInt();
		scanner.close();

		
		int previousValue = 0;
		int currentValue = 1;
		System.out.print(previousValue+" , "+currentValue);

		fibonacciSeries(number, previousValue, currentValue);
	}

	//		Logic to calculate the fibonacci  Series
	private static void fibonacciSeries(int number, int previousValue, int currentValue) {
		int nextNumber;
		for (int i = 0; i < number-2; i++) {
			nextNumber = previousValue + currentValue;
			System.out.print(" , "+nextNumber);
			previousValue = currentValue;
			currentValue = nextNumber;
		}
	}

}
