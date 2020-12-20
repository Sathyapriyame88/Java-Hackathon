package javaHackathon;

import java.util.Scanner;

public class Q2Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int inum=sc.nextInt();
		sc.close();
        long fact = 1;
        for(int i = 1; i <= inum; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+inum+" is: "+fact);
		
		

	}

}
