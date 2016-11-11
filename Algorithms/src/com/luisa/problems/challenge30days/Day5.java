package com.luisa.problems.challenge30days;

import java.util.Scanner;

/**
 * Given an integer, , print its first multiples. Each multiple (where ) should
 * be printed on a new line in the form: n x i = result.
 *
 */
public class Day5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=1; i<=10; i++){
			System.out.println(n+ " x "+ i +" = " + n*i );
		}
	}

}
