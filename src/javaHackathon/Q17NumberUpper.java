package javaHackathon;

import java.util.Scanner;

public class Q17NumberUpper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		int number=0;
		int uppercase=0;
		int lowercase=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if (ch>='A'&&ch<='Z')
				uppercase++;				
			
			else if(ch>='a'&&ch<='z')
				lowercase++;
							
			else if(ch>='0'&&ch<='9')
				number++;
				
			
			
		}
		
		System.out.println("The number of uppercase letter:"+uppercase);	
		System.out.println("The number of lowercase letter:"+lowercase);	
		System.out.println("The number is:"+number);	
		

		

	}

}
