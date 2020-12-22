package javaHackathon;

import java.util.Scanner;

public class Q13ReverseWord {

	public static void main(String[] args) {
		//String sWord = "java code";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String str=sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		
		System.out.println( sb.reverse());

	}

}
