package javaHackathon;

import java.util.Scanner;

public class Q14Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		sc.close();

		String str1[] = str.split(" ");
		String rev = " ";
		for (int i = str1.length - 1; i >= 0; i--) {
			rev += str1[i] + " ";

		}
		System.out.println("Reverse String");
		System.out.println(rev.substring(0, rev.length() - 1));
	}

	

}
