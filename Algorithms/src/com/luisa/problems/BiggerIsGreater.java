package com.luisa.problems;

import com.luisa.problems.util.Util;

public class BiggerIsGreater {

	public static void main(String[] args) {
		String[] words = Util.readSTDIN();
		for (int i = 0; i < words.length; i++) {
			char[] array = words[i].toCharArray();
			nextPermutation(array);
		}

	}

	public static void nextPermutation(char[] array) {
		// Find longest non-increasing suffix
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i])
			i--;
		// Now i is the head index of the suffix

		// Are we at the last permutation already?
		if (i <= 0) {
			System.out.println("no answer");
		} else {
			// Let array[i - 1] be the pivot
			// Find rightmost element that exceeds the pivot
			int j = array.length - 1;
			while (array[j] <= array[i - 1])
				j--;
			// Now the value array[j] will become the new pivot
			// Assertion: j >= i

			// Swap the pivot with j
			char temp = array[i - 1];
			array[i - 1] = array[j];
			array[j] = temp;

			// Reverse the suffix
			j = array.length - 1;
			while (i < j) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
			StringBuilder result = new StringBuilder();
			for (int s = 0; s < array.length; s++) {
				result.append(array[s]);
			}
			System.out.println(result);
		}
	}
}
