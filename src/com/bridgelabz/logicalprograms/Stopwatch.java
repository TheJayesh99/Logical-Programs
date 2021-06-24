package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class Stopwatch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Started timmer");
		
		//		note Start Time
		Long startTime = System.currentTimeMillis();

		System.out.println("Hit Enter to Stop");
		scanner.nextLine();
		scanner.close();

		System.out.println(" Stopped ");

		//		note End Time 
		Long endTime = System.currentTimeMillis();

		Long timeElapses = endTime - startTime ;
		System.out.println("The time elapse between start time and Current time is "+(timeElapses/1000)+" Seconds ");
	}

}
