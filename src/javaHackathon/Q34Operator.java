package javaHackathon;

import java.util.Scanner;

public class Q34Operator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the first Number");
		    int num1 = sc.nextInt();
		    System.out.println("Enter the Second Number");
		    int num2 = sc.nextInt();
		    System.out.println("The Subtraction of two numbers:"+subtraction(num1,num2));
		    System.out.println("The Multiplication of two numbers:"+multiplication(num1,num2));
		    System.out.println("The Division of two numbers:"+division(num1,num2));
			
			
		
	}
public static int subtraction(int a,int b){
	return a+(-1)*b;
	
}
public static int multiplication(int a,int b){
	int sum=0;
	for(int i=0;i<b;i++){
		sum=sum+a;
	}
	return sum;
	
}
public static int division(int a,int b){
	int quotient=0;
	for(int i=b;i<=a;i+=b){
		quotient++;
		
	}
	
	return quotient;
}
}
