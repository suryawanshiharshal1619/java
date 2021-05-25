package org.iacsd.day_2;

import java.util.Scanner;

public class AdditionOfTwoDiffType {

	public static int add(int a, int b) {
		return (a + b);
	}

	public static float add(float c, float d) {
		return (c + d);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, r;
		float c, d, R;
		System.out.println("Enter 4 value for a,b,c and d");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextFloat();
		d = sc.nextFloat();
		r = add(a, b);
		R = add(c, d);
		System.out.println("Addition1=" + r);
		System.out.println("Addition2=" + R);
		R = add(c, d);
		sc.close();

	}

}
