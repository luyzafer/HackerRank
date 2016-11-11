package com.luisa.problems.challenge30days;

import com.luisa.problems.util.Util;

/**
 * Given a string,S , of length N that is indexed from 0 to N-1 , print its even-indexed
 * and odd-indexed characters as 2 space-separated strings on a single line (see
 * the Sample below for more detail).
 * 
 *
 */
public class Day6 {

	public static void main(String[] args) {
		String[] words = Util.readSTDIN();

		createLists(words);

	}

	private static void createLists(String[] words) {
		for (int i = 0; i < words.length; i++) {
			StringBuilder even = new StringBuilder();
			StringBuilder odd = new StringBuilder();
			char[] word = words[i].toCharArray();
			evenOddClasification(even, odd, word);
			System.out.print(even);
			System.out.print(" ");
			System.out.println(odd);
		}

	}

	private static void evenOddClasification(StringBuilder even, StringBuilder odd, char[] word) {
		for (int i = 0; i < word.length; i++) {
			if (i == 0 || i % 2 == 0) {
				even.append(word[i]);
			} else {
				odd.append(word[i]);
			}
		}

	}
}
