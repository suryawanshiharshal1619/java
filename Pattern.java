package org.iacsd.day_2;

import java.util.Scanner;

public class Pattern {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] strg) {
		int size;
		System.out.println("Enter size of pattern");
		size = sc.nextInt();
		int i, j;
		for (i = 1; i <= size; i++) {
			for (j = i; j < i; j++) {
				System.out.print("  ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
