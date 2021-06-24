package com.bridgelabz.logicalprograms;

import java.util.Arrays;
import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many Coupon do you want to Generate ");

		int numberOfCoupons = scanner.nextInt();
		scanner.close();

		//		Generating coupons codes
		generateCoupons(numberOfCoupons);
		
	}



	private static void generateCoupons(int numberOfCoupons) {
		
		int[] couponsCodes;		
		couponsCodes = new int[numberOfCoupons];
		int countOfcoupons = 0;
		
		while (countOfcoupons < numberOfCoupons )
		{
			//			Logic to Generate random NUmber
			int code = (int) Math.floor(Math.random() *10000);
		
			boolean couponInCouponsCode = false;
			
			for (int j = 0; j < couponsCodes.length; j++)
			{
				if (code  == couponsCodes[j]) 
				{
					couponInCouponsCode = true;
				}
			}
			
			if(!(couponInCouponsCode)) {				
				couponsCodes[countOfcoupons++] = code;
			}
		}
		System.out.println("The generated coupons are "+Arrays.toString(couponsCodes));
	}

}
