package org.iacsd.day_2;

import java.util.*;

public class Student {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int rollno;
		float s, percent;
		String name;
		int[] mark = new int[5];
		System.out.println("Enter roll number");
		rollno = sc.nextInt();
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter 5 sub mark");
		for (int i = 0; i < 5; i++) {
			mark[i] = sc.nextInt();
		}
		int total = 0;
		for (int i = 0; i < 5; i++) {
			total = total + mark[i];
		}
		System.out.println("Name:" + name);
		System.out.println("Roll Number:" + rollno);
		System.out.println("Total=" + total);
		s = total / 500f;
		percent = s * 100f;
		System.out.println("percentage=" + percent + "%");
		if (percent > 75) {
			System.out.println("Grade=A");
		} else if (percent < 74 && percent > 60) {
			System.out.println("Grade B");
		} else {
			System.out.println("Grade c");
		}

	}

}
