package org.iacsd.day_2;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinInArray {

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
		System.out.println("-----Array-----");
		System.out.println(Arrays.toString(arr));
		int temp = arr[0];
		for (int i = 1; i < size; i++) {
			if (arr[i] > temp) {
				temp = arr[i];
			}
		}
		System.out.println("Max=" + temp);
		sc.close();

	}

}
