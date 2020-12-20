package javaHackathon;

import java.util.Scanner;

public class Q18duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		String duplicates ="";
		String checked ="";
		for(int i=0; i<str.length();i++){
			String current = str.substring(i,i+1);
			if(checked.contains(current)){
				if(!duplicates.contains(current)){
					duplicates = duplicates + current;
			}
			}else{
				checked = checked+ current;
			}
		}
		System.out.println("Duplicats: " + duplicates);

	}

}
