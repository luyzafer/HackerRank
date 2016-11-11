package com.luisa.problems.challenge30days;

import java.util.Scanner;

/**
 * Given an array, A , of N integers, print A's elements in reverse order as a
 * single line of space-separated numbers.
 *
 */
public class Day7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
