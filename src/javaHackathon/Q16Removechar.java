package javaHackathon;

import java.util.Scanner;

public class Q16Removechar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println("Enter the Character");
		String c=sc.next();
		System.out.println(removeChar(str,c));
	

	}

	public static String removeChar(String s ,String c) {
		return s.replaceAll(c, "");
		
		

	}
}
