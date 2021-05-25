package org.iacsd.day_2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size,sum=0;
		float avg;
		System.out.println("Enter Array Size");;
		size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter Array Element");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("-----Printing Array Element-----");
		System.out.println(Arrays.toString(arr));
		sc.close();
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of all element of Array="+sum);
		avg=(sum/size);
		System.out.println("Average of all element of array="+avg);
		int max=arr[0];
		for(int i=1;i<size;i++)
		{
			if(arr[i]>max)
			max=arr[i];
		}
		System.out.println("Maximum element of array is="+max);
		int min=arr[0];
		for(int i=1;i<size;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Minimum element of array is="+min);
		
		
	}

}
