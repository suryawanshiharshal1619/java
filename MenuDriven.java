package org.iacsd.day_2;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, total = 0, q, price;
		boolean flag = false;
		while (flag != true) {
			System.out.println("Enter which Item you want purches:");
			System.out.println("1.Pen");
			System.out.println("2.Pencil");
			System.out.println("3.NoteBook");
			System.out.println("4.Bottel");
			System.out.println("5.ColorBox");
			System.out.println("6.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Quantity of pen you want");
				q = sc.nextInt();
				price = 10;
				total = total + (price * q);
				break;
			case 2:
				System.out.println("Enter Quantity of Pencil you want");
				q = sc.nextInt();
				price = 5;
				total = total + (price * q);
				break;
			case 3:
				System.out.println("Enter Quantity of NoteBook you want");
				q = sc.nextInt();
				price = 20;
				total = total + (q * price);
				break;
			case 4:
				System.out.println("Enter Quantity of Bottel you want");
				q = sc.nextInt();
				price = 30;
				total = total + (q * price);
				break;
			case 5:
				System.out.println("Enter quantity of ColorBox you Want");
				q = sc.nextInt();
				price = 50;
				total = total + (q * price);
				break;
			case 6:
				flag = true;
				break;
			default:
				System.out.println("You Entered wrong choice please enter valid choice");
			}
			System.out.println("Total=" + total);

		}
		sc.close();

	}
}
