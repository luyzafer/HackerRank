package com.luisa.problems.challenge30days;

import java.util.Scanner;

/**
 * Complete the code in the editor below. The variables , , and are already
 * declared and initialized for you. You must:
 * 
 * Declare variables: one of type int, one of type double, and one of type
 * String. 
 * Read lines of input from stdin (according to the sequence given in
 * the Input Format section below) and initialize your variables. 
 * Print the sum of plus your int variable on a new line. 
 * Print the sum of plus your double variable to a scale of one decimal place on a new line. 
 * Concatenate with the string you read as input and print the result on a new line.
 */
public class Day1 {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);
		
		String sumeInteger = scan.nextLine();
		String sumeDouble = scan.nextLine();
		String concatString= scan.nextLine();
		
		System.out.println(i + Integer.parseInt(sumeInteger));
		System.out.println(d + Double.parseDouble(sumeDouble));
		System.out.println(s + concatString);
		
		scan.close();
	}

}
