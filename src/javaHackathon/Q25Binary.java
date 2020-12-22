package javaHackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q25Binary {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of element:");
		int ilen = scan.nextInt();
		int[] Array = new int[ilen];
		System.out.println(" Enter the numbers ");
		for (int i = 0; i < ilen; i++) {
			Array[i] = scan.nextInt();
		}
		System.out.println("Enter the key value:");
		int val = scan.nextInt();
		scan.close();

		int index = Arrays.binarySearch(Array, val);
		if (index <= 0)
			System.out.println("Element is not found");
		else
			System.out.println("Element is found at index: " + index);

	}
}
