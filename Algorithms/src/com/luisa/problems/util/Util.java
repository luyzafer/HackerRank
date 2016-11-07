package com.luisa.problems.util;

import java.util.Scanner;

public class Util {

	public static String[] readSTDIN() {
		Scanner scan = new Scanner(System.in);
		String size = scan.nextLine();
		String[] input = new String[Integer.parseInt(size)];
		for (int i = 0; i < Integer.parseInt(size); i++) {
			input[i] = scan.nextLine();
		}

		scan.close();
		return input;
	}
}
