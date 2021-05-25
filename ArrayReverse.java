package org.iacsd.day_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter Size of Array:");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array element");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("-----Printing Array-----");
		System.out.println(Arrays.toString(arr));
		System.out.println("-----Array in reverse-----");
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		sc.close();

	}

}
