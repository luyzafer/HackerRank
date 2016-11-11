package com.luisa.problems.challenge30days;

import java.util.Scanner;

/**
 * Write a Person class with an instance variable, , and a constructor that
 * takes an integer, , as a parameter. The constructor must assign to after
 * confirming the argument passed as is not negative; if a negative argument is
 * passed as , the constructor should set to and print Age is not valid, setting
 * age to 0.. In addition, you must write the following instance methods:
 * 
 * yearPasses() should increase the instance variable by . amIOld() should
 * perform the following conditional actions: If , print You are young.. If and
 * print You are a teenager.. Otherwise, print You are old..
 *
 * 
 */
public class Day4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
}

class Person {

	private int age;

	public Person(int initialAge) {
		super();
		if (initialAge > 0) {
			this.age = initialAge;
		} else {
			this.age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}

	public void yearPasses() {
		this.age += 1;
	}

	public void amIOld() {
		System.out.println(this.age < 13 ? "You are young."
				: this.age >= 13 && this.age < 18 ? "You are a teenager." : "You are old.");
	}

}
