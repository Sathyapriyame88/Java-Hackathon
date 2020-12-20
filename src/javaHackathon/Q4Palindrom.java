package javaHackathon;

import java.util.Scanner;

public class Q4Palindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of input:");
		int ilen = scan.nextInt();
		int[] input = new int[ilen];
		System.out.println(" Enter the numbers " );
		for(int i=0; i<ilen;i++){
			input[i] = scan.nextInt();
		}
	
			
		for (int i = 0; i < (ilen / 2); i++){
			if(input[i]==input[ilen-1-i]){
				
				
			} else {

				System.out.println("This is not a palindrom");
				return;
			}
		}
		System.out.println("This is palindrom");

		}
		
}		
		
		
	

		

