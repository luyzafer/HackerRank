package com.luisa.problems.challenge30days;

import java.util.Scanner;

/**
 * Given the meal price (base cost of a meal), tip percent (the percentage of
 * the meal price being added as tip), and tax percent (the percentage of the
 * meal price being added as tax) for a meal, find and print the meal's total
 * cost.
 */
public class Day2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();

		// Write your calculation code here.
		double mealTipPercent = (mealCost*tipPercent)/100;
		double mealTaxPercent= (mealCost*taxPercent)/100;

		// cast the result of the rounding operation to an int and save it as
		// totalCost
		int totalCost = (int) Math.round(mealCost+mealTipPercent+mealTaxPercent);

		// Print your result
		System.out.println("The total meal cost is "+ totalCost +" dollars.");
	}

}
