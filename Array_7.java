package org.iacsd.day_2;

import java.util.Scanner;

public class Array_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter Array Size:");
		;
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Element");
		;
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int num;
		System.out.println("Enter Array Index Value");
		num = sc.nextInt();
		if (num > 0 && num < size) {
			System.out.println("Array element at " + num + "  is " + arr[num]);
		} else {
			System.out.println("Array index is not exits");
		}
		sc.close();
	}

}
