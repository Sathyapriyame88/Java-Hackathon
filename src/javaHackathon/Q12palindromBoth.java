package javaHackathon;

import java.util.Scanner;

public class Q12palindromBoth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.next();
		int ilen = str.length();
		sc.close();

		for (int i = 0; i < (ilen / 2); i++) {

			if (str.charAt(i) == str.charAt(ilen - 1 - i)) {

			} else {

				System.out.println("This is not a palindrom");
				return;
			}
		}
		System.out.println("This is palindrom");


	}

}
