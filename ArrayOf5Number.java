package org.iacsd.day_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOf5Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size of array:");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array Element");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("-----Printing array Element-----");
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
