package javaHackathon;

import java.util.Scanner;

public class Q28FactorialR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int inum=sc.nextInt();
		System.out.println("The Factorial of"+inum+"="+fact(inum));

	}
 public static int fact(int inum1){
	 if(inum1==0){
		 return 1;
	 }
	return inum1*fact(inum1-1);
	 
 }
}
