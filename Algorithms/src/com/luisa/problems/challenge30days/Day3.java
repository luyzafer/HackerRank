package com.luisa.problems.challenge30days;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Integer number = scan.nextInt();
		
		scan.close();
		System.out.println(number % 2 != 0 ? "Weird"
				: (number >= 2 && number <= 5) ? "Not Weird" : (number >= 6 && number <= 20) ? "Weird" : "Not Weird");
	}
}
