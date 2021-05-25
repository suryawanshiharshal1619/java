package org.iacsd.day_2;

import java.util.Scanner;

public class Swap {

	public static void swap(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("-----After Swap-----");
		System.out.println("num1=" + a);
		System.out.println("num2=" + b);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter two number:-");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		// swap(num1,num2);
		swap(num1, num2);
		sc.close();
	}

}
