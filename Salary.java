package org.iacsd.day_2;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sal, hra, dra;
		System.out.println("Enter Basic Salary:");
		sal = sc.nextFloat();
		if (sal <= 10000) {
			hra = 0.2f * sal;
			dra = 0.8f * sal;
			float gross = sal + hra + dra;
			System.out.println("Gross salary=" + gross);
		} else if (sal <= 20000) {
			hra = 0.25f * sal;
			dra = 0.9f * sal;
			float gross = sal + hra + dra;
			System.out.println("Gross Salary=" + gross);
		} else {
			hra = 0.3f * sal;
			dra = 0.95f * sal;
			float gross = sal + hra + dra;
			System.out.println("Gross Salary=" + gross);
		}
		sc.close();
	}

}
