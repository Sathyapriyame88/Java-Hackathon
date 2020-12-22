package javaHackathon;

import java.util.Scanner;

public class Q23DiffSIB {

	public static void main(String[] args) {
		System.out.println("Enter the input");
		Scanner sc = new Scanner(System.in);

		if (sc.hasNextBoolean()) {
			System.out.println("Entered input is boolean");
		}else if (sc.hasNextInt()) {
			System.out.println("Entered input is integer");
		} else if (sc.hasNext()) {
			String str = sc.nextLine();
			System.out.println("Entered input is String");
		}

	}

}
